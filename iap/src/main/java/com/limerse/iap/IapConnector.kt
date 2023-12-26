package com.limerse.iap

import android.app.Activity
import android.content.Context

class IapConnector {


    private var mBillingService: IBillingService? = null

    /**
     * Initialize billing service.
     *
     * @param key - key to verify purchase messages. Leave empty if you want to skip verification
     * @param context          - application context
     * @param consumableKeys          - list of sku for purchases
     * @param subscriptionKeys - list of sku for subscriptions
     */
    fun setup(
        context: Context,
        consumableKeys: List<String> = emptyList(),
        subscriptionKeys: List<String> = emptyList(),
        key: String? = null,
        enableLogging: Boolean = false,
    ) {
        val contextLocal = context.applicationContext ?: context
        mBillingService =
            BillingService(contextLocal, consumableKeys, subscriptionKeys)
        getBillingService().enableDebugLogging(enableLogging)
        getBillingService().init(key)
    }

    fun addPurchaseListener(purchaseServiceListener: PurchaseServiceListener) {
        getBillingService().addPurchaseListener(purchaseServiceListener)
    }

    fun removePurchaseListener(purchaseServiceListener: PurchaseServiceListener) {
        getBillingService().removePurchaseListener(purchaseServiceListener)
    }

    fun addSubscriptionListener(subscriptionServiceListener: SubscriptionServiceListener) {
        getBillingService().addSubscriptionListener(subscriptionServiceListener)
    }

    fun removeSubscriptionListener(subscriptionServiceListener: SubscriptionServiceListener) {
        getBillingService().removeSubscriptionListener(subscriptionServiceListener)
    }

    fun purchase(activity: Activity, sku: String) {
        getBillingService().buy(activity, sku)
    }

    fun subscribe(activity: Activity, sku: String) {
        getBillingService().subscribe(activity, sku)
    }

    fun unsubscribe(activity: Activity, sku: String) {
        getBillingService().unsubscribe(activity, sku)
    }

    fun destroy() {
        getBillingService().close()
    }

    fun getBillingService(): IBillingService {
        return mBillingService ?: let {
            throw RuntimeException("Call IapConnector to initialize billing service")
        }
    }
}
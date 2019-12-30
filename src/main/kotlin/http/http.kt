@file:JsModule("http")
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")
package http

external interface OutgoingHttpHeaders {
    @nativeGetter
    operator fun get(header: String): dynamic /* Number | String | Array<String> | Nothing? */
    @nativeSetter
    operator fun set(header: String, value: Number)
    @nativeSetter
    operator fun set(header: String, value: String)
    @nativeSetter
    operator fun set(header: String, value: Array<String>)
    @nativeSetter
    operator fun set(header: String, value: Nothing?)
}
external var METHODS: Array<String>
external object STATUS_CODES {
    @nativeGetter
    operator fun get(errorCode: Number): String?
    @nativeSetter
    operator fun set(errorCode: Number, value: String?)
    @nativeGetter
    operator fun get(errorCode: String): String?
    @nativeSetter
    operator fun set(errorCode: String, value: String?)
}
external fun createServer(options: dynamic /* tls.SecureContextOptions & tls.TlsOptions & http.ServerOptions */= definedExternally, requestListener: (req: dynamic, res: dynamic) -> dynamic = definedExternally /* null */): dynamic
external var maxHeaderSize: Number

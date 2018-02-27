package io.vertx.kotlin.core

import io.vertx.core.VertxOptions
import io.vertx.core.dns.AddressResolverOptions
import io.vertx.core.eventbus.EventBusOptions
import io.vertx.core.metrics.MetricsOptions

/**
 * A function providing a DSL for building [io.vertx.core.VertxOptions] objects.
 *
 * Instances of this class are used to configure [io.vertx.core.Vertx] instances.
 *
 * @param addressResolverOptions  Sets the address resolver configuration to configure resolving DNS servers, cache TTL, etc...
 * @param blockedThreadCheckInterval  Sets the value of blocked thread check period, in ms.
 * @param clusterHost  Set the hostname to be used for clustering.
 * @param clusterPingInterval  Set the value of cluster ping interval, in ms.
 * @param clusterPingReplyInterval  Set the value of cluster ping reply interval, in ms.
 * @param clusterPort  Set the port to be used for clustering.
 * @param clusterPublicHost  Set the public facing hostname to be used for clustering. Sometimes, e.g. when running on certain clouds, the local address the server listens on for clustering is not the same address that other nodes connect to it at, as the OS / cloud infrastructure does some kind of proxying. If this is the case you can specify a public hostname which is different from the hostname the server listens at. The default value is null which means use the same as the cluster hostname.
 * @param clusterPublicPort  See [io.vertx.core.VertxOptions] for an explanation.
 * @param clustered  Set whether or not the Vert.x instance will be clustered.
 * @param eventBusOptions  Sets the event bus configuration to configure the host, port, ssl...
 * @param eventLoopPoolSize  Set the number of event loop threads to be used by the Vert.x instance.
 * @param fileResolverCachingEnabled  Set wether the Vert.x file resolver uses caching for classpath resources.
 * @param haEnabled  Set whether HA will be enabled on the Vert.x instance.
 * @param haGroup  Set the HA group to be used when HA is enabled.
 * @param internalBlockingPoolSize  Set the value of internal blocking pool size
 * @param maxEventLoopExecuteTime  Sets the value of max event loop execute time, in ns.
 * @param maxWorkerExecuteTime  Sets the value of max worker execute time, in ns.
 * @param metricsOptions  Set the metrics options
 * @param preferNativeTransport  Set wether to prefer the native transport to the JDK transport.
 * @param quorumSize  Set the quorum size to be used when HA is enabled.
 * @param warningExceptionTime  Set the threshold value above this, the blocked warning contains a stack trace.
 * @param workerPoolSize  Set the maximum number of worker threads to be used by the Vert.x instance.
 *
 * <p/>
 * NOTE: This function has been automatically generated from the [io.vertx.core.VertxOptions original] using Vert.x codegen.
 */
fun VertxOptions(
  addressResolverOptions: io.vertx.core.dns.AddressResolverOptions? = null,
  blockedThreadCheckInterval: Long? = null,
  clusterHost: String? = null,
  clusterPingInterval: Long? = null,
  clusterPingReplyInterval: Long? = null,
  clusterPort: Int? = null,
  clusterPublicHost: String? = null,
  clusterPublicPort: Int? = null,
  clustered: Boolean? = null,
  eventBusOptions: io.vertx.core.eventbus.EventBusOptions? = null,
  eventLoopPoolSize: Int? = null,
  fileResolverCachingEnabled: Boolean? = null,
  haEnabled: Boolean? = null,
  haGroup: String? = null,
  internalBlockingPoolSize: Int? = null,
  maxEventLoopExecuteTime: Long? = null,
  maxWorkerExecuteTime: Long? = null,
  metricsOptions: io.vertx.core.metrics.MetricsOptions? = null,
  preferNativeTransport: Boolean? = null,
  quorumSize: Int? = null,
  warningExceptionTime: Long? = null,
  workerPoolSize: Int? = null): VertxOptions = io.vertx.core.VertxOptions().apply {

  if (addressResolverOptions != null) {
    this.setAddressResolverOptions(addressResolverOptions)
  }
  if (blockedThreadCheckInterval != null) {
    this.setBlockedThreadCheckInterval(blockedThreadCheckInterval)
  }
  if (clusterHost != null) {
    this.setClusterHost(clusterHost)
  }
  if (clusterPingInterval != null) {
    this.setClusterPingInterval(clusterPingInterval)
  }
  if (clusterPingReplyInterval != null) {
    this.setClusterPingReplyInterval(clusterPingReplyInterval)
  }
  if (clusterPort != null) {
    this.setClusterPort(clusterPort)
  }
  if (clusterPublicHost != null) {
    this.setClusterPublicHost(clusterPublicHost)
  }
  if (clusterPublicPort != null) {
    this.setClusterPublicPort(clusterPublicPort)
  }
  if (clustered != null) {
    this.setClustered(clustered)
  }
  if (eventBusOptions != null) {
    this.setEventBusOptions(eventBusOptions)
  }
  if (eventLoopPoolSize != null) {
    this.setEventLoopPoolSize(eventLoopPoolSize)
  }
  if (fileResolverCachingEnabled != null) {
    this.setFileResolverCachingEnabled(fileResolverCachingEnabled)
  }
  if (haEnabled != null) {
    this.setHAEnabled(haEnabled)
  }
  if (haGroup != null) {
    this.setHAGroup(haGroup)
  }
  if (internalBlockingPoolSize != null) {
    this.setInternalBlockingPoolSize(internalBlockingPoolSize)
  }
  if (maxEventLoopExecuteTime != null) {
    this.setMaxEventLoopExecuteTime(maxEventLoopExecuteTime)
  }
  if (maxWorkerExecuteTime != null) {
    this.setMaxWorkerExecuteTime(maxWorkerExecuteTime)
  }
  if (metricsOptions != null) {
    this.setMetricsOptions(metricsOptions)
  }
  if (preferNativeTransport != null) {
    this.setPreferNativeTransport(preferNativeTransport)
  }
  if (quorumSize != null) {
    this.setQuorumSize(quorumSize)
  }
  if (warningExceptionTime != null) {
    this.setWarningExceptionTime(warningExceptionTime)
  }
  if (workerPoolSize != null) {
    this.setWorkerPoolSize(workerPoolSize)
  }
}


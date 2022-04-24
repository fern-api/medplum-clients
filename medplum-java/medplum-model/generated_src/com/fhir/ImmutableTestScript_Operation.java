//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link TestScript_Operation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTestScript_Operation.builder()}.
 */
@org.immutables.value.Generated(from = "TestScript_Operation", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTestScript_Operation implements com.fhir.TestScript_Operation {
  private final @javax.annotation.Nullable com.fhir.Coding type;
  private final @javax.annotation.Nullable java.lang.Boolean encodeRequestUrl;
  private final @javax.annotation.Nullable com.fhir.Testscript_operationMethod method;
  private final @javax.annotation.Nullable java.lang.String label;
  private final @javax.annotation.Nullable java.lang.String params;
  private final @javax.annotation.Nullable com.fhir.id targetId;
  private final @javax.annotation.Nullable java.lang.Integer origin;
  private final @javax.annotation.Nullable java.lang.String url;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.id sourceId;
  private final @javax.annotation.Nullable com.fhir.id requestId;
  private final @javax.annotation.Nullable com.fhir.code resource;
  private final @javax.annotation.Nullable com.fhir.code accept;
  private final @javax.annotation.Nullable java.lang.String description;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.code contentType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.TestScript_RequestHeader> requestHeader;
  private final @javax.annotation.Nullable java.lang.Integer destination;
  private final @javax.annotation.Nullable com.fhir.id responseId;

  private ImmutableTestScript_Operation(
      @javax.annotation.Nullable com.fhir.Coding type,
      @javax.annotation.Nullable java.lang.Boolean encodeRequestUrl,
      @javax.annotation.Nullable com.fhir.Testscript_operationMethod method,
      @javax.annotation.Nullable java.lang.String label,
      @javax.annotation.Nullable java.lang.String params,
      @javax.annotation.Nullable com.fhir.id targetId,
      @javax.annotation.Nullable java.lang.Integer origin,
      @javax.annotation.Nullable java.lang.String url,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.id sourceId,
      @javax.annotation.Nullable com.fhir.id requestId,
      @javax.annotation.Nullable com.fhir.code resource,
      @javax.annotation.Nullable com.fhir.code accept,
      @javax.annotation.Nullable java.lang.String description,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.code contentType,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<com.fhir.TestScript_RequestHeader> requestHeader,
      @javax.annotation.Nullable java.lang.Integer destination,
      @javax.annotation.Nullable com.fhir.id responseId) {
    this.type = type;
    this.encodeRequestUrl = encodeRequestUrl;
    this.method = method;
    this.label = label;
    this.params = params;
    this.targetId = targetId;
    this.origin = origin;
    this.url = url;
    this.extension = extension;
    this.sourceId = sourceId;
    this.requestId = requestId;
    this.resource = resource;
    this.accept = accept;
    this.description = description;
    this.id = id;
    this.contentType = contentType;
    this.modifierExtension = modifierExtension;
    this.requestHeader = requestHeader;
    this.destination = destination;
    this.responseId = responseId;
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.Coding> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code encodeRequestUrl} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("encodeRequestUrl")
  @Override
  public java.util.Optional<java.lang.Boolean> encodeRequestUrl() {
    return java.util.Optional.ofNullable(encodeRequestUrl);
  }

  /**
   * @return The value of the {@code method} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("method")
  @Override
  public java.util.Optional<com.fhir.Testscript_operationMethod> method() {
    return java.util.Optional.ofNullable(method);
  }

  /**
   * @return The value of the {@code label} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("label")
  @Override
  public java.util.Optional<java.lang.String> label() {
    return java.util.Optional.ofNullable(label);
  }

  /**
   * @return The value of the {@code params} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("params")
  @Override
  public java.util.Optional<java.lang.String> params() {
    return java.util.Optional.ofNullable(params);
  }

  /**
   * @return The value of the {@code targetId} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("targetId")
  @Override
  public java.util.Optional<com.fhir.id> targetId() {
    return java.util.Optional.ofNullable(targetId);
  }

  /**
   * @return The value of the {@code origin} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("origin")
  @Override
  public java.util.Optional<java.lang.Integer> origin() {
    return java.util.Optional.ofNullable(origin);
  }

  /**
   * @return The value of the {@code url} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("url")
  @Override
  public java.util.Optional<java.lang.String> url() {
    return java.util.Optional.ofNullable(url);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code sourceId} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
  @Override
  public java.util.Optional<com.fhir.id> sourceId() {
    return java.util.Optional.ofNullable(sourceId);
  }

  /**
   * @return The value of the {@code requestId} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("requestId")
  @Override
  public java.util.Optional<com.fhir.id> requestId() {
    return java.util.Optional.ofNullable(requestId);
  }

  /**
   * @return The value of the {@code resource} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resource")
  @Override
  public java.util.Optional<com.fhir.code> resource() {
    return java.util.Optional.ofNullable(resource);
  }

  /**
   * @return The value of the {@code accept} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("accept")
  @Override
  public java.util.Optional<com.fhir.code> accept() {
    return java.util.Optional.ofNullable(accept);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<java.lang.String> description() {
    return java.util.Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code contentType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contentType")
  @Override
  public java.util.Optional<com.fhir.code> contentType() {
    return java.util.Optional.ofNullable(contentType);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code requestHeader} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("requestHeader")
  @Override
  public java.util.Optional<java.util.List<com.fhir.TestScript_RequestHeader>> requestHeader() {
    return java.util.Optional.ofNullable(requestHeader);
  }

  /**
   * @return The value of the {@code destination} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("destination")
  @Override
  public java.util.Optional<java.lang.Integer> destination() {
    return java.util.Optional.ofNullable(destination);
  }

  /**
   * @return The value of the {@code responseId} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("responseId")
  @Override
  public java.util.Optional<com.fhir.id> responseId() {
    return java.util.Optional.ofNullable(responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withType(com.fhir.Coding value) {
    @javax.annotation.Nullable com.fhir.Coding newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableTestScript_Operation(
        newValue,
        this.encodeRequestUrl,
        this.method,
        this.label,
        this.params,
        this.targetId,
        this.origin,
        this.url,
        this.extension,
        this.sourceId,
        this.requestId,
        this.resource,
        this.accept,
        this.description,
        this.id,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Operation withType(java.util.Optional<? extends com.fhir.Coding> optional) {
    @javax.annotation.Nullable com.fhir.Coding value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableTestScript_Operation(
        value,
        this.encodeRequestUrl,
        this.method,
        this.label,
        this.params,
        this.targetId,
        this.origin,
        this.url,
        this.extension,
        this.sourceId,
        this.requestId,
        this.resource,
        this.accept,
        this.description,
        this.id,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#encodeRequestUrl() encodeRequestUrl} attribute.
   * @param value The value for encodeRequestUrl
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withEncodeRequestUrl(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.encodeRequestUrl, newValue)) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        newValue,
        this.method,
        this.label,
        this.params,
        this.targetId,
        this.origin,
        this.url,
        this.extension,
        this.sourceId,
        this.requestId,
        this.resource,
        this.accept,
        this.description,
        this.id,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#encodeRequestUrl() encodeRequestUrl} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encodeRequestUrl
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withEncodeRequestUrl(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.encodeRequestUrl, value)) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        value,
        this.method,
        this.label,
        this.params,
        this.targetId,
        this.origin,
        this.url,
        this.extension,
        this.sourceId,
        this.requestId,
        this.resource,
        this.accept,
        this.description,
        this.id,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#method() method} attribute.
   * @param value The value for method
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withMethod(com.fhir.Testscript_operationMethod value) {
    @javax.annotation.Nullable com.fhir.Testscript_operationMethod newValue = java.util.Objects.requireNonNull(value, "method");
    if (this.method == newValue) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        newValue,
        this.label,
        this.params,
        this.targetId,
        this.origin,
        this.url,
        this.extension,
        this.sourceId,
        this.requestId,
        this.resource,
        this.accept,
        this.description,
        this.id,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#method() method} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for method
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Operation withMethod(java.util.Optional<? extends com.fhir.Testscript_operationMethod> optional) {
    @javax.annotation.Nullable com.fhir.Testscript_operationMethod value = optional.orElse(null);
    if (this.method == value) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        value,
        this.label,
        this.params,
        this.targetId,
        this.origin,
        this.url,
        this.extension,
        this.sourceId,
        this.requestId,
        this.resource,
        this.accept,
        this.description,
        this.id,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#label() label} attribute.
   * @param value The value for label
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withLabel(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "label");
    if (java.util.Objects.equals(this.label, newValue)) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        newValue,
        this.params,
        this.targetId,
        this.origin,
        this.url,
        this.extension,
        this.sourceId,
        this.requestId,
        this.resource,
        this.accept,
        this.description,
        this.id,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#label() label} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for label
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withLabel(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.label, value)) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        value,
        this.params,
        this.targetId,
        this.origin,
        this.url,
        this.extension,
        this.sourceId,
        this.requestId,
        this.resource,
        this.accept,
        this.description,
        this.id,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#params() params} attribute.
   * @param value The value for params
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withParams(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "params");
    if (java.util.Objects.equals(this.params, newValue)) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        this.label,
        newValue,
        this.targetId,
        this.origin,
        this.url,
        this.extension,
        this.sourceId,
        this.requestId,
        this.resource,
        this.accept,
        this.description,
        this.id,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#params() params} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for params
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withParams(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.params, value)) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        this.label,
        value,
        this.targetId,
        this.origin,
        this.url,
        this.extension,
        this.sourceId,
        this.requestId,
        this.resource,
        this.accept,
        this.description,
        this.id,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#targetId() targetId} attribute.
   * @param value The value for targetId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withTargetId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "targetId");
    if (this.targetId == newValue) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        this.label,
        this.params,
        newValue,
        this.origin,
        this.url,
        this.extension,
        this.sourceId,
        this.requestId,
        this.resource,
        this.accept,
        this.description,
        this.id,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#targetId() targetId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for targetId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Operation withTargetId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.targetId == value) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        this.label,
        this.params,
        value,
        this.origin,
        this.url,
        this.extension,
        this.sourceId,
        this.requestId,
        this.resource,
        this.accept,
        this.description,
        this.id,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#origin() origin} attribute.
   * @param value The value for origin
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withOrigin(int value) {
    @javax.annotation.Nullable java.lang.Integer newValue = value;
    if (java.util.Objects.equals(this.origin, newValue)) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        this.label,
        this.params,
        this.targetId,
        newValue,
        this.url,
        this.extension,
        this.sourceId,
        this.requestId,
        this.resource,
        this.accept,
        this.description,
        this.id,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#origin() origin} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for origin
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withOrigin(java.util.Optional<java.lang.Integer> optional) {
    @javax.annotation.Nullable java.lang.Integer value = optional.orElse(null);
    if (java.util.Objects.equals(this.origin, value)) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        this.label,
        this.params,
        this.targetId,
        value,
        this.url,
        this.extension,
        this.sourceId,
        this.requestId,
        this.resource,
        this.accept,
        this.description,
        this.id,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withUrl(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "url");
    if (java.util.Objects.equals(this.url, newValue)) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        this.label,
        this.params,
        this.targetId,
        this.origin,
        newValue,
        this.extension,
        this.sourceId,
        this.requestId,
        this.resource,
        this.accept,
        this.description,
        this.id,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#url() url} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withUrl(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.url, value)) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        this.label,
        this.params,
        this.targetId,
        this.origin,
        value,
        this.extension,
        this.sourceId,
        this.requestId,
        this.resource,
        this.accept,
        this.description,
        this.id,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        this.label,
        this.params,
        this.targetId,
        this.origin,
        this.url,
        newValue,
        this.sourceId,
        this.requestId,
        this.resource,
        this.accept,
        this.description,
        this.id,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Operation withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        this.label,
        this.params,
        this.targetId,
        this.origin,
        this.url,
        value,
        this.sourceId,
        this.requestId,
        this.resource,
        this.accept,
        this.description,
        this.id,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#sourceId() sourceId} attribute.
   * @param value The value for sourceId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withSourceId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "sourceId");
    if (this.sourceId == newValue) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        this.label,
        this.params,
        this.targetId,
        this.origin,
        this.url,
        this.extension,
        newValue,
        this.requestId,
        this.resource,
        this.accept,
        this.description,
        this.id,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#sourceId() sourceId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sourceId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Operation withSourceId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.sourceId == value) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        this.label,
        this.params,
        this.targetId,
        this.origin,
        this.url,
        this.extension,
        value,
        this.requestId,
        this.resource,
        this.accept,
        this.description,
        this.id,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#requestId() requestId} attribute.
   * @param value The value for requestId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withRequestId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "requestId");
    if (this.requestId == newValue) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        this.label,
        this.params,
        this.targetId,
        this.origin,
        this.url,
        this.extension,
        this.sourceId,
        newValue,
        this.resource,
        this.accept,
        this.description,
        this.id,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#requestId() requestId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requestId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Operation withRequestId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.requestId == value) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        this.label,
        this.params,
        this.targetId,
        this.origin,
        this.url,
        this.extension,
        this.sourceId,
        value,
        this.resource,
        this.accept,
        this.description,
        this.id,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#resource() resource} attribute.
   * @param value The value for resource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withResource(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "resource");
    if (this.resource == newValue) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        this.label,
        this.params,
        this.targetId,
        this.origin,
        this.url,
        this.extension,
        this.sourceId,
        this.requestId,
        newValue,
        this.accept,
        this.description,
        this.id,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#resource() resource} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resource
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Operation withResource(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.resource == value) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        this.label,
        this.params,
        this.targetId,
        this.origin,
        this.url,
        this.extension,
        this.sourceId,
        this.requestId,
        value,
        this.accept,
        this.description,
        this.id,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#accept() accept} attribute.
   * @param value The value for accept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withAccept(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "accept");
    if (this.accept == newValue) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        this.label,
        this.params,
        this.targetId,
        this.origin,
        this.url,
        this.extension,
        this.sourceId,
        this.requestId,
        this.resource,
        newValue,
        this.description,
        this.id,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#accept() accept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for accept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Operation withAccept(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.accept == value) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        this.label,
        this.params,
        this.targetId,
        this.origin,
        this.url,
        this.extension,
        this.sourceId,
        this.requestId,
        this.resource,
        value,
        this.description,
        this.id,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        this.label,
        this.params,
        this.targetId,
        this.origin,
        this.url,
        this.extension,
        this.sourceId,
        this.requestId,
        this.resource,
        this.accept,
        newValue,
        this.id,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        this.label,
        this.params,
        this.targetId,
        this.origin,
        this.url,
        this.extension,
        this.sourceId,
        this.requestId,
        this.resource,
        this.accept,
        value,
        this.id,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        this.label,
        this.params,
        this.targetId,
        this.origin,
        this.url,
        this.extension,
        this.sourceId,
        this.requestId,
        this.resource,
        this.accept,
        this.description,
        newValue,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        this.label,
        this.params,
        this.targetId,
        this.origin,
        this.url,
        this.extension,
        this.sourceId,
        this.requestId,
        this.resource,
        this.accept,
        this.description,
        value,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#contentType() contentType} attribute.
   * @param value The value for contentType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withContentType(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "contentType");
    if (this.contentType == newValue) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        this.label,
        this.params,
        this.targetId,
        this.origin,
        this.url,
        this.extension,
        this.sourceId,
        this.requestId,
        this.resource,
        this.accept,
        this.description,
        this.id,
        newValue,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#contentType() contentType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contentType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Operation withContentType(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.contentType == value) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        this.label,
        this.params,
        this.targetId,
        this.origin,
        this.url,
        this.extension,
        this.sourceId,
        this.requestId,
        this.resource,
        this.accept,
        this.description,
        this.id,
        value,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        this.label,
        this.params,
        this.targetId,
        this.origin,
        this.url,
        this.extension,
        this.sourceId,
        this.requestId,
        this.resource,
        this.accept,
        this.description,
        this.id,
        this.contentType,
        newValue,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Operation withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        this.label,
        this.params,
        this.targetId,
        this.origin,
        this.url,
        this.extension,
        this.sourceId,
        this.requestId,
        this.resource,
        this.accept,
        this.description,
        this.id,
        this.contentType,
        value,
        this.requestHeader,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#requestHeader() requestHeader} attribute.
   * @param value The value for requestHeader
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withRequestHeader(java.util.List<com.fhir.TestScript_RequestHeader> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.TestScript_RequestHeader> newValue = java.util.Objects.requireNonNull(value, "requestHeader");
    if (this.requestHeader == newValue) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        this.label,
        this.params,
        this.targetId,
        this.origin,
        this.url,
        this.extension,
        this.sourceId,
        this.requestId,
        this.resource,
        this.accept,
        this.description,
        this.id,
        this.contentType,
        this.modifierExtension,
        newValue,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#requestHeader() requestHeader} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requestHeader
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Operation withRequestHeader(java.util.Optional<? extends java.util.List<com.fhir.TestScript_RequestHeader>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.TestScript_RequestHeader> value = optional.orElse(null);
    if (this.requestHeader == value) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        this.label,
        this.params,
        this.targetId,
        this.origin,
        this.url,
        this.extension,
        this.sourceId,
        this.requestId,
        this.resource,
        this.accept,
        this.description,
        this.id,
        this.contentType,
        this.modifierExtension,
        value,
        this.destination,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#destination() destination} attribute.
   * @param value The value for destination
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withDestination(int value) {
    @javax.annotation.Nullable java.lang.Integer newValue = value;
    if (java.util.Objects.equals(this.destination, newValue)) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        this.label,
        this.params,
        this.targetId,
        this.origin,
        this.url,
        this.extension,
        this.sourceId,
        this.requestId,
        this.resource,
        this.accept,
        this.description,
        this.id,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        newValue,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#destination() destination} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for destination
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withDestination(java.util.Optional<java.lang.Integer> optional) {
    @javax.annotation.Nullable java.lang.Integer value = optional.orElse(null);
    if (java.util.Objects.equals(this.destination, value)) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        this.label,
        this.params,
        this.targetId,
        this.origin,
        this.url,
        this.extension,
        this.sourceId,
        this.requestId,
        this.resource,
        this.accept,
        this.description,
        this.id,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        value,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#responseId() responseId} attribute.
   * @param value The value for responseId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withResponseId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "responseId");
    if (this.responseId == newValue) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        this.label,
        this.params,
        this.targetId,
        this.origin,
        this.url,
        this.extension,
        this.sourceId,
        this.requestId,
        this.resource,
        this.accept,
        this.description,
        this.id,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#responseId() responseId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for responseId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Operation withResponseId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.responseId == value) return this;
    return new ImmutableTestScript_Operation(
        this.type,
        this.encodeRequestUrl,
        this.method,
        this.label,
        this.params,
        this.targetId,
        this.origin,
        this.url,
        this.extension,
        this.sourceId,
        this.requestId,
        this.resource,
        this.accept,
        this.description,
        this.id,
        this.contentType,
        this.modifierExtension,
        this.requestHeader,
        this.destination,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTestScript_Operation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTestScript_Operation
        && equalTo((ImmutableTestScript_Operation) another);
  }

  private boolean equalTo(ImmutableTestScript_Operation another) {
    return java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(encodeRequestUrl, another.encodeRequestUrl)
        && java.util.Objects.equals(method, another.method)
        && java.util.Objects.equals(label, another.label)
        && java.util.Objects.equals(params, another.params)
        && java.util.Objects.equals(targetId, another.targetId)
        && java.util.Objects.equals(origin, another.origin)
        && java.util.Objects.equals(url, another.url)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(sourceId, another.sourceId)
        && java.util.Objects.equals(requestId, another.requestId)
        && java.util.Objects.equals(resource, another.resource)
        && java.util.Objects.equals(accept, another.accept)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(contentType, another.contentType)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(requestHeader, another.requestHeader)
        && java.util.Objects.equals(destination, another.destination)
        && java.util.Objects.equals(responseId, another.responseId);
  }

  /**
   * Computes a hash code from attributes: {@code type}, {@code encodeRequestUrl}, {@code method}, {@code label}, {@code params}, {@code targetId}, {@code origin}, {@code url}, {@code extension}, {@code sourceId}, {@code requestId}, {@code resource}, {@code accept}, {@code description}, {@code id}, {@code contentType}, {@code modifierExtension}, {@code requestHeader}, {@code destination}, {@code responseId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(encodeRequestUrl);
    h += (h << 5) + java.util.Objects.hashCode(method);
    h += (h << 5) + java.util.Objects.hashCode(label);
    h += (h << 5) + java.util.Objects.hashCode(params);
    h += (h << 5) + java.util.Objects.hashCode(targetId);
    h += (h << 5) + java.util.Objects.hashCode(origin);
    h += (h << 5) + java.util.Objects.hashCode(url);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(sourceId);
    h += (h << 5) + java.util.Objects.hashCode(requestId);
    h += (h << 5) + java.util.Objects.hashCode(resource);
    h += (h << 5) + java.util.Objects.hashCode(accept);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(contentType);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(requestHeader);
    h += (h << 5) + java.util.Objects.hashCode(destination);
    h += (h << 5) + java.util.Objects.hashCode(responseId);
    return h;
  }

  /**
   * Prints the immutable value {@code TestScript_Operation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("TestScript_Operation{");
    if (type != null) {
      builder.append("type=").append(type);
    }
    if (encodeRequestUrl != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("encodeRequestUrl=").append(encodeRequestUrl);
    }
    if (method != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("method=").append(method);
    }
    if (label != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("label=").append(label);
    }
    if (params != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("params=").append(params);
    }
    if (targetId != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("targetId=").append(targetId);
    }
    if (origin != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("origin=").append(origin);
    }
    if (url != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("url=").append(url);
    }
    if (extension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (sourceId != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("sourceId=").append(sourceId);
    }
    if (requestId != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("requestId=").append(requestId);
    }
    if (resource != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("resource=").append(resource);
    }
    if (accept != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("accept=").append(accept);
    }
    if (description != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (id != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (contentType != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("contentType=").append(contentType);
    }
    if (modifierExtension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (requestHeader != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("requestHeader=").append(requestHeader);
    }
    if (destination != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("destination=").append(destination);
    }
    if (responseId != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("responseId=").append(responseId);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "TestScript_Operation", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.TestScript_Operation {
    @javax.annotation.Nullable java.util.Optional<com.fhir.Coding> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> encodeRequestUrl = java.util.Optional.empty();
    boolean encodeRequestUrlIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Testscript_operationMethod> method = java.util.Optional.empty();
    boolean methodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> label = java.util.Optional.empty();
    boolean labelIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> params = java.util.Optional.empty();
    boolean paramsIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> targetId = java.util.Optional.empty();
    boolean targetIdIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Integer> origin = java.util.Optional.empty();
    boolean originIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> url = java.util.Optional.empty();
    boolean urlIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> sourceId = java.util.Optional.empty();
    boolean sourceIdIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> requestId = java.util.Optional.empty();
    boolean requestIdIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> resource = java.util.Optional.empty();
    boolean resourceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> accept = java.util.Optional.empty();
    boolean acceptIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> contentType = java.util.Optional.empty();
    boolean contentTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.TestScript_RequestHeader>> requestHeader = java.util.Optional.empty();
    boolean requestHeaderIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Integer> destination = java.util.Optional.empty();
    boolean destinationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> responseId = java.util.Optional.empty();
    boolean responseIdIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.Coding> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("encodeRequestUrl")
    public void setEncodeRequestUrl(java.util.Optional<java.lang.Boolean> encodeRequestUrl) {
      this.encodeRequestUrl = encodeRequestUrl;
      this.encodeRequestUrlIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("method")
    public void setMethod(java.util.Optional<com.fhir.Testscript_operationMethod> method) {
      this.method = method;
      this.methodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("label")
    public void setLabel(java.util.Optional<java.lang.String> label) {
      this.label = label;
      this.labelIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("params")
    public void setParams(java.util.Optional<java.lang.String> params) {
      this.params = params;
      this.paramsIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    public void setTargetId(java.util.Optional<com.fhir.id> targetId) {
      this.targetId = targetId;
      this.targetIdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("origin")
    public void setOrigin(java.util.Optional<java.lang.Integer> origin) {
      this.origin = origin;
      this.originIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public void setUrl(java.util.Optional<java.lang.String> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    public void setSourceId(java.util.Optional<com.fhir.id> sourceId) {
      this.sourceId = sourceId;
      this.sourceIdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("requestId")
    public void setRequestId(java.util.Optional<com.fhir.id> requestId) {
      this.requestId = requestId;
      this.requestIdIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    public void setResource(java.util.Optional<com.fhir.code> resource) {
      this.resource = resource;
      this.resourceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("accept")
    public void setAccept(java.util.Optional<com.fhir.code> accept) {
      this.accept = accept;
      this.acceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<java.lang.String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contentType")
    public void setContentType(java.util.Optional<com.fhir.code> contentType) {
      this.contentType = contentType;
      this.contentTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("requestHeader")
    public void setRequestHeader(java.util.Optional<java.util.List<com.fhir.TestScript_RequestHeader>> requestHeader) {
      this.requestHeader = requestHeader;
      this.requestHeaderIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    public void setDestination(java.util.Optional<java.lang.Integer> destination) {
      this.destination = destination;
      this.destinationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("responseId")
    public void setResponseId(java.util.Optional<com.fhir.id> responseId) {
      this.responseId = responseId;
      this.responseIdIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.Coding> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> encodeRequestUrl() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Testscript_operationMethod> method() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> label() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> params() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> targetId() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Integer> origin() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> url() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> sourceId() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> requestId() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> resource() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> accept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> contentType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.TestScript_RequestHeader>> requestHeader() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Integer> destination() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> responseId() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableTestScript_Operation fromJson(Json json) {
    ImmutableTestScript_Operation.Builder builder = ImmutableTestScript_Operation.builder();
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.encodeRequestUrlIsSet) {
      builder.encodeRequestUrl(json.encodeRequestUrl);
    }
    if (json.methodIsSet) {
      builder.method(json.method);
    }
    if (json.labelIsSet) {
      builder.label(json.label);
    }
    if (json.paramsIsSet) {
      builder.params(json.params);
    }
    if (json.targetIdIsSet) {
      builder.targetId(json.targetId);
    }
    if (json.originIsSet) {
      builder.origin(json.origin);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.sourceIdIsSet) {
      builder.sourceId(json.sourceId);
    }
    if (json.requestIdIsSet) {
      builder.requestId(json.requestId);
    }
    if (json.resourceIsSet) {
      builder.resource(json.resource);
    }
    if (json.acceptIsSet) {
      builder.accept(json.accept);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.contentTypeIsSet) {
      builder.contentType(json.contentType);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.requestHeaderIsSet) {
      builder.requestHeader(json.requestHeader);
    }
    if (json.destinationIsSet) {
      builder.destination(json.destination);
    }
    if (json.responseIdIsSet) {
      builder.responseId(json.responseId);
    }
    return (ImmutableTestScript_Operation) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link TestScript_Operation} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable TestScript_Operation instance
   */
  public static TestScript_Operation copyOf(TestScript_Operation instance) {
    if (instance instanceof ImmutableTestScript_Operation) {
      return (ImmutableTestScript_Operation) instance;
    }
    return ImmutableTestScript_Operation.builder()
        .type(instance.type())
        .encodeRequestUrl(instance.encodeRequestUrl())
        .method(instance.method())
        .label(instance.label())
        .params(instance.params())
        .targetId(instance.targetId())
        .origin(instance.origin())
        .url(instance.url())
        .extension(instance.extension())
        .sourceId(instance.sourceId())
        .requestId(instance.requestId())
        .resource(instance.resource())
        .accept(instance.accept())
        .description(instance.description())
        .id(instance.id())
        .contentType(instance.contentType())
        .modifierExtension(instance.modifierExtension())
        .requestHeader(instance.requestHeader())
        .destination(instance.destination())
        .responseId(instance.responseId())
        .build();
  }

  /**
   * Creates a builder for {@link TestScript_Operation TestScript_Operation}.
   * <pre>
   * ImmutableTestScript_Operation.builder()
   *    .type(com.fhir.Coding) // optional {@link TestScript_Operation#type() type}
   *    .encodeRequestUrl(Boolean) // optional {@link TestScript_Operation#encodeRequestUrl() encodeRequestUrl}
   *    .method(com.fhir.Testscript_operationMethod) // optional {@link TestScript_Operation#method() method}
   *    .label(String) // optional {@link TestScript_Operation#label() label}
   *    .params(String) // optional {@link TestScript_Operation#params() params}
   *    .targetId(com.fhir.id) // optional {@link TestScript_Operation#targetId() targetId}
   *    .origin(Integer) // optional {@link TestScript_Operation#origin() origin}
   *    .url(String) // optional {@link TestScript_Operation#url() url}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link TestScript_Operation#extension() extension}
   *    .sourceId(com.fhir.id) // optional {@link TestScript_Operation#sourceId() sourceId}
   *    .requestId(com.fhir.id) // optional {@link TestScript_Operation#requestId() requestId}
   *    .resource(com.fhir.code) // optional {@link TestScript_Operation#resource() resource}
   *    .accept(com.fhir.code) // optional {@link TestScript_Operation#accept() accept}
   *    .description(String) // optional {@link TestScript_Operation#description() description}
   *    .id(String) // optional {@link TestScript_Operation#id() id}
   *    .contentType(com.fhir.code) // optional {@link TestScript_Operation#contentType() contentType}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link TestScript_Operation#modifierExtension() modifierExtension}
   *    .requestHeader(List&amp;lt;com.fhir.TestScript_RequestHeader&amp;gt;) // optional {@link TestScript_Operation#requestHeader() requestHeader}
   *    .destination(Integer) // optional {@link TestScript_Operation#destination() destination}
   *    .responseId(com.fhir.id) // optional {@link TestScript_Operation#responseId() responseId}
   *    .build();
   * </pre>
   * @return A new TestScript_Operation builder
   */
  public static ImmutableTestScript_Operation.Builder builder() {
    return new ImmutableTestScript_Operation.Builder();
  }

  /**
   * Builds instances of type {@link TestScript_Operation TestScript_Operation}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "TestScript_Operation", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_ENCODE_REQUEST_URL = 0x2L;
    private static final long OPT_BIT_METHOD = 0x4L;
    private static final long OPT_BIT_LABEL = 0x8L;
    private static final long OPT_BIT_PARAMS = 0x10L;
    private static final long OPT_BIT_TARGET_ID = 0x20L;
    private static final long OPT_BIT_ORIGIN = 0x40L;
    private static final long OPT_BIT_URL = 0x80L;
    private static final long OPT_BIT_EXTENSION = 0x100L;
    private static final long OPT_BIT_SOURCE_ID = 0x200L;
    private static final long OPT_BIT_REQUEST_ID = 0x400L;
    private static final long OPT_BIT_RESOURCE = 0x800L;
    private static final long OPT_BIT_ACCEPT = 0x1000L;
    private static final long OPT_BIT_DESCRIPTION = 0x2000L;
    private static final long OPT_BIT_ID = 0x4000L;
    private static final long OPT_BIT_CONTENT_TYPE = 0x8000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10000L;
    private static final long OPT_BIT_REQUEST_HEADER = 0x20000L;
    private static final long OPT_BIT_DESTINATION = 0x40000L;
    private static final long OPT_BIT_RESPONSE_ID = 0x80000L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.Coding type;
    private @javax.annotation.Nullable java.lang.Boolean encodeRequestUrl;
    private @javax.annotation.Nullable com.fhir.Testscript_operationMethod method;
    private @javax.annotation.Nullable java.lang.String label;
    private @javax.annotation.Nullable java.lang.String params;
    private @javax.annotation.Nullable com.fhir.id targetId;
    private @javax.annotation.Nullable java.lang.Integer origin;
    private @javax.annotation.Nullable java.lang.String url;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.id sourceId;
    private @javax.annotation.Nullable com.fhir.id requestId;
    private @javax.annotation.Nullable com.fhir.code resource;
    private @javax.annotation.Nullable com.fhir.code accept;
    private @javax.annotation.Nullable java.lang.String description;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.code contentType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<com.fhir.TestScript_RequestHeader> requestHeader;
    private @javax.annotation.Nullable java.lang.Integer destination;
    private @javax.annotation.Nullable com.fhir.id responseId;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.Coding type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.Coding> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#encodeRequestUrl() encodeRequestUrl} to encodeRequestUrl.
     * @param encodeRequestUrl The value for encodeRequestUrl
     * @return {@code this} builder for chained invocation
     */
    public final Builder encodeRequestUrl(boolean encodeRequestUrl) {
      checkNotIsSet(encodeRequestUrlIsSet(), "encodeRequestUrl");
      this.encodeRequestUrl = encodeRequestUrl;
      optBits |= OPT_BIT_ENCODE_REQUEST_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#encodeRequestUrl() encodeRequestUrl} to encodeRequestUrl.
     * @param encodeRequestUrl The value for encodeRequestUrl
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("encodeRequestUrl")
    public final Builder encodeRequestUrl(java.util.Optional<java.lang.Boolean> encodeRequestUrl) {
      checkNotIsSet(encodeRequestUrlIsSet(), "encodeRequestUrl");
      this.encodeRequestUrl = encodeRequestUrl.orElse(null);
      optBits |= OPT_BIT_ENCODE_REQUEST_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for chained invocation
     */
    public final Builder method(com.fhir.Testscript_operationMethod method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = java.util.Objects.requireNonNull(method, "method");
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("method")
    public final Builder method(java.util.Optional<? extends com.fhir.Testscript_operationMethod> method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = method.orElse(null);
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#label() label} to label.
     * @param label The value for label
     * @return {@code this} builder for chained invocation
     */
    public final Builder label(java.lang.String label) {
      checkNotIsSet(labelIsSet(), "label");
      this.label = java.util.Objects.requireNonNull(label, "label");
      optBits |= OPT_BIT_LABEL;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#label() label} to label.
     * @param label The value for label
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("label")
    public final Builder label(java.util.Optional<java.lang.String> label) {
      checkNotIsSet(labelIsSet(), "label");
      this.label = label.orElse(null);
      optBits |= OPT_BIT_LABEL;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#params() params} to params.
     * @param params The value for params
     * @return {@code this} builder for chained invocation
     */
    public final Builder params(java.lang.String params) {
      checkNotIsSet(paramsIsSet(), "params");
      this.params = java.util.Objects.requireNonNull(params, "params");
      optBits |= OPT_BIT_PARAMS;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#params() params} to params.
     * @param params The value for params
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("params")
    public final Builder params(java.util.Optional<java.lang.String> params) {
      checkNotIsSet(paramsIsSet(), "params");
      this.params = params.orElse(null);
      optBits |= OPT_BIT_PARAMS;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#targetId() targetId} to targetId.
     * @param targetId The value for targetId
     * @return {@code this} builder for chained invocation
     */
    public final Builder targetId(com.fhir.id targetId) {
      checkNotIsSet(targetIdIsSet(), "targetId");
      this.targetId = java.util.Objects.requireNonNull(targetId, "targetId");
      optBits |= OPT_BIT_TARGET_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#targetId() targetId} to targetId.
     * @param targetId The value for targetId
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("targetId")
    public final Builder targetId(java.util.Optional<? extends com.fhir.id> targetId) {
      checkNotIsSet(targetIdIsSet(), "targetId");
      this.targetId = targetId.orElse(null);
      optBits |= OPT_BIT_TARGET_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#origin() origin} to origin.
     * @param origin The value for origin
     * @return {@code this} builder for chained invocation
     */
    public final Builder origin(int origin) {
      checkNotIsSet(originIsSet(), "origin");
      this.origin = origin;
      optBits |= OPT_BIT_ORIGIN;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#origin() origin} to origin.
     * @param origin The value for origin
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("origin")
    public final Builder origin(java.util.Optional<java.lang.Integer> origin) {
      checkNotIsSet(originIsSet(), "origin");
      this.origin = origin.orElse(null);
      optBits |= OPT_BIT_ORIGIN;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    public final Builder url(java.lang.String url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = java.util.Objects.requireNonNull(url, "url");
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("url")
    public final Builder url(java.util.Optional<java.lang.String> url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = url.orElse(null);
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(java.util.List<com.fhir.Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = java.util.Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public final Builder extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#sourceId() sourceId} to sourceId.
     * @param sourceId The value for sourceId
     * @return {@code this} builder for chained invocation
     */
    public final Builder sourceId(com.fhir.id sourceId) {
      checkNotIsSet(sourceIdIsSet(), "sourceId");
      this.sourceId = java.util.Objects.requireNonNull(sourceId, "sourceId");
      optBits |= OPT_BIT_SOURCE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#sourceId() sourceId} to sourceId.
     * @param sourceId The value for sourceId
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceId")
    public final Builder sourceId(java.util.Optional<? extends com.fhir.id> sourceId) {
      checkNotIsSet(sourceIdIsSet(), "sourceId");
      this.sourceId = sourceId.orElse(null);
      optBits |= OPT_BIT_SOURCE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#requestId() requestId} to requestId.
     * @param requestId The value for requestId
     * @return {@code this} builder for chained invocation
     */
    public final Builder requestId(com.fhir.id requestId) {
      checkNotIsSet(requestIdIsSet(), "requestId");
      this.requestId = java.util.Objects.requireNonNull(requestId, "requestId");
      optBits |= OPT_BIT_REQUEST_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#requestId() requestId} to requestId.
     * @param requestId The value for requestId
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requestId")
    public final Builder requestId(java.util.Optional<? extends com.fhir.id> requestId) {
      checkNotIsSet(requestIdIsSet(), "requestId");
      this.requestId = requestId.orElse(null);
      optBits |= OPT_BIT_REQUEST_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for chained invocation
     */
    public final Builder resource(com.fhir.code resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = java.util.Objects.requireNonNull(resource, "resource");
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resource")
    public final Builder resource(java.util.Optional<? extends com.fhir.code> resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = resource.orElse(null);
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#accept() accept} to accept.
     * @param accept The value for accept
     * @return {@code this} builder for chained invocation
     */
    public final Builder accept(com.fhir.code accept) {
      checkNotIsSet(acceptIsSet(), "accept");
      this.accept = java.util.Objects.requireNonNull(accept, "accept");
      optBits |= OPT_BIT_ACCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#accept() accept} to accept.
     * @param accept The value for accept
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("accept")
    public final Builder accept(java.util.Optional<? extends com.fhir.code> accept) {
      checkNotIsSet(acceptIsSet(), "accept");
      this.accept = accept.orElse(null);
      optBits |= OPT_BIT_ACCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(java.lang.String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = java.util.Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public final Builder description(java.util.Optional<java.lang.String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(java.lang.String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<java.lang.String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#contentType() contentType} to contentType.
     * @param contentType The value for contentType
     * @return {@code this} builder for chained invocation
     */
    public final Builder contentType(com.fhir.code contentType) {
      checkNotIsSet(contentTypeIsSet(), "contentType");
      this.contentType = java.util.Objects.requireNonNull(contentType, "contentType");
      optBits |= OPT_BIT_CONTENT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#contentType() contentType} to contentType.
     * @param contentType The value for contentType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contentType")
    public final Builder contentType(java.util.Optional<? extends com.fhir.code> contentType) {
      checkNotIsSet(contentTypeIsSet(), "contentType");
      this.contentType = contentType.orElse(null);
      optBits |= OPT_BIT_CONTENT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(java.util.List<com.fhir.Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = java.util.Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public final Builder modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#requestHeader() requestHeader} to requestHeader.
     * @param requestHeader The value for requestHeader
     * @return {@code this} builder for chained invocation
     */
    public final Builder requestHeader(java.util.List<com.fhir.TestScript_RequestHeader> requestHeader) {
      checkNotIsSet(requestHeaderIsSet(), "requestHeader");
      this.requestHeader = java.util.Objects.requireNonNull(requestHeader, "requestHeader");
      optBits |= OPT_BIT_REQUEST_HEADER;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#requestHeader() requestHeader} to requestHeader.
     * @param requestHeader The value for requestHeader
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("requestHeader")
    public final Builder requestHeader(java.util.Optional<? extends java.util.List<com.fhir.TestScript_RequestHeader>> requestHeader) {
      checkNotIsSet(requestHeaderIsSet(), "requestHeader");
      this.requestHeader = requestHeader.orElse(null);
      optBits |= OPT_BIT_REQUEST_HEADER;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for chained invocation
     */
    public final Builder destination(int destination) {
      checkNotIsSet(destinationIsSet(), "destination");
      this.destination = destination;
      optBits |= OPT_BIT_DESTINATION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#destination() destination} to destination.
     * @param destination The value for destination
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("destination")
    public final Builder destination(java.util.Optional<java.lang.Integer> destination) {
      checkNotIsSet(destinationIsSet(), "destination");
      this.destination = destination.orElse(null);
      optBits |= OPT_BIT_DESTINATION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#responseId() responseId} to responseId.
     * @param responseId The value for responseId
     * @return {@code this} builder for chained invocation
     */
    public final Builder responseId(com.fhir.id responseId) {
      checkNotIsSet(responseIdIsSet(), "responseId");
      this.responseId = java.util.Objects.requireNonNull(responseId, "responseId");
      optBits |= OPT_BIT_RESPONSE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#responseId() responseId} to responseId.
     * @param responseId The value for responseId
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("responseId")
    public final Builder responseId(java.util.Optional<? extends com.fhir.id> responseId) {
      checkNotIsSet(responseIdIsSet(), "responseId");
      this.responseId = responseId.orElse(null);
      optBits |= OPT_BIT_RESPONSE_ID;
      return this;
    }

    /**
     * Builds a new {@link TestScript_Operation TestScript_Operation}.
     * @return An immutable instance of TestScript_Operation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.TestScript_Operation build() {
      return new ImmutableTestScript_Operation(
          type,
          encodeRequestUrl,
          method,
          label,
          params,
          targetId,
          origin,
          url,
          extension,
          sourceId,
          requestId,
          resource,
          accept,
          description,
          id,
          contentType,
          modifierExtension,
          requestHeader,
          destination,
          responseId);
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean encodeRequestUrlIsSet() {
      return (optBits & OPT_BIT_ENCODE_REQUEST_URL) != 0;
    }

    private boolean methodIsSet() {
      return (optBits & OPT_BIT_METHOD) != 0;
    }

    private boolean labelIsSet() {
      return (optBits & OPT_BIT_LABEL) != 0;
    }

    private boolean paramsIsSet() {
      return (optBits & OPT_BIT_PARAMS) != 0;
    }

    private boolean targetIdIsSet() {
      return (optBits & OPT_BIT_TARGET_ID) != 0;
    }

    private boolean originIsSet() {
      return (optBits & OPT_BIT_ORIGIN) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean sourceIdIsSet() {
      return (optBits & OPT_BIT_SOURCE_ID) != 0;
    }

    private boolean requestIdIsSet() {
      return (optBits & OPT_BIT_REQUEST_ID) != 0;
    }

    private boolean resourceIsSet() {
      return (optBits & OPT_BIT_RESOURCE) != 0;
    }

    private boolean acceptIsSet() {
      return (optBits & OPT_BIT_ACCEPT) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean contentTypeIsSet() {
      return (optBits & OPT_BIT_CONTENT_TYPE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean requestHeaderIsSet() {
      return (optBits & OPT_BIT_REQUEST_HEADER) != 0;
    }

    private boolean destinationIsSet() {
      return (optBits & OPT_BIT_DESTINATION) != 0;
    }

    private boolean responseIdIsSet() {
      return (optBits & OPT_BIT_RESPONSE_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of TestScript_Operation is strict, attribute is already set: ".concat(name));
    }
  }
}

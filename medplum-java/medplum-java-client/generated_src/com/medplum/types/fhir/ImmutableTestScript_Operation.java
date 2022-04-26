package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link TestScript_Operation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableTestScript_Operation.builder()}.
 */
@Generated(from = "TestScript_Operation", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableTestScript_Operation implements TestScript_Operation {
  private final @Nullable Code accept;
  private final @Nullable String id;
  private final @Nullable Coding type;
  private final @Nullable Integer origin;
  private final @Nullable Id targetId;
  private final @Nullable Id sourceId;
  private final @Nullable Testscript_operationMethod method;
  private final @Nullable Code resource;
  private final @Nullable List<TestScript_RequestHeader> requestHeader;
  private final @Nullable Id requestId;
  private final @Nullable Code contentType;
  private final @Nullable String url;
  private final @Nullable String label;
  private final @Nullable String params;
  private final @Nullable String description;
  private final @Nullable Integer destination;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Boolean encodeRequestUrl;
  private final @Nullable List<Extension> extension;
  private final @Nullable Id responseId;

  private ImmutableTestScript_Operation(
      @Nullable Code accept,
      @Nullable String id,
      @Nullable Coding type,
      @Nullable Integer origin,
      @Nullable Id targetId,
      @Nullable Id sourceId,
      @Nullable Testscript_operationMethod method,
      @Nullable Code resource,
      @Nullable List<TestScript_RequestHeader> requestHeader,
      @Nullable Id requestId,
      @Nullable Code contentType,
      @Nullable String url,
      @Nullable String label,
      @Nullable String params,
      @Nullable String description,
      @Nullable Integer destination,
      @Nullable List<Extension> modifierExtension,
      @Nullable Boolean encodeRequestUrl,
      @Nullable List<Extension> extension,
      @Nullable Id responseId) {
    this.accept = accept;
    this.id = id;
    this.type = type;
    this.origin = origin;
    this.targetId = targetId;
    this.sourceId = sourceId;
    this.method = method;
    this.resource = resource;
    this.requestHeader = requestHeader;
    this.requestId = requestId;
    this.contentType = contentType;
    this.url = url;
    this.label = label;
    this.params = params;
    this.description = description;
    this.destination = destination;
    this.modifierExtension = modifierExtension;
    this.encodeRequestUrl = encodeRequestUrl;
    this.extension = extension;
    this.responseId = responseId;
  }

  /**
   * @return The value of the {@code accept} attribute
   */
  @JsonProperty("accept")
  @Override
  public Optional<Code> accept() {
    return Optional.ofNullable(accept);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<Coding> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code origin} attribute
   */
  @JsonProperty("origin")
  @Override
  public Optional<Integer> origin() {
    return Optional.ofNullable(origin);
  }

  /**
   * @return The value of the {@code targetId} attribute
   */
  @JsonProperty("targetId")
  @Override
  public Optional<Id> targetId() {
    return Optional.ofNullable(targetId);
  }

  /**
   * @return The value of the {@code sourceId} attribute
   */
  @JsonProperty("sourceId")
  @Override
  public Optional<Id> sourceId() {
    return Optional.ofNullable(sourceId);
  }

  /**
   * @return The value of the {@code method} attribute
   */
  @JsonProperty("method")
  @Override
  public Optional<Testscript_operationMethod> method() {
    return Optional.ofNullable(method);
  }

  /**
   * @return The value of the {@code resource} attribute
   */
  @JsonProperty("resource")
  @Override
  public Optional<Code> resource() {
    return Optional.ofNullable(resource);
  }

  /**
   * @return The value of the {@code requestHeader} attribute
   */
  @JsonProperty("requestHeader")
  @Override
  public Optional<List<TestScript_RequestHeader>> requestHeader() {
    return Optional.ofNullable(requestHeader);
  }

  /**
   * @return The value of the {@code requestId} attribute
   */
  @JsonProperty("requestId")
  @Override
  public Optional<Id> requestId() {
    return Optional.ofNullable(requestId);
  }

  /**
   * @return The value of the {@code contentType} attribute
   */
  @JsonProperty("contentType")
  @Override
  public Optional<Code> contentType() {
    return Optional.ofNullable(contentType);
  }

  /**
   * @return The value of the {@code url} attribute
   */
  @JsonProperty("url")
  @Override
  public Optional<String> url() {
    return Optional.ofNullable(url);
  }

  /**
   * @return The value of the {@code label} attribute
   */
  @JsonProperty("label")
  @Override
  public Optional<String> label() {
    return Optional.ofNullable(label);
  }

  /**
   * @return The value of the {@code params} attribute
   */
  @JsonProperty("params")
  @Override
  public Optional<String> params() {
    return Optional.ofNullable(params);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code destination} attribute
   */
  @JsonProperty("destination")
  @Override
  public Optional<Integer> destination() {
    return Optional.ofNullable(destination);
  }

  /**
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code encodeRequestUrl} attribute
   */
  @JsonProperty("encodeRequestUrl")
  @Override
  public Optional<Boolean> encodeRequestUrl() {
    return Optional.ofNullable(encodeRequestUrl);
  }

  /**
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code responseId} attribute
   */
  @JsonProperty("responseId")
  @Override
  public Optional<Id> responseId() {
    return Optional.ofNullable(responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#accept() accept} attribute.
   * @param value The value for accept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withAccept(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "accept");
    if (this.accept == newValue) return this;
    return new ImmutableTestScript_Operation(
        newValue,
        this.id,
        this.type,
        this.origin,
        this.targetId,
        this.sourceId,
        this.method,
        this.resource,
        this.requestHeader,
        this.requestId,
        this.contentType,
        this.url,
        this.label,
        this.params,
        this.description,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#accept() accept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for accept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Operation withAccept(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.accept == value) return this;
    return new ImmutableTestScript_Operation(
        value,
        this.id,
        this.type,
        this.origin,
        this.targetId,
        this.sourceId,
        this.method,
        this.resource,
        this.requestHeader,
        this.requestId,
        this.contentType,
        this.url,
        this.label,
        this.params,
        this.description,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        newValue,
        this.type,
        this.origin,
        this.targetId,
        this.sourceId,
        this.method,
        this.resource,
        this.requestHeader,
        this.requestId,
        this.contentType,
        this.url,
        this.label,
        this.params,
        this.description,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        value,
        this.type,
        this.origin,
        this.targetId,
        this.sourceId,
        this.method,
        this.resource,
        this.requestHeader,
        this.requestId,
        this.contentType,
        this.url,
        this.label,
        this.params,
        this.description,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withType(Coding value) {
    @Nullable Coding newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        newValue,
        this.origin,
        this.targetId,
        this.sourceId,
        this.method,
        this.resource,
        this.requestHeader,
        this.requestId,
        this.contentType,
        this.url,
        this.label,
        this.params,
        this.description,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Operation withType(Optional<? extends Coding> optional) {
    @Nullable Coding value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        value,
        this.origin,
        this.targetId,
        this.sourceId,
        this.method,
        this.resource,
        this.requestHeader,
        this.requestId,
        this.contentType,
        this.url,
        this.label,
        this.params,
        this.description,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#origin() origin} attribute.
   * @param value The value for origin
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withOrigin(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.origin, newValue)) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        newValue,
        this.targetId,
        this.sourceId,
        this.method,
        this.resource,
        this.requestHeader,
        this.requestId,
        this.contentType,
        this.url,
        this.label,
        this.params,
        this.description,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#origin() origin} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for origin
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withOrigin(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.origin, value)) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        value,
        this.targetId,
        this.sourceId,
        this.method,
        this.resource,
        this.requestHeader,
        this.requestId,
        this.contentType,
        this.url,
        this.label,
        this.params,
        this.description,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#targetId() targetId} attribute.
   * @param value The value for targetId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withTargetId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "targetId");
    if (this.targetId == newValue) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        this.origin,
        newValue,
        this.sourceId,
        this.method,
        this.resource,
        this.requestHeader,
        this.requestId,
        this.contentType,
        this.url,
        this.label,
        this.params,
        this.description,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#targetId() targetId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for targetId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Operation withTargetId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.targetId == value) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        this.origin,
        value,
        this.sourceId,
        this.method,
        this.resource,
        this.requestHeader,
        this.requestId,
        this.contentType,
        this.url,
        this.label,
        this.params,
        this.description,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#sourceId() sourceId} attribute.
   * @param value The value for sourceId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withSourceId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "sourceId");
    if (this.sourceId == newValue) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        this.origin,
        this.targetId,
        newValue,
        this.method,
        this.resource,
        this.requestHeader,
        this.requestId,
        this.contentType,
        this.url,
        this.label,
        this.params,
        this.description,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#sourceId() sourceId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sourceId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Operation withSourceId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.sourceId == value) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        this.origin,
        this.targetId,
        value,
        this.method,
        this.resource,
        this.requestHeader,
        this.requestId,
        this.contentType,
        this.url,
        this.label,
        this.params,
        this.description,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#method() method} attribute.
   * @param value The value for method
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withMethod(Testscript_operationMethod value) {
    @Nullable Testscript_operationMethod newValue = Objects.requireNonNull(value, "method");
    if (this.method == newValue) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        this.origin,
        this.targetId,
        this.sourceId,
        newValue,
        this.resource,
        this.requestHeader,
        this.requestId,
        this.contentType,
        this.url,
        this.label,
        this.params,
        this.description,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#method() method} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for method
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Operation withMethod(Optional<? extends Testscript_operationMethod> optional) {
    @Nullable Testscript_operationMethod value = optional.orElse(null);
    if (this.method == value) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        this.origin,
        this.targetId,
        this.sourceId,
        value,
        this.resource,
        this.requestHeader,
        this.requestId,
        this.contentType,
        this.url,
        this.label,
        this.params,
        this.description,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#resource() resource} attribute.
   * @param value The value for resource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withResource(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "resource");
    if (this.resource == newValue) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        this.origin,
        this.targetId,
        this.sourceId,
        this.method,
        newValue,
        this.requestHeader,
        this.requestId,
        this.contentType,
        this.url,
        this.label,
        this.params,
        this.description,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#resource() resource} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resource
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Operation withResource(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.resource == value) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        this.origin,
        this.targetId,
        this.sourceId,
        this.method,
        value,
        this.requestHeader,
        this.requestId,
        this.contentType,
        this.url,
        this.label,
        this.params,
        this.description,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#requestHeader() requestHeader} attribute.
   * @param value The value for requestHeader
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withRequestHeader(List<TestScript_RequestHeader> value) {
    @Nullable List<TestScript_RequestHeader> newValue = Objects.requireNonNull(value, "requestHeader");
    if (this.requestHeader == newValue) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        this.origin,
        this.targetId,
        this.sourceId,
        this.method,
        this.resource,
        newValue,
        this.requestId,
        this.contentType,
        this.url,
        this.label,
        this.params,
        this.description,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#requestHeader() requestHeader} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requestHeader
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Operation withRequestHeader(Optional<? extends List<TestScript_RequestHeader>> optional) {
    @Nullable List<TestScript_RequestHeader> value = optional.orElse(null);
    if (this.requestHeader == value) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        this.origin,
        this.targetId,
        this.sourceId,
        this.method,
        this.resource,
        value,
        this.requestId,
        this.contentType,
        this.url,
        this.label,
        this.params,
        this.description,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#requestId() requestId} attribute.
   * @param value The value for requestId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withRequestId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "requestId");
    if (this.requestId == newValue) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        this.origin,
        this.targetId,
        this.sourceId,
        this.method,
        this.resource,
        this.requestHeader,
        newValue,
        this.contentType,
        this.url,
        this.label,
        this.params,
        this.description,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#requestId() requestId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requestId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Operation withRequestId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.requestId == value) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        this.origin,
        this.targetId,
        this.sourceId,
        this.method,
        this.resource,
        this.requestHeader,
        value,
        this.contentType,
        this.url,
        this.label,
        this.params,
        this.description,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#contentType() contentType} attribute.
   * @param value The value for contentType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withContentType(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "contentType");
    if (this.contentType == newValue) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        this.origin,
        this.targetId,
        this.sourceId,
        this.method,
        this.resource,
        this.requestHeader,
        this.requestId,
        newValue,
        this.url,
        this.label,
        this.params,
        this.description,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#contentType() contentType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contentType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Operation withContentType(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.contentType == value) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        this.origin,
        this.targetId,
        this.sourceId,
        this.method,
        this.resource,
        this.requestHeader,
        this.requestId,
        value,
        this.url,
        this.label,
        this.params,
        this.description,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withUrl(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "url");
    if (Objects.equals(this.url, newValue)) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        this.origin,
        this.targetId,
        this.sourceId,
        this.method,
        this.resource,
        this.requestHeader,
        this.requestId,
        this.contentType,
        newValue,
        this.label,
        this.params,
        this.description,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#url() url} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withUrl(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.url, value)) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        this.origin,
        this.targetId,
        this.sourceId,
        this.method,
        this.resource,
        this.requestHeader,
        this.requestId,
        this.contentType,
        value,
        this.label,
        this.params,
        this.description,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#label() label} attribute.
   * @param value The value for label
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withLabel(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "label");
    if (Objects.equals(this.label, newValue)) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        this.origin,
        this.targetId,
        this.sourceId,
        this.method,
        this.resource,
        this.requestHeader,
        this.requestId,
        this.contentType,
        this.url,
        newValue,
        this.params,
        this.description,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#label() label} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for label
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withLabel(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.label, value)) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        this.origin,
        this.targetId,
        this.sourceId,
        this.method,
        this.resource,
        this.requestHeader,
        this.requestId,
        this.contentType,
        this.url,
        value,
        this.params,
        this.description,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#params() params} attribute.
   * @param value The value for params
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withParams(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "params");
    if (Objects.equals(this.params, newValue)) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        this.origin,
        this.targetId,
        this.sourceId,
        this.method,
        this.resource,
        this.requestHeader,
        this.requestId,
        this.contentType,
        this.url,
        this.label,
        newValue,
        this.description,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#params() params} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for params
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withParams(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.params, value)) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        this.origin,
        this.targetId,
        this.sourceId,
        this.method,
        this.resource,
        this.requestHeader,
        this.requestId,
        this.contentType,
        this.url,
        this.label,
        value,
        this.description,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        this.origin,
        this.targetId,
        this.sourceId,
        this.method,
        this.resource,
        this.requestHeader,
        this.requestId,
        this.contentType,
        this.url,
        this.label,
        this.params,
        newValue,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        this.origin,
        this.targetId,
        this.sourceId,
        this.method,
        this.resource,
        this.requestHeader,
        this.requestId,
        this.contentType,
        this.url,
        this.label,
        this.params,
        value,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#destination() destination} attribute.
   * @param value The value for destination
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withDestination(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.destination, newValue)) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        this.origin,
        this.targetId,
        this.sourceId,
        this.method,
        this.resource,
        this.requestHeader,
        this.requestId,
        this.contentType,
        this.url,
        this.label,
        this.params,
        this.description,
        newValue,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#destination() destination} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for destination
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withDestination(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.destination, value)) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        this.origin,
        this.targetId,
        this.sourceId,
        this.method,
        this.resource,
        this.requestHeader,
        this.requestId,
        this.contentType,
        this.url,
        this.label,
        this.params,
        this.description,
        value,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        this.origin,
        this.targetId,
        this.sourceId,
        this.method,
        this.resource,
        this.requestHeader,
        this.requestId,
        this.contentType,
        this.url,
        this.label,
        this.params,
        this.description,
        this.destination,
        newValue,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Operation withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        this.origin,
        this.targetId,
        this.sourceId,
        this.method,
        this.resource,
        this.requestHeader,
        this.requestId,
        this.contentType,
        this.url,
        this.label,
        this.params,
        this.description,
        this.destination,
        value,
        this.encodeRequestUrl,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#encodeRequestUrl() encodeRequestUrl} attribute.
   * @param value The value for encodeRequestUrl
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withEncodeRequestUrl(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.encodeRequestUrl, newValue)) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        this.origin,
        this.targetId,
        this.sourceId,
        this.method,
        this.resource,
        this.requestHeader,
        this.requestId,
        this.contentType,
        this.url,
        this.label,
        this.params,
        this.description,
        this.destination,
        this.modifierExtension,
        newValue,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#encodeRequestUrl() encodeRequestUrl} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encodeRequestUrl
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withEncodeRequestUrl(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.encodeRequestUrl, value)) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        this.origin,
        this.targetId,
        this.sourceId,
        this.method,
        this.resource,
        this.requestHeader,
        this.requestId,
        this.contentType,
        this.url,
        this.label,
        this.params,
        this.description,
        this.destination,
        this.modifierExtension,
        value,
        this.extension,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        this.origin,
        this.targetId,
        this.sourceId,
        this.method,
        this.resource,
        this.requestHeader,
        this.requestId,
        this.contentType,
        this.url,
        this.label,
        this.params,
        this.description,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        newValue,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Operation withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        this.origin,
        this.targetId,
        this.sourceId,
        this.method,
        this.resource,
        this.requestHeader,
        this.requestId,
        this.contentType,
        this.url,
        this.label,
        this.params,
        this.description,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        value,
        this.responseId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link TestScript_Operation#responseId() responseId} attribute.
   * @param value The value for responseId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableTestScript_Operation withResponseId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "responseId");
    if (this.responseId == newValue) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        this.origin,
        this.targetId,
        this.sourceId,
        this.method,
        this.resource,
        this.requestHeader,
        this.requestId,
        this.contentType,
        this.url,
        this.label,
        this.params,
        this.description,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link TestScript_Operation#responseId() responseId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for responseId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableTestScript_Operation withResponseId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.responseId == value) return this;
    return new ImmutableTestScript_Operation(
        this.accept,
        this.id,
        this.type,
        this.origin,
        this.targetId,
        this.sourceId,
        this.method,
        this.resource,
        this.requestHeader,
        this.requestId,
        this.contentType,
        this.url,
        this.label,
        this.params,
        this.description,
        this.destination,
        this.modifierExtension,
        this.encodeRequestUrl,
        this.extension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableTestScript_Operation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableTestScript_Operation
        && equalTo((ImmutableTestScript_Operation) another);
  }

  private boolean equalTo(ImmutableTestScript_Operation another) {
    return Objects.equals(accept, another.accept)
        && Objects.equals(id, another.id)
        && Objects.equals(type, another.type)
        && Objects.equals(origin, another.origin)
        && Objects.equals(targetId, another.targetId)
        && Objects.equals(sourceId, another.sourceId)
        && Objects.equals(method, another.method)
        && Objects.equals(resource, another.resource)
        && Objects.equals(requestHeader, another.requestHeader)
        && Objects.equals(requestId, another.requestId)
        && Objects.equals(contentType, another.contentType)
        && Objects.equals(url, another.url)
        && Objects.equals(label, another.label)
        && Objects.equals(params, another.params)
        && Objects.equals(description, another.description)
        && Objects.equals(destination, another.destination)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(encodeRequestUrl, another.encodeRequestUrl)
        && Objects.equals(extension, another.extension)
        && Objects.equals(responseId, another.responseId);
  }

  /**
   * Computes a hash code from attributes: {@code accept}, {@code id}, {@code type}, {@code origin}, {@code targetId}, {@code sourceId}, {@code method}, {@code resource}, {@code requestHeader}, {@code requestId}, {@code contentType}, {@code url}, {@code label}, {@code params}, {@code description}, {@code destination}, {@code modifierExtension}, {@code encodeRequestUrl}, {@code extension}, {@code responseId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(accept);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(origin);
    h += (h << 5) + Objects.hashCode(targetId);
    h += (h << 5) + Objects.hashCode(sourceId);
    h += (h << 5) + Objects.hashCode(method);
    h += (h << 5) + Objects.hashCode(resource);
    h += (h << 5) + Objects.hashCode(requestHeader);
    h += (h << 5) + Objects.hashCode(requestId);
    h += (h << 5) + Objects.hashCode(contentType);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(label);
    h += (h << 5) + Objects.hashCode(params);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(destination);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(encodeRequestUrl);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(responseId);
    return h;
  }

  /**
   * Prints the immutable value {@code TestScript_Operation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("TestScript_Operation{");
    if (accept != null) {
      builder.append("accept=").append(accept);
    }
    if (id != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (type != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (origin != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("origin=").append(origin);
    }
    if (targetId != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("targetId=").append(targetId);
    }
    if (sourceId != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("sourceId=").append(sourceId);
    }
    if (method != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("method=").append(method);
    }
    if (resource != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("resource=").append(resource);
    }
    if (requestHeader != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("requestHeader=").append(requestHeader);
    }
    if (requestId != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("requestId=").append(requestId);
    }
    if (contentType != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("contentType=").append(contentType);
    }
    if (url != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("url=").append(url);
    }
    if (label != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("label=").append(label);
    }
    if (params != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("params=").append(params);
    }
    if (description != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (destination != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("destination=").append(destination);
    }
    if (modifierExtension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (encodeRequestUrl != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("encodeRequestUrl=").append(encodeRequestUrl);
    }
    if (extension != null) {
      if (builder.length() > 21) builder.append(", ");
      builder.append("extension=").append(extension);
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
  @Generated(from = "TestScript_Operation", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements TestScript_Operation {
    @Nullable Optional<Code> accept = Optional.empty();
    boolean acceptIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Coding> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<Integer> origin = Optional.empty();
    boolean originIsSet;
    @Nullable Optional<Id> targetId = Optional.empty();
    boolean targetIdIsSet;
    @Nullable Optional<Id> sourceId = Optional.empty();
    boolean sourceIdIsSet;
    @Nullable Optional<Testscript_operationMethod> method = Optional.empty();
    boolean methodIsSet;
    @Nullable Optional<Code> resource = Optional.empty();
    boolean resourceIsSet;
    @Nullable Optional<List<TestScript_RequestHeader>> requestHeader = Optional.empty();
    boolean requestHeaderIsSet;
    @Nullable Optional<Id> requestId = Optional.empty();
    boolean requestIdIsSet;
    @Nullable Optional<Code> contentType = Optional.empty();
    boolean contentTypeIsSet;
    @Nullable Optional<String> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<String> label = Optional.empty();
    boolean labelIsSet;
    @Nullable Optional<String> params = Optional.empty();
    boolean paramsIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<Integer> destination = Optional.empty();
    boolean destinationIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Boolean> encodeRequestUrl = Optional.empty();
    boolean encodeRequestUrlIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Id> responseId = Optional.empty();
    boolean responseIdIsSet;
    @JsonProperty("accept")
    public void setAccept(Optional<Code> accept) {
      this.accept = accept;
      this.acceptIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<Coding> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("origin")
    public void setOrigin(Optional<Integer> origin) {
      this.origin = origin;
      this.originIsSet = true;
    }
    @JsonProperty("targetId")
    public void setTargetId(Optional<Id> targetId) {
      this.targetId = targetId;
      this.targetIdIsSet = true;
    }
    @JsonProperty("sourceId")
    public void setSourceId(Optional<Id> sourceId) {
      this.sourceId = sourceId;
      this.sourceIdIsSet = true;
    }
    @JsonProperty("method")
    public void setMethod(Optional<Testscript_operationMethod> method) {
      this.method = method;
      this.methodIsSet = true;
    }
    @JsonProperty("resource")
    public void setResource(Optional<Code> resource) {
      this.resource = resource;
      this.resourceIsSet = true;
    }
    @JsonProperty("requestHeader")
    public void setRequestHeader(Optional<List<TestScript_RequestHeader>> requestHeader) {
      this.requestHeader = requestHeader;
      this.requestHeaderIsSet = true;
    }
    @JsonProperty("requestId")
    public void setRequestId(Optional<Id> requestId) {
      this.requestId = requestId;
      this.requestIdIsSet = true;
    }
    @JsonProperty("contentType")
    public void setContentType(Optional<Code> contentType) {
      this.contentType = contentType;
      this.contentTypeIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<String> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @JsonProperty("label")
    public void setLabel(Optional<String> label) {
      this.label = label;
      this.labelIsSet = true;
    }
    @JsonProperty("params")
    public void setParams(Optional<String> params) {
      this.params = params;
      this.paramsIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("destination")
    public void setDestination(Optional<Integer> destination) {
      this.destination = destination;
      this.destinationIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("encodeRequestUrl")
    public void setEncodeRequestUrl(Optional<Boolean> encodeRequestUrl) {
      this.encodeRequestUrl = encodeRequestUrl;
      this.encodeRequestUrlIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("responseId")
    public void setResponseId(Optional<Id> responseId) {
      this.responseId = responseId;
      this.responseIdIsSet = true;
    }
    @Override
    public Optional<Code> accept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Coding> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> origin() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> targetId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> sourceId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Testscript_operationMethod> method() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> resource() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<TestScript_RequestHeader>> requestHeader() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> requestId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> contentType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> label() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> params() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> destination() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> encodeRequestUrl() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> responseId() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableTestScript_Operation fromJson(Json json) {
    ImmutableTestScript_Operation.Builder builder = ImmutableTestScript_Operation.builder();
    if (json.acceptIsSet) {
      builder.accept(json.accept);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.originIsSet) {
      builder.origin(json.origin);
    }
    if (json.targetIdIsSet) {
      builder.targetId(json.targetId);
    }
    if (json.sourceIdIsSet) {
      builder.sourceId(json.sourceId);
    }
    if (json.methodIsSet) {
      builder.method(json.method);
    }
    if (json.resourceIsSet) {
      builder.resource(json.resource);
    }
    if (json.requestHeaderIsSet) {
      builder.requestHeader(json.requestHeader);
    }
    if (json.requestIdIsSet) {
      builder.requestId(json.requestId);
    }
    if (json.contentTypeIsSet) {
      builder.contentType(json.contentType);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.labelIsSet) {
      builder.label(json.label);
    }
    if (json.paramsIsSet) {
      builder.params(json.params);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.destinationIsSet) {
      builder.destination(json.destination);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.encodeRequestUrlIsSet) {
      builder.encodeRequestUrl(json.encodeRequestUrl);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
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
        .accept(instance.accept())
        .id(instance.id())
        .type(instance.type())
        .origin(instance.origin())
        .targetId(instance.targetId())
        .sourceId(instance.sourceId())
        .method(instance.method())
        .resource(instance.resource())
        .requestHeader(instance.requestHeader())
        .requestId(instance.requestId())
        .contentType(instance.contentType())
        .url(instance.url())
        .label(instance.label())
        .params(instance.params())
        .description(instance.description())
        .destination(instance.destination())
        .modifierExtension(instance.modifierExtension())
        .encodeRequestUrl(instance.encodeRequestUrl())
        .extension(instance.extension())
        .responseId(instance.responseId())
        .build();
  }

  /**
   * Creates a builder for {@link TestScript_Operation TestScript_Operation}.
   * <pre>
   * ImmutableTestScript_Operation.builder()
   *    .accept(com.medplum.types.fhir.Code) // optional {@link TestScript_Operation#accept() accept}
   *    .id(String) // optional {@link TestScript_Operation#id() id}
   *    .type(com.medplum.types.fhir.Coding) // optional {@link TestScript_Operation#type() type}
   *    .origin(Integer) // optional {@link TestScript_Operation#origin() origin}
   *    .targetId(com.medplum.types.fhir.Id) // optional {@link TestScript_Operation#targetId() targetId}
   *    .sourceId(com.medplum.types.fhir.Id) // optional {@link TestScript_Operation#sourceId() sourceId}
   *    .method(com.medplum.types.fhir.Testscript_operationMethod) // optional {@link TestScript_Operation#method() method}
   *    .resource(com.medplum.types.fhir.Code) // optional {@link TestScript_Operation#resource() resource}
   *    .requestHeader(List&amp;lt;com.medplum.types.fhir.TestScript_RequestHeader&amp;gt;) // optional {@link TestScript_Operation#requestHeader() requestHeader}
   *    .requestId(com.medplum.types.fhir.Id) // optional {@link TestScript_Operation#requestId() requestId}
   *    .contentType(com.medplum.types.fhir.Code) // optional {@link TestScript_Operation#contentType() contentType}
   *    .url(String) // optional {@link TestScript_Operation#url() url}
   *    .label(String) // optional {@link TestScript_Operation#label() label}
   *    .params(String) // optional {@link TestScript_Operation#params() params}
   *    .description(String) // optional {@link TestScript_Operation#description() description}
   *    .destination(Integer) // optional {@link TestScript_Operation#destination() destination}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link TestScript_Operation#modifierExtension() modifierExtension}
   *    .encodeRequestUrl(Boolean) // optional {@link TestScript_Operation#encodeRequestUrl() encodeRequestUrl}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link TestScript_Operation#extension() extension}
   *    .responseId(com.medplum.types.fhir.Id) // optional {@link TestScript_Operation#responseId() responseId}
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
  @Generated(from = "TestScript_Operation", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ACCEPT = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_TYPE = 0x4L;
    private static final long OPT_BIT_ORIGIN = 0x8L;
    private static final long OPT_BIT_TARGET_ID = 0x10L;
    private static final long OPT_BIT_SOURCE_ID = 0x20L;
    private static final long OPT_BIT_METHOD = 0x40L;
    private static final long OPT_BIT_RESOURCE = 0x80L;
    private static final long OPT_BIT_REQUEST_HEADER = 0x100L;
    private static final long OPT_BIT_REQUEST_ID = 0x200L;
    private static final long OPT_BIT_CONTENT_TYPE = 0x400L;
    private static final long OPT_BIT_URL = 0x800L;
    private static final long OPT_BIT_LABEL = 0x1000L;
    private static final long OPT_BIT_PARAMS = 0x2000L;
    private static final long OPT_BIT_DESCRIPTION = 0x4000L;
    private static final long OPT_BIT_DESTINATION = 0x8000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10000L;
    private static final long OPT_BIT_ENCODE_REQUEST_URL = 0x20000L;
    private static final long OPT_BIT_EXTENSION = 0x40000L;
    private static final long OPT_BIT_RESPONSE_ID = 0x80000L;
    private long optBits;

    private @Nullable Code accept;
    private @Nullable String id;
    private @Nullable Coding type;
    private @Nullable Integer origin;
    private @Nullable Id targetId;
    private @Nullable Id sourceId;
    private @Nullable Testscript_operationMethod method;
    private @Nullable Code resource;
    private @Nullable List<TestScript_RequestHeader> requestHeader;
    private @Nullable Id requestId;
    private @Nullable Code contentType;
    private @Nullable String url;
    private @Nullable String label;
    private @Nullable String params;
    private @Nullable String description;
    private @Nullable Integer destination;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Boolean encodeRequestUrl;
    private @Nullable List<Extension> extension;
    private @Nullable Id responseId;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#accept() accept} to accept.
     * @param accept The value for accept
     * @return {@code this} builder for chained invocation
     */
    public final Builder accept(Code accept) {
      checkNotIsSet(acceptIsSet(), "accept");
      this.accept = Objects.requireNonNull(accept, "accept");
      optBits |= OPT_BIT_ACCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#accept() accept} to accept.
     * @param accept The value for accept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("accept")
    public final Builder accept(Optional<? extends Code> accept) {
      checkNotIsSet(acceptIsSet(), "accept");
      this.accept = accept.orElse(null);
      optBits |= OPT_BIT_ACCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(String id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<String> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(Coding type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends Coding> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
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
    @JsonProperty("origin")
    public final Builder origin(Optional<Integer> origin) {
      checkNotIsSet(originIsSet(), "origin");
      this.origin = origin.orElse(null);
      optBits |= OPT_BIT_ORIGIN;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#targetId() targetId} to targetId.
     * @param targetId The value for targetId
     * @return {@code this} builder for chained invocation
     */
    public final Builder targetId(Id targetId) {
      checkNotIsSet(targetIdIsSet(), "targetId");
      this.targetId = Objects.requireNonNull(targetId, "targetId");
      optBits |= OPT_BIT_TARGET_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#targetId() targetId} to targetId.
     * @param targetId The value for targetId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("targetId")
    public final Builder targetId(Optional<? extends Id> targetId) {
      checkNotIsSet(targetIdIsSet(), "targetId");
      this.targetId = targetId.orElse(null);
      optBits |= OPT_BIT_TARGET_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#sourceId() sourceId} to sourceId.
     * @param sourceId The value for sourceId
     * @return {@code this} builder for chained invocation
     */
    public final Builder sourceId(Id sourceId) {
      checkNotIsSet(sourceIdIsSet(), "sourceId");
      this.sourceId = Objects.requireNonNull(sourceId, "sourceId");
      optBits |= OPT_BIT_SOURCE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#sourceId() sourceId} to sourceId.
     * @param sourceId The value for sourceId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sourceId")
    public final Builder sourceId(Optional<? extends Id> sourceId) {
      checkNotIsSet(sourceIdIsSet(), "sourceId");
      this.sourceId = sourceId.orElse(null);
      optBits |= OPT_BIT_SOURCE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for chained invocation
     */
    public final Builder method(Testscript_operationMethod method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = Objects.requireNonNull(method, "method");
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("method")
    public final Builder method(Optional<? extends Testscript_operationMethod> method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = method.orElse(null);
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for chained invocation
     */
    public final Builder resource(Code resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = Objects.requireNonNull(resource, "resource");
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resource")
    public final Builder resource(Optional<? extends Code> resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = resource.orElse(null);
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#requestHeader() requestHeader} to requestHeader.
     * @param requestHeader The value for requestHeader
     * @return {@code this} builder for chained invocation
     */
    public final Builder requestHeader(List<TestScript_RequestHeader> requestHeader) {
      checkNotIsSet(requestHeaderIsSet(), "requestHeader");
      this.requestHeader = Objects.requireNonNull(requestHeader, "requestHeader");
      optBits |= OPT_BIT_REQUEST_HEADER;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#requestHeader() requestHeader} to requestHeader.
     * @param requestHeader The value for requestHeader
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("requestHeader")
    public final Builder requestHeader(Optional<? extends List<TestScript_RequestHeader>> requestHeader) {
      checkNotIsSet(requestHeaderIsSet(), "requestHeader");
      this.requestHeader = requestHeader.orElse(null);
      optBits |= OPT_BIT_REQUEST_HEADER;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#requestId() requestId} to requestId.
     * @param requestId The value for requestId
     * @return {@code this} builder for chained invocation
     */
    public final Builder requestId(Id requestId) {
      checkNotIsSet(requestIdIsSet(), "requestId");
      this.requestId = Objects.requireNonNull(requestId, "requestId");
      optBits |= OPT_BIT_REQUEST_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#requestId() requestId} to requestId.
     * @param requestId The value for requestId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("requestId")
    public final Builder requestId(Optional<? extends Id> requestId) {
      checkNotIsSet(requestIdIsSet(), "requestId");
      this.requestId = requestId.orElse(null);
      optBits |= OPT_BIT_REQUEST_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#contentType() contentType} to contentType.
     * @param contentType The value for contentType
     * @return {@code this} builder for chained invocation
     */
    public final Builder contentType(Code contentType) {
      checkNotIsSet(contentTypeIsSet(), "contentType");
      this.contentType = Objects.requireNonNull(contentType, "contentType");
      optBits |= OPT_BIT_CONTENT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#contentType() contentType} to contentType.
     * @param contentType The value for contentType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contentType")
    public final Builder contentType(Optional<? extends Code> contentType) {
      checkNotIsSet(contentTypeIsSet(), "contentType");
      this.contentType = contentType.orElse(null);
      optBits |= OPT_BIT_CONTENT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    public final Builder url(String url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = Objects.requireNonNull(url, "url");
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("url")
    public final Builder url(Optional<String> url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = url.orElse(null);
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#label() label} to label.
     * @param label The value for label
     * @return {@code this} builder for chained invocation
     */
    public final Builder label(String label) {
      checkNotIsSet(labelIsSet(), "label");
      this.label = Objects.requireNonNull(label, "label");
      optBits |= OPT_BIT_LABEL;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#label() label} to label.
     * @param label The value for label
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("label")
    public final Builder label(Optional<String> label) {
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
    public final Builder params(String params) {
      checkNotIsSet(paramsIsSet(), "params");
      this.params = Objects.requireNonNull(params, "params");
      optBits |= OPT_BIT_PARAMS;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#params() params} to params.
     * @param params The value for params
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("params")
    public final Builder params(Optional<String> params) {
      checkNotIsSet(paramsIsSet(), "params");
      this.params = params.orElse(null);
      optBits |= OPT_BIT_PARAMS;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
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
    @JsonProperty("destination")
    public final Builder destination(Optional<Integer> destination) {
      checkNotIsSet(destinationIsSet(), "destination");
      this.destination = destination.orElse(null);
      optBits |= OPT_BIT_DESTINATION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    public final Builder modifierExtension(List<Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("modifierExtension")
    public final Builder modifierExtension(Optional<? extends List<Extension>> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = modifierExtension.orElse(null);
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
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
    @JsonProperty("encodeRequestUrl")
    public final Builder encodeRequestUrl(Optional<Boolean> encodeRequestUrl) {
      checkNotIsSet(encodeRequestUrlIsSet(), "encodeRequestUrl");
      this.encodeRequestUrl = encodeRequestUrl.orElse(null);
      optBits |= OPT_BIT_ENCODE_REQUEST_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    public final Builder extension(List<Extension> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = Objects.requireNonNull(extension, "extension");
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("extension")
    public final Builder extension(Optional<? extends List<Extension>> extension) {
      checkNotIsSet(extensionIsSet(), "extension");
      this.extension = extension.orElse(null);
      optBits |= OPT_BIT_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#responseId() responseId} to responseId.
     * @param responseId The value for responseId
     * @return {@code this} builder for chained invocation
     */
    public final Builder responseId(Id responseId) {
      checkNotIsSet(responseIdIsSet(), "responseId");
      this.responseId = Objects.requireNonNull(responseId, "responseId");
      optBits |= OPT_BIT_RESPONSE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link TestScript_Operation#responseId() responseId} to responseId.
     * @param responseId The value for responseId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("responseId")
    public final Builder responseId(Optional<? extends Id> responseId) {
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
    public TestScript_Operation build() {
      return new ImmutableTestScript_Operation(
          accept,
          id,
          type,
          origin,
          targetId,
          sourceId,
          method,
          resource,
          requestHeader,
          requestId,
          contentType,
          url,
          label,
          params,
          description,
          destination,
          modifierExtension,
          encodeRequestUrl,
          extension,
          responseId);
    }

    private boolean acceptIsSet() {
      return (optBits & OPT_BIT_ACCEPT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean originIsSet() {
      return (optBits & OPT_BIT_ORIGIN) != 0;
    }

    private boolean targetIdIsSet() {
      return (optBits & OPT_BIT_TARGET_ID) != 0;
    }

    private boolean sourceIdIsSet() {
      return (optBits & OPT_BIT_SOURCE_ID) != 0;
    }

    private boolean methodIsSet() {
      return (optBits & OPT_BIT_METHOD) != 0;
    }

    private boolean resourceIsSet() {
      return (optBits & OPT_BIT_RESOURCE) != 0;
    }

    private boolean requestHeaderIsSet() {
      return (optBits & OPT_BIT_REQUEST_HEADER) != 0;
    }

    private boolean requestIdIsSet() {
      return (optBits & OPT_BIT_REQUEST_ID) != 0;
    }

    private boolean contentTypeIsSet() {
      return (optBits & OPT_BIT_CONTENT_TYPE) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean labelIsSet() {
      return (optBits & OPT_BIT_LABEL) != 0;
    }

    private boolean paramsIsSet() {
      return (optBits & OPT_BIT_PARAMS) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean destinationIsSet() {
      return (optBits & OPT_BIT_DESTINATION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean encodeRequestUrlIsSet() {
      return (optBits & OPT_BIT_ENCODE_REQUEST_URL) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean responseIdIsSet() {
      return (optBits & OPT_BIT_RESPONSE_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of TestScript_Operation is strict, attribute is already set: ".concat(name));
    }
  }
}
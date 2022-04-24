//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ExampleScenario_Operation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExampleScenario_Operation.builder()}.
 */
@org.immutables.value.Generated(from = "ExampleScenario_Operation", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExampleScenario_Operation implements com.fhir.ExampleScenario_Operation {
  private final @javax.annotation.Nullable java.lang.String type;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable com.fhir.markdown description;
  private final @javax.annotation.Nullable com.fhir.ExampleScenario_ContainedInstance response;
  private final @javax.annotation.Nullable com.fhir.ExampleScenario_ContainedInstance request;
  private final @javax.annotation.Nullable java.lang.String receiver;
  private final @javax.annotation.Nullable java.lang.String initiator;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.lang.Boolean initiatorActive;
  private final @javax.annotation.Nullable java.lang.Boolean receiverActive;
  private final @javax.annotation.Nullable java.lang.String number;

  private ImmutableExampleScenario_Operation(
      @javax.annotation.Nullable java.lang.String type,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable com.fhir.markdown description,
      @javax.annotation.Nullable com.fhir.ExampleScenario_ContainedInstance response,
      @javax.annotation.Nullable com.fhir.ExampleScenario_ContainedInstance request,
      @javax.annotation.Nullable java.lang.String receiver,
      @javax.annotation.Nullable java.lang.String initiator,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.lang.Boolean initiatorActive,
      @javax.annotation.Nullable java.lang.Boolean receiverActive,
      @javax.annotation.Nullable java.lang.String number) {
    this.type = type;
    this.modifierExtension = modifierExtension;
    this.name = name;
    this.description = description;
    this.response = response;
    this.request = request;
    this.receiver = receiver;
    this.initiator = initiator;
    this.id = id;
    this.extension = extension;
    this.initiatorActive = initiatorActive;
    this.receiverActive = receiverActive;
    this.number = number;
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<java.lang.String> type() {
    return java.util.Optional.ofNullable(type);
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
   * @return The value of the {@code name} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @Override
  public java.util.Optional<java.lang.String> name() {
    return java.util.Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<com.fhir.markdown> description() {
    return java.util.Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code response} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("response")
  @Override
  public java.util.Optional<com.fhir.ExampleScenario_ContainedInstance> response() {
    return java.util.Optional.ofNullable(response);
  }

  /**
   * @return The value of the {@code request} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("request")
  @Override
  public java.util.Optional<com.fhir.ExampleScenario_ContainedInstance> request() {
    return java.util.Optional.ofNullable(request);
  }

  /**
   * @return The value of the {@code receiver} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("receiver")
  @Override
  public java.util.Optional<java.lang.String> receiver() {
    return java.util.Optional.ofNullable(receiver);
  }

  /**
   * @return The value of the {@code initiator} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("initiator")
  @Override
  public java.util.Optional<java.lang.String> initiator() {
    return java.util.Optional.ofNullable(initiator);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code initiatorActive} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("initiatorActive")
  @Override
  public java.util.Optional<java.lang.Boolean> initiatorActive() {
    return java.util.Optional.ofNullable(initiatorActive);
  }

  /**
   * @return The value of the {@code receiverActive} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("receiverActive")
  @Override
  public java.util.Optional<java.lang.Boolean> receiverActive() {
    return java.util.Optional.ofNullable(receiverActive);
  }

  /**
   * @return The value of the {@code number} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("number")
  @Override
  public java.util.Optional<java.lang.String> number() {
    return java.util.Optional.ofNullable(number);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Operation#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withType(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "type");
    if (java.util.Objects.equals(this.type, newValue)) return this;
    return new ImmutableExampleScenario_Operation(
        newValue,
        this.modifierExtension,
        this.name,
        this.description,
        this.response,
        this.request,
        this.receiver,
        this.initiator,
        this.id,
        this.extension,
        this.initiatorActive,
        this.receiverActive,
        this.number);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Operation#type() type} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withType(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.type, value)) return this;
    return new ImmutableExampleScenario_Operation(
        value,
        this.modifierExtension,
        this.name,
        this.description,
        this.response,
        this.request,
        this.receiver,
        this.initiator,
        this.id,
        this.extension,
        this.initiatorActive,
        this.receiverActive,
        this.number);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Operation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExampleScenario_Operation(
        this.type,
        newValue,
        this.name,
        this.description,
        this.response,
        this.request,
        this.receiver,
        this.initiator,
        this.id,
        this.extension,
        this.initiatorActive,
        this.receiverActive,
        this.number);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Operation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Operation withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExampleScenario_Operation(
        this.type,
        value,
        this.name,
        this.description,
        this.response,
        this.request,
        this.receiver,
        this.initiator,
        this.id,
        this.extension,
        this.initiatorActive,
        this.receiverActive,
        this.number);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Operation#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableExampleScenario_Operation(
        this.type,
        this.modifierExtension,
        newValue,
        this.description,
        this.response,
        this.request,
        this.receiver,
        this.initiator,
        this.id,
        this.extension,
        this.initiatorActive,
        this.receiverActive,
        this.number);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Operation#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableExampleScenario_Operation(
        this.type,
        this.modifierExtension,
        value,
        this.description,
        this.response,
        this.request,
        this.receiver,
        this.initiator,
        this.id,
        this.extension,
        this.initiatorActive,
        this.receiverActive,
        this.number);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Operation#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withDescription(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableExampleScenario_Operation(
        this.type,
        this.modifierExtension,
        this.name,
        newValue,
        this.response,
        this.request,
        this.receiver,
        this.initiator,
        this.id,
        this.extension,
        this.initiatorActive,
        this.receiverActive,
        this.number);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Operation#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Operation withDescription(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableExampleScenario_Operation(
        this.type,
        this.modifierExtension,
        this.name,
        value,
        this.response,
        this.request,
        this.receiver,
        this.initiator,
        this.id,
        this.extension,
        this.initiatorActive,
        this.receiverActive,
        this.number);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Operation#response() response} attribute.
   * @param value The value for response
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withResponse(com.fhir.ExampleScenario_ContainedInstance value) {
    @javax.annotation.Nullable com.fhir.ExampleScenario_ContainedInstance newValue = java.util.Objects.requireNonNull(value, "response");
    if (this.response == newValue) return this;
    return new ImmutableExampleScenario_Operation(
        this.type,
        this.modifierExtension,
        this.name,
        this.description,
        newValue,
        this.request,
        this.receiver,
        this.initiator,
        this.id,
        this.extension,
        this.initiatorActive,
        this.receiverActive,
        this.number);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Operation#response() response} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for response
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Operation withResponse(java.util.Optional<? extends com.fhir.ExampleScenario_ContainedInstance> optional) {
    @javax.annotation.Nullable com.fhir.ExampleScenario_ContainedInstance value = optional.orElse(null);
    if (this.response == value) return this;
    return new ImmutableExampleScenario_Operation(
        this.type,
        this.modifierExtension,
        this.name,
        this.description,
        value,
        this.request,
        this.receiver,
        this.initiator,
        this.id,
        this.extension,
        this.initiatorActive,
        this.receiverActive,
        this.number);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Operation#request() request} attribute.
   * @param value The value for request
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withRequest(com.fhir.ExampleScenario_ContainedInstance value) {
    @javax.annotation.Nullable com.fhir.ExampleScenario_ContainedInstance newValue = java.util.Objects.requireNonNull(value, "request");
    if (this.request == newValue) return this;
    return new ImmutableExampleScenario_Operation(
        this.type,
        this.modifierExtension,
        this.name,
        this.description,
        this.response,
        newValue,
        this.receiver,
        this.initiator,
        this.id,
        this.extension,
        this.initiatorActive,
        this.receiverActive,
        this.number);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Operation#request() request} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for request
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Operation withRequest(java.util.Optional<? extends com.fhir.ExampleScenario_ContainedInstance> optional) {
    @javax.annotation.Nullable com.fhir.ExampleScenario_ContainedInstance value = optional.orElse(null);
    if (this.request == value) return this;
    return new ImmutableExampleScenario_Operation(
        this.type,
        this.modifierExtension,
        this.name,
        this.description,
        this.response,
        value,
        this.receiver,
        this.initiator,
        this.id,
        this.extension,
        this.initiatorActive,
        this.receiverActive,
        this.number);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Operation#receiver() receiver} attribute.
   * @param value The value for receiver
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withReceiver(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "receiver");
    if (java.util.Objects.equals(this.receiver, newValue)) return this;
    return new ImmutableExampleScenario_Operation(
        this.type,
        this.modifierExtension,
        this.name,
        this.description,
        this.response,
        this.request,
        newValue,
        this.initiator,
        this.id,
        this.extension,
        this.initiatorActive,
        this.receiverActive,
        this.number);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Operation#receiver() receiver} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for receiver
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withReceiver(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.receiver, value)) return this;
    return new ImmutableExampleScenario_Operation(
        this.type,
        this.modifierExtension,
        this.name,
        this.description,
        this.response,
        this.request,
        value,
        this.initiator,
        this.id,
        this.extension,
        this.initiatorActive,
        this.receiverActive,
        this.number);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Operation#initiator() initiator} attribute.
   * @param value The value for initiator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withInitiator(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "initiator");
    if (java.util.Objects.equals(this.initiator, newValue)) return this;
    return new ImmutableExampleScenario_Operation(
        this.type,
        this.modifierExtension,
        this.name,
        this.description,
        this.response,
        this.request,
        this.receiver,
        newValue,
        this.id,
        this.extension,
        this.initiatorActive,
        this.receiverActive,
        this.number);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Operation#initiator() initiator} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for initiator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withInitiator(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.initiator, value)) return this;
    return new ImmutableExampleScenario_Operation(
        this.type,
        this.modifierExtension,
        this.name,
        this.description,
        this.response,
        this.request,
        this.receiver,
        value,
        this.id,
        this.extension,
        this.initiatorActive,
        this.receiverActive,
        this.number);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Operation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableExampleScenario_Operation(
        this.type,
        this.modifierExtension,
        this.name,
        this.description,
        this.response,
        this.request,
        this.receiver,
        this.initiator,
        newValue,
        this.extension,
        this.initiatorActive,
        this.receiverActive,
        this.number);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Operation#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableExampleScenario_Operation(
        this.type,
        this.modifierExtension,
        this.name,
        this.description,
        this.response,
        this.request,
        this.receiver,
        this.initiator,
        value,
        this.extension,
        this.initiatorActive,
        this.receiverActive,
        this.number);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Operation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExampleScenario_Operation(
        this.type,
        this.modifierExtension,
        this.name,
        this.description,
        this.response,
        this.request,
        this.receiver,
        this.initiator,
        this.id,
        newValue,
        this.initiatorActive,
        this.receiverActive,
        this.number);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Operation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Operation withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExampleScenario_Operation(
        this.type,
        this.modifierExtension,
        this.name,
        this.description,
        this.response,
        this.request,
        this.receiver,
        this.initiator,
        this.id,
        value,
        this.initiatorActive,
        this.receiverActive,
        this.number);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Operation#initiatorActive() initiatorActive} attribute.
   * @param value The value for initiatorActive
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withInitiatorActive(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.initiatorActive, newValue)) return this;
    return new ImmutableExampleScenario_Operation(
        this.type,
        this.modifierExtension,
        this.name,
        this.description,
        this.response,
        this.request,
        this.receiver,
        this.initiator,
        this.id,
        this.extension,
        newValue,
        this.receiverActive,
        this.number);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Operation#initiatorActive() initiatorActive} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for initiatorActive
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withInitiatorActive(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.initiatorActive, value)) return this;
    return new ImmutableExampleScenario_Operation(
        this.type,
        this.modifierExtension,
        this.name,
        this.description,
        this.response,
        this.request,
        this.receiver,
        this.initiator,
        this.id,
        this.extension,
        value,
        this.receiverActive,
        this.number);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Operation#receiverActive() receiverActive} attribute.
   * @param value The value for receiverActive
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withReceiverActive(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.receiverActive, newValue)) return this;
    return new ImmutableExampleScenario_Operation(
        this.type,
        this.modifierExtension,
        this.name,
        this.description,
        this.response,
        this.request,
        this.receiver,
        this.initiator,
        this.id,
        this.extension,
        this.initiatorActive,
        newValue,
        this.number);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Operation#receiverActive() receiverActive} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for receiverActive
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withReceiverActive(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.receiverActive, value)) return this;
    return new ImmutableExampleScenario_Operation(
        this.type,
        this.modifierExtension,
        this.name,
        this.description,
        this.response,
        this.request,
        this.receiver,
        this.initiator,
        this.id,
        this.extension,
        this.initiatorActive,
        value,
        this.number);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Operation#number() number} attribute.
   * @param value The value for number
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withNumber(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "number");
    if (java.util.Objects.equals(this.number, newValue)) return this;
    return new ImmutableExampleScenario_Operation(
        this.type,
        this.modifierExtension,
        this.name,
        this.description,
        this.response,
        this.request,
        this.receiver,
        this.initiator,
        this.id,
        this.extension,
        this.initiatorActive,
        this.receiverActive,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Operation#number() number} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for number
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withNumber(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.number, value)) return this;
    return new ImmutableExampleScenario_Operation(
        this.type,
        this.modifierExtension,
        this.name,
        this.description,
        this.response,
        this.request,
        this.receiver,
        this.initiator,
        this.id,
        this.extension,
        this.initiatorActive,
        this.receiverActive,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExampleScenario_Operation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExampleScenario_Operation
        && equalTo((ImmutableExampleScenario_Operation) another);
  }

  private boolean equalTo(ImmutableExampleScenario_Operation another) {
    return java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(response, another.response)
        && java.util.Objects.equals(request, another.request)
        && java.util.Objects.equals(receiver, another.receiver)
        && java.util.Objects.equals(initiator, another.initiator)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(initiatorActive, another.initiatorActive)
        && java.util.Objects.equals(receiverActive, another.receiverActive)
        && java.util.Objects.equals(number, another.number);
  }

  /**
   * Computes a hash code from attributes: {@code type}, {@code modifierExtension}, {@code name}, {@code description}, {@code response}, {@code request}, {@code receiver}, {@code initiator}, {@code id}, {@code extension}, {@code initiatorActive}, {@code receiverActive}, {@code number}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(response);
    h += (h << 5) + java.util.Objects.hashCode(request);
    h += (h << 5) + java.util.Objects.hashCode(receiver);
    h += (h << 5) + java.util.Objects.hashCode(initiator);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(initiatorActive);
    h += (h << 5) + java.util.Objects.hashCode(receiverActive);
    h += (h << 5) + java.util.Objects.hashCode(number);
    return h;
  }

  /**
   * Prints the immutable value {@code ExampleScenario_Operation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ExampleScenario_Operation{");
    if (type != null) {
      builder.append("type=").append(type);
    }
    if (modifierExtension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (name != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (description != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (response != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("response=").append(response);
    }
    if (request != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("request=").append(request);
    }
    if (receiver != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("receiver=").append(receiver);
    }
    if (initiator != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("initiator=").append(initiator);
    }
    if (id != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (initiatorActive != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("initiatorActive=").append(initiatorActive);
    }
    if (receiverActive != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("receiverActive=").append(receiverActive);
    }
    if (number != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("number=").append(number);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "ExampleScenario_Operation", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ExampleScenario_Operation {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ExampleScenario_ContainedInstance> response = java.util.Optional.empty();
    boolean responseIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ExampleScenario_ContainedInstance> request = java.util.Optional.empty();
    boolean requestIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> receiver = java.util.Optional.empty();
    boolean receiverIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> initiator = java.util.Optional.empty();
    boolean initiatorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> initiatorActive = java.util.Optional.empty();
    boolean initiatorActiveIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> receiverActive = java.util.Optional.empty();
    boolean receiverActiveIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> number = java.util.Optional.empty();
    boolean numberIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<java.lang.String> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<com.fhir.markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("response")
    public void setResponse(java.util.Optional<com.fhir.ExampleScenario_ContainedInstance> response) {
      this.response = response;
      this.responseIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("request")
    public void setRequest(java.util.Optional<com.fhir.ExampleScenario_ContainedInstance> request) {
      this.request = request;
      this.requestIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("receiver")
    public void setReceiver(java.util.Optional<java.lang.String> receiver) {
      this.receiver = receiver;
      this.receiverIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("initiator")
    public void setInitiator(java.util.Optional<java.lang.String> initiator) {
      this.initiator = initiator;
      this.initiatorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("initiatorActive")
    public void setInitiatorActive(java.util.Optional<java.lang.Boolean> initiatorActive) {
      this.initiatorActive = initiatorActive;
      this.initiatorActiveIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("receiverActive")
    public void setReceiverActive(java.util.Optional<java.lang.Boolean> receiverActive) {
      this.receiverActive = receiverActive;
      this.receiverActiveIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("number")
    public void setNumber(java.util.Optional<java.lang.String> number) {
      this.number = number;
      this.numberIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ExampleScenario_ContainedInstance> response() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ExampleScenario_ContainedInstance> request() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> receiver() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> initiator() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> initiatorActive() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> receiverActive() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> number() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableExampleScenario_Operation fromJson(Json json) {
    ImmutableExampleScenario_Operation.Builder builder = ImmutableExampleScenario_Operation.builder();
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.responseIsSet) {
      builder.response(json.response);
    }
    if (json.requestIsSet) {
      builder.request(json.request);
    }
    if (json.receiverIsSet) {
      builder.receiver(json.receiver);
    }
    if (json.initiatorIsSet) {
      builder.initiator(json.initiator);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.initiatorActiveIsSet) {
      builder.initiatorActive(json.initiatorActive);
    }
    if (json.receiverActiveIsSet) {
      builder.receiverActive(json.receiverActive);
    }
    if (json.numberIsSet) {
      builder.number(json.number);
    }
    return (ImmutableExampleScenario_Operation) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ExampleScenario_Operation} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ExampleScenario_Operation instance
   */
  public static ExampleScenario_Operation copyOf(ExampleScenario_Operation instance) {
    if (instance instanceof ImmutableExampleScenario_Operation) {
      return (ImmutableExampleScenario_Operation) instance;
    }
    return ImmutableExampleScenario_Operation.builder()
        .type(instance.type())
        .modifierExtension(instance.modifierExtension())
        .name(instance.name())
        .description(instance.description())
        .response(instance.response())
        .request(instance.request())
        .receiver(instance.receiver())
        .initiator(instance.initiator())
        .id(instance.id())
        .extension(instance.extension())
        .initiatorActive(instance.initiatorActive())
        .receiverActive(instance.receiverActive())
        .number(instance.number())
        .build();
  }

  /**
   * Creates a builder for {@link ExampleScenario_Operation ExampleScenario_Operation}.
   * <pre>
   * ImmutableExampleScenario_Operation.builder()
   *    .type(String) // optional {@link ExampleScenario_Operation#type() type}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ExampleScenario_Operation#modifierExtension() modifierExtension}
   *    .name(String) // optional {@link ExampleScenario_Operation#name() name}
   *    .description(com.fhir.markdown) // optional {@link ExampleScenario_Operation#description() description}
   *    .response(com.fhir.ExampleScenario_ContainedInstance) // optional {@link ExampleScenario_Operation#response() response}
   *    .request(com.fhir.ExampleScenario_ContainedInstance) // optional {@link ExampleScenario_Operation#request() request}
   *    .receiver(String) // optional {@link ExampleScenario_Operation#receiver() receiver}
   *    .initiator(String) // optional {@link ExampleScenario_Operation#initiator() initiator}
   *    .id(String) // optional {@link ExampleScenario_Operation#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ExampleScenario_Operation#extension() extension}
   *    .initiatorActive(Boolean) // optional {@link ExampleScenario_Operation#initiatorActive() initiatorActive}
   *    .receiverActive(Boolean) // optional {@link ExampleScenario_Operation#receiverActive() receiverActive}
   *    .number(String) // optional {@link ExampleScenario_Operation#number() number}
   *    .build();
   * </pre>
   * @return A new ExampleScenario_Operation builder
   */
  public static ImmutableExampleScenario_Operation.Builder builder() {
    return new ImmutableExampleScenario_Operation.Builder();
  }

  /**
   * Builds instances of type {@link ExampleScenario_Operation ExampleScenario_Operation}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ExampleScenario_Operation", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TYPE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_NAME = 0x4L;
    private static final long OPT_BIT_DESCRIPTION = 0x8L;
    private static final long OPT_BIT_RESPONSE = 0x10L;
    private static final long OPT_BIT_REQUEST = 0x20L;
    private static final long OPT_BIT_RECEIVER = 0x40L;
    private static final long OPT_BIT_INITIATOR = 0x80L;
    private static final long OPT_BIT_ID = 0x100L;
    private static final long OPT_BIT_EXTENSION = 0x200L;
    private static final long OPT_BIT_INITIATOR_ACTIVE = 0x400L;
    private static final long OPT_BIT_RECEIVER_ACTIVE = 0x800L;
    private static final long OPT_BIT_NUMBER = 0x1000L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String type;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable com.fhir.markdown description;
    private @javax.annotation.Nullable com.fhir.ExampleScenario_ContainedInstance response;
    private @javax.annotation.Nullable com.fhir.ExampleScenario_ContainedInstance request;
    private @javax.annotation.Nullable java.lang.String receiver;
    private @javax.annotation.Nullable java.lang.String initiator;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.lang.Boolean initiatorActive;
    private @javax.annotation.Nullable java.lang.Boolean receiverActive;
    private @javax.annotation.Nullable java.lang.String number;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(java.lang.String type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<java.lang.String> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExampleScenario_Operation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExampleScenario_Operation#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(java.lang.String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = java.util.Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public final Builder name(java.util.Optional<java.lang.String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(com.fhir.markdown description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = java.util.Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public final Builder description(java.util.Optional<? extends com.fhir.markdown> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#response() response} to response.
     * @param response The value for response
     * @return {@code this} builder for chained invocation
     */
    public final Builder response(com.fhir.ExampleScenario_ContainedInstance response) {
      checkNotIsSet(responseIsSet(), "response");
      this.response = java.util.Objects.requireNonNull(response, "response");
      optBits |= OPT_BIT_RESPONSE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#response() response} to response.
     * @param response The value for response
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("response")
    public final Builder response(java.util.Optional<? extends com.fhir.ExampleScenario_ContainedInstance> response) {
      checkNotIsSet(responseIsSet(), "response");
      this.response = response.orElse(null);
      optBits |= OPT_BIT_RESPONSE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for chained invocation
     */
    public final Builder request(com.fhir.ExampleScenario_ContainedInstance request) {
      checkNotIsSet(requestIsSet(), "request");
      this.request = java.util.Objects.requireNonNull(request, "request");
      optBits |= OPT_BIT_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("request")
    public final Builder request(java.util.Optional<? extends com.fhir.ExampleScenario_ContainedInstance> request) {
      checkNotIsSet(requestIsSet(), "request");
      this.request = request.orElse(null);
      optBits |= OPT_BIT_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#receiver() receiver} to receiver.
     * @param receiver The value for receiver
     * @return {@code this} builder for chained invocation
     */
    public final Builder receiver(java.lang.String receiver) {
      checkNotIsSet(receiverIsSet(), "receiver");
      this.receiver = java.util.Objects.requireNonNull(receiver, "receiver");
      optBits |= OPT_BIT_RECEIVER;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#receiver() receiver} to receiver.
     * @param receiver The value for receiver
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("receiver")
    public final Builder receiver(java.util.Optional<java.lang.String> receiver) {
      checkNotIsSet(receiverIsSet(), "receiver");
      this.receiver = receiver.orElse(null);
      optBits |= OPT_BIT_RECEIVER;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#initiator() initiator} to initiator.
     * @param initiator The value for initiator
     * @return {@code this} builder for chained invocation
     */
    public final Builder initiator(java.lang.String initiator) {
      checkNotIsSet(initiatorIsSet(), "initiator");
      this.initiator = java.util.Objects.requireNonNull(initiator, "initiator");
      optBits |= OPT_BIT_INITIATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#initiator() initiator} to initiator.
     * @param initiator The value for initiator
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("initiator")
    public final Builder initiator(java.util.Optional<java.lang.String> initiator) {
      checkNotIsSet(initiatorIsSet(), "initiator");
      this.initiator = initiator.orElse(null);
      optBits |= OPT_BIT_INITIATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#id() id} to id.
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
     * Initializes the optional value {@link ExampleScenario_Operation#id() id} to id.
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
     * Initializes the optional value {@link ExampleScenario_Operation#extension() extension} to extension.
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
     * Initializes the optional value {@link ExampleScenario_Operation#extension() extension} to extension.
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
     * Initializes the optional value {@link ExampleScenario_Operation#initiatorActive() initiatorActive} to initiatorActive.
     * @param initiatorActive The value for initiatorActive
     * @return {@code this} builder for chained invocation
     */
    public final Builder initiatorActive(boolean initiatorActive) {
      checkNotIsSet(initiatorActiveIsSet(), "initiatorActive");
      this.initiatorActive = initiatorActive;
      optBits |= OPT_BIT_INITIATOR_ACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#initiatorActive() initiatorActive} to initiatorActive.
     * @param initiatorActive The value for initiatorActive
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("initiatorActive")
    public final Builder initiatorActive(java.util.Optional<java.lang.Boolean> initiatorActive) {
      checkNotIsSet(initiatorActiveIsSet(), "initiatorActive");
      this.initiatorActive = initiatorActive.orElse(null);
      optBits |= OPT_BIT_INITIATOR_ACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#receiverActive() receiverActive} to receiverActive.
     * @param receiverActive The value for receiverActive
     * @return {@code this} builder for chained invocation
     */
    public final Builder receiverActive(boolean receiverActive) {
      checkNotIsSet(receiverActiveIsSet(), "receiverActive");
      this.receiverActive = receiverActive;
      optBits |= OPT_BIT_RECEIVER_ACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#receiverActive() receiverActive} to receiverActive.
     * @param receiverActive The value for receiverActive
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("receiverActive")
    public final Builder receiverActive(java.util.Optional<java.lang.Boolean> receiverActive) {
      checkNotIsSet(receiverActiveIsSet(), "receiverActive");
      this.receiverActive = receiverActive.orElse(null);
      optBits |= OPT_BIT_RECEIVER_ACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#number() number} to number.
     * @param number The value for number
     * @return {@code this} builder for chained invocation
     */
    public final Builder number(java.lang.String number) {
      checkNotIsSet(numberIsSet(), "number");
      this.number = java.util.Objects.requireNonNull(number, "number");
      optBits |= OPT_BIT_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#number() number} to number.
     * @param number The value for number
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("number")
    public final Builder number(java.util.Optional<java.lang.String> number) {
      checkNotIsSet(numberIsSet(), "number");
      this.number = number.orElse(null);
      optBits |= OPT_BIT_NUMBER;
      return this;
    }

    /**
     * Builds a new {@link ExampleScenario_Operation ExampleScenario_Operation}.
     * @return An immutable instance of ExampleScenario_Operation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ExampleScenario_Operation build() {
      return new ImmutableExampleScenario_Operation(
          type,
          modifierExtension,
          name,
          description,
          response,
          request,
          receiver,
          initiator,
          id,
          extension,
          initiatorActive,
          receiverActive,
          number);
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean responseIsSet() {
      return (optBits & OPT_BIT_RESPONSE) != 0;
    }

    private boolean requestIsSet() {
      return (optBits & OPT_BIT_REQUEST) != 0;
    }

    private boolean receiverIsSet() {
      return (optBits & OPT_BIT_RECEIVER) != 0;
    }

    private boolean initiatorIsSet() {
      return (optBits & OPT_BIT_INITIATOR) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean initiatorActiveIsSet() {
      return (optBits & OPT_BIT_INITIATOR_ACTIVE) != 0;
    }

    private boolean receiverActiveIsSet() {
      return (optBits & OPT_BIT_RECEIVER_ACTIVE) != 0;
    }

    private boolean numberIsSet() {
      return (optBits & OPT_BIT_NUMBER) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ExampleScenario_Operation is strict, attribute is already set: ".concat(name));
    }
  }
}

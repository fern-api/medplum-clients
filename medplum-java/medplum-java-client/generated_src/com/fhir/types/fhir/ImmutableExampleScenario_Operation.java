package com.fhir.types.fhir;

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
 * Immutable implementation of {@link ExampleScenario_Operation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExampleScenario_Operation.builder()}.
 */
@Generated(from = "ExampleScenario_Operation", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExampleScenario_Operation implements ExampleScenario_Operation {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String receiver;
  private final @Nullable String id;
  private final @Nullable String initiator;
  private final @Nullable ExampleScenario_ContainedInstance response;
  private final @Nullable String type;
  private final @Nullable Boolean receiverActive;
  private final @Nullable String number;
  private final @Nullable Markdown description;
  private final @Nullable Boolean initiatorActive;
  private final @Nullable String name;
  private final @Nullable ExampleScenario_ContainedInstance request;
  private final @Nullable List<Extension> extension;

  private ImmutableExampleScenario_Operation(
      @Nullable List<Extension> modifierExtension,
      @Nullable String receiver,
      @Nullable String id,
      @Nullable String initiator,
      @Nullable ExampleScenario_ContainedInstance response,
      @Nullable String type,
      @Nullable Boolean receiverActive,
      @Nullable String number,
      @Nullable Markdown description,
      @Nullable Boolean initiatorActive,
      @Nullable String name,
      @Nullable ExampleScenario_ContainedInstance request,
      @Nullable List<Extension> extension) {
    this.modifierExtension = modifierExtension;
    this.receiver = receiver;
    this.id = id;
    this.initiator = initiator;
    this.response = response;
    this.type = type;
    this.receiverActive = receiverActive;
    this.number = number;
    this.description = description;
    this.initiatorActive = initiatorActive;
    this.name = name;
    this.request = request;
    this.extension = extension;
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
   * @return The value of the {@code receiver} attribute
   */
  @JsonProperty("receiver")
  @Override
  public Optional<String> receiver() {
    return Optional.ofNullable(receiver);
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
   * @return The value of the {@code initiator} attribute
   */
  @JsonProperty("initiator")
  @Override
  public Optional<String> initiator() {
    return Optional.ofNullable(initiator);
  }

  /**
   * @return The value of the {@code response} attribute
   */
  @JsonProperty("response")
  @Override
  public Optional<ExampleScenario_ContainedInstance> response() {
    return Optional.ofNullable(response);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<String> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code receiverActive} attribute
   */
  @JsonProperty("receiverActive")
  @Override
  public Optional<Boolean> receiverActive() {
    return Optional.ofNullable(receiverActive);
  }

  /**
   * @return The value of the {@code number} attribute
   */
  @JsonProperty("number")
  @Override
  public Optional<String> number() {
    return Optional.ofNullable(number);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<Markdown> description() {
    return Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code initiatorActive} attribute
   */
  @JsonProperty("initiatorActive")
  @Override
  public Optional<Boolean> initiatorActive() {
    return Optional.ofNullable(initiatorActive);
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code request} attribute
   */
  @JsonProperty("request")
  @Override
  public Optional<ExampleScenario_ContainedInstance> request() {
    return Optional.ofNullable(request);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Operation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExampleScenario_Operation(
        newValue,
        this.receiver,
        this.id,
        this.initiator,
        this.response,
        this.type,
        this.receiverActive,
        this.number,
        this.description,
        this.initiatorActive,
        this.name,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Operation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Operation withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExampleScenario_Operation(
        value,
        this.receiver,
        this.id,
        this.initiator,
        this.response,
        this.type,
        this.receiverActive,
        this.number,
        this.description,
        this.initiatorActive,
        this.name,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Operation#receiver() receiver} attribute.
   * @param value The value for receiver
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withReceiver(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "receiver");
    if (Objects.equals(this.receiver, newValue)) return this;
    return new ImmutableExampleScenario_Operation(
        this.modifierExtension,
        newValue,
        this.id,
        this.initiator,
        this.response,
        this.type,
        this.receiverActive,
        this.number,
        this.description,
        this.initiatorActive,
        this.name,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Operation#receiver() receiver} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for receiver
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withReceiver(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.receiver, value)) return this;
    return new ImmutableExampleScenario_Operation(
        this.modifierExtension,
        value,
        this.id,
        this.initiator,
        this.response,
        this.type,
        this.receiverActive,
        this.number,
        this.description,
        this.initiatorActive,
        this.name,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Operation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableExampleScenario_Operation(
        this.modifierExtension,
        this.receiver,
        newValue,
        this.initiator,
        this.response,
        this.type,
        this.receiverActive,
        this.number,
        this.description,
        this.initiatorActive,
        this.name,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Operation#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableExampleScenario_Operation(
        this.modifierExtension,
        this.receiver,
        value,
        this.initiator,
        this.response,
        this.type,
        this.receiverActive,
        this.number,
        this.description,
        this.initiatorActive,
        this.name,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Operation#initiator() initiator} attribute.
   * @param value The value for initiator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withInitiator(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "initiator");
    if (Objects.equals(this.initiator, newValue)) return this;
    return new ImmutableExampleScenario_Operation(
        this.modifierExtension,
        this.receiver,
        this.id,
        newValue,
        this.response,
        this.type,
        this.receiverActive,
        this.number,
        this.description,
        this.initiatorActive,
        this.name,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Operation#initiator() initiator} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for initiator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withInitiator(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.initiator, value)) return this;
    return new ImmutableExampleScenario_Operation(
        this.modifierExtension,
        this.receiver,
        this.id,
        value,
        this.response,
        this.type,
        this.receiverActive,
        this.number,
        this.description,
        this.initiatorActive,
        this.name,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Operation#response() response} attribute.
   * @param value The value for response
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withResponse(ExampleScenario_ContainedInstance value) {
    @Nullable ExampleScenario_ContainedInstance newValue = Objects.requireNonNull(value, "response");
    if (this.response == newValue) return this;
    return new ImmutableExampleScenario_Operation(
        this.modifierExtension,
        this.receiver,
        this.id,
        this.initiator,
        newValue,
        this.type,
        this.receiverActive,
        this.number,
        this.description,
        this.initiatorActive,
        this.name,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Operation#response() response} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for response
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Operation withResponse(Optional<? extends ExampleScenario_ContainedInstance> optional) {
    @Nullable ExampleScenario_ContainedInstance value = optional.orElse(null);
    if (this.response == value) return this;
    return new ImmutableExampleScenario_Operation(
        this.modifierExtension,
        this.receiver,
        this.id,
        this.initiator,
        value,
        this.type,
        this.receiverActive,
        this.number,
        this.description,
        this.initiatorActive,
        this.name,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Operation#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withType(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "type");
    if (Objects.equals(this.type, newValue)) return this;
    return new ImmutableExampleScenario_Operation(
        this.modifierExtension,
        this.receiver,
        this.id,
        this.initiator,
        this.response,
        newValue,
        this.receiverActive,
        this.number,
        this.description,
        this.initiatorActive,
        this.name,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Operation#type() type} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withType(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.type, value)) return this;
    return new ImmutableExampleScenario_Operation(
        this.modifierExtension,
        this.receiver,
        this.id,
        this.initiator,
        this.response,
        value,
        this.receiverActive,
        this.number,
        this.description,
        this.initiatorActive,
        this.name,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Operation#receiverActive() receiverActive} attribute.
   * @param value The value for receiverActive
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withReceiverActive(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.receiverActive, newValue)) return this;
    return new ImmutableExampleScenario_Operation(
        this.modifierExtension,
        this.receiver,
        this.id,
        this.initiator,
        this.response,
        this.type,
        newValue,
        this.number,
        this.description,
        this.initiatorActive,
        this.name,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Operation#receiverActive() receiverActive} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for receiverActive
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withReceiverActive(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.receiverActive, value)) return this;
    return new ImmutableExampleScenario_Operation(
        this.modifierExtension,
        this.receiver,
        this.id,
        this.initiator,
        this.response,
        this.type,
        value,
        this.number,
        this.description,
        this.initiatorActive,
        this.name,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Operation#number() number} attribute.
   * @param value The value for number
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withNumber(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "number");
    if (Objects.equals(this.number, newValue)) return this;
    return new ImmutableExampleScenario_Operation(
        this.modifierExtension,
        this.receiver,
        this.id,
        this.initiator,
        this.response,
        this.type,
        this.receiverActive,
        newValue,
        this.description,
        this.initiatorActive,
        this.name,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Operation#number() number} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for number
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withNumber(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.number, value)) return this;
    return new ImmutableExampleScenario_Operation(
        this.modifierExtension,
        this.receiver,
        this.id,
        this.initiator,
        this.response,
        this.type,
        this.receiverActive,
        value,
        this.description,
        this.initiatorActive,
        this.name,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Operation#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withDescription(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableExampleScenario_Operation(
        this.modifierExtension,
        this.receiver,
        this.id,
        this.initiator,
        this.response,
        this.type,
        this.receiverActive,
        this.number,
        newValue,
        this.initiatorActive,
        this.name,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Operation#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Operation withDescription(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableExampleScenario_Operation(
        this.modifierExtension,
        this.receiver,
        this.id,
        this.initiator,
        this.response,
        this.type,
        this.receiverActive,
        this.number,
        value,
        this.initiatorActive,
        this.name,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Operation#initiatorActive() initiatorActive} attribute.
   * @param value The value for initiatorActive
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withInitiatorActive(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.initiatorActive, newValue)) return this;
    return new ImmutableExampleScenario_Operation(
        this.modifierExtension,
        this.receiver,
        this.id,
        this.initiator,
        this.response,
        this.type,
        this.receiverActive,
        this.number,
        this.description,
        newValue,
        this.name,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Operation#initiatorActive() initiatorActive} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for initiatorActive
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withInitiatorActive(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.initiatorActive, value)) return this;
    return new ImmutableExampleScenario_Operation(
        this.modifierExtension,
        this.receiver,
        this.id,
        this.initiator,
        this.response,
        this.type,
        this.receiverActive,
        this.number,
        this.description,
        value,
        this.name,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Operation#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableExampleScenario_Operation(
        this.modifierExtension,
        this.receiver,
        this.id,
        this.initiator,
        this.response,
        this.type,
        this.receiverActive,
        this.number,
        this.description,
        this.initiatorActive,
        newValue,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Operation#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableExampleScenario_Operation(
        this.modifierExtension,
        this.receiver,
        this.id,
        this.initiator,
        this.response,
        this.type,
        this.receiverActive,
        this.number,
        this.description,
        this.initiatorActive,
        value,
        this.request,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Operation#request() request} attribute.
   * @param value The value for request
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withRequest(ExampleScenario_ContainedInstance value) {
    @Nullable ExampleScenario_ContainedInstance newValue = Objects.requireNonNull(value, "request");
    if (this.request == newValue) return this;
    return new ImmutableExampleScenario_Operation(
        this.modifierExtension,
        this.receiver,
        this.id,
        this.initiator,
        this.response,
        this.type,
        this.receiverActive,
        this.number,
        this.description,
        this.initiatorActive,
        this.name,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Operation#request() request} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for request
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Operation withRequest(Optional<? extends ExampleScenario_ContainedInstance> optional) {
    @Nullable ExampleScenario_ContainedInstance value = optional.orElse(null);
    if (this.request == value) return this;
    return new ImmutableExampleScenario_Operation(
        this.modifierExtension,
        this.receiver,
        this.id,
        this.initiator,
        this.response,
        this.type,
        this.receiverActive,
        this.number,
        this.description,
        this.initiatorActive,
        this.name,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Operation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Operation withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExampleScenario_Operation(
        this.modifierExtension,
        this.receiver,
        this.id,
        this.initiator,
        this.response,
        this.type,
        this.receiverActive,
        this.number,
        this.description,
        this.initiatorActive,
        this.name,
        this.request,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Operation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Operation withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExampleScenario_Operation(
        this.modifierExtension,
        this.receiver,
        this.id,
        this.initiator,
        this.response,
        this.type,
        this.receiverActive,
        this.number,
        this.description,
        this.initiatorActive,
        this.name,
        this.request,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExampleScenario_Operation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExampleScenario_Operation
        && equalTo((ImmutableExampleScenario_Operation) another);
  }

  private boolean equalTo(ImmutableExampleScenario_Operation another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(receiver, another.receiver)
        && Objects.equals(id, another.id)
        && Objects.equals(initiator, another.initiator)
        && Objects.equals(response, another.response)
        && Objects.equals(type, another.type)
        && Objects.equals(receiverActive, another.receiverActive)
        && Objects.equals(number, another.number)
        && Objects.equals(description, another.description)
        && Objects.equals(initiatorActive, another.initiatorActive)
        && Objects.equals(name, another.name)
        && Objects.equals(request, another.request)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code receiver}, {@code id}, {@code initiator}, {@code response}, {@code type}, {@code receiverActive}, {@code number}, {@code description}, {@code initiatorActive}, {@code name}, {@code request}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(receiver);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(initiator);
    h += (h << 5) + Objects.hashCode(response);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(receiverActive);
    h += (h << 5) + Objects.hashCode(number);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(initiatorActive);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(request);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code ExampleScenario_Operation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ExampleScenario_Operation{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (receiver != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("receiver=").append(receiver);
    }
    if (id != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (initiator != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("initiator=").append(initiator);
    }
    if (response != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("response=").append(response);
    }
    if (type != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (receiverActive != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("receiverActive=").append(receiverActive);
    }
    if (number != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("number=").append(number);
    }
    if (description != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (initiatorActive != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("initiatorActive=").append(initiatorActive);
    }
    if (name != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (request != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("request=").append(request);
    }
    if (extension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ExampleScenario_Operation", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ExampleScenario_Operation {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> receiver = Optional.empty();
    boolean receiverIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> initiator = Optional.empty();
    boolean initiatorIsSet;
    @Nullable Optional<ExampleScenario_ContainedInstance> response = Optional.empty();
    boolean responseIsSet;
    @Nullable Optional<String> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<Boolean> receiverActive = Optional.empty();
    boolean receiverActiveIsSet;
    @Nullable Optional<String> number = Optional.empty();
    boolean numberIsSet;
    @Nullable Optional<Markdown> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<Boolean> initiatorActive = Optional.empty();
    boolean initiatorActiveIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<ExampleScenario_ContainedInstance> request = Optional.empty();
    boolean requestIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("receiver")
    public void setReceiver(Optional<String> receiver) {
      this.receiver = receiver;
      this.receiverIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("initiator")
    public void setInitiator(Optional<String> initiator) {
      this.initiator = initiator;
      this.initiatorIsSet = true;
    }
    @JsonProperty("response")
    public void setResponse(Optional<ExampleScenario_ContainedInstance> response) {
      this.response = response;
      this.responseIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<String> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("receiverActive")
    public void setReceiverActive(Optional<Boolean> receiverActive) {
      this.receiverActive = receiverActive;
      this.receiverActiveIsSet = true;
    }
    @JsonProperty("number")
    public void setNumber(Optional<String> number) {
      this.number = number;
      this.numberIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<Markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("initiatorActive")
    public void setInitiatorActive(Optional<Boolean> initiatorActive) {
      this.initiatorActive = initiatorActive;
      this.initiatorActiveIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("request")
    public void setRequest(Optional<ExampleScenario_ContainedInstance> request) {
      this.request = request;
      this.requestIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> receiver() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> initiator() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ExampleScenario_ContainedInstance> response() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> receiverActive() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> number() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> initiatorActive() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ExampleScenario_ContainedInstance> request() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableExampleScenario_Operation fromJson(Json json) {
    ImmutableExampleScenario_Operation.Builder builder = ImmutableExampleScenario_Operation.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.receiverIsSet) {
      builder.receiver(json.receiver);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.initiatorIsSet) {
      builder.initiator(json.initiator);
    }
    if (json.responseIsSet) {
      builder.response(json.response);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.receiverActiveIsSet) {
      builder.receiverActive(json.receiverActive);
    }
    if (json.numberIsSet) {
      builder.number(json.number);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.initiatorActiveIsSet) {
      builder.initiatorActive(json.initiatorActive);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.requestIsSet) {
      builder.request(json.request);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
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
        .modifierExtension(instance.modifierExtension())
        .receiver(instance.receiver())
        .id(instance.id())
        .initiator(instance.initiator())
        .response(instance.response())
        .type(instance.type())
        .receiverActive(instance.receiverActive())
        .number(instance.number())
        .description(instance.description())
        .initiatorActive(instance.initiatorActive())
        .name(instance.name())
        .request(instance.request())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link ExampleScenario_Operation ExampleScenario_Operation}.
   * <pre>
   * ImmutableExampleScenario_Operation.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExampleScenario_Operation#modifierExtension() modifierExtension}
   *    .receiver(String) // optional {@link ExampleScenario_Operation#receiver() receiver}
   *    .id(String) // optional {@link ExampleScenario_Operation#id() id}
   *    .initiator(String) // optional {@link ExampleScenario_Operation#initiator() initiator}
   *    .response(com.fhir.types.fhir.ExampleScenario_ContainedInstance) // optional {@link ExampleScenario_Operation#response() response}
   *    .type(String) // optional {@link ExampleScenario_Operation#type() type}
   *    .receiverActive(Boolean) // optional {@link ExampleScenario_Operation#receiverActive() receiverActive}
   *    .number(String) // optional {@link ExampleScenario_Operation#number() number}
   *    .description(com.fhir.types.fhir.Markdown) // optional {@link ExampleScenario_Operation#description() description}
   *    .initiatorActive(Boolean) // optional {@link ExampleScenario_Operation#initiatorActive() initiatorActive}
   *    .name(String) // optional {@link ExampleScenario_Operation#name() name}
   *    .request(com.fhir.types.fhir.ExampleScenario_ContainedInstance) // optional {@link ExampleScenario_Operation#request() request}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExampleScenario_Operation#extension() extension}
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
  @Generated(from = "ExampleScenario_Operation", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_RECEIVER = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_INITIATOR = 0x8L;
    private static final long OPT_BIT_RESPONSE = 0x10L;
    private static final long OPT_BIT_TYPE = 0x20L;
    private static final long OPT_BIT_RECEIVER_ACTIVE = 0x40L;
    private static final long OPT_BIT_NUMBER = 0x80L;
    private static final long OPT_BIT_DESCRIPTION = 0x100L;
    private static final long OPT_BIT_INITIATOR_ACTIVE = 0x200L;
    private static final long OPT_BIT_NAME = 0x400L;
    private static final long OPT_BIT_REQUEST = 0x800L;
    private static final long OPT_BIT_EXTENSION = 0x1000L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable String receiver;
    private @Nullable String id;
    private @Nullable String initiator;
    private @Nullable ExampleScenario_ContainedInstance response;
    private @Nullable String type;
    private @Nullable Boolean receiverActive;
    private @Nullable String number;
    private @Nullable Markdown description;
    private @Nullable Boolean initiatorActive;
    private @Nullable String name;
    private @Nullable ExampleScenario_ContainedInstance request;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExampleScenario_Operation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExampleScenario_Operation#receiver() receiver} to receiver.
     * @param receiver The value for receiver
     * @return {@code this} builder for chained invocation
     */
    public final Builder receiver(String receiver) {
      checkNotIsSet(receiverIsSet(), "receiver");
      this.receiver = Objects.requireNonNull(receiver, "receiver");
      optBits |= OPT_BIT_RECEIVER;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#receiver() receiver} to receiver.
     * @param receiver The value for receiver
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("receiver")
    public final Builder receiver(Optional<String> receiver) {
      checkNotIsSet(receiverIsSet(), "receiver");
      this.receiver = receiver.orElse(null);
      optBits |= OPT_BIT_RECEIVER;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#id() id} to id.
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
     * Initializes the optional value {@link ExampleScenario_Operation#id() id} to id.
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
     * Initializes the optional value {@link ExampleScenario_Operation#initiator() initiator} to initiator.
     * @param initiator The value for initiator
     * @return {@code this} builder for chained invocation
     */
    public final Builder initiator(String initiator) {
      checkNotIsSet(initiatorIsSet(), "initiator");
      this.initiator = Objects.requireNonNull(initiator, "initiator");
      optBits |= OPT_BIT_INITIATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#initiator() initiator} to initiator.
     * @param initiator The value for initiator
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("initiator")
    public final Builder initiator(Optional<String> initiator) {
      checkNotIsSet(initiatorIsSet(), "initiator");
      this.initiator = initiator.orElse(null);
      optBits |= OPT_BIT_INITIATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#response() response} to response.
     * @param response The value for response
     * @return {@code this} builder for chained invocation
     */
    public final Builder response(ExampleScenario_ContainedInstance response) {
      checkNotIsSet(responseIsSet(), "response");
      this.response = Objects.requireNonNull(response, "response");
      optBits |= OPT_BIT_RESPONSE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#response() response} to response.
     * @param response The value for response
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("response")
    public final Builder response(Optional<? extends ExampleScenario_ContainedInstance> response) {
      checkNotIsSet(responseIsSet(), "response");
      this.response = response.orElse(null);
      optBits |= OPT_BIT_RESPONSE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(String type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<String> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
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
    @JsonProperty("receiverActive")
    public final Builder receiverActive(Optional<Boolean> receiverActive) {
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
    public final Builder number(String number) {
      checkNotIsSet(numberIsSet(), "number");
      this.number = Objects.requireNonNull(number, "number");
      optBits |= OPT_BIT_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#number() number} to number.
     * @param number The value for number
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("number")
    public final Builder number(Optional<String> number) {
      checkNotIsSet(numberIsSet(), "number");
      this.number = number.orElse(null);
      optBits |= OPT_BIT_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(Markdown description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<? extends Markdown> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
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
    @JsonProperty("initiatorActive")
    public final Builder initiatorActive(Optional<Boolean> initiatorActive) {
      checkNotIsSet(initiatorActiveIsSet(), "initiatorActive");
      this.initiatorActive = initiatorActive.orElse(null);
      optBits |= OPT_BIT_INITIATOR_ACTIVE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for chained invocation
     */
    public final Builder request(ExampleScenario_ContainedInstance request) {
      checkNotIsSet(requestIsSet(), "request");
      this.request = Objects.requireNonNull(request, "request");
      optBits |= OPT_BIT_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("request")
    public final Builder request(Optional<? extends ExampleScenario_ContainedInstance> request) {
      checkNotIsSet(requestIsSet(), "request");
      this.request = request.orElse(null);
      optBits |= OPT_BIT_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Operation#extension() extension} to extension.
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
     * Initializes the optional value {@link ExampleScenario_Operation#extension() extension} to extension.
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
     * Builds a new {@link ExampleScenario_Operation ExampleScenario_Operation}.
     * @return An immutable instance of ExampleScenario_Operation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ExampleScenario_Operation build() {
      return new ImmutableExampleScenario_Operation(
          modifierExtension,
          receiver,
          id,
          initiator,
          response,
          type,
          receiverActive,
          number,
          description,
          initiatorActive,
          name,
          request,
          extension);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean receiverIsSet() {
      return (optBits & OPT_BIT_RECEIVER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean initiatorIsSet() {
      return (optBits & OPT_BIT_INITIATOR) != 0;
    }

    private boolean responseIsSet() {
      return (optBits & OPT_BIT_RESPONSE) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean receiverActiveIsSet() {
      return (optBits & OPT_BIT_RECEIVER_ACTIVE) != 0;
    }

    private boolean numberIsSet() {
      return (optBits & OPT_BIT_NUMBER) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean initiatorActiveIsSet() {
      return (optBits & OPT_BIT_INITIATOR_ACTIVE) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean requestIsSet() {
      return (optBits & OPT_BIT_REQUEST) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ExampleScenario_Operation is strict, attribute is already set: ".concat(name));
    }
  }
}

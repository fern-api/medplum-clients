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
 * Immutable implementation of {@link VerificationResult_PrimarySource}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableVerificationResult_PrimarySource.builder()}.
 */
@Generated(from = "VerificationResult_PrimarySource", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableVerificationResult_PrimarySource
    implements VerificationResult_PrimarySource {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<CodeableConcept> communicationMethod;
  private final @Nullable List<CodeableConcept> pushTypeAvailable;
  private final @Nullable CodeableConcept validationStatus;
  private final @Nullable DateTime validationDate;
  private final @Nullable List<Extension> extension;
  private final @Nullable Reference who;
  private final @Nullable String id;
  private final @Nullable List<CodeableConcept> type;
  private final @Nullable CodeableConcept canPushUpdates;

  private ImmutableVerificationResult_PrimarySource(
      @Nullable List<Extension> modifierExtension,
      @Nullable List<CodeableConcept> communicationMethod,
      @Nullable List<CodeableConcept> pushTypeAvailable,
      @Nullable CodeableConcept validationStatus,
      @Nullable DateTime validationDate,
      @Nullable List<Extension> extension,
      @Nullable Reference who,
      @Nullable String id,
      @Nullable List<CodeableConcept> type,
      @Nullable CodeableConcept canPushUpdates) {
    this.modifierExtension = modifierExtension;
    this.communicationMethod = communicationMethod;
    this.pushTypeAvailable = pushTypeAvailable;
    this.validationStatus = validationStatus;
    this.validationDate = validationDate;
    this.extension = extension;
    this.who = who;
    this.id = id;
    this.type = type;
    this.canPushUpdates = canPushUpdates;
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
   * @return The value of the {@code communicationMethod} attribute
   */
  @JsonProperty("communicationMethod")
  @Override
  public Optional<List<CodeableConcept>> communicationMethod() {
    return Optional.ofNullable(communicationMethod);
  }

  /**
   * @return The value of the {@code pushTypeAvailable} attribute
   */
  @JsonProperty("pushTypeAvailable")
  @Override
  public Optional<List<CodeableConcept>> pushTypeAvailable() {
    return Optional.ofNullable(pushTypeAvailable);
  }

  /**
   * @return The value of the {@code validationStatus} attribute
   */
  @JsonProperty("validationStatus")
  @Override
  public Optional<CodeableConcept> validationStatus() {
    return Optional.ofNullable(validationStatus);
  }

  /**
   * @return The value of the {@code validationDate} attribute
   */
  @JsonProperty("validationDate")
  @Override
  public Optional<DateTime> validationDate() {
    return Optional.ofNullable(validationDate);
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
   * @return The value of the {@code who} attribute
   */
  @JsonProperty("who")
  @Override
  public Optional<Reference> who() {
    return Optional.ofNullable(who);
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
  public Optional<List<CodeableConcept>> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code canPushUpdates} attribute
   */
  @JsonProperty("canPushUpdates")
  @Override
  public Optional<CodeableConcept> canPushUpdates() {
    return Optional.ofNullable(canPushUpdates);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_PrimarySource#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_PrimarySource withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableVerificationResult_PrimarySource(
        newValue,
        this.communicationMethod,
        this.pushTypeAvailable,
        this.validationStatus,
        this.validationDate,
        this.extension,
        this.who,
        this.id,
        this.type,
        this.canPushUpdates);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_PrimarySource#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_PrimarySource withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableVerificationResult_PrimarySource(
        value,
        this.communicationMethod,
        this.pushTypeAvailable,
        this.validationStatus,
        this.validationDate,
        this.extension,
        this.who,
        this.id,
        this.type,
        this.canPushUpdates);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_PrimarySource#communicationMethod() communicationMethod} attribute.
   * @param value The value for communicationMethod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_PrimarySource withCommunicationMethod(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "communicationMethod");
    if (this.communicationMethod == newValue) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.modifierExtension,
        newValue,
        this.pushTypeAvailable,
        this.validationStatus,
        this.validationDate,
        this.extension,
        this.who,
        this.id,
        this.type,
        this.canPushUpdates);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_PrimarySource#communicationMethod() communicationMethod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for communicationMethod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_PrimarySource withCommunicationMethod(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.communicationMethod == value) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.modifierExtension,
        value,
        this.pushTypeAvailable,
        this.validationStatus,
        this.validationDate,
        this.extension,
        this.who,
        this.id,
        this.type,
        this.canPushUpdates);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_PrimarySource#pushTypeAvailable() pushTypeAvailable} attribute.
   * @param value The value for pushTypeAvailable
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_PrimarySource withPushTypeAvailable(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "pushTypeAvailable");
    if (this.pushTypeAvailable == newValue) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.modifierExtension,
        this.communicationMethod,
        newValue,
        this.validationStatus,
        this.validationDate,
        this.extension,
        this.who,
        this.id,
        this.type,
        this.canPushUpdates);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_PrimarySource#pushTypeAvailable() pushTypeAvailable} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for pushTypeAvailable
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_PrimarySource withPushTypeAvailable(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.pushTypeAvailable == value) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.modifierExtension,
        this.communicationMethod,
        value,
        this.validationStatus,
        this.validationDate,
        this.extension,
        this.who,
        this.id,
        this.type,
        this.canPushUpdates);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_PrimarySource#validationStatus() validationStatus} attribute.
   * @param value The value for validationStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_PrimarySource withValidationStatus(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "validationStatus");
    if (this.validationStatus == newValue) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.modifierExtension,
        this.communicationMethod,
        this.pushTypeAvailable,
        newValue,
        this.validationDate,
        this.extension,
        this.who,
        this.id,
        this.type,
        this.canPushUpdates);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_PrimarySource#validationStatus() validationStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for validationStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_PrimarySource withValidationStatus(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.validationStatus == value) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.modifierExtension,
        this.communicationMethod,
        this.pushTypeAvailable,
        value,
        this.validationDate,
        this.extension,
        this.who,
        this.id,
        this.type,
        this.canPushUpdates);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_PrimarySource#validationDate() validationDate} attribute.
   * @param value The value for validationDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_PrimarySource withValidationDate(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "validationDate");
    if (this.validationDate == newValue) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.modifierExtension,
        this.communicationMethod,
        this.pushTypeAvailable,
        this.validationStatus,
        newValue,
        this.extension,
        this.who,
        this.id,
        this.type,
        this.canPushUpdates);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_PrimarySource#validationDate() validationDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for validationDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_PrimarySource withValidationDate(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.validationDate == value) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.modifierExtension,
        this.communicationMethod,
        this.pushTypeAvailable,
        this.validationStatus,
        value,
        this.extension,
        this.who,
        this.id,
        this.type,
        this.canPushUpdates);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_PrimarySource#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_PrimarySource withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.modifierExtension,
        this.communicationMethod,
        this.pushTypeAvailable,
        this.validationStatus,
        this.validationDate,
        newValue,
        this.who,
        this.id,
        this.type,
        this.canPushUpdates);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_PrimarySource#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_PrimarySource withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.modifierExtension,
        this.communicationMethod,
        this.pushTypeAvailable,
        this.validationStatus,
        this.validationDate,
        value,
        this.who,
        this.id,
        this.type,
        this.canPushUpdates);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_PrimarySource#who() who} attribute.
   * @param value The value for who
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_PrimarySource withWho(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "who");
    if (this.who == newValue) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.modifierExtension,
        this.communicationMethod,
        this.pushTypeAvailable,
        this.validationStatus,
        this.validationDate,
        this.extension,
        newValue,
        this.id,
        this.type,
        this.canPushUpdates);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_PrimarySource#who() who} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for who
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_PrimarySource withWho(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.who == value) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.modifierExtension,
        this.communicationMethod,
        this.pushTypeAvailable,
        this.validationStatus,
        this.validationDate,
        this.extension,
        value,
        this.id,
        this.type,
        this.canPushUpdates);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_PrimarySource#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_PrimarySource withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.modifierExtension,
        this.communicationMethod,
        this.pushTypeAvailable,
        this.validationStatus,
        this.validationDate,
        this.extension,
        this.who,
        newValue,
        this.type,
        this.canPushUpdates);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_PrimarySource#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_PrimarySource withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.modifierExtension,
        this.communicationMethod,
        this.pushTypeAvailable,
        this.validationStatus,
        this.validationDate,
        this.extension,
        this.who,
        value,
        this.type,
        this.canPushUpdates);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_PrimarySource#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_PrimarySource withType(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.modifierExtension,
        this.communicationMethod,
        this.pushTypeAvailable,
        this.validationStatus,
        this.validationDate,
        this.extension,
        this.who,
        this.id,
        newValue,
        this.canPushUpdates);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_PrimarySource#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_PrimarySource withType(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.modifierExtension,
        this.communicationMethod,
        this.pushTypeAvailable,
        this.validationStatus,
        this.validationDate,
        this.extension,
        this.who,
        this.id,
        value,
        this.canPushUpdates);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_PrimarySource#canPushUpdates() canPushUpdates} attribute.
   * @param value The value for canPushUpdates
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_PrimarySource withCanPushUpdates(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "canPushUpdates");
    if (this.canPushUpdates == newValue) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.modifierExtension,
        this.communicationMethod,
        this.pushTypeAvailable,
        this.validationStatus,
        this.validationDate,
        this.extension,
        this.who,
        this.id,
        this.type,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_PrimarySource#canPushUpdates() canPushUpdates} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for canPushUpdates
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_PrimarySource withCanPushUpdates(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.canPushUpdates == value) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.modifierExtension,
        this.communicationMethod,
        this.pushTypeAvailable,
        this.validationStatus,
        this.validationDate,
        this.extension,
        this.who,
        this.id,
        this.type,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableVerificationResult_PrimarySource} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableVerificationResult_PrimarySource
        && equalTo((ImmutableVerificationResult_PrimarySource) another);
  }

  private boolean equalTo(ImmutableVerificationResult_PrimarySource another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(communicationMethod, another.communicationMethod)
        && Objects.equals(pushTypeAvailable, another.pushTypeAvailable)
        && Objects.equals(validationStatus, another.validationStatus)
        && Objects.equals(validationDate, another.validationDate)
        && Objects.equals(extension, another.extension)
        && Objects.equals(who, another.who)
        && Objects.equals(id, another.id)
        && Objects.equals(type, another.type)
        && Objects.equals(canPushUpdates, another.canPushUpdates);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code communicationMethod}, {@code pushTypeAvailable}, {@code validationStatus}, {@code validationDate}, {@code extension}, {@code who}, {@code id}, {@code type}, {@code canPushUpdates}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(communicationMethod);
    h += (h << 5) + Objects.hashCode(pushTypeAvailable);
    h += (h << 5) + Objects.hashCode(validationStatus);
    h += (h << 5) + Objects.hashCode(validationDate);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(who);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(canPushUpdates);
    return h;
  }

  /**
   * Prints the immutable value {@code VerificationResult_PrimarySource} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("VerificationResult_PrimarySource{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (communicationMethod != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("communicationMethod=").append(communicationMethod);
    }
    if (pushTypeAvailable != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("pushTypeAvailable=").append(pushTypeAvailable);
    }
    if (validationStatus != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("validationStatus=").append(validationStatus);
    }
    if (validationDate != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("validationDate=").append(validationDate);
    }
    if (extension != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (who != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("who=").append(who);
    }
    if (id != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (type != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (canPushUpdates != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("canPushUpdates=").append(canPushUpdates);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "VerificationResult_PrimarySource", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements VerificationResult_PrimarySource {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<CodeableConcept>> communicationMethod = Optional.empty();
    boolean communicationMethodIsSet;
    @Nullable Optional<List<CodeableConcept>> pushTypeAvailable = Optional.empty();
    boolean pushTypeAvailableIsSet;
    @Nullable Optional<CodeableConcept> validationStatus = Optional.empty();
    boolean validationStatusIsSet;
    @Nullable Optional<DateTime> validationDate = Optional.empty();
    boolean validationDateIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Reference> who = Optional.empty();
    boolean whoIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<CodeableConcept>> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<CodeableConcept> canPushUpdates = Optional.empty();
    boolean canPushUpdatesIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("communicationMethod")
    public void setCommunicationMethod(Optional<List<CodeableConcept>> communicationMethod) {
      this.communicationMethod = communicationMethod;
      this.communicationMethodIsSet = true;
    }
    @JsonProperty("pushTypeAvailable")
    public void setPushTypeAvailable(Optional<List<CodeableConcept>> pushTypeAvailable) {
      this.pushTypeAvailable = pushTypeAvailable;
      this.pushTypeAvailableIsSet = true;
    }
    @JsonProperty("validationStatus")
    public void setValidationStatus(Optional<CodeableConcept> validationStatus) {
      this.validationStatus = validationStatus;
      this.validationStatusIsSet = true;
    }
    @JsonProperty("validationDate")
    public void setValidationDate(Optional<DateTime> validationDate) {
      this.validationDate = validationDate;
      this.validationDateIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("who")
    public void setWho(Optional<Reference> who) {
      this.who = who;
      this.whoIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<List<CodeableConcept>> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("canPushUpdates")
    public void setCanPushUpdates(Optional<CodeableConcept> canPushUpdates) {
      this.canPushUpdates = canPushUpdates;
      this.canPushUpdatesIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> communicationMethod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> pushTypeAvailable() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> validationStatus() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> validationDate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> who() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> canPushUpdates() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableVerificationResult_PrimarySource fromJson(Json json) {
    ImmutableVerificationResult_PrimarySource.Builder builder = ImmutableVerificationResult_PrimarySource.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.communicationMethodIsSet) {
      builder.communicationMethod(json.communicationMethod);
    }
    if (json.pushTypeAvailableIsSet) {
      builder.pushTypeAvailable(json.pushTypeAvailable);
    }
    if (json.validationStatusIsSet) {
      builder.validationStatus(json.validationStatus);
    }
    if (json.validationDateIsSet) {
      builder.validationDate(json.validationDate);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.whoIsSet) {
      builder.who(json.who);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.canPushUpdatesIsSet) {
      builder.canPushUpdates(json.canPushUpdates);
    }
    return (ImmutableVerificationResult_PrimarySource) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link VerificationResult_PrimarySource} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable VerificationResult_PrimarySource instance
   */
  public static VerificationResult_PrimarySource copyOf(VerificationResult_PrimarySource instance) {
    if (instance instanceof ImmutableVerificationResult_PrimarySource) {
      return (ImmutableVerificationResult_PrimarySource) instance;
    }
    return ImmutableVerificationResult_PrimarySource.builder()
        .modifierExtension(instance.modifierExtension())
        .communicationMethod(instance.communicationMethod())
        .pushTypeAvailable(instance.pushTypeAvailable())
        .validationStatus(instance.validationStatus())
        .validationDate(instance.validationDate())
        .extension(instance.extension())
        .who(instance.who())
        .id(instance.id())
        .type(instance.type())
        .canPushUpdates(instance.canPushUpdates())
        .build();
  }

  /**
   * Creates a builder for {@link VerificationResult_PrimarySource VerificationResult_PrimarySource}.
   * <pre>
   * ImmutableVerificationResult_PrimarySource.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link VerificationResult_PrimarySource#modifierExtension() modifierExtension}
   *    .communicationMethod(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link VerificationResult_PrimarySource#communicationMethod() communicationMethod}
   *    .pushTypeAvailable(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link VerificationResult_PrimarySource#pushTypeAvailable() pushTypeAvailable}
   *    .validationStatus(com.fhir.types.fhir.CodeableConcept) // optional {@link VerificationResult_PrimarySource#validationStatus() validationStatus}
   *    .validationDate(com.fhir.types.fhir.DateTime) // optional {@link VerificationResult_PrimarySource#validationDate() validationDate}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link VerificationResult_PrimarySource#extension() extension}
   *    .who(com.fhir.types.fhir.Reference) // optional {@link VerificationResult_PrimarySource#who() who}
   *    .id(String) // optional {@link VerificationResult_PrimarySource#id() id}
   *    .type(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link VerificationResult_PrimarySource#type() type}
   *    .canPushUpdates(com.fhir.types.fhir.CodeableConcept) // optional {@link VerificationResult_PrimarySource#canPushUpdates() canPushUpdates}
   *    .build();
   * </pre>
   * @return A new VerificationResult_PrimarySource builder
   */
  public static ImmutableVerificationResult_PrimarySource.Builder builder() {
    return new ImmutableVerificationResult_PrimarySource.Builder();
  }

  /**
   * Builds instances of type {@link VerificationResult_PrimarySource VerificationResult_PrimarySource}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "VerificationResult_PrimarySource", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_COMMUNICATION_METHOD = 0x2L;
    private static final long OPT_BIT_PUSH_TYPE_AVAILABLE = 0x4L;
    private static final long OPT_BIT_VALIDATION_STATUS = 0x8L;
    private static final long OPT_BIT_VALIDATION_DATE = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_WHO = 0x40L;
    private static final long OPT_BIT_ID = 0x80L;
    private static final long OPT_BIT_TYPE = 0x100L;
    private static final long OPT_BIT_CAN_PUSH_UPDATES = 0x200L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<CodeableConcept> communicationMethod;
    private @Nullable List<CodeableConcept> pushTypeAvailable;
    private @Nullable CodeableConcept validationStatus;
    private @Nullable DateTime validationDate;
    private @Nullable List<Extension> extension;
    private @Nullable Reference who;
    private @Nullable String id;
    private @Nullable List<CodeableConcept> type;
    private @Nullable CodeableConcept canPushUpdates;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link VerificationResult_PrimarySource#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link VerificationResult_PrimarySource#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link VerificationResult_PrimarySource#communicationMethod() communicationMethod} to communicationMethod.
     * @param communicationMethod The value for communicationMethod
     * @return {@code this} builder for chained invocation
     */
    public final Builder communicationMethod(List<CodeableConcept> communicationMethod) {
      checkNotIsSet(communicationMethodIsSet(), "communicationMethod");
      this.communicationMethod = Objects.requireNonNull(communicationMethod, "communicationMethod");
      optBits |= OPT_BIT_COMMUNICATION_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_PrimarySource#communicationMethod() communicationMethod} to communicationMethod.
     * @param communicationMethod The value for communicationMethod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("communicationMethod")
    public final Builder communicationMethod(Optional<? extends List<CodeableConcept>> communicationMethod) {
      checkNotIsSet(communicationMethodIsSet(), "communicationMethod");
      this.communicationMethod = communicationMethod.orElse(null);
      optBits |= OPT_BIT_COMMUNICATION_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_PrimarySource#pushTypeAvailable() pushTypeAvailable} to pushTypeAvailable.
     * @param pushTypeAvailable The value for pushTypeAvailable
     * @return {@code this} builder for chained invocation
     */
    public final Builder pushTypeAvailable(List<CodeableConcept> pushTypeAvailable) {
      checkNotIsSet(pushTypeAvailableIsSet(), "pushTypeAvailable");
      this.pushTypeAvailable = Objects.requireNonNull(pushTypeAvailable, "pushTypeAvailable");
      optBits |= OPT_BIT_PUSH_TYPE_AVAILABLE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_PrimarySource#pushTypeAvailable() pushTypeAvailable} to pushTypeAvailable.
     * @param pushTypeAvailable The value for pushTypeAvailable
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("pushTypeAvailable")
    public final Builder pushTypeAvailable(Optional<? extends List<CodeableConcept>> pushTypeAvailable) {
      checkNotIsSet(pushTypeAvailableIsSet(), "pushTypeAvailable");
      this.pushTypeAvailable = pushTypeAvailable.orElse(null);
      optBits |= OPT_BIT_PUSH_TYPE_AVAILABLE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_PrimarySource#validationStatus() validationStatus} to validationStatus.
     * @param validationStatus The value for validationStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder validationStatus(CodeableConcept validationStatus) {
      checkNotIsSet(validationStatusIsSet(), "validationStatus");
      this.validationStatus = Objects.requireNonNull(validationStatus, "validationStatus");
      optBits |= OPT_BIT_VALIDATION_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_PrimarySource#validationStatus() validationStatus} to validationStatus.
     * @param validationStatus The value for validationStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("validationStatus")
    public final Builder validationStatus(Optional<? extends CodeableConcept> validationStatus) {
      checkNotIsSet(validationStatusIsSet(), "validationStatus");
      this.validationStatus = validationStatus.orElse(null);
      optBits |= OPT_BIT_VALIDATION_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_PrimarySource#validationDate() validationDate} to validationDate.
     * @param validationDate The value for validationDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder validationDate(DateTime validationDate) {
      checkNotIsSet(validationDateIsSet(), "validationDate");
      this.validationDate = Objects.requireNonNull(validationDate, "validationDate");
      optBits |= OPT_BIT_VALIDATION_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_PrimarySource#validationDate() validationDate} to validationDate.
     * @param validationDate The value for validationDate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("validationDate")
    public final Builder validationDate(Optional<? extends DateTime> validationDate) {
      checkNotIsSet(validationDateIsSet(), "validationDate");
      this.validationDate = validationDate.orElse(null);
      optBits |= OPT_BIT_VALIDATION_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_PrimarySource#extension() extension} to extension.
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
     * Initializes the optional value {@link VerificationResult_PrimarySource#extension() extension} to extension.
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
     * Initializes the optional value {@link VerificationResult_PrimarySource#who() who} to who.
     * @param who The value for who
     * @return {@code this} builder for chained invocation
     */
    public final Builder who(Reference who) {
      checkNotIsSet(whoIsSet(), "who");
      this.who = Objects.requireNonNull(who, "who");
      optBits |= OPT_BIT_WHO;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_PrimarySource#who() who} to who.
     * @param who The value for who
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("who")
    public final Builder who(Optional<? extends Reference> who) {
      checkNotIsSet(whoIsSet(), "who");
      this.who = who.orElse(null);
      optBits |= OPT_BIT_WHO;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_PrimarySource#id() id} to id.
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
     * Initializes the optional value {@link VerificationResult_PrimarySource#id() id} to id.
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
     * Initializes the optional value {@link VerificationResult_PrimarySource#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(List<CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_PrimarySource#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends List<CodeableConcept>> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_PrimarySource#canPushUpdates() canPushUpdates} to canPushUpdates.
     * @param canPushUpdates The value for canPushUpdates
     * @return {@code this} builder for chained invocation
     */
    public final Builder canPushUpdates(CodeableConcept canPushUpdates) {
      checkNotIsSet(canPushUpdatesIsSet(), "canPushUpdates");
      this.canPushUpdates = Objects.requireNonNull(canPushUpdates, "canPushUpdates");
      optBits |= OPT_BIT_CAN_PUSH_UPDATES;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_PrimarySource#canPushUpdates() canPushUpdates} to canPushUpdates.
     * @param canPushUpdates The value for canPushUpdates
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("canPushUpdates")
    public final Builder canPushUpdates(Optional<? extends CodeableConcept> canPushUpdates) {
      checkNotIsSet(canPushUpdatesIsSet(), "canPushUpdates");
      this.canPushUpdates = canPushUpdates.orElse(null);
      optBits |= OPT_BIT_CAN_PUSH_UPDATES;
      return this;
    }

    /**
     * Builds a new {@link VerificationResult_PrimarySource VerificationResult_PrimarySource}.
     * @return An immutable instance of VerificationResult_PrimarySource
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public VerificationResult_PrimarySource build() {
      return new ImmutableVerificationResult_PrimarySource(
          modifierExtension,
          communicationMethod,
          pushTypeAvailable,
          validationStatus,
          validationDate,
          extension,
          who,
          id,
          type,
          canPushUpdates);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean communicationMethodIsSet() {
      return (optBits & OPT_BIT_COMMUNICATION_METHOD) != 0;
    }

    private boolean pushTypeAvailableIsSet() {
      return (optBits & OPT_BIT_PUSH_TYPE_AVAILABLE) != 0;
    }

    private boolean validationStatusIsSet() {
      return (optBits & OPT_BIT_VALIDATION_STATUS) != 0;
    }

    private boolean validationDateIsSet() {
      return (optBits & OPT_BIT_VALIDATION_DATE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean whoIsSet() {
      return (optBits & OPT_BIT_WHO) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean canPushUpdatesIsSet() {
      return (optBits & OPT_BIT_CAN_PUSH_UPDATES) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of VerificationResult_PrimarySource is strict, attribute is already set: ".concat(name));
    }
  }
}

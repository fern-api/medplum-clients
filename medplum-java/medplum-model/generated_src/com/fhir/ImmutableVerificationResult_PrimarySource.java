//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link VerificationResult_PrimarySource}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableVerificationResult_PrimarySource.builder()}.
 */
@org.immutables.value.Generated(from = "VerificationResult_PrimarySource", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableVerificationResult_PrimarySource
    implements com.fhir.VerificationResult_PrimarySource {
  private final @javax.annotation.Nullable com.fhir.CodeableConcept validationStatus;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> type;
  private final @javax.annotation.Nullable com.fhir.Reference who;
  private final @javax.annotation.Nullable com.fhir.dateTime validationDate;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> pushTypeAvailable;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept canPushUpdates;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> communicationMethod;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

  private ImmutableVerificationResult_PrimarySource(
      @javax.annotation.Nullable com.fhir.CodeableConcept validationStatus,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> type,
      @javax.annotation.Nullable com.fhir.Reference who,
      @javax.annotation.Nullable com.fhir.dateTime validationDate,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> pushTypeAvailable,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.CodeableConcept canPushUpdates,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> communicationMethod,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension) {
    this.validationStatus = validationStatus;
    this.type = type;
    this.who = who;
    this.validationDate = validationDate;
    this.pushTypeAvailable = pushTypeAvailable;
    this.id = id;
    this.extension = extension;
    this.canPushUpdates = canPushUpdates;
    this.communicationMethod = communicationMethod;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code validationStatus} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("validationStatus")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> validationStatus() {
    return java.util.Optional.ofNullable(validationStatus);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code who} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("who")
  @Override
  public java.util.Optional<com.fhir.Reference> who() {
    return java.util.Optional.ofNullable(who);
  }

  /**
   * @return The value of the {@code validationDate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("validationDate")
  @Override
  public java.util.Optional<com.fhir.dateTime> validationDate() {
    return java.util.Optional.ofNullable(validationDate);
  }

  /**
   * @return The value of the {@code pushTypeAvailable} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("pushTypeAvailable")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> pushTypeAvailable() {
    return java.util.Optional.ofNullable(pushTypeAvailable);
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
   * @return The value of the {@code canPushUpdates} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("canPushUpdates")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> canPushUpdates() {
    return java.util.Optional.ofNullable(canPushUpdates);
  }

  /**
   * @return The value of the {@code communicationMethod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("communicationMethod")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> communicationMethod() {
    return java.util.Optional.ofNullable(communicationMethod);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_PrimarySource#validationStatus() validationStatus} attribute.
   * @param value The value for validationStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_PrimarySource withValidationStatus(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "validationStatus");
    if (this.validationStatus == newValue) return this;
    return new ImmutableVerificationResult_PrimarySource(
        newValue,
        this.type,
        this.who,
        this.validationDate,
        this.pushTypeAvailable,
        this.id,
        this.extension,
        this.canPushUpdates,
        this.communicationMethod,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_PrimarySource#validationStatus() validationStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for validationStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_PrimarySource withValidationStatus(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.validationStatus == value) return this;
    return new ImmutableVerificationResult_PrimarySource(
        value,
        this.type,
        this.who,
        this.validationDate,
        this.pushTypeAvailable,
        this.id,
        this.extension,
        this.canPushUpdates,
        this.communicationMethod,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_PrimarySource#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_PrimarySource withType(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.validationStatus,
        newValue,
        this.who,
        this.validationDate,
        this.pushTypeAvailable,
        this.id,
        this.extension,
        this.canPushUpdates,
        this.communicationMethod,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_PrimarySource#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_PrimarySource withType(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.validationStatus,
        value,
        this.who,
        this.validationDate,
        this.pushTypeAvailable,
        this.id,
        this.extension,
        this.canPushUpdates,
        this.communicationMethod,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_PrimarySource#who() who} attribute.
   * @param value The value for who
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_PrimarySource withWho(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "who");
    if (this.who == newValue) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.validationStatus,
        this.type,
        newValue,
        this.validationDate,
        this.pushTypeAvailable,
        this.id,
        this.extension,
        this.canPushUpdates,
        this.communicationMethod,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_PrimarySource#who() who} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for who
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_PrimarySource withWho(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.who == value) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.validationStatus,
        this.type,
        value,
        this.validationDate,
        this.pushTypeAvailable,
        this.id,
        this.extension,
        this.canPushUpdates,
        this.communicationMethod,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_PrimarySource#validationDate() validationDate} attribute.
   * @param value The value for validationDate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_PrimarySource withValidationDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "validationDate");
    if (this.validationDate == newValue) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.validationStatus,
        this.type,
        this.who,
        newValue,
        this.pushTypeAvailable,
        this.id,
        this.extension,
        this.canPushUpdates,
        this.communicationMethod,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_PrimarySource#validationDate() validationDate} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for validationDate
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_PrimarySource withValidationDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.validationDate == value) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.validationStatus,
        this.type,
        this.who,
        value,
        this.pushTypeAvailable,
        this.id,
        this.extension,
        this.canPushUpdates,
        this.communicationMethod,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_PrimarySource#pushTypeAvailable() pushTypeAvailable} attribute.
   * @param value The value for pushTypeAvailable
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_PrimarySource withPushTypeAvailable(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "pushTypeAvailable");
    if (this.pushTypeAvailable == newValue) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.validationStatus,
        this.type,
        this.who,
        this.validationDate,
        newValue,
        this.id,
        this.extension,
        this.canPushUpdates,
        this.communicationMethod,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_PrimarySource#pushTypeAvailable() pushTypeAvailable} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for pushTypeAvailable
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_PrimarySource withPushTypeAvailable(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.pushTypeAvailable == value) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.validationStatus,
        this.type,
        this.who,
        this.validationDate,
        value,
        this.id,
        this.extension,
        this.canPushUpdates,
        this.communicationMethod,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_PrimarySource#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_PrimarySource withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.validationStatus,
        this.type,
        this.who,
        this.validationDate,
        this.pushTypeAvailable,
        newValue,
        this.extension,
        this.canPushUpdates,
        this.communicationMethod,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_PrimarySource#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_PrimarySource withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.validationStatus,
        this.type,
        this.who,
        this.validationDate,
        this.pushTypeAvailable,
        value,
        this.extension,
        this.canPushUpdates,
        this.communicationMethod,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_PrimarySource#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_PrimarySource withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.validationStatus,
        this.type,
        this.who,
        this.validationDate,
        this.pushTypeAvailable,
        this.id,
        newValue,
        this.canPushUpdates,
        this.communicationMethod,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_PrimarySource#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_PrimarySource withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.validationStatus,
        this.type,
        this.who,
        this.validationDate,
        this.pushTypeAvailable,
        this.id,
        value,
        this.canPushUpdates,
        this.communicationMethod,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_PrimarySource#canPushUpdates() canPushUpdates} attribute.
   * @param value The value for canPushUpdates
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_PrimarySource withCanPushUpdates(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "canPushUpdates");
    if (this.canPushUpdates == newValue) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.validationStatus,
        this.type,
        this.who,
        this.validationDate,
        this.pushTypeAvailable,
        this.id,
        this.extension,
        newValue,
        this.communicationMethod,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_PrimarySource#canPushUpdates() canPushUpdates} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for canPushUpdates
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_PrimarySource withCanPushUpdates(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.canPushUpdates == value) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.validationStatus,
        this.type,
        this.who,
        this.validationDate,
        this.pushTypeAvailable,
        this.id,
        this.extension,
        value,
        this.communicationMethod,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_PrimarySource#communicationMethod() communicationMethod} attribute.
   * @param value The value for communicationMethod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_PrimarySource withCommunicationMethod(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "communicationMethod");
    if (this.communicationMethod == newValue) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.validationStatus,
        this.type,
        this.who,
        this.validationDate,
        this.pushTypeAvailable,
        this.id,
        this.extension,
        this.canPushUpdates,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_PrimarySource#communicationMethod() communicationMethod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for communicationMethod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_PrimarySource withCommunicationMethod(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.communicationMethod == value) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.validationStatus,
        this.type,
        this.who,
        this.validationDate,
        this.pushTypeAvailable,
        this.id,
        this.extension,
        this.canPushUpdates,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_PrimarySource#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_PrimarySource withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.validationStatus,
        this.type,
        this.who,
        this.validationDate,
        this.pushTypeAvailable,
        this.id,
        this.extension,
        this.canPushUpdates,
        this.communicationMethod,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_PrimarySource#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_PrimarySource withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableVerificationResult_PrimarySource(
        this.validationStatus,
        this.type,
        this.who,
        this.validationDate,
        this.pushTypeAvailable,
        this.id,
        this.extension,
        this.canPushUpdates,
        this.communicationMethod,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableVerificationResult_PrimarySource} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableVerificationResult_PrimarySource
        && equalTo((ImmutableVerificationResult_PrimarySource) another);
  }

  private boolean equalTo(ImmutableVerificationResult_PrimarySource another) {
    return java.util.Objects.equals(validationStatus, another.validationStatus)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(who, another.who)
        && java.util.Objects.equals(validationDate, another.validationDate)
        && java.util.Objects.equals(pushTypeAvailable, another.pushTypeAvailable)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(canPushUpdates, another.canPushUpdates)
        && java.util.Objects.equals(communicationMethod, another.communicationMethod)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code validationStatus}, {@code type}, {@code who}, {@code validationDate}, {@code pushTypeAvailable}, {@code id}, {@code extension}, {@code canPushUpdates}, {@code communicationMethod}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(validationStatus);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(who);
    h += (h << 5) + java.util.Objects.hashCode(validationDate);
    h += (h << 5) + java.util.Objects.hashCode(pushTypeAvailable);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(canPushUpdates);
    h += (h << 5) + java.util.Objects.hashCode(communicationMethod);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code VerificationResult_PrimarySource} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("VerificationResult_PrimarySource{");
    if (validationStatus != null) {
      builder.append("validationStatus=").append(validationStatus);
    }
    if (type != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (who != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("who=").append(who);
    }
    if (validationDate != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("validationDate=").append(validationDate);
    }
    if (pushTypeAvailable != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("pushTypeAvailable=").append(pushTypeAvailable);
    }
    if (id != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (canPushUpdates != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("canPushUpdates=").append(canPushUpdates);
    }
    if (communicationMethod != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("communicationMethod=").append(communicationMethod);
    }
    if (modifierExtension != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "VerificationResult_PrimarySource", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.VerificationResult_PrimarySource {
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> validationStatus = java.util.Optional.empty();
    boolean validationStatusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> who = java.util.Optional.empty();
    boolean whoIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> validationDate = java.util.Optional.empty();
    boolean validationDateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> pushTypeAvailable = java.util.Optional.empty();
    boolean pushTypeAvailableIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> canPushUpdates = java.util.Optional.empty();
    boolean canPushUpdatesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> communicationMethod = java.util.Optional.empty();
    boolean communicationMethodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("validationStatus")
    public void setValidationStatus(java.util.Optional<com.fhir.CodeableConcept> validationStatus) {
      this.validationStatus = validationStatus;
      this.validationStatusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("who")
    public void setWho(java.util.Optional<com.fhir.Reference> who) {
      this.who = who;
      this.whoIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("validationDate")
    public void setValidationDate(java.util.Optional<com.fhir.dateTime> validationDate) {
      this.validationDate = validationDate;
      this.validationDateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("pushTypeAvailable")
    public void setPushTypeAvailable(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> pushTypeAvailable) {
      this.pushTypeAvailable = pushTypeAvailable;
      this.pushTypeAvailableIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("canPushUpdates")
    public void setCanPushUpdates(java.util.Optional<com.fhir.CodeableConcept> canPushUpdates) {
      this.canPushUpdates = canPushUpdates;
      this.canPushUpdatesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("communicationMethod")
    public void setCommunicationMethod(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> communicationMethod) {
      this.communicationMethod = communicationMethod;
      this.communicationMethodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> validationStatus() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> who() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> validationDate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> pushTypeAvailable() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> canPushUpdates() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> communicationMethod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableVerificationResult_PrimarySource fromJson(Json json) {
    ImmutableVerificationResult_PrimarySource.Builder builder = ImmutableVerificationResult_PrimarySource.builder();
    if (json.validationStatusIsSet) {
      builder.validationStatus(json.validationStatus);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.whoIsSet) {
      builder.who(json.who);
    }
    if (json.validationDateIsSet) {
      builder.validationDate(json.validationDate);
    }
    if (json.pushTypeAvailableIsSet) {
      builder.pushTypeAvailable(json.pushTypeAvailable);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.canPushUpdatesIsSet) {
      builder.canPushUpdates(json.canPushUpdates);
    }
    if (json.communicationMethodIsSet) {
      builder.communicationMethod(json.communicationMethod);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
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
        .validationStatus(instance.validationStatus())
        .type(instance.type())
        .who(instance.who())
        .validationDate(instance.validationDate())
        .pushTypeAvailable(instance.pushTypeAvailable())
        .id(instance.id())
        .extension(instance.extension())
        .canPushUpdates(instance.canPushUpdates())
        .communicationMethod(instance.communicationMethod())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link VerificationResult_PrimarySource VerificationResult_PrimarySource}.
   * <pre>
   * ImmutableVerificationResult_PrimarySource.builder()
   *    .validationStatus(com.fhir.CodeableConcept) // optional {@link VerificationResult_PrimarySource#validationStatus() validationStatus}
   *    .type(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link VerificationResult_PrimarySource#type() type}
   *    .who(com.fhir.Reference) // optional {@link VerificationResult_PrimarySource#who() who}
   *    .validationDate(com.fhir.dateTime) // optional {@link VerificationResult_PrimarySource#validationDate() validationDate}
   *    .pushTypeAvailable(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link VerificationResult_PrimarySource#pushTypeAvailable() pushTypeAvailable}
   *    .id(String) // optional {@link VerificationResult_PrimarySource#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link VerificationResult_PrimarySource#extension() extension}
   *    .canPushUpdates(com.fhir.CodeableConcept) // optional {@link VerificationResult_PrimarySource#canPushUpdates() canPushUpdates}
   *    .communicationMethod(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link VerificationResult_PrimarySource#communicationMethod() communicationMethod}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link VerificationResult_PrimarySource#modifierExtension() modifierExtension}
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
  @org.immutables.value.Generated(from = "VerificationResult_PrimarySource", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_VALIDATION_STATUS = 0x1L;
    private static final long OPT_BIT_TYPE = 0x2L;
    private static final long OPT_BIT_WHO = 0x4L;
    private static final long OPT_BIT_VALIDATION_DATE = 0x8L;
    private static final long OPT_BIT_PUSH_TYPE_AVAILABLE = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_CAN_PUSH_UPDATES = 0x80L;
    private static final long OPT_BIT_COMMUNICATION_METHOD = 0x100L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x200L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.CodeableConcept validationStatus;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> type;
    private @javax.annotation.Nullable com.fhir.Reference who;
    private @javax.annotation.Nullable com.fhir.dateTime validationDate;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> pushTypeAvailable;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept canPushUpdates;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> communicationMethod;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link VerificationResult_PrimarySource#validationStatus() validationStatus} to validationStatus.
     * @param validationStatus The value for validationStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder validationStatus(com.fhir.CodeableConcept validationStatus) {
      checkNotIsSet(validationStatusIsSet(), "validationStatus");
      this.validationStatus = java.util.Objects.requireNonNull(validationStatus, "validationStatus");
      optBits |= OPT_BIT_VALIDATION_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_PrimarySource#validationStatus() validationStatus} to validationStatus.
     * @param validationStatus The value for validationStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("validationStatus")
    public final Builder validationStatus(java.util.Optional<? extends com.fhir.CodeableConcept> validationStatus) {
      checkNotIsSet(validationStatusIsSet(), "validationStatus");
      this.validationStatus = validationStatus.orElse(null);
      optBits |= OPT_BIT_VALIDATION_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_PrimarySource#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(java.util.List<com.fhir.CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_PrimarySource#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_PrimarySource#who() who} to who.
     * @param who The value for who
     * @return {@code this} builder for chained invocation
     */
    public final Builder who(com.fhir.Reference who) {
      checkNotIsSet(whoIsSet(), "who");
      this.who = java.util.Objects.requireNonNull(who, "who");
      optBits |= OPT_BIT_WHO;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_PrimarySource#who() who} to who.
     * @param who The value for who
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("who")
    public final Builder who(java.util.Optional<? extends com.fhir.Reference> who) {
      checkNotIsSet(whoIsSet(), "who");
      this.who = who.orElse(null);
      optBits |= OPT_BIT_WHO;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_PrimarySource#validationDate() validationDate} to validationDate.
     * @param validationDate The value for validationDate
     * @return {@code this} builder for chained invocation
     */
    public final Builder validationDate(com.fhir.dateTime validationDate) {
      checkNotIsSet(validationDateIsSet(), "validationDate");
      this.validationDate = java.util.Objects.requireNonNull(validationDate, "validationDate");
      optBits |= OPT_BIT_VALIDATION_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_PrimarySource#validationDate() validationDate} to validationDate.
     * @param validationDate The value for validationDate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("validationDate")
    public final Builder validationDate(java.util.Optional<? extends com.fhir.dateTime> validationDate) {
      checkNotIsSet(validationDateIsSet(), "validationDate");
      this.validationDate = validationDate.orElse(null);
      optBits |= OPT_BIT_VALIDATION_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_PrimarySource#pushTypeAvailable() pushTypeAvailable} to pushTypeAvailable.
     * @param pushTypeAvailable The value for pushTypeAvailable
     * @return {@code this} builder for chained invocation
     */
    public final Builder pushTypeAvailable(java.util.List<com.fhir.CodeableConcept> pushTypeAvailable) {
      checkNotIsSet(pushTypeAvailableIsSet(), "pushTypeAvailable");
      this.pushTypeAvailable = java.util.Objects.requireNonNull(pushTypeAvailable, "pushTypeAvailable");
      optBits |= OPT_BIT_PUSH_TYPE_AVAILABLE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_PrimarySource#pushTypeAvailable() pushTypeAvailable} to pushTypeAvailable.
     * @param pushTypeAvailable The value for pushTypeAvailable
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pushTypeAvailable")
    public final Builder pushTypeAvailable(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> pushTypeAvailable) {
      checkNotIsSet(pushTypeAvailableIsSet(), "pushTypeAvailable");
      this.pushTypeAvailable = pushTypeAvailable.orElse(null);
      optBits |= OPT_BIT_PUSH_TYPE_AVAILABLE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_PrimarySource#id() id} to id.
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
     * Initializes the optional value {@link VerificationResult_PrimarySource#id() id} to id.
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
     * Initializes the optional value {@link VerificationResult_PrimarySource#extension() extension} to extension.
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
     * Initializes the optional value {@link VerificationResult_PrimarySource#extension() extension} to extension.
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
     * Initializes the optional value {@link VerificationResult_PrimarySource#canPushUpdates() canPushUpdates} to canPushUpdates.
     * @param canPushUpdates The value for canPushUpdates
     * @return {@code this} builder for chained invocation
     */
    public final Builder canPushUpdates(com.fhir.CodeableConcept canPushUpdates) {
      checkNotIsSet(canPushUpdatesIsSet(), "canPushUpdates");
      this.canPushUpdates = java.util.Objects.requireNonNull(canPushUpdates, "canPushUpdates");
      optBits |= OPT_BIT_CAN_PUSH_UPDATES;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_PrimarySource#canPushUpdates() canPushUpdates} to canPushUpdates.
     * @param canPushUpdates The value for canPushUpdates
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("canPushUpdates")
    public final Builder canPushUpdates(java.util.Optional<? extends com.fhir.CodeableConcept> canPushUpdates) {
      checkNotIsSet(canPushUpdatesIsSet(), "canPushUpdates");
      this.canPushUpdates = canPushUpdates.orElse(null);
      optBits |= OPT_BIT_CAN_PUSH_UPDATES;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_PrimarySource#communicationMethod() communicationMethod} to communicationMethod.
     * @param communicationMethod The value for communicationMethod
     * @return {@code this} builder for chained invocation
     */
    public final Builder communicationMethod(java.util.List<com.fhir.CodeableConcept> communicationMethod) {
      checkNotIsSet(communicationMethodIsSet(), "communicationMethod");
      this.communicationMethod = java.util.Objects.requireNonNull(communicationMethod, "communicationMethod");
      optBits |= OPT_BIT_COMMUNICATION_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_PrimarySource#communicationMethod() communicationMethod} to communicationMethod.
     * @param communicationMethod The value for communicationMethod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("communicationMethod")
    public final Builder communicationMethod(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> communicationMethod) {
      checkNotIsSet(communicationMethodIsSet(), "communicationMethod");
      this.communicationMethod = communicationMethod.orElse(null);
      optBits |= OPT_BIT_COMMUNICATION_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_PrimarySource#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link VerificationResult_PrimarySource#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link VerificationResult_PrimarySource VerificationResult_PrimarySource}.
     * @return An immutable instance of VerificationResult_PrimarySource
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.VerificationResult_PrimarySource build() {
      return new ImmutableVerificationResult_PrimarySource(
          validationStatus,
          type,
          who,
          validationDate,
          pushTypeAvailable,
          id,
          extension,
          canPushUpdates,
          communicationMethod,
          modifierExtension);
    }

    private boolean validationStatusIsSet() {
      return (optBits & OPT_BIT_VALIDATION_STATUS) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean whoIsSet() {
      return (optBits & OPT_BIT_WHO) != 0;
    }

    private boolean validationDateIsSet() {
      return (optBits & OPT_BIT_VALIDATION_DATE) != 0;
    }

    private boolean pushTypeAvailableIsSet() {
      return (optBits & OPT_BIT_PUSH_TYPE_AVAILABLE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean canPushUpdatesIsSet() {
      return (optBits & OPT_BIT_CAN_PUSH_UPDATES) != 0;
    }

    private boolean communicationMethodIsSet() {
      return (optBits & OPT_BIT_COMMUNICATION_METHOD) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of VerificationResult_PrimarySource is strict, attribute is already set: ".concat(name));
    }
  }
}

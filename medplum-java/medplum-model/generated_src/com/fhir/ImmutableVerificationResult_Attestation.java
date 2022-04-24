//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link VerificationResult_Attestation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableVerificationResult_Attestation.builder()}.
 */
@org.immutables.value.Generated(from = "VerificationResult_Attestation", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableVerificationResult_Attestation implements com.fhir.VerificationResult_Attestation {
  private final @javax.annotation.Nullable com.fhir.date date;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.Reference onBehalfOf;
  private final @javax.annotation.Nullable com.fhir.Reference who;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept communicationMethod;
  private final @javax.annotation.Nullable com.fhir.Signature proxySignature;
  private final @javax.annotation.Nullable com.fhir.Signature sourceSignature;
  private final @javax.annotation.Nullable java.lang.String sourceIdentityCertificate;
  private final @javax.annotation.Nullable java.lang.String proxyIdentityCertificate;

  private ImmutableVerificationResult_Attestation(
      @javax.annotation.Nullable com.fhir.date date,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.Reference onBehalfOf,
      @javax.annotation.Nullable com.fhir.Reference who,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.CodeableConcept communicationMethod,
      @javax.annotation.Nullable com.fhir.Signature proxySignature,
      @javax.annotation.Nullable com.fhir.Signature sourceSignature,
      @javax.annotation.Nullable java.lang.String sourceIdentityCertificate,
      @javax.annotation.Nullable java.lang.String proxyIdentityCertificate) {
    this.date = date;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.onBehalfOf = onBehalfOf;
    this.who = who;
    this.extension = extension;
    this.communicationMethod = communicationMethod;
    this.proxySignature = proxySignature;
    this.sourceSignature = sourceSignature;
    this.sourceIdentityCertificate = sourceIdentityCertificate;
    this.proxyIdentityCertificate = proxyIdentityCertificate;
  }

  /**
   * @return The value of the {@code date} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("date")
  @Override
  public java.util.Optional<com.fhir.date> date() {
    return java.util.Optional.ofNullable(date);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<java.lang.String> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code onBehalfOf} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("onBehalfOf")
  @Override
  public java.util.Optional<com.fhir.Reference> onBehalfOf() {
    return java.util.Optional.ofNullable(onBehalfOf);
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
   * @return The value of the {@code extension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("extension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> extension() {
    return java.util.Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code communicationMethod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("communicationMethod")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> communicationMethod() {
    return java.util.Optional.ofNullable(communicationMethod);
  }

  /**
   * @return The value of the {@code proxySignature} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("proxySignature")
  @Override
  public java.util.Optional<com.fhir.Signature> proxySignature() {
    return java.util.Optional.ofNullable(proxySignature);
  }

  /**
   * @return The value of the {@code sourceSignature} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sourceSignature")
  @Override
  public java.util.Optional<com.fhir.Signature> sourceSignature() {
    return java.util.Optional.ofNullable(sourceSignature);
  }

  /**
   * @return The value of the {@code sourceIdentityCertificate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sourceIdentityCertificate")
  @Override
  public java.util.Optional<java.lang.String> sourceIdentityCertificate() {
    return java.util.Optional.ofNullable(sourceIdentityCertificate);
  }

  /**
   * @return The value of the {@code proxyIdentityCertificate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("proxyIdentityCertificate")
  @Override
  public java.util.Optional<java.lang.String> proxyIdentityCertificate() {
    return java.util.Optional.ofNullable(proxyIdentityCertificate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_Attestation#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Attestation withDate(com.fhir.date value) {
    @javax.annotation.Nullable com.fhir.date newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableVerificationResult_Attestation(
        newValue,
        this.modifierExtension,
        this.id,
        this.onBehalfOf,
        this.who,
        this.extension,
        this.communicationMethod,
        this.proxySignature,
        this.sourceSignature,
        this.sourceIdentityCertificate,
        this.proxyIdentityCertificate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_Attestation#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_Attestation withDate(java.util.Optional<? extends com.fhir.date> optional) {
    @javax.annotation.Nullable com.fhir.date value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableVerificationResult_Attestation(
        value,
        this.modifierExtension,
        this.id,
        this.onBehalfOf,
        this.who,
        this.extension,
        this.communicationMethod,
        this.proxySignature,
        this.sourceSignature,
        this.sourceIdentityCertificate,
        this.proxyIdentityCertificate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_Attestation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Attestation withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableVerificationResult_Attestation(
        this.date,
        newValue,
        this.id,
        this.onBehalfOf,
        this.who,
        this.extension,
        this.communicationMethod,
        this.proxySignature,
        this.sourceSignature,
        this.sourceIdentityCertificate,
        this.proxyIdentityCertificate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_Attestation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_Attestation withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableVerificationResult_Attestation(
        this.date,
        value,
        this.id,
        this.onBehalfOf,
        this.who,
        this.extension,
        this.communicationMethod,
        this.proxySignature,
        this.sourceSignature,
        this.sourceIdentityCertificate,
        this.proxyIdentityCertificate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_Attestation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Attestation withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableVerificationResult_Attestation(
        this.date,
        this.modifierExtension,
        newValue,
        this.onBehalfOf,
        this.who,
        this.extension,
        this.communicationMethod,
        this.proxySignature,
        this.sourceSignature,
        this.sourceIdentityCertificate,
        this.proxyIdentityCertificate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_Attestation#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Attestation withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableVerificationResult_Attestation(
        this.date,
        this.modifierExtension,
        value,
        this.onBehalfOf,
        this.who,
        this.extension,
        this.communicationMethod,
        this.proxySignature,
        this.sourceSignature,
        this.sourceIdentityCertificate,
        this.proxyIdentityCertificate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_Attestation#onBehalfOf() onBehalfOf} attribute.
   * @param value The value for onBehalfOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Attestation withOnBehalfOf(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "onBehalfOf");
    if (this.onBehalfOf == newValue) return this;
    return new ImmutableVerificationResult_Attestation(
        this.date,
        this.modifierExtension,
        this.id,
        newValue,
        this.who,
        this.extension,
        this.communicationMethod,
        this.proxySignature,
        this.sourceSignature,
        this.sourceIdentityCertificate,
        this.proxyIdentityCertificate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_Attestation#onBehalfOf() onBehalfOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onBehalfOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_Attestation withOnBehalfOf(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.onBehalfOf == value) return this;
    return new ImmutableVerificationResult_Attestation(
        this.date,
        this.modifierExtension,
        this.id,
        value,
        this.who,
        this.extension,
        this.communicationMethod,
        this.proxySignature,
        this.sourceSignature,
        this.sourceIdentityCertificate,
        this.proxyIdentityCertificate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_Attestation#who() who} attribute.
   * @param value The value for who
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Attestation withWho(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "who");
    if (this.who == newValue) return this;
    return new ImmutableVerificationResult_Attestation(
        this.date,
        this.modifierExtension,
        this.id,
        this.onBehalfOf,
        newValue,
        this.extension,
        this.communicationMethod,
        this.proxySignature,
        this.sourceSignature,
        this.sourceIdentityCertificate,
        this.proxyIdentityCertificate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_Attestation#who() who} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for who
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_Attestation withWho(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.who == value) return this;
    return new ImmutableVerificationResult_Attestation(
        this.date,
        this.modifierExtension,
        this.id,
        this.onBehalfOf,
        value,
        this.extension,
        this.communicationMethod,
        this.proxySignature,
        this.sourceSignature,
        this.sourceIdentityCertificate,
        this.proxyIdentityCertificate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_Attestation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Attestation withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableVerificationResult_Attestation(
        this.date,
        this.modifierExtension,
        this.id,
        this.onBehalfOf,
        this.who,
        newValue,
        this.communicationMethod,
        this.proxySignature,
        this.sourceSignature,
        this.sourceIdentityCertificate,
        this.proxyIdentityCertificate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_Attestation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_Attestation withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableVerificationResult_Attestation(
        this.date,
        this.modifierExtension,
        this.id,
        this.onBehalfOf,
        this.who,
        value,
        this.communicationMethod,
        this.proxySignature,
        this.sourceSignature,
        this.sourceIdentityCertificate,
        this.proxyIdentityCertificate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_Attestation#communicationMethod() communicationMethod} attribute.
   * @param value The value for communicationMethod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Attestation withCommunicationMethod(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "communicationMethod");
    if (this.communicationMethod == newValue) return this;
    return new ImmutableVerificationResult_Attestation(
        this.date,
        this.modifierExtension,
        this.id,
        this.onBehalfOf,
        this.who,
        this.extension,
        newValue,
        this.proxySignature,
        this.sourceSignature,
        this.sourceIdentityCertificate,
        this.proxyIdentityCertificate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_Attestation#communicationMethod() communicationMethod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for communicationMethod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_Attestation withCommunicationMethod(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.communicationMethod == value) return this;
    return new ImmutableVerificationResult_Attestation(
        this.date,
        this.modifierExtension,
        this.id,
        this.onBehalfOf,
        this.who,
        this.extension,
        value,
        this.proxySignature,
        this.sourceSignature,
        this.sourceIdentityCertificate,
        this.proxyIdentityCertificate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_Attestation#proxySignature() proxySignature} attribute.
   * @param value The value for proxySignature
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Attestation withProxySignature(com.fhir.Signature value) {
    @javax.annotation.Nullable com.fhir.Signature newValue = java.util.Objects.requireNonNull(value, "proxySignature");
    if (this.proxySignature == newValue) return this;
    return new ImmutableVerificationResult_Attestation(
        this.date,
        this.modifierExtension,
        this.id,
        this.onBehalfOf,
        this.who,
        this.extension,
        this.communicationMethod,
        newValue,
        this.sourceSignature,
        this.sourceIdentityCertificate,
        this.proxyIdentityCertificate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_Attestation#proxySignature() proxySignature} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for proxySignature
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_Attestation withProxySignature(java.util.Optional<? extends com.fhir.Signature> optional) {
    @javax.annotation.Nullable com.fhir.Signature value = optional.orElse(null);
    if (this.proxySignature == value) return this;
    return new ImmutableVerificationResult_Attestation(
        this.date,
        this.modifierExtension,
        this.id,
        this.onBehalfOf,
        this.who,
        this.extension,
        this.communicationMethod,
        value,
        this.sourceSignature,
        this.sourceIdentityCertificate,
        this.proxyIdentityCertificate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_Attestation#sourceSignature() sourceSignature} attribute.
   * @param value The value for sourceSignature
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Attestation withSourceSignature(com.fhir.Signature value) {
    @javax.annotation.Nullable com.fhir.Signature newValue = java.util.Objects.requireNonNull(value, "sourceSignature");
    if (this.sourceSignature == newValue) return this;
    return new ImmutableVerificationResult_Attestation(
        this.date,
        this.modifierExtension,
        this.id,
        this.onBehalfOf,
        this.who,
        this.extension,
        this.communicationMethod,
        this.proxySignature,
        newValue,
        this.sourceIdentityCertificate,
        this.proxyIdentityCertificate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_Attestation#sourceSignature() sourceSignature} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sourceSignature
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_Attestation withSourceSignature(java.util.Optional<? extends com.fhir.Signature> optional) {
    @javax.annotation.Nullable com.fhir.Signature value = optional.orElse(null);
    if (this.sourceSignature == value) return this;
    return new ImmutableVerificationResult_Attestation(
        this.date,
        this.modifierExtension,
        this.id,
        this.onBehalfOf,
        this.who,
        this.extension,
        this.communicationMethod,
        this.proxySignature,
        value,
        this.sourceIdentityCertificate,
        this.proxyIdentityCertificate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_Attestation#sourceIdentityCertificate() sourceIdentityCertificate} attribute.
   * @param value The value for sourceIdentityCertificate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Attestation withSourceIdentityCertificate(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "sourceIdentityCertificate");
    if (java.util.Objects.equals(this.sourceIdentityCertificate, newValue)) return this;
    return new ImmutableVerificationResult_Attestation(
        this.date,
        this.modifierExtension,
        this.id,
        this.onBehalfOf,
        this.who,
        this.extension,
        this.communicationMethod,
        this.proxySignature,
        this.sourceSignature,
        newValue,
        this.proxyIdentityCertificate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_Attestation#sourceIdentityCertificate() sourceIdentityCertificate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sourceIdentityCertificate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Attestation withSourceIdentityCertificate(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.sourceIdentityCertificate, value)) return this;
    return new ImmutableVerificationResult_Attestation(
        this.date,
        this.modifierExtension,
        this.id,
        this.onBehalfOf,
        this.who,
        this.extension,
        this.communicationMethod,
        this.proxySignature,
        this.sourceSignature,
        value,
        this.proxyIdentityCertificate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_Attestation#proxyIdentityCertificate() proxyIdentityCertificate} attribute.
   * @param value The value for proxyIdentityCertificate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Attestation withProxyIdentityCertificate(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "proxyIdentityCertificate");
    if (java.util.Objects.equals(this.proxyIdentityCertificate, newValue)) return this;
    return new ImmutableVerificationResult_Attestation(
        this.date,
        this.modifierExtension,
        this.id,
        this.onBehalfOf,
        this.who,
        this.extension,
        this.communicationMethod,
        this.proxySignature,
        this.sourceSignature,
        this.sourceIdentityCertificate,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_Attestation#proxyIdentityCertificate() proxyIdentityCertificate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for proxyIdentityCertificate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Attestation withProxyIdentityCertificate(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.proxyIdentityCertificate, value)) return this;
    return new ImmutableVerificationResult_Attestation(
        this.date,
        this.modifierExtension,
        this.id,
        this.onBehalfOf,
        this.who,
        this.extension,
        this.communicationMethod,
        this.proxySignature,
        this.sourceSignature,
        this.sourceIdentityCertificate,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableVerificationResult_Attestation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableVerificationResult_Attestation
        && equalTo((ImmutableVerificationResult_Attestation) another);
  }

  private boolean equalTo(ImmutableVerificationResult_Attestation another) {
    return java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(onBehalfOf, another.onBehalfOf)
        && java.util.Objects.equals(who, another.who)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(communicationMethod, another.communicationMethod)
        && java.util.Objects.equals(proxySignature, another.proxySignature)
        && java.util.Objects.equals(sourceSignature, another.sourceSignature)
        && java.util.Objects.equals(sourceIdentityCertificate, another.sourceIdentityCertificate)
        && java.util.Objects.equals(proxyIdentityCertificate, another.proxyIdentityCertificate);
  }

  /**
   * Computes a hash code from attributes: {@code date}, {@code modifierExtension}, {@code id}, {@code onBehalfOf}, {@code who}, {@code extension}, {@code communicationMethod}, {@code proxySignature}, {@code sourceSignature}, {@code sourceIdentityCertificate}, {@code proxyIdentityCertificate}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(onBehalfOf);
    h += (h << 5) + java.util.Objects.hashCode(who);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(communicationMethod);
    h += (h << 5) + java.util.Objects.hashCode(proxySignature);
    h += (h << 5) + java.util.Objects.hashCode(sourceSignature);
    h += (h << 5) + java.util.Objects.hashCode(sourceIdentityCertificate);
    h += (h << 5) + java.util.Objects.hashCode(proxyIdentityCertificate);
    return h;
  }

  /**
   * Prints the immutable value {@code VerificationResult_Attestation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("VerificationResult_Attestation{");
    if (date != null) {
      builder.append("date=").append(date);
    }
    if (modifierExtension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (onBehalfOf != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("onBehalfOf=").append(onBehalfOf);
    }
    if (who != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("who=").append(who);
    }
    if (extension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (communicationMethod != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("communicationMethod=").append(communicationMethod);
    }
    if (proxySignature != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("proxySignature=").append(proxySignature);
    }
    if (sourceSignature != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("sourceSignature=").append(sourceSignature);
    }
    if (sourceIdentityCertificate != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("sourceIdentityCertificate=").append(sourceIdentityCertificate);
    }
    if (proxyIdentityCertificate != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("proxyIdentityCertificate=").append(proxyIdentityCertificate);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "VerificationResult_Attestation", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.VerificationResult_Attestation {
    @javax.annotation.Nullable java.util.Optional<com.fhir.date> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> onBehalfOf = java.util.Optional.empty();
    boolean onBehalfOfIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> who = java.util.Optional.empty();
    boolean whoIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> communicationMethod = java.util.Optional.empty();
    boolean communicationMethodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Signature> proxySignature = java.util.Optional.empty();
    boolean proxySignatureIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Signature> sourceSignature = java.util.Optional.empty();
    boolean sourceSignatureIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> sourceIdentityCertificate = java.util.Optional.empty();
    boolean sourceIdentityCertificateIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> proxyIdentityCertificate = java.util.Optional.empty();
    boolean proxyIdentityCertificateIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.date> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("onBehalfOf")
    public void setOnBehalfOf(java.util.Optional<com.fhir.Reference> onBehalfOf) {
      this.onBehalfOf = onBehalfOf;
      this.onBehalfOfIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("who")
    public void setWho(java.util.Optional<com.fhir.Reference> who) {
      this.who = who;
      this.whoIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("communicationMethod")
    public void setCommunicationMethod(java.util.Optional<com.fhir.CodeableConcept> communicationMethod) {
      this.communicationMethod = communicationMethod;
      this.communicationMethodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("proxySignature")
    public void setProxySignature(java.util.Optional<com.fhir.Signature> proxySignature) {
      this.proxySignature = proxySignature;
      this.proxySignatureIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("sourceSignature")
    public void setSourceSignature(java.util.Optional<com.fhir.Signature> sourceSignature) {
      this.sourceSignature = sourceSignature;
      this.sourceSignatureIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("sourceIdentityCertificate")
    public void setSourceIdentityCertificate(java.util.Optional<java.lang.String> sourceIdentityCertificate) {
      this.sourceIdentityCertificate = sourceIdentityCertificate;
      this.sourceIdentityCertificateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("proxyIdentityCertificate")
    public void setProxyIdentityCertificate(java.util.Optional<java.lang.String> proxyIdentityCertificate) {
      this.proxyIdentityCertificate = proxyIdentityCertificate;
      this.proxyIdentityCertificateIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.date> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> onBehalfOf() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> who() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> communicationMethod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Signature> proxySignature() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Signature> sourceSignature() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> sourceIdentityCertificate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> proxyIdentityCertificate() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableVerificationResult_Attestation fromJson(Json json) {
    ImmutableVerificationResult_Attestation.Builder builder = ImmutableVerificationResult_Attestation.builder();
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.onBehalfOfIsSet) {
      builder.onBehalfOf(json.onBehalfOf);
    }
    if (json.whoIsSet) {
      builder.who(json.who);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.communicationMethodIsSet) {
      builder.communicationMethod(json.communicationMethod);
    }
    if (json.proxySignatureIsSet) {
      builder.proxySignature(json.proxySignature);
    }
    if (json.sourceSignatureIsSet) {
      builder.sourceSignature(json.sourceSignature);
    }
    if (json.sourceIdentityCertificateIsSet) {
      builder.sourceIdentityCertificate(json.sourceIdentityCertificate);
    }
    if (json.proxyIdentityCertificateIsSet) {
      builder.proxyIdentityCertificate(json.proxyIdentityCertificate);
    }
    return (ImmutableVerificationResult_Attestation) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link VerificationResult_Attestation} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable VerificationResult_Attestation instance
   */
  public static VerificationResult_Attestation copyOf(VerificationResult_Attestation instance) {
    if (instance instanceof ImmutableVerificationResult_Attestation) {
      return (ImmutableVerificationResult_Attestation) instance;
    }
    return ImmutableVerificationResult_Attestation.builder()
        .date(instance.date())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .onBehalfOf(instance.onBehalfOf())
        .who(instance.who())
        .extension(instance.extension())
        .communicationMethod(instance.communicationMethod())
        .proxySignature(instance.proxySignature())
        .sourceSignature(instance.sourceSignature())
        .sourceIdentityCertificate(instance.sourceIdentityCertificate())
        .proxyIdentityCertificate(instance.proxyIdentityCertificate())
        .build();
  }

  /**
   * Creates a builder for {@link VerificationResult_Attestation VerificationResult_Attestation}.
   * <pre>
   * ImmutableVerificationResult_Attestation.builder()
   *    .date(com.fhir.date) // optional {@link VerificationResult_Attestation#date() date}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link VerificationResult_Attestation#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link VerificationResult_Attestation#id() id}
   *    .onBehalfOf(com.fhir.Reference) // optional {@link VerificationResult_Attestation#onBehalfOf() onBehalfOf}
   *    .who(com.fhir.Reference) // optional {@link VerificationResult_Attestation#who() who}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link VerificationResult_Attestation#extension() extension}
   *    .communicationMethod(com.fhir.CodeableConcept) // optional {@link VerificationResult_Attestation#communicationMethod() communicationMethod}
   *    .proxySignature(com.fhir.Signature) // optional {@link VerificationResult_Attestation#proxySignature() proxySignature}
   *    .sourceSignature(com.fhir.Signature) // optional {@link VerificationResult_Attestation#sourceSignature() sourceSignature}
   *    .sourceIdentityCertificate(String) // optional {@link VerificationResult_Attestation#sourceIdentityCertificate() sourceIdentityCertificate}
   *    .proxyIdentityCertificate(String) // optional {@link VerificationResult_Attestation#proxyIdentityCertificate() proxyIdentityCertificate}
   *    .build();
   * </pre>
   * @return A new VerificationResult_Attestation builder
   */
  public static ImmutableVerificationResult_Attestation.Builder builder() {
    return new ImmutableVerificationResult_Attestation.Builder();
  }

  /**
   * Builds instances of type {@link VerificationResult_Attestation VerificationResult_Attestation}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "VerificationResult_Attestation", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_DATE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_ON_BEHALF_OF = 0x8L;
    private static final long OPT_BIT_WHO = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_COMMUNICATION_METHOD = 0x40L;
    private static final long OPT_BIT_PROXY_SIGNATURE = 0x80L;
    private static final long OPT_BIT_SOURCE_SIGNATURE = 0x100L;
    private static final long OPT_BIT_SOURCE_IDENTITY_CERTIFICATE = 0x200L;
    private static final long OPT_BIT_PROXY_IDENTITY_CERTIFICATE = 0x400L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.date date;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.Reference onBehalfOf;
    private @javax.annotation.Nullable com.fhir.Reference who;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.CodeableConcept communicationMethod;
    private @javax.annotation.Nullable com.fhir.Signature proxySignature;
    private @javax.annotation.Nullable com.fhir.Signature sourceSignature;
    private @javax.annotation.Nullable java.lang.String sourceIdentityCertificate;
    private @javax.annotation.Nullable java.lang.String proxyIdentityCertificate;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link VerificationResult_Attestation#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    public final Builder date(com.fhir.date date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = java.util.Objects.requireNonNull(date, "date");
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Attestation#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public final Builder date(java.util.Optional<? extends com.fhir.date> date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = date.orElse(null);
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Attestation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link VerificationResult_Attestation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link VerificationResult_Attestation#id() id} to id.
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
     * Initializes the optional value {@link VerificationResult_Attestation#id() id} to id.
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
     * Initializes the optional value {@link VerificationResult_Attestation#onBehalfOf() onBehalfOf} to onBehalfOf.
     * @param onBehalfOf The value for onBehalfOf
     * @return {@code this} builder for chained invocation
     */
    public final Builder onBehalfOf(com.fhir.Reference onBehalfOf) {
      checkNotIsSet(onBehalfOfIsSet(), "onBehalfOf");
      this.onBehalfOf = java.util.Objects.requireNonNull(onBehalfOf, "onBehalfOf");
      optBits |= OPT_BIT_ON_BEHALF_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Attestation#onBehalfOf() onBehalfOf} to onBehalfOf.
     * @param onBehalfOf The value for onBehalfOf
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("onBehalfOf")
    public final Builder onBehalfOf(java.util.Optional<? extends com.fhir.Reference> onBehalfOf) {
      checkNotIsSet(onBehalfOfIsSet(), "onBehalfOf");
      this.onBehalfOf = onBehalfOf.orElse(null);
      optBits |= OPT_BIT_ON_BEHALF_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Attestation#who() who} to who.
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
     * Initializes the optional value {@link VerificationResult_Attestation#who() who} to who.
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
     * Initializes the optional value {@link VerificationResult_Attestation#extension() extension} to extension.
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
     * Initializes the optional value {@link VerificationResult_Attestation#extension() extension} to extension.
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
     * Initializes the optional value {@link VerificationResult_Attestation#communicationMethod() communicationMethod} to communicationMethod.
     * @param communicationMethod The value for communicationMethod
     * @return {@code this} builder for chained invocation
     */
    public final Builder communicationMethod(com.fhir.CodeableConcept communicationMethod) {
      checkNotIsSet(communicationMethodIsSet(), "communicationMethod");
      this.communicationMethod = java.util.Objects.requireNonNull(communicationMethod, "communicationMethod");
      optBits |= OPT_BIT_COMMUNICATION_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Attestation#communicationMethod() communicationMethod} to communicationMethod.
     * @param communicationMethod The value for communicationMethod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("communicationMethod")
    public final Builder communicationMethod(java.util.Optional<? extends com.fhir.CodeableConcept> communicationMethod) {
      checkNotIsSet(communicationMethodIsSet(), "communicationMethod");
      this.communicationMethod = communicationMethod.orElse(null);
      optBits |= OPT_BIT_COMMUNICATION_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Attestation#proxySignature() proxySignature} to proxySignature.
     * @param proxySignature The value for proxySignature
     * @return {@code this} builder for chained invocation
     */
    public final Builder proxySignature(com.fhir.Signature proxySignature) {
      checkNotIsSet(proxySignatureIsSet(), "proxySignature");
      this.proxySignature = java.util.Objects.requireNonNull(proxySignature, "proxySignature");
      optBits |= OPT_BIT_PROXY_SIGNATURE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Attestation#proxySignature() proxySignature} to proxySignature.
     * @param proxySignature The value for proxySignature
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("proxySignature")
    public final Builder proxySignature(java.util.Optional<? extends com.fhir.Signature> proxySignature) {
      checkNotIsSet(proxySignatureIsSet(), "proxySignature");
      this.proxySignature = proxySignature.orElse(null);
      optBits |= OPT_BIT_PROXY_SIGNATURE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Attestation#sourceSignature() sourceSignature} to sourceSignature.
     * @param sourceSignature The value for sourceSignature
     * @return {@code this} builder for chained invocation
     */
    public final Builder sourceSignature(com.fhir.Signature sourceSignature) {
      checkNotIsSet(sourceSignatureIsSet(), "sourceSignature");
      this.sourceSignature = java.util.Objects.requireNonNull(sourceSignature, "sourceSignature");
      optBits |= OPT_BIT_SOURCE_SIGNATURE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Attestation#sourceSignature() sourceSignature} to sourceSignature.
     * @param sourceSignature The value for sourceSignature
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceSignature")
    public final Builder sourceSignature(java.util.Optional<? extends com.fhir.Signature> sourceSignature) {
      checkNotIsSet(sourceSignatureIsSet(), "sourceSignature");
      this.sourceSignature = sourceSignature.orElse(null);
      optBits |= OPT_BIT_SOURCE_SIGNATURE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Attestation#sourceIdentityCertificate() sourceIdentityCertificate} to sourceIdentityCertificate.
     * @param sourceIdentityCertificate The value for sourceIdentityCertificate
     * @return {@code this} builder for chained invocation
     */
    public final Builder sourceIdentityCertificate(java.lang.String sourceIdentityCertificate) {
      checkNotIsSet(sourceIdentityCertificateIsSet(), "sourceIdentityCertificate");
      this.sourceIdentityCertificate = java.util.Objects.requireNonNull(sourceIdentityCertificate, "sourceIdentityCertificate");
      optBits |= OPT_BIT_SOURCE_IDENTITY_CERTIFICATE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Attestation#sourceIdentityCertificate() sourceIdentityCertificate} to sourceIdentityCertificate.
     * @param sourceIdentityCertificate The value for sourceIdentityCertificate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceIdentityCertificate")
    public final Builder sourceIdentityCertificate(java.util.Optional<java.lang.String> sourceIdentityCertificate) {
      checkNotIsSet(sourceIdentityCertificateIsSet(), "sourceIdentityCertificate");
      this.sourceIdentityCertificate = sourceIdentityCertificate.orElse(null);
      optBits |= OPT_BIT_SOURCE_IDENTITY_CERTIFICATE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Attestation#proxyIdentityCertificate() proxyIdentityCertificate} to proxyIdentityCertificate.
     * @param proxyIdentityCertificate The value for proxyIdentityCertificate
     * @return {@code this} builder for chained invocation
     */
    public final Builder proxyIdentityCertificate(java.lang.String proxyIdentityCertificate) {
      checkNotIsSet(proxyIdentityCertificateIsSet(), "proxyIdentityCertificate");
      this.proxyIdentityCertificate = java.util.Objects.requireNonNull(proxyIdentityCertificate, "proxyIdentityCertificate");
      optBits |= OPT_BIT_PROXY_IDENTITY_CERTIFICATE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Attestation#proxyIdentityCertificate() proxyIdentityCertificate} to proxyIdentityCertificate.
     * @param proxyIdentityCertificate The value for proxyIdentityCertificate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("proxyIdentityCertificate")
    public final Builder proxyIdentityCertificate(java.util.Optional<java.lang.String> proxyIdentityCertificate) {
      checkNotIsSet(proxyIdentityCertificateIsSet(), "proxyIdentityCertificate");
      this.proxyIdentityCertificate = proxyIdentityCertificate.orElse(null);
      optBits |= OPT_BIT_PROXY_IDENTITY_CERTIFICATE;
      return this;
    }

    /**
     * Builds a new {@link VerificationResult_Attestation VerificationResult_Attestation}.
     * @return An immutable instance of VerificationResult_Attestation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.VerificationResult_Attestation build() {
      return new ImmutableVerificationResult_Attestation(
          date,
          modifierExtension,
          id,
          onBehalfOf,
          who,
          extension,
          communicationMethod,
          proxySignature,
          sourceSignature,
          sourceIdentityCertificate,
          proxyIdentityCertificate);
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean onBehalfOfIsSet() {
      return (optBits & OPT_BIT_ON_BEHALF_OF) != 0;
    }

    private boolean whoIsSet() {
      return (optBits & OPT_BIT_WHO) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean communicationMethodIsSet() {
      return (optBits & OPT_BIT_COMMUNICATION_METHOD) != 0;
    }

    private boolean proxySignatureIsSet() {
      return (optBits & OPT_BIT_PROXY_SIGNATURE) != 0;
    }

    private boolean sourceSignatureIsSet() {
      return (optBits & OPT_BIT_SOURCE_SIGNATURE) != 0;
    }

    private boolean sourceIdentityCertificateIsSet() {
      return (optBits & OPT_BIT_SOURCE_IDENTITY_CERTIFICATE) != 0;
    }

    private boolean proxyIdentityCertificateIsSet() {
      return (optBits & OPT_BIT_PROXY_IDENTITY_CERTIFICATE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of VerificationResult_Attestation is strict, attribute is already set: ".concat(name));
    }
  }
}

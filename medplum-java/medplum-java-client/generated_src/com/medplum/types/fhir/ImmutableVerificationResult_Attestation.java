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
 * Immutable implementation of {@link VerificationResult_Attestation}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableVerificationResult_Attestation.builder()}.
 */
@Generated(from = "VerificationResult_Attestation", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableVerificationResult_Attestation
    implements VerificationResult_Attestation {
  private final @Nullable String proxyIdentityCertificate;
  private final @Nullable String id;
  private final @Nullable Signature sourceSignature;
  private final @Nullable Reference onBehalfOf;
  private final @Nullable Signature proxySignature;
  private final @Nullable Reference who;
  private final @Nullable List<Extension> extension;
  private final @Nullable CodeableConcept communicationMethod;
  private final @Nullable Date date;
  private final @Nullable String sourceIdentityCertificate;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableVerificationResult_Attestation(
      @Nullable String proxyIdentityCertificate,
      @Nullable String id,
      @Nullable Signature sourceSignature,
      @Nullable Reference onBehalfOf,
      @Nullable Signature proxySignature,
      @Nullable Reference who,
      @Nullable List<Extension> extension,
      @Nullable CodeableConcept communicationMethod,
      @Nullable Date date,
      @Nullable String sourceIdentityCertificate,
      @Nullable List<Extension> modifierExtension) {
    this.proxyIdentityCertificate = proxyIdentityCertificate;
    this.id = id;
    this.sourceSignature = sourceSignature;
    this.onBehalfOf = onBehalfOf;
    this.proxySignature = proxySignature;
    this.who = who;
    this.extension = extension;
    this.communicationMethod = communicationMethod;
    this.date = date;
    this.sourceIdentityCertificate = sourceIdentityCertificate;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code proxyIdentityCertificate} attribute
   */
  @JsonProperty("proxyIdentityCertificate")
  @Override
  public Optional<String> proxyIdentityCertificate() {
    return Optional.ofNullable(proxyIdentityCertificate);
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
   * @return The value of the {@code sourceSignature} attribute
   */
  @JsonProperty("sourceSignature")
  @Override
  public Optional<Signature> sourceSignature() {
    return Optional.ofNullable(sourceSignature);
  }

  /**
   * @return The value of the {@code onBehalfOf} attribute
   */
  @JsonProperty("onBehalfOf")
  @Override
  public Optional<Reference> onBehalfOf() {
    return Optional.ofNullable(onBehalfOf);
  }

  /**
   * @return The value of the {@code proxySignature} attribute
   */
  @JsonProperty("proxySignature")
  @Override
  public Optional<Signature> proxySignature() {
    return Optional.ofNullable(proxySignature);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code communicationMethod} attribute
   */
  @JsonProperty("communicationMethod")
  @Override
  public Optional<CodeableConcept> communicationMethod() {
    return Optional.ofNullable(communicationMethod);
  }

  /**
   * @return The value of the {@code date} attribute
   */
  @JsonProperty("date")
  @Override
  public Optional<Date> date() {
    return Optional.ofNullable(date);
  }

  /**
   * @return The value of the {@code sourceIdentityCertificate} attribute
   */
  @JsonProperty("sourceIdentityCertificate")
  @Override
  public Optional<String> sourceIdentityCertificate() {
    return Optional.ofNullable(sourceIdentityCertificate);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_Attestation#proxyIdentityCertificate() proxyIdentityCertificate} attribute.
   * @param value The value for proxyIdentityCertificate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Attestation withProxyIdentityCertificate(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "proxyIdentityCertificate");
    if (Objects.equals(this.proxyIdentityCertificate, newValue)) return this;
    return new ImmutableVerificationResult_Attestation(
        newValue,
        this.id,
        this.sourceSignature,
        this.onBehalfOf,
        this.proxySignature,
        this.who,
        this.extension,
        this.communicationMethod,
        this.date,
        this.sourceIdentityCertificate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_Attestation#proxyIdentityCertificate() proxyIdentityCertificate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for proxyIdentityCertificate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Attestation withProxyIdentityCertificate(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.proxyIdentityCertificate, value)) return this;
    return new ImmutableVerificationResult_Attestation(
        value,
        this.id,
        this.sourceSignature,
        this.onBehalfOf,
        this.proxySignature,
        this.who,
        this.extension,
        this.communicationMethod,
        this.date,
        this.sourceIdentityCertificate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_Attestation#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Attestation withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableVerificationResult_Attestation(
        this.proxyIdentityCertificate,
        newValue,
        this.sourceSignature,
        this.onBehalfOf,
        this.proxySignature,
        this.who,
        this.extension,
        this.communicationMethod,
        this.date,
        this.sourceIdentityCertificate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_Attestation#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Attestation withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableVerificationResult_Attestation(
        this.proxyIdentityCertificate,
        value,
        this.sourceSignature,
        this.onBehalfOf,
        this.proxySignature,
        this.who,
        this.extension,
        this.communicationMethod,
        this.date,
        this.sourceIdentityCertificate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_Attestation#sourceSignature() sourceSignature} attribute.
   * @param value The value for sourceSignature
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Attestation withSourceSignature(Signature value) {
    @Nullable Signature newValue = Objects.requireNonNull(value, "sourceSignature");
    if (this.sourceSignature == newValue) return this;
    return new ImmutableVerificationResult_Attestation(
        this.proxyIdentityCertificate,
        this.id,
        newValue,
        this.onBehalfOf,
        this.proxySignature,
        this.who,
        this.extension,
        this.communicationMethod,
        this.date,
        this.sourceIdentityCertificate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_Attestation#sourceSignature() sourceSignature} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sourceSignature
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_Attestation withSourceSignature(Optional<? extends Signature> optional) {
    @Nullable Signature value = optional.orElse(null);
    if (this.sourceSignature == value) return this;
    return new ImmutableVerificationResult_Attestation(
        this.proxyIdentityCertificate,
        this.id,
        value,
        this.onBehalfOf,
        this.proxySignature,
        this.who,
        this.extension,
        this.communicationMethod,
        this.date,
        this.sourceIdentityCertificate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_Attestation#onBehalfOf() onBehalfOf} attribute.
   * @param value The value for onBehalfOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Attestation withOnBehalfOf(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "onBehalfOf");
    if (this.onBehalfOf == newValue) return this;
    return new ImmutableVerificationResult_Attestation(
        this.proxyIdentityCertificate,
        this.id,
        this.sourceSignature,
        newValue,
        this.proxySignature,
        this.who,
        this.extension,
        this.communicationMethod,
        this.date,
        this.sourceIdentityCertificate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_Attestation#onBehalfOf() onBehalfOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onBehalfOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_Attestation withOnBehalfOf(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.onBehalfOf == value) return this;
    return new ImmutableVerificationResult_Attestation(
        this.proxyIdentityCertificate,
        this.id,
        this.sourceSignature,
        value,
        this.proxySignature,
        this.who,
        this.extension,
        this.communicationMethod,
        this.date,
        this.sourceIdentityCertificate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_Attestation#proxySignature() proxySignature} attribute.
   * @param value The value for proxySignature
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Attestation withProxySignature(Signature value) {
    @Nullable Signature newValue = Objects.requireNonNull(value, "proxySignature");
    if (this.proxySignature == newValue) return this;
    return new ImmutableVerificationResult_Attestation(
        this.proxyIdentityCertificate,
        this.id,
        this.sourceSignature,
        this.onBehalfOf,
        newValue,
        this.who,
        this.extension,
        this.communicationMethod,
        this.date,
        this.sourceIdentityCertificate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_Attestation#proxySignature() proxySignature} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for proxySignature
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_Attestation withProxySignature(Optional<? extends Signature> optional) {
    @Nullable Signature value = optional.orElse(null);
    if (this.proxySignature == value) return this;
    return new ImmutableVerificationResult_Attestation(
        this.proxyIdentityCertificate,
        this.id,
        this.sourceSignature,
        this.onBehalfOf,
        value,
        this.who,
        this.extension,
        this.communicationMethod,
        this.date,
        this.sourceIdentityCertificate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_Attestation#who() who} attribute.
   * @param value The value for who
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Attestation withWho(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "who");
    if (this.who == newValue) return this;
    return new ImmutableVerificationResult_Attestation(
        this.proxyIdentityCertificate,
        this.id,
        this.sourceSignature,
        this.onBehalfOf,
        this.proxySignature,
        newValue,
        this.extension,
        this.communicationMethod,
        this.date,
        this.sourceIdentityCertificate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_Attestation#who() who} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for who
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_Attestation withWho(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.who == value) return this;
    return new ImmutableVerificationResult_Attestation(
        this.proxyIdentityCertificate,
        this.id,
        this.sourceSignature,
        this.onBehalfOf,
        this.proxySignature,
        value,
        this.extension,
        this.communicationMethod,
        this.date,
        this.sourceIdentityCertificate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_Attestation#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Attestation withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableVerificationResult_Attestation(
        this.proxyIdentityCertificate,
        this.id,
        this.sourceSignature,
        this.onBehalfOf,
        this.proxySignature,
        this.who,
        newValue,
        this.communicationMethod,
        this.date,
        this.sourceIdentityCertificate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_Attestation#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_Attestation withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableVerificationResult_Attestation(
        this.proxyIdentityCertificate,
        this.id,
        this.sourceSignature,
        this.onBehalfOf,
        this.proxySignature,
        this.who,
        value,
        this.communicationMethod,
        this.date,
        this.sourceIdentityCertificate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_Attestation#communicationMethod() communicationMethod} attribute.
   * @param value The value for communicationMethod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Attestation withCommunicationMethod(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "communicationMethod");
    if (this.communicationMethod == newValue) return this;
    return new ImmutableVerificationResult_Attestation(
        this.proxyIdentityCertificate,
        this.id,
        this.sourceSignature,
        this.onBehalfOf,
        this.proxySignature,
        this.who,
        this.extension,
        newValue,
        this.date,
        this.sourceIdentityCertificate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_Attestation#communicationMethod() communicationMethod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for communicationMethod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_Attestation withCommunicationMethod(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.communicationMethod == value) return this;
    return new ImmutableVerificationResult_Attestation(
        this.proxyIdentityCertificate,
        this.id,
        this.sourceSignature,
        this.onBehalfOf,
        this.proxySignature,
        this.who,
        this.extension,
        value,
        this.date,
        this.sourceIdentityCertificate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_Attestation#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Attestation withDate(Date value) {
    @Nullable Date newValue = Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableVerificationResult_Attestation(
        this.proxyIdentityCertificate,
        this.id,
        this.sourceSignature,
        this.onBehalfOf,
        this.proxySignature,
        this.who,
        this.extension,
        this.communicationMethod,
        newValue,
        this.sourceIdentityCertificate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_Attestation#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_Attestation withDate(Optional<? extends Date> optional) {
    @Nullable Date value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableVerificationResult_Attestation(
        this.proxyIdentityCertificate,
        this.id,
        this.sourceSignature,
        this.onBehalfOf,
        this.proxySignature,
        this.who,
        this.extension,
        this.communicationMethod,
        value,
        this.sourceIdentityCertificate,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_Attestation#sourceIdentityCertificate() sourceIdentityCertificate} attribute.
   * @param value The value for sourceIdentityCertificate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Attestation withSourceIdentityCertificate(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "sourceIdentityCertificate");
    if (Objects.equals(this.sourceIdentityCertificate, newValue)) return this;
    return new ImmutableVerificationResult_Attestation(
        this.proxyIdentityCertificate,
        this.id,
        this.sourceSignature,
        this.onBehalfOf,
        this.proxySignature,
        this.who,
        this.extension,
        this.communicationMethod,
        this.date,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_Attestation#sourceIdentityCertificate() sourceIdentityCertificate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sourceIdentityCertificate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Attestation withSourceIdentityCertificate(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.sourceIdentityCertificate, value)) return this;
    return new ImmutableVerificationResult_Attestation(
        this.proxyIdentityCertificate,
        this.id,
        this.sourceSignature,
        this.onBehalfOf,
        this.proxySignature,
        this.who,
        this.extension,
        this.communicationMethod,
        this.date,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_Attestation#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Attestation withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableVerificationResult_Attestation(
        this.proxyIdentityCertificate,
        this.id,
        this.sourceSignature,
        this.onBehalfOf,
        this.proxySignature,
        this.who,
        this.extension,
        this.communicationMethod,
        this.date,
        this.sourceIdentityCertificate,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link VerificationResult_Attestation#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableVerificationResult_Attestation withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableVerificationResult_Attestation(
        this.proxyIdentityCertificate,
        this.id,
        this.sourceSignature,
        this.onBehalfOf,
        this.proxySignature,
        this.who,
        this.extension,
        this.communicationMethod,
        this.date,
        this.sourceIdentityCertificate,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableVerificationResult_Attestation} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableVerificationResult_Attestation
        && equalTo((ImmutableVerificationResult_Attestation) another);
  }

  private boolean equalTo(ImmutableVerificationResult_Attestation another) {
    return Objects.equals(proxyIdentityCertificate, another.proxyIdentityCertificate)
        && Objects.equals(id, another.id)
        && Objects.equals(sourceSignature, another.sourceSignature)
        && Objects.equals(onBehalfOf, another.onBehalfOf)
        && Objects.equals(proxySignature, another.proxySignature)
        && Objects.equals(who, another.who)
        && Objects.equals(extension, another.extension)
        && Objects.equals(communicationMethod, another.communicationMethod)
        && Objects.equals(date, another.date)
        && Objects.equals(sourceIdentityCertificate, another.sourceIdentityCertificate)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code proxyIdentityCertificate}, {@code id}, {@code sourceSignature}, {@code onBehalfOf}, {@code proxySignature}, {@code who}, {@code extension}, {@code communicationMethod}, {@code date}, {@code sourceIdentityCertificate}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(proxyIdentityCertificate);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(sourceSignature);
    h += (h << 5) + Objects.hashCode(onBehalfOf);
    h += (h << 5) + Objects.hashCode(proxySignature);
    h += (h << 5) + Objects.hashCode(who);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(communicationMethod);
    h += (h << 5) + Objects.hashCode(date);
    h += (h << 5) + Objects.hashCode(sourceIdentityCertificate);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code VerificationResult_Attestation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("VerificationResult_Attestation{");
    if (proxyIdentityCertificate != null) {
      builder.append("proxyIdentityCertificate=").append(proxyIdentityCertificate);
    }
    if (id != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (sourceSignature != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("sourceSignature=").append(sourceSignature);
    }
    if (onBehalfOf != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("onBehalfOf=").append(onBehalfOf);
    }
    if (proxySignature != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("proxySignature=").append(proxySignature);
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
    if (date != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (sourceIdentityCertificate != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("sourceIdentityCertificate=").append(sourceIdentityCertificate);
    }
    if (modifierExtension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "VerificationResult_Attestation", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements VerificationResult_Attestation {
    @Nullable Optional<String> proxyIdentityCertificate = Optional.empty();
    boolean proxyIdentityCertificateIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Signature> sourceSignature = Optional.empty();
    boolean sourceSignatureIsSet;
    @Nullable Optional<Reference> onBehalfOf = Optional.empty();
    boolean onBehalfOfIsSet;
    @Nullable Optional<Signature> proxySignature = Optional.empty();
    boolean proxySignatureIsSet;
    @Nullable Optional<Reference> who = Optional.empty();
    boolean whoIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CodeableConcept> communicationMethod = Optional.empty();
    boolean communicationMethodIsSet;
    @Nullable Optional<Date> date = Optional.empty();
    boolean dateIsSet;
    @Nullable Optional<String> sourceIdentityCertificate = Optional.empty();
    boolean sourceIdentityCertificateIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("proxyIdentityCertificate")
    public void setProxyIdentityCertificate(Optional<String> proxyIdentityCertificate) {
      this.proxyIdentityCertificate = proxyIdentityCertificate;
      this.proxyIdentityCertificateIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("sourceSignature")
    public void setSourceSignature(Optional<Signature> sourceSignature) {
      this.sourceSignature = sourceSignature;
      this.sourceSignatureIsSet = true;
    }
    @JsonProperty("onBehalfOf")
    public void setOnBehalfOf(Optional<Reference> onBehalfOf) {
      this.onBehalfOf = onBehalfOf;
      this.onBehalfOfIsSet = true;
    }
    @JsonProperty("proxySignature")
    public void setProxySignature(Optional<Signature> proxySignature) {
      this.proxySignature = proxySignature;
      this.proxySignatureIsSet = true;
    }
    @JsonProperty("who")
    public void setWho(Optional<Reference> who) {
      this.who = who;
      this.whoIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("communicationMethod")
    public void setCommunicationMethod(Optional<CodeableConcept> communicationMethod) {
      this.communicationMethod = communicationMethod;
      this.communicationMethodIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<Date> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @JsonProperty("sourceIdentityCertificate")
    public void setSourceIdentityCertificate(Optional<String> sourceIdentityCertificate) {
      this.sourceIdentityCertificate = sourceIdentityCertificate;
      this.sourceIdentityCertificateIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<String> proxyIdentityCertificate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Signature> sourceSignature() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> onBehalfOf() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Signature> proxySignature() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> who() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> communicationMethod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> date() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> sourceIdentityCertificate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableVerificationResult_Attestation fromJson(Json json) {
    ImmutableVerificationResult_Attestation.Builder builder = ImmutableVerificationResult_Attestation.builder();
    if (json.proxyIdentityCertificateIsSet) {
      builder.proxyIdentityCertificate(json.proxyIdentityCertificate);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.sourceSignatureIsSet) {
      builder.sourceSignature(json.sourceSignature);
    }
    if (json.onBehalfOfIsSet) {
      builder.onBehalfOf(json.onBehalfOf);
    }
    if (json.proxySignatureIsSet) {
      builder.proxySignature(json.proxySignature);
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
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.sourceIdentityCertificateIsSet) {
      builder.sourceIdentityCertificate(json.sourceIdentityCertificate);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
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
        .proxyIdentityCertificate(instance.proxyIdentityCertificate())
        .id(instance.id())
        .sourceSignature(instance.sourceSignature())
        .onBehalfOf(instance.onBehalfOf())
        .proxySignature(instance.proxySignature())
        .who(instance.who())
        .extension(instance.extension())
        .communicationMethod(instance.communicationMethod())
        .date(instance.date())
        .sourceIdentityCertificate(instance.sourceIdentityCertificate())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link VerificationResult_Attestation VerificationResult_Attestation}.
   * <pre>
   * ImmutableVerificationResult_Attestation.builder()
   *    .proxyIdentityCertificate(String) // optional {@link VerificationResult_Attestation#proxyIdentityCertificate() proxyIdentityCertificate}
   *    .id(String) // optional {@link VerificationResult_Attestation#id() id}
   *    .sourceSignature(com.medplum.types.fhir.Signature) // optional {@link VerificationResult_Attestation#sourceSignature() sourceSignature}
   *    .onBehalfOf(com.medplum.types.fhir.Reference) // optional {@link VerificationResult_Attestation#onBehalfOf() onBehalfOf}
   *    .proxySignature(com.medplum.types.fhir.Signature) // optional {@link VerificationResult_Attestation#proxySignature() proxySignature}
   *    .who(com.medplum.types.fhir.Reference) // optional {@link VerificationResult_Attestation#who() who}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link VerificationResult_Attestation#extension() extension}
   *    .communicationMethod(com.medplum.types.fhir.CodeableConcept) // optional {@link VerificationResult_Attestation#communicationMethod() communicationMethod}
   *    .date(com.medplum.types.fhir.Date) // optional {@link VerificationResult_Attestation#date() date}
   *    .sourceIdentityCertificate(String) // optional {@link VerificationResult_Attestation#sourceIdentityCertificate() sourceIdentityCertificate}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link VerificationResult_Attestation#modifierExtension() modifierExtension}
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
  @Generated(from = "VerificationResult_Attestation", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_PROXY_IDENTITY_CERTIFICATE = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_SOURCE_SIGNATURE = 0x4L;
    private static final long OPT_BIT_ON_BEHALF_OF = 0x8L;
    private static final long OPT_BIT_PROXY_SIGNATURE = 0x10L;
    private static final long OPT_BIT_WHO = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_COMMUNICATION_METHOD = 0x80L;
    private static final long OPT_BIT_DATE = 0x100L;
    private static final long OPT_BIT_SOURCE_IDENTITY_CERTIFICATE = 0x200L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x400L;
    private long optBits;

    private @Nullable String proxyIdentityCertificate;
    private @Nullable String id;
    private @Nullable Signature sourceSignature;
    private @Nullable Reference onBehalfOf;
    private @Nullable Signature proxySignature;
    private @Nullable Reference who;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept communicationMethod;
    private @Nullable Date date;
    private @Nullable String sourceIdentityCertificate;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link VerificationResult_Attestation#proxyIdentityCertificate() proxyIdentityCertificate} to proxyIdentityCertificate.
     * @param proxyIdentityCertificate The value for proxyIdentityCertificate
     * @return {@code this} builder for chained invocation
     */
    public final Builder proxyIdentityCertificate(String proxyIdentityCertificate) {
      checkNotIsSet(proxyIdentityCertificateIsSet(), "proxyIdentityCertificate");
      this.proxyIdentityCertificate = Objects.requireNonNull(proxyIdentityCertificate, "proxyIdentityCertificate");
      optBits |= OPT_BIT_PROXY_IDENTITY_CERTIFICATE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Attestation#proxyIdentityCertificate() proxyIdentityCertificate} to proxyIdentityCertificate.
     * @param proxyIdentityCertificate The value for proxyIdentityCertificate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("proxyIdentityCertificate")
    public final Builder proxyIdentityCertificate(Optional<String> proxyIdentityCertificate) {
      checkNotIsSet(proxyIdentityCertificateIsSet(), "proxyIdentityCertificate");
      this.proxyIdentityCertificate = proxyIdentityCertificate.orElse(null);
      optBits |= OPT_BIT_PROXY_IDENTITY_CERTIFICATE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Attestation#id() id} to id.
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
     * Initializes the optional value {@link VerificationResult_Attestation#id() id} to id.
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
     * Initializes the optional value {@link VerificationResult_Attestation#sourceSignature() sourceSignature} to sourceSignature.
     * @param sourceSignature The value for sourceSignature
     * @return {@code this} builder for chained invocation
     */
    public final Builder sourceSignature(Signature sourceSignature) {
      checkNotIsSet(sourceSignatureIsSet(), "sourceSignature");
      this.sourceSignature = Objects.requireNonNull(sourceSignature, "sourceSignature");
      optBits |= OPT_BIT_SOURCE_SIGNATURE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Attestation#sourceSignature() sourceSignature} to sourceSignature.
     * @param sourceSignature The value for sourceSignature
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sourceSignature")
    public final Builder sourceSignature(Optional<? extends Signature> sourceSignature) {
      checkNotIsSet(sourceSignatureIsSet(), "sourceSignature");
      this.sourceSignature = sourceSignature.orElse(null);
      optBits |= OPT_BIT_SOURCE_SIGNATURE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Attestation#onBehalfOf() onBehalfOf} to onBehalfOf.
     * @param onBehalfOf The value for onBehalfOf
     * @return {@code this} builder for chained invocation
     */
    public final Builder onBehalfOf(Reference onBehalfOf) {
      checkNotIsSet(onBehalfOfIsSet(), "onBehalfOf");
      this.onBehalfOf = Objects.requireNonNull(onBehalfOf, "onBehalfOf");
      optBits |= OPT_BIT_ON_BEHALF_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Attestation#onBehalfOf() onBehalfOf} to onBehalfOf.
     * @param onBehalfOf The value for onBehalfOf
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("onBehalfOf")
    public final Builder onBehalfOf(Optional<? extends Reference> onBehalfOf) {
      checkNotIsSet(onBehalfOfIsSet(), "onBehalfOf");
      this.onBehalfOf = onBehalfOf.orElse(null);
      optBits |= OPT_BIT_ON_BEHALF_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Attestation#proxySignature() proxySignature} to proxySignature.
     * @param proxySignature The value for proxySignature
     * @return {@code this} builder for chained invocation
     */
    public final Builder proxySignature(Signature proxySignature) {
      checkNotIsSet(proxySignatureIsSet(), "proxySignature");
      this.proxySignature = Objects.requireNonNull(proxySignature, "proxySignature");
      optBits |= OPT_BIT_PROXY_SIGNATURE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Attestation#proxySignature() proxySignature} to proxySignature.
     * @param proxySignature The value for proxySignature
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("proxySignature")
    public final Builder proxySignature(Optional<? extends Signature> proxySignature) {
      checkNotIsSet(proxySignatureIsSet(), "proxySignature");
      this.proxySignature = proxySignature.orElse(null);
      optBits |= OPT_BIT_PROXY_SIGNATURE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Attestation#who() who} to who.
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
     * Initializes the optional value {@link VerificationResult_Attestation#who() who} to who.
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
     * Initializes the optional value {@link VerificationResult_Attestation#extension() extension} to extension.
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
     * Initializes the optional value {@link VerificationResult_Attestation#extension() extension} to extension.
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
     * Initializes the optional value {@link VerificationResult_Attestation#communicationMethod() communicationMethod} to communicationMethod.
     * @param communicationMethod The value for communicationMethod
     * @return {@code this} builder for chained invocation
     */
    public final Builder communicationMethod(CodeableConcept communicationMethod) {
      checkNotIsSet(communicationMethodIsSet(), "communicationMethod");
      this.communicationMethod = Objects.requireNonNull(communicationMethod, "communicationMethod");
      optBits |= OPT_BIT_COMMUNICATION_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Attestation#communicationMethod() communicationMethod} to communicationMethod.
     * @param communicationMethod The value for communicationMethod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("communicationMethod")
    public final Builder communicationMethod(Optional<? extends CodeableConcept> communicationMethod) {
      checkNotIsSet(communicationMethodIsSet(), "communicationMethod");
      this.communicationMethod = communicationMethod.orElse(null);
      optBits |= OPT_BIT_COMMUNICATION_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Attestation#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    public final Builder date(Date date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = Objects.requireNonNull(date, "date");
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Attestation#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("date")
    public final Builder date(Optional<? extends Date> date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = date.orElse(null);
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Attestation#sourceIdentityCertificate() sourceIdentityCertificate} to sourceIdentityCertificate.
     * @param sourceIdentityCertificate The value for sourceIdentityCertificate
     * @return {@code this} builder for chained invocation
     */
    public final Builder sourceIdentityCertificate(String sourceIdentityCertificate) {
      checkNotIsSet(sourceIdentityCertificateIsSet(), "sourceIdentityCertificate");
      this.sourceIdentityCertificate = Objects.requireNonNull(sourceIdentityCertificate, "sourceIdentityCertificate");
      optBits |= OPT_BIT_SOURCE_IDENTITY_CERTIFICATE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Attestation#sourceIdentityCertificate() sourceIdentityCertificate} to sourceIdentityCertificate.
     * @param sourceIdentityCertificate The value for sourceIdentityCertificate
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sourceIdentityCertificate")
    public final Builder sourceIdentityCertificate(Optional<String> sourceIdentityCertificate) {
      checkNotIsSet(sourceIdentityCertificateIsSet(), "sourceIdentityCertificate");
      this.sourceIdentityCertificate = sourceIdentityCertificate.orElse(null);
      optBits |= OPT_BIT_SOURCE_IDENTITY_CERTIFICATE;
      return this;
    }

    /**
     * Initializes the optional value {@link VerificationResult_Attestation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link VerificationResult_Attestation#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link VerificationResult_Attestation VerificationResult_Attestation}.
     * @return An immutable instance of VerificationResult_Attestation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public VerificationResult_Attestation build() {
      return new ImmutableVerificationResult_Attestation(
          proxyIdentityCertificate,
          id,
          sourceSignature,
          onBehalfOf,
          proxySignature,
          who,
          extension,
          communicationMethod,
          date,
          sourceIdentityCertificate,
          modifierExtension);
    }

    private boolean proxyIdentityCertificateIsSet() {
      return (optBits & OPT_BIT_PROXY_IDENTITY_CERTIFICATE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean sourceSignatureIsSet() {
      return (optBits & OPT_BIT_SOURCE_SIGNATURE) != 0;
    }

    private boolean onBehalfOfIsSet() {
      return (optBits & OPT_BIT_ON_BEHALF_OF) != 0;
    }

    private boolean proxySignatureIsSet() {
      return (optBits & OPT_BIT_PROXY_SIGNATURE) != 0;
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

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean sourceIdentityCertificateIsSet() {
      return (optBits & OPT_BIT_SOURCE_IDENTITY_CERTIFICATE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of VerificationResult_Attestation is strict, attribute is already set: ".concat(name));
    }
  }
}

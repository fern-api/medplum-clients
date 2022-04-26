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
  private final @Nullable String sourceIdentityCertificate;
  private final @Nullable Reference who;
  private final @Nullable Signature sourceSignature;
  private final @Nullable Signature proxySignature;
  private final @Nullable CodeableConcept communicationMethod;
  private final @Nullable Reference onBehalfOf;
  private final @Nullable String proxyIdentityCertificate;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable Date date;

  private ImmutableVerificationResult_Attestation(
      @Nullable String sourceIdentityCertificate,
      @Nullable Reference who,
      @Nullable Signature sourceSignature,
      @Nullable Signature proxySignature,
      @Nullable CodeableConcept communicationMethod,
      @Nullable Reference onBehalfOf,
      @Nullable String proxyIdentityCertificate,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable Date date) {
    this.sourceIdentityCertificate = sourceIdentityCertificate;
    this.who = who;
    this.sourceSignature = sourceSignature;
    this.proxySignature = proxySignature;
    this.communicationMethod = communicationMethod;
    this.onBehalfOf = onBehalfOf;
    this.proxyIdentityCertificate = proxyIdentityCertificate;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.extension = extension;
    this.date = date;
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
   * @return The value of the {@code who} attribute
   */
  @JsonProperty("who")
  @Override
  public Optional<Reference> who() {
    return Optional.ofNullable(who);
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
   * @return The value of the {@code proxySignature} attribute
   */
  @JsonProperty("proxySignature")
  @Override
  public Optional<Signature> proxySignature() {
    return Optional.ofNullable(proxySignature);
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
   * @return The value of the {@code onBehalfOf} attribute
   */
  @JsonProperty("onBehalfOf")
  @Override
  public Optional<Reference> onBehalfOf() {
    return Optional.ofNullable(onBehalfOf);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link VerificationResult_Attestation#sourceIdentityCertificate() sourceIdentityCertificate} attribute.
   * @param value The value for sourceIdentityCertificate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableVerificationResult_Attestation withSourceIdentityCertificate(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "sourceIdentityCertificate");
    if (Objects.equals(this.sourceIdentityCertificate, newValue)) return this;
    return new ImmutableVerificationResult_Attestation(
        newValue,
        this.who,
        this.sourceSignature,
        this.proxySignature,
        this.communicationMethod,
        this.onBehalfOf,
        this.proxyIdentityCertificate,
        this.modifierExtension,
        this.id,
        this.extension,
        this.date);
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
        value,
        this.who,
        this.sourceSignature,
        this.proxySignature,
        this.communicationMethod,
        this.onBehalfOf,
        this.proxyIdentityCertificate,
        this.modifierExtension,
        this.id,
        this.extension,
        this.date);
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
        this.sourceIdentityCertificate,
        newValue,
        this.sourceSignature,
        this.proxySignature,
        this.communicationMethod,
        this.onBehalfOf,
        this.proxyIdentityCertificate,
        this.modifierExtension,
        this.id,
        this.extension,
        this.date);
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
        this.sourceIdentityCertificate,
        value,
        this.sourceSignature,
        this.proxySignature,
        this.communicationMethod,
        this.onBehalfOf,
        this.proxyIdentityCertificate,
        this.modifierExtension,
        this.id,
        this.extension,
        this.date);
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
        this.sourceIdentityCertificate,
        this.who,
        newValue,
        this.proxySignature,
        this.communicationMethod,
        this.onBehalfOf,
        this.proxyIdentityCertificate,
        this.modifierExtension,
        this.id,
        this.extension,
        this.date);
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
        this.sourceIdentityCertificate,
        this.who,
        value,
        this.proxySignature,
        this.communicationMethod,
        this.onBehalfOf,
        this.proxyIdentityCertificate,
        this.modifierExtension,
        this.id,
        this.extension,
        this.date);
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
        this.sourceIdentityCertificate,
        this.who,
        this.sourceSignature,
        newValue,
        this.communicationMethod,
        this.onBehalfOf,
        this.proxyIdentityCertificate,
        this.modifierExtension,
        this.id,
        this.extension,
        this.date);
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
        this.sourceIdentityCertificate,
        this.who,
        this.sourceSignature,
        value,
        this.communicationMethod,
        this.onBehalfOf,
        this.proxyIdentityCertificate,
        this.modifierExtension,
        this.id,
        this.extension,
        this.date);
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
        this.sourceIdentityCertificate,
        this.who,
        this.sourceSignature,
        this.proxySignature,
        newValue,
        this.onBehalfOf,
        this.proxyIdentityCertificate,
        this.modifierExtension,
        this.id,
        this.extension,
        this.date);
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
        this.sourceIdentityCertificate,
        this.who,
        this.sourceSignature,
        this.proxySignature,
        value,
        this.onBehalfOf,
        this.proxyIdentityCertificate,
        this.modifierExtension,
        this.id,
        this.extension,
        this.date);
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
        this.sourceIdentityCertificate,
        this.who,
        this.sourceSignature,
        this.proxySignature,
        this.communicationMethod,
        newValue,
        this.proxyIdentityCertificate,
        this.modifierExtension,
        this.id,
        this.extension,
        this.date);
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
        this.sourceIdentityCertificate,
        this.who,
        this.sourceSignature,
        this.proxySignature,
        this.communicationMethod,
        value,
        this.proxyIdentityCertificate,
        this.modifierExtension,
        this.id,
        this.extension,
        this.date);
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
        this.sourceIdentityCertificate,
        this.who,
        this.sourceSignature,
        this.proxySignature,
        this.communicationMethod,
        this.onBehalfOf,
        newValue,
        this.modifierExtension,
        this.id,
        this.extension,
        this.date);
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
        this.sourceIdentityCertificate,
        this.who,
        this.sourceSignature,
        this.proxySignature,
        this.communicationMethod,
        this.onBehalfOf,
        value,
        this.modifierExtension,
        this.id,
        this.extension,
        this.date);
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
        this.sourceIdentityCertificate,
        this.who,
        this.sourceSignature,
        this.proxySignature,
        this.communicationMethod,
        this.onBehalfOf,
        this.proxyIdentityCertificate,
        newValue,
        this.id,
        this.extension,
        this.date);
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
        this.sourceIdentityCertificate,
        this.who,
        this.sourceSignature,
        this.proxySignature,
        this.communicationMethod,
        this.onBehalfOf,
        this.proxyIdentityCertificate,
        value,
        this.id,
        this.extension,
        this.date);
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
        this.sourceIdentityCertificate,
        this.who,
        this.sourceSignature,
        this.proxySignature,
        this.communicationMethod,
        this.onBehalfOf,
        this.proxyIdentityCertificate,
        this.modifierExtension,
        newValue,
        this.extension,
        this.date);
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
        this.sourceIdentityCertificate,
        this.who,
        this.sourceSignature,
        this.proxySignature,
        this.communicationMethod,
        this.onBehalfOf,
        this.proxyIdentityCertificate,
        this.modifierExtension,
        value,
        this.extension,
        this.date);
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
        this.sourceIdentityCertificate,
        this.who,
        this.sourceSignature,
        this.proxySignature,
        this.communicationMethod,
        this.onBehalfOf,
        this.proxyIdentityCertificate,
        this.modifierExtension,
        this.id,
        newValue,
        this.date);
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
        this.sourceIdentityCertificate,
        this.who,
        this.sourceSignature,
        this.proxySignature,
        this.communicationMethod,
        this.onBehalfOf,
        this.proxyIdentityCertificate,
        this.modifierExtension,
        this.id,
        value,
        this.date);
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
        this.sourceIdentityCertificate,
        this.who,
        this.sourceSignature,
        this.proxySignature,
        this.communicationMethod,
        this.onBehalfOf,
        this.proxyIdentityCertificate,
        this.modifierExtension,
        this.id,
        this.extension,
        newValue);
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
        this.sourceIdentityCertificate,
        this.who,
        this.sourceSignature,
        this.proxySignature,
        this.communicationMethod,
        this.onBehalfOf,
        this.proxyIdentityCertificate,
        this.modifierExtension,
        this.id,
        this.extension,
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
    return Objects.equals(sourceIdentityCertificate, another.sourceIdentityCertificate)
        && Objects.equals(who, another.who)
        && Objects.equals(sourceSignature, another.sourceSignature)
        && Objects.equals(proxySignature, another.proxySignature)
        && Objects.equals(communicationMethod, another.communicationMethod)
        && Objects.equals(onBehalfOf, another.onBehalfOf)
        && Objects.equals(proxyIdentityCertificate, another.proxyIdentityCertificate)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(date, another.date);
  }

  /**
   * Computes a hash code from attributes: {@code sourceIdentityCertificate}, {@code who}, {@code sourceSignature}, {@code proxySignature}, {@code communicationMethod}, {@code onBehalfOf}, {@code proxyIdentityCertificate}, {@code modifierExtension}, {@code id}, {@code extension}, {@code date}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(sourceIdentityCertificate);
    h += (h << 5) + Objects.hashCode(who);
    h += (h << 5) + Objects.hashCode(sourceSignature);
    h += (h << 5) + Objects.hashCode(proxySignature);
    h += (h << 5) + Objects.hashCode(communicationMethod);
    h += (h << 5) + Objects.hashCode(onBehalfOf);
    h += (h << 5) + Objects.hashCode(proxyIdentityCertificate);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(date);
    return h;
  }

  /**
   * Prints the immutable value {@code VerificationResult_Attestation} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("VerificationResult_Attestation{");
    if (sourceIdentityCertificate != null) {
      builder.append("sourceIdentityCertificate=").append(sourceIdentityCertificate);
    }
    if (who != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("who=").append(who);
    }
    if (sourceSignature != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("sourceSignature=").append(sourceSignature);
    }
    if (proxySignature != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("proxySignature=").append(proxySignature);
    }
    if (communicationMethod != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("communicationMethod=").append(communicationMethod);
    }
    if (onBehalfOf != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("onBehalfOf=").append(onBehalfOf);
    }
    if (proxyIdentityCertificate != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("proxyIdentityCertificate=").append(proxyIdentityCertificate);
    }
    if (modifierExtension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (date != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("date=").append(date);
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
    @Nullable Optional<String> sourceIdentityCertificate = Optional.empty();
    boolean sourceIdentityCertificateIsSet;
    @Nullable Optional<Reference> who = Optional.empty();
    boolean whoIsSet;
    @Nullable Optional<Signature> sourceSignature = Optional.empty();
    boolean sourceSignatureIsSet;
    @Nullable Optional<Signature> proxySignature = Optional.empty();
    boolean proxySignatureIsSet;
    @Nullable Optional<CodeableConcept> communicationMethod = Optional.empty();
    boolean communicationMethodIsSet;
    @Nullable Optional<Reference> onBehalfOf = Optional.empty();
    boolean onBehalfOfIsSet;
    @Nullable Optional<String> proxyIdentityCertificate = Optional.empty();
    boolean proxyIdentityCertificateIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Date> date = Optional.empty();
    boolean dateIsSet;
    @JsonProperty("sourceIdentityCertificate")
    public void setSourceIdentityCertificate(Optional<String> sourceIdentityCertificate) {
      this.sourceIdentityCertificate = sourceIdentityCertificate;
      this.sourceIdentityCertificateIsSet = true;
    }
    @JsonProperty("who")
    public void setWho(Optional<Reference> who) {
      this.who = who;
      this.whoIsSet = true;
    }
    @JsonProperty("sourceSignature")
    public void setSourceSignature(Optional<Signature> sourceSignature) {
      this.sourceSignature = sourceSignature;
      this.sourceSignatureIsSet = true;
    }
    @JsonProperty("proxySignature")
    public void setProxySignature(Optional<Signature> proxySignature) {
      this.proxySignature = proxySignature;
      this.proxySignatureIsSet = true;
    }
    @JsonProperty("communicationMethod")
    public void setCommunicationMethod(Optional<CodeableConcept> communicationMethod) {
      this.communicationMethod = communicationMethod;
      this.communicationMethodIsSet = true;
    }
    @JsonProperty("onBehalfOf")
    public void setOnBehalfOf(Optional<Reference> onBehalfOf) {
      this.onBehalfOf = onBehalfOf;
      this.onBehalfOfIsSet = true;
    }
    @JsonProperty("proxyIdentityCertificate")
    public void setProxyIdentityCertificate(Optional<String> proxyIdentityCertificate) {
      this.proxyIdentityCertificate = proxyIdentityCertificate;
      this.proxyIdentityCertificateIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("date")
    public void setDate(Optional<Date> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @Override
    public Optional<String> sourceIdentityCertificate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> who() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Signature> sourceSignature() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Signature> proxySignature() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> communicationMethod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> onBehalfOf() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> proxyIdentityCertificate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Date> date() { throw new UnsupportedOperationException(); }
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
    if (json.sourceIdentityCertificateIsSet) {
      builder.sourceIdentityCertificate(json.sourceIdentityCertificate);
    }
    if (json.whoIsSet) {
      builder.who(json.who);
    }
    if (json.sourceSignatureIsSet) {
      builder.sourceSignature(json.sourceSignature);
    }
    if (json.proxySignatureIsSet) {
      builder.proxySignature(json.proxySignature);
    }
    if (json.communicationMethodIsSet) {
      builder.communicationMethod(json.communicationMethod);
    }
    if (json.onBehalfOfIsSet) {
      builder.onBehalfOf(json.onBehalfOf);
    }
    if (json.proxyIdentityCertificateIsSet) {
      builder.proxyIdentityCertificate(json.proxyIdentityCertificate);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
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
        .sourceIdentityCertificate(instance.sourceIdentityCertificate())
        .who(instance.who())
        .sourceSignature(instance.sourceSignature())
        .proxySignature(instance.proxySignature())
        .communicationMethod(instance.communicationMethod())
        .onBehalfOf(instance.onBehalfOf())
        .proxyIdentityCertificate(instance.proxyIdentityCertificate())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .extension(instance.extension())
        .date(instance.date())
        .build();
  }

  /**
   * Creates a builder for {@link VerificationResult_Attestation VerificationResult_Attestation}.
   * <pre>
   * ImmutableVerificationResult_Attestation.builder()
   *    .sourceIdentityCertificate(String) // optional {@link VerificationResult_Attestation#sourceIdentityCertificate() sourceIdentityCertificate}
   *    .who(com.fhir.types.fhir.Reference) // optional {@link VerificationResult_Attestation#who() who}
   *    .sourceSignature(com.fhir.types.fhir.Signature) // optional {@link VerificationResult_Attestation#sourceSignature() sourceSignature}
   *    .proxySignature(com.fhir.types.fhir.Signature) // optional {@link VerificationResult_Attestation#proxySignature() proxySignature}
   *    .communicationMethod(com.fhir.types.fhir.CodeableConcept) // optional {@link VerificationResult_Attestation#communicationMethod() communicationMethod}
   *    .onBehalfOf(com.fhir.types.fhir.Reference) // optional {@link VerificationResult_Attestation#onBehalfOf() onBehalfOf}
   *    .proxyIdentityCertificate(String) // optional {@link VerificationResult_Attestation#proxyIdentityCertificate() proxyIdentityCertificate}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link VerificationResult_Attestation#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link VerificationResult_Attestation#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link VerificationResult_Attestation#extension() extension}
   *    .date(com.fhir.types.fhir.Date) // optional {@link VerificationResult_Attestation#date() date}
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
    private static final long OPT_BIT_SOURCE_IDENTITY_CERTIFICATE = 0x1L;
    private static final long OPT_BIT_WHO = 0x2L;
    private static final long OPT_BIT_SOURCE_SIGNATURE = 0x4L;
    private static final long OPT_BIT_PROXY_SIGNATURE = 0x8L;
    private static final long OPT_BIT_COMMUNICATION_METHOD = 0x10L;
    private static final long OPT_BIT_ON_BEHALF_OF = 0x20L;
    private static final long OPT_BIT_PROXY_IDENTITY_CERTIFICATE = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_ID = 0x100L;
    private static final long OPT_BIT_EXTENSION = 0x200L;
    private static final long OPT_BIT_DATE = 0x400L;
    private long optBits;

    private @Nullable String sourceIdentityCertificate;
    private @Nullable Reference who;
    private @Nullable Signature sourceSignature;
    private @Nullable Signature proxySignature;
    private @Nullable CodeableConcept communicationMethod;
    private @Nullable Reference onBehalfOf;
    private @Nullable String proxyIdentityCertificate;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable Date date;

    private Builder() {
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
     * Builds a new {@link VerificationResult_Attestation VerificationResult_Attestation}.
     * @return An immutable instance of VerificationResult_Attestation
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public VerificationResult_Attestation build() {
      return new ImmutableVerificationResult_Attestation(
          sourceIdentityCertificate,
          who,
          sourceSignature,
          proxySignature,
          communicationMethod,
          onBehalfOf,
          proxyIdentityCertificate,
          modifierExtension,
          id,
          extension,
          date);
    }

    private boolean sourceIdentityCertificateIsSet() {
      return (optBits & OPT_BIT_SOURCE_IDENTITY_CERTIFICATE) != 0;
    }

    private boolean whoIsSet() {
      return (optBits & OPT_BIT_WHO) != 0;
    }

    private boolean sourceSignatureIsSet() {
      return (optBits & OPT_BIT_SOURCE_SIGNATURE) != 0;
    }

    private boolean proxySignatureIsSet() {
      return (optBits & OPT_BIT_PROXY_SIGNATURE) != 0;
    }

    private boolean communicationMethodIsSet() {
      return (optBits & OPT_BIT_COMMUNICATION_METHOD) != 0;
    }

    private boolean onBehalfOfIsSet() {
      return (optBits & OPT_BIT_ON_BEHALF_OF) != 0;
    }

    private boolean proxyIdentityCertificateIsSet() {
      return (optBits & OPT_BIT_PROXY_IDENTITY_CERTIFICATE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of VerificationResult_Attestation is strict, attribute is already set: ".concat(name));
    }
  }
}

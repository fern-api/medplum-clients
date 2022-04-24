package com.fhir;

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
 * Immutable implementation of {@link SubstanceNucleicAcid_Subunit}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceNucleicAcid_Subunit.builder()}.
 */
@Generated(from = "SubstanceNucleicAcid_Subunit", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceNucleicAcid_Subunit implements SubstanceNucleicAcid_Subunit {
  private final @Nullable List<SubstanceNucleicAcid_Linkage> linkage;
  private final @Nullable List<Extension> extension;
  private final @Nullable String sequence;
  private final @Nullable String id;
  private final @Nullable Integer length;
  private final @Nullable CodeableConcept threePrime;
  private final @Nullable Integer subunit;
  private final @Nullable CodeableConcept fivePrime;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Attachment sequenceAttachment;
  private final @Nullable List<SubstanceNucleicAcid_Sugar> sugar;

  private ImmutableSubstanceNucleicAcid_Subunit(
      @Nullable List<SubstanceNucleicAcid_Linkage> linkage,
      @Nullable List<Extension> extension,
      @Nullable String sequence,
      @Nullable String id,
      @Nullable Integer length,
      @Nullable CodeableConcept threePrime,
      @Nullable Integer subunit,
      @Nullable CodeableConcept fivePrime,
      @Nullable List<Extension> modifierExtension,
      @Nullable Attachment sequenceAttachment,
      @Nullable List<SubstanceNucleicAcid_Sugar> sugar) {
    this.linkage = linkage;
    this.extension = extension;
    this.sequence = sequence;
    this.id = id;
    this.length = length;
    this.threePrime = threePrime;
    this.subunit = subunit;
    this.fivePrime = fivePrime;
    this.modifierExtension = modifierExtension;
    this.sequenceAttachment = sequenceAttachment;
    this.sugar = sugar;
  }

  /**
   * @return The value of the {@code linkage} attribute
   */
  @JsonProperty("linkage")
  @Override
  public Optional<List<SubstanceNucleicAcid_Linkage>> linkage() {
    return Optional.ofNullable(linkage);
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
   * @return The value of the {@code sequence} attribute
   */
  @JsonProperty("sequence")
  @Override
  public Optional<String> sequence() {
    return Optional.ofNullable(sequence);
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
   * @return The value of the {@code length} attribute
   */
  @JsonProperty("length")
  @Override
  public Optional<Integer> length() {
    return Optional.ofNullable(length);
  }

  /**
   * @return The value of the {@code threePrime} attribute
   */
  @JsonProperty("threePrime")
  @Override
  public Optional<CodeableConcept> threePrime() {
    return Optional.ofNullable(threePrime);
  }

  /**
   * @return The value of the {@code subunit} attribute
   */
  @JsonProperty("subunit")
  @Override
  public Optional<Integer> subunit() {
    return Optional.ofNullable(subunit);
  }

  /**
   * @return The value of the {@code fivePrime} attribute
   */
  @JsonProperty("fivePrime")
  @Override
  public Optional<CodeableConcept> fivePrime() {
    return Optional.ofNullable(fivePrime);
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
   * @return The value of the {@code sequenceAttachment} attribute
   */
  @JsonProperty("sequenceAttachment")
  @Override
  public Optional<Attachment> sequenceAttachment() {
    return Optional.ofNullable(sequenceAttachment);
  }

  /**
   * @return The value of the {@code sugar} attribute
   */
  @JsonProperty("sugar")
  @Override
  public Optional<List<SubstanceNucleicAcid_Sugar>> sugar() {
    return Optional.ofNullable(sugar);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid_Subunit#linkage() linkage} attribute.
   * @param value The value for linkage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Subunit withLinkage(List<SubstanceNucleicAcid_Linkage> value) {
    @Nullable List<SubstanceNucleicAcid_Linkage> newValue = Objects.requireNonNull(value, "linkage");
    if (this.linkage == newValue) return this;
    return new ImmutableSubstanceNucleicAcid_Subunit(
        newValue,
        this.extension,
        this.sequence,
        this.id,
        this.length,
        this.threePrime,
        this.subunit,
        this.fivePrime,
        this.modifierExtension,
        this.sequenceAttachment,
        this.sugar);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid_Subunit#linkage() linkage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for linkage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid_Subunit withLinkage(Optional<? extends List<SubstanceNucleicAcid_Linkage>> optional) {
    @Nullable List<SubstanceNucleicAcid_Linkage> value = optional.orElse(null);
    if (this.linkage == value) return this;
    return new ImmutableSubstanceNucleicAcid_Subunit(
        value,
        this.extension,
        this.sequence,
        this.id,
        this.length,
        this.threePrime,
        this.subunit,
        this.fivePrime,
        this.modifierExtension,
        this.sequenceAttachment,
        this.sugar);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid_Subunit#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Subunit withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceNucleicAcid_Subunit(
        this.linkage,
        newValue,
        this.sequence,
        this.id,
        this.length,
        this.threePrime,
        this.subunit,
        this.fivePrime,
        this.modifierExtension,
        this.sequenceAttachment,
        this.sugar);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid_Subunit#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid_Subunit withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceNucleicAcid_Subunit(
        this.linkage,
        value,
        this.sequence,
        this.id,
        this.length,
        this.threePrime,
        this.subunit,
        this.fivePrime,
        this.modifierExtension,
        this.sequenceAttachment,
        this.sugar);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid_Subunit#sequence() sequence} attribute.
   * @param value The value for sequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Subunit withSequence(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "sequence");
    if (Objects.equals(this.sequence, newValue)) return this;
    return new ImmutableSubstanceNucleicAcid_Subunit(
        this.linkage,
        this.extension,
        newValue,
        this.id,
        this.length,
        this.threePrime,
        this.subunit,
        this.fivePrime,
        this.modifierExtension,
        this.sequenceAttachment,
        this.sugar);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid_Subunit#sequence() sequence} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Subunit withSequence(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.sequence, value)) return this;
    return new ImmutableSubstanceNucleicAcid_Subunit(
        this.linkage,
        this.extension,
        value,
        this.id,
        this.length,
        this.threePrime,
        this.subunit,
        this.fivePrime,
        this.modifierExtension,
        this.sequenceAttachment,
        this.sugar);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid_Subunit#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Subunit withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubstanceNucleicAcid_Subunit(
        this.linkage,
        this.extension,
        this.sequence,
        newValue,
        this.length,
        this.threePrime,
        this.subunit,
        this.fivePrime,
        this.modifierExtension,
        this.sequenceAttachment,
        this.sugar);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid_Subunit#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Subunit withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSubstanceNucleicAcid_Subunit(
        this.linkage,
        this.extension,
        this.sequence,
        value,
        this.length,
        this.threePrime,
        this.subunit,
        this.fivePrime,
        this.modifierExtension,
        this.sequenceAttachment,
        this.sugar);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid_Subunit#length() length} attribute.
   * @param value The value for length
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Subunit withLength(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.length, newValue)) return this;
    return new ImmutableSubstanceNucleicAcid_Subunit(
        this.linkage,
        this.extension,
        this.sequence,
        this.id,
        newValue,
        this.threePrime,
        this.subunit,
        this.fivePrime,
        this.modifierExtension,
        this.sequenceAttachment,
        this.sugar);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid_Subunit#length() length} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for length
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Subunit withLength(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.length, value)) return this;
    return new ImmutableSubstanceNucleicAcid_Subunit(
        this.linkage,
        this.extension,
        this.sequence,
        this.id,
        value,
        this.threePrime,
        this.subunit,
        this.fivePrime,
        this.modifierExtension,
        this.sequenceAttachment,
        this.sugar);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid_Subunit#threePrime() threePrime} attribute.
   * @param value The value for threePrime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Subunit withThreePrime(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "threePrime");
    if (this.threePrime == newValue) return this;
    return new ImmutableSubstanceNucleicAcid_Subunit(
        this.linkage,
        this.extension,
        this.sequence,
        this.id,
        this.length,
        newValue,
        this.subunit,
        this.fivePrime,
        this.modifierExtension,
        this.sequenceAttachment,
        this.sugar);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid_Subunit#threePrime() threePrime} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for threePrime
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid_Subunit withThreePrime(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.threePrime == value) return this;
    return new ImmutableSubstanceNucleicAcid_Subunit(
        this.linkage,
        this.extension,
        this.sequence,
        this.id,
        this.length,
        value,
        this.subunit,
        this.fivePrime,
        this.modifierExtension,
        this.sequenceAttachment,
        this.sugar);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid_Subunit#subunit() subunit} attribute.
   * @param value The value for subunit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Subunit withSubunit(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.subunit, newValue)) return this;
    return new ImmutableSubstanceNucleicAcid_Subunit(
        this.linkage,
        this.extension,
        this.sequence,
        this.id,
        this.length,
        this.threePrime,
        newValue,
        this.fivePrime,
        this.modifierExtension,
        this.sequenceAttachment,
        this.sugar);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid_Subunit#subunit() subunit} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subunit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Subunit withSubunit(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.subunit, value)) return this;
    return new ImmutableSubstanceNucleicAcid_Subunit(
        this.linkage,
        this.extension,
        this.sequence,
        this.id,
        this.length,
        this.threePrime,
        value,
        this.fivePrime,
        this.modifierExtension,
        this.sequenceAttachment,
        this.sugar);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid_Subunit#fivePrime() fivePrime} attribute.
   * @param value The value for fivePrime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Subunit withFivePrime(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "fivePrime");
    if (this.fivePrime == newValue) return this;
    return new ImmutableSubstanceNucleicAcid_Subunit(
        this.linkage,
        this.extension,
        this.sequence,
        this.id,
        this.length,
        this.threePrime,
        this.subunit,
        newValue,
        this.modifierExtension,
        this.sequenceAttachment,
        this.sugar);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid_Subunit#fivePrime() fivePrime} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for fivePrime
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid_Subunit withFivePrime(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.fivePrime == value) return this;
    return new ImmutableSubstanceNucleicAcid_Subunit(
        this.linkage,
        this.extension,
        this.sequence,
        this.id,
        this.length,
        this.threePrime,
        this.subunit,
        value,
        this.modifierExtension,
        this.sequenceAttachment,
        this.sugar);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid_Subunit#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Subunit withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceNucleicAcid_Subunit(
        this.linkage,
        this.extension,
        this.sequence,
        this.id,
        this.length,
        this.threePrime,
        this.subunit,
        this.fivePrime,
        newValue,
        this.sequenceAttachment,
        this.sugar);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid_Subunit#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid_Subunit withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceNucleicAcid_Subunit(
        this.linkage,
        this.extension,
        this.sequence,
        this.id,
        this.length,
        this.threePrime,
        this.subunit,
        this.fivePrime,
        value,
        this.sequenceAttachment,
        this.sugar);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid_Subunit#sequenceAttachment() sequenceAttachment} attribute.
   * @param value The value for sequenceAttachment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Subunit withSequenceAttachment(Attachment value) {
    @Nullable Attachment newValue = Objects.requireNonNull(value, "sequenceAttachment");
    if (this.sequenceAttachment == newValue) return this;
    return new ImmutableSubstanceNucleicAcid_Subunit(
        this.linkage,
        this.extension,
        this.sequence,
        this.id,
        this.length,
        this.threePrime,
        this.subunit,
        this.fivePrime,
        this.modifierExtension,
        newValue,
        this.sugar);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid_Subunit#sequenceAttachment() sequenceAttachment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sequenceAttachment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid_Subunit withSequenceAttachment(Optional<? extends Attachment> optional) {
    @Nullable Attachment value = optional.orElse(null);
    if (this.sequenceAttachment == value) return this;
    return new ImmutableSubstanceNucleicAcid_Subunit(
        this.linkage,
        this.extension,
        this.sequence,
        this.id,
        this.length,
        this.threePrime,
        this.subunit,
        this.fivePrime,
        this.modifierExtension,
        value,
        this.sugar);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceNucleicAcid_Subunit#sugar() sugar} attribute.
   * @param value The value for sugar
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceNucleicAcid_Subunit withSugar(List<SubstanceNucleicAcid_Sugar> value) {
    @Nullable List<SubstanceNucleicAcid_Sugar> newValue = Objects.requireNonNull(value, "sugar");
    if (this.sugar == newValue) return this;
    return new ImmutableSubstanceNucleicAcid_Subunit(
        this.linkage,
        this.extension,
        this.sequence,
        this.id,
        this.length,
        this.threePrime,
        this.subunit,
        this.fivePrime,
        this.modifierExtension,
        this.sequenceAttachment,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceNucleicAcid_Subunit#sugar() sugar} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sugar
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceNucleicAcid_Subunit withSugar(Optional<? extends List<SubstanceNucleicAcid_Sugar>> optional) {
    @Nullable List<SubstanceNucleicAcid_Sugar> value = optional.orElse(null);
    if (this.sugar == value) return this;
    return new ImmutableSubstanceNucleicAcid_Subunit(
        this.linkage,
        this.extension,
        this.sequence,
        this.id,
        this.length,
        this.threePrime,
        this.subunit,
        this.fivePrime,
        this.modifierExtension,
        this.sequenceAttachment,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceNucleicAcid_Subunit} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceNucleicAcid_Subunit
        && equalTo((ImmutableSubstanceNucleicAcid_Subunit) another);
  }

  private boolean equalTo(ImmutableSubstanceNucleicAcid_Subunit another) {
    return Objects.equals(linkage, another.linkage)
        && Objects.equals(extension, another.extension)
        && Objects.equals(sequence, another.sequence)
        && Objects.equals(id, another.id)
        && Objects.equals(length, another.length)
        && Objects.equals(threePrime, another.threePrime)
        && Objects.equals(subunit, another.subunit)
        && Objects.equals(fivePrime, another.fivePrime)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(sequenceAttachment, another.sequenceAttachment)
        && Objects.equals(sugar, another.sugar);
  }

  /**
   * Computes a hash code from attributes: {@code linkage}, {@code extension}, {@code sequence}, {@code id}, {@code length}, {@code threePrime}, {@code subunit}, {@code fivePrime}, {@code modifierExtension}, {@code sequenceAttachment}, {@code sugar}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(linkage);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(sequence);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(length);
    h += (h << 5) + Objects.hashCode(threePrime);
    h += (h << 5) + Objects.hashCode(subunit);
    h += (h << 5) + Objects.hashCode(fivePrime);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(sequenceAttachment);
    h += (h << 5) + Objects.hashCode(sugar);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceNucleicAcid_Subunit} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstanceNucleicAcid_Subunit{");
    if (linkage != null) {
      builder.append("linkage=").append(linkage);
    }
    if (extension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (sequence != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("sequence=").append(sequence);
    }
    if (id != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (length != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("length=").append(length);
    }
    if (threePrime != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("threePrime=").append(threePrime);
    }
    if (subunit != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("subunit=").append(subunit);
    }
    if (fivePrime != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("fivePrime=").append(fivePrime);
    }
    if (modifierExtension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (sequenceAttachment != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("sequenceAttachment=").append(sequenceAttachment);
    }
    if (sugar != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("sugar=").append(sugar);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstanceNucleicAcid_Subunit", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstanceNucleicAcid_Subunit {
    @Nullable Optional<List<SubstanceNucleicAcid_Linkage>> linkage = Optional.empty();
    boolean linkageIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> sequence = Optional.empty();
    boolean sequenceIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Integer> length = Optional.empty();
    boolean lengthIsSet;
    @Nullable Optional<CodeableConcept> threePrime = Optional.empty();
    boolean threePrimeIsSet;
    @Nullable Optional<Integer> subunit = Optional.empty();
    boolean subunitIsSet;
    @Nullable Optional<CodeableConcept> fivePrime = Optional.empty();
    boolean fivePrimeIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Attachment> sequenceAttachment = Optional.empty();
    boolean sequenceAttachmentIsSet;
    @Nullable Optional<List<SubstanceNucleicAcid_Sugar>> sugar = Optional.empty();
    boolean sugarIsSet;
    @JsonProperty("linkage")
    public void setLinkage(Optional<List<SubstanceNucleicAcid_Linkage>> linkage) {
      this.linkage = linkage;
      this.linkageIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("sequence")
    public void setSequence(Optional<String> sequence) {
      this.sequence = sequence;
      this.sequenceIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("length")
    public void setLength(Optional<Integer> length) {
      this.length = length;
      this.lengthIsSet = true;
    }
    @JsonProperty("threePrime")
    public void setThreePrime(Optional<CodeableConcept> threePrime) {
      this.threePrime = threePrime;
      this.threePrimeIsSet = true;
    }
    @JsonProperty("subunit")
    public void setSubunit(Optional<Integer> subunit) {
      this.subunit = subunit;
      this.subunitIsSet = true;
    }
    @JsonProperty("fivePrime")
    public void setFivePrime(Optional<CodeableConcept> fivePrime) {
      this.fivePrime = fivePrime;
      this.fivePrimeIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("sequenceAttachment")
    public void setSequenceAttachment(Optional<Attachment> sequenceAttachment) {
      this.sequenceAttachment = sequenceAttachment;
      this.sequenceAttachmentIsSet = true;
    }
    @JsonProperty("sugar")
    public void setSugar(Optional<List<SubstanceNucleicAcid_Sugar>> sugar) {
      this.sugar = sugar;
      this.sugarIsSet = true;
    }
    @Override
    public Optional<List<SubstanceNucleicAcid_Linkage>> linkage() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> sequence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> length() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> threePrime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> subunit() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> fivePrime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Attachment> sequenceAttachment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<SubstanceNucleicAcid_Sugar>> sugar() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSubstanceNucleicAcid_Subunit fromJson(Json json) {
    ImmutableSubstanceNucleicAcid_Subunit.Builder builder = ImmutableSubstanceNucleicAcid_Subunit.builder();
    if (json.linkageIsSet) {
      builder.linkage(json.linkage);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.sequenceIsSet) {
      builder.sequence(json.sequence);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.lengthIsSet) {
      builder.length(json.length);
    }
    if (json.threePrimeIsSet) {
      builder.threePrime(json.threePrime);
    }
    if (json.subunitIsSet) {
      builder.subunit(json.subunit);
    }
    if (json.fivePrimeIsSet) {
      builder.fivePrime(json.fivePrime);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.sequenceAttachmentIsSet) {
      builder.sequenceAttachment(json.sequenceAttachment);
    }
    if (json.sugarIsSet) {
      builder.sugar(json.sugar);
    }
    return (ImmutableSubstanceNucleicAcid_Subunit) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstanceNucleicAcid_Subunit} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstanceNucleicAcid_Subunit instance
   */
  public static SubstanceNucleicAcid_Subunit copyOf(SubstanceNucleicAcid_Subunit instance) {
    if (instance instanceof ImmutableSubstanceNucleicAcid_Subunit) {
      return (ImmutableSubstanceNucleicAcid_Subunit) instance;
    }
    return ImmutableSubstanceNucleicAcid_Subunit.builder()
        .linkage(instance.linkage())
        .extension(instance.extension())
        .sequence(instance.sequence())
        .id(instance.id())
        .length(instance.length())
        .threePrime(instance.threePrime())
        .subunit(instance.subunit())
        .fivePrime(instance.fivePrime())
        .modifierExtension(instance.modifierExtension())
        .sequenceAttachment(instance.sequenceAttachment())
        .sugar(instance.sugar())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceNucleicAcid_Subunit SubstanceNucleicAcid_Subunit}.
   * <pre>
   * ImmutableSubstanceNucleicAcid_Subunit.builder()
   *    .linkage(List&amp;lt;com.fhir.SubstanceNucleicAcid_Linkage&amp;gt;) // optional {@link SubstanceNucleicAcid_Subunit#linkage() linkage}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstanceNucleicAcid_Subunit#extension() extension}
   *    .sequence(String) // optional {@link SubstanceNucleicAcid_Subunit#sequence() sequence}
   *    .id(String) // optional {@link SubstanceNucleicAcid_Subunit#id() id}
   *    .length(Integer) // optional {@link SubstanceNucleicAcid_Subunit#length() length}
   *    .threePrime(com.fhir.CodeableConcept) // optional {@link SubstanceNucleicAcid_Subunit#threePrime() threePrime}
   *    .subunit(Integer) // optional {@link SubstanceNucleicAcid_Subunit#subunit() subunit}
   *    .fivePrime(com.fhir.CodeableConcept) // optional {@link SubstanceNucleicAcid_Subunit#fivePrime() fivePrime}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link SubstanceNucleicAcid_Subunit#modifierExtension() modifierExtension}
   *    .sequenceAttachment(com.fhir.Attachment) // optional {@link SubstanceNucleicAcid_Subunit#sequenceAttachment() sequenceAttachment}
   *    .sugar(List&amp;lt;com.fhir.SubstanceNucleicAcid_Sugar&amp;gt;) // optional {@link SubstanceNucleicAcid_Subunit#sugar() sugar}
   *    .build();
   * </pre>
   * @return A new SubstanceNucleicAcid_Subunit builder
   */
  public static ImmutableSubstanceNucleicAcid_Subunit.Builder builder() {
    return new ImmutableSubstanceNucleicAcid_Subunit.Builder();
  }

  /**
   * Builds instances of type {@link SubstanceNucleicAcid_Subunit SubstanceNucleicAcid_Subunit}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstanceNucleicAcid_Subunit", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_LINKAGE = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_SEQUENCE = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_LENGTH = 0x10L;
    private static final long OPT_BIT_THREE_PRIME = 0x20L;
    private static final long OPT_BIT_SUBUNIT = 0x40L;
    private static final long OPT_BIT_FIVE_PRIME = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private static final long OPT_BIT_SEQUENCE_ATTACHMENT = 0x200L;
    private static final long OPT_BIT_SUGAR = 0x400L;
    private long optBits;

    private @Nullable List<SubstanceNucleicAcid_Linkage> linkage;
    private @Nullable List<Extension> extension;
    private @Nullable String sequence;
    private @Nullable String id;
    private @Nullable Integer length;
    private @Nullable CodeableConcept threePrime;
    private @Nullable Integer subunit;
    private @Nullable CodeableConcept fivePrime;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Attachment sequenceAttachment;
    private @Nullable List<SubstanceNucleicAcid_Sugar> sugar;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid_Subunit#linkage() linkage} to linkage.
     * @param linkage The value for linkage
     * @return {@code this} builder for chained invocation
     */
    public final Builder linkage(List<SubstanceNucleicAcid_Linkage> linkage) {
      checkNotIsSet(linkageIsSet(), "linkage");
      this.linkage = Objects.requireNonNull(linkage, "linkage");
      optBits |= OPT_BIT_LINKAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid_Subunit#linkage() linkage} to linkage.
     * @param linkage The value for linkage
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("linkage")
    public final Builder linkage(Optional<? extends List<SubstanceNucleicAcid_Linkage>> linkage) {
      checkNotIsSet(linkageIsSet(), "linkage");
      this.linkage = linkage.orElse(null);
      optBits |= OPT_BIT_LINKAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid_Subunit#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceNucleicAcid_Subunit#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceNucleicAcid_Subunit#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder sequence(String sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = Objects.requireNonNull(sequence, "sequence");
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid_Subunit#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sequence")
    public final Builder sequence(Optional<String> sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = sequence.orElse(null);
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid_Subunit#id() id} to id.
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
     * Initializes the optional value {@link SubstanceNucleicAcid_Subunit#id() id} to id.
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
     * Initializes the optional value {@link SubstanceNucleicAcid_Subunit#length() length} to length.
     * @param length The value for length
     * @return {@code this} builder for chained invocation
     */
    public final Builder length(int length) {
      checkNotIsSet(lengthIsSet(), "length");
      this.length = length;
      optBits |= OPT_BIT_LENGTH;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid_Subunit#length() length} to length.
     * @param length The value for length
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("length")
    public final Builder length(Optional<Integer> length) {
      checkNotIsSet(lengthIsSet(), "length");
      this.length = length.orElse(null);
      optBits |= OPT_BIT_LENGTH;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid_Subunit#threePrime() threePrime} to threePrime.
     * @param threePrime The value for threePrime
     * @return {@code this} builder for chained invocation
     */
    public final Builder threePrime(CodeableConcept threePrime) {
      checkNotIsSet(threePrimeIsSet(), "threePrime");
      this.threePrime = Objects.requireNonNull(threePrime, "threePrime");
      optBits |= OPT_BIT_THREE_PRIME;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid_Subunit#threePrime() threePrime} to threePrime.
     * @param threePrime The value for threePrime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("threePrime")
    public final Builder threePrime(Optional<? extends CodeableConcept> threePrime) {
      checkNotIsSet(threePrimeIsSet(), "threePrime");
      this.threePrime = threePrime.orElse(null);
      optBits |= OPT_BIT_THREE_PRIME;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid_Subunit#subunit() subunit} to subunit.
     * @param subunit The value for subunit
     * @return {@code this} builder for chained invocation
     */
    public final Builder subunit(int subunit) {
      checkNotIsSet(subunitIsSet(), "subunit");
      this.subunit = subunit;
      optBits |= OPT_BIT_SUBUNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid_Subunit#subunit() subunit} to subunit.
     * @param subunit The value for subunit
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subunit")
    public final Builder subunit(Optional<Integer> subunit) {
      checkNotIsSet(subunitIsSet(), "subunit");
      this.subunit = subunit.orElse(null);
      optBits |= OPT_BIT_SUBUNIT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid_Subunit#fivePrime() fivePrime} to fivePrime.
     * @param fivePrime The value for fivePrime
     * @return {@code this} builder for chained invocation
     */
    public final Builder fivePrime(CodeableConcept fivePrime) {
      checkNotIsSet(fivePrimeIsSet(), "fivePrime");
      this.fivePrime = Objects.requireNonNull(fivePrime, "fivePrime");
      optBits |= OPT_BIT_FIVE_PRIME;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid_Subunit#fivePrime() fivePrime} to fivePrime.
     * @param fivePrime The value for fivePrime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("fivePrime")
    public final Builder fivePrime(Optional<? extends CodeableConcept> fivePrime) {
      checkNotIsSet(fivePrimeIsSet(), "fivePrime");
      this.fivePrime = fivePrime.orElse(null);
      optBits |= OPT_BIT_FIVE_PRIME;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid_Subunit#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceNucleicAcid_Subunit#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceNucleicAcid_Subunit#sequenceAttachment() sequenceAttachment} to sequenceAttachment.
     * @param sequenceAttachment The value for sequenceAttachment
     * @return {@code this} builder for chained invocation
     */
    public final Builder sequenceAttachment(Attachment sequenceAttachment) {
      checkNotIsSet(sequenceAttachmentIsSet(), "sequenceAttachment");
      this.sequenceAttachment = Objects.requireNonNull(sequenceAttachment, "sequenceAttachment");
      optBits |= OPT_BIT_SEQUENCE_ATTACHMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid_Subunit#sequenceAttachment() sequenceAttachment} to sequenceAttachment.
     * @param sequenceAttachment The value for sequenceAttachment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sequenceAttachment")
    public final Builder sequenceAttachment(Optional<? extends Attachment> sequenceAttachment) {
      checkNotIsSet(sequenceAttachmentIsSet(), "sequenceAttachment");
      this.sequenceAttachment = sequenceAttachment.orElse(null);
      optBits |= OPT_BIT_SEQUENCE_ATTACHMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid_Subunit#sugar() sugar} to sugar.
     * @param sugar The value for sugar
     * @return {@code this} builder for chained invocation
     */
    public final Builder sugar(List<SubstanceNucleicAcid_Sugar> sugar) {
      checkNotIsSet(sugarIsSet(), "sugar");
      this.sugar = Objects.requireNonNull(sugar, "sugar");
      optBits |= OPT_BIT_SUGAR;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceNucleicAcid_Subunit#sugar() sugar} to sugar.
     * @param sugar The value for sugar
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sugar")
    public final Builder sugar(Optional<? extends List<SubstanceNucleicAcid_Sugar>> sugar) {
      checkNotIsSet(sugarIsSet(), "sugar");
      this.sugar = sugar.orElse(null);
      optBits |= OPT_BIT_SUGAR;
      return this;
    }

    /**
     * Builds a new {@link SubstanceNucleicAcid_Subunit SubstanceNucleicAcid_Subunit}.
     * @return An immutable instance of SubstanceNucleicAcid_Subunit
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstanceNucleicAcid_Subunit build() {
      return new ImmutableSubstanceNucleicAcid_Subunit(
          linkage,
          extension,
          sequence,
          id,
          length,
          threePrime,
          subunit,
          fivePrime,
          modifierExtension,
          sequenceAttachment,
          sugar);
    }

    private boolean linkageIsSet() {
      return (optBits & OPT_BIT_LINKAGE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean sequenceIsSet() {
      return (optBits & OPT_BIT_SEQUENCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean lengthIsSet() {
      return (optBits & OPT_BIT_LENGTH) != 0;
    }

    private boolean threePrimeIsSet() {
      return (optBits & OPT_BIT_THREE_PRIME) != 0;
    }

    private boolean subunitIsSet() {
      return (optBits & OPT_BIT_SUBUNIT) != 0;
    }

    private boolean fivePrimeIsSet() {
      return (optBits & OPT_BIT_FIVE_PRIME) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean sequenceAttachmentIsSet() {
      return (optBits & OPT_BIT_SEQUENCE_ATTACHMENT) != 0;
    }

    private boolean sugarIsSet() {
      return (optBits & OPT_BIT_SUGAR) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstanceNucleicAcid_Subunit is strict, attribute is already set: ".concat(name));
    }
  }
}

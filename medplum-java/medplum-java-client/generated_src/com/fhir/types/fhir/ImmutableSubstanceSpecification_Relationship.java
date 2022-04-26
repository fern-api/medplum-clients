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
 * Immutable implementation of {@link SubstanceSpecification_Relationship}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceSpecification_Relationship.builder()}.
 */
@Generated(from = "SubstanceSpecification_Relationship", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceSpecification_Relationship
    implements SubstanceSpecification_Relationship {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Reference substanceReference;
  private final @Nullable String amountString;
  private final @Nullable Ratio amountRatio;
  private final @Nullable List<Reference> source;
  private final @Nullable CodeableConcept substanceCodeableConcept;
  private final @Nullable String id;
  private final @Nullable CodeableConcept relationship;
  private final @Nullable Ratio amountRatioLowLimit;
  private final @Nullable List<Extension> extension;
  private final @Nullable Boolean isDefining;
  private final @Nullable Quantity amountQuantity;
  private final @Nullable Range amountRange;
  private final @Nullable CodeableConcept amountType;

  private ImmutableSubstanceSpecification_Relationship(
      @Nullable List<Extension> modifierExtension,
      @Nullable Reference substanceReference,
      @Nullable String amountString,
      @Nullable Ratio amountRatio,
      @Nullable List<Reference> source,
      @Nullable CodeableConcept substanceCodeableConcept,
      @Nullable String id,
      @Nullable CodeableConcept relationship,
      @Nullable Ratio amountRatioLowLimit,
      @Nullable List<Extension> extension,
      @Nullable Boolean isDefining,
      @Nullable Quantity amountQuantity,
      @Nullable Range amountRange,
      @Nullable CodeableConcept amountType) {
    this.modifierExtension = modifierExtension;
    this.substanceReference = substanceReference;
    this.amountString = amountString;
    this.amountRatio = amountRatio;
    this.source = source;
    this.substanceCodeableConcept = substanceCodeableConcept;
    this.id = id;
    this.relationship = relationship;
    this.amountRatioLowLimit = amountRatioLowLimit;
    this.extension = extension;
    this.isDefining = isDefining;
    this.amountQuantity = amountQuantity;
    this.amountRange = amountRange;
    this.amountType = amountType;
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
   * @return The value of the {@code substanceReference} attribute
   */
  @JsonProperty("substanceReference")
  @Override
  public Optional<Reference> substanceReference() {
    return Optional.ofNullable(substanceReference);
  }

  /**
   * @return The value of the {@code amountString} attribute
   */
  @JsonProperty("amountString")
  @Override
  public Optional<String> amountString() {
    return Optional.ofNullable(amountString);
  }

  /**
   * @return The value of the {@code amountRatio} attribute
   */
  @JsonProperty("amountRatio")
  @Override
  public Optional<Ratio> amountRatio() {
    return Optional.ofNullable(amountRatio);
  }

  /**
   * @return The value of the {@code source} attribute
   */
  @JsonProperty("source")
  @Override
  public Optional<List<Reference>> source() {
    return Optional.ofNullable(source);
  }

  /**
   * @return The value of the {@code substanceCodeableConcept} attribute
   */
  @JsonProperty("substanceCodeableConcept")
  @Override
  public Optional<CodeableConcept> substanceCodeableConcept() {
    return Optional.ofNullable(substanceCodeableConcept);
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
   * @return The value of the {@code relationship} attribute
   */
  @JsonProperty("relationship")
  @Override
  public Optional<CodeableConcept> relationship() {
    return Optional.ofNullable(relationship);
  }

  /**
   * @return The value of the {@code amountRatioLowLimit} attribute
   */
  @JsonProperty("amountRatioLowLimit")
  @Override
  public Optional<Ratio> amountRatioLowLimit() {
    return Optional.ofNullable(amountRatioLowLimit);
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
   * @return The value of the {@code isDefining} attribute
   */
  @JsonProperty("isDefining")
  @Override
  public Optional<Boolean> isDefining() {
    return Optional.ofNullable(isDefining);
  }

  /**
   * @return The value of the {@code amountQuantity} attribute
   */
  @JsonProperty("amountQuantity")
  @Override
  public Optional<Quantity> amountQuantity() {
    return Optional.ofNullable(amountQuantity);
  }

  /**
   * @return The value of the {@code amountRange} attribute
   */
  @JsonProperty("amountRange")
  @Override
  public Optional<Range> amountRange() {
    return Optional.ofNullable(amountRange);
  }

  /**
   * @return The value of the {@code amountType} attribute
   */
  @JsonProperty("amountType")
  @Override
  public Optional<CodeableConcept> amountType() {
    return Optional.ofNullable(amountType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Relationship#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Relationship withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceSpecification_Relationship(
        newValue,
        this.substanceReference,
        this.amountString,
        this.amountRatio,
        this.source,
        this.substanceCodeableConcept,
        this.id,
        this.relationship,
        this.amountRatioLowLimit,
        this.extension,
        this.isDefining,
        this.amountQuantity,
        this.amountRange,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Relationship#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Relationship withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceSpecification_Relationship(
        value,
        this.substanceReference,
        this.amountString,
        this.amountRatio,
        this.source,
        this.substanceCodeableConcept,
        this.id,
        this.relationship,
        this.amountRatioLowLimit,
        this.extension,
        this.isDefining,
        this.amountQuantity,
        this.amountRange,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Relationship#substanceReference() substanceReference} attribute.
   * @param value The value for substanceReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Relationship withSubstanceReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "substanceReference");
    if (this.substanceReference == newValue) return this;
    return new ImmutableSubstanceSpecification_Relationship(
        this.modifierExtension,
        newValue,
        this.amountString,
        this.amountRatio,
        this.source,
        this.substanceCodeableConcept,
        this.id,
        this.relationship,
        this.amountRatioLowLimit,
        this.extension,
        this.isDefining,
        this.amountQuantity,
        this.amountRange,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Relationship#substanceReference() substanceReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for substanceReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Relationship withSubstanceReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.substanceReference == value) return this;
    return new ImmutableSubstanceSpecification_Relationship(
        this.modifierExtension,
        value,
        this.amountString,
        this.amountRatio,
        this.source,
        this.substanceCodeableConcept,
        this.id,
        this.relationship,
        this.amountRatioLowLimit,
        this.extension,
        this.isDefining,
        this.amountQuantity,
        this.amountRange,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Relationship#amountString() amountString} attribute.
   * @param value The value for amountString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Relationship withAmountString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "amountString");
    if (Objects.equals(this.amountString, newValue)) return this;
    return new ImmutableSubstanceSpecification_Relationship(
        this.modifierExtension,
        this.substanceReference,
        newValue,
        this.amountRatio,
        this.source,
        this.substanceCodeableConcept,
        this.id,
        this.relationship,
        this.amountRatioLowLimit,
        this.extension,
        this.isDefining,
        this.amountQuantity,
        this.amountRange,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Relationship#amountString() amountString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amountString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Relationship withAmountString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.amountString, value)) return this;
    return new ImmutableSubstanceSpecification_Relationship(
        this.modifierExtension,
        this.substanceReference,
        value,
        this.amountRatio,
        this.source,
        this.substanceCodeableConcept,
        this.id,
        this.relationship,
        this.amountRatioLowLimit,
        this.extension,
        this.isDefining,
        this.amountQuantity,
        this.amountRange,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Relationship#amountRatio() amountRatio} attribute.
   * @param value The value for amountRatio
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Relationship withAmountRatio(Ratio value) {
    @Nullable Ratio newValue = Objects.requireNonNull(value, "amountRatio");
    if (this.amountRatio == newValue) return this;
    return new ImmutableSubstanceSpecification_Relationship(
        this.modifierExtension,
        this.substanceReference,
        this.amountString,
        newValue,
        this.source,
        this.substanceCodeableConcept,
        this.id,
        this.relationship,
        this.amountRatioLowLimit,
        this.extension,
        this.isDefining,
        this.amountQuantity,
        this.amountRange,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Relationship#amountRatio() amountRatio} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amountRatio
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Relationship withAmountRatio(Optional<? extends Ratio> optional) {
    @Nullable Ratio value = optional.orElse(null);
    if (this.amountRatio == value) return this;
    return new ImmutableSubstanceSpecification_Relationship(
        this.modifierExtension,
        this.substanceReference,
        this.amountString,
        value,
        this.source,
        this.substanceCodeableConcept,
        this.id,
        this.relationship,
        this.amountRatioLowLimit,
        this.extension,
        this.isDefining,
        this.amountQuantity,
        this.amountRange,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Relationship#source() source} attribute.
   * @param value The value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Relationship withSource(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "source");
    if (this.source == newValue) return this;
    return new ImmutableSubstanceSpecification_Relationship(
        this.modifierExtension,
        this.substanceReference,
        this.amountString,
        this.amountRatio,
        newValue,
        this.substanceCodeableConcept,
        this.id,
        this.relationship,
        this.amountRatioLowLimit,
        this.extension,
        this.isDefining,
        this.amountQuantity,
        this.amountRange,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Relationship#source() source} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for source
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Relationship withSource(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.source == value) return this;
    return new ImmutableSubstanceSpecification_Relationship(
        this.modifierExtension,
        this.substanceReference,
        this.amountString,
        this.amountRatio,
        value,
        this.substanceCodeableConcept,
        this.id,
        this.relationship,
        this.amountRatioLowLimit,
        this.extension,
        this.isDefining,
        this.amountQuantity,
        this.amountRange,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Relationship#substanceCodeableConcept() substanceCodeableConcept} attribute.
   * @param value The value for substanceCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Relationship withSubstanceCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "substanceCodeableConcept");
    if (this.substanceCodeableConcept == newValue) return this;
    return new ImmutableSubstanceSpecification_Relationship(
        this.modifierExtension,
        this.substanceReference,
        this.amountString,
        this.amountRatio,
        this.source,
        newValue,
        this.id,
        this.relationship,
        this.amountRatioLowLimit,
        this.extension,
        this.isDefining,
        this.amountQuantity,
        this.amountRange,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Relationship#substanceCodeableConcept() substanceCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for substanceCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Relationship withSubstanceCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.substanceCodeableConcept == value) return this;
    return new ImmutableSubstanceSpecification_Relationship(
        this.modifierExtension,
        this.substanceReference,
        this.amountString,
        this.amountRatio,
        this.source,
        value,
        this.id,
        this.relationship,
        this.amountRatioLowLimit,
        this.extension,
        this.isDefining,
        this.amountQuantity,
        this.amountRange,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Relationship#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Relationship withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubstanceSpecification_Relationship(
        this.modifierExtension,
        this.substanceReference,
        this.amountString,
        this.amountRatio,
        this.source,
        this.substanceCodeableConcept,
        newValue,
        this.relationship,
        this.amountRatioLowLimit,
        this.extension,
        this.isDefining,
        this.amountQuantity,
        this.amountRange,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Relationship#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Relationship withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSubstanceSpecification_Relationship(
        this.modifierExtension,
        this.substanceReference,
        this.amountString,
        this.amountRatio,
        this.source,
        this.substanceCodeableConcept,
        value,
        this.relationship,
        this.amountRatioLowLimit,
        this.extension,
        this.isDefining,
        this.amountQuantity,
        this.amountRange,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Relationship#relationship() relationship} attribute.
   * @param value The value for relationship
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Relationship withRelationship(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "relationship");
    if (this.relationship == newValue) return this;
    return new ImmutableSubstanceSpecification_Relationship(
        this.modifierExtension,
        this.substanceReference,
        this.amountString,
        this.amountRatio,
        this.source,
        this.substanceCodeableConcept,
        this.id,
        newValue,
        this.amountRatioLowLimit,
        this.extension,
        this.isDefining,
        this.amountQuantity,
        this.amountRange,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Relationship#relationship() relationship} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relationship
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Relationship withRelationship(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.relationship == value) return this;
    return new ImmutableSubstanceSpecification_Relationship(
        this.modifierExtension,
        this.substanceReference,
        this.amountString,
        this.amountRatio,
        this.source,
        this.substanceCodeableConcept,
        this.id,
        value,
        this.amountRatioLowLimit,
        this.extension,
        this.isDefining,
        this.amountQuantity,
        this.amountRange,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Relationship#amountRatioLowLimit() amountRatioLowLimit} attribute.
   * @param value The value for amountRatioLowLimit
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Relationship withAmountRatioLowLimit(Ratio value) {
    @Nullable Ratio newValue = Objects.requireNonNull(value, "amountRatioLowLimit");
    if (this.amountRatioLowLimit == newValue) return this;
    return new ImmutableSubstanceSpecification_Relationship(
        this.modifierExtension,
        this.substanceReference,
        this.amountString,
        this.amountRatio,
        this.source,
        this.substanceCodeableConcept,
        this.id,
        this.relationship,
        newValue,
        this.extension,
        this.isDefining,
        this.amountQuantity,
        this.amountRange,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Relationship#amountRatioLowLimit() amountRatioLowLimit} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amountRatioLowLimit
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Relationship withAmountRatioLowLimit(Optional<? extends Ratio> optional) {
    @Nullable Ratio value = optional.orElse(null);
    if (this.amountRatioLowLimit == value) return this;
    return new ImmutableSubstanceSpecification_Relationship(
        this.modifierExtension,
        this.substanceReference,
        this.amountString,
        this.amountRatio,
        this.source,
        this.substanceCodeableConcept,
        this.id,
        this.relationship,
        value,
        this.extension,
        this.isDefining,
        this.amountQuantity,
        this.amountRange,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Relationship#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Relationship withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceSpecification_Relationship(
        this.modifierExtension,
        this.substanceReference,
        this.amountString,
        this.amountRatio,
        this.source,
        this.substanceCodeableConcept,
        this.id,
        this.relationship,
        this.amountRatioLowLimit,
        newValue,
        this.isDefining,
        this.amountQuantity,
        this.amountRange,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Relationship#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Relationship withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceSpecification_Relationship(
        this.modifierExtension,
        this.substanceReference,
        this.amountString,
        this.amountRatio,
        this.source,
        this.substanceCodeableConcept,
        this.id,
        this.relationship,
        this.amountRatioLowLimit,
        value,
        this.isDefining,
        this.amountQuantity,
        this.amountRange,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Relationship#isDefining() isDefining} attribute.
   * @param value The value for isDefining
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Relationship withIsDefining(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.isDefining, newValue)) return this;
    return new ImmutableSubstanceSpecification_Relationship(
        this.modifierExtension,
        this.substanceReference,
        this.amountString,
        this.amountRatio,
        this.source,
        this.substanceCodeableConcept,
        this.id,
        this.relationship,
        this.amountRatioLowLimit,
        this.extension,
        newValue,
        this.amountQuantity,
        this.amountRange,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Relationship#isDefining() isDefining} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for isDefining
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Relationship withIsDefining(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.isDefining, value)) return this;
    return new ImmutableSubstanceSpecification_Relationship(
        this.modifierExtension,
        this.substanceReference,
        this.amountString,
        this.amountRatio,
        this.source,
        this.substanceCodeableConcept,
        this.id,
        this.relationship,
        this.amountRatioLowLimit,
        this.extension,
        value,
        this.amountQuantity,
        this.amountRange,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Relationship#amountQuantity() amountQuantity} attribute.
   * @param value The value for amountQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Relationship withAmountQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "amountQuantity");
    if (this.amountQuantity == newValue) return this;
    return new ImmutableSubstanceSpecification_Relationship(
        this.modifierExtension,
        this.substanceReference,
        this.amountString,
        this.amountRatio,
        this.source,
        this.substanceCodeableConcept,
        this.id,
        this.relationship,
        this.amountRatioLowLimit,
        this.extension,
        this.isDefining,
        newValue,
        this.amountRange,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Relationship#amountQuantity() amountQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amountQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Relationship withAmountQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.amountQuantity == value) return this;
    return new ImmutableSubstanceSpecification_Relationship(
        this.modifierExtension,
        this.substanceReference,
        this.amountString,
        this.amountRatio,
        this.source,
        this.substanceCodeableConcept,
        this.id,
        this.relationship,
        this.amountRatioLowLimit,
        this.extension,
        this.isDefining,
        value,
        this.amountRange,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Relationship#amountRange() amountRange} attribute.
   * @param value The value for amountRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Relationship withAmountRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "amountRange");
    if (this.amountRange == newValue) return this;
    return new ImmutableSubstanceSpecification_Relationship(
        this.modifierExtension,
        this.substanceReference,
        this.amountString,
        this.amountRatio,
        this.source,
        this.substanceCodeableConcept,
        this.id,
        this.relationship,
        this.amountRatioLowLimit,
        this.extension,
        this.isDefining,
        this.amountQuantity,
        newValue,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Relationship#amountRange() amountRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amountRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Relationship withAmountRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.amountRange == value) return this;
    return new ImmutableSubstanceSpecification_Relationship(
        this.modifierExtension,
        this.substanceReference,
        this.amountString,
        this.amountRatio,
        this.source,
        this.substanceCodeableConcept,
        this.id,
        this.relationship,
        this.amountRatioLowLimit,
        this.extension,
        this.isDefining,
        this.amountQuantity,
        value,
        this.amountType);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceSpecification_Relationship#amountType() amountType} attribute.
   * @param value The value for amountType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceSpecification_Relationship withAmountType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "amountType");
    if (this.amountType == newValue) return this;
    return new ImmutableSubstanceSpecification_Relationship(
        this.modifierExtension,
        this.substanceReference,
        this.amountString,
        this.amountRatio,
        this.source,
        this.substanceCodeableConcept,
        this.id,
        this.relationship,
        this.amountRatioLowLimit,
        this.extension,
        this.isDefining,
        this.amountQuantity,
        this.amountRange,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceSpecification_Relationship#amountType() amountType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amountType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceSpecification_Relationship withAmountType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.amountType == value) return this;
    return new ImmutableSubstanceSpecification_Relationship(
        this.modifierExtension,
        this.substanceReference,
        this.amountString,
        this.amountRatio,
        this.source,
        this.substanceCodeableConcept,
        this.id,
        this.relationship,
        this.amountRatioLowLimit,
        this.extension,
        this.isDefining,
        this.amountQuantity,
        this.amountRange,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceSpecification_Relationship} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceSpecification_Relationship
        && equalTo((ImmutableSubstanceSpecification_Relationship) another);
  }

  private boolean equalTo(ImmutableSubstanceSpecification_Relationship another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(substanceReference, another.substanceReference)
        && Objects.equals(amountString, another.amountString)
        && Objects.equals(amountRatio, another.amountRatio)
        && Objects.equals(source, another.source)
        && Objects.equals(substanceCodeableConcept, another.substanceCodeableConcept)
        && Objects.equals(id, another.id)
        && Objects.equals(relationship, another.relationship)
        && Objects.equals(amountRatioLowLimit, another.amountRatioLowLimit)
        && Objects.equals(extension, another.extension)
        && Objects.equals(isDefining, another.isDefining)
        && Objects.equals(amountQuantity, another.amountQuantity)
        && Objects.equals(amountRange, another.amountRange)
        && Objects.equals(amountType, another.amountType);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code substanceReference}, {@code amountString}, {@code amountRatio}, {@code source}, {@code substanceCodeableConcept}, {@code id}, {@code relationship}, {@code amountRatioLowLimit}, {@code extension}, {@code isDefining}, {@code amountQuantity}, {@code amountRange}, {@code amountType}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(substanceReference);
    h += (h << 5) + Objects.hashCode(amountString);
    h += (h << 5) + Objects.hashCode(amountRatio);
    h += (h << 5) + Objects.hashCode(source);
    h += (h << 5) + Objects.hashCode(substanceCodeableConcept);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(relationship);
    h += (h << 5) + Objects.hashCode(amountRatioLowLimit);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(isDefining);
    h += (h << 5) + Objects.hashCode(amountQuantity);
    h += (h << 5) + Objects.hashCode(amountRange);
    h += (h << 5) + Objects.hashCode(amountType);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceSpecification_Relationship} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstanceSpecification_Relationship{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (substanceReference != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("substanceReference=").append(substanceReference);
    }
    if (amountString != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("amountString=").append(amountString);
    }
    if (amountRatio != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("amountRatio=").append(amountRatio);
    }
    if (source != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("source=").append(source);
    }
    if (substanceCodeableConcept != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("substanceCodeableConcept=").append(substanceCodeableConcept);
    }
    if (id != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (relationship != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("relationship=").append(relationship);
    }
    if (amountRatioLowLimit != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("amountRatioLowLimit=").append(amountRatioLowLimit);
    }
    if (extension != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (isDefining != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("isDefining=").append(isDefining);
    }
    if (amountQuantity != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("amountQuantity=").append(amountQuantity);
    }
    if (amountRange != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("amountRange=").append(amountRange);
    }
    if (amountType != null) {
      if (builder.length() > 36) builder.append(", ");
      builder.append("amountType=").append(amountType);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstanceSpecification_Relationship", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstanceSpecification_Relationship {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Reference> substanceReference = Optional.empty();
    boolean substanceReferenceIsSet;
    @Nullable Optional<String> amountString = Optional.empty();
    boolean amountStringIsSet;
    @Nullable Optional<Ratio> amountRatio = Optional.empty();
    boolean amountRatioIsSet;
    @Nullable Optional<List<Reference>> source = Optional.empty();
    boolean sourceIsSet;
    @Nullable Optional<CodeableConcept> substanceCodeableConcept = Optional.empty();
    boolean substanceCodeableConceptIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> relationship = Optional.empty();
    boolean relationshipIsSet;
    @Nullable Optional<Ratio> amountRatioLowLimit = Optional.empty();
    boolean amountRatioLowLimitIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Boolean> isDefining = Optional.empty();
    boolean isDefiningIsSet;
    @Nullable Optional<Quantity> amountQuantity = Optional.empty();
    boolean amountQuantityIsSet;
    @Nullable Optional<Range> amountRange = Optional.empty();
    boolean amountRangeIsSet;
    @Nullable Optional<CodeableConcept> amountType = Optional.empty();
    boolean amountTypeIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("substanceReference")
    public void setSubstanceReference(Optional<Reference> substanceReference) {
      this.substanceReference = substanceReference;
      this.substanceReferenceIsSet = true;
    }
    @JsonProperty("amountString")
    public void setAmountString(Optional<String> amountString) {
      this.amountString = amountString;
      this.amountStringIsSet = true;
    }
    @JsonProperty("amountRatio")
    public void setAmountRatio(Optional<Ratio> amountRatio) {
      this.amountRatio = amountRatio;
      this.amountRatioIsSet = true;
    }
    @JsonProperty("source")
    public void setSource(Optional<List<Reference>> source) {
      this.source = source;
      this.sourceIsSet = true;
    }
    @JsonProperty("substanceCodeableConcept")
    public void setSubstanceCodeableConcept(Optional<CodeableConcept> substanceCodeableConcept) {
      this.substanceCodeableConcept = substanceCodeableConcept;
      this.substanceCodeableConceptIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("relationship")
    public void setRelationship(Optional<CodeableConcept> relationship) {
      this.relationship = relationship;
      this.relationshipIsSet = true;
    }
    @JsonProperty("amountRatioLowLimit")
    public void setAmountRatioLowLimit(Optional<Ratio> amountRatioLowLimit) {
      this.amountRatioLowLimit = amountRatioLowLimit;
      this.amountRatioLowLimitIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("isDefining")
    public void setIsDefining(Optional<Boolean> isDefining) {
      this.isDefining = isDefining;
      this.isDefiningIsSet = true;
    }
    @JsonProperty("amountQuantity")
    public void setAmountQuantity(Optional<Quantity> amountQuantity) {
      this.amountQuantity = amountQuantity;
      this.amountQuantityIsSet = true;
    }
    @JsonProperty("amountRange")
    public void setAmountRange(Optional<Range> amountRange) {
      this.amountRange = amountRange;
      this.amountRangeIsSet = true;
    }
    @JsonProperty("amountType")
    public void setAmountType(Optional<CodeableConcept> amountType) {
      this.amountType = amountType;
      this.amountTypeIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> substanceReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> amountString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Ratio> amountRatio() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> source() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> substanceCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> relationship() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Ratio> amountRatioLowLimit() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> isDefining() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> amountQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> amountRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> amountType() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableSubstanceSpecification_Relationship fromJson(Json json) {
    ImmutableSubstanceSpecification_Relationship.Builder builder = ImmutableSubstanceSpecification_Relationship.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.substanceReferenceIsSet) {
      builder.substanceReference(json.substanceReference);
    }
    if (json.amountStringIsSet) {
      builder.amountString(json.amountString);
    }
    if (json.amountRatioIsSet) {
      builder.amountRatio(json.amountRatio);
    }
    if (json.sourceIsSet) {
      builder.source(json.source);
    }
    if (json.substanceCodeableConceptIsSet) {
      builder.substanceCodeableConcept(json.substanceCodeableConcept);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.relationshipIsSet) {
      builder.relationship(json.relationship);
    }
    if (json.amountRatioLowLimitIsSet) {
      builder.amountRatioLowLimit(json.amountRatioLowLimit);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.isDefiningIsSet) {
      builder.isDefining(json.isDefining);
    }
    if (json.amountQuantityIsSet) {
      builder.amountQuantity(json.amountQuantity);
    }
    if (json.amountRangeIsSet) {
      builder.amountRange(json.amountRange);
    }
    if (json.amountTypeIsSet) {
      builder.amountType(json.amountType);
    }
    return (ImmutableSubstanceSpecification_Relationship) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstanceSpecification_Relationship} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstanceSpecification_Relationship instance
   */
  public static SubstanceSpecification_Relationship copyOf(SubstanceSpecification_Relationship instance) {
    if (instance instanceof ImmutableSubstanceSpecification_Relationship) {
      return (ImmutableSubstanceSpecification_Relationship) instance;
    }
    return ImmutableSubstanceSpecification_Relationship.builder()
        .modifierExtension(instance.modifierExtension())
        .substanceReference(instance.substanceReference())
        .amountString(instance.amountString())
        .amountRatio(instance.amountRatio())
        .source(instance.source())
        .substanceCodeableConcept(instance.substanceCodeableConcept())
        .id(instance.id())
        .relationship(instance.relationship())
        .amountRatioLowLimit(instance.amountRatioLowLimit())
        .extension(instance.extension())
        .isDefining(instance.isDefining())
        .amountQuantity(instance.amountQuantity())
        .amountRange(instance.amountRange())
        .amountType(instance.amountType())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceSpecification_Relationship SubstanceSpecification_Relationship}.
   * <pre>
   * ImmutableSubstanceSpecification_Relationship.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link SubstanceSpecification_Relationship#modifierExtension() modifierExtension}
   *    .substanceReference(com.fhir.types.fhir.Reference) // optional {@link SubstanceSpecification_Relationship#substanceReference() substanceReference}
   *    .amountString(String) // optional {@link SubstanceSpecification_Relationship#amountString() amountString}
   *    .amountRatio(com.fhir.types.fhir.Ratio) // optional {@link SubstanceSpecification_Relationship#amountRatio() amountRatio}
   *    .source(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link SubstanceSpecification_Relationship#source() source}
   *    .substanceCodeableConcept(com.fhir.types.fhir.CodeableConcept) // optional {@link SubstanceSpecification_Relationship#substanceCodeableConcept() substanceCodeableConcept}
   *    .id(String) // optional {@link SubstanceSpecification_Relationship#id() id}
   *    .relationship(com.fhir.types.fhir.CodeableConcept) // optional {@link SubstanceSpecification_Relationship#relationship() relationship}
   *    .amountRatioLowLimit(com.fhir.types.fhir.Ratio) // optional {@link SubstanceSpecification_Relationship#amountRatioLowLimit() amountRatioLowLimit}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link SubstanceSpecification_Relationship#extension() extension}
   *    .isDefining(Boolean) // optional {@link SubstanceSpecification_Relationship#isDefining() isDefining}
   *    .amountQuantity(com.fhir.types.fhir.Quantity) // optional {@link SubstanceSpecification_Relationship#amountQuantity() amountQuantity}
   *    .amountRange(com.fhir.types.fhir.Range) // optional {@link SubstanceSpecification_Relationship#amountRange() amountRange}
   *    .amountType(com.fhir.types.fhir.CodeableConcept) // optional {@link SubstanceSpecification_Relationship#amountType() amountType}
   *    .build();
   * </pre>
   * @return A new SubstanceSpecification_Relationship builder
   */
  public static ImmutableSubstanceSpecification_Relationship.Builder builder() {
    return new ImmutableSubstanceSpecification_Relationship.Builder();
  }

  /**
   * Builds instances of type {@link SubstanceSpecification_Relationship SubstanceSpecification_Relationship}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstanceSpecification_Relationship", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_SUBSTANCE_REFERENCE = 0x2L;
    private static final long OPT_BIT_AMOUNT_STRING = 0x4L;
    private static final long OPT_BIT_AMOUNT_RATIO = 0x8L;
    private static final long OPT_BIT_SOURCE = 0x10L;
    private static final long OPT_BIT_SUBSTANCE_CODEABLE_CONCEPT = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_RELATIONSHIP = 0x80L;
    private static final long OPT_BIT_AMOUNT_RATIO_LOW_LIMIT = 0x100L;
    private static final long OPT_BIT_EXTENSION = 0x200L;
    private static final long OPT_BIT_IS_DEFINING = 0x400L;
    private static final long OPT_BIT_AMOUNT_QUANTITY = 0x800L;
    private static final long OPT_BIT_AMOUNT_RANGE = 0x1000L;
    private static final long OPT_BIT_AMOUNT_TYPE = 0x2000L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable Reference substanceReference;
    private @Nullable String amountString;
    private @Nullable Ratio amountRatio;
    private @Nullable List<Reference> source;
    private @Nullable CodeableConcept substanceCodeableConcept;
    private @Nullable String id;
    private @Nullable CodeableConcept relationship;
    private @Nullable Ratio amountRatioLowLimit;
    private @Nullable List<Extension> extension;
    private @Nullable Boolean isDefining;
    private @Nullable Quantity amountQuantity;
    private @Nullable Range amountRange;
    private @Nullable CodeableConcept amountType;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Relationship#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSpecification_Relationship#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceSpecification_Relationship#substanceReference() substanceReference} to substanceReference.
     * @param substanceReference The value for substanceReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder substanceReference(Reference substanceReference) {
      checkNotIsSet(substanceReferenceIsSet(), "substanceReference");
      this.substanceReference = Objects.requireNonNull(substanceReference, "substanceReference");
      optBits |= OPT_BIT_SUBSTANCE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Relationship#substanceReference() substanceReference} to substanceReference.
     * @param substanceReference The value for substanceReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("substanceReference")
    public final Builder substanceReference(Optional<? extends Reference> substanceReference) {
      checkNotIsSet(substanceReferenceIsSet(), "substanceReference");
      this.substanceReference = substanceReference.orElse(null);
      optBits |= OPT_BIT_SUBSTANCE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Relationship#amountString() amountString} to amountString.
     * @param amountString The value for amountString
     * @return {@code this} builder for chained invocation
     */
    public final Builder amountString(String amountString) {
      checkNotIsSet(amountStringIsSet(), "amountString");
      this.amountString = Objects.requireNonNull(amountString, "amountString");
      optBits |= OPT_BIT_AMOUNT_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Relationship#amountString() amountString} to amountString.
     * @param amountString The value for amountString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("amountString")
    public final Builder amountString(Optional<String> amountString) {
      checkNotIsSet(amountStringIsSet(), "amountString");
      this.amountString = amountString.orElse(null);
      optBits |= OPT_BIT_AMOUNT_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Relationship#amountRatio() amountRatio} to amountRatio.
     * @param amountRatio The value for amountRatio
     * @return {@code this} builder for chained invocation
     */
    public final Builder amountRatio(Ratio amountRatio) {
      checkNotIsSet(amountRatioIsSet(), "amountRatio");
      this.amountRatio = Objects.requireNonNull(amountRatio, "amountRatio");
      optBits |= OPT_BIT_AMOUNT_RATIO;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Relationship#amountRatio() amountRatio} to amountRatio.
     * @param amountRatio The value for amountRatio
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("amountRatio")
    public final Builder amountRatio(Optional<? extends Ratio> amountRatio) {
      checkNotIsSet(amountRatioIsSet(), "amountRatio");
      this.amountRatio = amountRatio.orElse(null);
      optBits |= OPT_BIT_AMOUNT_RATIO;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Relationship#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    public final Builder source(List<Reference> source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = Objects.requireNonNull(source, "source");
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Relationship#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("source")
    public final Builder source(Optional<? extends List<Reference>> source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = source.orElse(null);
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Relationship#substanceCodeableConcept() substanceCodeableConcept} to substanceCodeableConcept.
     * @param substanceCodeableConcept The value for substanceCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder substanceCodeableConcept(CodeableConcept substanceCodeableConcept) {
      checkNotIsSet(substanceCodeableConceptIsSet(), "substanceCodeableConcept");
      this.substanceCodeableConcept = Objects.requireNonNull(substanceCodeableConcept, "substanceCodeableConcept");
      optBits |= OPT_BIT_SUBSTANCE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Relationship#substanceCodeableConcept() substanceCodeableConcept} to substanceCodeableConcept.
     * @param substanceCodeableConcept The value for substanceCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("substanceCodeableConcept")
    public final Builder substanceCodeableConcept(Optional<? extends CodeableConcept> substanceCodeableConcept) {
      checkNotIsSet(substanceCodeableConceptIsSet(), "substanceCodeableConcept");
      this.substanceCodeableConcept = substanceCodeableConcept.orElse(null);
      optBits |= OPT_BIT_SUBSTANCE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Relationship#id() id} to id.
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
     * Initializes the optional value {@link SubstanceSpecification_Relationship#id() id} to id.
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
     * Initializes the optional value {@link SubstanceSpecification_Relationship#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for chained invocation
     */
    public final Builder relationship(CodeableConcept relationship) {
      checkNotIsSet(relationshipIsSet(), "relationship");
      this.relationship = Objects.requireNonNull(relationship, "relationship");
      optBits |= OPT_BIT_RELATIONSHIP;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Relationship#relationship() relationship} to relationship.
     * @param relationship The value for relationship
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("relationship")
    public final Builder relationship(Optional<? extends CodeableConcept> relationship) {
      checkNotIsSet(relationshipIsSet(), "relationship");
      this.relationship = relationship.orElse(null);
      optBits |= OPT_BIT_RELATIONSHIP;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Relationship#amountRatioLowLimit() amountRatioLowLimit} to amountRatioLowLimit.
     * @param amountRatioLowLimit The value for amountRatioLowLimit
     * @return {@code this} builder for chained invocation
     */
    public final Builder amountRatioLowLimit(Ratio amountRatioLowLimit) {
      checkNotIsSet(amountRatioLowLimitIsSet(), "amountRatioLowLimit");
      this.amountRatioLowLimit = Objects.requireNonNull(amountRatioLowLimit, "amountRatioLowLimit");
      optBits |= OPT_BIT_AMOUNT_RATIO_LOW_LIMIT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Relationship#amountRatioLowLimit() amountRatioLowLimit} to amountRatioLowLimit.
     * @param amountRatioLowLimit The value for amountRatioLowLimit
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("amountRatioLowLimit")
    public final Builder amountRatioLowLimit(Optional<? extends Ratio> amountRatioLowLimit) {
      checkNotIsSet(amountRatioLowLimitIsSet(), "amountRatioLowLimit");
      this.amountRatioLowLimit = amountRatioLowLimit.orElse(null);
      optBits |= OPT_BIT_AMOUNT_RATIO_LOW_LIMIT;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Relationship#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSpecification_Relationship#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceSpecification_Relationship#isDefining() isDefining} to isDefining.
     * @param isDefining The value for isDefining
     * @return {@code this} builder for chained invocation
     */
    public final Builder isDefining(boolean isDefining) {
      checkNotIsSet(isDefiningIsSet(), "isDefining");
      this.isDefining = isDefining;
      optBits |= OPT_BIT_IS_DEFINING;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Relationship#isDefining() isDefining} to isDefining.
     * @param isDefining The value for isDefining
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("isDefining")
    public final Builder isDefining(Optional<Boolean> isDefining) {
      checkNotIsSet(isDefiningIsSet(), "isDefining");
      this.isDefining = isDefining.orElse(null);
      optBits |= OPT_BIT_IS_DEFINING;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Relationship#amountQuantity() amountQuantity} to amountQuantity.
     * @param amountQuantity The value for amountQuantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder amountQuantity(Quantity amountQuantity) {
      checkNotIsSet(amountQuantityIsSet(), "amountQuantity");
      this.amountQuantity = Objects.requireNonNull(amountQuantity, "amountQuantity");
      optBits |= OPT_BIT_AMOUNT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Relationship#amountQuantity() amountQuantity} to amountQuantity.
     * @param amountQuantity The value for amountQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("amountQuantity")
    public final Builder amountQuantity(Optional<? extends Quantity> amountQuantity) {
      checkNotIsSet(amountQuantityIsSet(), "amountQuantity");
      this.amountQuantity = amountQuantity.orElse(null);
      optBits |= OPT_BIT_AMOUNT_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Relationship#amountRange() amountRange} to amountRange.
     * @param amountRange The value for amountRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder amountRange(Range amountRange) {
      checkNotIsSet(amountRangeIsSet(), "amountRange");
      this.amountRange = Objects.requireNonNull(amountRange, "amountRange");
      optBits |= OPT_BIT_AMOUNT_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Relationship#amountRange() amountRange} to amountRange.
     * @param amountRange The value for amountRange
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("amountRange")
    public final Builder amountRange(Optional<? extends Range> amountRange) {
      checkNotIsSet(amountRangeIsSet(), "amountRange");
      this.amountRange = amountRange.orElse(null);
      optBits |= OPT_BIT_AMOUNT_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Relationship#amountType() amountType} to amountType.
     * @param amountType The value for amountType
     * @return {@code this} builder for chained invocation
     */
    public final Builder amountType(CodeableConcept amountType) {
      checkNotIsSet(amountTypeIsSet(), "amountType");
      this.amountType = Objects.requireNonNull(amountType, "amountType");
      optBits |= OPT_BIT_AMOUNT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceSpecification_Relationship#amountType() amountType} to amountType.
     * @param amountType The value for amountType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("amountType")
    public final Builder amountType(Optional<? extends CodeableConcept> amountType) {
      checkNotIsSet(amountTypeIsSet(), "amountType");
      this.amountType = amountType.orElse(null);
      optBits |= OPT_BIT_AMOUNT_TYPE;
      return this;
    }

    /**
     * Builds a new {@link SubstanceSpecification_Relationship SubstanceSpecification_Relationship}.
     * @return An immutable instance of SubstanceSpecification_Relationship
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstanceSpecification_Relationship build() {
      return new ImmutableSubstanceSpecification_Relationship(
          modifierExtension,
          substanceReference,
          amountString,
          amountRatio,
          source,
          substanceCodeableConcept,
          id,
          relationship,
          amountRatioLowLimit,
          extension,
          isDefining,
          amountQuantity,
          amountRange,
          amountType);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean substanceReferenceIsSet() {
      return (optBits & OPT_BIT_SUBSTANCE_REFERENCE) != 0;
    }

    private boolean amountStringIsSet() {
      return (optBits & OPT_BIT_AMOUNT_STRING) != 0;
    }

    private boolean amountRatioIsSet() {
      return (optBits & OPT_BIT_AMOUNT_RATIO) != 0;
    }

    private boolean sourceIsSet() {
      return (optBits & OPT_BIT_SOURCE) != 0;
    }

    private boolean substanceCodeableConceptIsSet() {
      return (optBits & OPT_BIT_SUBSTANCE_CODEABLE_CONCEPT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean relationshipIsSet() {
      return (optBits & OPT_BIT_RELATIONSHIP) != 0;
    }

    private boolean amountRatioLowLimitIsSet() {
      return (optBits & OPT_BIT_AMOUNT_RATIO_LOW_LIMIT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean isDefiningIsSet() {
      return (optBits & OPT_BIT_IS_DEFINING) != 0;
    }

    private boolean amountQuantityIsSet() {
      return (optBits & OPT_BIT_AMOUNT_QUANTITY) != 0;
    }

    private boolean amountRangeIsSet() {
      return (optBits & OPT_BIT_AMOUNT_RANGE) != 0;
    }

    private boolean amountTypeIsSet() {
      return (optBits & OPT_BIT_AMOUNT_TYPE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstanceSpecification_Relationship is strict, attribute is already set: ".concat(name));
    }
  }
}

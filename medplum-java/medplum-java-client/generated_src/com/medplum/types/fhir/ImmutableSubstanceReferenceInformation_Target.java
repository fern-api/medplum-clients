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
 * Immutable implementation of {@link SubstanceReferenceInformation_Target}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableSubstanceReferenceInformation_Target.builder()}.
 */
@Generated(from = "SubstanceReferenceInformation_Target", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableSubstanceReferenceInformation_Target
    implements SubstanceReferenceInformation_Target {
  private final @Nullable CodeableConcept organismType;
  private final @Nullable Range amountRange;
  private final @Nullable List<Reference> source;
  private final @Nullable CodeableConcept type;
  private final @Nullable Identifier target;
  private final @Nullable String id;
  private final @Nullable CodeableConcept interaction;
  private final @Nullable CodeableConcept organism;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String amountString;
  private final @Nullable Quantity amountQuantity;
  private final @Nullable CodeableConcept amountType;
  private final @Nullable List<Extension> extension;

  private ImmutableSubstanceReferenceInformation_Target(
      @Nullable CodeableConcept organismType,
      @Nullable Range amountRange,
      @Nullable List<Reference> source,
      @Nullable CodeableConcept type,
      @Nullable Identifier target,
      @Nullable String id,
      @Nullable CodeableConcept interaction,
      @Nullable CodeableConcept organism,
      @Nullable List<Extension> modifierExtension,
      @Nullable String amountString,
      @Nullable Quantity amountQuantity,
      @Nullable CodeableConcept amountType,
      @Nullable List<Extension> extension) {
    this.organismType = organismType;
    this.amountRange = amountRange;
    this.source = source;
    this.type = type;
    this.target = target;
    this.id = id;
    this.interaction = interaction;
    this.organism = organism;
    this.modifierExtension = modifierExtension;
    this.amountString = amountString;
    this.amountQuantity = amountQuantity;
    this.amountType = amountType;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code organismType} attribute
   */
  @JsonProperty("organismType")
  @Override
  public Optional<CodeableConcept> organismType() {
    return Optional.ofNullable(organismType);
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
   * @return The value of the {@code source} attribute
   */
  @JsonProperty("source")
  @Override
  public Optional<List<Reference>> source() {
    return Optional.ofNullable(source);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code target} attribute
   */
  @JsonProperty("target")
  @Override
  public Optional<Identifier> target() {
    return Optional.ofNullable(target);
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
   * @return The value of the {@code interaction} attribute
   */
  @JsonProperty("interaction")
  @Override
  public Optional<CodeableConcept> interaction() {
    return Optional.ofNullable(interaction);
  }

  /**
   * @return The value of the {@code organism} attribute
   */
  @JsonProperty("organism")
  @Override
  public Optional<CodeableConcept> organism() {
    return Optional.ofNullable(organism);
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
   * @return The value of the {@code amountString} attribute
   */
  @JsonProperty("amountString")
  @Override
  public Optional<String> amountString() {
    return Optional.ofNullable(amountString);
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
   * @return The value of the {@code amountType} attribute
   */
  @JsonProperty("amountType")
  @Override
  public Optional<CodeableConcept> amountType() {
    return Optional.ofNullable(amountType);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation_Target#organismType() organismType} attribute.
   * @param value The value for organismType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_Target withOrganismType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "organismType");
    if (this.organismType == newValue) return this;
    return new ImmutableSubstanceReferenceInformation_Target(
        newValue,
        this.amountRange,
        this.source,
        this.type,
        this.target,
        this.id,
        this.interaction,
        this.organism,
        this.modifierExtension,
        this.amountString,
        this.amountQuantity,
        this.amountType,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation_Target#organismType() organismType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for organismType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation_Target withOrganismType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.organismType == value) return this;
    return new ImmutableSubstanceReferenceInformation_Target(
        value,
        this.amountRange,
        this.source,
        this.type,
        this.target,
        this.id,
        this.interaction,
        this.organism,
        this.modifierExtension,
        this.amountString,
        this.amountQuantity,
        this.amountType,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation_Target#amountRange() amountRange} attribute.
   * @param value The value for amountRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_Target withAmountRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "amountRange");
    if (this.amountRange == newValue) return this;
    return new ImmutableSubstanceReferenceInformation_Target(
        this.organismType,
        newValue,
        this.source,
        this.type,
        this.target,
        this.id,
        this.interaction,
        this.organism,
        this.modifierExtension,
        this.amountString,
        this.amountQuantity,
        this.amountType,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation_Target#amountRange() amountRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amountRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation_Target withAmountRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.amountRange == value) return this;
    return new ImmutableSubstanceReferenceInformation_Target(
        this.organismType,
        value,
        this.source,
        this.type,
        this.target,
        this.id,
        this.interaction,
        this.organism,
        this.modifierExtension,
        this.amountString,
        this.amountQuantity,
        this.amountType,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation_Target#source() source} attribute.
   * @param value The value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_Target withSource(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "source");
    if (this.source == newValue) return this;
    return new ImmutableSubstanceReferenceInformation_Target(
        this.organismType,
        this.amountRange,
        newValue,
        this.type,
        this.target,
        this.id,
        this.interaction,
        this.organism,
        this.modifierExtension,
        this.amountString,
        this.amountQuantity,
        this.amountType,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation_Target#source() source} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for source
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation_Target withSource(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.source == value) return this;
    return new ImmutableSubstanceReferenceInformation_Target(
        this.organismType,
        this.amountRange,
        value,
        this.type,
        this.target,
        this.id,
        this.interaction,
        this.organism,
        this.modifierExtension,
        this.amountString,
        this.amountQuantity,
        this.amountType,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation_Target#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_Target withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableSubstanceReferenceInformation_Target(
        this.organismType,
        this.amountRange,
        this.source,
        newValue,
        this.target,
        this.id,
        this.interaction,
        this.organism,
        this.modifierExtension,
        this.amountString,
        this.amountQuantity,
        this.amountType,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation_Target#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation_Target withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableSubstanceReferenceInformation_Target(
        this.organismType,
        this.amountRange,
        this.source,
        value,
        this.target,
        this.id,
        this.interaction,
        this.organism,
        this.modifierExtension,
        this.amountString,
        this.amountQuantity,
        this.amountType,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation_Target#target() target} attribute.
   * @param value The value for target
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_Target withTarget(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "target");
    if (this.target == newValue) return this;
    return new ImmutableSubstanceReferenceInformation_Target(
        this.organismType,
        this.amountRange,
        this.source,
        this.type,
        newValue,
        this.id,
        this.interaction,
        this.organism,
        this.modifierExtension,
        this.amountString,
        this.amountQuantity,
        this.amountType,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation_Target#target() target} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for target
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation_Target withTarget(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.target == value) return this;
    return new ImmutableSubstanceReferenceInformation_Target(
        this.organismType,
        this.amountRange,
        this.source,
        this.type,
        value,
        this.id,
        this.interaction,
        this.organism,
        this.modifierExtension,
        this.amountString,
        this.amountQuantity,
        this.amountType,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation_Target#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_Target withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableSubstanceReferenceInformation_Target(
        this.organismType,
        this.amountRange,
        this.source,
        this.type,
        this.target,
        newValue,
        this.interaction,
        this.organism,
        this.modifierExtension,
        this.amountString,
        this.amountQuantity,
        this.amountType,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation_Target#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_Target withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableSubstanceReferenceInformation_Target(
        this.organismType,
        this.amountRange,
        this.source,
        this.type,
        this.target,
        value,
        this.interaction,
        this.organism,
        this.modifierExtension,
        this.amountString,
        this.amountQuantity,
        this.amountType,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation_Target#interaction() interaction} attribute.
   * @param value The value for interaction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_Target withInteraction(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "interaction");
    if (this.interaction == newValue) return this;
    return new ImmutableSubstanceReferenceInformation_Target(
        this.organismType,
        this.amountRange,
        this.source,
        this.type,
        this.target,
        this.id,
        newValue,
        this.organism,
        this.modifierExtension,
        this.amountString,
        this.amountQuantity,
        this.amountType,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation_Target#interaction() interaction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for interaction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation_Target withInteraction(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.interaction == value) return this;
    return new ImmutableSubstanceReferenceInformation_Target(
        this.organismType,
        this.amountRange,
        this.source,
        this.type,
        this.target,
        this.id,
        value,
        this.organism,
        this.modifierExtension,
        this.amountString,
        this.amountQuantity,
        this.amountType,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation_Target#organism() organism} attribute.
   * @param value The value for organism
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_Target withOrganism(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "organism");
    if (this.organism == newValue) return this;
    return new ImmutableSubstanceReferenceInformation_Target(
        this.organismType,
        this.amountRange,
        this.source,
        this.type,
        this.target,
        this.id,
        this.interaction,
        newValue,
        this.modifierExtension,
        this.amountString,
        this.amountQuantity,
        this.amountType,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation_Target#organism() organism} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for organism
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation_Target withOrganism(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.organism == value) return this;
    return new ImmutableSubstanceReferenceInformation_Target(
        this.organismType,
        this.amountRange,
        this.source,
        this.type,
        this.target,
        this.id,
        this.interaction,
        value,
        this.modifierExtension,
        this.amountString,
        this.amountQuantity,
        this.amountType,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation_Target#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_Target withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableSubstanceReferenceInformation_Target(
        this.organismType,
        this.amountRange,
        this.source,
        this.type,
        this.target,
        this.id,
        this.interaction,
        this.organism,
        newValue,
        this.amountString,
        this.amountQuantity,
        this.amountType,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation_Target#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation_Target withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableSubstanceReferenceInformation_Target(
        this.organismType,
        this.amountRange,
        this.source,
        this.type,
        this.target,
        this.id,
        this.interaction,
        this.organism,
        value,
        this.amountString,
        this.amountQuantity,
        this.amountType,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation_Target#amountString() amountString} attribute.
   * @param value The value for amountString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_Target withAmountString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "amountString");
    if (Objects.equals(this.amountString, newValue)) return this;
    return new ImmutableSubstanceReferenceInformation_Target(
        this.organismType,
        this.amountRange,
        this.source,
        this.type,
        this.target,
        this.id,
        this.interaction,
        this.organism,
        this.modifierExtension,
        newValue,
        this.amountQuantity,
        this.amountType,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation_Target#amountString() amountString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amountString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_Target withAmountString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.amountString, value)) return this;
    return new ImmutableSubstanceReferenceInformation_Target(
        this.organismType,
        this.amountRange,
        this.source,
        this.type,
        this.target,
        this.id,
        this.interaction,
        this.organism,
        this.modifierExtension,
        value,
        this.amountQuantity,
        this.amountType,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation_Target#amountQuantity() amountQuantity} attribute.
   * @param value The value for amountQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_Target withAmountQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "amountQuantity");
    if (this.amountQuantity == newValue) return this;
    return new ImmutableSubstanceReferenceInformation_Target(
        this.organismType,
        this.amountRange,
        this.source,
        this.type,
        this.target,
        this.id,
        this.interaction,
        this.organism,
        this.modifierExtension,
        this.amountString,
        newValue,
        this.amountType,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation_Target#amountQuantity() amountQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amountQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation_Target withAmountQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.amountQuantity == value) return this;
    return new ImmutableSubstanceReferenceInformation_Target(
        this.organismType,
        this.amountRange,
        this.source,
        this.type,
        this.target,
        this.id,
        this.interaction,
        this.organism,
        this.modifierExtension,
        this.amountString,
        value,
        this.amountType,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation_Target#amountType() amountType} attribute.
   * @param value The value for amountType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_Target withAmountType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "amountType");
    if (this.amountType == newValue) return this;
    return new ImmutableSubstanceReferenceInformation_Target(
        this.organismType,
        this.amountRange,
        this.source,
        this.type,
        this.target,
        this.id,
        this.interaction,
        this.organism,
        this.modifierExtension,
        this.amountString,
        this.amountQuantity,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation_Target#amountType() amountType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for amountType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation_Target withAmountType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.amountType == value) return this;
    return new ImmutableSubstanceReferenceInformation_Target(
        this.organismType,
        this.amountRange,
        this.source,
        this.type,
        this.target,
        this.id,
        this.interaction,
        this.organism,
        this.modifierExtension,
        this.amountString,
        this.amountQuantity,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link SubstanceReferenceInformation_Target#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableSubstanceReferenceInformation_Target withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableSubstanceReferenceInformation_Target(
        this.organismType,
        this.amountRange,
        this.source,
        this.type,
        this.target,
        this.id,
        this.interaction,
        this.organism,
        this.modifierExtension,
        this.amountString,
        this.amountQuantity,
        this.amountType,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link SubstanceReferenceInformation_Target#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableSubstanceReferenceInformation_Target withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableSubstanceReferenceInformation_Target(
        this.organismType,
        this.amountRange,
        this.source,
        this.type,
        this.target,
        this.id,
        this.interaction,
        this.organism,
        this.modifierExtension,
        this.amountString,
        this.amountQuantity,
        this.amountType,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableSubstanceReferenceInformation_Target} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableSubstanceReferenceInformation_Target
        && equalTo((ImmutableSubstanceReferenceInformation_Target) another);
  }

  private boolean equalTo(ImmutableSubstanceReferenceInformation_Target another) {
    return Objects.equals(organismType, another.organismType)
        && Objects.equals(amountRange, another.amountRange)
        && Objects.equals(source, another.source)
        && Objects.equals(type, another.type)
        && Objects.equals(target, another.target)
        && Objects.equals(id, another.id)
        && Objects.equals(interaction, another.interaction)
        && Objects.equals(organism, another.organism)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(amountString, another.amountString)
        && Objects.equals(amountQuantity, another.amountQuantity)
        && Objects.equals(amountType, another.amountType)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code organismType}, {@code amountRange}, {@code source}, {@code type}, {@code target}, {@code id}, {@code interaction}, {@code organism}, {@code modifierExtension}, {@code amountString}, {@code amountQuantity}, {@code amountType}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(organismType);
    h += (h << 5) + Objects.hashCode(amountRange);
    h += (h << 5) + Objects.hashCode(source);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(target);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(interaction);
    h += (h << 5) + Objects.hashCode(organism);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(amountString);
    h += (h << 5) + Objects.hashCode(amountQuantity);
    h += (h << 5) + Objects.hashCode(amountType);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code SubstanceReferenceInformation_Target} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("SubstanceReferenceInformation_Target{");
    if (organismType != null) {
      builder.append("organismType=").append(organismType);
    }
    if (amountRange != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("amountRange=").append(amountRange);
    }
    if (source != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("source=").append(source);
    }
    if (type != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (target != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("target=").append(target);
    }
    if (id != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (interaction != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("interaction=").append(interaction);
    }
    if (organism != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("organism=").append(organism);
    }
    if (modifierExtension != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (amountString != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("amountString=").append(amountString);
    }
    if (amountQuantity != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("amountQuantity=").append(amountQuantity);
    }
    if (amountType != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("amountType=").append(amountType);
    }
    if (extension != null) {
      if (builder.length() > 37) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "SubstanceReferenceInformation_Target", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements SubstanceReferenceInformation_Target {
    @Nullable Optional<CodeableConcept> organismType = Optional.empty();
    boolean organismTypeIsSet;
    @Nullable Optional<Range> amountRange = Optional.empty();
    boolean amountRangeIsSet;
    @Nullable Optional<List<Reference>> source = Optional.empty();
    boolean sourceIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<Identifier> target = Optional.empty();
    boolean targetIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<CodeableConcept> interaction = Optional.empty();
    boolean interactionIsSet;
    @Nullable Optional<CodeableConcept> organism = Optional.empty();
    boolean organismIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> amountString = Optional.empty();
    boolean amountStringIsSet;
    @Nullable Optional<Quantity> amountQuantity = Optional.empty();
    boolean amountQuantityIsSet;
    @Nullable Optional<CodeableConcept> amountType = Optional.empty();
    boolean amountTypeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("organismType")
    public void setOrganismType(Optional<CodeableConcept> organismType) {
      this.organismType = organismType;
      this.organismTypeIsSet = true;
    }
    @JsonProperty("amountRange")
    public void setAmountRange(Optional<Range> amountRange) {
      this.amountRange = amountRange;
      this.amountRangeIsSet = true;
    }
    @JsonProperty("source")
    public void setSource(Optional<List<Reference>> source) {
      this.source = source;
      this.sourceIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("target")
    public void setTarget(Optional<Identifier> target) {
      this.target = target;
      this.targetIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("interaction")
    public void setInteraction(Optional<CodeableConcept> interaction) {
      this.interaction = interaction;
      this.interactionIsSet = true;
    }
    @JsonProperty("organism")
    public void setOrganism(Optional<CodeableConcept> organism) {
      this.organism = organism;
      this.organismIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("amountString")
    public void setAmountString(Optional<String> amountString) {
      this.amountString = amountString;
      this.amountStringIsSet = true;
    }
    @JsonProperty("amountQuantity")
    public void setAmountQuantity(Optional<Quantity> amountQuantity) {
      this.amountQuantity = amountQuantity;
      this.amountQuantityIsSet = true;
    }
    @JsonProperty("amountType")
    public void setAmountType(Optional<CodeableConcept> amountType) {
      this.amountType = amountType;
      this.amountTypeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> organismType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> amountRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> source() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> target() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> interaction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> organism() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> amountString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> amountQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> amountType() { throw new UnsupportedOperationException(); }
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
  static ImmutableSubstanceReferenceInformation_Target fromJson(Json json) {
    ImmutableSubstanceReferenceInformation_Target.Builder builder = ImmutableSubstanceReferenceInformation_Target.builder();
    if (json.organismTypeIsSet) {
      builder.organismType(json.organismType);
    }
    if (json.amountRangeIsSet) {
      builder.amountRange(json.amountRange);
    }
    if (json.sourceIsSet) {
      builder.source(json.source);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.targetIsSet) {
      builder.target(json.target);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.interactionIsSet) {
      builder.interaction(json.interaction);
    }
    if (json.organismIsSet) {
      builder.organism(json.organism);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.amountStringIsSet) {
      builder.amountString(json.amountString);
    }
    if (json.amountQuantityIsSet) {
      builder.amountQuantity(json.amountQuantity);
    }
    if (json.amountTypeIsSet) {
      builder.amountType(json.amountType);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableSubstanceReferenceInformation_Target) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link SubstanceReferenceInformation_Target} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable SubstanceReferenceInformation_Target instance
   */
  public static SubstanceReferenceInformation_Target copyOf(SubstanceReferenceInformation_Target instance) {
    if (instance instanceof ImmutableSubstanceReferenceInformation_Target) {
      return (ImmutableSubstanceReferenceInformation_Target) instance;
    }
    return ImmutableSubstanceReferenceInformation_Target.builder()
        .organismType(instance.organismType())
        .amountRange(instance.amountRange())
        .source(instance.source())
        .type(instance.type())
        .target(instance.target())
        .id(instance.id())
        .interaction(instance.interaction())
        .organism(instance.organism())
        .modifierExtension(instance.modifierExtension())
        .amountString(instance.amountString())
        .amountQuantity(instance.amountQuantity())
        .amountType(instance.amountType())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link SubstanceReferenceInformation_Target SubstanceReferenceInformation_Target}.
   * <pre>
   * ImmutableSubstanceReferenceInformation_Target.builder()
   *    .organismType(com.medplum.types.fhir.CodeableConcept) // optional {@link SubstanceReferenceInformation_Target#organismType() organismType}
   *    .amountRange(com.medplum.types.fhir.Range) // optional {@link SubstanceReferenceInformation_Target#amountRange() amountRange}
   *    .source(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link SubstanceReferenceInformation_Target#source() source}
   *    .type(com.medplum.types.fhir.CodeableConcept) // optional {@link SubstanceReferenceInformation_Target#type() type}
   *    .target(com.medplum.types.fhir.Identifier) // optional {@link SubstanceReferenceInformation_Target#target() target}
   *    .id(String) // optional {@link SubstanceReferenceInformation_Target#id() id}
   *    .interaction(com.medplum.types.fhir.CodeableConcept) // optional {@link SubstanceReferenceInformation_Target#interaction() interaction}
   *    .organism(com.medplum.types.fhir.CodeableConcept) // optional {@link SubstanceReferenceInformation_Target#organism() organism}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SubstanceReferenceInformation_Target#modifierExtension() modifierExtension}
   *    .amountString(String) // optional {@link SubstanceReferenceInformation_Target#amountString() amountString}
   *    .amountQuantity(com.medplum.types.fhir.Quantity) // optional {@link SubstanceReferenceInformation_Target#amountQuantity() amountQuantity}
   *    .amountType(com.medplum.types.fhir.CodeableConcept) // optional {@link SubstanceReferenceInformation_Target#amountType() amountType}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link SubstanceReferenceInformation_Target#extension() extension}
   *    .build();
   * </pre>
   * @return A new SubstanceReferenceInformation_Target builder
   */
  public static ImmutableSubstanceReferenceInformation_Target.Builder builder() {
    return new ImmutableSubstanceReferenceInformation_Target.Builder();
  }

  /**
   * Builds instances of type {@link SubstanceReferenceInformation_Target SubstanceReferenceInformation_Target}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "SubstanceReferenceInformation_Target", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ORGANISM_TYPE = 0x1L;
    private static final long OPT_BIT_AMOUNT_RANGE = 0x2L;
    private static final long OPT_BIT_SOURCE = 0x4L;
    private static final long OPT_BIT_TYPE = 0x8L;
    private static final long OPT_BIT_TARGET = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_INTERACTION = 0x40L;
    private static final long OPT_BIT_ORGANISM = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private static final long OPT_BIT_AMOUNT_STRING = 0x200L;
    private static final long OPT_BIT_AMOUNT_QUANTITY = 0x400L;
    private static final long OPT_BIT_AMOUNT_TYPE = 0x800L;
    private static final long OPT_BIT_EXTENSION = 0x1000L;
    private long optBits;

    private @Nullable CodeableConcept organismType;
    private @Nullable Range amountRange;
    private @Nullable List<Reference> source;
    private @Nullable CodeableConcept type;
    private @Nullable Identifier target;
    private @Nullable String id;
    private @Nullable CodeableConcept interaction;
    private @Nullable CodeableConcept organism;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String amountString;
    private @Nullable Quantity amountQuantity;
    private @Nullable CodeableConcept amountType;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation_Target#organismType() organismType} to organismType.
     * @param organismType The value for organismType
     * @return {@code this} builder for chained invocation
     */
    public final Builder organismType(CodeableConcept organismType) {
      checkNotIsSet(organismTypeIsSet(), "organismType");
      this.organismType = Objects.requireNonNull(organismType, "organismType");
      optBits |= OPT_BIT_ORGANISM_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation_Target#organismType() organismType} to organismType.
     * @param organismType The value for organismType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("organismType")
    public final Builder organismType(Optional<? extends CodeableConcept> organismType) {
      checkNotIsSet(organismTypeIsSet(), "organismType");
      this.organismType = organismType.orElse(null);
      optBits |= OPT_BIT_ORGANISM_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation_Target#amountRange() amountRange} to amountRange.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_Target#amountRange() amountRange} to amountRange.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_Target#source() source} to source.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_Target#source() source} to source.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_Target#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation_Target#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation_Target#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for chained invocation
     */
    public final Builder target(Identifier target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = Objects.requireNonNull(target, "target");
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation_Target#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("target")
    public final Builder target(Optional<? extends Identifier> target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = target.orElse(null);
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation_Target#id() id} to id.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_Target#id() id} to id.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_Target#interaction() interaction} to interaction.
     * @param interaction The value for interaction
     * @return {@code this} builder for chained invocation
     */
    public final Builder interaction(CodeableConcept interaction) {
      checkNotIsSet(interactionIsSet(), "interaction");
      this.interaction = Objects.requireNonNull(interaction, "interaction");
      optBits |= OPT_BIT_INTERACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation_Target#interaction() interaction} to interaction.
     * @param interaction The value for interaction
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("interaction")
    public final Builder interaction(Optional<? extends CodeableConcept> interaction) {
      checkNotIsSet(interactionIsSet(), "interaction");
      this.interaction = interaction.orElse(null);
      optBits |= OPT_BIT_INTERACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation_Target#organism() organism} to organism.
     * @param organism The value for organism
     * @return {@code this} builder for chained invocation
     */
    public final Builder organism(CodeableConcept organism) {
      checkNotIsSet(organismIsSet(), "organism");
      this.organism = Objects.requireNonNull(organism, "organism");
      optBits |= OPT_BIT_ORGANISM;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation_Target#organism() organism} to organism.
     * @param organism The value for organism
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("organism")
    public final Builder organism(Optional<? extends CodeableConcept> organism) {
      checkNotIsSet(organismIsSet(), "organism");
      this.organism = organism.orElse(null);
      optBits |= OPT_BIT_ORGANISM;
      return this;
    }

    /**
     * Initializes the optional value {@link SubstanceReferenceInformation_Target#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_Target#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_Target#amountString() amountString} to amountString.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_Target#amountString() amountString} to amountString.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_Target#amountQuantity() amountQuantity} to amountQuantity.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_Target#amountQuantity() amountQuantity} to amountQuantity.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_Target#amountType() amountType} to amountType.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_Target#amountType() amountType} to amountType.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_Target#extension() extension} to extension.
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
     * Initializes the optional value {@link SubstanceReferenceInformation_Target#extension() extension} to extension.
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
     * Builds a new {@link SubstanceReferenceInformation_Target SubstanceReferenceInformation_Target}.
     * @return An immutable instance of SubstanceReferenceInformation_Target
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public SubstanceReferenceInformation_Target build() {
      return new ImmutableSubstanceReferenceInformation_Target(
          organismType,
          amountRange,
          source,
          type,
          target,
          id,
          interaction,
          organism,
          modifierExtension,
          amountString,
          amountQuantity,
          amountType,
          extension);
    }

    private boolean organismTypeIsSet() {
      return (optBits & OPT_BIT_ORGANISM_TYPE) != 0;
    }

    private boolean amountRangeIsSet() {
      return (optBits & OPT_BIT_AMOUNT_RANGE) != 0;
    }

    private boolean sourceIsSet() {
      return (optBits & OPT_BIT_SOURCE) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean targetIsSet() {
      return (optBits & OPT_BIT_TARGET) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean interactionIsSet() {
      return (optBits & OPT_BIT_INTERACTION) != 0;
    }

    private boolean organismIsSet() {
      return (optBits & OPT_BIT_ORGANISM) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean amountStringIsSet() {
      return (optBits & OPT_BIT_AMOUNT_STRING) != 0;
    }

    private boolean amountQuantityIsSet() {
      return (optBits & OPT_BIT_AMOUNT_QUANTITY) != 0;
    }

    private boolean amountTypeIsSet() {
      return (optBits & OPT_BIT_AMOUNT_TYPE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of SubstanceReferenceInformation_Target is strict, attribute is already set: ".concat(name));
    }
  }
}

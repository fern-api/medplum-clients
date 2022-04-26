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
 * Immutable implementation of {@link MolecularSequence_ReferenceSeq}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMolecularSequence_ReferenceSeq.builder()}.
 */
@Generated(from = "MolecularSequence_ReferenceSeq", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMolecularSequence_ReferenceSeq
    implements MolecularSequence_ReferenceSeq {
  private final @Nullable CodeableConcept referenceSeqId;
  private final @Nullable Reference referenceSeqPointer;
  private final @Nullable Molecularsequence_referenceseqOrientation orientation;
  private final @Nullable String id;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final @Nullable String referenceSeqString;
  private final @Nullable Integer windowEnd;
  private final @Nullable String genomeBuild;
  private final @Nullable Molecularsequence_referenceseqStrand strand;
  private final @Nullable CodeableConcept chromosome;
  private final @Nullable Integer windowStart;

  private ImmutableMolecularSequence_ReferenceSeq(
      @Nullable CodeableConcept referenceSeqId,
      @Nullable Reference referenceSeqPointer,
      @Nullable Molecularsequence_referenceseqOrientation orientation,
      @Nullable String id,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      @Nullable String referenceSeqString,
      @Nullable Integer windowEnd,
      @Nullable String genomeBuild,
      @Nullable Molecularsequence_referenceseqStrand strand,
      @Nullable CodeableConcept chromosome,
      @Nullable Integer windowStart) {
    this.referenceSeqId = referenceSeqId;
    this.referenceSeqPointer = referenceSeqPointer;
    this.orientation = orientation;
    this.id = id;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.referenceSeqString = referenceSeqString;
    this.windowEnd = windowEnd;
    this.genomeBuild = genomeBuild;
    this.strand = strand;
    this.chromosome = chromosome;
    this.windowStart = windowStart;
  }

  /**
   * @return The value of the {@code referenceSeqId} attribute
   */
  @JsonProperty("referenceSeqId")
  @Override
  public Optional<CodeableConcept> referenceSeqId() {
    return Optional.ofNullable(referenceSeqId);
  }

  /**
   * @return The value of the {@code referenceSeqPointer} attribute
   */
  @JsonProperty("referenceSeqPointer")
  @Override
  public Optional<Reference> referenceSeqPointer() {
    return Optional.ofNullable(referenceSeqPointer);
  }

  /**
   * @return The value of the {@code orientation} attribute
   */
  @JsonProperty("orientation")
  @Override
  public Optional<Molecularsequence_referenceseqOrientation> orientation() {
    return Optional.ofNullable(orientation);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
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
   * @return The value of the {@code referenceSeqString} attribute
   */
  @JsonProperty("referenceSeqString")
  @Override
  public Optional<String> referenceSeqString() {
    return Optional.ofNullable(referenceSeqString);
  }

  /**
   * @return The value of the {@code windowEnd} attribute
   */
  @JsonProperty("windowEnd")
  @Override
  public Optional<Integer> windowEnd() {
    return Optional.ofNullable(windowEnd);
  }

  /**
   * @return The value of the {@code genomeBuild} attribute
   */
  @JsonProperty("genomeBuild")
  @Override
  public Optional<String> genomeBuild() {
    return Optional.ofNullable(genomeBuild);
  }

  /**
   * @return The value of the {@code strand} attribute
   */
  @JsonProperty("strand")
  @Override
  public Optional<Molecularsequence_referenceseqStrand> strand() {
    return Optional.ofNullable(strand);
  }

  /**
   * @return The value of the {@code chromosome} attribute
   */
  @JsonProperty("chromosome")
  @Override
  public Optional<CodeableConcept> chromosome() {
    return Optional.ofNullable(chromosome);
  }

  /**
   * @return The value of the {@code windowStart} attribute
   */
  @JsonProperty("windowStart")
  @Override
  public Optional<Integer> windowStart() {
    return Optional.ofNullable(windowStart);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_ReferenceSeq#referenceSeqId() referenceSeqId} attribute.
   * @param value The value for referenceSeqId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_ReferenceSeq withReferenceSeqId(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "referenceSeqId");
    if (this.referenceSeqId == newValue) return this;
    return new ImmutableMolecularSequence_ReferenceSeq(
        newValue,
        this.referenceSeqPointer,
        this.orientation,
        this.id,
        this.modifierExtension,
        this.extension,
        this.referenceSeqString,
        this.windowEnd,
        this.genomeBuild,
        this.strand,
        this.chromosome,
        this.windowStart);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_ReferenceSeq#referenceSeqId() referenceSeqId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for referenceSeqId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_ReferenceSeq withReferenceSeqId(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.referenceSeqId == value) return this;
    return new ImmutableMolecularSequence_ReferenceSeq(
        value,
        this.referenceSeqPointer,
        this.orientation,
        this.id,
        this.modifierExtension,
        this.extension,
        this.referenceSeqString,
        this.windowEnd,
        this.genomeBuild,
        this.strand,
        this.chromosome,
        this.windowStart);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_ReferenceSeq#referenceSeqPointer() referenceSeqPointer} attribute.
   * @param value The value for referenceSeqPointer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_ReferenceSeq withReferenceSeqPointer(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "referenceSeqPointer");
    if (this.referenceSeqPointer == newValue) return this;
    return new ImmutableMolecularSequence_ReferenceSeq(
        this.referenceSeqId,
        newValue,
        this.orientation,
        this.id,
        this.modifierExtension,
        this.extension,
        this.referenceSeqString,
        this.windowEnd,
        this.genomeBuild,
        this.strand,
        this.chromosome,
        this.windowStart);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_ReferenceSeq#referenceSeqPointer() referenceSeqPointer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for referenceSeqPointer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_ReferenceSeq withReferenceSeqPointer(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.referenceSeqPointer == value) return this;
    return new ImmutableMolecularSequence_ReferenceSeq(
        this.referenceSeqId,
        value,
        this.orientation,
        this.id,
        this.modifierExtension,
        this.extension,
        this.referenceSeqString,
        this.windowEnd,
        this.genomeBuild,
        this.strand,
        this.chromosome,
        this.windowStart);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_ReferenceSeq#orientation() orientation} attribute.
   * @param value The value for orientation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_ReferenceSeq withOrientation(Molecularsequence_referenceseqOrientation value) {
    @Nullable Molecularsequence_referenceseqOrientation newValue = Objects.requireNonNull(value, "orientation");
    if (this.orientation == newValue) return this;
    return new ImmutableMolecularSequence_ReferenceSeq(
        this.referenceSeqId,
        this.referenceSeqPointer,
        newValue,
        this.id,
        this.modifierExtension,
        this.extension,
        this.referenceSeqString,
        this.windowEnd,
        this.genomeBuild,
        this.strand,
        this.chromosome,
        this.windowStart);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_ReferenceSeq#orientation() orientation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for orientation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_ReferenceSeq withOrientation(Optional<? extends Molecularsequence_referenceseqOrientation> optional) {
    @Nullable Molecularsequence_referenceseqOrientation value = optional.orElse(null);
    if (this.orientation == value) return this;
    return new ImmutableMolecularSequence_ReferenceSeq(
        this.referenceSeqId,
        this.referenceSeqPointer,
        value,
        this.id,
        this.modifierExtension,
        this.extension,
        this.referenceSeqString,
        this.windowEnd,
        this.genomeBuild,
        this.strand,
        this.chromosome,
        this.windowStart);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_ReferenceSeq#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_ReferenceSeq withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMolecularSequence_ReferenceSeq(
        this.referenceSeqId,
        this.referenceSeqPointer,
        this.orientation,
        newValue,
        this.modifierExtension,
        this.extension,
        this.referenceSeqString,
        this.windowEnd,
        this.genomeBuild,
        this.strand,
        this.chromosome,
        this.windowStart);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_ReferenceSeq#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_ReferenceSeq withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMolecularSequence_ReferenceSeq(
        this.referenceSeqId,
        this.referenceSeqPointer,
        this.orientation,
        value,
        this.modifierExtension,
        this.extension,
        this.referenceSeqString,
        this.windowEnd,
        this.genomeBuild,
        this.strand,
        this.chromosome,
        this.windowStart);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_ReferenceSeq#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_ReferenceSeq withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMolecularSequence_ReferenceSeq(
        this.referenceSeqId,
        this.referenceSeqPointer,
        this.orientation,
        this.id,
        newValue,
        this.extension,
        this.referenceSeqString,
        this.windowEnd,
        this.genomeBuild,
        this.strand,
        this.chromosome,
        this.windowStart);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_ReferenceSeq#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_ReferenceSeq withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMolecularSequence_ReferenceSeq(
        this.referenceSeqId,
        this.referenceSeqPointer,
        this.orientation,
        this.id,
        value,
        this.extension,
        this.referenceSeqString,
        this.windowEnd,
        this.genomeBuild,
        this.strand,
        this.chromosome,
        this.windowStart);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_ReferenceSeq#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_ReferenceSeq withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMolecularSequence_ReferenceSeq(
        this.referenceSeqId,
        this.referenceSeqPointer,
        this.orientation,
        this.id,
        this.modifierExtension,
        newValue,
        this.referenceSeqString,
        this.windowEnd,
        this.genomeBuild,
        this.strand,
        this.chromosome,
        this.windowStart);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_ReferenceSeq#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_ReferenceSeq withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMolecularSequence_ReferenceSeq(
        this.referenceSeqId,
        this.referenceSeqPointer,
        this.orientation,
        this.id,
        this.modifierExtension,
        value,
        this.referenceSeqString,
        this.windowEnd,
        this.genomeBuild,
        this.strand,
        this.chromosome,
        this.windowStart);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_ReferenceSeq#referenceSeqString() referenceSeqString} attribute.
   * @param value The value for referenceSeqString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_ReferenceSeq withReferenceSeqString(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "referenceSeqString");
    if (Objects.equals(this.referenceSeqString, newValue)) return this;
    return new ImmutableMolecularSequence_ReferenceSeq(
        this.referenceSeqId,
        this.referenceSeqPointer,
        this.orientation,
        this.id,
        this.modifierExtension,
        this.extension,
        newValue,
        this.windowEnd,
        this.genomeBuild,
        this.strand,
        this.chromosome,
        this.windowStart);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_ReferenceSeq#referenceSeqString() referenceSeqString} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for referenceSeqString
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_ReferenceSeq withReferenceSeqString(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.referenceSeqString, value)) return this;
    return new ImmutableMolecularSequence_ReferenceSeq(
        this.referenceSeqId,
        this.referenceSeqPointer,
        this.orientation,
        this.id,
        this.modifierExtension,
        this.extension,
        value,
        this.windowEnd,
        this.genomeBuild,
        this.strand,
        this.chromosome,
        this.windowStart);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_ReferenceSeq#windowEnd() windowEnd} attribute.
   * @param value The value for windowEnd
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_ReferenceSeq withWindowEnd(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.windowEnd, newValue)) return this;
    return new ImmutableMolecularSequence_ReferenceSeq(
        this.referenceSeqId,
        this.referenceSeqPointer,
        this.orientation,
        this.id,
        this.modifierExtension,
        this.extension,
        this.referenceSeqString,
        newValue,
        this.genomeBuild,
        this.strand,
        this.chromosome,
        this.windowStart);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_ReferenceSeq#windowEnd() windowEnd} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for windowEnd
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_ReferenceSeq withWindowEnd(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.windowEnd, value)) return this;
    return new ImmutableMolecularSequence_ReferenceSeq(
        this.referenceSeqId,
        this.referenceSeqPointer,
        this.orientation,
        this.id,
        this.modifierExtension,
        this.extension,
        this.referenceSeqString,
        value,
        this.genomeBuild,
        this.strand,
        this.chromosome,
        this.windowStart);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_ReferenceSeq#genomeBuild() genomeBuild} attribute.
   * @param value The value for genomeBuild
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_ReferenceSeq withGenomeBuild(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "genomeBuild");
    if (Objects.equals(this.genomeBuild, newValue)) return this;
    return new ImmutableMolecularSequence_ReferenceSeq(
        this.referenceSeqId,
        this.referenceSeqPointer,
        this.orientation,
        this.id,
        this.modifierExtension,
        this.extension,
        this.referenceSeqString,
        this.windowEnd,
        newValue,
        this.strand,
        this.chromosome,
        this.windowStart);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_ReferenceSeq#genomeBuild() genomeBuild} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for genomeBuild
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_ReferenceSeq withGenomeBuild(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.genomeBuild, value)) return this;
    return new ImmutableMolecularSequence_ReferenceSeq(
        this.referenceSeqId,
        this.referenceSeqPointer,
        this.orientation,
        this.id,
        this.modifierExtension,
        this.extension,
        this.referenceSeqString,
        this.windowEnd,
        value,
        this.strand,
        this.chromosome,
        this.windowStart);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_ReferenceSeq#strand() strand} attribute.
   * @param value The value for strand
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_ReferenceSeq withStrand(Molecularsequence_referenceseqStrand value) {
    @Nullable Molecularsequence_referenceseqStrand newValue = Objects.requireNonNull(value, "strand");
    if (this.strand == newValue) return this;
    return new ImmutableMolecularSequence_ReferenceSeq(
        this.referenceSeqId,
        this.referenceSeqPointer,
        this.orientation,
        this.id,
        this.modifierExtension,
        this.extension,
        this.referenceSeqString,
        this.windowEnd,
        this.genomeBuild,
        newValue,
        this.chromosome,
        this.windowStart);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_ReferenceSeq#strand() strand} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for strand
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_ReferenceSeq withStrand(Optional<? extends Molecularsequence_referenceseqStrand> optional) {
    @Nullable Molecularsequence_referenceseqStrand value = optional.orElse(null);
    if (this.strand == value) return this;
    return new ImmutableMolecularSequence_ReferenceSeq(
        this.referenceSeqId,
        this.referenceSeqPointer,
        this.orientation,
        this.id,
        this.modifierExtension,
        this.extension,
        this.referenceSeqString,
        this.windowEnd,
        this.genomeBuild,
        value,
        this.chromosome,
        this.windowStart);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_ReferenceSeq#chromosome() chromosome} attribute.
   * @param value The value for chromosome
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_ReferenceSeq withChromosome(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "chromosome");
    if (this.chromosome == newValue) return this;
    return new ImmutableMolecularSequence_ReferenceSeq(
        this.referenceSeqId,
        this.referenceSeqPointer,
        this.orientation,
        this.id,
        this.modifierExtension,
        this.extension,
        this.referenceSeqString,
        this.windowEnd,
        this.genomeBuild,
        this.strand,
        newValue,
        this.windowStart);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_ReferenceSeq#chromosome() chromosome} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for chromosome
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_ReferenceSeq withChromosome(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.chromosome == value) return this;
    return new ImmutableMolecularSequence_ReferenceSeq(
        this.referenceSeqId,
        this.referenceSeqPointer,
        this.orientation,
        this.id,
        this.modifierExtension,
        this.extension,
        this.referenceSeqString,
        this.windowEnd,
        this.genomeBuild,
        this.strand,
        value,
        this.windowStart);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_ReferenceSeq#windowStart() windowStart} attribute.
   * @param value The value for windowStart
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_ReferenceSeq withWindowStart(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.windowStart, newValue)) return this;
    return new ImmutableMolecularSequence_ReferenceSeq(
        this.referenceSeqId,
        this.referenceSeqPointer,
        this.orientation,
        this.id,
        this.modifierExtension,
        this.extension,
        this.referenceSeqString,
        this.windowEnd,
        this.genomeBuild,
        this.strand,
        this.chromosome,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_ReferenceSeq#windowStart() windowStart} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for windowStart
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_ReferenceSeq withWindowStart(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.windowStart, value)) return this;
    return new ImmutableMolecularSequence_ReferenceSeq(
        this.referenceSeqId,
        this.referenceSeqPointer,
        this.orientation,
        this.id,
        this.modifierExtension,
        this.extension,
        this.referenceSeqString,
        this.windowEnd,
        this.genomeBuild,
        this.strand,
        this.chromosome,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMolecularSequence_ReferenceSeq} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMolecularSequence_ReferenceSeq
        && equalTo((ImmutableMolecularSequence_ReferenceSeq) another);
  }

  private boolean equalTo(ImmutableMolecularSequence_ReferenceSeq another) {
    return Objects.equals(referenceSeqId, another.referenceSeqId)
        && Objects.equals(referenceSeqPointer, another.referenceSeqPointer)
        && Objects.equals(orientation, another.orientation)
        && Objects.equals(id, another.id)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && Objects.equals(referenceSeqString, another.referenceSeqString)
        && Objects.equals(windowEnd, another.windowEnd)
        && Objects.equals(genomeBuild, another.genomeBuild)
        && Objects.equals(strand, another.strand)
        && Objects.equals(chromosome, another.chromosome)
        && Objects.equals(windowStart, another.windowStart);
  }

  /**
   * Computes a hash code from attributes: {@code referenceSeqId}, {@code referenceSeqPointer}, {@code orientation}, {@code id}, {@code modifierExtension}, {@code extension}, {@code referenceSeqString}, {@code windowEnd}, {@code genomeBuild}, {@code strand}, {@code chromosome}, {@code windowStart}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(referenceSeqId);
    h += (h << 5) + Objects.hashCode(referenceSeqPointer);
    h += (h << 5) + Objects.hashCode(orientation);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(referenceSeqString);
    h += (h << 5) + Objects.hashCode(windowEnd);
    h += (h << 5) + Objects.hashCode(genomeBuild);
    h += (h << 5) + Objects.hashCode(strand);
    h += (h << 5) + Objects.hashCode(chromosome);
    h += (h << 5) + Objects.hashCode(windowStart);
    return h;
  }

  /**
   * Prints the immutable value {@code MolecularSequence_ReferenceSeq} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MolecularSequence_ReferenceSeq{");
    if (referenceSeqId != null) {
      builder.append("referenceSeqId=").append(referenceSeqId);
    }
    if (referenceSeqPointer != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("referenceSeqPointer=").append(referenceSeqPointer);
    }
    if (orientation != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("orientation=").append(orientation);
    }
    if (id != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (modifierExtension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (referenceSeqString != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("referenceSeqString=").append(referenceSeqString);
    }
    if (windowEnd != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("windowEnd=").append(windowEnd);
    }
    if (genomeBuild != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("genomeBuild=").append(genomeBuild);
    }
    if (strand != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("strand=").append(strand);
    }
    if (chromosome != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("chromosome=").append(chromosome);
    }
    if (windowStart != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("windowStart=").append(windowStart);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MolecularSequence_ReferenceSeq", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MolecularSequence_ReferenceSeq {
    @Nullable Optional<CodeableConcept> referenceSeqId = Optional.empty();
    boolean referenceSeqIdIsSet;
    @Nullable Optional<Reference> referenceSeqPointer = Optional.empty();
    boolean referenceSeqPointerIsSet;
    @Nullable Optional<Molecularsequence_referenceseqOrientation> orientation = Optional.empty();
    boolean orientationIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> referenceSeqString = Optional.empty();
    boolean referenceSeqStringIsSet;
    @Nullable Optional<Integer> windowEnd = Optional.empty();
    boolean windowEndIsSet;
    @Nullable Optional<String> genomeBuild = Optional.empty();
    boolean genomeBuildIsSet;
    @Nullable Optional<Molecularsequence_referenceseqStrand> strand = Optional.empty();
    boolean strandIsSet;
    @Nullable Optional<CodeableConcept> chromosome = Optional.empty();
    boolean chromosomeIsSet;
    @Nullable Optional<Integer> windowStart = Optional.empty();
    boolean windowStartIsSet;
    @JsonProperty("referenceSeqId")
    public void setReferenceSeqId(Optional<CodeableConcept> referenceSeqId) {
      this.referenceSeqId = referenceSeqId;
      this.referenceSeqIdIsSet = true;
    }
    @JsonProperty("referenceSeqPointer")
    public void setReferenceSeqPointer(Optional<Reference> referenceSeqPointer) {
      this.referenceSeqPointer = referenceSeqPointer;
      this.referenceSeqPointerIsSet = true;
    }
    @JsonProperty("orientation")
    public void setOrientation(Optional<Molecularsequence_referenceseqOrientation> orientation) {
      this.orientation = orientation;
      this.orientationIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("referenceSeqString")
    public void setReferenceSeqString(Optional<String> referenceSeqString) {
      this.referenceSeqString = referenceSeqString;
      this.referenceSeqStringIsSet = true;
    }
    @JsonProperty("windowEnd")
    public void setWindowEnd(Optional<Integer> windowEnd) {
      this.windowEnd = windowEnd;
      this.windowEndIsSet = true;
    }
    @JsonProperty("genomeBuild")
    public void setGenomeBuild(Optional<String> genomeBuild) {
      this.genomeBuild = genomeBuild;
      this.genomeBuildIsSet = true;
    }
    @JsonProperty("strand")
    public void setStrand(Optional<Molecularsequence_referenceseqStrand> strand) {
      this.strand = strand;
      this.strandIsSet = true;
    }
    @JsonProperty("chromosome")
    public void setChromosome(Optional<CodeableConcept> chromosome) {
      this.chromosome = chromosome;
      this.chromosomeIsSet = true;
    }
    @JsonProperty("windowStart")
    public void setWindowStart(Optional<Integer> windowStart) {
      this.windowStart = windowStart;
      this.windowStartIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> referenceSeqId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> referenceSeqPointer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Molecularsequence_referenceseqOrientation> orientation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> referenceSeqString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> windowEnd() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> genomeBuild() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Molecularsequence_referenceseqStrand> strand() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> chromosome() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> windowStart() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMolecularSequence_ReferenceSeq fromJson(Json json) {
    ImmutableMolecularSequence_ReferenceSeq.Builder builder = ImmutableMolecularSequence_ReferenceSeq.builder();
    if (json.referenceSeqIdIsSet) {
      builder.referenceSeqId(json.referenceSeqId);
    }
    if (json.referenceSeqPointerIsSet) {
      builder.referenceSeqPointer(json.referenceSeqPointer);
    }
    if (json.orientationIsSet) {
      builder.orientation(json.orientation);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.referenceSeqStringIsSet) {
      builder.referenceSeqString(json.referenceSeqString);
    }
    if (json.windowEndIsSet) {
      builder.windowEnd(json.windowEnd);
    }
    if (json.genomeBuildIsSet) {
      builder.genomeBuild(json.genomeBuild);
    }
    if (json.strandIsSet) {
      builder.strand(json.strand);
    }
    if (json.chromosomeIsSet) {
      builder.chromosome(json.chromosome);
    }
    if (json.windowStartIsSet) {
      builder.windowStart(json.windowStart);
    }
    return (ImmutableMolecularSequence_ReferenceSeq) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MolecularSequence_ReferenceSeq} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MolecularSequence_ReferenceSeq instance
   */
  public static MolecularSequence_ReferenceSeq copyOf(MolecularSequence_ReferenceSeq instance) {
    if (instance instanceof ImmutableMolecularSequence_ReferenceSeq) {
      return (ImmutableMolecularSequence_ReferenceSeq) instance;
    }
    return ImmutableMolecularSequence_ReferenceSeq.builder()
        .referenceSeqId(instance.referenceSeqId())
        .referenceSeqPointer(instance.referenceSeqPointer())
        .orientation(instance.orientation())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .referenceSeqString(instance.referenceSeqString())
        .windowEnd(instance.windowEnd())
        .genomeBuild(instance.genomeBuild())
        .strand(instance.strand())
        .chromosome(instance.chromosome())
        .windowStart(instance.windowStart())
        .build();
  }

  /**
   * Creates a builder for {@link MolecularSequence_ReferenceSeq MolecularSequence_ReferenceSeq}.
   * <pre>
   * ImmutableMolecularSequence_ReferenceSeq.builder()
   *    .referenceSeqId(com.medplum.types.fhir.CodeableConcept) // optional {@link MolecularSequence_ReferenceSeq#referenceSeqId() referenceSeqId}
   *    .referenceSeqPointer(com.medplum.types.fhir.Reference) // optional {@link MolecularSequence_ReferenceSeq#referenceSeqPointer() referenceSeqPointer}
   *    .orientation(com.medplum.types.fhir.Molecularsequence_referenceseqOrientation) // optional {@link MolecularSequence_ReferenceSeq#orientation() orientation}
   *    .id(String) // optional {@link MolecularSequence_ReferenceSeq#id() id}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MolecularSequence_ReferenceSeq#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MolecularSequence_ReferenceSeq#extension() extension}
   *    .referenceSeqString(String) // optional {@link MolecularSequence_ReferenceSeq#referenceSeqString() referenceSeqString}
   *    .windowEnd(Integer) // optional {@link MolecularSequence_ReferenceSeq#windowEnd() windowEnd}
   *    .genomeBuild(String) // optional {@link MolecularSequence_ReferenceSeq#genomeBuild() genomeBuild}
   *    .strand(com.medplum.types.fhir.Molecularsequence_referenceseqStrand) // optional {@link MolecularSequence_ReferenceSeq#strand() strand}
   *    .chromosome(com.medplum.types.fhir.CodeableConcept) // optional {@link MolecularSequence_ReferenceSeq#chromosome() chromosome}
   *    .windowStart(Integer) // optional {@link MolecularSequence_ReferenceSeq#windowStart() windowStart}
   *    .build();
   * </pre>
   * @return A new MolecularSequence_ReferenceSeq builder
   */
  public static ImmutableMolecularSequence_ReferenceSeq.Builder builder() {
    return new ImmutableMolecularSequence_ReferenceSeq.Builder();
  }

  /**
   * Builds instances of type {@link MolecularSequence_ReferenceSeq MolecularSequence_ReferenceSeq}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MolecularSequence_ReferenceSeq", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_REFERENCE_SEQ_ID = 0x1L;
    private static final long OPT_BIT_REFERENCE_SEQ_POINTER = 0x2L;
    private static final long OPT_BIT_ORIENTATION = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_REFERENCE_SEQ_STRING = 0x40L;
    private static final long OPT_BIT_WINDOW_END = 0x80L;
    private static final long OPT_BIT_GENOME_BUILD = 0x100L;
    private static final long OPT_BIT_STRAND = 0x200L;
    private static final long OPT_BIT_CHROMOSOME = 0x400L;
    private static final long OPT_BIT_WINDOW_START = 0x800L;
    private long optBits;

    private @Nullable CodeableConcept referenceSeqId;
    private @Nullable Reference referenceSeqPointer;
    private @Nullable Molecularsequence_referenceseqOrientation orientation;
    private @Nullable String id;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private @Nullable String referenceSeqString;
    private @Nullable Integer windowEnd;
    private @Nullable String genomeBuild;
    private @Nullable Molecularsequence_referenceseqStrand strand;
    private @Nullable CodeableConcept chromosome;
    private @Nullable Integer windowStart;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MolecularSequence_ReferenceSeq#referenceSeqId() referenceSeqId} to referenceSeqId.
     * @param referenceSeqId The value for referenceSeqId
     * @return {@code this} builder for chained invocation
     */
    public final Builder referenceSeqId(CodeableConcept referenceSeqId) {
      checkNotIsSet(referenceSeqIdIsSet(), "referenceSeqId");
      this.referenceSeqId = Objects.requireNonNull(referenceSeqId, "referenceSeqId");
      optBits |= OPT_BIT_REFERENCE_SEQ_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_ReferenceSeq#referenceSeqId() referenceSeqId} to referenceSeqId.
     * @param referenceSeqId The value for referenceSeqId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("referenceSeqId")
    public final Builder referenceSeqId(Optional<? extends CodeableConcept> referenceSeqId) {
      checkNotIsSet(referenceSeqIdIsSet(), "referenceSeqId");
      this.referenceSeqId = referenceSeqId.orElse(null);
      optBits |= OPT_BIT_REFERENCE_SEQ_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_ReferenceSeq#referenceSeqPointer() referenceSeqPointer} to referenceSeqPointer.
     * @param referenceSeqPointer The value for referenceSeqPointer
     * @return {@code this} builder for chained invocation
     */
    public final Builder referenceSeqPointer(Reference referenceSeqPointer) {
      checkNotIsSet(referenceSeqPointerIsSet(), "referenceSeqPointer");
      this.referenceSeqPointer = Objects.requireNonNull(referenceSeqPointer, "referenceSeqPointer");
      optBits |= OPT_BIT_REFERENCE_SEQ_POINTER;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_ReferenceSeq#referenceSeqPointer() referenceSeqPointer} to referenceSeqPointer.
     * @param referenceSeqPointer The value for referenceSeqPointer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("referenceSeqPointer")
    public final Builder referenceSeqPointer(Optional<? extends Reference> referenceSeqPointer) {
      checkNotIsSet(referenceSeqPointerIsSet(), "referenceSeqPointer");
      this.referenceSeqPointer = referenceSeqPointer.orElse(null);
      optBits |= OPT_BIT_REFERENCE_SEQ_POINTER;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_ReferenceSeq#orientation() orientation} to orientation.
     * @param orientation The value for orientation
     * @return {@code this} builder for chained invocation
     */
    public final Builder orientation(Molecularsequence_referenceseqOrientation orientation) {
      checkNotIsSet(orientationIsSet(), "orientation");
      this.orientation = Objects.requireNonNull(orientation, "orientation");
      optBits |= OPT_BIT_ORIENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_ReferenceSeq#orientation() orientation} to orientation.
     * @param orientation The value for orientation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("orientation")
    public final Builder orientation(Optional<? extends Molecularsequence_referenceseqOrientation> orientation) {
      checkNotIsSet(orientationIsSet(), "orientation");
      this.orientation = orientation.orElse(null);
      optBits |= OPT_BIT_ORIENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_ReferenceSeq#id() id} to id.
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
     * Initializes the optional value {@link MolecularSequence_ReferenceSeq#id() id} to id.
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
     * Initializes the optional value {@link MolecularSequence_ReferenceSeq#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MolecularSequence_ReferenceSeq#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MolecularSequence_ReferenceSeq#extension() extension} to extension.
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
     * Initializes the optional value {@link MolecularSequence_ReferenceSeq#extension() extension} to extension.
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
     * Initializes the optional value {@link MolecularSequence_ReferenceSeq#referenceSeqString() referenceSeqString} to referenceSeqString.
     * @param referenceSeqString The value for referenceSeqString
     * @return {@code this} builder for chained invocation
     */
    public final Builder referenceSeqString(String referenceSeqString) {
      checkNotIsSet(referenceSeqStringIsSet(), "referenceSeqString");
      this.referenceSeqString = Objects.requireNonNull(referenceSeqString, "referenceSeqString");
      optBits |= OPT_BIT_REFERENCE_SEQ_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_ReferenceSeq#referenceSeqString() referenceSeqString} to referenceSeqString.
     * @param referenceSeqString The value for referenceSeqString
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("referenceSeqString")
    public final Builder referenceSeqString(Optional<String> referenceSeqString) {
      checkNotIsSet(referenceSeqStringIsSet(), "referenceSeqString");
      this.referenceSeqString = referenceSeqString.orElse(null);
      optBits |= OPT_BIT_REFERENCE_SEQ_STRING;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_ReferenceSeq#windowEnd() windowEnd} to windowEnd.
     * @param windowEnd The value for windowEnd
     * @return {@code this} builder for chained invocation
     */
    public final Builder windowEnd(int windowEnd) {
      checkNotIsSet(windowEndIsSet(), "windowEnd");
      this.windowEnd = windowEnd;
      optBits |= OPT_BIT_WINDOW_END;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_ReferenceSeq#windowEnd() windowEnd} to windowEnd.
     * @param windowEnd The value for windowEnd
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("windowEnd")
    public final Builder windowEnd(Optional<Integer> windowEnd) {
      checkNotIsSet(windowEndIsSet(), "windowEnd");
      this.windowEnd = windowEnd.orElse(null);
      optBits |= OPT_BIT_WINDOW_END;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_ReferenceSeq#genomeBuild() genomeBuild} to genomeBuild.
     * @param genomeBuild The value for genomeBuild
     * @return {@code this} builder for chained invocation
     */
    public final Builder genomeBuild(String genomeBuild) {
      checkNotIsSet(genomeBuildIsSet(), "genomeBuild");
      this.genomeBuild = Objects.requireNonNull(genomeBuild, "genomeBuild");
      optBits |= OPT_BIT_GENOME_BUILD;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_ReferenceSeq#genomeBuild() genomeBuild} to genomeBuild.
     * @param genomeBuild The value for genomeBuild
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("genomeBuild")
    public final Builder genomeBuild(Optional<String> genomeBuild) {
      checkNotIsSet(genomeBuildIsSet(), "genomeBuild");
      this.genomeBuild = genomeBuild.orElse(null);
      optBits |= OPT_BIT_GENOME_BUILD;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_ReferenceSeq#strand() strand} to strand.
     * @param strand The value for strand
     * @return {@code this} builder for chained invocation
     */
    public final Builder strand(Molecularsequence_referenceseqStrand strand) {
      checkNotIsSet(strandIsSet(), "strand");
      this.strand = Objects.requireNonNull(strand, "strand");
      optBits |= OPT_BIT_STRAND;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_ReferenceSeq#strand() strand} to strand.
     * @param strand The value for strand
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("strand")
    public final Builder strand(Optional<? extends Molecularsequence_referenceseqStrand> strand) {
      checkNotIsSet(strandIsSet(), "strand");
      this.strand = strand.orElse(null);
      optBits |= OPT_BIT_STRAND;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_ReferenceSeq#chromosome() chromosome} to chromosome.
     * @param chromosome The value for chromosome
     * @return {@code this} builder for chained invocation
     */
    public final Builder chromosome(CodeableConcept chromosome) {
      checkNotIsSet(chromosomeIsSet(), "chromosome");
      this.chromosome = Objects.requireNonNull(chromosome, "chromosome");
      optBits |= OPT_BIT_CHROMOSOME;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_ReferenceSeq#chromosome() chromosome} to chromosome.
     * @param chromosome The value for chromosome
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("chromosome")
    public final Builder chromosome(Optional<? extends CodeableConcept> chromosome) {
      checkNotIsSet(chromosomeIsSet(), "chromosome");
      this.chromosome = chromosome.orElse(null);
      optBits |= OPT_BIT_CHROMOSOME;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_ReferenceSeq#windowStart() windowStart} to windowStart.
     * @param windowStart The value for windowStart
     * @return {@code this} builder for chained invocation
     */
    public final Builder windowStart(int windowStart) {
      checkNotIsSet(windowStartIsSet(), "windowStart");
      this.windowStart = windowStart;
      optBits |= OPT_BIT_WINDOW_START;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_ReferenceSeq#windowStart() windowStart} to windowStart.
     * @param windowStart The value for windowStart
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("windowStart")
    public final Builder windowStart(Optional<Integer> windowStart) {
      checkNotIsSet(windowStartIsSet(), "windowStart");
      this.windowStart = windowStart.orElse(null);
      optBits |= OPT_BIT_WINDOW_START;
      return this;
    }

    /**
     * Builds a new {@link MolecularSequence_ReferenceSeq MolecularSequence_ReferenceSeq}.
     * @return An immutable instance of MolecularSequence_ReferenceSeq
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MolecularSequence_ReferenceSeq build() {
      return new ImmutableMolecularSequence_ReferenceSeq(
          referenceSeqId,
          referenceSeqPointer,
          orientation,
          id,
          modifierExtension,
          extension,
          referenceSeqString,
          windowEnd,
          genomeBuild,
          strand,
          chromosome,
          windowStart);
    }

    private boolean referenceSeqIdIsSet() {
      return (optBits & OPT_BIT_REFERENCE_SEQ_ID) != 0;
    }

    private boolean referenceSeqPointerIsSet() {
      return (optBits & OPT_BIT_REFERENCE_SEQ_POINTER) != 0;
    }

    private boolean orientationIsSet() {
      return (optBits & OPT_BIT_ORIENTATION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean referenceSeqStringIsSet() {
      return (optBits & OPT_BIT_REFERENCE_SEQ_STRING) != 0;
    }

    private boolean windowEndIsSet() {
      return (optBits & OPT_BIT_WINDOW_END) != 0;
    }

    private boolean genomeBuildIsSet() {
      return (optBits & OPT_BIT_GENOME_BUILD) != 0;
    }

    private boolean strandIsSet() {
      return (optBits & OPT_BIT_STRAND) != 0;
    }

    private boolean chromosomeIsSet() {
      return (optBits & OPT_BIT_CHROMOSOME) != 0;
    }

    private boolean windowStartIsSet() {
      return (optBits & OPT_BIT_WINDOW_START) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MolecularSequence_ReferenceSeq is strict, attribute is already set: ".concat(name));
    }
  }
}

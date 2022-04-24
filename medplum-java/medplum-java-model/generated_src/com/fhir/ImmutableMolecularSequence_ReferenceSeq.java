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
final class ImmutableMolecularSequence_ReferenceSeq implements MolecularSequence_ReferenceSeq {
  private final @Nullable Molecularsequence_referenceseqStrand strand;
  private final @Nullable Integer windowStart;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept chromosome;
  private final @Nullable Integer windowEnd;
  private final @Nullable Reference referenceSeqPointer;
  private final @Nullable String id;
  private final @Nullable String genomeBuild;
  private final @Nullable Molecularsequence_referenceseqOrientation orientation;
  private final @Nullable String referenceSeqString;
  private final @Nullable List<Extension> extension;
  private final @Nullable CodeableConcept referenceSeqId;

  private ImmutableMolecularSequence_ReferenceSeq(
      @Nullable Molecularsequence_referenceseqStrand strand,
      @Nullable Integer windowStart,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept chromosome,
      @Nullable Integer windowEnd,
      @Nullable Reference referenceSeqPointer,
      @Nullable String id,
      @Nullable String genomeBuild,
      @Nullable Molecularsequence_referenceseqOrientation orientation,
      @Nullable String referenceSeqString,
      @Nullable List<Extension> extension,
      @Nullable CodeableConcept referenceSeqId) {
    this.strand = strand;
    this.windowStart = windowStart;
    this.modifierExtension = modifierExtension;
    this.chromosome = chromosome;
    this.windowEnd = windowEnd;
    this.referenceSeqPointer = referenceSeqPointer;
    this.id = id;
    this.genomeBuild = genomeBuild;
    this.orientation = orientation;
    this.referenceSeqString = referenceSeqString;
    this.extension = extension;
    this.referenceSeqId = referenceSeqId;
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
   * @return The value of the {@code windowStart} attribute
   */
  @JsonProperty("windowStart")
  @Override
  public Optional<Integer> windowStart() {
    return Optional.ofNullable(windowStart);
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
   * @return The value of the {@code chromosome} attribute
   */
  @JsonProperty("chromosome")
  @Override
  public Optional<CodeableConcept> chromosome() {
    return Optional.ofNullable(chromosome);
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
   * @return The value of the {@code referenceSeqPointer} attribute
   */
  @JsonProperty("referenceSeqPointer")
  @Override
  public Optional<Reference> referenceSeqPointer() {
    return Optional.ofNullable(referenceSeqPointer);
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
   * @return The value of the {@code genomeBuild} attribute
   */
  @JsonProperty("genomeBuild")
  @Override
  public Optional<String> genomeBuild() {
    return Optional.ofNullable(genomeBuild);
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
   * @return The value of the {@code referenceSeqString} attribute
   */
  @JsonProperty("referenceSeqString")
  @Override
  public Optional<String> referenceSeqString() {
    return Optional.ofNullable(referenceSeqString);
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
   * @return The value of the {@code referenceSeqId} attribute
   */
  @JsonProperty("referenceSeqId")
  @Override
  public Optional<CodeableConcept> referenceSeqId() {
    return Optional.ofNullable(referenceSeqId);
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
        newValue,
        this.windowStart,
        this.modifierExtension,
        this.chromosome,
        this.windowEnd,
        this.referenceSeqPointer,
        this.id,
        this.genomeBuild,
        this.orientation,
        this.referenceSeqString,
        this.extension,
        this.referenceSeqId);
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
        value,
        this.windowStart,
        this.modifierExtension,
        this.chromosome,
        this.windowEnd,
        this.referenceSeqPointer,
        this.id,
        this.genomeBuild,
        this.orientation,
        this.referenceSeqString,
        this.extension,
        this.referenceSeqId);
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
        this.strand,
        newValue,
        this.modifierExtension,
        this.chromosome,
        this.windowEnd,
        this.referenceSeqPointer,
        this.id,
        this.genomeBuild,
        this.orientation,
        this.referenceSeqString,
        this.extension,
        this.referenceSeqId);
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
        this.strand,
        value,
        this.modifierExtension,
        this.chromosome,
        this.windowEnd,
        this.referenceSeqPointer,
        this.id,
        this.genomeBuild,
        this.orientation,
        this.referenceSeqString,
        this.extension,
        this.referenceSeqId);
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
        this.strand,
        this.windowStart,
        newValue,
        this.chromosome,
        this.windowEnd,
        this.referenceSeqPointer,
        this.id,
        this.genomeBuild,
        this.orientation,
        this.referenceSeqString,
        this.extension,
        this.referenceSeqId);
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
        this.strand,
        this.windowStart,
        value,
        this.chromosome,
        this.windowEnd,
        this.referenceSeqPointer,
        this.id,
        this.genomeBuild,
        this.orientation,
        this.referenceSeqString,
        this.extension,
        this.referenceSeqId);
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
        this.strand,
        this.windowStart,
        this.modifierExtension,
        newValue,
        this.windowEnd,
        this.referenceSeqPointer,
        this.id,
        this.genomeBuild,
        this.orientation,
        this.referenceSeqString,
        this.extension,
        this.referenceSeqId);
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
        this.strand,
        this.windowStart,
        this.modifierExtension,
        value,
        this.windowEnd,
        this.referenceSeqPointer,
        this.id,
        this.genomeBuild,
        this.orientation,
        this.referenceSeqString,
        this.extension,
        this.referenceSeqId);
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
        this.strand,
        this.windowStart,
        this.modifierExtension,
        this.chromosome,
        newValue,
        this.referenceSeqPointer,
        this.id,
        this.genomeBuild,
        this.orientation,
        this.referenceSeqString,
        this.extension,
        this.referenceSeqId);
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
        this.strand,
        this.windowStart,
        this.modifierExtension,
        this.chromosome,
        value,
        this.referenceSeqPointer,
        this.id,
        this.genomeBuild,
        this.orientation,
        this.referenceSeqString,
        this.extension,
        this.referenceSeqId);
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
        this.strand,
        this.windowStart,
        this.modifierExtension,
        this.chromosome,
        this.windowEnd,
        newValue,
        this.id,
        this.genomeBuild,
        this.orientation,
        this.referenceSeqString,
        this.extension,
        this.referenceSeqId);
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
        this.strand,
        this.windowStart,
        this.modifierExtension,
        this.chromosome,
        this.windowEnd,
        value,
        this.id,
        this.genomeBuild,
        this.orientation,
        this.referenceSeqString,
        this.extension,
        this.referenceSeqId);
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
        this.strand,
        this.windowStart,
        this.modifierExtension,
        this.chromosome,
        this.windowEnd,
        this.referenceSeqPointer,
        newValue,
        this.genomeBuild,
        this.orientation,
        this.referenceSeqString,
        this.extension,
        this.referenceSeqId);
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
        this.strand,
        this.windowStart,
        this.modifierExtension,
        this.chromosome,
        this.windowEnd,
        this.referenceSeqPointer,
        value,
        this.genomeBuild,
        this.orientation,
        this.referenceSeqString,
        this.extension,
        this.referenceSeqId);
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
        this.strand,
        this.windowStart,
        this.modifierExtension,
        this.chromosome,
        this.windowEnd,
        this.referenceSeqPointer,
        this.id,
        newValue,
        this.orientation,
        this.referenceSeqString,
        this.extension,
        this.referenceSeqId);
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
        this.strand,
        this.windowStart,
        this.modifierExtension,
        this.chromosome,
        this.windowEnd,
        this.referenceSeqPointer,
        this.id,
        value,
        this.orientation,
        this.referenceSeqString,
        this.extension,
        this.referenceSeqId);
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
        this.strand,
        this.windowStart,
        this.modifierExtension,
        this.chromosome,
        this.windowEnd,
        this.referenceSeqPointer,
        this.id,
        this.genomeBuild,
        newValue,
        this.referenceSeqString,
        this.extension,
        this.referenceSeqId);
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
        this.strand,
        this.windowStart,
        this.modifierExtension,
        this.chromosome,
        this.windowEnd,
        this.referenceSeqPointer,
        this.id,
        this.genomeBuild,
        value,
        this.referenceSeqString,
        this.extension,
        this.referenceSeqId);
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
        this.strand,
        this.windowStart,
        this.modifierExtension,
        this.chromosome,
        this.windowEnd,
        this.referenceSeqPointer,
        this.id,
        this.genomeBuild,
        this.orientation,
        newValue,
        this.extension,
        this.referenceSeqId);
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
        this.strand,
        this.windowStart,
        this.modifierExtension,
        this.chromosome,
        this.windowEnd,
        this.referenceSeqPointer,
        this.id,
        this.genomeBuild,
        this.orientation,
        value,
        this.extension,
        this.referenceSeqId);
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
        this.strand,
        this.windowStart,
        this.modifierExtension,
        this.chromosome,
        this.windowEnd,
        this.referenceSeqPointer,
        this.id,
        this.genomeBuild,
        this.orientation,
        this.referenceSeqString,
        newValue,
        this.referenceSeqId);
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
        this.strand,
        this.windowStart,
        this.modifierExtension,
        this.chromosome,
        this.windowEnd,
        this.referenceSeqPointer,
        this.id,
        this.genomeBuild,
        this.orientation,
        this.referenceSeqString,
        value,
        this.referenceSeqId);
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
        this.strand,
        this.windowStart,
        this.modifierExtension,
        this.chromosome,
        this.windowEnd,
        this.referenceSeqPointer,
        this.id,
        this.genomeBuild,
        this.orientation,
        this.referenceSeqString,
        this.extension,
        newValue);
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
        this.strand,
        this.windowStart,
        this.modifierExtension,
        this.chromosome,
        this.windowEnd,
        this.referenceSeqPointer,
        this.id,
        this.genomeBuild,
        this.orientation,
        this.referenceSeqString,
        this.extension,
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
    return Objects.equals(strand, another.strand)
        && Objects.equals(windowStart, another.windowStart)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(chromosome, another.chromosome)
        && Objects.equals(windowEnd, another.windowEnd)
        && Objects.equals(referenceSeqPointer, another.referenceSeqPointer)
        && Objects.equals(id, another.id)
        && Objects.equals(genomeBuild, another.genomeBuild)
        && Objects.equals(orientation, another.orientation)
        && Objects.equals(referenceSeqString, another.referenceSeqString)
        && Objects.equals(extension, another.extension)
        && Objects.equals(referenceSeqId, another.referenceSeqId);
  }

  /**
   * Computes a hash code from attributes: {@code strand}, {@code windowStart}, {@code modifierExtension}, {@code chromosome}, {@code windowEnd}, {@code referenceSeqPointer}, {@code id}, {@code genomeBuild}, {@code orientation}, {@code referenceSeqString}, {@code extension}, {@code referenceSeqId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(strand);
    h += (h << 5) + Objects.hashCode(windowStart);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(chromosome);
    h += (h << 5) + Objects.hashCode(windowEnd);
    h += (h << 5) + Objects.hashCode(referenceSeqPointer);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(genomeBuild);
    h += (h << 5) + Objects.hashCode(orientation);
    h += (h << 5) + Objects.hashCode(referenceSeqString);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(referenceSeqId);
    return h;
  }

  /**
   * Prints the immutable value {@code MolecularSequence_ReferenceSeq} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MolecularSequence_ReferenceSeq{");
    if (strand != null) {
      builder.append("strand=").append(strand);
    }
    if (windowStart != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("windowStart=").append(windowStart);
    }
    if (modifierExtension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (chromosome != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("chromosome=").append(chromosome);
    }
    if (windowEnd != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("windowEnd=").append(windowEnd);
    }
    if (referenceSeqPointer != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("referenceSeqPointer=").append(referenceSeqPointer);
    }
    if (id != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (genomeBuild != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("genomeBuild=").append(genomeBuild);
    }
    if (orientation != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("orientation=").append(orientation);
    }
    if (referenceSeqString != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("referenceSeqString=").append(referenceSeqString);
    }
    if (extension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (referenceSeqId != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("referenceSeqId=").append(referenceSeqId);
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
    @Nullable Optional<Molecularsequence_referenceseqStrand> strand = Optional.empty();
    boolean strandIsSet;
    @Nullable Optional<Integer> windowStart = Optional.empty();
    boolean windowStartIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> chromosome = Optional.empty();
    boolean chromosomeIsSet;
    @Nullable Optional<Integer> windowEnd = Optional.empty();
    boolean windowEndIsSet;
    @Nullable Optional<Reference> referenceSeqPointer = Optional.empty();
    boolean referenceSeqPointerIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> genomeBuild = Optional.empty();
    boolean genomeBuildIsSet;
    @Nullable Optional<Molecularsequence_referenceseqOrientation> orientation = Optional.empty();
    boolean orientationIsSet;
    @Nullable Optional<String> referenceSeqString = Optional.empty();
    boolean referenceSeqStringIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CodeableConcept> referenceSeqId = Optional.empty();
    boolean referenceSeqIdIsSet;
    @JsonProperty("strand")
    public void setStrand(Optional<Molecularsequence_referenceseqStrand> strand) {
      this.strand = strand;
      this.strandIsSet = true;
    }
    @JsonProperty("windowStart")
    public void setWindowStart(Optional<Integer> windowStart) {
      this.windowStart = windowStart;
      this.windowStartIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("chromosome")
    public void setChromosome(Optional<CodeableConcept> chromosome) {
      this.chromosome = chromosome;
      this.chromosomeIsSet = true;
    }
    @JsonProperty("windowEnd")
    public void setWindowEnd(Optional<Integer> windowEnd) {
      this.windowEnd = windowEnd;
      this.windowEndIsSet = true;
    }
    @JsonProperty("referenceSeqPointer")
    public void setReferenceSeqPointer(Optional<Reference> referenceSeqPointer) {
      this.referenceSeqPointer = referenceSeqPointer;
      this.referenceSeqPointerIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("genomeBuild")
    public void setGenomeBuild(Optional<String> genomeBuild) {
      this.genomeBuild = genomeBuild;
      this.genomeBuildIsSet = true;
    }
    @JsonProperty("orientation")
    public void setOrientation(Optional<Molecularsequence_referenceseqOrientation> orientation) {
      this.orientation = orientation;
      this.orientationIsSet = true;
    }
    @JsonProperty("referenceSeqString")
    public void setReferenceSeqString(Optional<String> referenceSeqString) {
      this.referenceSeqString = referenceSeqString;
      this.referenceSeqStringIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("referenceSeqId")
    public void setReferenceSeqId(Optional<CodeableConcept> referenceSeqId) {
      this.referenceSeqId = referenceSeqId;
      this.referenceSeqIdIsSet = true;
    }
    @Override
    public Optional<Molecularsequence_referenceseqStrand> strand() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> windowStart() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> chromosome() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> windowEnd() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> referenceSeqPointer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> genomeBuild() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Molecularsequence_referenceseqOrientation> orientation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> referenceSeqString() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> referenceSeqId() { throw new UnsupportedOperationException(); }
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
    if (json.strandIsSet) {
      builder.strand(json.strand);
    }
    if (json.windowStartIsSet) {
      builder.windowStart(json.windowStart);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.chromosomeIsSet) {
      builder.chromosome(json.chromosome);
    }
    if (json.windowEndIsSet) {
      builder.windowEnd(json.windowEnd);
    }
    if (json.referenceSeqPointerIsSet) {
      builder.referenceSeqPointer(json.referenceSeqPointer);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.genomeBuildIsSet) {
      builder.genomeBuild(json.genomeBuild);
    }
    if (json.orientationIsSet) {
      builder.orientation(json.orientation);
    }
    if (json.referenceSeqStringIsSet) {
      builder.referenceSeqString(json.referenceSeqString);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.referenceSeqIdIsSet) {
      builder.referenceSeqId(json.referenceSeqId);
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
        .strand(instance.strand())
        .windowStart(instance.windowStart())
        .modifierExtension(instance.modifierExtension())
        .chromosome(instance.chromosome())
        .windowEnd(instance.windowEnd())
        .referenceSeqPointer(instance.referenceSeqPointer())
        .id(instance.id())
        .genomeBuild(instance.genomeBuild())
        .orientation(instance.orientation())
        .referenceSeqString(instance.referenceSeqString())
        .extension(instance.extension())
        .referenceSeqId(instance.referenceSeqId())
        .build();
  }

  /**
   * Creates a builder for {@link MolecularSequence_ReferenceSeq MolecularSequence_ReferenceSeq}.
   * <pre>
   * ImmutableMolecularSequence_ReferenceSeq.builder()
   *    .strand(com.fhir.Molecularsequence_referenceseqStrand) // optional {@link MolecularSequence_ReferenceSeq#strand() strand}
   *    .windowStart(Integer) // optional {@link MolecularSequence_ReferenceSeq#windowStart() windowStart}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MolecularSequence_ReferenceSeq#modifierExtension() modifierExtension}
   *    .chromosome(com.fhir.CodeableConcept) // optional {@link MolecularSequence_ReferenceSeq#chromosome() chromosome}
   *    .windowEnd(Integer) // optional {@link MolecularSequence_ReferenceSeq#windowEnd() windowEnd}
   *    .referenceSeqPointer(com.fhir.Reference) // optional {@link MolecularSequence_ReferenceSeq#referenceSeqPointer() referenceSeqPointer}
   *    .id(String) // optional {@link MolecularSequence_ReferenceSeq#id() id}
   *    .genomeBuild(String) // optional {@link MolecularSequence_ReferenceSeq#genomeBuild() genomeBuild}
   *    .orientation(com.fhir.Molecularsequence_referenceseqOrientation) // optional {@link MolecularSequence_ReferenceSeq#orientation() orientation}
   *    .referenceSeqString(String) // optional {@link MolecularSequence_ReferenceSeq#referenceSeqString() referenceSeqString}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MolecularSequence_ReferenceSeq#extension() extension}
   *    .referenceSeqId(com.fhir.CodeableConcept) // optional {@link MolecularSequence_ReferenceSeq#referenceSeqId() referenceSeqId}
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
    private static final long OPT_BIT_STRAND = 0x1L;
    private static final long OPT_BIT_WINDOW_START = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_CHROMOSOME = 0x8L;
    private static final long OPT_BIT_WINDOW_END = 0x10L;
    private static final long OPT_BIT_REFERENCE_SEQ_POINTER = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_GENOME_BUILD = 0x80L;
    private static final long OPT_BIT_ORIENTATION = 0x100L;
    private static final long OPT_BIT_REFERENCE_SEQ_STRING = 0x200L;
    private static final long OPT_BIT_EXTENSION = 0x400L;
    private static final long OPT_BIT_REFERENCE_SEQ_ID = 0x800L;
    private long optBits;

    private @Nullable Molecularsequence_referenceseqStrand strand;
    private @Nullable Integer windowStart;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept chromosome;
    private @Nullable Integer windowEnd;
    private @Nullable Reference referenceSeqPointer;
    private @Nullable String id;
    private @Nullable String genomeBuild;
    private @Nullable Molecularsequence_referenceseqOrientation orientation;
    private @Nullable String referenceSeqString;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept referenceSeqId;

    private Builder() {
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
     * Builds a new {@link MolecularSequence_ReferenceSeq MolecularSequence_ReferenceSeq}.
     * @return An immutable instance of MolecularSequence_ReferenceSeq
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MolecularSequence_ReferenceSeq build() {
      return new ImmutableMolecularSequence_ReferenceSeq(
          strand,
          windowStart,
          modifierExtension,
          chromosome,
          windowEnd,
          referenceSeqPointer,
          id,
          genomeBuild,
          orientation,
          referenceSeqString,
          extension,
          referenceSeqId);
    }

    private boolean strandIsSet() {
      return (optBits & OPT_BIT_STRAND) != 0;
    }

    private boolean windowStartIsSet() {
      return (optBits & OPT_BIT_WINDOW_START) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean chromosomeIsSet() {
      return (optBits & OPT_BIT_CHROMOSOME) != 0;
    }

    private boolean windowEndIsSet() {
      return (optBits & OPT_BIT_WINDOW_END) != 0;
    }

    private boolean referenceSeqPointerIsSet() {
      return (optBits & OPT_BIT_REFERENCE_SEQ_POINTER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean genomeBuildIsSet() {
      return (optBits & OPT_BIT_GENOME_BUILD) != 0;
    }

    private boolean orientationIsSet() {
      return (optBits & OPT_BIT_ORIENTATION) != 0;
    }

    private boolean referenceSeqStringIsSet() {
      return (optBits & OPT_BIT_REFERENCE_SEQ_STRING) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean referenceSeqIdIsSet() {
      return (optBits & OPT_BIT_REFERENCE_SEQ_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MolecularSequence_ReferenceSeq is strict, attribute is already set: ".concat(name));
    }
  }
}
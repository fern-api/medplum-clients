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
 * Immutable implementation of {@link MolecularSequence_Quality}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMolecularSequence_Quality.builder()}.
 */
@Generated(from = "MolecularSequence_Quality", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMolecularSequence_Quality
    implements MolecularSequence_Quality {
  private final @Nullable MolecularSequence_Roc roc;
  private final @Nullable Decimal gtFP;
  private final @Nullable Decimal recall;
  private final @Nullable CodeableConcept method;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Quantity score;
  private final @Nullable Integer end;
  private final @Nullable Decimal truthFN;
  private final @Nullable Decimal precision;
  private final @Nullable List<Extension> extension;
  private final @Nullable Decimal queryTP;
  private final @Nullable Decimal fScore;
  private final @Nullable Molecularsequence_qualityType type;
  private final @Nullable CodeableConcept standardSequence;
  private final @Nullable Decimal queryFP;
  private final @Nullable String id;
  private final @Nullable Integer start;
  private final @Nullable Decimal truthTP;

  private ImmutableMolecularSequence_Quality(
      @Nullable MolecularSequence_Roc roc,
      @Nullable Decimal gtFP,
      @Nullable Decimal recall,
      @Nullable CodeableConcept method,
      @Nullable List<Extension> modifierExtension,
      @Nullable Quantity score,
      @Nullable Integer end,
      @Nullable Decimal truthFN,
      @Nullable Decimal precision,
      @Nullable List<Extension> extension,
      @Nullable Decimal queryTP,
      @Nullable Decimal fScore,
      @Nullable Molecularsequence_qualityType type,
      @Nullable CodeableConcept standardSequence,
      @Nullable Decimal queryFP,
      @Nullable String id,
      @Nullable Integer start,
      @Nullable Decimal truthTP) {
    this.roc = roc;
    this.gtFP = gtFP;
    this.recall = recall;
    this.method = method;
    this.modifierExtension = modifierExtension;
    this.score = score;
    this.end = end;
    this.truthFN = truthFN;
    this.precision = precision;
    this.extension = extension;
    this.queryTP = queryTP;
    this.fScore = fScore;
    this.type = type;
    this.standardSequence = standardSequence;
    this.queryFP = queryFP;
    this.id = id;
    this.start = start;
    this.truthTP = truthTP;
  }

  /**
   * @return The value of the {@code roc} attribute
   */
  @JsonProperty("roc")
  @Override
  public Optional<MolecularSequence_Roc> roc() {
    return Optional.ofNullable(roc);
  }

  /**
   * @return The value of the {@code gtFP} attribute
   */
  @JsonProperty("gtFP")
  @Override
  public Optional<Decimal> gtFP() {
    return Optional.ofNullable(gtFP);
  }

  /**
   * @return The value of the {@code recall} attribute
   */
  @JsonProperty("recall")
  @Override
  public Optional<Decimal> recall() {
    return Optional.ofNullable(recall);
  }

  /**
   * @return The value of the {@code method} attribute
   */
  @JsonProperty("method")
  @Override
  public Optional<CodeableConcept> method() {
    return Optional.ofNullable(method);
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
   * @return The value of the {@code score} attribute
   */
  @JsonProperty("score")
  @Override
  public Optional<Quantity> score() {
    return Optional.ofNullable(score);
  }

  /**
   * @return The value of the {@code end} attribute
   */
  @JsonProperty("end")
  @Override
  public Optional<Integer> end() {
    return Optional.ofNullable(end);
  }

  /**
   * @return The value of the {@code truthFN} attribute
   */
  @JsonProperty("truthFN")
  @Override
  public Optional<Decimal> truthFN() {
    return Optional.ofNullable(truthFN);
  }

  /**
   * @return The value of the {@code precision} attribute
   */
  @JsonProperty("precision")
  @Override
  public Optional<Decimal> precision() {
    return Optional.ofNullable(precision);
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
   * @return The value of the {@code queryTP} attribute
   */
  @JsonProperty("queryTP")
  @Override
  public Optional<Decimal> queryTP() {
    return Optional.ofNullable(queryTP);
  }

  /**
   * @return The value of the {@code fScore} attribute
   */
  @JsonProperty("fScore")
  @Override
  public Optional<Decimal> fScore() {
    return Optional.ofNullable(fScore);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<Molecularsequence_qualityType> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code standardSequence} attribute
   */
  @JsonProperty("standardSequence")
  @Override
  public Optional<CodeableConcept> standardSequence() {
    return Optional.ofNullable(standardSequence);
  }

  /**
   * @return The value of the {@code queryFP} attribute
   */
  @JsonProperty("queryFP")
  @Override
  public Optional<Decimal> queryFP() {
    return Optional.ofNullable(queryFP);
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
   * @return The value of the {@code start} attribute
   */
  @JsonProperty("start")
  @Override
  public Optional<Integer> start() {
    return Optional.ofNullable(start);
  }

  /**
   * @return The value of the {@code truthTP} attribute
   */
  @JsonProperty("truthTP")
  @Override
  public Optional<Decimal> truthTP() {
    return Optional.ofNullable(truthTP);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#roc() roc} attribute.
   * @param value The value for roc
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withRoc(MolecularSequence_Roc value) {
    @Nullable MolecularSequence_Roc newValue = Objects.requireNonNull(value, "roc");
    if (this.roc == newValue) return this;
    return new ImmutableMolecularSequence_Quality(
        newValue,
        this.gtFP,
        this.recall,
        this.method,
        this.modifierExtension,
        this.score,
        this.end,
        this.truthFN,
        this.precision,
        this.extension,
        this.queryTP,
        this.fScore,
        this.type,
        this.standardSequence,
        this.queryFP,
        this.id,
        this.start,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#roc() roc} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for roc
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Quality withRoc(Optional<? extends MolecularSequence_Roc> optional) {
    @Nullable MolecularSequence_Roc value = optional.orElse(null);
    if (this.roc == value) return this;
    return new ImmutableMolecularSequence_Quality(
        value,
        this.gtFP,
        this.recall,
        this.method,
        this.modifierExtension,
        this.score,
        this.end,
        this.truthFN,
        this.precision,
        this.extension,
        this.queryTP,
        this.fScore,
        this.type,
        this.standardSequence,
        this.queryFP,
        this.id,
        this.start,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#gtFP() gtFP} attribute.
   * @param value The value for gtFP
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withGtFP(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "gtFP");
    if (this.gtFP == newValue) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        newValue,
        this.recall,
        this.method,
        this.modifierExtension,
        this.score,
        this.end,
        this.truthFN,
        this.precision,
        this.extension,
        this.queryTP,
        this.fScore,
        this.type,
        this.standardSequence,
        this.queryFP,
        this.id,
        this.start,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#gtFP() gtFP} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for gtFP
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Quality withGtFP(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.gtFP == value) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        value,
        this.recall,
        this.method,
        this.modifierExtension,
        this.score,
        this.end,
        this.truthFN,
        this.precision,
        this.extension,
        this.queryTP,
        this.fScore,
        this.type,
        this.standardSequence,
        this.queryFP,
        this.id,
        this.start,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#recall() recall} attribute.
   * @param value The value for recall
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withRecall(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "recall");
    if (this.recall == newValue) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        this.gtFP,
        newValue,
        this.method,
        this.modifierExtension,
        this.score,
        this.end,
        this.truthFN,
        this.precision,
        this.extension,
        this.queryTP,
        this.fScore,
        this.type,
        this.standardSequence,
        this.queryFP,
        this.id,
        this.start,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#recall() recall} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recall
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Quality withRecall(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.recall == value) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        this.gtFP,
        value,
        this.method,
        this.modifierExtension,
        this.score,
        this.end,
        this.truthFN,
        this.precision,
        this.extension,
        this.queryTP,
        this.fScore,
        this.type,
        this.standardSequence,
        this.queryFP,
        this.id,
        this.start,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#method() method} attribute.
   * @param value The value for method
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withMethod(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "method");
    if (this.method == newValue) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        this.gtFP,
        this.recall,
        newValue,
        this.modifierExtension,
        this.score,
        this.end,
        this.truthFN,
        this.precision,
        this.extension,
        this.queryTP,
        this.fScore,
        this.type,
        this.standardSequence,
        this.queryFP,
        this.id,
        this.start,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#method() method} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for method
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Quality withMethod(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.method == value) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        this.gtFP,
        this.recall,
        value,
        this.modifierExtension,
        this.score,
        this.end,
        this.truthFN,
        this.precision,
        this.extension,
        this.queryTP,
        this.fScore,
        this.type,
        this.standardSequence,
        this.queryFP,
        this.id,
        this.start,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        this.gtFP,
        this.recall,
        this.method,
        newValue,
        this.score,
        this.end,
        this.truthFN,
        this.precision,
        this.extension,
        this.queryTP,
        this.fScore,
        this.type,
        this.standardSequence,
        this.queryFP,
        this.id,
        this.start,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Quality withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        this.gtFP,
        this.recall,
        this.method,
        value,
        this.score,
        this.end,
        this.truthFN,
        this.precision,
        this.extension,
        this.queryTP,
        this.fScore,
        this.type,
        this.standardSequence,
        this.queryFP,
        this.id,
        this.start,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#score() score} attribute.
   * @param value The value for score
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withScore(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "score");
    if (this.score == newValue) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        this.gtFP,
        this.recall,
        this.method,
        this.modifierExtension,
        newValue,
        this.end,
        this.truthFN,
        this.precision,
        this.extension,
        this.queryTP,
        this.fScore,
        this.type,
        this.standardSequence,
        this.queryFP,
        this.id,
        this.start,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#score() score} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for score
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Quality withScore(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.score == value) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        this.gtFP,
        this.recall,
        this.method,
        this.modifierExtension,
        value,
        this.end,
        this.truthFN,
        this.precision,
        this.extension,
        this.queryTP,
        this.fScore,
        this.type,
        this.standardSequence,
        this.queryFP,
        this.id,
        this.start,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#end() end} attribute.
   * @param value The value for end
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withEnd(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.end, newValue)) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        this.gtFP,
        this.recall,
        this.method,
        this.modifierExtension,
        this.score,
        newValue,
        this.truthFN,
        this.precision,
        this.extension,
        this.queryTP,
        this.fScore,
        this.type,
        this.standardSequence,
        this.queryFP,
        this.id,
        this.start,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#end() end} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for end
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withEnd(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.end, value)) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        this.gtFP,
        this.recall,
        this.method,
        this.modifierExtension,
        this.score,
        value,
        this.truthFN,
        this.precision,
        this.extension,
        this.queryTP,
        this.fScore,
        this.type,
        this.standardSequence,
        this.queryFP,
        this.id,
        this.start,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#truthFN() truthFN} attribute.
   * @param value The value for truthFN
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withTruthFN(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "truthFN");
    if (this.truthFN == newValue) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        this.gtFP,
        this.recall,
        this.method,
        this.modifierExtension,
        this.score,
        this.end,
        newValue,
        this.precision,
        this.extension,
        this.queryTP,
        this.fScore,
        this.type,
        this.standardSequence,
        this.queryFP,
        this.id,
        this.start,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#truthFN() truthFN} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for truthFN
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Quality withTruthFN(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.truthFN == value) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        this.gtFP,
        this.recall,
        this.method,
        this.modifierExtension,
        this.score,
        this.end,
        value,
        this.precision,
        this.extension,
        this.queryTP,
        this.fScore,
        this.type,
        this.standardSequence,
        this.queryFP,
        this.id,
        this.start,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#precision() precision} attribute.
   * @param value The value for precision
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withPrecision(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "precision");
    if (this.precision == newValue) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        this.gtFP,
        this.recall,
        this.method,
        this.modifierExtension,
        this.score,
        this.end,
        this.truthFN,
        newValue,
        this.extension,
        this.queryTP,
        this.fScore,
        this.type,
        this.standardSequence,
        this.queryFP,
        this.id,
        this.start,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#precision() precision} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for precision
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Quality withPrecision(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.precision == value) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        this.gtFP,
        this.recall,
        this.method,
        this.modifierExtension,
        this.score,
        this.end,
        this.truthFN,
        value,
        this.extension,
        this.queryTP,
        this.fScore,
        this.type,
        this.standardSequence,
        this.queryFP,
        this.id,
        this.start,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        this.gtFP,
        this.recall,
        this.method,
        this.modifierExtension,
        this.score,
        this.end,
        this.truthFN,
        this.precision,
        newValue,
        this.queryTP,
        this.fScore,
        this.type,
        this.standardSequence,
        this.queryFP,
        this.id,
        this.start,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Quality withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        this.gtFP,
        this.recall,
        this.method,
        this.modifierExtension,
        this.score,
        this.end,
        this.truthFN,
        this.precision,
        value,
        this.queryTP,
        this.fScore,
        this.type,
        this.standardSequence,
        this.queryFP,
        this.id,
        this.start,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#queryTP() queryTP} attribute.
   * @param value The value for queryTP
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withQueryTP(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "queryTP");
    if (this.queryTP == newValue) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        this.gtFP,
        this.recall,
        this.method,
        this.modifierExtension,
        this.score,
        this.end,
        this.truthFN,
        this.precision,
        this.extension,
        newValue,
        this.fScore,
        this.type,
        this.standardSequence,
        this.queryFP,
        this.id,
        this.start,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#queryTP() queryTP} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for queryTP
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Quality withQueryTP(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.queryTP == value) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        this.gtFP,
        this.recall,
        this.method,
        this.modifierExtension,
        this.score,
        this.end,
        this.truthFN,
        this.precision,
        this.extension,
        value,
        this.fScore,
        this.type,
        this.standardSequence,
        this.queryFP,
        this.id,
        this.start,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#fScore() fScore} attribute.
   * @param value The value for fScore
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withFScore(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "fScore");
    if (this.fScore == newValue) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        this.gtFP,
        this.recall,
        this.method,
        this.modifierExtension,
        this.score,
        this.end,
        this.truthFN,
        this.precision,
        this.extension,
        this.queryTP,
        newValue,
        this.type,
        this.standardSequence,
        this.queryFP,
        this.id,
        this.start,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#fScore() fScore} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for fScore
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Quality withFScore(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.fScore == value) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        this.gtFP,
        this.recall,
        this.method,
        this.modifierExtension,
        this.score,
        this.end,
        this.truthFN,
        this.precision,
        this.extension,
        this.queryTP,
        value,
        this.type,
        this.standardSequence,
        this.queryFP,
        this.id,
        this.start,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withType(Molecularsequence_qualityType value) {
    @Nullable Molecularsequence_qualityType newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        this.gtFP,
        this.recall,
        this.method,
        this.modifierExtension,
        this.score,
        this.end,
        this.truthFN,
        this.precision,
        this.extension,
        this.queryTP,
        this.fScore,
        newValue,
        this.standardSequence,
        this.queryFP,
        this.id,
        this.start,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Quality withType(Optional<? extends Molecularsequence_qualityType> optional) {
    @Nullable Molecularsequence_qualityType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        this.gtFP,
        this.recall,
        this.method,
        this.modifierExtension,
        this.score,
        this.end,
        this.truthFN,
        this.precision,
        this.extension,
        this.queryTP,
        this.fScore,
        value,
        this.standardSequence,
        this.queryFP,
        this.id,
        this.start,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#standardSequence() standardSequence} attribute.
   * @param value The value for standardSequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withStandardSequence(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "standardSequence");
    if (this.standardSequence == newValue) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        this.gtFP,
        this.recall,
        this.method,
        this.modifierExtension,
        this.score,
        this.end,
        this.truthFN,
        this.precision,
        this.extension,
        this.queryTP,
        this.fScore,
        this.type,
        newValue,
        this.queryFP,
        this.id,
        this.start,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#standardSequence() standardSequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for standardSequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Quality withStandardSequence(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.standardSequence == value) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        this.gtFP,
        this.recall,
        this.method,
        this.modifierExtension,
        this.score,
        this.end,
        this.truthFN,
        this.precision,
        this.extension,
        this.queryTP,
        this.fScore,
        this.type,
        value,
        this.queryFP,
        this.id,
        this.start,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#queryFP() queryFP} attribute.
   * @param value The value for queryFP
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withQueryFP(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "queryFP");
    if (this.queryFP == newValue) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        this.gtFP,
        this.recall,
        this.method,
        this.modifierExtension,
        this.score,
        this.end,
        this.truthFN,
        this.precision,
        this.extension,
        this.queryTP,
        this.fScore,
        this.type,
        this.standardSequence,
        newValue,
        this.id,
        this.start,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#queryFP() queryFP} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for queryFP
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Quality withQueryFP(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.queryFP == value) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        this.gtFP,
        this.recall,
        this.method,
        this.modifierExtension,
        this.score,
        this.end,
        this.truthFN,
        this.precision,
        this.extension,
        this.queryTP,
        this.fScore,
        this.type,
        this.standardSequence,
        value,
        this.id,
        this.start,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        this.gtFP,
        this.recall,
        this.method,
        this.modifierExtension,
        this.score,
        this.end,
        this.truthFN,
        this.precision,
        this.extension,
        this.queryTP,
        this.fScore,
        this.type,
        this.standardSequence,
        this.queryFP,
        newValue,
        this.start,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        this.gtFP,
        this.recall,
        this.method,
        this.modifierExtension,
        this.score,
        this.end,
        this.truthFN,
        this.precision,
        this.extension,
        this.queryTP,
        this.fScore,
        this.type,
        this.standardSequence,
        this.queryFP,
        value,
        this.start,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#start() start} attribute.
   * @param value The value for start
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withStart(int value) {
    @Nullable Integer newValue = value;
    if (Objects.equals(this.start, newValue)) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        this.gtFP,
        this.recall,
        this.method,
        this.modifierExtension,
        this.score,
        this.end,
        this.truthFN,
        this.precision,
        this.extension,
        this.queryTP,
        this.fScore,
        this.type,
        this.standardSequence,
        this.queryFP,
        this.id,
        newValue,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#start() start} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for start
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withStart(Optional<Integer> optional) {
    @Nullable Integer value = optional.orElse(null);
    if (Objects.equals(this.start, value)) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        this.gtFP,
        this.recall,
        this.method,
        this.modifierExtension,
        this.score,
        this.end,
        this.truthFN,
        this.precision,
        this.extension,
        this.queryTP,
        this.fScore,
        this.type,
        this.standardSequence,
        this.queryFP,
        this.id,
        value,
        this.truthTP);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#truthTP() truthTP} attribute.
   * @param value The value for truthTP
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withTruthTP(Decimal value) {
    @Nullable Decimal newValue = Objects.requireNonNull(value, "truthTP");
    if (this.truthTP == newValue) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        this.gtFP,
        this.recall,
        this.method,
        this.modifierExtension,
        this.score,
        this.end,
        this.truthFN,
        this.precision,
        this.extension,
        this.queryTP,
        this.fScore,
        this.type,
        this.standardSequence,
        this.queryFP,
        this.id,
        this.start,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#truthTP() truthTP} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for truthTP
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Quality withTruthTP(Optional<? extends Decimal> optional) {
    @Nullable Decimal value = optional.orElse(null);
    if (this.truthTP == value) return this;
    return new ImmutableMolecularSequence_Quality(
        this.roc,
        this.gtFP,
        this.recall,
        this.method,
        this.modifierExtension,
        this.score,
        this.end,
        this.truthFN,
        this.precision,
        this.extension,
        this.queryTP,
        this.fScore,
        this.type,
        this.standardSequence,
        this.queryFP,
        this.id,
        this.start,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMolecularSequence_Quality} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMolecularSequence_Quality
        && equalTo((ImmutableMolecularSequence_Quality) another);
  }

  private boolean equalTo(ImmutableMolecularSequence_Quality another) {
    return Objects.equals(roc, another.roc)
        && Objects.equals(gtFP, another.gtFP)
        && Objects.equals(recall, another.recall)
        && Objects.equals(method, another.method)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(score, another.score)
        && Objects.equals(end, another.end)
        && Objects.equals(truthFN, another.truthFN)
        && Objects.equals(precision, another.precision)
        && Objects.equals(extension, another.extension)
        && Objects.equals(queryTP, another.queryTP)
        && Objects.equals(fScore, another.fScore)
        && Objects.equals(type, another.type)
        && Objects.equals(standardSequence, another.standardSequence)
        && Objects.equals(queryFP, another.queryFP)
        && Objects.equals(id, another.id)
        && Objects.equals(start, another.start)
        && Objects.equals(truthTP, another.truthTP);
  }

  /**
   * Computes a hash code from attributes: {@code roc}, {@code gtFP}, {@code recall}, {@code method}, {@code modifierExtension}, {@code score}, {@code end}, {@code truthFN}, {@code precision}, {@code extension}, {@code queryTP}, {@code fScore}, {@code type}, {@code standardSequence}, {@code queryFP}, {@code id}, {@code start}, {@code truthTP}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(roc);
    h += (h << 5) + Objects.hashCode(gtFP);
    h += (h << 5) + Objects.hashCode(recall);
    h += (h << 5) + Objects.hashCode(method);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(score);
    h += (h << 5) + Objects.hashCode(end);
    h += (h << 5) + Objects.hashCode(truthFN);
    h += (h << 5) + Objects.hashCode(precision);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(queryTP);
    h += (h << 5) + Objects.hashCode(fScore);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(standardSequence);
    h += (h << 5) + Objects.hashCode(queryFP);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(start);
    h += (h << 5) + Objects.hashCode(truthTP);
    return h;
  }

  /**
   * Prints the immutable value {@code MolecularSequence_Quality} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MolecularSequence_Quality{");
    if (roc != null) {
      builder.append("roc=").append(roc);
    }
    if (gtFP != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("gtFP=").append(gtFP);
    }
    if (recall != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("recall=").append(recall);
    }
    if (method != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("method=").append(method);
    }
    if (modifierExtension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (score != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("score=").append(score);
    }
    if (end != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("end=").append(end);
    }
    if (truthFN != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("truthFN=").append(truthFN);
    }
    if (precision != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("precision=").append(precision);
    }
    if (extension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (queryTP != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("queryTP=").append(queryTP);
    }
    if (fScore != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("fScore=").append(fScore);
    }
    if (type != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (standardSequence != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("standardSequence=").append(standardSequence);
    }
    if (queryFP != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("queryFP=").append(queryFP);
    }
    if (id != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (start != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("start=").append(start);
    }
    if (truthTP != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("truthTP=").append(truthTP);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "MolecularSequence_Quality", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MolecularSequence_Quality {
    @Nullable Optional<MolecularSequence_Roc> roc = Optional.empty();
    boolean rocIsSet;
    @Nullable Optional<Decimal> gtFP = Optional.empty();
    boolean gtFPIsSet;
    @Nullable Optional<Decimal> recall = Optional.empty();
    boolean recallIsSet;
    @Nullable Optional<CodeableConcept> method = Optional.empty();
    boolean methodIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Quantity> score = Optional.empty();
    boolean scoreIsSet;
    @Nullable Optional<Integer> end = Optional.empty();
    boolean endIsSet;
    @Nullable Optional<Decimal> truthFN = Optional.empty();
    boolean truthFNIsSet;
    @Nullable Optional<Decimal> precision = Optional.empty();
    boolean precisionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Decimal> queryTP = Optional.empty();
    boolean queryTPIsSet;
    @Nullable Optional<Decimal> fScore = Optional.empty();
    boolean fScoreIsSet;
    @Nullable Optional<Molecularsequence_qualityType> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<CodeableConcept> standardSequence = Optional.empty();
    boolean standardSequenceIsSet;
    @Nullable Optional<Decimal> queryFP = Optional.empty();
    boolean queryFPIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Integer> start = Optional.empty();
    boolean startIsSet;
    @Nullable Optional<Decimal> truthTP = Optional.empty();
    boolean truthTPIsSet;
    @JsonProperty("roc")
    public void setRoc(Optional<MolecularSequence_Roc> roc) {
      this.roc = roc;
      this.rocIsSet = true;
    }
    @JsonProperty("gtFP")
    public void setGtFP(Optional<Decimal> gtFP) {
      this.gtFP = gtFP;
      this.gtFPIsSet = true;
    }
    @JsonProperty("recall")
    public void setRecall(Optional<Decimal> recall) {
      this.recall = recall;
      this.recallIsSet = true;
    }
    @JsonProperty("method")
    public void setMethod(Optional<CodeableConcept> method) {
      this.method = method;
      this.methodIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("score")
    public void setScore(Optional<Quantity> score) {
      this.score = score;
      this.scoreIsSet = true;
    }
    @JsonProperty("end")
    public void setEnd(Optional<Integer> end) {
      this.end = end;
      this.endIsSet = true;
    }
    @JsonProperty("truthFN")
    public void setTruthFN(Optional<Decimal> truthFN) {
      this.truthFN = truthFN;
      this.truthFNIsSet = true;
    }
    @JsonProperty("precision")
    public void setPrecision(Optional<Decimal> precision) {
      this.precision = precision;
      this.precisionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("queryTP")
    public void setQueryTP(Optional<Decimal> queryTP) {
      this.queryTP = queryTP;
      this.queryTPIsSet = true;
    }
    @JsonProperty("fScore")
    public void setFScore(Optional<Decimal> fScore) {
      this.fScore = fScore;
      this.fScoreIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<Molecularsequence_qualityType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("standardSequence")
    public void setStandardSequence(Optional<CodeableConcept> standardSequence) {
      this.standardSequence = standardSequence;
      this.standardSequenceIsSet = true;
    }
    @JsonProperty("queryFP")
    public void setQueryFP(Optional<Decimal> queryFP) {
      this.queryFP = queryFP;
      this.queryFPIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("start")
    public void setStart(Optional<Integer> start) {
      this.start = start;
      this.startIsSet = true;
    }
    @JsonProperty("truthTP")
    public void setTruthTP(Optional<Decimal> truthTP) {
      this.truthTP = truthTP;
      this.truthTPIsSet = true;
    }
    @Override
    public Optional<MolecularSequence_Roc> roc() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> gtFP() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> recall() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> method() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> score() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> end() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> truthFN() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> precision() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> queryTP() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> fScore() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Molecularsequence_qualityType> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> standardSequence() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> queryFP() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Integer> start() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Decimal> truthTP() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableMolecularSequence_Quality fromJson(Json json) {
    ImmutableMolecularSequence_Quality.Builder builder = ImmutableMolecularSequence_Quality.builder();
    if (json.rocIsSet) {
      builder.roc(json.roc);
    }
    if (json.gtFPIsSet) {
      builder.gtFP(json.gtFP);
    }
    if (json.recallIsSet) {
      builder.recall(json.recall);
    }
    if (json.methodIsSet) {
      builder.method(json.method);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.scoreIsSet) {
      builder.score(json.score);
    }
    if (json.endIsSet) {
      builder.end(json.end);
    }
    if (json.truthFNIsSet) {
      builder.truthFN(json.truthFN);
    }
    if (json.precisionIsSet) {
      builder.precision(json.precision);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.queryTPIsSet) {
      builder.queryTP(json.queryTP);
    }
    if (json.fScoreIsSet) {
      builder.fScore(json.fScore);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.standardSequenceIsSet) {
      builder.standardSequence(json.standardSequence);
    }
    if (json.queryFPIsSet) {
      builder.queryFP(json.queryFP);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.startIsSet) {
      builder.start(json.start);
    }
    if (json.truthTPIsSet) {
      builder.truthTP(json.truthTP);
    }
    return (ImmutableMolecularSequence_Quality) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MolecularSequence_Quality} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MolecularSequence_Quality instance
   */
  public static MolecularSequence_Quality copyOf(MolecularSequence_Quality instance) {
    if (instance instanceof ImmutableMolecularSequence_Quality) {
      return (ImmutableMolecularSequence_Quality) instance;
    }
    return ImmutableMolecularSequence_Quality.builder()
        .roc(instance.roc())
        .gtFP(instance.gtFP())
        .recall(instance.recall())
        .method(instance.method())
        .modifierExtension(instance.modifierExtension())
        .score(instance.score())
        .end(instance.end())
        .truthFN(instance.truthFN())
        .precision(instance.precision())
        .extension(instance.extension())
        .queryTP(instance.queryTP())
        .fScore(instance.fScore())
        .type(instance.type())
        .standardSequence(instance.standardSequence())
        .queryFP(instance.queryFP())
        .id(instance.id())
        .start(instance.start())
        .truthTP(instance.truthTP())
        .build();
  }

  /**
   * Creates a builder for {@link MolecularSequence_Quality MolecularSequence_Quality}.
   * <pre>
   * ImmutableMolecularSequence_Quality.builder()
   *    .roc(com.medplum.types.fhir.MolecularSequence_Roc) // optional {@link MolecularSequence_Quality#roc() roc}
   *    .gtFP(com.medplum.types.fhir.Decimal) // optional {@link MolecularSequence_Quality#gtFP() gtFP}
   *    .recall(com.medplum.types.fhir.Decimal) // optional {@link MolecularSequence_Quality#recall() recall}
   *    .method(com.medplum.types.fhir.CodeableConcept) // optional {@link MolecularSequence_Quality#method() method}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MolecularSequence_Quality#modifierExtension() modifierExtension}
   *    .score(com.medplum.types.fhir.Quantity) // optional {@link MolecularSequence_Quality#score() score}
   *    .end(Integer) // optional {@link MolecularSequence_Quality#end() end}
   *    .truthFN(com.medplum.types.fhir.Decimal) // optional {@link MolecularSequence_Quality#truthFN() truthFN}
   *    .precision(com.medplum.types.fhir.Decimal) // optional {@link MolecularSequence_Quality#precision() precision}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MolecularSequence_Quality#extension() extension}
   *    .queryTP(com.medplum.types.fhir.Decimal) // optional {@link MolecularSequence_Quality#queryTP() queryTP}
   *    .fScore(com.medplum.types.fhir.Decimal) // optional {@link MolecularSequence_Quality#fScore() fScore}
   *    .type(com.medplum.types.fhir.Molecularsequence_qualityType) // optional {@link MolecularSequence_Quality#type() type}
   *    .standardSequence(com.medplum.types.fhir.CodeableConcept) // optional {@link MolecularSequence_Quality#standardSequence() standardSequence}
   *    .queryFP(com.medplum.types.fhir.Decimal) // optional {@link MolecularSequence_Quality#queryFP() queryFP}
   *    .id(String) // optional {@link MolecularSequence_Quality#id() id}
   *    .start(Integer) // optional {@link MolecularSequence_Quality#start() start}
   *    .truthTP(com.medplum.types.fhir.Decimal) // optional {@link MolecularSequence_Quality#truthTP() truthTP}
   *    .build();
   * </pre>
   * @return A new MolecularSequence_Quality builder
   */
  public static ImmutableMolecularSequence_Quality.Builder builder() {
    return new ImmutableMolecularSequence_Quality.Builder();
  }

  /**
   * Builds instances of type {@link MolecularSequence_Quality MolecularSequence_Quality}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MolecularSequence_Quality", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ROC = 0x1L;
    private static final long OPT_BIT_GT_F_P = 0x2L;
    private static final long OPT_BIT_RECALL = 0x4L;
    private static final long OPT_BIT_METHOD = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_SCORE = 0x20L;
    private static final long OPT_BIT_END = 0x40L;
    private static final long OPT_BIT_TRUTH_F_N = 0x80L;
    private static final long OPT_BIT_PRECISION = 0x100L;
    private static final long OPT_BIT_EXTENSION = 0x200L;
    private static final long OPT_BIT_QUERY_T_P = 0x400L;
    private static final long OPT_BIT_F_SCORE = 0x800L;
    private static final long OPT_BIT_TYPE = 0x1000L;
    private static final long OPT_BIT_STANDARD_SEQUENCE = 0x2000L;
    private static final long OPT_BIT_QUERY_F_P = 0x4000L;
    private static final long OPT_BIT_ID = 0x8000L;
    private static final long OPT_BIT_START = 0x10000L;
    private static final long OPT_BIT_TRUTH_T_P = 0x20000L;
    private long optBits;

    private @Nullable MolecularSequence_Roc roc;
    private @Nullable Decimal gtFP;
    private @Nullable Decimal recall;
    private @Nullable CodeableConcept method;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Quantity score;
    private @Nullable Integer end;
    private @Nullable Decimal truthFN;
    private @Nullable Decimal precision;
    private @Nullable List<Extension> extension;
    private @Nullable Decimal queryTP;
    private @Nullable Decimal fScore;
    private @Nullable Molecularsequence_qualityType type;
    private @Nullable CodeableConcept standardSequence;
    private @Nullable Decimal queryFP;
    private @Nullable String id;
    private @Nullable Integer start;
    private @Nullable Decimal truthTP;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#roc() roc} to roc.
     * @param roc The value for roc
     * @return {@code this} builder for chained invocation
     */
    public final Builder roc(MolecularSequence_Roc roc) {
      checkNotIsSet(rocIsSet(), "roc");
      this.roc = Objects.requireNonNull(roc, "roc");
      optBits |= OPT_BIT_ROC;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#roc() roc} to roc.
     * @param roc The value for roc
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("roc")
    public final Builder roc(Optional<? extends MolecularSequence_Roc> roc) {
      checkNotIsSet(rocIsSet(), "roc");
      this.roc = roc.orElse(null);
      optBits |= OPT_BIT_ROC;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#gtFP() gtFP} to gtFP.
     * @param gtFP The value for gtFP
     * @return {@code this} builder for chained invocation
     */
    public final Builder gtFP(Decimal gtFP) {
      checkNotIsSet(gtFPIsSet(), "gtFP");
      this.gtFP = Objects.requireNonNull(gtFP, "gtFP");
      optBits |= OPT_BIT_GT_F_P;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#gtFP() gtFP} to gtFP.
     * @param gtFP The value for gtFP
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("gtFP")
    public final Builder gtFP(Optional<? extends Decimal> gtFP) {
      checkNotIsSet(gtFPIsSet(), "gtFP");
      this.gtFP = gtFP.orElse(null);
      optBits |= OPT_BIT_GT_F_P;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#recall() recall} to recall.
     * @param recall The value for recall
     * @return {@code this} builder for chained invocation
     */
    public final Builder recall(Decimal recall) {
      checkNotIsSet(recallIsSet(), "recall");
      this.recall = Objects.requireNonNull(recall, "recall");
      optBits |= OPT_BIT_RECALL;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#recall() recall} to recall.
     * @param recall The value for recall
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("recall")
    public final Builder recall(Optional<? extends Decimal> recall) {
      checkNotIsSet(recallIsSet(), "recall");
      this.recall = recall.orElse(null);
      optBits |= OPT_BIT_RECALL;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for chained invocation
     */
    public final Builder method(CodeableConcept method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = Objects.requireNonNull(method, "method");
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("method")
    public final Builder method(Optional<? extends CodeableConcept> method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = method.orElse(null);
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MolecularSequence_Quality#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MolecularSequence_Quality#score() score} to score.
     * @param score The value for score
     * @return {@code this} builder for chained invocation
     */
    public final Builder score(Quantity score) {
      checkNotIsSet(scoreIsSet(), "score");
      this.score = Objects.requireNonNull(score, "score");
      optBits |= OPT_BIT_SCORE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#score() score} to score.
     * @param score The value for score
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("score")
    public final Builder score(Optional<? extends Quantity> score) {
      checkNotIsSet(scoreIsSet(), "score");
      this.score = score.orElse(null);
      optBits |= OPT_BIT_SCORE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#end() end} to end.
     * @param end The value for end
     * @return {@code this} builder for chained invocation
     */
    public final Builder end(int end) {
      checkNotIsSet(endIsSet(), "end");
      this.end = end;
      optBits |= OPT_BIT_END;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#end() end} to end.
     * @param end The value for end
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("end")
    public final Builder end(Optional<Integer> end) {
      checkNotIsSet(endIsSet(), "end");
      this.end = end.orElse(null);
      optBits |= OPT_BIT_END;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#truthFN() truthFN} to truthFN.
     * @param truthFN The value for truthFN
     * @return {@code this} builder for chained invocation
     */
    public final Builder truthFN(Decimal truthFN) {
      checkNotIsSet(truthFNIsSet(), "truthFN");
      this.truthFN = Objects.requireNonNull(truthFN, "truthFN");
      optBits |= OPT_BIT_TRUTH_F_N;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#truthFN() truthFN} to truthFN.
     * @param truthFN The value for truthFN
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("truthFN")
    public final Builder truthFN(Optional<? extends Decimal> truthFN) {
      checkNotIsSet(truthFNIsSet(), "truthFN");
      this.truthFN = truthFN.orElse(null);
      optBits |= OPT_BIT_TRUTH_F_N;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#precision() precision} to precision.
     * @param precision The value for precision
     * @return {@code this} builder for chained invocation
     */
    public final Builder precision(Decimal precision) {
      checkNotIsSet(precisionIsSet(), "precision");
      this.precision = Objects.requireNonNull(precision, "precision");
      optBits |= OPT_BIT_PRECISION;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#precision() precision} to precision.
     * @param precision The value for precision
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("precision")
    public final Builder precision(Optional<? extends Decimal> precision) {
      checkNotIsSet(precisionIsSet(), "precision");
      this.precision = precision.orElse(null);
      optBits |= OPT_BIT_PRECISION;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#extension() extension} to extension.
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
     * Initializes the optional value {@link MolecularSequence_Quality#extension() extension} to extension.
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
     * Initializes the optional value {@link MolecularSequence_Quality#queryTP() queryTP} to queryTP.
     * @param queryTP The value for queryTP
     * @return {@code this} builder for chained invocation
     */
    public final Builder queryTP(Decimal queryTP) {
      checkNotIsSet(queryTPIsSet(), "queryTP");
      this.queryTP = Objects.requireNonNull(queryTP, "queryTP");
      optBits |= OPT_BIT_QUERY_T_P;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#queryTP() queryTP} to queryTP.
     * @param queryTP The value for queryTP
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("queryTP")
    public final Builder queryTP(Optional<? extends Decimal> queryTP) {
      checkNotIsSet(queryTPIsSet(), "queryTP");
      this.queryTP = queryTP.orElse(null);
      optBits |= OPT_BIT_QUERY_T_P;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#fScore() fScore} to fScore.
     * @param fScore The value for fScore
     * @return {@code this} builder for chained invocation
     */
    public final Builder fScore(Decimal fScore) {
      checkNotIsSet(fScoreIsSet(), "fScore");
      this.fScore = Objects.requireNonNull(fScore, "fScore");
      optBits |= OPT_BIT_F_SCORE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#fScore() fScore} to fScore.
     * @param fScore The value for fScore
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("fScore")
    public final Builder fScore(Optional<? extends Decimal> fScore) {
      checkNotIsSet(fScoreIsSet(), "fScore");
      this.fScore = fScore.orElse(null);
      optBits |= OPT_BIT_F_SCORE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(Molecularsequence_qualityType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends Molecularsequence_qualityType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#standardSequence() standardSequence} to standardSequence.
     * @param standardSequence The value for standardSequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder standardSequence(CodeableConcept standardSequence) {
      checkNotIsSet(standardSequenceIsSet(), "standardSequence");
      this.standardSequence = Objects.requireNonNull(standardSequence, "standardSequence");
      optBits |= OPT_BIT_STANDARD_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#standardSequence() standardSequence} to standardSequence.
     * @param standardSequence The value for standardSequence
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("standardSequence")
    public final Builder standardSequence(Optional<? extends CodeableConcept> standardSequence) {
      checkNotIsSet(standardSequenceIsSet(), "standardSequence");
      this.standardSequence = standardSequence.orElse(null);
      optBits |= OPT_BIT_STANDARD_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#queryFP() queryFP} to queryFP.
     * @param queryFP The value for queryFP
     * @return {@code this} builder for chained invocation
     */
    public final Builder queryFP(Decimal queryFP) {
      checkNotIsSet(queryFPIsSet(), "queryFP");
      this.queryFP = Objects.requireNonNull(queryFP, "queryFP");
      optBits |= OPT_BIT_QUERY_F_P;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#queryFP() queryFP} to queryFP.
     * @param queryFP The value for queryFP
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("queryFP")
    public final Builder queryFP(Optional<? extends Decimal> queryFP) {
      checkNotIsSet(queryFPIsSet(), "queryFP");
      this.queryFP = queryFP.orElse(null);
      optBits |= OPT_BIT_QUERY_F_P;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#id() id} to id.
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
     * Initializes the optional value {@link MolecularSequence_Quality#id() id} to id.
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
     * Initializes the optional value {@link MolecularSequence_Quality#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for chained invocation
     */
    public final Builder start(int start) {
      checkNotIsSet(startIsSet(), "start");
      this.start = start;
      optBits |= OPT_BIT_START;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#start() start} to start.
     * @param start The value for start
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("start")
    public final Builder start(Optional<Integer> start) {
      checkNotIsSet(startIsSet(), "start");
      this.start = start.orElse(null);
      optBits |= OPT_BIT_START;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#truthTP() truthTP} to truthTP.
     * @param truthTP The value for truthTP
     * @return {@code this} builder for chained invocation
     */
    public final Builder truthTP(Decimal truthTP) {
      checkNotIsSet(truthTPIsSet(), "truthTP");
      this.truthTP = Objects.requireNonNull(truthTP, "truthTP");
      optBits |= OPT_BIT_TRUTH_T_P;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#truthTP() truthTP} to truthTP.
     * @param truthTP The value for truthTP
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("truthTP")
    public final Builder truthTP(Optional<? extends Decimal> truthTP) {
      checkNotIsSet(truthTPIsSet(), "truthTP");
      this.truthTP = truthTP.orElse(null);
      optBits |= OPT_BIT_TRUTH_T_P;
      return this;
    }

    /**
     * Builds a new {@link MolecularSequence_Quality MolecularSequence_Quality}.
     * @return An immutable instance of MolecularSequence_Quality
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MolecularSequence_Quality build() {
      return new ImmutableMolecularSequence_Quality(
          roc,
          gtFP,
          recall,
          method,
          modifierExtension,
          score,
          end,
          truthFN,
          precision,
          extension,
          queryTP,
          fScore,
          type,
          standardSequence,
          queryFP,
          id,
          start,
          truthTP);
    }

    private boolean rocIsSet() {
      return (optBits & OPT_BIT_ROC) != 0;
    }

    private boolean gtFPIsSet() {
      return (optBits & OPT_BIT_GT_F_P) != 0;
    }

    private boolean recallIsSet() {
      return (optBits & OPT_BIT_RECALL) != 0;
    }

    private boolean methodIsSet() {
      return (optBits & OPT_BIT_METHOD) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean scoreIsSet() {
      return (optBits & OPT_BIT_SCORE) != 0;
    }

    private boolean endIsSet() {
      return (optBits & OPT_BIT_END) != 0;
    }

    private boolean truthFNIsSet() {
      return (optBits & OPT_BIT_TRUTH_F_N) != 0;
    }

    private boolean precisionIsSet() {
      return (optBits & OPT_BIT_PRECISION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean queryTPIsSet() {
      return (optBits & OPT_BIT_QUERY_T_P) != 0;
    }

    private boolean fScoreIsSet() {
      return (optBits & OPT_BIT_F_SCORE) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean standardSequenceIsSet() {
      return (optBits & OPT_BIT_STANDARD_SEQUENCE) != 0;
    }

    private boolean queryFPIsSet() {
      return (optBits & OPT_BIT_QUERY_F_P) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean startIsSet() {
      return (optBits & OPT_BIT_START) != 0;
    }

    private boolean truthTPIsSet() {
      return (optBits & OPT_BIT_TRUTH_T_P) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MolecularSequence_Quality is strict, attribute is already set: ".concat(name));
    }
  }
}
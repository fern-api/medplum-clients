//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link MolecularSequence_Quality}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMolecularSequence_Quality.builder()}.
 */
@org.immutables.value.Generated(from = "MolecularSequence_Quality", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMolecularSequence_Quality implements com.fhir.MolecularSequence_Quality {
  private final @javax.annotation.Nullable com.fhir.CodeableConcept standardSequence;
  private final @javax.annotation.Nullable com.fhir.decimal truthTP;
  private final @javax.annotation.Nullable com.fhir.decimal queryFP;
  private final @javax.annotation.Nullable com.fhir.Quantity score;
  private final @javax.annotation.Nullable com.fhir.decimal precision;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.Molecularsequence_qualityType type;
  private final @javax.annotation.Nullable com.fhir.decimal fScore;
  private final @javax.annotation.Nullable com.fhir.decimal truthFN;
  private final @javax.annotation.Nullable com.fhir.decimal recall;
  private final @javax.annotation.Nullable com.fhir.MolecularSequence_Roc roc;
  private final @javax.annotation.Nullable com.fhir.decimal gtFP;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept method;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.decimal queryTP;
  private final @javax.annotation.Nullable java.lang.Integer end;
  private final @javax.annotation.Nullable java.lang.Integer start;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;

  private ImmutableMolecularSequence_Quality(
      @javax.annotation.Nullable com.fhir.CodeableConcept standardSequence,
      @javax.annotation.Nullable com.fhir.decimal truthTP,
      @javax.annotation.Nullable com.fhir.decimal queryFP,
      @javax.annotation.Nullable com.fhir.Quantity score,
      @javax.annotation.Nullable com.fhir.decimal precision,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.Molecularsequence_qualityType type,
      @javax.annotation.Nullable com.fhir.decimal fScore,
      @javax.annotation.Nullable com.fhir.decimal truthFN,
      @javax.annotation.Nullable com.fhir.decimal recall,
      @javax.annotation.Nullable com.fhir.MolecularSequence_Roc roc,
      @javax.annotation.Nullable com.fhir.decimal gtFP,
      @javax.annotation.Nullable com.fhir.CodeableConcept method,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.decimal queryTP,
      @javax.annotation.Nullable java.lang.Integer end,
      @javax.annotation.Nullable java.lang.Integer start,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension) {
    this.standardSequence = standardSequence;
    this.truthTP = truthTP;
    this.queryFP = queryFP;
    this.score = score;
    this.precision = precision;
    this.id = id;
    this.type = type;
    this.fScore = fScore;
    this.truthFN = truthFN;
    this.recall = recall;
    this.roc = roc;
    this.gtFP = gtFP;
    this.method = method;
    this.modifierExtension = modifierExtension;
    this.queryTP = queryTP;
    this.end = end;
    this.start = start;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code standardSequence} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("standardSequence")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> standardSequence() {
    return java.util.Optional.ofNullable(standardSequence);
  }

  /**
   * @return The value of the {@code truthTP} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("truthTP")
  @Override
  public java.util.Optional<com.fhir.decimal> truthTP() {
    return java.util.Optional.ofNullable(truthTP);
  }

  /**
   * @return The value of the {@code queryFP} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("queryFP")
  @Override
  public java.util.Optional<com.fhir.decimal> queryFP() {
    return java.util.Optional.ofNullable(queryFP);
  }

  /**
   * @return The value of the {@code score} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("score")
  @Override
  public java.util.Optional<com.fhir.Quantity> score() {
    return java.util.Optional.ofNullable(score);
  }

  /**
   * @return The value of the {@code precision} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("precision")
  @Override
  public java.util.Optional<com.fhir.decimal> precision() {
    return java.util.Optional.ofNullable(precision);
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
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.Molecularsequence_qualityType> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code fScore} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("fScore")
  @Override
  public java.util.Optional<com.fhir.decimal> fScore() {
    return java.util.Optional.ofNullable(fScore);
  }

  /**
   * @return The value of the {@code truthFN} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("truthFN")
  @Override
  public java.util.Optional<com.fhir.decimal> truthFN() {
    return java.util.Optional.ofNullable(truthFN);
  }

  /**
   * @return The value of the {@code recall} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("recall")
  @Override
  public java.util.Optional<com.fhir.decimal> recall() {
    return java.util.Optional.ofNullable(recall);
  }

  /**
   * @return The value of the {@code roc} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("roc")
  @Override
  public java.util.Optional<com.fhir.MolecularSequence_Roc> roc() {
    return java.util.Optional.ofNullable(roc);
  }

  /**
   * @return The value of the {@code gtFP} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("gtFP")
  @Override
  public java.util.Optional<com.fhir.decimal> gtFP() {
    return java.util.Optional.ofNullable(gtFP);
  }

  /**
   * @return The value of the {@code method} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("method")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> method() {
    return java.util.Optional.ofNullable(method);
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
   * @return The value of the {@code queryTP} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("queryTP")
  @Override
  public java.util.Optional<com.fhir.decimal> queryTP() {
    return java.util.Optional.ofNullable(queryTP);
  }

  /**
   * @return The value of the {@code end} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("end")
  @Override
  public java.util.Optional<java.lang.Integer> end() {
    return java.util.Optional.ofNullable(end);
  }

  /**
   * @return The value of the {@code start} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("start")
  @Override
  public java.util.Optional<java.lang.Integer> start() {
    return java.util.Optional.ofNullable(start);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#standardSequence() standardSequence} attribute.
   * @param value The value for standardSequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withStandardSequence(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "standardSequence");
    if (this.standardSequence == newValue) return this;
    return new ImmutableMolecularSequence_Quality(
        newValue,
        this.truthTP,
        this.queryFP,
        this.score,
        this.precision,
        this.id,
        this.type,
        this.fScore,
        this.truthFN,
        this.recall,
        this.roc,
        this.gtFP,
        this.method,
        this.modifierExtension,
        this.queryTP,
        this.end,
        this.start,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#standardSequence() standardSequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for standardSequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Quality withStandardSequence(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.standardSequence == value) return this;
    return new ImmutableMolecularSequence_Quality(
        value,
        this.truthTP,
        this.queryFP,
        this.score,
        this.precision,
        this.id,
        this.type,
        this.fScore,
        this.truthFN,
        this.recall,
        this.roc,
        this.gtFP,
        this.method,
        this.modifierExtension,
        this.queryTP,
        this.end,
        this.start,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#truthTP() truthTP} attribute.
   * @param value The value for truthTP
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withTruthTP(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "truthTP");
    if (this.truthTP == newValue) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        newValue,
        this.queryFP,
        this.score,
        this.precision,
        this.id,
        this.type,
        this.fScore,
        this.truthFN,
        this.recall,
        this.roc,
        this.gtFP,
        this.method,
        this.modifierExtension,
        this.queryTP,
        this.end,
        this.start,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#truthTP() truthTP} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for truthTP
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Quality withTruthTP(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.truthTP == value) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        value,
        this.queryFP,
        this.score,
        this.precision,
        this.id,
        this.type,
        this.fScore,
        this.truthFN,
        this.recall,
        this.roc,
        this.gtFP,
        this.method,
        this.modifierExtension,
        this.queryTP,
        this.end,
        this.start,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#queryFP() queryFP} attribute.
   * @param value The value for queryFP
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withQueryFP(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "queryFP");
    if (this.queryFP == newValue) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        this.truthTP,
        newValue,
        this.score,
        this.precision,
        this.id,
        this.type,
        this.fScore,
        this.truthFN,
        this.recall,
        this.roc,
        this.gtFP,
        this.method,
        this.modifierExtension,
        this.queryTP,
        this.end,
        this.start,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#queryFP() queryFP} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for queryFP
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Quality withQueryFP(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.queryFP == value) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        this.truthTP,
        value,
        this.score,
        this.precision,
        this.id,
        this.type,
        this.fScore,
        this.truthFN,
        this.recall,
        this.roc,
        this.gtFP,
        this.method,
        this.modifierExtension,
        this.queryTP,
        this.end,
        this.start,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#score() score} attribute.
   * @param value The value for score
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withScore(com.fhir.Quantity value) {
    @javax.annotation.Nullable com.fhir.Quantity newValue = java.util.Objects.requireNonNull(value, "score");
    if (this.score == newValue) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        this.truthTP,
        this.queryFP,
        newValue,
        this.precision,
        this.id,
        this.type,
        this.fScore,
        this.truthFN,
        this.recall,
        this.roc,
        this.gtFP,
        this.method,
        this.modifierExtension,
        this.queryTP,
        this.end,
        this.start,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#score() score} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for score
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Quality withScore(java.util.Optional<? extends com.fhir.Quantity> optional) {
    @javax.annotation.Nullable com.fhir.Quantity value = optional.orElse(null);
    if (this.score == value) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        this.truthTP,
        this.queryFP,
        value,
        this.precision,
        this.id,
        this.type,
        this.fScore,
        this.truthFN,
        this.recall,
        this.roc,
        this.gtFP,
        this.method,
        this.modifierExtension,
        this.queryTP,
        this.end,
        this.start,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#precision() precision} attribute.
   * @param value The value for precision
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withPrecision(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "precision");
    if (this.precision == newValue) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        this.truthTP,
        this.queryFP,
        this.score,
        newValue,
        this.id,
        this.type,
        this.fScore,
        this.truthFN,
        this.recall,
        this.roc,
        this.gtFP,
        this.method,
        this.modifierExtension,
        this.queryTP,
        this.end,
        this.start,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#precision() precision} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for precision
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Quality withPrecision(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.precision == value) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        this.truthTP,
        this.queryFP,
        this.score,
        value,
        this.id,
        this.type,
        this.fScore,
        this.truthFN,
        this.recall,
        this.roc,
        this.gtFP,
        this.method,
        this.modifierExtension,
        this.queryTP,
        this.end,
        this.start,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        this.truthTP,
        this.queryFP,
        this.score,
        this.precision,
        newValue,
        this.type,
        this.fScore,
        this.truthFN,
        this.recall,
        this.roc,
        this.gtFP,
        this.method,
        this.modifierExtension,
        this.queryTP,
        this.end,
        this.start,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        this.truthTP,
        this.queryFP,
        this.score,
        this.precision,
        value,
        this.type,
        this.fScore,
        this.truthFN,
        this.recall,
        this.roc,
        this.gtFP,
        this.method,
        this.modifierExtension,
        this.queryTP,
        this.end,
        this.start,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withType(com.fhir.Molecularsequence_qualityType value) {
    @javax.annotation.Nullable com.fhir.Molecularsequence_qualityType newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        this.truthTP,
        this.queryFP,
        this.score,
        this.precision,
        this.id,
        newValue,
        this.fScore,
        this.truthFN,
        this.recall,
        this.roc,
        this.gtFP,
        this.method,
        this.modifierExtension,
        this.queryTP,
        this.end,
        this.start,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Quality withType(java.util.Optional<? extends com.fhir.Molecularsequence_qualityType> optional) {
    @javax.annotation.Nullable com.fhir.Molecularsequence_qualityType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        this.truthTP,
        this.queryFP,
        this.score,
        this.precision,
        this.id,
        value,
        this.fScore,
        this.truthFN,
        this.recall,
        this.roc,
        this.gtFP,
        this.method,
        this.modifierExtension,
        this.queryTP,
        this.end,
        this.start,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#fScore() fScore} attribute.
   * @param value The value for fScore
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withFScore(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "fScore");
    if (this.fScore == newValue) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        this.truthTP,
        this.queryFP,
        this.score,
        this.precision,
        this.id,
        this.type,
        newValue,
        this.truthFN,
        this.recall,
        this.roc,
        this.gtFP,
        this.method,
        this.modifierExtension,
        this.queryTP,
        this.end,
        this.start,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#fScore() fScore} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for fScore
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Quality withFScore(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.fScore == value) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        this.truthTP,
        this.queryFP,
        this.score,
        this.precision,
        this.id,
        this.type,
        value,
        this.truthFN,
        this.recall,
        this.roc,
        this.gtFP,
        this.method,
        this.modifierExtension,
        this.queryTP,
        this.end,
        this.start,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#truthFN() truthFN} attribute.
   * @param value The value for truthFN
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withTruthFN(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "truthFN");
    if (this.truthFN == newValue) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        this.truthTP,
        this.queryFP,
        this.score,
        this.precision,
        this.id,
        this.type,
        this.fScore,
        newValue,
        this.recall,
        this.roc,
        this.gtFP,
        this.method,
        this.modifierExtension,
        this.queryTP,
        this.end,
        this.start,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#truthFN() truthFN} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for truthFN
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Quality withTruthFN(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.truthFN == value) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        this.truthTP,
        this.queryFP,
        this.score,
        this.precision,
        this.id,
        this.type,
        this.fScore,
        value,
        this.recall,
        this.roc,
        this.gtFP,
        this.method,
        this.modifierExtension,
        this.queryTP,
        this.end,
        this.start,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#recall() recall} attribute.
   * @param value The value for recall
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withRecall(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "recall");
    if (this.recall == newValue) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        this.truthTP,
        this.queryFP,
        this.score,
        this.precision,
        this.id,
        this.type,
        this.fScore,
        this.truthFN,
        newValue,
        this.roc,
        this.gtFP,
        this.method,
        this.modifierExtension,
        this.queryTP,
        this.end,
        this.start,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#recall() recall} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for recall
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Quality withRecall(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.recall == value) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        this.truthTP,
        this.queryFP,
        this.score,
        this.precision,
        this.id,
        this.type,
        this.fScore,
        this.truthFN,
        value,
        this.roc,
        this.gtFP,
        this.method,
        this.modifierExtension,
        this.queryTP,
        this.end,
        this.start,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#roc() roc} attribute.
   * @param value The value for roc
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withRoc(com.fhir.MolecularSequence_Roc value) {
    @javax.annotation.Nullable com.fhir.MolecularSequence_Roc newValue = java.util.Objects.requireNonNull(value, "roc");
    if (this.roc == newValue) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        this.truthTP,
        this.queryFP,
        this.score,
        this.precision,
        this.id,
        this.type,
        this.fScore,
        this.truthFN,
        this.recall,
        newValue,
        this.gtFP,
        this.method,
        this.modifierExtension,
        this.queryTP,
        this.end,
        this.start,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#roc() roc} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for roc
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Quality withRoc(java.util.Optional<? extends com.fhir.MolecularSequence_Roc> optional) {
    @javax.annotation.Nullable com.fhir.MolecularSequence_Roc value = optional.orElse(null);
    if (this.roc == value) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        this.truthTP,
        this.queryFP,
        this.score,
        this.precision,
        this.id,
        this.type,
        this.fScore,
        this.truthFN,
        this.recall,
        value,
        this.gtFP,
        this.method,
        this.modifierExtension,
        this.queryTP,
        this.end,
        this.start,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#gtFP() gtFP} attribute.
   * @param value The value for gtFP
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withGtFP(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "gtFP");
    if (this.gtFP == newValue) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        this.truthTP,
        this.queryFP,
        this.score,
        this.precision,
        this.id,
        this.type,
        this.fScore,
        this.truthFN,
        this.recall,
        this.roc,
        newValue,
        this.method,
        this.modifierExtension,
        this.queryTP,
        this.end,
        this.start,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#gtFP() gtFP} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for gtFP
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Quality withGtFP(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.gtFP == value) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        this.truthTP,
        this.queryFP,
        this.score,
        this.precision,
        this.id,
        this.type,
        this.fScore,
        this.truthFN,
        this.recall,
        this.roc,
        value,
        this.method,
        this.modifierExtension,
        this.queryTP,
        this.end,
        this.start,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#method() method} attribute.
   * @param value The value for method
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withMethod(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "method");
    if (this.method == newValue) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        this.truthTP,
        this.queryFP,
        this.score,
        this.precision,
        this.id,
        this.type,
        this.fScore,
        this.truthFN,
        this.recall,
        this.roc,
        this.gtFP,
        newValue,
        this.modifierExtension,
        this.queryTP,
        this.end,
        this.start,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#method() method} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for method
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Quality withMethod(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.method == value) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        this.truthTP,
        this.queryFP,
        this.score,
        this.precision,
        this.id,
        this.type,
        this.fScore,
        this.truthFN,
        this.recall,
        this.roc,
        this.gtFP,
        value,
        this.modifierExtension,
        this.queryTP,
        this.end,
        this.start,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        this.truthTP,
        this.queryFP,
        this.score,
        this.precision,
        this.id,
        this.type,
        this.fScore,
        this.truthFN,
        this.recall,
        this.roc,
        this.gtFP,
        this.method,
        newValue,
        this.queryTP,
        this.end,
        this.start,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Quality withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        this.truthTP,
        this.queryFP,
        this.score,
        this.precision,
        this.id,
        this.type,
        this.fScore,
        this.truthFN,
        this.recall,
        this.roc,
        this.gtFP,
        this.method,
        value,
        this.queryTP,
        this.end,
        this.start,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#queryTP() queryTP} attribute.
   * @param value The value for queryTP
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withQueryTP(com.fhir.decimal value) {
    @javax.annotation.Nullable com.fhir.decimal newValue = java.util.Objects.requireNonNull(value, "queryTP");
    if (this.queryTP == newValue) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        this.truthTP,
        this.queryFP,
        this.score,
        this.precision,
        this.id,
        this.type,
        this.fScore,
        this.truthFN,
        this.recall,
        this.roc,
        this.gtFP,
        this.method,
        this.modifierExtension,
        newValue,
        this.end,
        this.start,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#queryTP() queryTP} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for queryTP
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Quality withQueryTP(java.util.Optional<? extends com.fhir.decimal> optional) {
    @javax.annotation.Nullable com.fhir.decimal value = optional.orElse(null);
    if (this.queryTP == value) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        this.truthTP,
        this.queryFP,
        this.score,
        this.precision,
        this.id,
        this.type,
        this.fScore,
        this.truthFN,
        this.recall,
        this.roc,
        this.gtFP,
        this.method,
        this.modifierExtension,
        value,
        this.end,
        this.start,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#end() end} attribute.
   * @param value The value for end
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withEnd(int value) {
    @javax.annotation.Nullable java.lang.Integer newValue = value;
    if (java.util.Objects.equals(this.end, newValue)) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        this.truthTP,
        this.queryFP,
        this.score,
        this.precision,
        this.id,
        this.type,
        this.fScore,
        this.truthFN,
        this.recall,
        this.roc,
        this.gtFP,
        this.method,
        this.modifierExtension,
        this.queryTP,
        newValue,
        this.start,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#end() end} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for end
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withEnd(java.util.Optional<java.lang.Integer> optional) {
    @javax.annotation.Nullable java.lang.Integer value = optional.orElse(null);
    if (java.util.Objects.equals(this.end, value)) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        this.truthTP,
        this.queryFP,
        this.score,
        this.precision,
        this.id,
        this.type,
        this.fScore,
        this.truthFN,
        this.recall,
        this.roc,
        this.gtFP,
        this.method,
        this.modifierExtension,
        this.queryTP,
        value,
        this.start,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#start() start} attribute.
   * @param value The value for start
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withStart(int value) {
    @javax.annotation.Nullable java.lang.Integer newValue = value;
    if (java.util.Objects.equals(this.start, newValue)) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        this.truthTP,
        this.queryFP,
        this.score,
        this.precision,
        this.id,
        this.type,
        this.fScore,
        this.truthFN,
        this.recall,
        this.roc,
        this.gtFP,
        this.method,
        this.modifierExtension,
        this.queryTP,
        this.end,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#start() start} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for start
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withStart(java.util.Optional<java.lang.Integer> optional) {
    @javax.annotation.Nullable java.lang.Integer value = optional.orElse(null);
    if (java.util.Objects.equals(this.start, value)) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        this.truthTP,
        this.queryFP,
        this.score,
        this.precision,
        this.id,
        this.type,
        this.fScore,
        this.truthFN,
        this.recall,
        this.roc,
        this.gtFP,
        this.method,
        this.modifierExtension,
        this.queryTP,
        this.end,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MolecularSequence_Quality#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMolecularSequence_Quality withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        this.truthTP,
        this.queryFP,
        this.score,
        this.precision,
        this.id,
        this.type,
        this.fScore,
        this.truthFN,
        this.recall,
        this.roc,
        this.gtFP,
        this.method,
        this.modifierExtension,
        this.queryTP,
        this.end,
        this.start,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MolecularSequence_Quality#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMolecularSequence_Quality withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMolecularSequence_Quality(
        this.standardSequence,
        this.truthTP,
        this.queryFP,
        this.score,
        this.precision,
        this.id,
        this.type,
        this.fScore,
        this.truthFN,
        this.recall,
        this.roc,
        this.gtFP,
        this.method,
        this.modifierExtension,
        this.queryTP,
        this.end,
        this.start,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMolecularSequence_Quality} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMolecularSequence_Quality
        && equalTo((ImmutableMolecularSequence_Quality) another);
  }

  private boolean equalTo(ImmutableMolecularSequence_Quality another) {
    return java.util.Objects.equals(standardSequence, another.standardSequence)
        && java.util.Objects.equals(truthTP, another.truthTP)
        && java.util.Objects.equals(queryFP, another.queryFP)
        && java.util.Objects.equals(score, another.score)
        && java.util.Objects.equals(precision, another.precision)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(fScore, another.fScore)
        && java.util.Objects.equals(truthFN, another.truthFN)
        && java.util.Objects.equals(recall, another.recall)
        && java.util.Objects.equals(roc, another.roc)
        && java.util.Objects.equals(gtFP, another.gtFP)
        && java.util.Objects.equals(method, another.method)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(queryTP, another.queryTP)
        && java.util.Objects.equals(end, another.end)
        && java.util.Objects.equals(start, another.start)
        && java.util.Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code standardSequence}, {@code truthTP}, {@code queryFP}, {@code score}, {@code precision}, {@code id}, {@code type}, {@code fScore}, {@code truthFN}, {@code recall}, {@code roc}, {@code gtFP}, {@code method}, {@code modifierExtension}, {@code queryTP}, {@code end}, {@code start}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(standardSequence);
    h += (h << 5) + java.util.Objects.hashCode(truthTP);
    h += (h << 5) + java.util.Objects.hashCode(queryFP);
    h += (h << 5) + java.util.Objects.hashCode(score);
    h += (h << 5) + java.util.Objects.hashCode(precision);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(fScore);
    h += (h << 5) + java.util.Objects.hashCode(truthFN);
    h += (h << 5) + java.util.Objects.hashCode(recall);
    h += (h << 5) + java.util.Objects.hashCode(roc);
    h += (h << 5) + java.util.Objects.hashCode(gtFP);
    h += (h << 5) + java.util.Objects.hashCode(method);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(queryTP);
    h += (h << 5) + java.util.Objects.hashCode(end);
    h += (h << 5) + java.util.Objects.hashCode(start);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code MolecularSequence_Quality} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("MolecularSequence_Quality{");
    if (standardSequence != null) {
      builder.append("standardSequence=").append(standardSequence);
    }
    if (truthTP != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("truthTP=").append(truthTP);
    }
    if (queryFP != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("queryFP=").append(queryFP);
    }
    if (score != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("score=").append(score);
    }
    if (precision != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("precision=").append(precision);
    }
    if (id != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (type != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (fScore != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("fScore=").append(fScore);
    }
    if (truthFN != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("truthFN=").append(truthFN);
    }
    if (recall != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("recall=").append(recall);
    }
    if (roc != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("roc=").append(roc);
    }
    if (gtFP != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("gtFP=").append(gtFP);
    }
    if (method != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("method=").append(method);
    }
    if (modifierExtension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (queryTP != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("queryTP=").append(queryTP);
    }
    if (end != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("end=").append(end);
    }
    if (start != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("start=").append(start);
    }
    if (extension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "MolecularSequence_Quality", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.MolecularSequence_Quality {
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> standardSequence = java.util.Optional.empty();
    boolean standardSequenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> truthTP = java.util.Optional.empty();
    boolean truthTPIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> queryFP = java.util.Optional.empty();
    boolean queryFPIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Quantity> score = java.util.Optional.empty();
    boolean scoreIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> precision = java.util.Optional.empty();
    boolean precisionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Molecularsequence_qualityType> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> fScore = java.util.Optional.empty();
    boolean fScoreIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> truthFN = java.util.Optional.empty();
    boolean truthFNIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> recall = java.util.Optional.empty();
    boolean recallIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.MolecularSequence_Roc> roc = java.util.Optional.empty();
    boolean rocIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> gtFP = java.util.Optional.empty();
    boolean gtFPIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> method = java.util.Optional.empty();
    boolean methodIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.decimal> queryTP = java.util.Optional.empty();
    boolean queryTPIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Integer> end = java.util.Optional.empty();
    boolean endIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Integer> start = java.util.Optional.empty();
    boolean startIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("standardSequence")
    public void setStandardSequence(java.util.Optional<com.fhir.CodeableConcept> standardSequence) {
      this.standardSequence = standardSequence;
      this.standardSequenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("truthTP")
    public void setTruthTP(java.util.Optional<com.fhir.decimal> truthTP) {
      this.truthTP = truthTP;
      this.truthTPIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("queryFP")
    public void setQueryFP(java.util.Optional<com.fhir.decimal> queryFP) {
      this.queryFP = queryFP;
      this.queryFPIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("score")
    public void setScore(java.util.Optional<com.fhir.Quantity> score) {
      this.score = score;
      this.scoreIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("precision")
    public void setPrecision(java.util.Optional<com.fhir.decimal> precision) {
      this.precision = precision;
      this.precisionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.Molecularsequence_qualityType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("fScore")
    public void setFScore(java.util.Optional<com.fhir.decimal> fScore) {
      this.fScore = fScore;
      this.fScoreIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("truthFN")
    public void setTruthFN(java.util.Optional<com.fhir.decimal> truthFN) {
      this.truthFN = truthFN;
      this.truthFNIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("recall")
    public void setRecall(java.util.Optional<com.fhir.decimal> recall) {
      this.recall = recall;
      this.recallIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("roc")
    public void setRoc(java.util.Optional<com.fhir.MolecularSequence_Roc> roc) {
      this.roc = roc;
      this.rocIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("gtFP")
    public void setGtFP(java.util.Optional<com.fhir.decimal> gtFP) {
      this.gtFP = gtFP;
      this.gtFPIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("method")
    public void setMethod(java.util.Optional<com.fhir.CodeableConcept> method) {
      this.method = method;
      this.methodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("queryTP")
    public void setQueryTP(java.util.Optional<com.fhir.decimal> queryTP) {
      this.queryTP = queryTP;
      this.queryTPIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("end")
    public void setEnd(java.util.Optional<java.lang.Integer> end) {
      this.end = end;
      this.endIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("start")
    public void setStart(java.util.Optional<java.lang.Integer> start) {
      this.start = start;
      this.startIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> standardSequence() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> truthTP() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> queryFP() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Quantity> score() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> precision() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Molecularsequence_qualityType> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> fScore() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> truthFN() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> recall() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.MolecularSequence_Roc> roc() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> gtFP() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> method() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.decimal> queryTP() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Integer> end() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Integer> start() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableMolecularSequence_Quality fromJson(Json json) {
    ImmutableMolecularSequence_Quality.Builder builder = ImmutableMolecularSequence_Quality.builder();
    if (json.standardSequenceIsSet) {
      builder.standardSequence(json.standardSequence);
    }
    if (json.truthTPIsSet) {
      builder.truthTP(json.truthTP);
    }
    if (json.queryFPIsSet) {
      builder.queryFP(json.queryFP);
    }
    if (json.scoreIsSet) {
      builder.score(json.score);
    }
    if (json.precisionIsSet) {
      builder.precision(json.precision);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.fScoreIsSet) {
      builder.fScore(json.fScore);
    }
    if (json.truthFNIsSet) {
      builder.truthFN(json.truthFN);
    }
    if (json.recallIsSet) {
      builder.recall(json.recall);
    }
    if (json.rocIsSet) {
      builder.roc(json.roc);
    }
    if (json.gtFPIsSet) {
      builder.gtFP(json.gtFP);
    }
    if (json.methodIsSet) {
      builder.method(json.method);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.queryTPIsSet) {
      builder.queryTP(json.queryTP);
    }
    if (json.endIsSet) {
      builder.end(json.end);
    }
    if (json.startIsSet) {
      builder.start(json.start);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
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
        .standardSequence(instance.standardSequence())
        .truthTP(instance.truthTP())
        .queryFP(instance.queryFP())
        .score(instance.score())
        .precision(instance.precision())
        .id(instance.id())
        .type(instance.type())
        .fScore(instance.fScore())
        .truthFN(instance.truthFN())
        .recall(instance.recall())
        .roc(instance.roc())
        .gtFP(instance.gtFP())
        .method(instance.method())
        .modifierExtension(instance.modifierExtension())
        .queryTP(instance.queryTP())
        .end(instance.end())
        .start(instance.start())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link MolecularSequence_Quality MolecularSequence_Quality}.
   * <pre>
   * ImmutableMolecularSequence_Quality.builder()
   *    .standardSequence(com.fhir.CodeableConcept) // optional {@link MolecularSequence_Quality#standardSequence() standardSequence}
   *    .truthTP(com.fhir.decimal) // optional {@link MolecularSequence_Quality#truthTP() truthTP}
   *    .queryFP(com.fhir.decimal) // optional {@link MolecularSequence_Quality#queryFP() queryFP}
   *    .score(com.fhir.Quantity) // optional {@link MolecularSequence_Quality#score() score}
   *    .precision(com.fhir.decimal) // optional {@link MolecularSequence_Quality#precision() precision}
   *    .id(String) // optional {@link MolecularSequence_Quality#id() id}
   *    .type(com.fhir.Molecularsequence_qualityType) // optional {@link MolecularSequence_Quality#type() type}
   *    .fScore(com.fhir.decimal) // optional {@link MolecularSequence_Quality#fScore() fScore}
   *    .truthFN(com.fhir.decimal) // optional {@link MolecularSequence_Quality#truthFN() truthFN}
   *    .recall(com.fhir.decimal) // optional {@link MolecularSequence_Quality#recall() recall}
   *    .roc(com.fhir.MolecularSequence_Roc) // optional {@link MolecularSequence_Quality#roc() roc}
   *    .gtFP(com.fhir.decimal) // optional {@link MolecularSequence_Quality#gtFP() gtFP}
   *    .method(com.fhir.CodeableConcept) // optional {@link MolecularSequence_Quality#method() method}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MolecularSequence_Quality#modifierExtension() modifierExtension}
   *    .queryTP(com.fhir.decimal) // optional {@link MolecularSequence_Quality#queryTP() queryTP}
   *    .end(Integer) // optional {@link MolecularSequence_Quality#end() end}
   *    .start(Integer) // optional {@link MolecularSequence_Quality#start() start}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MolecularSequence_Quality#extension() extension}
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
  @org.immutables.value.Generated(from = "MolecularSequence_Quality", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_STANDARD_SEQUENCE = 0x1L;
    private static final long OPT_BIT_TRUTH_T_P = 0x2L;
    private static final long OPT_BIT_QUERY_F_P = 0x4L;
    private static final long OPT_BIT_SCORE = 0x8L;
    private static final long OPT_BIT_PRECISION = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private static final long OPT_BIT_TYPE = 0x40L;
    private static final long OPT_BIT_F_SCORE = 0x80L;
    private static final long OPT_BIT_TRUTH_F_N = 0x100L;
    private static final long OPT_BIT_RECALL = 0x200L;
    private static final long OPT_BIT_ROC = 0x400L;
    private static final long OPT_BIT_GT_F_P = 0x800L;
    private static final long OPT_BIT_METHOD = 0x1000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2000L;
    private static final long OPT_BIT_QUERY_T_P = 0x4000L;
    private static final long OPT_BIT_END = 0x8000L;
    private static final long OPT_BIT_START = 0x10000L;
    private static final long OPT_BIT_EXTENSION = 0x20000L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.CodeableConcept standardSequence;
    private @javax.annotation.Nullable com.fhir.decimal truthTP;
    private @javax.annotation.Nullable com.fhir.decimal queryFP;
    private @javax.annotation.Nullable com.fhir.Quantity score;
    private @javax.annotation.Nullable com.fhir.decimal precision;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.Molecularsequence_qualityType type;
    private @javax.annotation.Nullable com.fhir.decimal fScore;
    private @javax.annotation.Nullable com.fhir.decimal truthFN;
    private @javax.annotation.Nullable com.fhir.decimal recall;
    private @javax.annotation.Nullable com.fhir.MolecularSequence_Roc roc;
    private @javax.annotation.Nullable com.fhir.decimal gtFP;
    private @javax.annotation.Nullable com.fhir.CodeableConcept method;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.decimal queryTP;
    private @javax.annotation.Nullable java.lang.Integer end;
    private @javax.annotation.Nullable java.lang.Integer start;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#standardSequence() standardSequence} to standardSequence.
     * @param standardSequence The value for standardSequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder standardSequence(com.fhir.CodeableConcept standardSequence) {
      checkNotIsSet(standardSequenceIsSet(), "standardSequence");
      this.standardSequence = java.util.Objects.requireNonNull(standardSequence, "standardSequence");
      optBits |= OPT_BIT_STANDARD_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#standardSequence() standardSequence} to standardSequence.
     * @param standardSequence The value for standardSequence
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("standardSequence")
    public final Builder standardSequence(java.util.Optional<? extends com.fhir.CodeableConcept> standardSequence) {
      checkNotIsSet(standardSequenceIsSet(), "standardSequence");
      this.standardSequence = standardSequence.orElse(null);
      optBits |= OPT_BIT_STANDARD_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#truthTP() truthTP} to truthTP.
     * @param truthTP The value for truthTP
     * @return {@code this} builder for chained invocation
     */
    public final Builder truthTP(com.fhir.decimal truthTP) {
      checkNotIsSet(truthTPIsSet(), "truthTP");
      this.truthTP = java.util.Objects.requireNonNull(truthTP, "truthTP");
      optBits |= OPT_BIT_TRUTH_T_P;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#truthTP() truthTP} to truthTP.
     * @param truthTP The value for truthTP
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("truthTP")
    public final Builder truthTP(java.util.Optional<? extends com.fhir.decimal> truthTP) {
      checkNotIsSet(truthTPIsSet(), "truthTP");
      this.truthTP = truthTP.orElse(null);
      optBits |= OPT_BIT_TRUTH_T_P;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#queryFP() queryFP} to queryFP.
     * @param queryFP The value for queryFP
     * @return {@code this} builder for chained invocation
     */
    public final Builder queryFP(com.fhir.decimal queryFP) {
      checkNotIsSet(queryFPIsSet(), "queryFP");
      this.queryFP = java.util.Objects.requireNonNull(queryFP, "queryFP");
      optBits |= OPT_BIT_QUERY_F_P;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#queryFP() queryFP} to queryFP.
     * @param queryFP The value for queryFP
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("queryFP")
    public final Builder queryFP(java.util.Optional<? extends com.fhir.decimal> queryFP) {
      checkNotIsSet(queryFPIsSet(), "queryFP");
      this.queryFP = queryFP.orElse(null);
      optBits |= OPT_BIT_QUERY_F_P;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#score() score} to score.
     * @param score The value for score
     * @return {@code this} builder for chained invocation
     */
    public final Builder score(com.fhir.Quantity score) {
      checkNotIsSet(scoreIsSet(), "score");
      this.score = java.util.Objects.requireNonNull(score, "score");
      optBits |= OPT_BIT_SCORE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#score() score} to score.
     * @param score The value for score
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("score")
    public final Builder score(java.util.Optional<? extends com.fhir.Quantity> score) {
      checkNotIsSet(scoreIsSet(), "score");
      this.score = score.orElse(null);
      optBits |= OPT_BIT_SCORE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#precision() precision} to precision.
     * @param precision The value for precision
     * @return {@code this} builder for chained invocation
     */
    public final Builder precision(com.fhir.decimal precision) {
      checkNotIsSet(precisionIsSet(), "precision");
      this.precision = java.util.Objects.requireNonNull(precision, "precision");
      optBits |= OPT_BIT_PRECISION;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#precision() precision} to precision.
     * @param precision The value for precision
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("precision")
    public final Builder precision(java.util.Optional<? extends com.fhir.decimal> precision) {
      checkNotIsSet(precisionIsSet(), "precision");
      this.precision = precision.orElse(null);
      optBits |= OPT_BIT_PRECISION;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#id() id} to id.
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
     * Initializes the optional value {@link MolecularSequence_Quality#id() id} to id.
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
     * Initializes the optional value {@link MolecularSequence_Quality#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.Molecularsequence_qualityType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.Molecularsequence_qualityType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#fScore() fScore} to fScore.
     * @param fScore The value for fScore
     * @return {@code this} builder for chained invocation
     */
    public final Builder fScore(com.fhir.decimal fScore) {
      checkNotIsSet(fScoreIsSet(), "fScore");
      this.fScore = java.util.Objects.requireNonNull(fScore, "fScore");
      optBits |= OPT_BIT_F_SCORE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#fScore() fScore} to fScore.
     * @param fScore The value for fScore
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("fScore")
    public final Builder fScore(java.util.Optional<? extends com.fhir.decimal> fScore) {
      checkNotIsSet(fScoreIsSet(), "fScore");
      this.fScore = fScore.orElse(null);
      optBits |= OPT_BIT_F_SCORE;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#truthFN() truthFN} to truthFN.
     * @param truthFN The value for truthFN
     * @return {@code this} builder for chained invocation
     */
    public final Builder truthFN(com.fhir.decimal truthFN) {
      checkNotIsSet(truthFNIsSet(), "truthFN");
      this.truthFN = java.util.Objects.requireNonNull(truthFN, "truthFN");
      optBits |= OPT_BIT_TRUTH_F_N;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#truthFN() truthFN} to truthFN.
     * @param truthFN The value for truthFN
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("truthFN")
    public final Builder truthFN(java.util.Optional<? extends com.fhir.decimal> truthFN) {
      checkNotIsSet(truthFNIsSet(), "truthFN");
      this.truthFN = truthFN.orElse(null);
      optBits |= OPT_BIT_TRUTH_F_N;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#recall() recall} to recall.
     * @param recall The value for recall
     * @return {@code this} builder for chained invocation
     */
    public final Builder recall(com.fhir.decimal recall) {
      checkNotIsSet(recallIsSet(), "recall");
      this.recall = java.util.Objects.requireNonNull(recall, "recall");
      optBits |= OPT_BIT_RECALL;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#recall() recall} to recall.
     * @param recall The value for recall
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("recall")
    public final Builder recall(java.util.Optional<? extends com.fhir.decimal> recall) {
      checkNotIsSet(recallIsSet(), "recall");
      this.recall = recall.orElse(null);
      optBits |= OPT_BIT_RECALL;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#roc() roc} to roc.
     * @param roc The value for roc
     * @return {@code this} builder for chained invocation
     */
    public final Builder roc(com.fhir.MolecularSequence_Roc roc) {
      checkNotIsSet(rocIsSet(), "roc");
      this.roc = java.util.Objects.requireNonNull(roc, "roc");
      optBits |= OPT_BIT_ROC;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#roc() roc} to roc.
     * @param roc The value for roc
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("roc")
    public final Builder roc(java.util.Optional<? extends com.fhir.MolecularSequence_Roc> roc) {
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
    public final Builder gtFP(com.fhir.decimal gtFP) {
      checkNotIsSet(gtFPIsSet(), "gtFP");
      this.gtFP = java.util.Objects.requireNonNull(gtFP, "gtFP");
      optBits |= OPT_BIT_GT_F_P;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#gtFP() gtFP} to gtFP.
     * @param gtFP The value for gtFP
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("gtFP")
    public final Builder gtFP(java.util.Optional<? extends com.fhir.decimal> gtFP) {
      checkNotIsSet(gtFPIsSet(), "gtFP");
      this.gtFP = gtFP.orElse(null);
      optBits |= OPT_BIT_GT_F_P;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for chained invocation
     */
    public final Builder method(com.fhir.CodeableConcept method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = java.util.Objects.requireNonNull(method, "method");
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("method")
    public final Builder method(java.util.Optional<? extends com.fhir.CodeableConcept> method) {
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
    public final Builder modifierExtension(java.util.List<com.fhir.Extension> modifierExtension) {
      checkNotIsSet(modifierExtensionIsSet(), "modifierExtension");
      this.modifierExtension = java.util.Objects.requireNonNull(modifierExtension, "modifierExtension");
      optBits |= OPT_BIT_MODIFIER_EXTENSION;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MolecularSequence_Quality#queryTP() queryTP} to queryTP.
     * @param queryTP The value for queryTP
     * @return {@code this} builder for chained invocation
     */
    public final Builder queryTP(com.fhir.decimal queryTP) {
      checkNotIsSet(queryTPIsSet(), "queryTP");
      this.queryTP = java.util.Objects.requireNonNull(queryTP, "queryTP");
      optBits |= OPT_BIT_QUERY_T_P;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#queryTP() queryTP} to queryTP.
     * @param queryTP The value for queryTP
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("queryTP")
    public final Builder queryTP(java.util.Optional<? extends com.fhir.decimal> queryTP) {
      checkNotIsSet(queryTPIsSet(), "queryTP");
      this.queryTP = queryTP.orElse(null);
      optBits |= OPT_BIT_QUERY_T_P;
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
    @com.fasterxml.jackson.annotation.JsonProperty("end")
    public final Builder end(java.util.Optional<java.lang.Integer> end) {
      checkNotIsSet(endIsSet(), "end");
      this.end = end.orElse(null);
      optBits |= OPT_BIT_END;
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
    @com.fasterxml.jackson.annotation.JsonProperty("start")
    public final Builder start(java.util.Optional<java.lang.Integer> start) {
      checkNotIsSet(startIsSet(), "start");
      this.start = start.orElse(null);
      optBits |= OPT_BIT_START;
      return this;
    }

    /**
     * Initializes the optional value {@link MolecularSequence_Quality#extension() extension} to extension.
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
     * Initializes the optional value {@link MolecularSequence_Quality#extension() extension} to extension.
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
     * Builds a new {@link MolecularSequence_Quality MolecularSequence_Quality}.
     * @return An immutable instance of MolecularSequence_Quality
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.MolecularSequence_Quality build() {
      return new ImmutableMolecularSequence_Quality(
          standardSequence,
          truthTP,
          queryFP,
          score,
          precision,
          id,
          type,
          fScore,
          truthFN,
          recall,
          roc,
          gtFP,
          method,
          modifierExtension,
          queryTP,
          end,
          start,
          extension);
    }

    private boolean standardSequenceIsSet() {
      return (optBits & OPT_BIT_STANDARD_SEQUENCE) != 0;
    }

    private boolean truthTPIsSet() {
      return (optBits & OPT_BIT_TRUTH_T_P) != 0;
    }

    private boolean queryFPIsSet() {
      return (optBits & OPT_BIT_QUERY_F_P) != 0;
    }

    private boolean scoreIsSet() {
      return (optBits & OPT_BIT_SCORE) != 0;
    }

    private boolean precisionIsSet() {
      return (optBits & OPT_BIT_PRECISION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean fScoreIsSet() {
      return (optBits & OPT_BIT_F_SCORE) != 0;
    }

    private boolean truthFNIsSet() {
      return (optBits & OPT_BIT_TRUTH_F_N) != 0;
    }

    private boolean recallIsSet() {
      return (optBits & OPT_BIT_RECALL) != 0;
    }

    private boolean rocIsSet() {
      return (optBits & OPT_BIT_ROC) != 0;
    }

    private boolean gtFPIsSet() {
      return (optBits & OPT_BIT_GT_F_P) != 0;
    }

    private boolean methodIsSet() {
      return (optBits & OPT_BIT_METHOD) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean queryTPIsSet() {
      return (optBits & OPT_BIT_QUERY_T_P) != 0;
    }

    private boolean endIsSet() {
      return (optBits & OPT_BIT_END) != 0;
    }

    private boolean startIsSet() {
      return (optBits & OPT_BIT_START) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of MolecularSequence_Quality is strict, attribute is already set: ".concat(name));
    }
  }
}

//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link ExplanationOfBenefit_Procedure}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExplanationOfBenefit_Procedure.builder()}.
 */
@org.immutables.value.Generated(from = "ExplanationOfBenefit_Procedure", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExplanationOfBenefit_Procedure implements com.fhir.ExplanationOfBenefit_Procedure {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> type;
  private final @javax.annotation.Nullable com.fhir.dateTime date;
  private final @javax.annotation.Nullable com.fhir.Reference procedureReference;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept procedureCodeableConcept;
  private final @javax.annotation.Nullable com.fhir.positiveInt sequence;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> udi;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

  private ImmutableExplanationOfBenefit_Procedure(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> type,
      @javax.annotation.Nullable com.fhir.dateTime date,
      @javax.annotation.Nullable com.fhir.Reference procedureReference,
      @javax.annotation.Nullable com.fhir.CodeableConcept procedureCodeableConcept,
      @javax.annotation.Nullable com.fhir.positiveInt sequence,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> udi,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension) {
    this.extension = extension;
    this.type = type;
    this.date = date;
    this.procedureReference = procedureReference;
    this.procedureCodeableConcept = procedureCodeableConcept;
    this.sequence = sequence;
    this.udi = udi;
    this.id = id;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code date} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("date")
  @Override
  public java.util.Optional<com.fhir.dateTime> date() {
    return java.util.Optional.ofNullable(date);
  }

  /**
   * @return The value of the {@code procedureReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("procedureReference")
  @Override
  public java.util.Optional<com.fhir.Reference> procedureReference() {
    return java.util.Optional.ofNullable(procedureReference);
  }

  /**
   * @return The value of the {@code procedureCodeableConcept} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("procedureCodeableConcept")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> procedureCodeableConcept() {
    return java.util.Optional.ofNullable(procedureCodeableConcept);
  }

  /**
   * @return The value of the {@code sequence} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sequence")
  @Override
  public java.util.Optional<com.fhir.positiveInt> sequence() {
    return java.util.Optional.ofNullable(sequence);
  }

  /**
   * @return The value of the {@code udi} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("udi")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> udi() {
    return java.util.Optional.ofNullable(udi);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Procedure#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Procedure withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        newValue,
        this.type,
        this.date,
        this.procedureReference,
        this.procedureCodeableConcept,
        this.sequence,
        this.udi,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Procedure#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Procedure withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        value,
        this.type,
        this.date,
        this.procedureReference,
        this.procedureCodeableConcept,
        this.sequence,
        this.udi,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Procedure#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Procedure withType(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        this.extension,
        newValue,
        this.date,
        this.procedureReference,
        this.procedureCodeableConcept,
        this.sequence,
        this.udi,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Procedure#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Procedure withType(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        this.extension,
        value,
        this.date,
        this.procedureReference,
        this.procedureCodeableConcept,
        this.sequence,
        this.udi,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Procedure#date() date} attribute.
   * @param value The value for date
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Procedure withDate(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "date");
    if (this.date == newValue) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        this.extension,
        this.type,
        newValue,
        this.procedureReference,
        this.procedureCodeableConcept,
        this.sequence,
        this.udi,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Procedure#date() date} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for date
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Procedure withDate(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.date == value) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        this.extension,
        this.type,
        value,
        this.procedureReference,
        this.procedureCodeableConcept,
        this.sequence,
        this.udi,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Procedure#procedureReference() procedureReference} attribute.
   * @param value The value for procedureReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Procedure withProcedureReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "procedureReference");
    if (this.procedureReference == newValue) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        this.extension,
        this.type,
        this.date,
        newValue,
        this.procedureCodeableConcept,
        this.sequence,
        this.udi,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Procedure#procedureReference() procedureReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for procedureReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Procedure withProcedureReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.procedureReference == value) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        this.extension,
        this.type,
        this.date,
        value,
        this.procedureCodeableConcept,
        this.sequence,
        this.udi,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Procedure#procedureCodeableConcept() procedureCodeableConcept} attribute.
   * @param value The value for procedureCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Procedure withProcedureCodeableConcept(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "procedureCodeableConcept");
    if (this.procedureCodeableConcept == newValue) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        this.extension,
        this.type,
        this.date,
        this.procedureReference,
        newValue,
        this.sequence,
        this.udi,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Procedure#procedureCodeableConcept() procedureCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for procedureCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Procedure withProcedureCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.procedureCodeableConcept == value) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        this.extension,
        this.type,
        this.date,
        this.procedureReference,
        value,
        this.sequence,
        this.udi,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Procedure#sequence() sequence} attribute.
   * @param value The value for sequence
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Procedure withSequence(com.fhir.positiveInt value) {
    @javax.annotation.Nullable com.fhir.positiveInt newValue = java.util.Objects.requireNonNull(value, "sequence");
    if (this.sequence == newValue) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        this.extension,
        this.type,
        this.date,
        this.procedureReference,
        this.procedureCodeableConcept,
        newValue,
        this.udi,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Procedure#sequence() sequence} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sequence
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Procedure withSequence(java.util.Optional<? extends com.fhir.positiveInt> optional) {
    @javax.annotation.Nullable com.fhir.positiveInt value = optional.orElse(null);
    if (this.sequence == value) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        this.extension,
        this.type,
        this.date,
        this.procedureReference,
        this.procedureCodeableConcept,
        value,
        this.udi,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Procedure#udi() udi} attribute.
   * @param value The value for udi
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Procedure withUdi(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "udi");
    if (this.udi == newValue) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        this.extension,
        this.type,
        this.date,
        this.procedureReference,
        this.procedureCodeableConcept,
        this.sequence,
        newValue,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Procedure#udi() udi} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for udi
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Procedure withUdi(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.udi == value) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        this.extension,
        this.type,
        this.date,
        this.procedureReference,
        this.procedureCodeableConcept,
        this.sequence,
        value,
        this.id,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Procedure#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Procedure withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        this.extension,
        this.type,
        this.date,
        this.procedureReference,
        this.procedureCodeableConcept,
        this.sequence,
        this.udi,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Procedure#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Procedure withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        this.extension,
        this.type,
        this.date,
        this.procedureReference,
        this.procedureCodeableConcept,
        this.sequence,
        this.udi,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExplanationOfBenefit_Procedure#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExplanationOfBenefit_Procedure withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        this.extension,
        this.type,
        this.date,
        this.procedureReference,
        this.procedureCodeableConcept,
        this.sequence,
        this.udi,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExplanationOfBenefit_Procedure#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExplanationOfBenefit_Procedure withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExplanationOfBenefit_Procedure(
        this.extension,
        this.type,
        this.date,
        this.procedureReference,
        this.procedureCodeableConcept,
        this.sequence,
        this.udi,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExplanationOfBenefit_Procedure} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExplanationOfBenefit_Procedure
        && equalTo((ImmutableExplanationOfBenefit_Procedure) another);
  }

  private boolean equalTo(ImmutableExplanationOfBenefit_Procedure another) {
    return java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(date, another.date)
        && java.util.Objects.equals(procedureReference, another.procedureReference)
        && java.util.Objects.equals(procedureCodeableConcept, another.procedureCodeableConcept)
        && java.util.Objects.equals(sequence, another.sequence)
        && java.util.Objects.equals(udi, another.udi)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code type}, {@code date}, {@code procedureReference}, {@code procedureCodeableConcept}, {@code sequence}, {@code udi}, {@code id}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(date);
    h += (h << 5) + java.util.Objects.hashCode(procedureReference);
    h += (h << 5) + java.util.Objects.hashCode(procedureCodeableConcept);
    h += (h << 5) + java.util.Objects.hashCode(sequence);
    h += (h << 5) + java.util.Objects.hashCode(udi);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code ExplanationOfBenefit_Procedure} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("ExplanationOfBenefit_Procedure{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (type != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (date != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("date=").append(date);
    }
    if (procedureReference != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("procedureReference=").append(procedureReference);
    }
    if (procedureCodeableConcept != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("procedureCodeableConcept=").append(procedureCodeableConcept);
    }
    if (sequence != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("sequence=").append(sequence);
    }
    if (udi != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("udi=").append(udi);
    }
    if (id != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("id=").append(id);
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
  @org.immutables.value.Generated(from = "ExplanationOfBenefit_Procedure", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.ExplanationOfBenefit_Procedure {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> date = java.util.Optional.empty();
    boolean dateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> procedureReference = java.util.Optional.empty();
    boolean procedureReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> procedureCodeableConcept = java.util.Optional.empty();
    boolean procedureCodeableConceptIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.positiveInt> sequence = java.util.Optional.empty();
    boolean sequenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> udi = java.util.Optional.empty();
    boolean udiIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public void setDate(java.util.Optional<com.fhir.dateTime> date) {
      this.date = date;
      this.dateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("procedureReference")
    public void setProcedureReference(java.util.Optional<com.fhir.Reference> procedureReference) {
      this.procedureReference = procedureReference;
      this.procedureReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("procedureCodeableConcept")
    public void setProcedureCodeableConcept(java.util.Optional<com.fhir.CodeableConcept> procedureCodeableConcept) {
      this.procedureCodeableConcept = procedureCodeableConcept;
      this.procedureCodeableConceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("sequence")
    public void setSequence(java.util.Optional<com.fhir.positiveInt> sequence) {
      this.sequence = sequence;
      this.sequenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("udi")
    public void setUdi(java.util.Optional<java.util.List<com.fhir.Reference>> udi) {
      this.udi = udi;
      this.udiIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> date() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> procedureReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> procedureCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.positiveInt> sequence() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> udi() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableExplanationOfBenefit_Procedure fromJson(Json json) {
    ImmutableExplanationOfBenefit_Procedure.Builder builder = ImmutableExplanationOfBenefit_Procedure.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.dateIsSet) {
      builder.date(json.date);
    }
    if (json.procedureReferenceIsSet) {
      builder.procedureReference(json.procedureReference);
    }
    if (json.procedureCodeableConceptIsSet) {
      builder.procedureCodeableConcept(json.procedureCodeableConcept);
    }
    if (json.sequenceIsSet) {
      builder.sequence(json.sequence);
    }
    if (json.udiIsSet) {
      builder.udi(json.udi);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableExplanationOfBenefit_Procedure) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ExplanationOfBenefit_Procedure} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ExplanationOfBenefit_Procedure instance
   */
  public static ExplanationOfBenefit_Procedure copyOf(ExplanationOfBenefit_Procedure instance) {
    if (instance instanceof ImmutableExplanationOfBenefit_Procedure) {
      return (ImmutableExplanationOfBenefit_Procedure) instance;
    }
    return ImmutableExplanationOfBenefit_Procedure.builder()
        .extension(instance.extension())
        .type(instance.type())
        .date(instance.date())
        .procedureReference(instance.procedureReference())
        .procedureCodeableConcept(instance.procedureCodeableConcept())
        .sequence(instance.sequence())
        .udi(instance.udi())
        .id(instance.id())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link ExplanationOfBenefit_Procedure ExplanationOfBenefit_Procedure}.
   * <pre>
   * ImmutableExplanationOfBenefit_Procedure.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_Procedure#extension() extension}
   *    .type(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link ExplanationOfBenefit_Procedure#type() type}
   *    .date(com.fhir.dateTime) // optional {@link ExplanationOfBenefit_Procedure#date() date}
   *    .procedureReference(com.fhir.Reference) // optional {@link ExplanationOfBenefit_Procedure#procedureReference() procedureReference}
   *    .procedureCodeableConcept(com.fhir.CodeableConcept) // optional {@link ExplanationOfBenefit_Procedure#procedureCodeableConcept() procedureCodeableConcept}
   *    .sequence(com.fhir.positiveInt) // optional {@link ExplanationOfBenefit_Procedure#sequence() sequence}
   *    .udi(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link ExplanationOfBenefit_Procedure#udi() udi}
   *    .id(String) // optional {@link ExplanationOfBenefit_Procedure#id() id}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link ExplanationOfBenefit_Procedure#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new ExplanationOfBenefit_Procedure builder
   */
  public static ImmutableExplanationOfBenefit_Procedure.Builder builder() {
    return new ImmutableExplanationOfBenefit_Procedure.Builder();
  }

  /**
   * Builds instances of type {@link ExplanationOfBenefit_Procedure ExplanationOfBenefit_Procedure}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "ExplanationOfBenefit_Procedure", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_TYPE = 0x2L;
    private static final long OPT_BIT_DATE = 0x4L;
    private static final long OPT_BIT_PROCEDURE_REFERENCE = 0x8L;
    private static final long OPT_BIT_PROCEDURE_CODEABLE_CONCEPT = 0x10L;
    private static final long OPT_BIT_SEQUENCE = 0x20L;
    private static final long OPT_BIT_UDI = 0x40L;
    private static final long OPT_BIT_ID = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> type;
    private @javax.annotation.Nullable com.fhir.dateTime date;
    private @javax.annotation.Nullable com.fhir.Reference procedureReference;
    private @javax.annotation.Nullable com.fhir.CodeableConcept procedureCodeableConcept;
    private @javax.annotation.Nullable com.fhir.positiveInt sequence;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> udi;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#extension() extension} to extension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(java.util.List<com.fhir.CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for chained invocation
     */
    public final Builder date(com.fhir.dateTime date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = java.util.Objects.requireNonNull(date, "date");
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#date() date} to date.
     * @param date The value for date
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("date")
    public final Builder date(java.util.Optional<? extends com.fhir.dateTime> date) {
      checkNotIsSet(dateIsSet(), "date");
      this.date = date.orElse(null);
      optBits |= OPT_BIT_DATE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#procedureReference() procedureReference} to procedureReference.
     * @param procedureReference The value for procedureReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder procedureReference(com.fhir.Reference procedureReference) {
      checkNotIsSet(procedureReferenceIsSet(), "procedureReference");
      this.procedureReference = java.util.Objects.requireNonNull(procedureReference, "procedureReference");
      optBits |= OPT_BIT_PROCEDURE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#procedureReference() procedureReference} to procedureReference.
     * @param procedureReference The value for procedureReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("procedureReference")
    public final Builder procedureReference(java.util.Optional<? extends com.fhir.Reference> procedureReference) {
      checkNotIsSet(procedureReferenceIsSet(), "procedureReference");
      this.procedureReference = procedureReference.orElse(null);
      optBits |= OPT_BIT_PROCEDURE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#procedureCodeableConcept() procedureCodeableConcept} to procedureCodeableConcept.
     * @param procedureCodeableConcept The value for procedureCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder procedureCodeableConcept(com.fhir.CodeableConcept procedureCodeableConcept) {
      checkNotIsSet(procedureCodeableConceptIsSet(), "procedureCodeableConcept");
      this.procedureCodeableConcept = java.util.Objects.requireNonNull(procedureCodeableConcept, "procedureCodeableConcept");
      optBits |= OPT_BIT_PROCEDURE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#procedureCodeableConcept() procedureCodeableConcept} to procedureCodeableConcept.
     * @param procedureCodeableConcept The value for procedureCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("procedureCodeableConcept")
    public final Builder procedureCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> procedureCodeableConcept) {
      checkNotIsSet(procedureCodeableConceptIsSet(), "procedureCodeableConcept");
      this.procedureCodeableConcept = procedureCodeableConcept.orElse(null);
      optBits |= OPT_BIT_PROCEDURE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for chained invocation
     */
    public final Builder sequence(com.fhir.positiveInt sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = java.util.Objects.requireNonNull(sequence, "sequence");
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#sequence() sequence} to sequence.
     * @param sequence The value for sequence
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sequence")
    public final Builder sequence(java.util.Optional<? extends com.fhir.positiveInt> sequence) {
      checkNotIsSet(sequenceIsSet(), "sequence");
      this.sequence = sequence.orElse(null);
      optBits |= OPT_BIT_SEQUENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#udi() udi} to udi.
     * @param udi The value for udi
     * @return {@code this} builder for chained invocation
     */
    public final Builder udi(java.util.List<com.fhir.Reference> udi) {
      checkNotIsSet(udiIsSet(), "udi");
      this.udi = java.util.Objects.requireNonNull(udi, "udi");
      optBits |= OPT_BIT_UDI;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#udi() udi} to udi.
     * @param udi The value for udi
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("udi")
    public final Builder udi(java.util.Optional<? extends java.util.List<com.fhir.Reference>> udi) {
      checkNotIsSet(udiIsSet(), "udi");
      this.udi = udi.orElse(null);
      optBits |= OPT_BIT_UDI;
      return this;
    }

    /**
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#id() id} to id.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExplanationOfBenefit_Procedure#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link ExplanationOfBenefit_Procedure ExplanationOfBenefit_Procedure}.
     * @return An immutable instance of ExplanationOfBenefit_Procedure
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.ExplanationOfBenefit_Procedure build() {
      return new ImmutableExplanationOfBenefit_Procedure(
          extension,
          type,
          date,
          procedureReference,
          procedureCodeableConcept,
          sequence,
          udi,
          id,
          modifierExtension);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean dateIsSet() {
      return (optBits & OPT_BIT_DATE) != 0;
    }

    private boolean procedureReferenceIsSet() {
      return (optBits & OPT_BIT_PROCEDURE_REFERENCE) != 0;
    }

    private boolean procedureCodeableConceptIsSet() {
      return (optBits & OPT_BIT_PROCEDURE_CODEABLE_CONCEPT) != 0;
    }

    private boolean sequenceIsSet() {
      return (optBits & OPT_BIT_SEQUENCE) != 0;
    }

    private boolean udiIsSet() {
      return (optBits & OPT_BIT_UDI) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of ExplanationOfBenefit_Procedure is strict, attribute is already set: ".concat(name));
    }
  }
}

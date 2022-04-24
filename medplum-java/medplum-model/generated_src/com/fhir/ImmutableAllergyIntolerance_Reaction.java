//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link AllergyIntolerance_Reaction}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAllergyIntolerance_Reaction.builder()}.
 */
@org.immutables.value.Generated(from = "AllergyIntolerance_Reaction", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableAllergyIntolerance_Reaction implements com.fhir.AllergyIntolerance_Reaction {
  private final @javax.annotation.Nullable java.lang.String id;
  private final java.util.List<com.fhir.CodeableConcept> manifestation;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept substance;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept exposureRoute;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
  private final @javax.annotation.Nullable java.lang.String description;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Allergyintolerance_reactionSeverity severity;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.dateTime onset;

  private ImmutableAllergyIntolerance_Reaction(
      @javax.annotation.Nullable java.lang.String id,
      java.util.List<com.fhir.CodeableConcept> manifestation,
      @javax.annotation.Nullable com.fhir.CodeableConcept substance,
      @javax.annotation.Nullable com.fhir.CodeableConcept exposureRoute,
      @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note,
      @javax.annotation.Nullable java.lang.String description,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Allergyintolerance_reactionSeverity severity,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.dateTime onset) {
    this.id = id;
    this.manifestation = manifestation;
    this.substance = substance;
    this.exposureRoute = exposureRoute;
    this.note = note;
    this.description = description;
    this.extension = extension;
    this.severity = severity;
    this.modifierExtension = modifierExtension;
    this.onset = onset;
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
   * @return The value of the {@code manifestation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("manifestation")
  @Override
  public java.util.List<com.fhir.CodeableConcept> manifestation() {
    return manifestation;
  }

  /**
   * @return The value of the {@code substance} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("substance")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> substance() {
    return java.util.Optional.ofNullable(substance);
  }

  /**
   * @return The value of the {@code exposureRoute} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("exposureRoute")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> exposureRoute() {
    return java.util.Optional.ofNullable(exposureRoute);
  }

  /**
   * @return The value of the {@code note} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("note")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Annotation>> note() {
    return java.util.Optional.ofNullable(note);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("description")
  @Override
  public java.util.Optional<java.lang.String> description() {
    return java.util.Optional.ofNullable(description);
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
   * @return The value of the {@code severity} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("severity")
  @Override
  public java.util.Optional<com.fhir.Allergyintolerance_reactionSeverity> severity() {
    return java.util.Optional.ofNullable(severity);
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
   * @return The value of the {@code onset} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("onset")
  @Override
  public java.util.Optional<com.fhir.dateTime> onset() {
    return java.util.Optional.ofNullable(onset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance_Reaction#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance_Reaction withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        newValue,
        this.manifestation,
        this.substance,
        this.exposureRoute,
        this.note,
        this.description,
        this.extension,
        this.severity,
        this.modifierExtension,
        this.onset);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance_Reaction#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance_Reaction withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        value,
        this.manifestation,
        this.substance,
        this.exposureRoute,
        this.note,
        this.description,
        this.extension,
        this.severity,
        this.modifierExtension,
        this.onset);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AllergyIntolerance_Reaction#manifestation() manifestation}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance_Reaction withManifestation(com.fhir.CodeableConcept... elements) {
    java.util.List<com.fhir.CodeableConcept> newValue = createUnmodifiableList(false, createSafeList(java.util.Arrays.asList(elements), true, false));
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        newValue,
        this.substance,
        this.exposureRoute,
        this.note,
        this.description,
        this.extension,
        this.severity,
        this.modifierExtension,
        this.onset);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AllergyIntolerance_Reaction#manifestation() manifestation}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of manifestation elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance_Reaction withManifestation(Iterable<? extends com.fhir.CodeableConcept> elements) {
    if (this.manifestation == elements) return this;
    java.util.List<com.fhir.CodeableConcept> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        newValue,
        this.substance,
        this.exposureRoute,
        this.note,
        this.description,
        this.extension,
        this.severity,
        this.modifierExtension,
        this.onset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance_Reaction#substance() substance} attribute.
   * @param value The value for substance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance_Reaction withSubstance(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "substance");
    if (this.substance == newValue) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        this.manifestation,
        newValue,
        this.exposureRoute,
        this.note,
        this.description,
        this.extension,
        this.severity,
        this.modifierExtension,
        this.onset);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance_Reaction#substance() substance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for substance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance_Reaction withSubstance(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.substance == value) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        this.manifestation,
        value,
        this.exposureRoute,
        this.note,
        this.description,
        this.extension,
        this.severity,
        this.modifierExtension,
        this.onset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance_Reaction#exposureRoute() exposureRoute} attribute.
   * @param value The value for exposureRoute
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance_Reaction withExposureRoute(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "exposureRoute");
    if (this.exposureRoute == newValue) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        this.manifestation,
        this.substance,
        newValue,
        this.note,
        this.description,
        this.extension,
        this.severity,
        this.modifierExtension,
        this.onset);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance_Reaction#exposureRoute() exposureRoute} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for exposureRoute
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance_Reaction withExposureRoute(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.exposureRoute == value) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        this.manifestation,
        this.substance,
        value,
        this.note,
        this.description,
        this.extension,
        this.severity,
        this.modifierExtension,
        this.onset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance_Reaction#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance_Reaction withNote(java.util.List<com.fhir.Annotation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> newValue = java.util.Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        this.manifestation,
        this.substance,
        this.exposureRoute,
        newValue,
        this.description,
        this.extension,
        this.severity,
        this.modifierExtension,
        this.onset);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance_Reaction#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance_Reaction withNote(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        this.manifestation,
        this.substance,
        this.exposureRoute,
        value,
        this.description,
        this.extension,
        this.severity,
        this.modifierExtension,
        this.onset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance_Reaction#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance_Reaction withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        this.manifestation,
        this.substance,
        this.exposureRoute,
        this.note,
        newValue,
        this.extension,
        this.severity,
        this.modifierExtension,
        this.onset);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance_Reaction#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance_Reaction withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        this.manifestation,
        this.substance,
        this.exposureRoute,
        this.note,
        value,
        this.extension,
        this.severity,
        this.modifierExtension,
        this.onset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance_Reaction#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance_Reaction withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        this.manifestation,
        this.substance,
        this.exposureRoute,
        this.note,
        this.description,
        newValue,
        this.severity,
        this.modifierExtension,
        this.onset);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance_Reaction#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance_Reaction withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        this.manifestation,
        this.substance,
        this.exposureRoute,
        this.note,
        this.description,
        value,
        this.severity,
        this.modifierExtension,
        this.onset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance_Reaction#severity() severity} attribute.
   * @param value The value for severity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance_Reaction withSeverity(com.fhir.Allergyintolerance_reactionSeverity value) {
    @javax.annotation.Nullable com.fhir.Allergyintolerance_reactionSeverity newValue = java.util.Objects.requireNonNull(value, "severity");
    if (this.severity == newValue) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        this.manifestation,
        this.substance,
        this.exposureRoute,
        this.note,
        this.description,
        this.extension,
        newValue,
        this.modifierExtension,
        this.onset);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance_Reaction#severity() severity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for severity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance_Reaction withSeverity(java.util.Optional<? extends com.fhir.Allergyintolerance_reactionSeverity> optional) {
    @javax.annotation.Nullable com.fhir.Allergyintolerance_reactionSeverity value = optional.orElse(null);
    if (this.severity == value) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        this.manifestation,
        this.substance,
        this.exposureRoute,
        this.note,
        this.description,
        this.extension,
        value,
        this.modifierExtension,
        this.onset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance_Reaction#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance_Reaction withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        this.manifestation,
        this.substance,
        this.exposureRoute,
        this.note,
        this.description,
        this.extension,
        this.severity,
        newValue,
        this.onset);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance_Reaction#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance_Reaction withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        this.manifestation,
        this.substance,
        this.exposureRoute,
        this.note,
        this.description,
        this.extension,
        this.severity,
        value,
        this.onset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance_Reaction#onset() onset} attribute.
   * @param value The value for onset
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance_Reaction withOnset(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "onset");
    if (this.onset == newValue) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        this.manifestation,
        this.substance,
        this.exposureRoute,
        this.note,
        this.description,
        this.extension,
        this.severity,
        this.modifierExtension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance_Reaction#onset() onset} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onset
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance_Reaction withOnset(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.onset == value) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        this.manifestation,
        this.substance,
        this.exposureRoute,
        this.note,
        this.description,
        this.extension,
        this.severity,
        this.modifierExtension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAllergyIntolerance_Reaction} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAllergyIntolerance_Reaction
        && equalTo((ImmutableAllergyIntolerance_Reaction) another);
  }

  private boolean equalTo(ImmutableAllergyIntolerance_Reaction another) {
    return java.util.Objects.equals(id, another.id)
        && manifestation.equals(another.manifestation)
        && java.util.Objects.equals(substance, another.substance)
        && java.util.Objects.equals(exposureRoute, another.exposureRoute)
        && java.util.Objects.equals(note, another.note)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(severity, another.severity)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(onset, another.onset);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code manifestation}, {@code substance}, {@code exposureRoute}, {@code note}, {@code description}, {@code extension}, {@code severity}, {@code modifierExtension}, {@code onset}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + manifestation.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(substance);
    h += (h << 5) + java.util.Objects.hashCode(exposureRoute);
    h += (h << 5) + java.util.Objects.hashCode(note);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(severity);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(onset);
    return h;
  }

  /**
   * Prints the immutable value {@code AllergyIntolerance_Reaction} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("AllergyIntolerance_Reaction{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (builder.length() > 28) builder.append(", ");
    builder.append("manifestation=").append(manifestation);
    if (substance != null) {
      builder.append(", ");
      builder.append("substance=").append(substance);
    }
    if (exposureRoute != null) {
      builder.append(", ");
      builder.append("exposureRoute=").append(exposureRoute);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (severity != null) {
      builder.append(", ");
      builder.append("severity=").append(severity);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (onset != null) {
      builder.append(", ");
      builder.append("onset=").append(onset);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "AllergyIntolerance_Reaction", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.AllergyIntolerance_Reaction {
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> manifestation = java.util.Collections.emptyList();
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> substance = java.util.Optional.empty();
    boolean substanceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> exposureRoute = java.util.Optional.empty();
    boolean exposureRouteIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Annotation>> note = java.util.Optional.empty();
    boolean noteIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Allergyintolerance_reactionSeverity> severity = java.util.Optional.empty();
    boolean severityIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> onset = java.util.Optional.empty();
    boolean onsetIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("manifestation")
    public void setManifestation(java.util.List<com.fhir.CodeableConcept> manifestation) {
      this.manifestation = manifestation;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("substance")
    public void setSubstance(java.util.Optional<com.fhir.CodeableConcept> substance) {
      this.substance = substance;
      this.substanceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("exposureRoute")
    public void setExposureRoute(java.util.Optional<com.fhir.CodeableConcept> exposureRoute) {
      this.exposureRoute = exposureRoute;
      this.exposureRouteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public void setNote(java.util.Optional<java.util.List<com.fhir.Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public void setDescription(java.util.Optional<java.lang.String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    public void setSeverity(java.util.Optional<com.fhir.Allergyintolerance_reactionSeverity> severity) {
      this.severity = severity;
      this.severityIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("onset")
    public void setOnset(java.util.Optional<com.fhir.dateTime> onset) {
      this.onset = onset;
      this.onsetIsSet = true;
    }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.List<com.fhir.CodeableConcept> manifestation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> substance() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> exposureRoute() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Allergyintolerance_reactionSeverity> severity() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> onset() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableAllergyIntolerance_Reaction fromJson(Json json) {
    ImmutableAllergyIntolerance_Reaction.Builder builder = ImmutableAllergyIntolerance_Reaction.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.manifestation != null) {
      builder.addAllManifestation(json.manifestation);
    }
    if (json.substanceIsSet) {
      builder.substance(json.substance);
    }
    if (json.exposureRouteIsSet) {
      builder.exposureRoute(json.exposureRoute);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.severityIsSet) {
      builder.severity(json.severity);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.onsetIsSet) {
      builder.onset(json.onset);
    }
    return (ImmutableAllergyIntolerance_Reaction) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AllergyIntolerance_Reaction} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AllergyIntolerance_Reaction instance
   */
  public static AllergyIntolerance_Reaction copyOf(AllergyIntolerance_Reaction instance) {
    if (instance instanceof ImmutableAllergyIntolerance_Reaction) {
      return (ImmutableAllergyIntolerance_Reaction) instance;
    }
    return ImmutableAllergyIntolerance_Reaction.builder()
        .id(instance.id())
        .addAllManifestation(instance.manifestation())
        .substance(instance.substance())
        .exposureRoute(instance.exposureRoute())
        .note(instance.note())
        .description(instance.description())
        .extension(instance.extension())
        .severity(instance.severity())
        .modifierExtension(instance.modifierExtension())
        .onset(instance.onset())
        .build();
  }

  /**
   * Creates a builder for {@link AllergyIntolerance_Reaction AllergyIntolerance_Reaction}.
   * <pre>
   * ImmutableAllergyIntolerance_Reaction.builder()
   *    .id(String) // optional {@link AllergyIntolerance_Reaction#id() id}
   *    .addManifestation|addAllManifestation(com.fhir.CodeableConcept) // {@link AllergyIntolerance_Reaction#manifestation() manifestation} elements
   *    .substance(com.fhir.CodeableConcept) // optional {@link AllergyIntolerance_Reaction#substance() substance}
   *    .exposureRoute(com.fhir.CodeableConcept) // optional {@link AllergyIntolerance_Reaction#exposureRoute() exposureRoute}
   *    .note(List&amp;lt;com.fhir.Annotation&amp;gt;) // optional {@link AllergyIntolerance_Reaction#note() note}
   *    .description(String) // optional {@link AllergyIntolerance_Reaction#description() description}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link AllergyIntolerance_Reaction#extension() extension}
   *    .severity(com.fhir.Allergyintolerance_reactionSeverity) // optional {@link AllergyIntolerance_Reaction#severity() severity}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link AllergyIntolerance_Reaction#modifierExtension() modifierExtension}
   *    .onset(com.fhir.dateTime) // optional {@link AllergyIntolerance_Reaction#onset() onset}
   *    .build();
   * </pre>
   * @return A new AllergyIntolerance_Reaction builder
   */
  public static ImmutableAllergyIntolerance_Reaction.Builder builder() {
    return new ImmutableAllergyIntolerance_Reaction.Builder();
  }

  /**
   * Builds instances of type {@link AllergyIntolerance_Reaction AllergyIntolerance_Reaction}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "AllergyIntolerance_Reaction", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_SUBSTANCE = 0x2L;
    private static final long OPT_BIT_EXPOSURE_ROUTE = 0x4L;
    private static final long OPT_BIT_NOTE = 0x8L;
    private static final long OPT_BIT_DESCRIPTION = 0x10L;
    private static final long OPT_BIT_EXTENSION = 0x20L;
    private static final long OPT_BIT_SEVERITY = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_ONSET = 0x100L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String id;
    private final java.util.List<com.fhir.CodeableConcept> manifestation = new java.util.ArrayList<com.fhir.CodeableConcept>();
    private @javax.annotation.Nullable com.fhir.CodeableConcept substance;
    private @javax.annotation.Nullable com.fhir.CodeableConcept exposureRoute;
    private @javax.annotation.Nullable java.util.List<com.fhir.Annotation> note;
    private @javax.annotation.Nullable java.lang.String description;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Allergyintolerance_reactionSeverity severity;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.dateTime onset;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance_Reaction#id() id} to id.
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
     * Initializes the optional value {@link AllergyIntolerance_Reaction#id() id} to id.
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
     * Adds one element to {@link AllergyIntolerance_Reaction#manifestation() manifestation} list.
     * @param element A manifestation element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addManifestation(com.fhir.CodeableConcept element) {
      this.manifestation.add(java.util.Objects.requireNonNull(element, "manifestation element"));
      return this;
    }

    /**
     * Adds elements to {@link AllergyIntolerance_Reaction#manifestation() manifestation} list.
     * @param elements An array of manifestation elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addManifestation(com.fhir.CodeableConcept... elements) {
      for (com.fhir.CodeableConcept element : elements) {
        this.manifestation.add(java.util.Objects.requireNonNull(element, "manifestation element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link AllergyIntolerance_Reaction#manifestation() manifestation} list.
     * @param elements An iterable of manifestation elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllManifestation(Iterable<? extends com.fhir.CodeableConcept> elements) {
      for (com.fhir.CodeableConcept element : elements) {
        this.manifestation.add(java.util.Objects.requireNonNull(element, "manifestation element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance_Reaction#substance() substance} to substance.
     * @param substance The value for substance
     * @return {@code this} builder for chained invocation
     */
    public final Builder substance(com.fhir.CodeableConcept substance) {
      checkNotIsSet(substanceIsSet(), "substance");
      this.substance = java.util.Objects.requireNonNull(substance, "substance");
      optBits |= OPT_BIT_SUBSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance_Reaction#substance() substance} to substance.
     * @param substance The value for substance
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("substance")
    public final Builder substance(java.util.Optional<? extends com.fhir.CodeableConcept> substance) {
      checkNotIsSet(substanceIsSet(), "substance");
      this.substance = substance.orElse(null);
      optBits |= OPT_BIT_SUBSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance_Reaction#exposureRoute() exposureRoute} to exposureRoute.
     * @param exposureRoute The value for exposureRoute
     * @return {@code this} builder for chained invocation
     */
    public final Builder exposureRoute(com.fhir.CodeableConcept exposureRoute) {
      checkNotIsSet(exposureRouteIsSet(), "exposureRoute");
      this.exposureRoute = java.util.Objects.requireNonNull(exposureRoute, "exposureRoute");
      optBits |= OPT_BIT_EXPOSURE_ROUTE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance_Reaction#exposureRoute() exposureRoute} to exposureRoute.
     * @param exposureRoute The value for exposureRoute
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("exposureRoute")
    public final Builder exposureRoute(java.util.Optional<? extends com.fhir.CodeableConcept> exposureRoute) {
      checkNotIsSet(exposureRouteIsSet(), "exposureRoute");
      this.exposureRoute = exposureRoute.orElse(null);
      optBits |= OPT_BIT_EXPOSURE_ROUTE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance_Reaction#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    public final Builder note(java.util.List<com.fhir.Annotation> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = java.util.Objects.requireNonNull(note, "note");
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance_Reaction#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("note")
    public final Builder note(java.util.Optional<? extends java.util.List<com.fhir.Annotation>> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = note.orElse(null);
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance_Reaction#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(java.lang.String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = java.util.Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance_Reaction#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    public final Builder description(java.util.Optional<java.lang.String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance_Reaction#extension() extension} to extension.
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
     * Initializes the optional value {@link AllergyIntolerance_Reaction#extension() extension} to extension.
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
     * Initializes the optional value {@link AllergyIntolerance_Reaction#severity() severity} to severity.
     * @param severity The value for severity
     * @return {@code this} builder for chained invocation
     */
    public final Builder severity(com.fhir.Allergyintolerance_reactionSeverity severity) {
      checkNotIsSet(severityIsSet(), "severity");
      this.severity = java.util.Objects.requireNonNull(severity, "severity");
      optBits |= OPT_BIT_SEVERITY;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance_Reaction#severity() severity} to severity.
     * @param severity The value for severity
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    public final Builder severity(java.util.Optional<? extends com.fhir.Allergyintolerance_reactionSeverity> severity) {
      checkNotIsSet(severityIsSet(), "severity");
      this.severity = severity.orElse(null);
      optBits |= OPT_BIT_SEVERITY;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance_Reaction#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link AllergyIntolerance_Reaction#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link AllergyIntolerance_Reaction#onset() onset} to onset.
     * @param onset The value for onset
     * @return {@code this} builder for chained invocation
     */
    public final Builder onset(com.fhir.dateTime onset) {
      checkNotIsSet(onsetIsSet(), "onset");
      this.onset = java.util.Objects.requireNonNull(onset, "onset");
      optBits |= OPT_BIT_ONSET;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance_Reaction#onset() onset} to onset.
     * @param onset The value for onset
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("onset")
    public final Builder onset(java.util.Optional<? extends com.fhir.dateTime> onset) {
      checkNotIsSet(onsetIsSet(), "onset");
      this.onset = onset.orElse(null);
      optBits |= OPT_BIT_ONSET;
      return this;
    }

    /**
     * Builds a new {@link AllergyIntolerance_Reaction AllergyIntolerance_Reaction}.
     * @return An immutable instance of AllergyIntolerance_Reaction
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.AllergyIntolerance_Reaction build() {
      return new ImmutableAllergyIntolerance_Reaction(
          id,
          createUnmodifiableList(true, manifestation),
          substance,
          exposureRoute,
          note,
          description,
          extension,
          severity,
          modifierExtension,
          onset);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean substanceIsSet() {
      return (optBits & OPT_BIT_SUBSTANCE) != 0;
    }

    private boolean exposureRouteIsSet() {
      return (optBits & OPT_BIT_EXPOSURE_ROUTE) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean severityIsSet() {
      return (optBits & OPT_BIT_SEVERITY) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean onsetIsSet() {
      return (optBits & OPT_BIT_ONSET) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of AllergyIntolerance_Reaction is strict, attribute is already set: ".concat(name));
    }
  }

  private static <T> java.util.List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    java.util.ArrayList<T> list;
    if (iterable instanceof java.util.Collection<?>) {
      int size = ((java.util.Collection<?>) iterable).size();
      if (size == 0) return java.util.Collections.emptyList();
      list = new java.util.ArrayList<>();
    } else {
      list = new java.util.ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) java.util.Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> java.util.List<T> createUnmodifiableList(boolean clone, java.util.List<T> list) {
    switch(list.size()) {
    case 0: return java.util.Collections.emptyList();
    case 1: return java.util.Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return java.util.Collections.unmodifiableList(new java.util.ArrayList<>(list));
      } else {
        if (list instanceof java.util.ArrayList<?>) {
          ((java.util.ArrayList<?>) list).trimToSize();
        }
        return java.util.Collections.unmodifiableList(list);
      }
    }
  }
}

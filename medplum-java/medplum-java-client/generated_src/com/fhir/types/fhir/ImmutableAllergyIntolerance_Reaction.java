package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link AllergyIntolerance_Reaction}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAllergyIntolerance_Reaction.builder()}.
 */
@Generated(from = "AllergyIntolerance_Reaction", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableAllergyIntolerance_Reaction
    implements AllergyIntolerance_Reaction {
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable DateTime onset;
  private final @Nullable CodeableConcept substance;
  private final List<CodeableConcept> manifestation;
  private final @Nullable Allergyintolerance_ReactionSeverity severity;
  private final @Nullable CodeableConcept exposureRoute;
  private final @Nullable List<Annotation> note;
  private final @Nullable String description;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableAllergyIntolerance_Reaction(
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable DateTime onset,
      @Nullable CodeableConcept substance,
      List<CodeableConcept> manifestation,
      @Nullable Allergyintolerance_ReactionSeverity severity,
      @Nullable CodeableConcept exposureRoute,
      @Nullable List<Annotation> note,
      @Nullable String description,
      @Nullable List<Extension> modifierExtension) {
    this.id = id;
    this.extension = extension;
    this.onset = onset;
    this.substance = substance;
    this.manifestation = manifestation;
    this.severity = severity;
    this.exposureRoute = exposureRoute;
    this.note = note;
    this.description = description;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code onset} attribute
   */
  @JsonProperty("onset")
  @Override
  public Optional<DateTime> onset() {
    return Optional.ofNullable(onset);
  }

  /**
   * @return The value of the {@code substance} attribute
   */
  @JsonProperty("substance")
  @Override
  public Optional<CodeableConcept> substance() {
    return Optional.ofNullable(substance);
  }

  /**
   * @return The value of the {@code manifestation} attribute
   */
  @JsonProperty("manifestation")
  @Override
  public List<CodeableConcept> manifestation() {
    return manifestation;
  }

  /**
   * @return The value of the {@code severity} attribute
   */
  @JsonProperty("severity")
  @Override
  public Optional<Allergyintolerance_ReactionSeverity> severity() {
    return Optional.ofNullable(severity);
  }

  /**
   * @return The value of the {@code exposureRoute} attribute
   */
  @JsonProperty("exposureRoute")
  @Override
  public Optional<CodeableConcept> exposureRoute() {
    return Optional.ofNullable(exposureRoute);
  }

  /**
   * @return The value of the {@code note} attribute
   */
  @JsonProperty("note")
  @Override
  public Optional<List<Annotation>> note() {
    return Optional.ofNullable(note);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance_Reaction#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance_Reaction withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        newValue,
        this.extension,
        this.onset,
        this.substance,
        this.manifestation,
        this.severity,
        this.exposureRoute,
        this.note,
        this.description,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance_Reaction#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance_Reaction withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        value,
        this.extension,
        this.onset,
        this.substance,
        this.manifestation,
        this.severity,
        this.exposureRoute,
        this.note,
        this.description,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance_Reaction#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance_Reaction withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        newValue,
        this.onset,
        this.substance,
        this.manifestation,
        this.severity,
        this.exposureRoute,
        this.note,
        this.description,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance_Reaction#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance_Reaction withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        value,
        this.onset,
        this.substance,
        this.manifestation,
        this.severity,
        this.exposureRoute,
        this.note,
        this.description,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance_Reaction#onset() onset} attribute.
   * @param value The value for onset
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance_Reaction withOnset(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "onset");
    if (this.onset == newValue) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        this.extension,
        newValue,
        this.substance,
        this.manifestation,
        this.severity,
        this.exposureRoute,
        this.note,
        this.description,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance_Reaction#onset() onset} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for onset
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance_Reaction withOnset(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.onset == value) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        this.extension,
        value,
        this.substance,
        this.manifestation,
        this.severity,
        this.exposureRoute,
        this.note,
        this.description,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance_Reaction#substance() substance} attribute.
   * @param value The value for substance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance_Reaction withSubstance(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "substance");
    if (this.substance == newValue) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        this.extension,
        this.onset,
        newValue,
        this.manifestation,
        this.severity,
        this.exposureRoute,
        this.note,
        this.description,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance_Reaction#substance() substance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for substance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance_Reaction withSubstance(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.substance == value) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        this.extension,
        this.onset,
        value,
        this.manifestation,
        this.severity,
        this.exposureRoute,
        this.note,
        this.description,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AllergyIntolerance_Reaction#manifestation() manifestation}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance_Reaction withManifestation(CodeableConcept... elements) {
    List<CodeableConcept> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        this.extension,
        this.onset,
        this.substance,
        newValue,
        this.severity,
        this.exposureRoute,
        this.note,
        this.description,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link AllergyIntolerance_Reaction#manifestation() manifestation}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of manifestation elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance_Reaction withManifestation(Iterable<? extends CodeableConcept> elements) {
    if (this.manifestation == elements) return this;
    List<CodeableConcept> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        this.extension,
        this.onset,
        this.substance,
        newValue,
        this.severity,
        this.exposureRoute,
        this.note,
        this.description,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance_Reaction#severity() severity} attribute.
   * @param value The value for severity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance_Reaction withSeverity(Allergyintolerance_ReactionSeverity value) {
    @Nullable Allergyintolerance_ReactionSeverity newValue = Objects.requireNonNull(value, "severity");
    if (this.severity == newValue) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        this.extension,
        this.onset,
        this.substance,
        this.manifestation,
        newValue,
        this.exposureRoute,
        this.note,
        this.description,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance_Reaction#severity() severity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for severity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance_Reaction withSeverity(Optional<? extends Allergyintolerance_ReactionSeverity> optional) {
    @Nullable Allergyintolerance_ReactionSeverity value = optional.orElse(null);
    if (this.severity == value) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        this.extension,
        this.onset,
        this.substance,
        this.manifestation,
        value,
        this.exposureRoute,
        this.note,
        this.description,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance_Reaction#exposureRoute() exposureRoute} attribute.
   * @param value The value for exposureRoute
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance_Reaction withExposureRoute(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "exposureRoute");
    if (this.exposureRoute == newValue) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        this.extension,
        this.onset,
        this.substance,
        this.manifestation,
        this.severity,
        newValue,
        this.note,
        this.description,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance_Reaction#exposureRoute() exposureRoute} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for exposureRoute
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance_Reaction withExposureRoute(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.exposureRoute == value) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        this.extension,
        this.onset,
        this.substance,
        this.manifestation,
        this.severity,
        value,
        this.note,
        this.description,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance_Reaction#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance_Reaction withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        this.extension,
        this.onset,
        this.substance,
        this.manifestation,
        this.severity,
        this.exposureRoute,
        newValue,
        this.description,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance_Reaction#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance_Reaction withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        this.extension,
        this.onset,
        this.substance,
        this.manifestation,
        this.severity,
        this.exposureRoute,
        value,
        this.description,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance_Reaction#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance_Reaction withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        this.extension,
        this.onset,
        this.substance,
        this.manifestation,
        this.severity,
        this.exposureRoute,
        this.note,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance_Reaction#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance_Reaction withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        this.extension,
        this.onset,
        this.substance,
        this.manifestation,
        this.severity,
        this.exposureRoute,
        this.note,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AllergyIntolerance_Reaction#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAllergyIntolerance_Reaction withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        this.extension,
        this.onset,
        this.substance,
        this.manifestation,
        this.severity,
        this.exposureRoute,
        this.note,
        this.description,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AllergyIntolerance_Reaction#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAllergyIntolerance_Reaction withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableAllergyIntolerance_Reaction(
        this.id,
        this.extension,
        this.onset,
        this.substance,
        this.manifestation,
        this.severity,
        this.exposureRoute,
        this.note,
        this.description,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAllergyIntolerance_Reaction} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAllergyIntolerance_Reaction
        && equalTo((ImmutableAllergyIntolerance_Reaction) another);
  }

  private boolean equalTo(ImmutableAllergyIntolerance_Reaction another) {
    return Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(onset, another.onset)
        && Objects.equals(substance, another.substance)
        && manifestation.equals(another.manifestation)
        && Objects.equals(severity, another.severity)
        && Objects.equals(exposureRoute, another.exposureRoute)
        && Objects.equals(note, another.note)
        && Objects.equals(description, another.description)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code extension}, {@code onset}, {@code substance}, {@code manifestation}, {@code severity}, {@code exposureRoute}, {@code note}, {@code description}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(onset);
    h += (h << 5) + Objects.hashCode(substance);
    h += (h << 5) + manifestation.hashCode();
    h += (h << 5) + Objects.hashCode(severity);
    h += (h << 5) + Objects.hashCode(exposureRoute);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code AllergyIntolerance_Reaction} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("AllergyIntolerance_Reaction{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (onset != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("onset=").append(onset);
    }
    if (substance != null) {
      if (builder.length() > 28) builder.append(", ");
      builder.append("substance=").append(substance);
    }
    if (builder.length() > 28) builder.append(", ");
    builder.append("manifestation=").append(manifestation);
    if (severity != null) {
      builder.append(", ");
      builder.append("severity=").append(severity);
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
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "AllergyIntolerance_Reaction", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AllergyIntolerance_Reaction {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<DateTime> onset = Optional.empty();
    boolean onsetIsSet;
    @Nullable Optional<CodeableConcept> substance = Optional.empty();
    boolean substanceIsSet;
    @Nullable List<CodeableConcept> manifestation = Collections.emptyList();
    @Nullable Optional<Allergyintolerance_ReactionSeverity> severity = Optional.empty();
    boolean severityIsSet;
    @Nullable Optional<CodeableConcept> exposureRoute = Optional.empty();
    boolean exposureRouteIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
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
    @JsonProperty("onset")
    public void setOnset(Optional<DateTime> onset) {
      this.onset = onset;
      this.onsetIsSet = true;
    }
    @JsonProperty("substance")
    public void setSubstance(Optional<CodeableConcept> substance) {
      this.substance = substance;
      this.substanceIsSet = true;
    }
    @JsonProperty("manifestation")
    public void setManifestation(List<CodeableConcept> manifestation) {
      this.manifestation = manifestation;
    }
    @JsonProperty("severity")
    public void setSeverity(Optional<Allergyintolerance_ReactionSeverity> severity) {
      this.severity = severity;
      this.severityIsSet = true;
    }
    @JsonProperty("exposureRoute")
    public void setExposureRoute(Optional<CodeableConcept> exposureRoute) {
      this.exposureRoute = exposureRoute;
      this.exposureRouteIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> onset() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> substance() { throw new UnsupportedOperationException(); }
    @Override
    public List<CodeableConcept> manifestation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Allergyintolerance_ReactionSeverity> severity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> exposureRoute() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAllergyIntolerance_Reaction fromJson(Json json) {
    ImmutableAllergyIntolerance_Reaction.Builder builder = ImmutableAllergyIntolerance_Reaction.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.onsetIsSet) {
      builder.onset(json.onset);
    }
    if (json.substanceIsSet) {
      builder.substance(json.substance);
    }
    if (json.manifestation != null) {
      builder.addAllManifestation(json.manifestation);
    }
    if (json.severityIsSet) {
      builder.severity(json.severity);
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
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
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
        .extension(instance.extension())
        .onset(instance.onset())
        .substance(instance.substance())
        .addAllManifestation(instance.manifestation())
        .severity(instance.severity())
        .exposureRoute(instance.exposureRoute())
        .note(instance.note())
        .description(instance.description())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link AllergyIntolerance_Reaction AllergyIntolerance_Reaction}.
   * <pre>
   * ImmutableAllergyIntolerance_Reaction.builder()
   *    .id(String) // optional {@link AllergyIntolerance_Reaction#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link AllergyIntolerance_Reaction#extension() extension}
   *    .onset(com.fhir.types.fhir.DateTime) // optional {@link AllergyIntolerance_Reaction#onset() onset}
   *    .substance(com.fhir.types.fhir.CodeableConcept) // optional {@link AllergyIntolerance_Reaction#substance() substance}
   *    .addManifestation|addAllManifestation(com.fhir.types.fhir.CodeableConcept) // {@link AllergyIntolerance_Reaction#manifestation() manifestation} elements
   *    .severity(Allergyintolerance_ReactionSeverity) // optional {@link AllergyIntolerance_Reaction#severity() severity}
   *    .exposureRoute(com.fhir.types.fhir.CodeableConcept) // optional {@link AllergyIntolerance_Reaction#exposureRoute() exposureRoute}
   *    .note(List&amp;lt;com.fhir.types.fhir.Annotation&amp;gt;) // optional {@link AllergyIntolerance_Reaction#note() note}
   *    .description(String) // optional {@link AllergyIntolerance_Reaction#description() description}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link AllergyIntolerance_Reaction#modifierExtension() modifierExtension}
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
  @Generated(from = "AllergyIntolerance_Reaction", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_ONSET = 0x4L;
    private static final long OPT_BIT_SUBSTANCE = 0x8L;
    private static final long OPT_BIT_SEVERITY = 0x10L;
    private static final long OPT_BIT_EXPOSURE_ROUTE = 0x20L;
    private static final long OPT_BIT_NOTE = 0x40L;
    private static final long OPT_BIT_DESCRIPTION = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private long optBits;

    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable DateTime onset;
    private @Nullable CodeableConcept substance;
    private final List<CodeableConcept> manifestation = new ArrayList<CodeableConcept>();
    private @Nullable Allergyintolerance_ReactionSeverity severity;
    private @Nullable CodeableConcept exposureRoute;
    private @Nullable List<Annotation> note;
    private @Nullable String description;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance_Reaction#id() id} to id.
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
     * Initializes the optional value {@link AllergyIntolerance_Reaction#id() id} to id.
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
     * Initializes the optional value {@link AllergyIntolerance_Reaction#extension() extension} to extension.
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
     * Initializes the optional value {@link AllergyIntolerance_Reaction#extension() extension} to extension.
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
     * Initializes the optional value {@link AllergyIntolerance_Reaction#onset() onset} to onset.
     * @param onset The value for onset
     * @return {@code this} builder for chained invocation
     */
    public final Builder onset(DateTime onset) {
      checkNotIsSet(onsetIsSet(), "onset");
      this.onset = Objects.requireNonNull(onset, "onset");
      optBits |= OPT_BIT_ONSET;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance_Reaction#onset() onset} to onset.
     * @param onset The value for onset
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("onset")
    public final Builder onset(Optional<? extends DateTime> onset) {
      checkNotIsSet(onsetIsSet(), "onset");
      this.onset = onset.orElse(null);
      optBits |= OPT_BIT_ONSET;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance_Reaction#substance() substance} to substance.
     * @param substance The value for substance
     * @return {@code this} builder for chained invocation
     */
    public final Builder substance(CodeableConcept substance) {
      checkNotIsSet(substanceIsSet(), "substance");
      this.substance = Objects.requireNonNull(substance, "substance");
      optBits |= OPT_BIT_SUBSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance_Reaction#substance() substance} to substance.
     * @param substance The value for substance
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("substance")
    public final Builder substance(Optional<? extends CodeableConcept> substance) {
      checkNotIsSet(substanceIsSet(), "substance");
      this.substance = substance.orElse(null);
      optBits |= OPT_BIT_SUBSTANCE;
      return this;
    }

    /**
     * Adds one element to {@link AllergyIntolerance_Reaction#manifestation() manifestation} list.
     * @param element A manifestation element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addManifestation(CodeableConcept element) {
      this.manifestation.add(Objects.requireNonNull(element, "manifestation element"));
      return this;
    }

    /**
     * Adds elements to {@link AllergyIntolerance_Reaction#manifestation() manifestation} list.
     * @param elements An array of manifestation elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addManifestation(CodeableConcept... elements) {
      for (CodeableConcept element : elements) {
        this.manifestation.add(Objects.requireNonNull(element, "manifestation element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link AllergyIntolerance_Reaction#manifestation() manifestation} list.
     * @param elements An iterable of manifestation elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllManifestation(Iterable<? extends CodeableConcept> elements) {
      for (CodeableConcept element : elements) {
        this.manifestation.add(Objects.requireNonNull(element, "manifestation element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance_Reaction#severity() severity} to severity.
     * @param severity The value for severity
     * @return {@code this} builder for chained invocation
     */
    public final Builder severity(Allergyintolerance_ReactionSeverity severity) {
      checkNotIsSet(severityIsSet(), "severity");
      this.severity = Objects.requireNonNull(severity, "severity");
      optBits |= OPT_BIT_SEVERITY;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance_Reaction#severity() severity} to severity.
     * @param severity The value for severity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("severity")
    public final Builder severity(Optional<? extends Allergyintolerance_ReactionSeverity> severity) {
      checkNotIsSet(severityIsSet(), "severity");
      this.severity = severity.orElse(null);
      optBits |= OPT_BIT_SEVERITY;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance_Reaction#exposureRoute() exposureRoute} to exposureRoute.
     * @param exposureRoute The value for exposureRoute
     * @return {@code this} builder for chained invocation
     */
    public final Builder exposureRoute(CodeableConcept exposureRoute) {
      checkNotIsSet(exposureRouteIsSet(), "exposureRoute");
      this.exposureRoute = Objects.requireNonNull(exposureRoute, "exposureRoute");
      optBits |= OPT_BIT_EXPOSURE_ROUTE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance_Reaction#exposureRoute() exposureRoute} to exposureRoute.
     * @param exposureRoute The value for exposureRoute
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("exposureRoute")
    public final Builder exposureRoute(Optional<? extends CodeableConcept> exposureRoute) {
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
    public final Builder note(List<Annotation> note) {
      checkNotIsSet(noteIsSet(), "note");
      this.note = Objects.requireNonNull(note, "note");
      optBits |= OPT_BIT_NOTE;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance_Reaction#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("note")
    public final Builder note(Optional<? extends List<Annotation>> note) {
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
    public final Builder description(String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance_Reaction#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link AllergyIntolerance_Reaction#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link AllergyIntolerance_Reaction#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link AllergyIntolerance_Reaction AllergyIntolerance_Reaction}.
     * @return An immutable instance of AllergyIntolerance_Reaction
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public AllergyIntolerance_Reaction build() {
      return new ImmutableAllergyIntolerance_Reaction(
          id,
          extension,
          onset,
          substance,
          createUnmodifiableList(true, manifestation),
          severity,
          exposureRoute,
          note,
          description,
          modifierExtension);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean onsetIsSet() {
      return (optBits & OPT_BIT_ONSET) != 0;
    }

    private boolean substanceIsSet() {
      return (optBits & OPT_BIT_SUBSTANCE) != 0;
    }

    private boolean severityIsSet() {
      return (optBits & OPT_BIT_SEVERITY) != 0;
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

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of AllergyIntolerance_Reaction is strict, attribute is already set: ".concat(name));
    }
  }

  private static <T> List<T> createSafeList(Iterable<? extends T> iterable, boolean checkNulls, boolean skipNulls) {
    ArrayList<T> list;
    if (iterable instanceof Collection<?>) {
      int size = ((Collection<?>) iterable).size();
      if (size == 0) return Collections.emptyList();
      list = new ArrayList<>();
    } else {
      list = new ArrayList<>();
    }
    for (T element : iterable) {
      if (skipNulls && element == null) continue;
      if (checkNulls) Objects.requireNonNull(element, "element");
      list.add(element);
    }
    return list;
  }

  private static <T> List<T> createUnmodifiableList(boolean clone, List<T> list) {
    switch(list.size()) {
    case 0: return Collections.emptyList();
    case 1: return Collections.singletonList(list.get(0));
    default:
      if (clone) {
        return Collections.unmodifiableList(new ArrayList<>(list));
      } else {
        if (list instanceof ArrayList<?>) {
          ((ArrayList<?>) list).trimToSize();
        }
        return Collections.unmodifiableList(list);
      }
    }
  }
}

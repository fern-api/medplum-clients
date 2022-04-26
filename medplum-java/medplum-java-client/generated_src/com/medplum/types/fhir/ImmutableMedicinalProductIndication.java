package com.medplum.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link MedicinalProductIndication}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProductIndication.builder()}.
 */
@Generated(from = "MedicinalProductIndication", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProductIndication
    implements MedicinalProductIndication {
  private final @Nullable CodeableConcept diseaseStatus;
  private final @Nullable List<Extension> extension;
  private final @Nullable CodeableConcept diseaseSymptomProcedure;
  private final @Nullable Quantity duration;
  private final @Nullable List<MedicinalProductIndication_OtherTherapy> otherTherapy;
  private final @Nullable List<Reference> subject;
  private final @Nullable Narrative text;
  private final String resourceType;
  private final @Nullable Meta meta;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<Reference> undesirableEffect;
  private final @Nullable Code language;
  private final @Nullable List<Population> population;
  private final @Nullable Id id;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<CodeableConcept> comorbidity;
  private final @Nullable CodeableConcept intendedEffect;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableMedicinalProductIndication(
      @Nullable CodeableConcept diseaseStatus,
      @Nullable List<Extension> extension,
      @Nullable CodeableConcept diseaseSymptomProcedure,
      @Nullable Quantity duration,
      @Nullable List<MedicinalProductIndication_OtherTherapy> otherTherapy,
      @Nullable List<Reference> subject,
      @Nullable Narrative text,
      String resourceType,
      @Nullable Meta meta,
      @Nullable Uri implicitRules,
      @Nullable List<Reference> undesirableEffect,
      @Nullable Code language,
      @Nullable List<Population> population,
      @Nullable Id id,
      @Nullable List<ResourceList> contained,
      @Nullable List<CodeableConcept> comorbidity,
      @Nullable CodeableConcept intendedEffect,
      @Nullable List<Extension> modifierExtension) {
    this.diseaseStatus = diseaseStatus;
    this.extension = extension;
    this.diseaseSymptomProcedure = diseaseSymptomProcedure;
    this.duration = duration;
    this.otherTherapy = otherTherapy;
    this.subject = subject;
    this.text = text;
    this.resourceType = resourceType;
    this.meta = meta;
    this.implicitRules = implicitRules;
    this.undesirableEffect = undesirableEffect;
    this.language = language;
    this.population = population;
    this.id = id;
    this.contained = contained;
    this.comorbidity = comorbidity;
    this.intendedEffect = intendedEffect;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code diseaseStatus} attribute
   */
  @JsonProperty("diseaseStatus")
  @Override
  public Optional<CodeableConcept> diseaseStatus() {
    return Optional.ofNullable(diseaseStatus);
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
   * @return The value of the {@code diseaseSymptomProcedure} attribute
   */
  @JsonProperty("diseaseSymptomProcedure")
  @Override
  public Optional<CodeableConcept> diseaseSymptomProcedure() {
    return Optional.ofNullable(diseaseSymptomProcedure);
  }

  /**
   * @return The value of the {@code duration} attribute
   */
  @JsonProperty("duration")
  @Override
  public Optional<Quantity> duration() {
    return Optional.ofNullable(duration);
  }

  /**
   * @return The value of the {@code otherTherapy} attribute
   */
  @JsonProperty("otherTherapy")
  @Override
  public Optional<List<MedicinalProductIndication_OtherTherapy>> otherTherapy() {
    return Optional.ofNullable(otherTherapy);
  }

  /**
   * @return The value of the {@code subject} attribute
   */
  @JsonProperty("subject")
  @Override
  public Optional<List<Reference>> subject() {
    return Optional.ofNullable(subject);
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code undesirableEffect} attribute
   */
  @JsonProperty("undesirableEffect")
  @Override
  public Optional<List<Reference>> undesirableEffect() {
    return Optional.ofNullable(undesirableEffect);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @JsonProperty("language")
  @Override
  public Optional<Code> language() {
    return Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code population} attribute
   */
  @JsonProperty("population")
  @Override
  public Optional<List<Population>> population() {
    return Optional.ofNullable(population);
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code comorbidity} attribute
   */
  @JsonProperty("comorbidity")
  @Override
  public Optional<List<CodeableConcept>> comorbidity() {
    return Optional.ofNullable(comorbidity);
  }

  /**
   * @return The value of the {@code intendedEffect} attribute
   */
  @JsonProperty("intendedEffect")
  @Override
  public Optional<CodeableConcept> intendedEffect() {
    return Optional.ofNullable(intendedEffect);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#diseaseStatus() diseaseStatus} attribute.
   * @param value The value for diseaseStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withDiseaseStatus(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "diseaseStatus");
    if (this.diseaseStatus == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        newValue,
        this.extension,
        this.diseaseSymptomProcedure,
        this.duration,
        this.otherTherapy,
        this.subject,
        this.text,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.undesirableEffect,
        this.language,
        this.population,
        this.id,
        this.contained,
        this.comorbidity,
        this.intendedEffect,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#diseaseStatus() diseaseStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for diseaseStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withDiseaseStatus(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.diseaseStatus == value) return this;
    return new ImmutableMedicinalProductIndication(
        value,
        this.extension,
        this.diseaseSymptomProcedure,
        this.duration,
        this.otherTherapy,
        this.subject,
        this.text,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.undesirableEffect,
        this.language,
        this.population,
        this.id,
        this.contained,
        this.comorbidity,
        this.intendedEffect,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        newValue,
        this.diseaseSymptomProcedure,
        this.duration,
        this.otherTherapy,
        this.subject,
        this.text,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.undesirableEffect,
        this.language,
        this.population,
        this.id,
        this.contained,
        this.comorbidity,
        this.intendedEffect,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        value,
        this.diseaseSymptomProcedure,
        this.duration,
        this.otherTherapy,
        this.subject,
        this.text,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.undesirableEffect,
        this.language,
        this.population,
        this.id,
        this.contained,
        this.comorbidity,
        this.intendedEffect,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#diseaseSymptomProcedure() diseaseSymptomProcedure} attribute.
   * @param value The value for diseaseSymptomProcedure
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withDiseaseSymptomProcedure(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "diseaseSymptomProcedure");
    if (this.diseaseSymptomProcedure == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        this.extension,
        newValue,
        this.duration,
        this.otherTherapy,
        this.subject,
        this.text,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.undesirableEffect,
        this.language,
        this.population,
        this.id,
        this.contained,
        this.comorbidity,
        this.intendedEffect,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#diseaseSymptomProcedure() diseaseSymptomProcedure} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for diseaseSymptomProcedure
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withDiseaseSymptomProcedure(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.diseaseSymptomProcedure == value) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        this.extension,
        value,
        this.duration,
        this.otherTherapy,
        this.subject,
        this.text,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.undesirableEffect,
        this.language,
        this.population,
        this.id,
        this.contained,
        this.comorbidity,
        this.intendedEffect,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#duration() duration} attribute.
   * @param value The value for duration
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withDuration(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "duration");
    if (this.duration == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        this.extension,
        this.diseaseSymptomProcedure,
        newValue,
        this.otherTherapy,
        this.subject,
        this.text,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.undesirableEffect,
        this.language,
        this.population,
        this.id,
        this.contained,
        this.comorbidity,
        this.intendedEffect,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#duration() duration} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for duration
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withDuration(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.duration == value) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        this.extension,
        this.diseaseSymptomProcedure,
        value,
        this.otherTherapy,
        this.subject,
        this.text,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.undesirableEffect,
        this.language,
        this.population,
        this.id,
        this.contained,
        this.comorbidity,
        this.intendedEffect,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#otherTherapy() otherTherapy} attribute.
   * @param value The value for otherTherapy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withOtherTherapy(List<MedicinalProductIndication_OtherTherapy> value) {
    @Nullable List<MedicinalProductIndication_OtherTherapy> newValue = Objects.requireNonNull(value, "otherTherapy");
    if (this.otherTherapy == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        this.extension,
        this.diseaseSymptomProcedure,
        this.duration,
        newValue,
        this.subject,
        this.text,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.undesirableEffect,
        this.language,
        this.population,
        this.id,
        this.contained,
        this.comorbidity,
        this.intendedEffect,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#otherTherapy() otherTherapy} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for otherTherapy
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withOtherTherapy(Optional<? extends List<MedicinalProductIndication_OtherTherapy>> optional) {
    @Nullable List<MedicinalProductIndication_OtherTherapy> value = optional.orElse(null);
    if (this.otherTherapy == value) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        this.extension,
        this.diseaseSymptomProcedure,
        this.duration,
        value,
        this.subject,
        this.text,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.undesirableEffect,
        this.language,
        this.population,
        this.id,
        this.contained,
        this.comorbidity,
        this.intendedEffect,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withSubject(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        this.extension,
        this.diseaseSymptomProcedure,
        this.duration,
        this.otherTherapy,
        newValue,
        this.text,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.undesirableEffect,
        this.language,
        this.population,
        this.id,
        this.contained,
        this.comorbidity,
        this.intendedEffect,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withSubject(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        this.extension,
        this.diseaseSymptomProcedure,
        this.duration,
        this.otherTherapy,
        value,
        this.text,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.undesirableEffect,
        this.language,
        this.population,
        this.id,
        this.contained,
        this.comorbidity,
        this.intendedEffect,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        this.extension,
        this.diseaseSymptomProcedure,
        this.duration,
        this.otherTherapy,
        this.subject,
        newValue,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.undesirableEffect,
        this.language,
        this.population,
        this.id,
        this.contained,
        this.comorbidity,
        this.intendedEffect,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        this.extension,
        this.diseaseSymptomProcedure,
        this.duration,
        this.otherTherapy,
        this.subject,
        value,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.undesirableEffect,
        this.language,
        this.population,
        this.id,
        this.contained,
        this.comorbidity,
        this.intendedEffect,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductIndication#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductIndication withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        this.extension,
        this.diseaseSymptomProcedure,
        this.duration,
        this.otherTherapy,
        this.subject,
        this.text,
        newValue,
        this.meta,
        this.implicitRules,
        this.undesirableEffect,
        this.language,
        this.population,
        this.id,
        this.contained,
        this.comorbidity,
        this.intendedEffect,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        this.extension,
        this.diseaseSymptomProcedure,
        this.duration,
        this.otherTherapy,
        this.subject,
        this.text,
        this.resourceType,
        newValue,
        this.implicitRules,
        this.undesirableEffect,
        this.language,
        this.population,
        this.id,
        this.contained,
        this.comorbidity,
        this.intendedEffect,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        this.extension,
        this.diseaseSymptomProcedure,
        this.duration,
        this.otherTherapy,
        this.subject,
        this.text,
        this.resourceType,
        value,
        this.implicitRules,
        this.undesirableEffect,
        this.language,
        this.population,
        this.id,
        this.contained,
        this.comorbidity,
        this.intendedEffect,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        this.extension,
        this.diseaseSymptomProcedure,
        this.duration,
        this.otherTherapy,
        this.subject,
        this.text,
        this.resourceType,
        this.meta,
        newValue,
        this.undesirableEffect,
        this.language,
        this.population,
        this.id,
        this.contained,
        this.comorbidity,
        this.intendedEffect,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        this.extension,
        this.diseaseSymptomProcedure,
        this.duration,
        this.otherTherapy,
        this.subject,
        this.text,
        this.resourceType,
        this.meta,
        value,
        this.undesirableEffect,
        this.language,
        this.population,
        this.id,
        this.contained,
        this.comorbidity,
        this.intendedEffect,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#undesirableEffect() undesirableEffect} attribute.
   * @param value The value for undesirableEffect
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withUndesirableEffect(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "undesirableEffect");
    if (this.undesirableEffect == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        this.extension,
        this.diseaseSymptomProcedure,
        this.duration,
        this.otherTherapy,
        this.subject,
        this.text,
        this.resourceType,
        this.meta,
        this.implicitRules,
        newValue,
        this.language,
        this.population,
        this.id,
        this.contained,
        this.comorbidity,
        this.intendedEffect,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#undesirableEffect() undesirableEffect} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for undesirableEffect
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withUndesirableEffect(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.undesirableEffect == value) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        this.extension,
        this.diseaseSymptomProcedure,
        this.duration,
        this.otherTherapy,
        this.subject,
        this.text,
        this.resourceType,
        this.meta,
        this.implicitRules,
        value,
        this.language,
        this.population,
        this.id,
        this.contained,
        this.comorbidity,
        this.intendedEffect,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        this.extension,
        this.diseaseSymptomProcedure,
        this.duration,
        this.otherTherapy,
        this.subject,
        this.text,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.undesirableEffect,
        newValue,
        this.population,
        this.id,
        this.contained,
        this.comorbidity,
        this.intendedEffect,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        this.extension,
        this.diseaseSymptomProcedure,
        this.duration,
        this.otherTherapy,
        this.subject,
        this.text,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.undesirableEffect,
        value,
        this.population,
        this.id,
        this.contained,
        this.comorbidity,
        this.intendedEffect,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#population() population} attribute.
   * @param value The value for population
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withPopulation(List<Population> value) {
    @Nullable List<Population> newValue = Objects.requireNonNull(value, "population");
    if (this.population == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        this.extension,
        this.diseaseSymptomProcedure,
        this.duration,
        this.otherTherapy,
        this.subject,
        this.text,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.undesirableEffect,
        this.language,
        newValue,
        this.id,
        this.contained,
        this.comorbidity,
        this.intendedEffect,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#population() population} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for population
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withPopulation(Optional<? extends List<Population>> optional) {
    @Nullable List<Population> value = optional.orElse(null);
    if (this.population == value) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        this.extension,
        this.diseaseSymptomProcedure,
        this.duration,
        this.otherTherapy,
        this.subject,
        this.text,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.undesirableEffect,
        this.language,
        value,
        this.id,
        this.contained,
        this.comorbidity,
        this.intendedEffect,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        this.extension,
        this.diseaseSymptomProcedure,
        this.duration,
        this.otherTherapy,
        this.subject,
        this.text,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.undesirableEffect,
        this.language,
        this.population,
        newValue,
        this.contained,
        this.comorbidity,
        this.intendedEffect,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        this.extension,
        this.diseaseSymptomProcedure,
        this.duration,
        this.otherTherapy,
        this.subject,
        this.text,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.undesirableEffect,
        this.language,
        this.population,
        value,
        this.contained,
        this.comorbidity,
        this.intendedEffect,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        this.extension,
        this.diseaseSymptomProcedure,
        this.duration,
        this.otherTherapy,
        this.subject,
        this.text,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.undesirableEffect,
        this.language,
        this.population,
        this.id,
        newValue,
        this.comorbidity,
        this.intendedEffect,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        this.extension,
        this.diseaseSymptomProcedure,
        this.duration,
        this.otherTherapy,
        this.subject,
        this.text,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.undesirableEffect,
        this.language,
        this.population,
        this.id,
        value,
        this.comorbidity,
        this.intendedEffect,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#comorbidity() comorbidity} attribute.
   * @param value The value for comorbidity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withComorbidity(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "comorbidity");
    if (this.comorbidity == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        this.extension,
        this.diseaseSymptomProcedure,
        this.duration,
        this.otherTherapy,
        this.subject,
        this.text,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.undesirableEffect,
        this.language,
        this.population,
        this.id,
        this.contained,
        newValue,
        this.intendedEffect,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#comorbidity() comorbidity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comorbidity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withComorbidity(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.comorbidity == value) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        this.extension,
        this.diseaseSymptomProcedure,
        this.duration,
        this.otherTherapy,
        this.subject,
        this.text,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.undesirableEffect,
        this.language,
        this.population,
        this.id,
        this.contained,
        value,
        this.intendedEffect,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#intendedEffect() intendedEffect} attribute.
   * @param value The value for intendedEffect
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withIntendedEffect(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "intendedEffect");
    if (this.intendedEffect == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        this.extension,
        this.diseaseSymptomProcedure,
        this.duration,
        this.otherTherapy,
        this.subject,
        this.text,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.undesirableEffect,
        this.language,
        this.population,
        this.id,
        this.contained,
        this.comorbidity,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#intendedEffect() intendedEffect} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for intendedEffect
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withIntendedEffect(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.intendedEffect == value) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        this.extension,
        this.diseaseSymptomProcedure,
        this.duration,
        this.otherTherapy,
        this.subject,
        this.text,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.undesirableEffect,
        this.language,
        this.population,
        this.id,
        this.contained,
        this.comorbidity,
        value,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductIndication#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductIndication withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        this.extension,
        this.diseaseSymptomProcedure,
        this.duration,
        this.otherTherapy,
        this.subject,
        this.text,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.undesirableEffect,
        this.language,
        this.population,
        this.id,
        this.contained,
        this.comorbidity,
        this.intendedEffect,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductIndication#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductIndication withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProductIndication(
        this.diseaseStatus,
        this.extension,
        this.diseaseSymptomProcedure,
        this.duration,
        this.otherTherapy,
        this.subject,
        this.text,
        this.resourceType,
        this.meta,
        this.implicitRules,
        this.undesirableEffect,
        this.language,
        this.population,
        this.id,
        this.contained,
        this.comorbidity,
        this.intendedEffect,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProductIndication} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProductIndication
        && equalTo((ImmutableMedicinalProductIndication) another);
  }

  private boolean equalTo(ImmutableMedicinalProductIndication another) {
    return Objects.equals(diseaseStatus, another.diseaseStatus)
        && Objects.equals(extension, another.extension)
        && Objects.equals(diseaseSymptomProcedure, another.diseaseSymptomProcedure)
        && Objects.equals(duration, another.duration)
        && Objects.equals(otherTherapy, another.otherTherapy)
        && Objects.equals(subject, another.subject)
        && Objects.equals(text, another.text)
        && resourceType.equals(another.resourceType)
        && Objects.equals(meta, another.meta)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(undesirableEffect, another.undesirableEffect)
        && Objects.equals(language, another.language)
        && Objects.equals(population, another.population)
        && Objects.equals(id, another.id)
        && Objects.equals(contained, another.contained)
        && Objects.equals(comorbidity, another.comorbidity)
        && Objects.equals(intendedEffect, another.intendedEffect)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code diseaseStatus}, {@code extension}, {@code diseaseSymptomProcedure}, {@code duration}, {@code otherTherapy}, {@code subject}, {@code text}, {@code resourceType}, {@code meta}, {@code implicitRules}, {@code undesirableEffect}, {@code language}, {@code population}, {@code id}, {@code contained}, {@code comorbidity}, {@code intendedEffect}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(diseaseStatus);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(diseaseSymptomProcedure);
    h += (h << 5) + Objects.hashCode(duration);
    h += (h << 5) + Objects.hashCode(otherTherapy);
    h += (h << 5) + Objects.hashCode(subject);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(undesirableEffect);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(population);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(comorbidity);
    h += (h << 5) + Objects.hashCode(intendedEffect);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProductIndication} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicinalProductIndication{");
    if (diseaseStatus != null) {
      builder.append("diseaseStatus=").append(diseaseStatus);
    }
    if (extension != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (diseaseSymptomProcedure != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("diseaseSymptomProcedure=").append(diseaseSymptomProcedure);
    }
    if (duration != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("duration=").append(duration);
    }
    if (otherTherapy != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("otherTherapy=").append(otherTherapy);
    }
    if (subject != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (text != null) {
      if (builder.length() > 27) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (builder.length() > 27) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (undesirableEffect != null) {
      builder.append(", ");
      builder.append("undesirableEffect=").append(undesirableEffect);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (population != null) {
      builder.append(", ");
      builder.append("population=").append(population);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (comorbidity != null) {
      builder.append(", ");
      builder.append("comorbidity=").append(comorbidity);
    }
    if (intendedEffect != null) {
      builder.append(", ");
      builder.append("intendedEffect=").append(intendedEffect);
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
  @Generated(from = "MedicinalProductIndication", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicinalProductIndication {
    @Nullable Optional<CodeableConcept> diseaseStatus = Optional.empty();
    boolean diseaseStatusIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<CodeableConcept> diseaseSymptomProcedure = Optional.empty();
    boolean diseaseSymptomProcedureIsSet;
    @Nullable Optional<Quantity> duration = Optional.empty();
    boolean durationIsSet;
    @Nullable Optional<List<MedicinalProductIndication_OtherTherapy>> otherTherapy = Optional.empty();
    boolean otherTherapyIsSet;
    @Nullable Optional<List<Reference>> subject = Optional.empty();
    boolean subjectIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable String resourceType;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<Reference>> undesirableEffect = Optional.empty();
    boolean undesirableEffectIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Population>> population = Optional.empty();
    boolean populationIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<CodeableConcept>> comorbidity = Optional.empty();
    boolean comorbidityIsSet;
    @Nullable Optional<CodeableConcept> intendedEffect = Optional.empty();
    boolean intendedEffectIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("diseaseStatus")
    public void setDiseaseStatus(Optional<CodeableConcept> diseaseStatus) {
      this.diseaseStatus = diseaseStatus;
      this.diseaseStatusIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("diseaseSymptomProcedure")
    public void setDiseaseSymptomProcedure(Optional<CodeableConcept> diseaseSymptomProcedure) {
      this.diseaseSymptomProcedure = diseaseSymptomProcedure;
      this.diseaseSymptomProcedureIsSet = true;
    }
    @JsonProperty("duration")
    public void setDuration(Optional<Quantity> duration) {
      this.duration = duration;
      this.durationIsSet = true;
    }
    @JsonProperty("otherTherapy")
    public void setOtherTherapy(Optional<List<MedicinalProductIndication_OtherTherapy>> otherTherapy) {
      this.otherTherapy = otherTherapy;
      this.otherTherapyIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Optional<List<Reference>> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("undesirableEffect")
    public void setUndesirableEffect(Optional<List<Reference>> undesirableEffect) {
      this.undesirableEffect = undesirableEffect;
      this.undesirableEffectIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("population")
    public void setPopulation(Optional<List<Population>> population) {
      this.population = population;
      this.populationIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("comorbidity")
    public void setComorbidity(Optional<List<CodeableConcept>> comorbidity) {
      this.comorbidity = comorbidity;
      this.comorbidityIsSet = true;
    }
    @JsonProperty("intendedEffect")
    public void setIntendedEffect(Optional<CodeableConcept> intendedEffect) {
      this.intendedEffect = intendedEffect;
      this.intendedEffectIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<CodeableConcept> diseaseStatus() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> diseaseSymptomProcedure() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> duration() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MedicinalProductIndication_OtherTherapy>> otherTherapy() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> undesirableEffect() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Population>> population() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> comorbidity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> intendedEffect() { throw new UnsupportedOperationException(); }
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
  static ImmutableMedicinalProductIndication fromJson(Json json) {
    ImmutableMedicinalProductIndication.Builder builder = ((ImmutableMedicinalProductIndication.Builder) ImmutableMedicinalProductIndication.builder());
    if (json.diseaseStatusIsSet) {
      builder.diseaseStatus(json.diseaseStatus);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.diseaseSymptomProcedureIsSet) {
      builder.diseaseSymptomProcedure(json.diseaseSymptomProcedure);
    }
    if (json.durationIsSet) {
      builder.duration(json.duration);
    }
    if (json.otherTherapyIsSet) {
      builder.otherTherapy(json.otherTherapy);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.undesirableEffectIsSet) {
      builder.undesirableEffect(json.undesirableEffect);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.populationIsSet) {
      builder.population(json.population);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.comorbidityIsSet) {
      builder.comorbidity(json.comorbidity);
    }
    if (json.intendedEffectIsSet) {
      builder.intendedEffect(json.intendedEffect);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableMedicinalProductIndication) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicinalProductIndication} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicinalProductIndication instance
   */
  public static MedicinalProductIndication copyOf(MedicinalProductIndication instance) {
    if (instance instanceof ImmutableMedicinalProductIndication) {
      return (ImmutableMedicinalProductIndication) instance;
    }
    return ((ImmutableMedicinalProductIndication.Builder) ImmutableMedicinalProductIndication.builder())
        .diseaseStatus(instance.diseaseStatus())
        .extension(instance.extension())
        .diseaseSymptomProcedure(instance.diseaseSymptomProcedure())
        .duration(instance.duration())
        .otherTherapy(instance.otherTherapy())
        .subject(instance.subject())
        .text(instance.text())
        .resourceType(instance.resourceType())
        .meta(instance.meta())
        .implicitRules(instance.implicitRules())
        .undesirableEffect(instance.undesirableEffect())
        .language(instance.language())
        .population(instance.population())
        .id(instance.id())
        .contained(instance.contained())
        .comorbidity(instance.comorbidity())
        .intendedEffect(instance.intendedEffect())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProductIndication MedicinalProductIndication}.
   * <pre>
   * ImmutableMedicinalProductIndication.builder()
   *    .diseaseStatus(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicinalProductIndication#diseaseStatus() diseaseStatus}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProductIndication#extension() extension}
   *    .diseaseSymptomProcedure(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicinalProductIndication#diseaseSymptomProcedure() diseaseSymptomProcedure}
   *    .duration(com.medplum.types.fhir.Quantity) // optional {@link MedicinalProductIndication#duration() duration}
   *    .otherTherapy(List&amp;lt;com.medplum.types.fhir.MedicinalProductIndication_OtherTherapy&amp;gt;) // optional {@link MedicinalProductIndication#otherTherapy() otherTherapy}
   *    .subject(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MedicinalProductIndication#subject() subject}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link MedicinalProductIndication#text() text}
   *    .resourceType(String) // required {@link MedicinalProductIndication#resourceType() resourceType}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link MedicinalProductIndication#meta() meta}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link MedicinalProductIndication#implicitRules() implicitRules}
   *    .undesirableEffect(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MedicinalProductIndication#undesirableEffect() undesirableEffect}
   *    .language(com.medplum.types.fhir.Code) // optional {@link MedicinalProductIndication#language() language}
   *    .population(List&amp;lt;com.medplum.types.fhir.Population&amp;gt;) // optional {@link MedicinalProductIndication#population() population}
   *    .id(com.medplum.types.fhir.Id) // optional {@link MedicinalProductIndication#id() id}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link MedicinalProductIndication#contained() contained}
   *    .comorbidity(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link MedicinalProductIndication#comorbidity() comorbidity}
   *    .intendedEffect(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicinalProductIndication#intendedEffect() intendedEffect}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProductIndication#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new MedicinalProductIndication builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableMedicinalProductIndication.Builder();
  }

  /**
   * Builds instances of type {@link MedicinalProductIndication MedicinalProductIndication}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicinalProductIndication", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_DISEASE_STATUS = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_DISEASE_SYMPTOM_PROCEDURE = 0x4L;
    private static final long OPT_BIT_DURATION = 0x8L;
    private static final long OPT_BIT_OTHER_THERAPY = 0x10L;
    private static final long OPT_BIT_SUBJECT = 0x20L;
    private static final long OPT_BIT_TEXT = 0x40L;
    private static final long OPT_BIT_META = 0x80L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x100L;
    private static final long OPT_BIT_UNDESIRABLE_EFFECT = 0x200L;
    private static final long OPT_BIT_LANGUAGE = 0x400L;
    private static final long OPT_BIT_POPULATION = 0x800L;
    private static final long OPT_BIT_ID = 0x1000L;
    private static final long OPT_BIT_CONTAINED = 0x2000L;
    private static final long OPT_BIT_COMORBIDITY = 0x4000L;
    private static final long OPT_BIT_INTENDED_EFFECT = 0x8000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable CodeableConcept diseaseStatus;
    private @Nullable List<Extension> extension;
    private @Nullable CodeableConcept diseaseSymptomProcedure;
    private @Nullable Quantity duration;
    private @Nullable List<MedicinalProductIndication_OtherTherapy> otherTherapy;
    private @Nullable List<Reference> subject;
    private @Nullable Narrative text;
    private @Nullable String resourceType;
    private @Nullable Meta meta;
    private @Nullable Uri implicitRules;
    private @Nullable List<Reference> undesirableEffect;
    private @Nullable Code language;
    private @Nullable List<Population> population;
    private @Nullable Id id;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<CodeableConcept> comorbidity;
    private @Nullable CodeableConcept intendedEffect;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#diseaseStatus() diseaseStatus} to diseaseStatus.
     * @param diseaseStatus The value for diseaseStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder diseaseStatus(CodeableConcept diseaseStatus) {
      checkNotIsSet(diseaseStatusIsSet(), "diseaseStatus");
      this.diseaseStatus = Objects.requireNonNull(diseaseStatus, "diseaseStatus");
      optBits |= OPT_BIT_DISEASE_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#diseaseStatus() diseaseStatus} to diseaseStatus.
     * @param diseaseStatus The value for diseaseStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("diseaseStatus")
    public final Builder diseaseStatus(Optional<? extends CodeableConcept> diseaseStatus) {
      checkNotIsSet(diseaseStatusIsSet(), "diseaseStatus");
      this.diseaseStatus = diseaseStatus.orElse(null);
      optBits |= OPT_BIT_DISEASE_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductIndication#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductIndication#diseaseSymptomProcedure() diseaseSymptomProcedure} to diseaseSymptomProcedure.
     * @param diseaseSymptomProcedure The value for diseaseSymptomProcedure
     * @return {@code this} builder for chained invocation
     */
    public final Builder diseaseSymptomProcedure(CodeableConcept diseaseSymptomProcedure) {
      checkNotIsSet(diseaseSymptomProcedureIsSet(), "diseaseSymptomProcedure");
      this.diseaseSymptomProcedure = Objects.requireNonNull(diseaseSymptomProcedure, "diseaseSymptomProcedure");
      optBits |= OPT_BIT_DISEASE_SYMPTOM_PROCEDURE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#diseaseSymptomProcedure() diseaseSymptomProcedure} to diseaseSymptomProcedure.
     * @param diseaseSymptomProcedure The value for diseaseSymptomProcedure
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("diseaseSymptomProcedure")
    public final Builder diseaseSymptomProcedure(Optional<? extends CodeableConcept> diseaseSymptomProcedure) {
      checkNotIsSet(diseaseSymptomProcedureIsSet(), "diseaseSymptomProcedure");
      this.diseaseSymptomProcedure = diseaseSymptomProcedure.orElse(null);
      optBits |= OPT_BIT_DISEASE_SYMPTOM_PROCEDURE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for chained invocation
     */
    public final Builder duration(Quantity duration) {
      checkNotIsSet(durationIsSet(), "duration");
      this.duration = Objects.requireNonNull(duration, "duration");
      optBits |= OPT_BIT_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("duration")
    public final Builder duration(Optional<? extends Quantity> duration) {
      checkNotIsSet(durationIsSet(), "duration");
      this.duration = duration.orElse(null);
      optBits |= OPT_BIT_DURATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#otherTherapy() otherTherapy} to otherTherapy.
     * @param otherTherapy The value for otherTherapy
     * @return {@code this} builder for chained invocation
     */
    public final Builder otherTherapy(List<MedicinalProductIndication_OtherTherapy> otherTherapy) {
      checkNotIsSet(otherTherapyIsSet(), "otherTherapy");
      this.otherTherapy = Objects.requireNonNull(otherTherapy, "otherTherapy");
      optBits |= OPT_BIT_OTHER_THERAPY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#otherTherapy() otherTherapy} to otherTherapy.
     * @param otherTherapy The value for otherTherapy
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("otherTherapy")
    public final Builder otherTherapy(Optional<? extends List<MedicinalProductIndication_OtherTherapy>> otherTherapy) {
      checkNotIsSet(otherTherapyIsSet(), "otherTherapy");
      this.otherTherapy = otherTherapy.orElse(null);
      optBits |= OPT_BIT_OTHER_THERAPY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    public final Builder subject(List<Reference> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = Objects.requireNonNull(subject, "subject");
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subject")
    public final Builder subject(Optional<? extends List<Reference>> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = subject.orElse(null);
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(Narrative text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("text")
    public final Builder text(Optional<? extends Narrative> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the value for the {@link MedicinalProductIndication#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resourceType")
    public final Builder resourceType(String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = Objects.requireNonNull(resourceType, "resourceType");
      initBits &= ~INIT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    public final Builder meta(Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("meta")
    public final Builder meta(Optional<? extends Meta> meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = meta.orElse(null);
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(Uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("implicitRules")
    public final Builder implicitRules(Optional<? extends Uri> implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = implicitRules.orElse(null);
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#undesirableEffect() undesirableEffect} to undesirableEffect.
     * @param undesirableEffect The value for undesirableEffect
     * @return {@code this} builder for chained invocation
     */
    public final Builder undesirableEffect(List<Reference> undesirableEffect) {
      checkNotIsSet(undesirableEffectIsSet(), "undesirableEffect");
      this.undesirableEffect = Objects.requireNonNull(undesirableEffect, "undesirableEffect");
      optBits |= OPT_BIT_UNDESIRABLE_EFFECT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#undesirableEffect() undesirableEffect} to undesirableEffect.
     * @param undesirableEffect The value for undesirableEffect
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("undesirableEffect")
    public final Builder undesirableEffect(Optional<? extends List<Reference>> undesirableEffect) {
      checkNotIsSet(undesirableEffectIsSet(), "undesirableEffect");
      this.undesirableEffect = undesirableEffect.orElse(null);
      optBits |= OPT_BIT_UNDESIRABLE_EFFECT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(Code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("language")
    public final Builder language(Optional<? extends Code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#population() population} to population.
     * @param population The value for population
     * @return {@code this} builder for chained invocation
     */
    public final Builder population(List<Population> population) {
      checkNotIsSet(populationIsSet(), "population");
      this.population = Objects.requireNonNull(population, "population");
      optBits |= OPT_BIT_POPULATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#population() population} to population.
     * @param population The value for population
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("population")
    public final Builder population(Optional<? extends List<Population>> population) {
      checkNotIsSet(populationIsSet(), "population");
      this.population = population.orElse(null);
      optBits |= OPT_BIT_POPULATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(Id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("id")
    public final Builder id(Optional<? extends Id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    public final Builder contained(List<ResourceList> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = Objects.requireNonNull(contained, "contained");
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contained")
    public final Builder contained(Optional<? extends List<ResourceList>> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = contained.orElse(null);
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#comorbidity() comorbidity} to comorbidity.
     * @param comorbidity The value for comorbidity
     * @return {@code this} builder for chained invocation
     */
    public final Builder comorbidity(List<CodeableConcept> comorbidity) {
      checkNotIsSet(comorbidityIsSet(), "comorbidity");
      this.comorbidity = Objects.requireNonNull(comorbidity, "comorbidity");
      optBits |= OPT_BIT_COMORBIDITY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#comorbidity() comorbidity} to comorbidity.
     * @param comorbidity The value for comorbidity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("comorbidity")
    public final Builder comorbidity(Optional<? extends List<CodeableConcept>> comorbidity) {
      checkNotIsSet(comorbidityIsSet(), "comorbidity");
      this.comorbidity = comorbidity.orElse(null);
      optBits |= OPT_BIT_COMORBIDITY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#intendedEffect() intendedEffect} to intendedEffect.
     * @param intendedEffect The value for intendedEffect
     * @return {@code this} builder for chained invocation
     */
    public final Builder intendedEffect(CodeableConcept intendedEffect) {
      checkNotIsSet(intendedEffectIsSet(), "intendedEffect");
      this.intendedEffect = Objects.requireNonNull(intendedEffect, "intendedEffect");
      optBits |= OPT_BIT_INTENDED_EFFECT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#intendedEffect() intendedEffect} to intendedEffect.
     * @param intendedEffect The value for intendedEffect
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("intendedEffect")
    public final Builder intendedEffect(Optional<? extends CodeableConcept> intendedEffect) {
      checkNotIsSet(intendedEffectIsSet(), "intendedEffect");
      this.intendedEffect = intendedEffect.orElse(null);
      optBits |= OPT_BIT_INTENDED_EFFECT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductIndication#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductIndication#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link MedicinalProductIndication MedicinalProductIndication}.
     * @return An immutable instance of MedicinalProductIndication
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicinalProductIndication build() {
      checkRequiredAttributes();
      return new ImmutableMedicinalProductIndication(
          diseaseStatus,
          extension,
          diseaseSymptomProcedure,
          duration,
          otherTherapy,
          subject,
          text,
          resourceType,
          meta,
          implicitRules,
          undesirableEffect,
          language,
          population,
          id,
          contained,
          comorbidity,
          intendedEffect,
          modifierExtension);
    }

    private boolean diseaseStatusIsSet() {
      return (optBits & OPT_BIT_DISEASE_STATUS) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean diseaseSymptomProcedureIsSet() {
      return (optBits & OPT_BIT_DISEASE_SYMPTOM_PROCEDURE) != 0;
    }

    private boolean durationIsSet() {
      return (optBits & OPT_BIT_DURATION) != 0;
    }

    private boolean otherTherapyIsSet() {
      return (optBits & OPT_BIT_OTHER_THERAPY) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean undesirableEffectIsSet() {
      return (optBits & OPT_BIT_UNDESIRABLE_EFFECT) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean populationIsSet() {
      return (optBits & OPT_BIT_POPULATION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean comorbidityIsSet() {
      return (optBits & OPT_BIT_COMORBIDITY) != 0;
    }

    private boolean intendedEffectIsSet() {
      return (optBits & OPT_BIT_INTENDED_EFFECT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicinalProductIndication is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build MedicinalProductIndication, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MedicinalProductIndication", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductIndication#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "MedicinalProductIndication", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicinalProductIndication#diseaseStatus() diseaseStatus} to diseaseStatus.
     * @param diseaseStatus The value for diseaseStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal diseaseStatus(CodeableConcept diseaseStatus);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#diseaseStatus() diseaseStatus} to diseaseStatus.
     * @param diseaseStatus The value for diseaseStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal diseaseStatus(Optional<? extends CodeableConcept> diseaseStatus);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#diseaseSymptomProcedure() diseaseSymptomProcedure} to diseaseSymptomProcedure.
     * @param diseaseSymptomProcedure The value for diseaseSymptomProcedure
     * @return {@code this} builder for chained invocation
     */
    BuildFinal diseaseSymptomProcedure(CodeableConcept diseaseSymptomProcedure);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#diseaseSymptomProcedure() diseaseSymptomProcedure} to diseaseSymptomProcedure.
     * @param diseaseSymptomProcedure The value for diseaseSymptomProcedure
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal diseaseSymptomProcedure(Optional<? extends CodeableConcept> diseaseSymptomProcedure);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for chained invocation
     */
    BuildFinal duration(Quantity duration);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#duration() duration} to duration.
     * @param duration The value for duration
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal duration(Optional<? extends Quantity> duration);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#otherTherapy() otherTherapy} to otherTherapy.
     * @param otherTherapy The value for otherTherapy
     * @return {@code this} builder for chained invocation
     */
    BuildFinal otherTherapy(List<MedicinalProductIndication_OtherTherapy> otherTherapy);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#otherTherapy() otherTherapy} to otherTherapy.
     * @param otherTherapy The value for otherTherapy
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal otherTherapy(Optional<? extends List<MedicinalProductIndication_OtherTherapy>> otherTherapy);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(List<Reference> subject);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(Optional<? extends List<Reference>> subject);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#undesirableEffect() undesirableEffect} to undesirableEffect.
     * @param undesirableEffect The value for undesirableEffect
     * @return {@code this} builder for chained invocation
     */
    BuildFinal undesirableEffect(List<Reference> undesirableEffect);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#undesirableEffect() undesirableEffect} to undesirableEffect.
     * @param undesirableEffect The value for undesirableEffect
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal undesirableEffect(Optional<? extends List<Reference>> undesirableEffect);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#population() population} to population.
     * @param population The value for population
     * @return {@code this} builder for chained invocation
     */
    BuildFinal population(List<Population> population);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#population() population} to population.
     * @param population The value for population
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal population(Optional<? extends List<Population>> population);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#comorbidity() comorbidity} to comorbidity.
     * @param comorbidity The value for comorbidity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal comorbidity(List<CodeableConcept> comorbidity);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#comorbidity() comorbidity} to comorbidity.
     * @param comorbidity The value for comorbidity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal comorbidity(Optional<? extends List<CodeableConcept>> comorbidity);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#intendedEffect() intendedEffect} to intendedEffect.
     * @param intendedEffect The value for intendedEffect
     * @return {@code this} builder for chained invocation
     */
    BuildFinal intendedEffect(CodeableConcept intendedEffect);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#intendedEffect() intendedEffect} to intendedEffect.
     * @param intendedEffect The value for intendedEffect
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal intendedEffect(Optional<? extends CodeableConcept> intendedEffect);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductIndication#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Builds a new {@link MedicinalProductIndication MedicinalProductIndication}.
     * @return An immutable instance of MedicinalProductIndication
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicinalProductIndication build();
  }
}
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
 * Immutable implementation of {@link MedicinalProductContraindication}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProductContraindication.builder()}.
 */
@Generated(from = "MedicinalProductContraindication", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProductContraindication
    implements MedicinalProductContraindication {
  private final @Nullable List<Reference> subject;
  private final @Nullable Meta meta;
  private final @Nullable List<Reference> therapeuticIndication;
  private final @Nullable List<Population> population;
  private final @Nullable CodeableConcept disease;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<CodeableConcept> comorbidity;
  private final @Nullable Narrative text;
  private final @Nullable CodeableConcept diseaseStatus;
  private final @Nullable List<MedicinalProductContraindication_OtherTherapy> otherTherapy;
  private final @Nullable Code language;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Id id;
  private final String resourceType;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableMedicinalProductContraindication(
      @Nullable List<Reference> subject,
      @Nullable Meta meta,
      @Nullable List<Reference> therapeuticIndication,
      @Nullable List<Population> population,
      @Nullable CodeableConcept disease,
      @Nullable Uri implicitRules,
      @Nullable List<Extension> extension,
      @Nullable List<CodeableConcept> comorbidity,
      @Nullable Narrative text,
      @Nullable CodeableConcept diseaseStatus,
      @Nullable List<MedicinalProductContraindication_OtherTherapy> otherTherapy,
      @Nullable Code language,
      @Nullable List<ResourceList> contained,
      @Nullable Id id,
      String resourceType,
      @Nullable List<Extension> modifierExtension) {
    this.subject = subject;
    this.meta = meta;
    this.therapeuticIndication = therapeuticIndication;
    this.population = population;
    this.disease = disease;
    this.implicitRules = implicitRules;
    this.extension = extension;
    this.comorbidity = comorbidity;
    this.text = text;
    this.diseaseStatus = diseaseStatus;
    this.otherTherapy = otherTherapy;
    this.language = language;
    this.contained = contained;
    this.id = id;
    this.resourceType = resourceType;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code therapeuticIndication} attribute
   */
  @JsonProperty("therapeuticIndication")
  @Override
  public Optional<List<Reference>> therapeuticIndication() {
    return Optional.ofNullable(therapeuticIndication);
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
   * @return The value of the {@code disease} attribute
   */
  @JsonProperty("disease")
  @Override
  public Optional<CodeableConcept> disease() {
    return Optional.ofNullable(disease);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
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
   * @return The value of the {@code otherTherapy} attribute
   */
  @JsonProperty("otherTherapy")
  @Override
  public Optional<List<MedicinalProductContraindication_OtherTherapy>> otherTherapy() {
    return Optional.ofNullable(otherTherapy);
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
   * @return The value of the {@code contained} attribute
   */
  @JsonProperty("contained")
  @Override
  public Optional<List<ResourceList>> contained() {
    return Optional.ofNullable(contained);
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductContraindication#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductContraindication withSubject(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableMedicinalProductContraindication(
        newValue,
        this.meta,
        this.therapeuticIndication,
        this.population,
        this.disease,
        this.implicitRules,
        this.extension,
        this.comorbidity,
        this.text,
        this.diseaseStatus,
        this.otherTherapy,
        this.language,
        this.contained,
        this.id,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductContraindication#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductContraindication withSubject(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableMedicinalProductContraindication(
        value,
        this.meta,
        this.therapeuticIndication,
        this.population,
        this.disease,
        this.implicitRules,
        this.extension,
        this.comorbidity,
        this.text,
        this.diseaseStatus,
        this.otherTherapy,
        this.language,
        this.contained,
        this.id,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductContraindication#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductContraindication withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedicinalProductContraindication(
        this.subject,
        newValue,
        this.therapeuticIndication,
        this.population,
        this.disease,
        this.implicitRules,
        this.extension,
        this.comorbidity,
        this.text,
        this.diseaseStatus,
        this.otherTherapy,
        this.language,
        this.contained,
        this.id,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductContraindication#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductContraindication withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedicinalProductContraindication(
        this.subject,
        value,
        this.therapeuticIndication,
        this.population,
        this.disease,
        this.implicitRules,
        this.extension,
        this.comorbidity,
        this.text,
        this.diseaseStatus,
        this.otherTherapy,
        this.language,
        this.contained,
        this.id,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductContraindication#therapeuticIndication() therapeuticIndication} attribute.
   * @param value The value for therapeuticIndication
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductContraindication withTherapeuticIndication(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "therapeuticIndication");
    if (this.therapeuticIndication == newValue) return this;
    return new ImmutableMedicinalProductContraindication(
        this.subject,
        this.meta,
        newValue,
        this.population,
        this.disease,
        this.implicitRules,
        this.extension,
        this.comorbidity,
        this.text,
        this.diseaseStatus,
        this.otherTherapy,
        this.language,
        this.contained,
        this.id,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductContraindication#therapeuticIndication() therapeuticIndication} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for therapeuticIndication
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductContraindication withTherapeuticIndication(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.therapeuticIndication == value) return this;
    return new ImmutableMedicinalProductContraindication(
        this.subject,
        this.meta,
        value,
        this.population,
        this.disease,
        this.implicitRules,
        this.extension,
        this.comorbidity,
        this.text,
        this.diseaseStatus,
        this.otherTherapy,
        this.language,
        this.contained,
        this.id,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductContraindication#population() population} attribute.
   * @param value The value for population
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductContraindication withPopulation(List<Population> value) {
    @Nullable List<Population> newValue = Objects.requireNonNull(value, "population");
    if (this.population == newValue) return this;
    return new ImmutableMedicinalProductContraindication(
        this.subject,
        this.meta,
        this.therapeuticIndication,
        newValue,
        this.disease,
        this.implicitRules,
        this.extension,
        this.comorbidity,
        this.text,
        this.diseaseStatus,
        this.otherTherapy,
        this.language,
        this.contained,
        this.id,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductContraindication#population() population} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for population
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductContraindication withPopulation(Optional<? extends List<Population>> optional) {
    @Nullable List<Population> value = optional.orElse(null);
    if (this.population == value) return this;
    return new ImmutableMedicinalProductContraindication(
        this.subject,
        this.meta,
        this.therapeuticIndication,
        value,
        this.disease,
        this.implicitRules,
        this.extension,
        this.comorbidity,
        this.text,
        this.diseaseStatus,
        this.otherTherapy,
        this.language,
        this.contained,
        this.id,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductContraindication#disease() disease} attribute.
   * @param value The value for disease
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductContraindication withDisease(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "disease");
    if (this.disease == newValue) return this;
    return new ImmutableMedicinalProductContraindication(
        this.subject,
        this.meta,
        this.therapeuticIndication,
        this.population,
        newValue,
        this.implicitRules,
        this.extension,
        this.comorbidity,
        this.text,
        this.diseaseStatus,
        this.otherTherapy,
        this.language,
        this.contained,
        this.id,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductContraindication#disease() disease} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for disease
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductContraindication withDisease(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.disease == value) return this;
    return new ImmutableMedicinalProductContraindication(
        this.subject,
        this.meta,
        this.therapeuticIndication,
        this.population,
        value,
        this.implicitRules,
        this.extension,
        this.comorbidity,
        this.text,
        this.diseaseStatus,
        this.otherTherapy,
        this.language,
        this.contained,
        this.id,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductContraindication#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductContraindication withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedicinalProductContraindication(
        this.subject,
        this.meta,
        this.therapeuticIndication,
        this.population,
        this.disease,
        newValue,
        this.extension,
        this.comorbidity,
        this.text,
        this.diseaseStatus,
        this.otherTherapy,
        this.language,
        this.contained,
        this.id,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductContraindication#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductContraindication withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedicinalProductContraindication(
        this.subject,
        this.meta,
        this.therapeuticIndication,
        this.population,
        this.disease,
        value,
        this.extension,
        this.comorbidity,
        this.text,
        this.diseaseStatus,
        this.otherTherapy,
        this.language,
        this.contained,
        this.id,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductContraindication#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductContraindication withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProductContraindication(
        this.subject,
        this.meta,
        this.therapeuticIndication,
        this.population,
        this.disease,
        this.implicitRules,
        newValue,
        this.comorbidity,
        this.text,
        this.diseaseStatus,
        this.otherTherapy,
        this.language,
        this.contained,
        this.id,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductContraindication#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductContraindication withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProductContraindication(
        this.subject,
        this.meta,
        this.therapeuticIndication,
        this.population,
        this.disease,
        this.implicitRules,
        value,
        this.comorbidity,
        this.text,
        this.diseaseStatus,
        this.otherTherapy,
        this.language,
        this.contained,
        this.id,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductContraindication#comorbidity() comorbidity} attribute.
   * @param value The value for comorbidity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductContraindication withComorbidity(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "comorbidity");
    if (this.comorbidity == newValue) return this;
    return new ImmutableMedicinalProductContraindication(
        this.subject,
        this.meta,
        this.therapeuticIndication,
        this.population,
        this.disease,
        this.implicitRules,
        this.extension,
        newValue,
        this.text,
        this.diseaseStatus,
        this.otherTherapy,
        this.language,
        this.contained,
        this.id,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductContraindication#comorbidity() comorbidity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comorbidity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductContraindication withComorbidity(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.comorbidity == value) return this;
    return new ImmutableMedicinalProductContraindication(
        this.subject,
        this.meta,
        this.therapeuticIndication,
        this.population,
        this.disease,
        this.implicitRules,
        this.extension,
        value,
        this.text,
        this.diseaseStatus,
        this.otherTherapy,
        this.language,
        this.contained,
        this.id,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductContraindication#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductContraindication withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedicinalProductContraindication(
        this.subject,
        this.meta,
        this.therapeuticIndication,
        this.population,
        this.disease,
        this.implicitRules,
        this.extension,
        this.comorbidity,
        newValue,
        this.diseaseStatus,
        this.otherTherapy,
        this.language,
        this.contained,
        this.id,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductContraindication#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductContraindication withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedicinalProductContraindication(
        this.subject,
        this.meta,
        this.therapeuticIndication,
        this.population,
        this.disease,
        this.implicitRules,
        this.extension,
        this.comorbidity,
        value,
        this.diseaseStatus,
        this.otherTherapy,
        this.language,
        this.contained,
        this.id,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductContraindication#diseaseStatus() diseaseStatus} attribute.
   * @param value The value for diseaseStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductContraindication withDiseaseStatus(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "diseaseStatus");
    if (this.diseaseStatus == newValue) return this;
    return new ImmutableMedicinalProductContraindication(
        this.subject,
        this.meta,
        this.therapeuticIndication,
        this.population,
        this.disease,
        this.implicitRules,
        this.extension,
        this.comorbidity,
        this.text,
        newValue,
        this.otherTherapy,
        this.language,
        this.contained,
        this.id,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductContraindication#diseaseStatus() diseaseStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for diseaseStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductContraindication withDiseaseStatus(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.diseaseStatus == value) return this;
    return new ImmutableMedicinalProductContraindication(
        this.subject,
        this.meta,
        this.therapeuticIndication,
        this.population,
        this.disease,
        this.implicitRules,
        this.extension,
        this.comorbidity,
        this.text,
        value,
        this.otherTherapy,
        this.language,
        this.contained,
        this.id,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductContraindication#otherTherapy() otherTherapy} attribute.
   * @param value The value for otherTherapy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductContraindication withOtherTherapy(List<MedicinalProductContraindication_OtherTherapy> value) {
    @Nullable List<MedicinalProductContraindication_OtherTherapy> newValue = Objects.requireNonNull(value, "otherTherapy");
    if (this.otherTherapy == newValue) return this;
    return new ImmutableMedicinalProductContraindication(
        this.subject,
        this.meta,
        this.therapeuticIndication,
        this.population,
        this.disease,
        this.implicitRules,
        this.extension,
        this.comorbidity,
        this.text,
        this.diseaseStatus,
        newValue,
        this.language,
        this.contained,
        this.id,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductContraindication#otherTherapy() otherTherapy} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for otherTherapy
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductContraindication withOtherTherapy(Optional<? extends List<MedicinalProductContraindication_OtherTherapy>> optional) {
    @Nullable List<MedicinalProductContraindication_OtherTherapy> value = optional.orElse(null);
    if (this.otherTherapy == value) return this;
    return new ImmutableMedicinalProductContraindication(
        this.subject,
        this.meta,
        this.therapeuticIndication,
        this.population,
        this.disease,
        this.implicitRules,
        this.extension,
        this.comorbidity,
        this.text,
        this.diseaseStatus,
        value,
        this.language,
        this.contained,
        this.id,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductContraindication#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductContraindication withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedicinalProductContraindication(
        this.subject,
        this.meta,
        this.therapeuticIndication,
        this.population,
        this.disease,
        this.implicitRules,
        this.extension,
        this.comorbidity,
        this.text,
        this.diseaseStatus,
        this.otherTherapy,
        newValue,
        this.contained,
        this.id,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductContraindication#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductContraindication withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedicinalProductContraindication(
        this.subject,
        this.meta,
        this.therapeuticIndication,
        this.population,
        this.disease,
        this.implicitRules,
        this.extension,
        this.comorbidity,
        this.text,
        this.diseaseStatus,
        this.otherTherapy,
        value,
        this.contained,
        this.id,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductContraindication#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductContraindication withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedicinalProductContraindication(
        this.subject,
        this.meta,
        this.therapeuticIndication,
        this.population,
        this.disease,
        this.implicitRules,
        this.extension,
        this.comorbidity,
        this.text,
        this.diseaseStatus,
        this.otherTherapy,
        this.language,
        newValue,
        this.id,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductContraindication#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductContraindication withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedicinalProductContraindication(
        this.subject,
        this.meta,
        this.therapeuticIndication,
        this.population,
        this.disease,
        this.implicitRules,
        this.extension,
        this.comorbidity,
        this.text,
        this.diseaseStatus,
        this.otherTherapy,
        this.language,
        value,
        this.id,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductContraindication#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductContraindication withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedicinalProductContraindication(
        this.subject,
        this.meta,
        this.therapeuticIndication,
        this.population,
        this.disease,
        this.implicitRules,
        this.extension,
        this.comorbidity,
        this.text,
        this.diseaseStatus,
        this.otherTherapy,
        this.language,
        this.contained,
        newValue,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductContraindication#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductContraindication withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedicinalProductContraindication(
        this.subject,
        this.meta,
        this.therapeuticIndication,
        this.population,
        this.disease,
        this.implicitRules,
        this.extension,
        this.comorbidity,
        this.text,
        this.diseaseStatus,
        this.otherTherapy,
        this.language,
        this.contained,
        value,
        this.resourceType,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProductContraindication#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProductContraindication withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedicinalProductContraindication(
        this.subject,
        this.meta,
        this.therapeuticIndication,
        this.population,
        this.disease,
        this.implicitRules,
        this.extension,
        this.comorbidity,
        this.text,
        this.diseaseStatus,
        this.otherTherapy,
        this.language,
        this.contained,
        this.id,
        newValue,
        this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProductContraindication#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProductContraindication withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProductContraindication(
        this.subject,
        this.meta,
        this.therapeuticIndication,
        this.population,
        this.disease,
        this.implicitRules,
        this.extension,
        this.comorbidity,
        this.text,
        this.diseaseStatus,
        this.otherTherapy,
        this.language,
        this.contained,
        this.id,
        this.resourceType,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProductContraindication#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProductContraindication withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProductContraindication(
        this.subject,
        this.meta,
        this.therapeuticIndication,
        this.population,
        this.disease,
        this.implicitRules,
        this.extension,
        this.comorbidity,
        this.text,
        this.diseaseStatus,
        this.otherTherapy,
        this.language,
        this.contained,
        this.id,
        this.resourceType,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProductContraindication} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProductContraindication
        && equalTo((ImmutableMedicinalProductContraindication) another);
  }

  private boolean equalTo(ImmutableMedicinalProductContraindication another) {
    return Objects.equals(subject, another.subject)
        && Objects.equals(meta, another.meta)
        && Objects.equals(therapeuticIndication, another.therapeuticIndication)
        && Objects.equals(population, another.population)
        && Objects.equals(disease, another.disease)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(extension, another.extension)
        && Objects.equals(comorbidity, another.comorbidity)
        && Objects.equals(text, another.text)
        && Objects.equals(diseaseStatus, another.diseaseStatus)
        && Objects.equals(otherTherapy, another.otherTherapy)
        && Objects.equals(language, another.language)
        && Objects.equals(contained, another.contained)
        && Objects.equals(id, another.id)
        && resourceType.equals(another.resourceType)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code subject}, {@code meta}, {@code therapeuticIndication}, {@code population}, {@code disease}, {@code implicitRules}, {@code extension}, {@code comorbidity}, {@code text}, {@code diseaseStatus}, {@code otherTherapy}, {@code language}, {@code contained}, {@code id}, {@code resourceType}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(subject);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(therapeuticIndication);
    h += (h << 5) + Objects.hashCode(population);
    h += (h << 5) + Objects.hashCode(disease);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(comorbidity);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(diseaseStatus);
    h += (h << 5) + Objects.hashCode(otherTherapy);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProductContraindication} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicinalProductContraindication{");
    if (subject != null) {
      builder.append("subject=").append(subject);
    }
    if (meta != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (therapeuticIndication != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("therapeuticIndication=").append(therapeuticIndication);
    }
    if (population != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("population=").append(population);
    }
    if (disease != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("disease=").append(disease);
    }
    if (implicitRules != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (extension != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (comorbidity != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("comorbidity=").append(comorbidity);
    }
    if (text != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("text=").append(text);
    }
    if (diseaseStatus != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("diseaseStatus=").append(diseaseStatus);
    }
    if (otherTherapy != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("otherTherapy=").append(otherTherapy);
    }
    if (language != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("language=").append(language);
    }
    if (contained != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (id != null) {
      if (builder.length() > 33) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (builder.length() > 33) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
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
  @Generated(from = "MedicinalProductContraindication", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicinalProductContraindication {
    @Nullable Optional<List<Reference>> subject = Optional.empty();
    boolean subjectIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<Reference>> therapeuticIndication = Optional.empty();
    boolean therapeuticIndicationIsSet;
    @Nullable Optional<List<Population>> population = Optional.empty();
    boolean populationIsSet;
    @Nullable Optional<CodeableConcept> disease = Optional.empty();
    boolean diseaseIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<CodeableConcept>> comorbidity = Optional.empty();
    boolean comorbidityIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<CodeableConcept> diseaseStatus = Optional.empty();
    boolean diseaseStatusIsSet;
    @Nullable Optional<List<MedicinalProductContraindication_OtherTherapy>> otherTherapy = Optional.empty();
    boolean otherTherapyIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("subject")
    public void setSubject(Optional<List<Reference>> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("therapeuticIndication")
    public void setTherapeuticIndication(Optional<List<Reference>> therapeuticIndication) {
      this.therapeuticIndication = therapeuticIndication;
      this.therapeuticIndicationIsSet = true;
    }
    @JsonProperty("population")
    public void setPopulation(Optional<List<Population>> population) {
      this.population = population;
      this.populationIsSet = true;
    }
    @JsonProperty("disease")
    public void setDisease(Optional<CodeableConcept> disease) {
      this.disease = disease;
      this.diseaseIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("comorbidity")
    public void setComorbidity(Optional<List<CodeableConcept>> comorbidity) {
      this.comorbidity = comorbidity;
      this.comorbidityIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("diseaseStatus")
    public void setDiseaseStatus(Optional<CodeableConcept> diseaseStatus) {
      this.diseaseStatus = diseaseStatus;
      this.diseaseStatusIsSet = true;
    }
    @JsonProperty("otherTherapy")
    public void setOtherTherapy(Optional<List<MedicinalProductContraindication_OtherTherapy>> otherTherapy) {
      this.otherTherapy = otherTherapy;
      this.otherTherapyIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<List<Reference>> subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> therapeuticIndication() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Population>> population() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> disease() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> comorbidity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> diseaseStatus() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MedicinalProductContraindication_OtherTherapy>> otherTherapy() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
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
  static ImmutableMedicinalProductContraindication fromJson(Json json) {
    ImmutableMedicinalProductContraindication.Builder builder = ((ImmutableMedicinalProductContraindication.Builder) ImmutableMedicinalProductContraindication.builder());
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.therapeuticIndicationIsSet) {
      builder.therapeuticIndication(json.therapeuticIndication);
    }
    if (json.populationIsSet) {
      builder.population(json.population);
    }
    if (json.diseaseIsSet) {
      builder.disease(json.disease);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.comorbidityIsSet) {
      builder.comorbidity(json.comorbidity);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.diseaseStatusIsSet) {
      builder.diseaseStatus(json.diseaseStatus);
    }
    if (json.otherTherapyIsSet) {
      builder.otherTherapy(json.otherTherapy);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableMedicinalProductContraindication) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicinalProductContraindication} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicinalProductContraindication instance
   */
  public static MedicinalProductContraindication copyOf(MedicinalProductContraindication instance) {
    if (instance instanceof ImmutableMedicinalProductContraindication) {
      return (ImmutableMedicinalProductContraindication) instance;
    }
    return ((ImmutableMedicinalProductContraindication.Builder) ImmutableMedicinalProductContraindication.builder())
        .subject(instance.subject())
        .meta(instance.meta())
        .therapeuticIndication(instance.therapeuticIndication())
        .population(instance.population())
        .disease(instance.disease())
        .implicitRules(instance.implicitRules())
        .extension(instance.extension())
        .comorbidity(instance.comorbidity())
        .text(instance.text())
        .diseaseStatus(instance.diseaseStatus())
        .otherTherapy(instance.otherTherapy())
        .language(instance.language())
        .contained(instance.contained())
        .id(instance.id())
        .resourceType(instance.resourceType())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProductContraindication MedicinalProductContraindication}.
   * <pre>
   * ImmutableMedicinalProductContraindication.builder()
   *    .subject(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MedicinalProductContraindication#subject() subject}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link MedicinalProductContraindication#meta() meta}
   *    .therapeuticIndication(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link MedicinalProductContraindication#therapeuticIndication() therapeuticIndication}
   *    .population(List&amp;lt;com.medplum.types.fhir.Population&amp;gt;) // optional {@link MedicinalProductContraindication#population() population}
   *    .disease(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicinalProductContraindication#disease() disease}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link MedicinalProductContraindication#implicitRules() implicitRules}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProductContraindication#extension() extension}
   *    .comorbidity(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link MedicinalProductContraindication#comorbidity() comorbidity}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link MedicinalProductContraindication#text() text}
   *    .diseaseStatus(com.medplum.types.fhir.CodeableConcept) // optional {@link MedicinalProductContraindication#diseaseStatus() diseaseStatus}
   *    .otherTherapy(List&amp;lt;com.medplum.types.fhir.MedicinalProductContraindication_OtherTherapy&amp;gt;) // optional {@link MedicinalProductContraindication#otherTherapy() otherTherapy}
   *    .language(com.medplum.types.fhir.Code) // optional {@link MedicinalProductContraindication#language() language}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link MedicinalProductContraindication#contained() contained}
   *    .id(com.medplum.types.fhir.Id) // optional {@link MedicinalProductContraindication#id() id}
   *    .resourceType(String) // required {@link MedicinalProductContraindication#resourceType() resourceType}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProductContraindication#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new MedicinalProductContraindication builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableMedicinalProductContraindication.Builder();
  }

  /**
   * Builds instances of type {@link MedicinalProductContraindication MedicinalProductContraindication}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "MedicinalProductContraindication", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_SUBJECT = 0x1L;
    private static final long OPT_BIT_META = 0x2L;
    private static final long OPT_BIT_THERAPEUTIC_INDICATION = 0x4L;
    private static final long OPT_BIT_POPULATION = 0x8L;
    private static final long OPT_BIT_DISEASE = 0x10L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private static final long OPT_BIT_COMORBIDITY = 0x80L;
    private static final long OPT_BIT_TEXT = 0x100L;
    private static final long OPT_BIT_DISEASE_STATUS = 0x200L;
    private static final long OPT_BIT_OTHER_THERAPY = 0x400L;
    private static final long OPT_BIT_LANGUAGE = 0x800L;
    private static final long OPT_BIT_CONTAINED = 0x1000L;
    private static final long OPT_BIT_ID = 0x2000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Reference> subject;
    private @Nullable Meta meta;
    private @Nullable List<Reference> therapeuticIndication;
    private @Nullable List<Population> population;
    private @Nullable CodeableConcept disease;
    private @Nullable Uri implicitRules;
    private @Nullable List<Extension> extension;
    private @Nullable List<CodeableConcept> comorbidity;
    private @Nullable Narrative text;
    private @Nullable CodeableConcept diseaseStatus;
    private @Nullable List<MedicinalProductContraindication_OtherTherapy> otherTherapy;
    private @Nullable Code language;
    private @Nullable List<ResourceList> contained;
    private @Nullable Id id;
    private @Nullable String resourceType;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#subject() subject} to subject.
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
     * Initializes the optional value {@link MedicinalProductContraindication#subject() subject} to subject.
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
     * Initializes the optional value {@link MedicinalProductContraindication#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicinalProductContraindication#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicinalProductContraindication#therapeuticIndication() therapeuticIndication} to therapeuticIndication.
     * @param therapeuticIndication The value for therapeuticIndication
     * @return {@code this} builder for chained invocation
     */
    public final Builder therapeuticIndication(List<Reference> therapeuticIndication) {
      checkNotIsSet(therapeuticIndicationIsSet(), "therapeuticIndication");
      this.therapeuticIndication = Objects.requireNonNull(therapeuticIndication, "therapeuticIndication");
      optBits |= OPT_BIT_THERAPEUTIC_INDICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#therapeuticIndication() therapeuticIndication} to therapeuticIndication.
     * @param therapeuticIndication The value for therapeuticIndication
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("therapeuticIndication")
    public final Builder therapeuticIndication(Optional<? extends List<Reference>> therapeuticIndication) {
      checkNotIsSet(therapeuticIndicationIsSet(), "therapeuticIndication");
      this.therapeuticIndication = therapeuticIndication.orElse(null);
      optBits |= OPT_BIT_THERAPEUTIC_INDICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#population() population} to population.
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
     * Initializes the optional value {@link MedicinalProductContraindication#population() population} to population.
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
     * Initializes the optional value {@link MedicinalProductContraindication#disease() disease} to disease.
     * @param disease The value for disease
     * @return {@code this} builder for chained invocation
     */
    public final Builder disease(CodeableConcept disease) {
      checkNotIsSet(diseaseIsSet(), "disease");
      this.disease = Objects.requireNonNull(disease, "disease");
      optBits |= OPT_BIT_DISEASE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#disease() disease} to disease.
     * @param disease The value for disease
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("disease")
    public final Builder disease(Optional<? extends CodeableConcept> disease) {
      checkNotIsSet(diseaseIsSet(), "disease");
      this.disease = disease.orElse(null);
      optBits |= OPT_BIT_DISEASE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProductContraindication#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProductContraindication#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductContraindication#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProductContraindication#comorbidity() comorbidity} to comorbidity.
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
     * Initializes the optional value {@link MedicinalProductContraindication#comorbidity() comorbidity} to comorbidity.
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
     * Initializes the optional value {@link MedicinalProductContraindication#text() text} to text.
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
     * Initializes the optional value {@link MedicinalProductContraindication#text() text} to text.
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
     * Initializes the optional value {@link MedicinalProductContraindication#diseaseStatus() diseaseStatus} to diseaseStatus.
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
     * Initializes the optional value {@link MedicinalProductContraindication#diseaseStatus() diseaseStatus} to diseaseStatus.
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
     * Initializes the optional value {@link MedicinalProductContraindication#otherTherapy() otherTherapy} to otherTherapy.
     * @param otherTherapy The value for otherTherapy
     * @return {@code this} builder for chained invocation
     */
    public final Builder otherTherapy(List<MedicinalProductContraindication_OtherTherapy> otherTherapy) {
      checkNotIsSet(otherTherapyIsSet(), "otherTherapy");
      this.otherTherapy = Objects.requireNonNull(otherTherapy, "otherTherapy");
      optBits |= OPT_BIT_OTHER_THERAPY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#otherTherapy() otherTherapy} to otherTherapy.
     * @param otherTherapy The value for otherTherapy
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("otherTherapy")
    public final Builder otherTherapy(Optional<? extends List<MedicinalProductContraindication_OtherTherapy>> otherTherapy) {
      checkNotIsSet(otherTherapyIsSet(), "otherTherapy");
      this.otherTherapy = otherTherapy.orElse(null);
      optBits |= OPT_BIT_OTHER_THERAPY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProductContraindication#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProductContraindication#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProductContraindication#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProductContraindication#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProductContraindication#id() id} to id.
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
     * Initializes the value for the {@link MedicinalProductContraindication#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link MedicinalProductContraindication#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProductContraindication#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link MedicinalProductContraindication MedicinalProductContraindication}.
     * @return An immutable instance of MedicinalProductContraindication
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicinalProductContraindication build() {
      checkRequiredAttributes();
      return new ImmutableMedicinalProductContraindication(
          subject,
          meta,
          therapeuticIndication,
          population,
          disease,
          implicitRules,
          extension,
          comorbidity,
          text,
          diseaseStatus,
          otherTherapy,
          language,
          contained,
          id,
          resourceType,
          modifierExtension);
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean therapeuticIndicationIsSet() {
      return (optBits & OPT_BIT_THERAPEUTIC_INDICATION) != 0;
    }

    private boolean populationIsSet() {
      return (optBits & OPT_BIT_POPULATION) != 0;
    }

    private boolean diseaseIsSet() {
      return (optBits & OPT_BIT_DISEASE) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean comorbidityIsSet() {
      return (optBits & OPT_BIT_COMORBIDITY) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean diseaseStatusIsSet() {
      return (optBits & OPT_BIT_DISEASE_STATUS) != 0;
    }

    private boolean otherTherapyIsSet() {
      return (optBits & OPT_BIT_OTHER_THERAPY) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicinalProductContraindication is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build MedicinalProductContraindication, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MedicinalProductContraindication", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProductContraindication#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "MedicinalProductContraindication", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(List<Reference> subject);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(Optional<? extends List<Reference>> subject);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#therapeuticIndication() therapeuticIndication} to therapeuticIndication.
     * @param therapeuticIndication The value for therapeuticIndication
     * @return {@code this} builder for chained invocation
     */
    BuildFinal therapeuticIndication(List<Reference> therapeuticIndication);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#therapeuticIndication() therapeuticIndication} to therapeuticIndication.
     * @param therapeuticIndication The value for therapeuticIndication
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal therapeuticIndication(Optional<? extends List<Reference>> therapeuticIndication);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#population() population} to population.
     * @param population The value for population
     * @return {@code this} builder for chained invocation
     */
    BuildFinal population(List<Population> population);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#population() population} to population.
     * @param population The value for population
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal population(Optional<? extends List<Population>> population);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#disease() disease} to disease.
     * @param disease The value for disease
     * @return {@code this} builder for chained invocation
     */
    BuildFinal disease(CodeableConcept disease);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#disease() disease} to disease.
     * @param disease The value for disease
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal disease(Optional<? extends CodeableConcept> disease);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#comorbidity() comorbidity} to comorbidity.
     * @param comorbidity The value for comorbidity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal comorbidity(List<CodeableConcept> comorbidity);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#comorbidity() comorbidity} to comorbidity.
     * @param comorbidity The value for comorbidity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal comorbidity(Optional<? extends List<CodeableConcept>> comorbidity);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#diseaseStatus() diseaseStatus} to diseaseStatus.
     * @param diseaseStatus The value for diseaseStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal diseaseStatus(CodeableConcept diseaseStatus);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#diseaseStatus() diseaseStatus} to diseaseStatus.
     * @param diseaseStatus The value for diseaseStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal diseaseStatus(Optional<? extends CodeableConcept> diseaseStatus);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#otherTherapy() otherTherapy} to otherTherapy.
     * @param otherTherapy The value for otherTherapy
     * @return {@code this} builder for chained invocation
     */
    BuildFinal otherTherapy(List<MedicinalProductContraindication_OtherTherapy> otherTherapy);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#otherTherapy() otherTherapy} to otherTherapy.
     * @param otherTherapy The value for otherTherapy
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal otherTherapy(Optional<? extends List<MedicinalProductContraindication_OtherTherapy>> otherTherapy);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProductContraindication#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Builds a new {@link MedicinalProductContraindication MedicinalProductContraindication}.
     * @return An immutable instance of MedicinalProductContraindication
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicinalProductContraindication build();
  }
}

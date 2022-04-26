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
 * Immutable implementation of {@link GuidanceResponse}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableGuidanceResponse.builder()}.
 */
@Generated(from = "GuidanceResponse", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableGuidanceResponse implements GuidanceResponse {
  private final @Nullable List<Extension> modifierExtension;
  private final String resourceType;
  private final @Nullable List<Reference> evaluationMessage;
  private final @Nullable Reference encounter;
  private final @Nullable Uri implicitRules;
  private final @Nullable String moduleCanonical;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Id id;
  private final @Nullable List<Annotation> note;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Identifier requestIdentifier;
  private final @Nullable Narrative text;
  private final @Nullable Reference result;
  private final @Nullable DateTime occurrenceDateTime;
  private final @Nullable String moduleUri;
  private final @Nullable Reference outputParameters;
  private final @Nullable Code language;
  private final @Nullable Reference subject;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<CodeableConcept> reasonCode;
  private final @Nullable List<Reference> reasonReference;
  private final @Nullable CodeableConcept moduleCodeableConcept;
  private final @Nullable List<DataRequirement> dataRequirement;
  private final @Nullable Reference performer;
  private final @Nullable Meta meta;
  private final @Nullable GuidanceresponseStatus status;

  private ImmutableGuidanceResponse(
      @Nullable List<Extension> modifierExtension,
      String resourceType,
      @Nullable List<Reference> evaluationMessage,
      @Nullable Reference encounter,
      @Nullable Uri implicitRules,
      @Nullable String moduleCanonical,
      @Nullable List<Identifier> identifier,
      @Nullable Id id,
      @Nullable List<Annotation> note,
      @Nullable List<ResourceList> contained,
      @Nullable Identifier requestIdentifier,
      @Nullable Narrative text,
      @Nullable Reference result,
      @Nullable DateTime occurrenceDateTime,
      @Nullable String moduleUri,
      @Nullable Reference outputParameters,
      @Nullable Code language,
      @Nullable Reference subject,
      @Nullable List<Extension> extension,
      @Nullable List<CodeableConcept> reasonCode,
      @Nullable List<Reference> reasonReference,
      @Nullable CodeableConcept moduleCodeableConcept,
      @Nullable List<DataRequirement> dataRequirement,
      @Nullable Reference performer,
      @Nullable Meta meta,
      @Nullable GuidanceresponseStatus status) {
    this.modifierExtension = modifierExtension;
    this.resourceType = resourceType;
    this.evaluationMessage = evaluationMessage;
    this.encounter = encounter;
    this.implicitRules = implicitRules;
    this.moduleCanonical = moduleCanonical;
    this.identifier = identifier;
    this.id = id;
    this.note = note;
    this.contained = contained;
    this.requestIdentifier = requestIdentifier;
    this.text = text;
    this.result = result;
    this.occurrenceDateTime = occurrenceDateTime;
    this.moduleUri = moduleUri;
    this.outputParameters = outputParameters;
    this.language = language;
    this.subject = subject;
    this.extension = extension;
    this.reasonCode = reasonCode;
    this.reasonReference = reasonReference;
    this.moduleCodeableConcept = moduleCodeableConcept;
    this.dataRequirement = dataRequirement;
    this.performer = performer;
    this.meta = meta;
    this.status = status;
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code evaluationMessage} attribute
   */
  @JsonProperty("evaluationMessage")
  @Override
  public Optional<List<Reference>> evaluationMessage() {
    return Optional.ofNullable(evaluationMessage);
  }

  /**
   * @return The value of the {@code encounter} attribute
   */
  @JsonProperty("encounter")
  @Override
  public Optional<Reference> encounter() {
    return Optional.ofNullable(encounter);
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
   * @return The value of the {@code moduleCanonical} attribute
   */
  @JsonProperty("moduleCanonical")
  @Override
  public Optional<String> moduleCanonical() {
    return Optional.ofNullable(moduleCanonical);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
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
   * @return The value of the {@code note} attribute
   */
  @JsonProperty("note")
  @Override
  public Optional<List<Annotation>> note() {
    return Optional.ofNullable(note);
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
   * @return The value of the {@code requestIdentifier} attribute
   */
  @JsonProperty("requestIdentifier")
  @Override
  public Optional<Identifier> requestIdentifier() {
    return Optional.ofNullable(requestIdentifier);
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
   * @return The value of the {@code result} attribute
   */
  @JsonProperty("result")
  @Override
  public Optional<Reference> result() {
    return Optional.ofNullable(result);
  }

  /**
   * @return The value of the {@code occurrenceDateTime} attribute
   */
  @JsonProperty("occurrenceDateTime")
  @Override
  public Optional<DateTime> occurrenceDateTime() {
    return Optional.ofNullable(occurrenceDateTime);
  }

  /**
   * @return The value of the {@code moduleUri} attribute
   */
  @JsonProperty("moduleUri")
  @Override
  public Optional<String> moduleUri() {
    return Optional.ofNullable(moduleUri);
  }

  /**
   * @return The value of the {@code outputParameters} attribute
   */
  @JsonProperty("outputParameters")
  @Override
  public Optional<Reference> outputParameters() {
    return Optional.ofNullable(outputParameters);
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
   * @return The value of the {@code subject} attribute
   */
  @JsonProperty("subject")
  @Override
  public Optional<Reference> subject() {
    return Optional.ofNullable(subject);
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
   * @return The value of the {@code reasonCode} attribute
   */
  @JsonProperty("reasonCode")
  @Override
  public Optional<List<CodeableConcept>> reasonCode() {
    return Optional.ofNullable(reasonCode);
  }

  /**
   * @return The value of the {@code reasonReference} attribute
   */
  @JsonProperty("reasonReference")
  @Override
  public Optional<List<Reference>> reasonReference() {
    return Optional.ofNullable(reasonReference);
  }

  /**
   * @return The value of the {@code moduleCodeableConcept} attribute
   */
  @JsonProperty("moduleCodeableConcept")
  @Override
  public Optional<CodeableConcept> moduleCodeableConcept() {
    return Optional.ofNullable(moduleCodeableConcept);
  }

  /**
   * @return The value of the {@code dataRequirement} attribute
   */
  @JsonProperty("dataRequirement")
  @Override
  public Optional<List<DataRequirement>> dataRequirement() {
    return Optional.ofNullable(dataRequirement);
  }

  /**
   * @return The value of the {@code performer} attribute
   */
  @JsonProperty("performer")
  @Override
  public Optional<Reference> performer() {
    return Optional.ofNullable(performer);
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<GuidanceresponseStatus> status() {
    return Optional.ofNullable(status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableGuidanceResponse(
        newValue,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableGuidanceResponse(
        value,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link GuidanceResponse#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableGuidanceResponse withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        newValue,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#evaluationMessage() evaluationMessage} attribute.
   * @param value The value for evaluationMessage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withEvaluationMessage(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "evaluationMessage");
    if (this.evaluationMessage == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        newValue,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#evaluationMessage() evaluationMessage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for evaluationMessage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withEvaluationMessage(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.evaluationMessage == value) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        value,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withEncounter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        newValue,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withEncounter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        value,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        newValue,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        value,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#moduleCanonical() moduleCanonical} attribute.
   * @param value The value for moduleCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withModuleCanonical(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "moduleCanonical");
    if (Objects.equals(this.moduleCanonical, newValue)) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        newValue,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#moduleCanonical() moduleCanonical} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for moduleCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withModuleCanonical(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.moduleCanonical, value)) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        value,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        newValue,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        value,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        newValue,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        value,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        newValue,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        value,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        newValue,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        value,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#requestIdentifier() requestIdentifier} attribute.
   * @param value The value for requestIdentifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withRequestIdentifier(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "requestIdentifier");
    if (this.requestIdentifier == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        newValue,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#requestIdentifier() requestIdentifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requestIdentifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withRequestIdentifier(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.requestIdentifier == value) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        value,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        newValue,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        value,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#result() result} attribute.
   * @param value The value for result
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withResult(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "result");
    if (this.result == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        newValue,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#result() result} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for result
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withResult(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.result == value) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        value,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#occurrenceDateTime() occurrenceDateTime} attribute.
   * @param value The value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withOccurrenceDateTime(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "occurrenceDateTime");
    if (this.occurrenceDateTime == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        newValue,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#occurrenceDateTime() occurrenceDateTime} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withOccurrenceDateTime(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.occurrenceDateTime == value) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        value,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#moduleUri() moduleUri} attribute.
   * @param value The value for moduleUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withModuleUri(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "moduleUri");
    if (Objects.equals(this.moduleUri, newValue)) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        newValue,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#moduleUri() moduleUri} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for moduleUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withModuleUri(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.moduleUri, value)) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        value,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#outputParameters() outputParameters} attribute.
   * @param value The value for outputParameters
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withOutputParameters(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "outputParameters");
    if (this.outputParameters == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        newValue,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#outputParameters() outputParameters} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for outputParameters
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withOutputParameters(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.outputParameters == value) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        value,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        newValue,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        value,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withSubject(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        newValue,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withSubject(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        value,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        newValue,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        value,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withReasonCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        newValue,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withReasonCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        value,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withReasonReference(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        newValue,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withReasonReference(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        value,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#moduleCodeableConcept() moduleCodeableConcept} attribute.
   * @param value The value for moduleCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withModuleCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "moduleCodeableConcept");
    if (this.moduleCodeableConcept == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        newValue,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#moduleCodeableConcept() moduleCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for moduleCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withModuleCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.moduleCodeableConcept == value) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        value,
        this.dataRequirement,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#dataRequirement() dataRequirement} attribute.
   * @param value The value for dataRequirement
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withDataRequirement(List<DataRequirement> value) {
    @Nullable List<DataRequirement> newValue = Objects.requireNonNull(value, "dataRequirement");
    if (this.dataRequirement == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        newValue,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#dataRequirement() dataRequirement} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dataRequirement
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withDataRequirement(Optional<? extends List<DataRequirement>> optional) {
    @Nullable List<DataRequirement> value = optional.orElse(null);
    if (this.dataRequirement == value) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        value,
        this.performer,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withPerformer(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        newValue,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withPerformer(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        value,
        this.meta,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        newValue,
        this.status);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        value,
        this.status);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link GuidanceResponse#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableGuidanceResponse withStatus(GuidanceresponseStatus value) {
    @Nullable GuidanceresponseStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link GuidanceResponse#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableGuidanceResponse withStatus(Optional<? extends GuidanceresponseStatus> optional) {
    @Nullable GuidanceresponseStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableGuidanceResponse(
        this.modifierExtension,
        this.resourceType,
        this.evaluationMessage,
        this.encounter,
        this.implicitRules,
        this.moduleCanonical,
        this.identifier,
        this.id,
        this.note,
        this.contained,
        this.requestIdentifier,
        this.text,
        this.result,
        this.occurrenceDateTime,
        this.moduleUri,
        this.outputParameters,
        this.language,
        this.subject,
        this.extension,
        this.reasonCode,
        this.reasonReference,
        this.moduleCodeableConcept,
        this.dataRequirement,
        this.performer,
        this.meta,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableGuidanceResponse} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableGuidanceResponse
        && equalTo((ImmutableGuidanceResponse) another);
  }

  private boolean equalTo(ImmutableGuidanceResponse another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && resourceType.equals(another.resourceType)
        && Objects.equals(evaluationMessage, another.evaluationMessage)
        && Objects.equals(encounter, another.encounter)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(moduleCanonical, another.moduleCanonical)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(id, another.id)
        && Objects.equals(note, another.note)
        && Objects.equals(contained, another.contained)
        && Objects.equals(requestIdentifier, another.requestIdentifier)
        && Objects.equals(text, another.text)
        && Objects.equals(result, another.result)
        && Objects.equals(occurrenceDateTime, another.occurrenceDateTime)
        && Objects.equals(moduleUri, another.moduleUri)
        && Objects.equals(outputParameters, another.outputParameters)
        && Objects.equals(language, another.language)
        && Objects.equals(subject, another.subject)
        && Objects.equals(extension, another.extension)
        && Objects.equals(reasonCode, another.reasonCode)
        && Objects.equals(reasonReference, another.reasonReference)
        && Objects.equals(moduleCodeableConcept, another.moduleCodeableConcept)
        && Objects.equals(dataRequirement, another.dataRequirement)
        && Objects.equals(performer, another.performer)
        && Objects.equals(meta, another.meta)
        && Objects.equals(status, another.status);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code resourceType}, {@code evaluationMessage}, {@code encounter}, {@code implicitRules}, {@code moduleCanonical}, {@code identifier}, {@code id}, {@code note}, {@code contained}, {@code requestIdentifier}, {@code text}, {@code result}, {@code occurrenceDateTime}, {@code moduleUri}, {@code outputParameters}, {@code language}, {@code subject}, {@code extension}, {@code reasonCode}, {@code reasonReference}, {@code moduleCodeableConcept}, {@code dataRequirement}, {@code performer}, {@code meta}, {@code status}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(evaluationMessage);
    h += (h << 5) + Objects.hashCode(encounter);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(moduleCanonical);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(requestIdentifier);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(result);
    h += (h << 5) + Objects.hashCode(occurrenceDateTime);
    h += (h << 5) + Objects.hashCode(moduleUri);
    h += (h << 5) + Objects.hashCode(outputParameters);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(subject);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(reasonCode);
    h += (h << 5) + Objects.hashCode(reasonReference);
    h += (h << 5) + Objects.hashCode(moduleCodeableConcept);
    h += (h << 5) + Objects.hashCode(dataRequirement);
    h += (h << 5) + Objects.hashCode(performer);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(status);
    return h;
  }

  /**
   * Prints the immutable value {@code GuidanceResponse} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("GuidanceResponse{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 17) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (evaluationMessage != null) {
      builder.append(", ");
      builder.append("evaluationMessage=").append(evaluationMessage);
    }
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (moduleCanonical != null) {
      builder.append(", ");
      builder.append("moduleCanonical=").append(moduleCanonical);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (requestIdentifier != null) {
      builder.append(", ");
      builder.append("requestIdentifier=").append(requestIdentifier);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (result != null) {
      builder.append(", ");
      builder.append("result=").append(result);
    }
    if (occurrenceDateTime != null) {
      builder.append(", ");
      builder.append("occurrenceDateTime=").append(occurrenceDateTime);
    }
    if (moduleUri != null) {
      builder.append(", ");
      builder.append("moduleUri=").append(moduleUri);
    }
    if (outputParameters != null) {
      builder.append(", ");
      builder.append("outputParameters=").append(outputParameters);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (subject != null) {
      builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (reasonReference != null) {
      builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (moduleCodeableConcept != null) {
      builder.append(", ");
      builder.append("moduleCodeableConcept=").append(moduleCodeableConcept);
    }
    if (dataRequirement != null) {
      builder.append(", ");
      builder.append("dataRequirement=").append(dataRequirement);
    }
    if (performer != null) {
      builder.append(", ");
      builder.append("performer=").append(performer);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "GuidanceResponse", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements GuidanceResponse {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<Reference>> evaluationMessage = Optional.empty();
    boolean evaluationMessageIsSet;
    @Nullable Optional<Reference> encounter = Optional.empty();
    boolean encounterIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<String> moduleCanonical = Optional.empty();
    boolean moduleCanonicalIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Identifier> requestIdentifier = Optional.empty();
    boolean requestIdentifierIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Reference> result = Optional.empty();
    boolean resultIsSet;
    @Nullable Optional<DateTime> occurrenceDateTime = Optional.empty();
    boolean occurrenceDateTimeIsSet;
    @Nullable Optional<String> moduleUri = Optional.empty();
    boolean moduleUriIsSet;
    @Nullable Optional<Reference> outputParameters = Optional.empty();
    boolean outputParametersIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Reference> subject = Optional.empty();
    boolean subjectIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<CodeableConcept>> reasonCode = Optional.empty();
    boolean reasonCodeIsSet;
    @Nullable Optional<List<Reference>> reasonReference = Optional.empty();
    boolean reasonReferenceIsSet;
    @Nullable Optional<CodeableConcept> moduleCodeableConcept = Optional.empty();
    boolean moduleCodeableConceptIsSet;
    @Nullable Optional<List<DataRequirement>> dataRequirement = Optional.empty();
    boolean dataRequirementIsSet;
    @Nullable Optional<Reference> performer = Optional.empty();
    boolean performerIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<GuidanceresponseStatus> status = Optional.empty();
    boolean statusIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("evaluationMessage")
    public void setEvaluationMessage(Optional<List<Reference>> evaluationMessage) {
      this.evaluationMessage = evaluationMessage;
      this.evaluationMessageIsSet = true;
    }
    @JsonProperty("encounter")
    public void setEncounter(Optional<Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("moduleCanonical")
    public void setModuleCanonical(Optional<String> moduleCanonical) {
      this.moduleCanonical = moduleCanonical;
      this.moduleCanonicalIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("requestIdentifier")
    public void setRequestIdentifier(Optional<Identifier> requestIdentifier) {
      this.requestIdentifier = requestIdentifier;
      this.requestIdentifierIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("result")
    public void setResult(Optional<Reference> result) {
      this.result = result;
      this.resultIsSet = true;
    }
    @JsonProperty("occurrenceDateTime")
    public void setOccurrenceDateTime(Optional<DateTime> occurrenceDateTime) {
      this.occurrenceDateTime = occurrenceDateTime;
      this.occurrenceDateTimeIsSet = true;
    }
    @JsonProperty("moduleUri")
    public void setModuleUri(Optional<String> moduleUri) {
      this.moduleUri = moduleUri;
      this.moduleUriIsSet = true;
    }
    @JsonProperty("outputParameters")
    public void setOutputParameters(Optional<Reference> outputParameters) {
      this.outputParameters = outputParameters;
      this.outputParametersIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Optional<Reference> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("reasonCode")
    public void setReasonCode(Optional<List<CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @JsonProperty("reasonReference")
    public void setReasonReference(Optional<List<Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @JsonProperty("moduleCodeableConcept")
    public void setModuleCodeableConcept(Optional<CodeableConcept> moduleCodeableConcept) {
      this.moduleCodeableConcept = moduleCodeableConcept;
      this.moduleCodeableConceptIsSet = true;
    }
    @JsonProperty("dataRequirement")
    public void setDataRequirement(Optional<List<DataRequirement>> dataRequirement) {
      this.dataRequirement = dataRequirement;
      this.dataRequirementIsSet = true;
    }
    @JsonProperty("performer")
    public void setPerformer(Optional<Reference> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<GuidanceresponseStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> evaluationMessage() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> moduleCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> requestIdentifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> result() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> occurrenceDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> moduleUri() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> outputParameters() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> moduleCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<DataRequirement>> dataRequirement() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> performer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<GuidanceresponseStatus> status() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableGuidanceResponse fromJson(Json json) {
    ImmutableGuidanceResponse.Builder builder = ((ImmutableGuidanceResponse.Builder) ImmutableGuidanceResponse.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.evaluationMessageIsSet) {
      builder.evaluationMessage(json.evaluationMessage);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.moduleCanonicalIsSet) {
      builder.moduleCanonical(json.moduleCanonical);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.requestIdentifierIsSet) {
      builder.requestIdentifier(json.requestIdentifier);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.resultIsSet) {
      builder.result(json.result);
    }
    if (json.occurrenceDateTimeIsSet) {
      builder.occurrenceDateTime(json.occurrenceDateTime);
    }
    if (json.moduleUriIsSet) {
      builder.moduleUri(json.moduleUri);
    }
    if (json.outputParametersIsSet) {
      builder.outputParameters(json.outputParameters);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.moduleCodeableConceptIsSet) {
      builder.moduleCodeableConcept(json.moduleCodeableConcept);
    }
    if (json.dataRequirementIsSet) {
      builder.dataRequirement(json.dataRequirement);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    return (ImmutableGuidanceResponse) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link GuidanceResponse} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable GuidanceResponse instance
   */
  public static GuidanceResponse copyOf(GuidanceResponse instance) {
    if (instance instanceof ImmutableGuidanceResponse) {
      return (ImmutableGuidanceResponse) instance;
    }
    return ((ImmutableGuidanceResponse.Builder) ImmutableGuidanceResponse.builder())
        .modifierExtension(instance.modifierExtension())
        .resourceType(instance.resourceType())
        .evaluationMessage(instance.evaluationMessage())
        .encounter(instance.encounter())
        .implicitRules(instance.implicitRules())
        .moduleCanonical(instance.moduleCanonical())
        .identifier(instance.identifier())
        .id(instance.id())
        .note(instance.note())
        .contained(instance.contained())
        .requestIdentifier(instance.requestIdentifier())
        .text(instance.text())
        .result(instance.result())
        .occurrenceDateTime(instance.occurrenceDateTime())
        .moduleUri(instance.moduleUri())
        .outputParameters(instance.outputParameters())
        .language(instance.language())
        .subject(instance.subject())
        .extension(instance.extension())
        .reasonCode(instance.reasonCode())
        .reasonReference(instance.reasonReference())
        .moduleCodeableConcept(instance.moduleCodeableConcept())
        .dataRequirement(instance.dataRequirement())
        .performer(instance.performer())
        .meta(instance.meta())
        .status(instance.status())
        .build();
  }

  /**
   * Creates a builder for {@link GuidanceResponse GuidanceResponse}.
   * <pre>
   * ImmutableGuidanceResponse.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link GuidanceResponse#modifierExtension() modifierExtension}
   *    .resourceType(String) // required {@link GuidanceResponse#resourceType() resourceType}
   *    .evaluationMessage(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link GuidanceResponse#evaluationMessage() evaluationMessage}
   *    .encounter(com.medplum.types.fhir.Reference) // optional {@link GuidanceResponse#encounter() encounter}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link GuidanceResponse#implicitRules() implicitRules}
   *    .moduleCanonical(String) // optional {@link GuidanceResponse#moduleCanonical() moduleCanonical}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link GuidanceResponse#identifier() identifier}
   *    .id(com.medplum.types.fhir.Id) // optional {@link GuidanceResponse#id() id}
   *    .note(List&amp;lt;com.medplum.types.fhir.Annotation&amp;gt;) // optional {@link GuidanceResponse#note() note}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link GuidanceResponse#contained() contained}
   *    .requestIdentifier(com.medplum.types.fhir.Identifier) // optional {@link GuidanceResponse#requestIdentifier() requestIdentifier}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link GuidanceResponse#text() text}
   *    .result(com.medplum.types.fhir.Reference) // optional {@link GuidanceResponse#result() result}
   *    .occurrenceDateTime(com.medplum.types.fhir.DateTime) // optional {@link GuidanceResponse#occurrenceDateTime() occurrenceDateTime}
   *    .moduleUri(String) // optional {@link GuidanceResponse#moduleUri() moduleUri}
   *    .outputParameters(com.medplum.types.fhir.Reference) // optional {@link GuidanceResponse#outputParameters() outputParameters}
   *    .language(com.medplum.types.fhir.Code) // optional {@link GuidanceResponse#language() language}
   *    .subject(com.medplum.types.fhir.Reference) // optional {@link GuidanceResponse#subject() subject}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link GuidanceResponse#extension() extension}
   *    .reasonCode(List&amp;lt;com.medplum.types.fhir.CodeableConcept&amp;gt;) // optional {@link GuidanceResponse#reasonCode() reasonCode}
   *    .reasonReference(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link GuidanceResponse#reasonReference() reasonReference}
   *    .moduleCodeableConcept(com.medplum.types.fhir.CodeableConcept) // optional {@link GuidanceResponse#moduleCodeableConcept() moduleCodeableConcept}
   *    .dataRequirement(List&amp;lt;com.medplum.types.fhir.DataRequirement&amp;gt;) // optional {@link GuidanceResponse#dataRequirement() dataRequirement}
   *    .performer(com.medplum.types.fhir.Reference) // optional {@link GuidanceResponse#performer() performer}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link GuidanceResponse#meta() meta}
   *    .status(com.medplum.types.fhir.GuidanceresponseStatus) // optional {@link GuidanceResponse#status() status}
   *    .build();
   * </pre>
   * @return A new GuidanceResponse builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableGuidanceResponse.Builder();
  }

  /**
   * Builds instances of type {@link GuidanceResponse GuidanceResponse}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "GuidanceResponse", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_EVALUATION_MESSAGE = 0x2L;
    private static final long OPT_BIT_ENCOUNTER = 0x4L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x8L;
    private static final long OPT_BIT_MODULE_CANONICAL = 0x10L;
    private static final long OPT_BIT_IDENTIFIER = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private static final long OPT_BIT_NOTE = 0x80L;
    private static final long OPT_BIT_CONTAINED = 0x100L;
    private static final long OPT_BIT_REQUEST_IDENTIFIER = 0x200L;
    private static final long OPT_BIT_TEXT = 0x400L;
    private static final long OPT_BIT_RESULT = 0x800L;
    private static final long OPT_BIT_OCCURRENCE_DATE_TIME = 0x1000L;
    private static final long OPT_BIT_MODULE_URI = 0x2000L;
    private static final long OPT_BIT_OUTPUT_PARAMETERS = 0x4000L;
    private static final long OPT_BIT_LANGUAGE = 0x8000L;
    private static final long OPT_BIT_SUBJECT = 0x10000L;
    private static final long OPT_BIT_EXTENSION = 0x20000L;
    private static final long OPT_BIT_REASON_CODE = 0x40000L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x80000L;
    private static final long OPT_BIT_MODULE_CODEABLE_CONCEPT = 0x100000L;
    private static final long OPT_BIT_DATA_REQUIREMENT = 0x200000L;
    private static final long OPT_BIT_PERFORMER = 0x400000L;
    private static final long OPT_BIT_META = 0x800000L;
    private static final long OPT_BIT_STATUS = 0x1000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable String resourceType;
    private @Nullable List<Reference> evaluationMessage;
    private @Nullable Reference encounter;
    private @Nullable Uri implicitRules;
    private @Nullable String moduleCanonical;
    private @Nullable List<Identifier> identifier;
    private @Nullable Id id;
    private @Nullable List<Annotation> note;
    private @Nullable List<ResourceList> contained;
    private @Nullable Identifier requestIdentifier;
    private @Nullable Narrative text;
    private @Nullable Reference result;
    private @Nullable DateTime occurrenceDateTime;
    private @Nullable String moduleUri;
    private @Nullable Reference outputParameters;
    private @Nullable Code language;
    private @Nullable Reference subject;
    private @Nullable List<Extension> extension;
    private @Nullable List<CodeableConcept> reasonCode;
    private @Nullable List<Reference> reasonReference;
    private @Nullable CodeableConcept moduleCodeableConcept;
    private @Nullable List<DataRequirement> dataRequirement;
    private @Nullable Reference performer;
    private @Nullable Meta meta;
    private @Nullable GuidanceresponseStatus status;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link GuidanceResponse#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link GuidanceResponse#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link GuidanceResponse#evaluationMessage() evaluationMessage} to evaluationMessage.
     * @param evaluationMessage The value for evaluationMessage
     * @return {@code this} builder for chained invocation
     */
    public final Builder evaluationMessage(List<Reference> evaluationMessage) {
      checkNotIsSet(evaluationMessageIsSet(), "evaluationMessage");
      this.evaluationMessage = Objects.requireNonNull(evaluationMessage, "evaluationMessage");
      optBits |= OPT_BIT_EVALUATION_MESSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#evaluationMessage() evaluationMessage} to evaluationMessage.
     * @param evaluationMessage The value for evaluationMessage
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("evaluationMessage")
    public final Builder evaluationMessage(Optional<? extends List<Reference>> evaluationMessage) {
      checkNotIsSet(evaluationMessageIsSet(), "evaluationMessage");
      this.evaluationMessage = evaluationMessage.orElse(null);
      optBits |= OPT_BIT_EVALUATION_MESSAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    public final Builder encounter(Reference encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = Objects.requireNonNull(encounter, "encounter");
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("encounter")
    public final Builder encounter(Optional<? extends Reference> encounter) {
      checkNotIsSet(encounterIsSet(), "encounter");
      this.encounter = encounter.orElse(null);
      optBits |= OPT_BIT_ENCOUNTER;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link GuidanceResponse#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link GuidanceResponse#moduleCanonical() moduleCanonical} to moduleCanonical.
     * @param moduleCanonical The value for moduleCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder moduleCanonical(String moduleCanonical) {
      checkNotIsSet(moduleCanonicalIsSet(), "moduleCanonical");
      this.moduleCanonical = Objects.requireNonNull(moduleCanonical, "moduleCanonical");
      optBits |= OPT_BIT_MODULE_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#moduleCanonical() moduleCanonical} to moduleCanonical.
     * @param moduleCanonical The value for moduleCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("moduleCanonical")
    public final Builder moduleCanonical(Optional<String> moduleCanonical) {
      checkNotIsSet(moduleCanonicalIsSet(), "moduleCanonical");
      this.moduleCanonical = moduleCanonical.orElse(null);
      optBits |= OPT_BIT_MODULE_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(List<Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("identifier")
    public final Builder identifier(Optional<? extends List<Identifier>> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#id() id} to id.
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
     * Initializes the optional value {@link GuidanceResponse#id() id} to id.
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
     * Initializes the optional value {@link GuidanceResponse#note() note} to note.
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
     * Initializes the optional value {@link GuidanceResponse#note() note} to note.
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
     * Initializes the optional value {@link GuidanceResponse#contained() contained} to contained.
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
     * Initializes the optional value {@link GuidanceResponse#contained() contained} to contained.
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
     * Initializes the optional value {@link GuidanceResponse#requestIdentifier() requestIdentifier} to requestIdentifier.
     * @param requestIdentifier The value for requestIdentifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder requestIdentifier(Identifier requestIdentifier) {
      checkNotIsSet(requestIdentifierIsSet(), "requestIdentifier");
      this.requestIdentifier = Objects.requireNonNull(requestIdentifier, "requestIdentifier");
      optBits |= OPT_BIT_REQUEST_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#requestIdentifier() requestIdentifier} to requestIdentifier.
     * @param requestIdentifier The value for requestIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("requestIdentifier")
    public final Builder requestIdentifier(Optional<? extends Identifier> requestIdentifier) {
      checkNotIsSet(requestIdentifierIsSet(), "requestIdentifier");
      this.requestIdentifier = requestIdentifier.orElse(null);
      optBits |= OPT_BIT_REQUEST_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#text() text} to text.
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
     * Initializes the optional value {@link GuidanceResponse#text() text} to text.
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
     * Initializes the optional value {@link GuidanceResponse#result() result} to result.
     * @param result The value for result
     * @return {@code this} builder for chained invocation
     */
    public final Builder result(Reference result) {
      checkNotIsSet(resultIsSet(), "result");
      this.result = Objects.requireNonNull(result, "result");
      optBits |= OPT_BIT_RESULT;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#result() result} to result.
     * @param result The value for result
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("result")
    public final Builder result(Optional<? extends Reference> result) {
      checkNotIsSet(resultIsSet(), "result");
      this.result = result.orElse(null);
      optBits |= OPT_BIT_RESULT;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder occurrenceDateTime(DateTime occurrenceDateTime) {
      checkNotIsSet(occurrenceDateTimeIsSet(), "occurrenceDateTime");
      this.occurrenceDateTime = Objects.requireNonNull(occurrenceDateTime, "occurrenceDateTime");
      optBits |= OPT_BIT_OCCURRENCE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("occurrenceDateTime")
    public final Builder occurrenceDateTime(Optional<? extends DateTime> occurrenceDateTime) {
      checkNotIsSet(occurrenceDateTimeIsSet(), "occurrenceDateTime");
      this.occurrenceDateTime = occurrenceDateTime.orElse(null);
      optBits |= OPT_BIT_OCCURRENCE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#moduleUri() moduleUri} to moduleUri.
     * @param moduleUri The value for moduleUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder moduleUri(String moduleUri) {
      checkNotIsSet(moduleUriIsSet(), "moduleUri");
      this.moduleUri = Objects.requireNonNull(moduleUri, "moduleUri");
      optBits |= OPT_BIT_MODULE_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#moduleUri() moduleUri} to moduleUri.
     * @param moduleUri The value for moduleUri
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("moduleUri")
    public final Builder moduleUri(Optional<String> moduleUri) {
      checkNotIsSet(moduleUriIsSet(), "moduleUri");
      this.moduleUri = moduleUri.orElse(null);
      optBits |= OPT_BIT_MODULE_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#outputParameters() outputParameters} to outputParameters.
     * @param outputParameters The value for outputParameters
     * @return {@code this} builder for chained invocation
     */
    public final Builder outputParameters(Reference outputParameters) {
      checkNotIsSet(outputParametersIsSet(), "outputParameters");
      this.outputParameters = Objects.requireNonNull(outputParameters, "outputParameters");
      optBits |= OPT_BIT_OUTPUT_PARAMETERS;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#outputParameters() outputParameters} to outputParameters.
     * @param outputParameters The value for outputParameters
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("outputParameters")
    public final Builder outputParameters(Optional<? extends Reference> outputParameters) {
      checkNotIsSet(outputParametersIsSet(), "outputParameters");
      this.outputParameters = outputParameters.orElse(null);
      optBits |= OPT_BIT_OUTPUT_PARAMETERS;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#language() language} to language.
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
     * Initializes the optional value {@link GuidanceResponse#language() language} to language.
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
     * Initializes the optional value {@link GuidanceResponse#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    public final Builder subject(Reference subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = Objects.requireNonNull(subject, "subject");
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subject")
    public final Builder subject(Optional<? extends Reference> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = subject.orElse(null);
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#extension() extension} to extension.
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
     * Initializes the optional value {@link GuidanceResponse#extension() extension} to extension.
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
     * Initializes the optional value {@link GuidanceResponse#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonCode(List<CodeableConcept> reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = Objects.requireNonNull(reasonCode, "reasonCode");
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reasonCode")
    public final Builder reasonCode(Optional<? extends List<CodeableConcept>> reasonCode) {
      checkNotIsSet(reasonCodeIsSet(), "reasonCode");
      this.reasonCode = reasonCode.orElse(null);
      optBits |= OPT_BIT_REASON_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonReference(List<Reference> reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = Objects.requireNonNull(reasonReference, "reasonReference");
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reasonReference")
    public final Builder reasonReference(Optional<? extends List<Reference>> reasonReference) {
      checkNotIsSet(reasonReferenceIsSet(), "reasonReference");
      this.reasonReference = reasonReference.orElse(null);
      optBits |= OPT_BIT_REASON_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#moduleCodeableConcept() moduleCodeableConcept} to moduleCodeableConcept.
     * @param moduleCodeableConcept The value for moduleCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder moduleCodeableConcept(CodeableConcept moduleCodeableConcept) {
      checkNotIsSet(moduleCodeableConceptIsSet(), "moduleCodeableConcept");
      this.moduleCodeableConcept = Objects.requireNonNull(moduleCodeableConcept, "moduleCodeableConcept");
      optBits |= OPT_BIT_MODULE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#moduleCodeableConcept() moduleCodeableConcept} to moduleCodeableConcept.
     * @param moduleCodeableConcept The value for moduleCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("moduleCodeableConcept")
    public final Builder moduleCodeableConcept(Optional<? extends CodeableConcept> moduleCodeableConcept) {
      checkNotIsSet(moduleCodeableConceptIsSet(), "moduleCodeableConcept");
      this.moduleCodeableConcept = moduleCodeableConcept.orElse(null);
      optBits |= OPT_BIT_MODULE_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#dataRequirement() dataRequirement} to dataRequirement.
     * @param dataRequirement The value for dataRequirement
     * @return {@code this} builder for chained invocation
     */
    public final Builder dataRequirement(List<DataRequirement> dataRequirement) {
      checkNotIsSet(dataRequirementIsSet(), "dataRequirement");
      this.dataRequirement = Objects.requireNonNull(dataRequirement, "dataRequirement");
      optBits |= OPT_BIT_DATA_REQUIREMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#dataRequirement() dataRequirement} to dataRequirement.
     * @param dataRequirement The value for dataRequirement
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dataRequirement")
    public final Builder dataRequirement(Optional<? extends List<DataRequirement>> dataRequirement) {
      checkNotIsSet(dataRequirementIsSet(), "dataRequirement");
      this.dataRequirement = dataRequirement.orElse(null);
      optBits |= OPT_BIT_DATA_REQUIREMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    public final Builder performer(Reference performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = Objects.requireNonNull(performer, "performer");
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("performer")
    public final Builder performer(Optional<? extends Reference> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = performer.orElse(null);
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#meta() meta} to meta.
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
     * Initializes the optional value {@link GuidanceResponse#meta() meta} to meta.
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
     * Initializes the optional value {@link GuidanceResponse#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(GuidanceresponseStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link GuidanceResponse#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends GuidanceresponseStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Builds a new {@link GuidanceResponse GuidanceResponse}.
     * @return An immutable instance of GuidanceResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public GuidanceResponse build() {
      checkRequiredAttributes();
      return new ImmutableGuidanceResponse(
          modifierExtension,
          resourceType,
          evaluationMessage,
          encounter,
          implicitRules,
          moduleCanonical,
          identifier,
          id,
          note,
          contained,
          requestIdentifier,
          text,
          result,
          occurrenceDateTime,
          moduleUri,
          outputParameters,
          language,
          subject,
          extension,
          reasonCode,
          reasonReference,
          moduleCodeableConcept,
          dataRequirement,
          performer,
          meta,
          status);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean evaluationMessageIsSet() {
      return (optBits & OPT_BIT_EVALUATION_MESSAGE) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean moduleCanonicalIsSet() {
      return (optBits & OPT_BIT_MODULE_CANONICAL) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean requestIdentifierIsSet() {
      return (optBits & OPT_BIT_REQUEST_IDENTIFIER) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean resultIsSet() {
      return (optBits & OPT_BIT_RESULT) != 0;
    }

    private boolean occurrenceDateTimeIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_DATE_TIME) != 0;
    }

    private boolean moduleUriIsSet() {
      return (optBits & OPT_BIT_MODULE_URI) != 0;
    }

    private boolean outputParametersIsSet() {
      return (optBits & OPT_BIT_OUTPUT_PARAMETERS) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean moduleCodeableConceptIsSet() {
      return (optBits & OPT_BIT_MODULE_CODEABLE_CONCEPT) != 0;
    }

    private boolean dataRequirementIsSet() {
      return (optBits & OPT_BIT_DATA_REQUIREMENT) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of GuidanceResponse is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build GuidanceResponse, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "GuidanceResponse", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link GuidanceResponse#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "GuidanceResponse", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link GuidanceResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link GuidanceResponse#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link GuidanceResponse#evaluationMessage() evaluationMessage} to evaluationMessage.
     * @param evaluationMessage The value for evaluationMessage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal evaluationMessage(List<Reference> evaluationMessage);

    /**
     * Initializes the optional value {@link GuidanceResponse#evaluationMessage() evaluationMessage} to evaluationMessage.
     * @param evaluationMessage The value for evaluationMessage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal evaluationMessage(Optional<? extends List<Reference>> evaluationMessage);

    /**
     * Initializes the optional value {@link GuidanceResponse#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(Reference encounter);

    /**
     * Initializes the optional value {@link GuidanceResponse#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(Optional<? extends Reference> encounter);

    /**
     * Initializes the optional value {@link GuidanceResponse#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link GuidanceResponse#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link GuidanceResponse#moduleCanonical() moduleCanonical} to moduleCanonical.
     * @param moduleCanonical The value for moduleCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal moduleCanonical(String moduleCanonical);

    /**
     * Initializes the optional value {@link GuidanceResponse#moduleCanonical() moduleCanonical} to moduleCanonical.
     * @param moduleCanonical The value for moduleCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal moduleCanonical(Optional<String> moduleCanonical);

    /**
     * Initializes the optional value {@link GuidanceResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link GuidanceResponse#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link GuidanceResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link GuidanceResponse#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link GuidanceResponse#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link GuidanceResponse#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link GuidanceResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link GuidanceResponse#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link GuidanceResponse#requestIdentifier() requestIdentifier} to requestIdentifier.
     * @param requestIdentifier The value for requestIdentifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal requestIdentifier(Identifier requestIdentifier);

    /**
     * Initializes the optional value {@link GuidanceResponse#requestIdentifier() requestIdentifier} to requestIdentifier.
     * @param requestIdentifier The value for requestIdentifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal requestIdentifier(Optional<? extends Identifier> requestIdentifier);

    /**
     * Initializes the optional value {@link GuidanceResponse#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link GuidanceResponse#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link GuidanceResponse#result() result} to result.
     * @param result The value for result
     * @return {@code this} builder for chained invocation
     */
    BuildFinal result(Reference result);

    /**
     * Initializes the optional value {@link GuidanceResponse#result() result} to result.
     * @param result The value for result
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal result(Optional<? extends Reference> result);

    /**
     * Initializes the optional value {@link GuidanceResponse#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrenceDateTime(DateTime occurrenceDateTime);

    /**
     * Initializes the optional value {@link GuidanceResponse#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrenceDateTime(Optional<? extends DateTime> occurrenceDateTime);

    /**
     * Initializes the optional value {@link GuidanceResponse#moduleUri() moduleUri} to moduleUri.
     * @param moduleUri The value for moduleUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal moduleUri(String moduleUri);

    /**
     * Initializes the optional value {@link GuidanceResponse#moduleUri() moduleUri} to moduleUri.
     * @param moduleUri The value for moduleUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal moduleUri(Optional<String> moduleUri);

    /**
     * Initializes the optional value {@link GuidanceResponse#outputParameters() outputParameters} to outputParameters.
     * @param outputParameters The value for outputParameters
     * @return {@code this} builder for chained invocation
     */
    BuildFinal outputParameters(Reference outputParameters);

    /**
     * Initializes the optional value {@link GuidanceResponse#outputParameters() outputParameters} to outputParameters.
     * @param outputParameters The value for outputParameters
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal outputParameters(Optional<? extends Reference> outputParameters);

    /**
     * Initializes the optional value {@link GuidanceResponse#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link GuidanceResponse#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link GuidanceResponse#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(Reference subject);

    /**
     * Initializes the optional value {@link GuidanceResponse#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(Optional<? extends Reference> subject);

    /**
     * Initializes the optional value {@link GuidanceResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link GuidanceResponse#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link GuidanceResponse#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(List<CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link GuidanceResponse#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(Optional<? extends List<CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link GuidanceResponse#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(List<Reference> reasonReference);

    /**
     * Initializes the optional value {@link GuidanceResponse#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(Optional<? extends List<Reference>> reasonReference);

    /**
     * Initializes the optional value {@link GuidanceResponse#moduleCodeableConcept() moduleCodeableConcept} to moduleCodeableConcept.
     * @param moduleCodeableConcept The value for moduleCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal moduleCodeableConcept(CodeableConcept moduleCodeableConcept);

    /**
     * Initializes the optional value {@link GuidanceResponse#moduleCodeableConcept() moduleCodeableConcept} to moduleCodeableConcept.
     * @param moduleCodeableConcept The value for moduleCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal moduleCodeableConcept(Optional<? extends CodeableConcept> moduleCodeableConcept);

    /**
     * Initializes the optional value {@link GuidanceResponse#dataRequirement() dataRequirement} to dataRequirement.
     * @param dataRequirement The value for dataRequirement
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dataRequirement(List<DataRequirement> dataRequirement);

    /**
     * Initializes the optional value {@link GuidanceResponse#dataRequirement() dataRequirement} to dataRequirement.
     * @param dataRequirement The value for dataRequirement
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dataRequirement(Optional<? extends List<DataRequirement>> dataRequirement);

    /**
     * Initializes the optional value {@link GuidanceResponse#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performer(Reference performer);

    /**
     * Initializes the optional value {@link GuidanceResponse#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performer(Optional<? extends Reference> performer);

    /**
     * Initializes the optional value {@link GuidanceResponse#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link GuidanceResponse#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link GuidanceResponse#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(GuidanceresponseStatus status);

    /**
     * Initializes the optional value {@link GuidanceResponse#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends GuidanceresponseStatus> status);

    /**
     * Builds a new {@link GuidanceResponse GuidanceResponse}.
     * @return An immutable instance of GuidanceResponse
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    GuidanceResponse build();
  }
}

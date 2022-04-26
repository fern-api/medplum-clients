package com.fhir.types.fhir;

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
 * Immutable implementation of {@link ServiceRequest}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableServiceRequest.builder()}.
 */
@Generated(from = "ServiceRequest", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableServiceRequest implements ServiceRequest {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Uri implicitRules;
  private final Reference subject;
  private final @Nullable String occurrenceDateTime;
  private final @Nullable List<Extension> extension;
  private final @Nullable Period occurrencePeriod;
  private final @Nullable List<Reference> locationReference;
  private final String resourceType;
  private final @Nullable List<Uri> instantiatesUri;
  private final @Nullable List<CodeableConcept> orderDetail;
  private final @Nullable Reference requester;
  private final @Nullable List<CodeableConcept> category;
  private final @Nullable CodeableConcept performerType;
  private final @Nullable Code status;
  private final @Nullable List<CodeableConcept> bodySite;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable Meta meta;
  private final @Nullable Ratio quantityRatio;
  private final @Nullable Range quantityRange;
  private final @Nullable Reference encounter;
  private final @Nullable List<Canonical> instantiatesCanonical;
  private final @Nullable String patientInstruction;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<Reference> insurance;
  private final @Nullable Identifier requisition;
  private final @Nullable List<Reference> replaces;
  private final @Nullable List<Reference> supportingInfo;
  private final @Nullable Boolean asNeededBoolean;
  private final @Nullable List<Reference> performer;
  private final @Nullable Code priority;
  private final @Nullable List<Reference> specimen;
  private final @Nullable List<Reference> basedOn;
  private final @Nullable Quantity quantityQuantity;
  private final @Nullable DateTime authoredOn;
  private final @Nullable Code language;
  private final @Nullable Timing occurrenceTiming;
  private final @Nullable List<Annotation> note;
  private final @Nullable CodeableConcept code;
  private final @Nullable List<Reference> reasonReference;
  private final @Nullable Narrative text;
  private final @Nullable Boolean doNotPerform;
  private final @Nullable List<CodeableConcept> locationCode;
  private final @Nullable List<Reference> relevantHistory;
  private final @Nullable Code intent;
  private final @Nullable CodeableConcept asNeededCodeableConcept;
  private final @Nullable List<CodeableConcept> reasonCode;
  private final @Nullable Id id;

  private ImmutableServiceRequest(
      @Nullable List<Extension> modifierExtension,
      @Nullable Uri implicitRules,
      Reference subject,
      @Nullable String occurrenceDateTime,
      @Nullable List<Extension> extension,
      @Nullable Period occurrencePeriod,
      @Nullable List<Reference> locationReference,
      String resourceType,
      @Nullable List<Uri> instantiatesUri,
      @Nullable List<CodeableConcept> orderDetail,
      @Nullable Reference requester,
      @Nullable List<CodeableConcept> category,
      @Nullable CodeableConcept performerType,
      @Nullable Code status,
      @Nullable List<CodeableConcept> bodySite,
      @Nullable List<ResourceList> contained,
      @Nullable Meta meta,
      @Nullable Ratio quantityRatio,
      @Nullable Range quantityRange,
      @Nullable Reference encounter,
      @Nullable List<Canonical> instantiatesCanonical,
      @Nullable String patientInstruction,
      @Nullable List<Identifier> identifier,
      @Nullable List<Reference> insurance,
      @Nullable Identifier requisition,
      @Nullable List<Reference> replaces,
      @Nullable List<Reference> supportingInfo,
      @Nullable Boolean asNeededBoolean,
      @Nullable List<Reference> performer,
      @Nullable Code priority,
      @Nullable List<Reference> specimen,
      @Nullable List<Reference> basedOn,
      @Nullable Quantity quantityQuantity,
      @Nullable DateTime authoredOn,
      @Nullable Code language,
      @Nullable Timing occurrenceTiming,
      @Nullable List<Annotation> note,
      @Nullable CodeableConcept code,
      @Nullable List<Reference> reasonReference,
      @Nullable Narrative text,
      @Nullable Boolean doNotPerform,
      @Nullable List<CodeableConcept> locationCode,
      @Nullable List<Reference> relevantHistory,
      @Nullable Code intent,
      @Nullable CodeableConcept asNeededCodeableConcept,
      @Nullable List<CodeableConcept> reasonCode,
      @Nullable Id id) {
    this.modifierExtension = modifierExtension;
    this.implicitRules = implicitRules;
    this.subject = subject;
    this.occurrenceDateTime = occurrenceDateTime;
    this.extension = extension;
    this.occurrencePeriod = occurrencePeriod;
    this.locationReference = locationReference;
    this.resourceType = resourceType;
    this.instantiatesUri = instantiatesUri;
    this.orderDetail = orderDetail;
    this.requester = requester;
    this.category = category;
    this.performerType = performerType;
    this.status = status;
    this.bodySite = bodySite;
    this.contained = contained;
    this.meta = meta;
    this.quantityRatio = quantityRatio;
    this.quantityRange = quantityRange;
    this.encounter = encounter;
    this.instantiatesCanonical = instantiatesCanonical;
    this.patientInstruction = patientInstruction;
    this.identifier = identifier;
    this.insurance = insurance;
    this.requisition = requisition;
    this.replaces = replaces;
    this.supportingInfo = supportingInfo;
    this.asNeededBoolean = asNeededBoolean;
    this.performer = performer;
    this.priority = priority;
    this.specimen = specimen;
    this.basedOn = basedOn;
    this.quantityQuantity = quantityQuantity;
    this.authoredOn = authoredOn;
    this.language = language;
    this.occurrenceTiming = occurrenceTiming;
    this.note = note;
    this.code = code;
    this.reasonReference = reasonReference;
    this.text = text;
    this.doNotPerform = doNotPerform;
    this.locationCode = locationCode;
    this.relevantHistory = relevantHistory;
    this.intent = intent;
    this.asNeededCodeableConcept = asNeededCodeableConcept;
    this.reasonCode = reasonCode;
    this.id = id;
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
   * @return The value of the {@code implicitRules} attribute
   */
  @JsonProperty("implicitRules")
  @Override
  public Optional<Uri> implicitRules() {
    return Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code subject} attribute
   */
  @JsonProperty("subject")
  @Override
  public Reference subject() {
    return subject;
  }

  /**
   * @return The value of the {@code occurrenceDateTime} attribute
   */
  @JsonProperty("occurrenceDateTime")
  @Override
  public Optional<String> occurrenceDateTime() {
    return Optional.ofNullable(occurrenceDateTime);
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
   * @return The value of the {@code occurrencePeriod} attribute
   */
  @JsonProperty("occurrencePeriod")
  @Override
  public Optional<Period> occurrencePeriod() {
    return Optional.ofNullable(occurrencePeriod);
  }

  /**
   * @return The value of the {@code locationReference} attribute
   */
  @JsonProperty("locationReference")
  @Override
  public Optional<List<Reference>> locationReference() {
    return Optional.ofNullable(locationReference);
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
   * @return The value of the {@code instantiatesUri} attribute
   */
  @JsonProperty("instantiatesUri")
  @Override
  public Optional<List<Uri>> instantiatesUri() {
    return Optional.ofNullable(instantiatesUri);
  }

  /**
   * @return The value of the {@code orderDetail} attribute
   */
  @JsonProperty("orderDetail")
  @Override
  public Optional<List<CodeableConcept>> orderDetail() {
    return Optional.ofNullable(orderDetail);
  }

  /**
   * @return The value of the {@code requester} attribute
   */
  @JsonProperty("requester")
  @Override
  public Optional<Reference> requester() {
    return Optional.ofNullable(requester);
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public Optional<List<CodeableConcept>> category() {
    return Optional.ofNullable(category);
  }

  /**
   * @return The value of the {@code performerType} attribute
   */
  @JsonProperty("performerType")
  @Override
  public Optional<CodeableConcept> performerType() {
    return Optional.ofNullable(performerType);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<Code> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code bodySite} attribute
   */
  @JsonProperty("bodySite")
  @Override
  public Optional<List<CodeableConcept>> bodySite() {
    return Optional.ofNullable(bodySite);
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
   * @return The value of the {@code meta} attribute
   */
  @JsonProperty("meta")
  @Override
  public Optional<Meta> meta() {
    return Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code quantityRatio} attribute
   */
  @JsonProperty("quantityRatio")
  @Override
  public Optional<Ratio> quantityRatio() {
    return Optional.ofNullable(quantityRatio);
  }

  /**
   * @return The value of the {@code quantityRange} attribute
   */
  @JsonProperty("quantityRange")
  @Override
  public Optional<Range> quantityRange() {
    return Optional.ofNullable(quantityRange);
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
   * @return The value of the {@code instantiatesCanonical} attribute
   */
  @JsonProperty("instantiatesCanonical")
  @Override
  public Optional<List<Canonical>> instantiatesCanonical() {
    return Optional.ofNullable(instantiatesCanonical);
  }

  /**
   * @return The value of the {@code patientInstruction} attribute
   */
  @JsonProperty("patientInstruction")
  @Override
  public Optional<String> patientInstruction() {
    return Optional.ofNullable(patientInstruction);
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
   * @return The value of the {@code insurance} attribute
   */
  @JsonProperty("insurance")
  @Override
  public Optional<List<Reference>> insurance() {
    return Optional.ofNullable(insurance);
  }

  /**
   * @return The value of the {@code requisition} attribute
   */
  @JsonProperty("requisition")
  @Override
  public Optional<Identifier> requisition() {
    return Optional.ofNullable(requisition);
  }

  /**
   * @return The value of the {@code replaces} attribute
   */
  @JsonProperty("replaces")
  @Override
  public Optional<List<Reference>> replaces() {
    return Optional.ofNullable(replaces);
  }

  /**
   * @return The value of the {@code supportingInfo} attribute
   */
  @JsonProperty("supportingInfo")
  @Override
  public Optional<List<Reference>> supportingInfo() {
    return Optional.ofNullable(supportingInfo);
  }

  /**
   * @return The value of the {@code asNeededBoolean} attribute
   */
  @JsonProperty("asNeededBoolean")
  @Override
  public Optional<Boolean> asNeededBoolean() {
    return Optional.ofNullable(asNeededBoolean);
  }

  /**
   * @return The value of the {@code performer} attribute
   */
  @JsonProperty("performer")
  @Override
  public Optional<List<Reference>> performer() {
    return Optional.ofNullable(performer);
  }

  /**
   * @return The value of the {@code priority} attribute
   */
  @JsonProperty("priority")
  @Override
  public Optional<Code> priority() {
    return Optional.ofNullable(priority);
  }

  /**
   * @return The value of the {@code specimen} attribute
   */
  @JsonProperty("specimen")
  @Override
  public Optional<List<Reference>> specimen() {
    return Optional.ofNullable(specimen);
  }

  /**
   * @return The value of the {@code basedOn} attribute
   */
  @JsonProperty("basedOn")
  @Override
  public Optional<List<Reference>> basedOn() {
    return Optional.ofNullable(basedOn);
  }

  /**
   * @return The value of the {@code quantityQuantity} attribute
   */
  @JsonProperty("quantityQuantity")
  @Override
  public Optional<Quantity> quantityQuantity() {
    return Optional.ofNullable(quantityQuantity);
  }

  /**
   * @return The value of the {@code authoredOn} attribute
   */
  @JsonProperty("authoredOn")
  @Override
  public Optional<DateTime> authoredOn() {
    return Optional.ofNullable(authoredOn);
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
   * @return The value of the {@code occurrenceTiming} attribute
   */
  @JsonProperty("occurrenceTiming")
  @Override
  public Optional<Timing> occurrenceTiming() {
    return Optional.ofNullable(occurrenceTiming);
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
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<CodeableConcept> code() {
    return Optional.ofNullable(code);
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
   * @return The value of the {@code text} attribute
   */
  @JsonProperty("text")
  @Override
  public Optional<Narrative> text() {
    return Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code doNotPerform} attribute
   */
  @JsonProperty("doNotPerform")
  @Override
  public Optional<Boolean> doNotPerform() {
    return Optional.ofNullable(doNotPerform);
  }

  /**
   * @return The value of the {@code locationCode} attribute
   */
  @JsonProperty("locationCode")
  @Override
  public Optional<List<CodeableConcept>> locationCode() {
    return Optional.ofNullable(locationCode);
  }

  /**
   * @return The value of the {@code relevantHistory} attribute
   */
  @JsonProperty("relevantHistory")
  @Override
  public Optional<List<Reference>> relevantHistory() {
    return Optional.ofNullable(relevantHistory);
  }

  /**
   * @return The value of the {@code intent} attribute
   */
  @JsonProperty("intent")
  @Override
  public Optional<Code> intent() {
    return Optional.ofNullable(intent);
  }

  /**
   * @return The value of the {@code asNeededCodeableConcept} attribute
   */
  @JsonProperty("asNeededCodeableConcept")
  @Override
  public Optional<CodeableConcept> asNeededCodeableConcept() {
    return Optional.ofNullable(asNeededCodeableConcept);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<Id> id() {
    return Optional.ofNullable(id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableServiceRequest(
        newValue,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableServiceRequest(
        value,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        newValue,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        value,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ServiceRequest#subject() subject} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for subject
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableServiceRequest withSubject(Reference value) {
    if (this.subject == value) return this;
    Reference newValue = Objects.requireNonNull(value, "subject");
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        newValue,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#occurrenceDateTime() occurrenceDateTime} attribute.
   * @param value The value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withOccurrenceDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "occurrenceDateTime");
    if (Objects.equals(this.occurrenceDateTime, newValue)) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        newValue,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#occurrenceDateTime() occurrenceDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withOccurrenceDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.occurrenceDateTime, value)) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        value,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        newValue,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        value,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#occurrencePeriod() occurrencePeriod} attribute.
   * @param value The value for occurrencePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withOccurrencePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "occurrencePeriod");
    if (this.occurrencePeriod == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        newValue,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#occurrencePeriod() occurrencePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrencePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withOccurrencePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.occurrencePeriod == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        value,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#locationReference() locationReference} attribute.
   * @param value The value for locationReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withLocationReference(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "locationReference");
    if (this.locationReference == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        newValue,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#locationReference() locationReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for locationReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withLocationReference(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.locationReference == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        value,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link ServiceRequest#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableServiceRequest withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        newValue,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#instantiatesUri() instantiatesUri} attribute.
   * @param value The value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withInstantiatesUri(List<Uri> value) {
    @Nullable List<Uri> newValue = Objects.requireNonNull(value, "instantiatesUri");
    if (this.instantiatesUri == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        newValue,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#instantiatesUri() instantiatesUri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesUri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withInstantiatesUri(Optional<? extends List<Uri>> optional) {
    @Nullable List<Uri> value = optional.orElse(null);
    if (this.instantiatesUri == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        value,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#orderDetail() orderDetail} attribute.
   * @param value The value for orderDetail
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withOrderDetail(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "orderDetail");
    if (this.orderDetail == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        newValue,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#orderDetail() orderDetail} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for orderDetail
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withOrderDetail(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.orderDetail == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        value,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#requester() requester} attribute.
   * @param value The value for requester
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withRequester(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "requester");
    if (this.requester == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        newValue,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#requester() requester} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requester
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withRequester(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.requester == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        value,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#category() category} attribute.
   * @param value The value for category
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withCategory(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "category");
    if (this.category == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        newValue,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#category() category} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for category
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withCategory(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.category == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        value,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#performerType() performerType} attribute.
   * @param value The value for performerType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withPerformerType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "performerType");
    if (this.performerType == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        newValue,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#performerType() performerType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performerType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withPerformerType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.performerType == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        value,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withStatus(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        newValue,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withStatus(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        value,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#bodySite() bodySite} attribute.
   * @param value The value for bodySite
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withBodySite(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "bodySite");
    if (this.bodySite == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        newValue,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#bodySite() bodySite} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for bodySite
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withBodySite(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.bodySite == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        value,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        newValue,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        value,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        newValue,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        value,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#quantityRatio() quantityRatio} attribute.
   * @param value The value for quantityRatio
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withQuantityRatio(Ratio value) {
    @Nullable Ratio newValue = Objects.requireNonNull(value, "quantityRatio");
    if (this.quantityRatio == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        newValue,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#quantityRatio() quantityRatio} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantityRatio
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withQuantityRatio(Optional<? extends Ratio> optional) {
    @Nullable Ratio value = optional.orElse(null);
    if (this.quantityRatio == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        value,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#quantityRange() quantityRange} attribute.
   * @param value The value for quantityRange
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withQuantityRange(Range value) {
    @Nullable Range newValue = Objects.requireNonNull(value, "quantityRange");
    if (this.quantityRange == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        newValue,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#quantityRange() quantityRange} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantityRange
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withQuantityRange(Optional<? extends Range> optional) {
    @Nullable Range value = optional.orElse(null);
    if (this.quantityRange == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        value,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#encounter() encounter} attribute.
   * @param value The value for encounter
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withEncounter(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "encounter");
    if (this.encounter == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        newValue,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#encounter() encounter} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for encounter
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withEncounter(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.encounter == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        value,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#instantiatesCanonical() instantiatesCanonical} attribute.
   * @param value The value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withInstantiatesCanonical(List<Canonical> value) {
    @Nullable List<Canonical> newValue = Objects.requireNonNull(value, "instantiatesCanonical");
    if (this.instantiatesCanonical == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        newValue,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#instantiatesCanonical() instantiatesCanonical} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for instantiatesCanonical
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withInstantiatesCanonical(Optional<? extends List<Canonical>> optional) {
    @Nullable List<Canonical> value = optional.orElse(null);
    if (this.instantiatesCanonical == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        value,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#patientInstruction() patientInstruction} attribute.
   * @param value The value for patientInstruction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withPatientInstruction(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "patientInstruction");
    if (Objects.equals(this.patientInstruction, newValue)) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        newValue,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#patientInstruction() patientInstruction} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for patientInstruction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withPatientInstruction(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.patientInstruction, value)) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        value,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        newValue,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        value,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#insurance() insurance} attribute.
   * @param value The value for insurance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withInsurance(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "insurance");
    if (this.insurance == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        newValue,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#insurance() insurance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for insurance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withInsurance(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.insurance == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        value,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#requisition() requisition} attribute.
   * @param value The value for requisition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withRequisition(Identifier value) {
    @Nullable Identifier newValue = Objects.requireNonNull(value, "requisition");
    if (this.requisition == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        newValue,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#requisition() requisition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requisition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withRequisition(Optional<? extends Identifier> optional) {
    @Nullable Identifier value = optional.orElse(null);
    if (this.requisition == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        value,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#replaces() replaces} attribute.
   * @param value The value for replaces
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withReplaces(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "replaces");
    if (this.replaces == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        newValue,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#replaces() replaces} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for replaces
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withReplaces(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.replaces == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        value,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#supportingInfo() supportingInfo} attribute.
   * @param value The value for supportingInfo
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withSupportingInfo(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "supportingInfo");
    if (this.supportingInfo == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        newValue,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#supportingInfo() supportingInfo} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportingInfo
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withSupportingInfo(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.supportingInfo == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        value,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#asNeededBoolean() asNeededBoolean} attribute.
   * @param value The value for asNeededBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withAsNeededBoolean(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.asNeededBoolean, newValue)) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        newValue,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#asNeededBoolean() asNeededBoolean} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for asNeededBoolean
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withAsNeededBoolean(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.asNeededBoolean, value)) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        value,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withPerformer(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        newValue,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withPerformer(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        value,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#priority() priority} attribute.
   * @param value The value for priority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withPriority(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "priority");
    if (this.priority == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        newValue,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#priority() priority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for priority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withPriority(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.priority == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        value,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#specimen() specimen} attribute.
   * @param value The value for specimen
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withSpecimen(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "specimen");
    if (this.specimen == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        newValue,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#specimen() specimen} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specimen
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withSpecimen(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.specimen == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        value,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#basedOn() basedOn} attribute.
   * @param value The value for basedOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withBasedOn(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "basedOn");
    if (this.basedOn == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        newValue,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#basedOn() basedOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for basedOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withBasedOn(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.basedOn == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        value,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#quantityQuantity() quantityQuantity} attribute.
   * @param value The value for quantityQuantity
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withQuantityQuantity(Quantity value) {
    @Nullable Quantity newValue = Objects.requireNonNull(value, "quantityQuantity");
    if (this.quantityQuantity == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        newValue,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#quantityQuantity() quantityQuantity} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for quantityQuantity
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withQuantityQuantity(Optional<? extends Quantity> optional) {
    @Nullable Quantity value = optional.orElse(null);
    if (this.quantityQuantity == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        value,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#authoredOn() authoredOn} attribute.
   * @param value The value for authoredOn
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withAuthoredOn(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "authoredOn");
    if (this.authoredOn == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        newValue,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#authoredOn() authoredOn} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authoredOn
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withAuthoredOn(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.authoredOn == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        value,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        newValue,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        value,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#occurrenceTiming() occurrenceTiming} attribute.
   * @param value The value for occurrenceTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withOccurrenceTiming(Timing value) {
    @Nullable Timing newValue = Objects.requireNonNull(value, "occurrenceTiming");
    if (this.occurrenceTiming == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        newValue,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#occurrenceTiming() occurrenceTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrenceTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withOccurrenceTiming(Optional<? extends Timing> optional) {
    @Nullable Timing value = optional.orElse(null);
    if (this.occurrenceTiming == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        value,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        newValue,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        value,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withCode(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        newValue,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withCode(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        value,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withReasonReference(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        newValue,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withReasonReference(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        value,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        newValue,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        value,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#doNotPerform() doNotPerform} attribute.
   * @param value The value for doNotPerform
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withDoNotPerform(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.doNotPerform, newValue)) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        newValue,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#doNotPerform() doNotPerform} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for doNotPerform
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withDoNotPerform(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.doNotPerform, value)) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        value,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#locationCode() locationCode} attribute.
   * @param value The value for locationCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withLocationCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "locationCode");
    if (this.locationCode == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        newValue,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#locationCode() locationCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for locationCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withLocationCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.locationCode == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        value,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#relevantHistory() relevantHistory} attribute.
   * @param value The value for relevantHistory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withRelevantHistory(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "relevantHistory");
    if (this.relevantHistory == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        newValue,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#relevantHistory() relevantHistory} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relevantHistory
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withRelevantHistory(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.relevantHistory == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        value,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#intent() intent} attribute.
   * @param value The value for intent
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withIntent(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "intent");
    if (this.intent == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        newValue,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#intent() intent} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for intent
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withIntent(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.intent == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        value,
        this.asNeededCodeableConcept,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#asNeededCodeableConcept() asNeededCodeableConcept} attribute.
   * @param value The value for asNeededCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withAsNeededCodeableConcept(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "asNeededCodeableConcept");
    if (this.asNeededCodeableConcept == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        newValue,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#asNeededCodeableConcept() asNeededCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for asNeededCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withAsNeededCodeableConcept(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.asNeededCodeableConcept == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        value,
        this.reasonCode,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withReasonCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withReasonCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        value,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ServiceRequest#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableServiceRequest withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ServiceRequest#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableServiceRequest withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableServiceRequest(
        this.modifierExtension,
        this.implicitRules,
        this.subject,
        this.occurrenceDateTime,
        this.extension,
        this.occurrencePeriod,
        this.locationReference,
        this.resourceType,
        this.instantiatesUri,
        this.orderDetail,
        this.requester,
        this.category,
        this.performerType,
        this.status,
        this.bodySite,
        this.contained,
        this.meta,
        this.quantityRatio,
        this.quantityRange,
        this.encounter,
        this.instantiatesCanonical,
        this.patientInstruction,
        this.identifier,
        this.insurance,
        this.requisition,
        this.replaces,
        this.supportingInfo,
        this.asNeededBoolean,
        this.performer,
        this.priority,
        this.specimen,
        this.basedOn,
        this.quantityQuantity,
        this.authoredOn,
        this.language,
        this.occurrenceTiming,
        this.note,
        this.code,
        this.reasonReference,
        this.text,
        this.doNotPerform,
        this.locationCode,
        this.relevantHistory,
        this.intent,
        this.asNeededCodeableConcept,
        this.reasonCode,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableServiceRequest} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableServiceRequest
        && equalTo((ImmutableServiceRequest) another);
  }

  private boolean equalTo(ImmutableServiceRequest another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(implicitRules, another.implicitRules)
        && subject.equals(another.subject)
        && Objects.equals(occurrenceDateTime, another.occurrenceDateTime)
        && Objects.equals(extension, another.extension)
        && Objects.equals(occurrencePeriod, another.occurrencePeriod)
        && Objects.equals(locationReference, another.locationReference)
        && resourceType.equals(another.resourceType)
        && Objects.equals(instantiatesUri, another.instantiatesUri)
        && Objects.equals(orderDetail, another.orderDetail)
        && Objects.equals(requester, another.requester)
        && Objects.equals(category, another.category)
        && Objects.equals(performerType, another.performerType)
        && Objects.equals(status, another.status)
        && Objects.equals(bodySite, another.bodySite)
        && Objects.equals(contained, another.contained)
        && Objects.equals(meta, another.meta)
        && Objects.equals(quantityRatio, another.quantityRatio)
        && Objects.equals(quantityRange, another.quantityRange)
        && Objects.equals(encounter, another.encounter)
        && Objects.equals(instantiatesCanonical, another.instantiatesCanonical)
        && Objects.equals(patientInstruction, another.patientInstruction)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(insurance, another.insurance)
        && Objects.equals(requisition, another.requisition)
        && Objects.equals(replaces, another.replaces)
        && Objects.equals(supportingInfo, another.supportingInfo)
        && Objects.equals(asNeededBoolean, another.asNeededBoolean)
        && Objects.equals(performer, another.performer)
        && Objects.equals(priority, another.priority)
        && Objects.equals(specimen, another.specimen)
        && Objects.equals(basedOn, another.basedOn)
        && Objects.equals(quantityQuantity, another.quantityQuantity)
        && Objects.equals(authoredOn, another.authoredOn)
        && Objects.equals(language, another.language)
        && Objects.equals(occurrenceTiming, another.occurrenceTiming)
        && Objects.equals(note, another.note)
        && Objects.equals(code, another.code)
        && Objects.equals(reasonReference, another.reasonReference)
        && Objects.equals(text, another.text)
        && Objects.equals(doNotPerform, another.doNotPerform)
        && Objects.equals(locationCode, another.locationCode)
        && Objects.equals(relevantHistory, another.relevantHistory)
        && Objects.equals(intent, another.intent)
        && Objects.equals(asNeededCodeableConcept, another.asNeededCodeableConcept)
        && Objects.equals(reasonCode, another.reasonCode)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code implicitRules}, {@code subject}, {@code occurrenceDateTime}, {@code extension}, {@code occurrencePeriod}, {@code locationReference}, {@code resourceType}, {@code instantiatesUri}, {@code orderDetail}, {@code requester}, {@code category}, {@code performerType}, {@code status}, {@code bodySite}, {@code contained}, {@code meta}, {@code quantityRatio}, {@code quantityRange}, {@code encounter}, {@code instantiatesCanonical}, {@code patientInstruction}, {@code identifier}, {@code insurance}, {@code requisition}, {@code replaces}, {@code supportingInfo}, {@code asNeededBoolean}, {@code performer}, {@code priority}, {@code specimen}, {@code basedOn}, {@code quantityQuantity}, {@code authoredOn}, {@code language}, {@code occurrenceTiming}, {@code note}, {@code code}, {@code reasonReference}, {@code text}, {@code doNotPerform}, {@code locationCode}, {@code relevantHistory}, {@code intent}, {@code asNeededCodeableConcept}, {@code reasonCode}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + subject.hashCode();
    h += (h << 5) + Objects.hashCode(occurrenceDateTime);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(occurrencePeriod);
    h += (h << 5) + Objects.hashCode(locationReference);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(instantiatesUri);
    h += (h << 5) + Objects.hashCode(orderDetail);
    h += (h << 5) + Objects.hashCode(requester);
    h += (h << 5) + Objects.hashCode(category);
    h += (h << 5) + Objects.hashCode(performerType);
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + Objects.hashCode(bodySite);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(quantityRatio);
    h += (h << 5) + Objects.hashCode(quantityRange);
    h += (h << 5) + Objects.hashCode(encounter);
    h += (h << 5) + Objects.hashCode(instantiatesCanonical);
    h += (h << 5) + Objects.hashCode(patientInstruction);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(insurance);
    h += (h << 5) + Objects.hashCode(requisition);
    h += (h << 5) + Objects.hashCode(replaces);
    h += (h << 5) + Objects.hashCode(supportingInfo);
    h += (h << 5) + Objects.hashCode(asNeededBoolean);
    h += (h << 5) + Objects.hashCode(performer);
    h += (h << 5) + Objects.hashCode(priority);
    h += (h << 5) + Objects.hashCode(specimen);
    h += (h << 5) + Objects.hashCode(basedOn);
    h += (h << 5) + Objects.hashCode(quantityQuantity);
    h += (h << 5) + Objects.hashCode(authoredOn);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(occurrenceTiming);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(reasonReference);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(doNotPerform);
    h += (h << 5) + Objects.hashCode(locationCode);
    h += (h << 5) + Objects.hashCode(relevantHistory);
    h += (h << 5) + Objects.hashCode(intent);
    h += (h << 5) + Objects.hashCode(asNeededCodeableConcept);
    h += (h << 5) + Objects.hashCode(reasonCode);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code ServiceRequest} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ServiceRequest{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (implicitRules != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (builder.length() > 15) builder.append(", ");
    builder.append("subject=").append(subject);
    if (occurrenceDateTime != null) {
      builder.append(", ");
      builder.append("occurrenceDateTime=").append(occurrenceDateTime);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (occurrencePeriod != null) {
      builder.append(", ");
      builder.append("occurrencePeriod=").append(occurrencePeriod);
    }
    if (locationReference != null) {
      builder.append(", ");
      builder.append("locationReference=").append(locationReference);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (instantiatesUri != null) {
      builder.append(", ");
      builder.append("instantiatesUri=").append(instantiatesUri);
    }
    if (orderDetail != null) {
      builder.append(", ");
      builder.append("orderDetail=").append(orderDetail);
    }
    if (requester != null) {
      builder.append(", ");
      builder.append("requester=").append(requester);
    }
    if (category != null) {
      builder.append(", ");
      builder.append("category=").append(category);
    }
    if (performerType != null) {
      builder.append(", ");
      builder.append("performerType=").append(performerType);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (bodySite != null) {
      builder.append(", ");
      builder.append("bodySite=").append(bodySite);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (quantityRatio != null) {
      builder.append(", ");
      builder.append("quantityRatio=").append(quantityRatio);
    }
    if (quantityRange != null) {
      builder.append(", ");
      builder.append("quantityRange=").append(quantityRange);
    }
    if (encounter != null) {
      builder.append(", ");
      builder.append("encounter=").append(encounter);
    }
    if (instantiatesCanonical != null) {
      builder.append(", ");
      builder.append("instantiatesCanonical=").append(instantiatesCanonical);
    }
    if (patientInstruction != null) {
      builder.append(", ");
      builder.append("patientInstruction=").append(patientInstruction);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (insurance != null) {
      builder.append(", ");
      builder.append("insurance=").append(insurance);
    }
    if (requisition != null) {
      builder.append(", ");
      builder.append("requisition=").append(requisition);
    }
    if (replaces != null) {
      builder.append(", ");
      builder.append("replaces=").append(replaces);
    }
    if (supportingInfo != null) {
      builder.append(", ");
      builder.append("supportingInfo=").append(supportingInfo);
    }
    if (asNeededBoolean != null) {
      builder.append(", ");
      builder.append("asNeededBoolean=").append(asNeededBoolean);
    }
    if (performer != null) {
      builder.append(", ");
      builder.append("performer=").append(performer);
    }
    if (priority != null) {
      builder.append(", ");
      builder.append("priority=").append(priority);
    }
    if (specimen != null) {
      builder.append(", ");
      builder.append("specimen=").append(specimen);
    }
    if (basedOn != null) {
      builder.append(", ");
      builder.append("basedOn=").append(basedOn);
    }
    if (quantityQuantity != null) {
      builder.append(", ");
      builder.append("quantityQuantity=").append(quantityQuantity);
    }
    if (authoredOn != null) {
      builder.append(", ");
      builder.append("authoredOn=").append(authoredOn);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (occurrenceTiming != null) {
      builder.append(", ");
      builder.append("occurrenceTiming=").append(occurrenceTiming);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (code != null) {
      builder.append(", ");
      builder.append("code=").append(code);
    }
    if (reasonReference != null) {
      builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (doNotPerform != null) {
      builder.append(", ");
      builder.append("doNotPerform=").append(doNotPerform);
    }
    if (locationCode != null) {
      builder.append(", ");
      builder.append("locationCode=").append(locationCode);
    }
    if (relevantHistory != null) {
      builder.append(", ");
      builder.append("relevantHistory=").append(relevantHistory);
    }
    if (intent != null) {
      builder.append(", ");
      builder.append("intent=").append(intent);
    }
    if (asNeededCodeableConcept != null) {
      builder.append(", ");
      builder.append("asNeededCodeableConcept=").append(asNeededCodeableConcept);
    }
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ServiceRequest", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ServiceRequest {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Reference subject;
    @Nullable Optional<String> occurrenceDateTime = Optional.empty();
    boolean occurrenceDateTimeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Period> occurrencePeriod = Optional.empty();
    boolean occurrencePeriodIsSet;
    @Nullable Optional<List<Reference>> locationReference = Optional.empty();
    boolean locationReferenceIsSet;
    @Nullable String resourceType;
    @Nullable Optional<List<Uri>> instantiatesUri = Optional.empty();
    boolean instantiatesUriIsSet;
    @Nullable Optional<List<CodeableConcept>> orderDetail = Optional.empty();
    boolean orderDetailIsSet;
    @Nullable Optional<Reference> requester = Optional.empty();
    boolean requesterIsSet;
    @Nullable Optional<List<CodeableConcept>> category = Optional.empty();
    boolean categoryIsSet;
    @Nullable Optional<CodeableConcept> performerType = Optional.empty();
    boolean performerTypeIsSet;
    @Nullable Optional<Code> status = Optional.empty();
    boolean statusIsSet;
    @Nullable Optional<List<CodeableConcept>> bodySite = Optional.empty();
    boolean bodySiteIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<Ratio> quantityRatio = Optional.empty();
    boolean quantityRatioIsSet;
    @Nullable Optional<Range> quantityRange = Optional.empty();
    boolean quantityRangeIsSet;
    @Nullable Optional<Reference> encounter = Optional.empty();
    boolean encounterIsSet;
    @Nullable Optional<List<Canonical>> instantiatesCanonical = Optional.empty();
    boolean instantiatesCanonicalIsSet;
    @Nullable Optional<String> patientInstruction = Optional.empty();
    boolean patientInstructionIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<Reference>> insurance = Optional.empty();
    boolean insuranceIsSet;
    @Nullable Optional<Identifier> requisition = Optional.empty();
    boolean requisitionIsSet;
    @Nullable Optional<List<Reference>> replaces = Optional.empty();
    boolean replacesIsSet;
    @Nullable Optional<List<Reference>> supportingInfo = Optional.empty();
    boolean supportingInfoIsSet;
    @Nullable Optional<Boolean> asNeededBoolean = Optional.empty();
    boolean asNeededBooleanIsSet;
    @Nullable Optional<List<Reference>> performer = Optional.empty();
    boolean performerIsSet;
    @Nullable Optional<Code> priority = Optional.empty();
    boolean priorityIsSet;
    @Nullable Optional<List<Reference>> specimen = Optional.empty();
    boolean specimenIsSet;
    @Nullable Optional<List<Reference>> basedOn = Optional.empty();
    boolean basedOnIsSet;
    @Nullable Optional<Quantity> quantityQuantity = Optional.empty();
    boolean quantityQuantityIsSet;
    @Nullable Optional<DateTime> authoredOn = Optional.empty();
    boolean authoredOnIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<Timing> occurrenceTiming = Optional.empty();
    boolean occurrenceTimingIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<CodeableConcept> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<List<Reference>> reasonReference = Optional.empty();
    boolean reasonReferenceIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Boolean> doNotPerform = Optional.empty();
    boolean doNotPerformIsSet;
    @Nullable Optional<List<CodeableConcept>> locationCode = Optional.empty();
    boolean locationCodeIsSet;
    @Nullable Optional<List<Reference>> relevantHistory = Optional.empty();
    boolean relevantHistoryIsSet;
    @Nullable Optional<Code> intent = Optional.empty();
    boolean intentIsSet;
    @Nullable Optional<CodeableConcept> asNeededCodeableConcept = Optional.empty();
    boolean asNeededCodeableConceptIsSet;
    @Nullable Optional<List<CodeableConcept>> reasonCode = Optional.empty();
    boolean reasonCodeIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Reference subject) {
      this.subject = subject;
    }
    @JsonProperty("occurrenceDateTime")
    public void setOccurrenceDateTime(Optional<String> occurrenceDateTime) {
      this.occurrenceDateTime = occurrenceDateTime;
      this.occurrenceDateTimeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("occurrencePeriod")
    public void setOccurrencePeriod(Optional<Period> occurrencePeriod) {
      this.occurrencePeriod = occurrencePeriod;
      this.occurrencePeriodIsSet = true;
    }
    @JsonProperty("locationReference")
    public void setLocationReference(Optional<List<Reference>> locationReference) {
      this.locationReference = locationReference;
      this.locationReferenceIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("instantiatesUri")
    public void setInstantiatesUri(Optional<List<Uri>> instantiatesUri) {
      this.instantiatesUri = instantiatesUri;
      this.instantiatesUriIsSet = true;
    }
    @JsonProperty("orderDetail")
    public void setOrderDetail(Optional<List<CodeableConcept>> orderDetail) {
      this.orderDetail = orderDetail;
      this.orderDetailIsSet = true;
    }
    @JsonProperty("requester")
    public void setRequester(Optional<Reference> requester) {
      this.requester = requester;
      this.requesterIsSet = true;
    }
    @JsonProperty("category")
    public void setCategory(Optional<List<CodeableConcept>> category) {
      this.category = category;
      this.categoryIsSet = true;
    }
    @JsonProperty("performerType")
    public void setPerformerType(Optional<CodeableConcept> performerType) {
      this.performerType = performerType;
      this.performerTypeIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(Optional<Code> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("bodySite")
    public void setBodySite(Optional<List<CodeableConcept>> bodySite) {
      this.bodySite = bodySite;
      this.bodySiteIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("quantityRatio")
    public void setQuantityRatio(Optional<Ratio> quantityRatio) {
      this.quantityRatio = quantityRatio;
      this.quantityRatioIsSet = true;
    }
    @JsonProperty("quantityRange")
    public void setQuantityRange(Optional<Range> quantityRange) {
      this.quantityRange = quantityRange;
      this.quantityRangeIsSet = true;
    }
    @JsonProperty("encounter")
    public void setEncounter(Optional<Reference> encounter) {
      this.encounter = encounter;
      this.encounterIsSet = true;
    }
    @JsonProperty("instantiatesCanonical")
    public void setInstantiatesCanonical(Optional<List<Canonical>> instantiatesCanonical) {
      this.instantiatesCanonical = instantiatesCanonical;
      this.instantiatesCanonicalIsSet = true;
    }
    @JsonProperty("patientInstruction")
    public void setPatientInstruction(Optional<String> patientInstruction) {
      this.patientInstruction = patientInstruction;
      this.patientInstructionIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("insurance")
    public void setInsurance(Optional<List<Reference>> insurance) {
      this.insurance = insurance;
      this.insuranceIsSet = true;
    }
    @JsonProperty("requisition")
    public void setRequisition(Optional<Identifier> requisition) {
      this.requisition = requisition;
      this.requisitionIsSet = true;
    }
    @JsonProperty("replaces")
    public void setReplaces(Optional<List<Reference>> replaces) {
      this.replaces = replaces;
      this.replacesIsSet = true;
    }
    @JsonProperty("supportingInfo")
    public void setSupportingInfo(Optional<List<Reference>> supportingInfo) {
      this.supportingInfo = supportingInfo;
      this.supportingInfoIsSet = true;
    }
    @JsonProperty("asNeededBoolean")
    public void setAsNeededBoolean(Optional<Boolean> asNeededBoolean) {
      this.asNeededBoolean = asNeededBoolean;
      this.asNeededBooleanIsSet = true;
    }
    @JsonProperty("performer")
    public void setPerformer(Optional<List<Reference>> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @JsonProperty("priority")
    public void setPriority(Optional<Code> priority) {
      this.priority = priority;
      this.priorityIsSet = true;
    }
    @JsonProperty("specimen")
    public void setSpecimen(Optional<List<Reference>> specimen) {
      this.specimen = specimen;
      this.specimenIsSet = true;
    }
    @JsonProperty("basedOn")
    public void setBasedOn(Optional<List<Reference>> basedOn) {
      this.basedOn = basedOn;
      this.basedOnIsSet = true;
    }
    @JsonProperty("quantityQuantity")
    public void setQuantityQuantity(Optional<Quantity> quantityQuantity) {
      this.quantityQuantity = quantityQuantity;
      this.quantityQuantityIsSet = true;
    }
    @JsonProperty("authoredOn")
    public void setAuthoredOn(Optional<DateTime> authoredOn) {
      this.authoredOn = authoredOn;
      this.authoredOnIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("occurrenceTiming")
    public void setOccurrenceTiming(Optional<Timing> occurrenceTiming) {
      this.occurrenceTiming = occurrenceTiming;
      this.occurrenceTimingIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<CodeableConcept> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("reasonReference")
    public void setReasonReference(Optional<List<Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("doNotPerform")
    public void setDoNotPerform(Optional<Boolean> doNotPerform) {
      this.doNotPerform = doNotPerform;
      this.doNotPerformIsSet = true;
    }
    @JsonProperty("locationCode")
    public void setLocationCode(Optional<List<CodeableConcept>> locationCode) {
      this.locationCode = locationCode;
      this.locationCodeIsSet = true;
    }
    @JsonProperty("relevantHistory")
    public void setRelevantHistory(Optional<List<Reference>> relevantHistory) {
      this.relevantHistory = relevantHistory;
      this.relevantHistoryIsSet = true;
    }
    @JsonProperty("intent")
    public void setIntent(Optional<Code> intent) {
      this.intent = intent;
      this.intentIsSet = true;
    }
    @JsonProperty("asNeededCodeableConcept")
    public void setAsNeededCodeableConcept(Optional<CodeableConcept> asNeededCodeableConcept) {
      this.asNeededCodeableConcept = asNeededCodeableConcept;
      this.asNeededCodeableConceptIsSet = true;
    }
    @JsonProperty("reasonCode")
    public void setReasonCode(Optional<List<CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Reference subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> occurrenceDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> occurrencePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> locationReference() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Uri>> instantiatesUri() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> orderDetail() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> requester() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> category() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> performerType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> bodySite() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Ratio> quantityRatio() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Range> quantityRange() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> encounter() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Canonical>> instantiatesCanonical() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> patientInstruction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> insurance() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Identifier> requisition() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> replaces() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> supportingInfo() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> asNeededBoolean() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> performer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> priority() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> specimen() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> basedOn() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Quantity> quantityQuantity() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> authoredOn() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Timing> occurrenceTiming() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> doNotPerform() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> locationCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> relevantHistory() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> intent() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> asNeededCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableServiceRequest fromJson(Json json) {
    ImmutableServiceRequest.Builder builder = ((ImmutableServiceRequest.Builder) ImmutableServiceRequest.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.subject != null) {
      builder.subject(json.subject);
    }
    if (json.occurrenceDateTimeIsSet) {
      builder.occurrenceDateTime(json.occurrenceDateTime);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.occurrencePeriodIsSet) {
      builder.occurrencePeriod(json.occurrencePeriod);
    }
    if (json.locationReferenceIsSet) {
      builder.locationReference(json.locationReference);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.instantiatesUriIsSet) {
      builder.instantiatesUri(json.instantiatesUri);
    }
    if (json.orderDetailIsSet) {
      builder.orderDetail(json.orderDetail);
    }
    if (json.requesterIsSet) {
      builder.requester(json.requester);
    }
    if (json.categoryIsSet) {
      builder.category(json.category);
    }
    if (json.performerTypeIsSet) {
      builder.performerType(json.performerType);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.bodySiteIsSet) {
      builder.bodySite(json.bodySite);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.quantityRatioIsSet) {
      builder.quantityRatio(json.quantityRatio);
    }
    if (json.quantityRangeIsSet) {
      builder.quantityRange(json.quantityRange);
    }
    if (json.encounterIsSet) {
      builder.encounter(json.encounter);
    }
    if (json.instantiatesCanonicalIsSet) {
      builder.instantiatesCanonical(json.instantiatesCanonical);
    }
    if (json.patientInstructionIsSet) {
      builder.patientInstruction(json.patientInstruction);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.insuranceIsSet) {
      builder.insurance(json.insurance);
    }
    if (json.requisitionIsSet) {
      builder.requisition(json.requisition);
    }
    if (json.replacesIsSet) {
      builder.replaces(json.replaces);
    }
    if (json.supportingInfoIsSet) {
      builder.supportingInfo(json.supportingInfo);
    }
    if (json.asNeededBooleanIsSet) {
      builder.asNeededBoolean(json.asNeededBoolean);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.priorityIsSet) {
      builder.priority(json.priority);
    }
    if (json.specimenIsSet) {
      builder.specimen(json.specimen);
    }
    if (json.basedOnIsSet) {
      builder.basedOn(json.basedOn);
    }
    if (json.quantityQuantityIsSet) {
      builder.quantityQuantity(json.quantityQuantity);
    }
    if (json.authoredOnIsSet) {
      builder.authoredOn(json.authoredOn);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.occurrenceTimingIsSet) {
      builder.occurrenceTiming(json.occurrenceTiming);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.doNotPerformIsSet) {
      builder.doNotPerform(json.doNotPerform);
    }
    if (json.locationCodeIsSet) {
      builder.locationCode(json.locationCode);
    }
    if (json.relevantHistoryIsSet) {
      builder.relevantHistory(json.relevantHistory);
    }
    if (json.intentIsSet) {
      builder.intent(json.intent);
    }
    if (json.asNeededCodeableConceptIsSet) {
      builder.asNeededCodeableConcept(json.asNeededCodeableConcept);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableServiceRequest) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ServiceRequest} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ServiceRequest instance
   */
  public static ServiceRequest copyOf(ServiceRequest instance) {
    if (instance instanceof ImmutableServiceRequest) {
      return (ImmutableServiceRequest) instance;
    }
    return ((ImmutableServiceRequest.Builder) ImmutableServiceRequest.builder())
        .modifierExtension(instance.modifierExtension())
        .implicitRules(instance.implicitRules())
        .subject(instance.subject())
        .occurrenceDateTime(instance.occurrenceDateTime())
        .extension(instance.extension())
        .occurrencePeriod(instance.occurrencePeriod())
        .locationReference(instance.locationReference())
        .resourceType(instance.resourceType())
        .instantiatesUri(instance.instantiatesUri())
        .orderDetail(instance.orderDetail())
        .requester(instance.requester())
        .category(instance.category())
        .performerType(instance.performerType())
        .status(instance.status())
        .bodySite(instance.bodySite())
        .contained(instance.contained())
        .meta(instance.meta())
        .quantityRatio(instance.quantityRatio())
        .quantityRange(instance.quantityRange())
        .encounter(instance.encounter())
        .instantiatesCanonical(instance.instantiatesCanonical())
        .patientInstruction(instance.patientInstruction())
        .identifier(instance.identifier())
        .insurance(instance.insurance())
        .requisition(instance.requisition())
        .replaces(instance.replaces())
        .supportingInfo(instance.supportingInfo())
        .asNeededBoolean(instance.asNeededBoolean())
        .performer(instance.performer())
        .priority(instance.priority())
        .specimen(instance.specimen())
        .basedOn(instance.basedOn())
        .quantityQuantity(instance.quantityQuantity())
        .authoredOn(instance.authoredOn())
        .language(instance.language())
        .occurrenceTiming(instance.occurrenceTiming())
        .note(instance.note())
        .code(instance.code())
        .reasonReference(instance.reasonReference())
        .text(instance.text())
        .doNotPerform(instance.doNotPerform())
        .locationCode(instance.locationCode())
        .relevantHistory(instance.relevantHistory())
        .intent(instance.intent())
        .asNeededCodeableConcept(instance.asNeededCodeableConcept())
        .reasonCode(instance.reasonCode())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link ServiceRequest ServiceRequest}.
   * <pre>
   * ImmutableServiceRequest.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ServiceRequest#modifierExtension() modifierExtension}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link ServiceRequest#implicitRules() implicitRules}
   *    .subject(com.fhir.types.fhir.Reference) // required {@link ServiceRequest#subject() subject}
   *    .occurrenceDateTime(String) // optional {@link ServiceRequest#occurrenceDateTime() occurrenceDateTime}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ServiceRequest#extension() extension}
   *    .occurrencePeriod(com.fhir.types.fhir.Period) // optional {@link ServiceRequest#occurrencePeriod() occurrencePeriod}
   *    .locationReference(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link ServiceRequest#locationReference() locationReference}
   *    .resourceType(String) // required {@link ServiceRequest#resourceType() resourceType}
   *    .instantiatesUri(List&amp;lt;com.fhir.types.fhir.Uri&amp;gt;) // optional {@link ServiceRequest#instantiatesUri() instantiatesUri}
   *    .orderDetail(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link ServiceRequest#orderDetail() orderDetail}
   *    .requester(com.fhir.types.fhir.Reference) // optional {@link ServiceRequest#requester() requester}
   *    .category(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link ServiceRequest#category() category}
   *    .performerType(com.fhir.types.fhir.CodeableConcept) // optional {@link ServiceRequest#performerType() performerType}
   *    .status(com.fhir.types.fhir.Code) // optional {@link ServiceRequest#status() status}
   *    .bodySite(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link ServiceRequest#bodySite() bodySite}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link ServiceRequest#contained() contained}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link ServiceRequest#meta() meta}
   *    .quantityRatio(com.fhir.types.fhir.Ratio) // optional {@link ServiceRequest#quantityRatio() quantityRatio}
   *    .quantityRange(com.fhir.types.fhir.Range) // optional {@link ServiceRequest#quantityRange() quantityRange}
   *    .encounter(com.fhir.types.fhir.Reference) // optional {@link ServiceRequest#encounter() encounter}
   *    .instantiatesCanonical(List&amp;lt;com.fhir.types.fhir.Canonical&amp;gt;) // optional {@link ServiceRequest#instantiatesCanonical() instantiatesCanonical}
   *    .patientInstruction(String) // optional {@link ServiceRequest#patientInstruction() patientInstruction}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link ServiceRequest#identifier() identifier}
   *    .insurance(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link ServiceRequest#insurance() insurance}
   *    .requisition(com.fhir.types.fhir.Identifier) // optional {@link ServiceRequest#requisition() requisition}
   *    .replaces(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link ServiceRequest#replaces() replaces}
   *    .supportingInfo(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link ServiceRequest#supportingInfo() supportingInfo}
   *    .asNeededBoolean(Boolean) // optional {@link ServiceRequest#asNeededBoolean() asNeededBoolean}
   *    .performer(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link ServiceRequest#performer() performer}
   *    .priority(com.fhir.types.fhir.Code) // optional {@link ServiceRequest#priority() priority}
   *    .specimen(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link ServiceRequest#specimen() specimen}
   *    .basedOn(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link ServiceRequest#basedOn() basedOn}
   *    .quantityQuantity(com.fhir.types.fhir.Quantity) // optional {@link ServiceRequest#quantityQuantity() quantityQuantity}
   *    .authoredOn(com.fhir.types.fhir.DateTime) // optional {@link ServiceRequest#authoredOn() authoredOn}
   *    .language(com.fhir.types.fhir.Code) // optional {@link ServiceRequest#language() language}
   *    .occurrenceTiming(com.fhir.types.fhir.Timing) // optional {@link ServiceRequest#occurrenceTiming() occurrenceTiming}
   *    .note(List&amp;lt;com.fhir.types.fhir.Annotation&amp;gt;) // optional {@link ServiceRequest#note() note}
   *    .code(com.fhir.types.fhir.CodeableConcept) // optional {@link ServiceRequest#code() code}
   *    .reasonReference(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link ServiceRequest#reasonReference() reasonReference}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link ServiceRequest#text() text}
   *    .doNotPerform(Boolean) // optional {@link ServiceRequest#doNotPerform() doNotPerform}
   *    .locationCode(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link ServiceRequest#locationCode() locationCode}
   *    .relevantHistory(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link ServiceRequest#relevantHistory() relevantHistory}
   *    .intent(com.fhir.types.fhir.Code) // optional {@link ServiceRequest#intent() intent}
   *    .asNeededCodeableConcept(com.fhir.types.fhir.CodeableConcept) // optional {@link ServiceRequest#asNeededCodeableConcept() asNeededCodeableConcept}
   *    .reasonCode(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link ServiceRequest#reasonCode() reasonCode}
   *    .id(com.fhir.types.fhir.Id) // optional {@link ServiceRequest#id() id}
   *    .build();
   * </pre>
   * @return A new ServiceRequest builder
   */
  public static SubjectBuildStage builder() {
    return new ImmutableServiceRequest.Builder();
  }

  /**
   * Builds instances of type {@link ServiceRequest ServiceRequest}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ServiceRequest", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements SubjectBuildStage, ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_SUBJECT = 0x1L;
    private static final long INIT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2L;
    private static final long OPT_BIT_OCCURRENCE_DATE_TIME = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_OCCURRENCE_PERIOD = 0x10L;
    private static final long OPT_BIT_LOCATION_REFERENCE = 0x20L;
    private static final long OPT_BIT_INSTANTIATES_URI = 0x40L;
    private static final long OPT_BIT_ORDER_DETAIL = 0x80L;
    private static final long OPT_BIT_REQUESTER = 0x100L;
    private static final long OPT_BIT_CATEGORY = 0x200L;
    private static final long OPT_BIT_PERFORMER_TYPE = 0x400L;
    private static final long OPT_BIT_STATUS = 0x800L;
    private static final long OPT_BIT_BODY_SITE = 0x1000L;
    private static final long OPT_BIT_CONTAINED = 0x2000L;
    private static final long OPT_BIT_META = 0x4000L;
    private static final long OPT_BIT_QUANTITY_RATIO = 0x8000L;
    private static final long OPT_BIT_QUANTITY_RANGE = 0x10000L;
    private static final long OPT_BIT_ENCOUNTER = 0x20000L;
    private static final long OPT_BIT_INSTANTIATES_CANONICAL = 0x40000L;
    private static final long OPT_BIT_PATIENT_INSTRUCTION = 0x80000L;
    private static final long OPT_BIT_IDENTIFIER = 0x100000L;
    private static final long OPT_BIT_INSURANCE = 0x200000L;
    private static final long OPT_BIT_REQUISITION = 0x400000L;
    private static final long OPT_BIT_REPLACES = 0x800000L;
    private static final long OPT_BIT_SUPPORTING_INFO = 0x1000000L;
    private static final long OPT_BIT_AS_NEEDED_BOOLEAN = 0x2000000L;
    private static final long OPT_BIT_PERFORMER = 0x4000000L;
    private static final long OPT_BIT_PRIORITY = 0x8000000L;
    private static final long OPT_BIT_SPECIMEN = 0x10000000L;
    private static final long OPT_BIT_BASED_ON = 0x20000000L;
    private static final long OPT_BIT_QUANTITY_QUANTITY = 0x40000000L;
    private static final long OPT_BIT_AUTHORED_ON = 0x80000000L;
    private static final long OPT_BIT_LANGUAGE = 0x100000000L;
    private static final long OPT_BIT_OCCURRENCE_TIMING = 0x200000000L;
    private static final long OPT_BIT_NOTE = 0x400000000L;
    private static final long OPT_BIT_CODE = 0x800000000L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x1000000000L;
    private static final long OPT_BIT_TEXT = 0x2000000000L;
    private static final long OPT_BIT_DO_NOT_PERFORM = 0x4000000000L;
    private static final long OPT_BIT_LOCATION_CODE = 0x8000000000L;
    private static final long OPT_BIT_RELEVANT_HISTORY = 0x10000000000L;
    private static final long OPT_BIT_INTENT = 0x20000000000L;
    private static final long OPT_BIT_AS_NEEDED_CODEABLE_CONCEPT = 0x40000000000L;
    private static final long OPT_BIT_REASON_CODE = 0x80000000000L;
    private static final long OPT_BIT_ID = 0x100000000000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable Uri implicitRules;
    private @Nullable Reference subject;
    private @Nullable String occurrenceDateTime;
    private @Nullable List<Extension> extension;
    private @Nullable Period occurrencePeriod;
    private @Nullable List<Reference> locationReference;
    private @Nullable String resourceType;
    private @Nullable List<Uri> instantiatesUri;
    private @Nullable List<CodeableConcept> orderDetail;
    private @Nullable Reference requester;
    private @Nullable List<CodeableConcept> category;
    private @Nullable CodeableConcept performerType;
    private @Nullable Code status;
    private @Nullable List<CodeableConcept> bodySite;
    private @Nullable List<ResourceList> contained;
    private @Nullable Meta meta;
    private @Nullable Ratio quantityRatio;
    private @Nullable Range quantityRange;
    private @Nullable Reference encounter;
    private @Nullable List<Canonical> instantiatesCanonical;
    private @Nullable String patientInstruction;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<Reference> insurance;
    private @Nullable Identifier requisition;
    private @Nullable List<Reference> replaces;
    private @Nullable List<Reference> supportingInfo;
    private @Nullable Boolean asNeededBoolean;
    private @Nullable List<Reference> performer;
    private @Nullable Code priority;
    private @Nullable List<Reference> specimen;
    private @Nullable List<Reference> basedOn;
    private @Nullable Quantity quantityQuantity;
    private @Nullable DateTime authoredOn;
    private @Nullable Code language;
    private @Nullable Timing occurrenceTiming;
    private @Nullable List<Annotation> note;
    private @Nullable CodeableConcept code;
    private @Nullable List<Reference> reasonReference;
    private @Nullable Narrative text;
    private @Nullable Boolean doNotPerform;
    private @Nullable List<CodeableConcept> locationCode;
    private @Nullable List<Reference> relevantHistory;
    private @Nullable Code intent;
    private @Nullable CodeableConcept asNeededCodeableConcept;
    private @Nullable List<CodeableConcept> reasonCode;
    private @Nullable Id id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ServiceRequest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ServiceRequest#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ServiceRequest#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link ServiceRequest#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the value for the {@link ServiceRequest#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subject")
    public final Builder subject(Reference subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = Objects.requireNonNull(subject, "subject");
      initBits &= ~INIT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder occurrenceDateTime(String occurrenceDateTime) {
      checkNotIsSet(occurrenceDateTimeIsSet(), "occurrenceDateTime");
      this.occurrenceDateTime = Objects.requireNonNull(occurrenceDateTime, "occurrenceDateTime");
      optBits |= OPT_BIT_OCCURRENCE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("occurrenceDateTime")
    public final Builder occurrenceDateTime(Optional<String> occurrenceDateTime) {
      checkNotIsSet(occurrenceDateTimeIsSet(), "occurrenceDateTime");
      this.occurrenceDateTime = occurrenceDateTime.orElse(null);
      optBits |= OPT_BIT_OCCURRENCE_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#extension() extension} to extension.
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
     * Initializes the optional value {@link ServiceRequest#extension() extension} to extension.
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
     * Initializes the optional value {@link ServiceRequest#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder occurrencePeriod(Period occurrencePeriod) {
      checkNotIsSet(occurrencePeriodIsSet(), "occurrencePeriod");
      this.occurrencePeriod = Objects.requireNonNull(occurrencePeriod, "occurrencePeriod");
      optBits |= OPT_BIT_OCCURRENCE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("occurrencePeriod")
    public final Builder occurrencePeriod(Optional<? extends Period> occurrencePeriod) {
      checkNotIsSet(occurrencePeriodIsSet(), "occurrencePeriod");
      this.occurrencePeriod = occurrencePeriod.orElse(null);
      optBits |= OPT_BIT_OCCURRENCE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#locationReference() locationReference} to locationReference.
     * @param locationReference The value for locationReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder locationReference(List<Reference> locationReference) {
      checkNotIsSet(locationReferenceIsSet(), "locationReference");
      this.locationReference = Objects.requireNonNull(locationReference, "locationReference");
      optBits |= OPT_BIT_LOCATION_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#locationReference() locationReference} to locationReference.
     * @param locationReference The value for locationReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("locationReference")
    public final Builder locationReference(Optional<? extends List<Reference>> locationReference) {
      checkNotIsSet(locationReferenceIsSet(), "locationReference");
      this.locationReference = locationReference.orElse(null);
      optBits |= OPT_BIT_LOCATION_REFERENCE;
      return this;
    }

    /**
     * Initializes the value for the {@link ServiceRequest#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link ServiceRequest#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiatesUri(List<Uri> instantiatesUri) {
      checkNotIsSet(instantiatesUriIsSet(), "instantiatesUri");
      this.instantiatesUri = Objects.requireNonNull(instantiatesUri, "instantiatesUri");
      optBits |= OPT_BIT_INSTANTIATES_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("instantiatesUri")
    public final Builder instantiatesUri(Optional<? extends List<Uri>> instantiatesUri) {
      checkNotIsSet(instantiatesUriIsSet(), "instantiatesUri");
      this.instantiatesUri = instantiatesUri.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#orderDetail() orderDetail} to orderDetail.
     * @param orderDetail The value for orderDetail
     * @return {@code this} builder for chained invocation
     */
    public final Builder orderDetail(List<CodeableConcept> orderDetail) {
      checkNotIsSet(orderDetailIsSet(), "orderDetail");
      this.orderDetail = Objects.requireNonNull(orderDetail, "orderDetail");
      optBits |= OPT_BIT_ORDER_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#orderDetail() orderDetail} to orderDetail.
     * @param orderDetail The value for orderDetail
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("orderDetail")
    public final Builder orderDetail(Optional<? extends List<CodeableConcept>> orderDetail) {
      checkNotIsSet(orderDetailIsSet(), "orderDetail");
      this.orderDetail = orderDetail.orElse(null);
      optBits |= OPT_BIT_ORDER_DETAIL;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for chained invocation
     */
    public final Builder requester(Reference requester) {
      checkNotIsSet(requesterIsSet(), "requester");
      this.requester = Objects.requireNonNull(requester, "requester");
      optBits |= OPT_BIT_REQUESTER;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("requester")
    public final Builder requester(Optional<? extends Reference> requester) {
      checkNotIsSet(requesterIsSet(), "requester");
      this.requester = requester.orElse(null);
      optBits |= OPT_BIT_REQUESTER;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    public final Builder category(List<CodeableConcept> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = Objects.requireNonNull(category, "category");
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("category")
    public final Builder category(Optional<? extends List<CodeableConcept>> category) {
      checkNotIsSet(categoryIsSet(), "category");
      this.category = category.orElse(null);
      optBits |= OPT_BIT_CATEGORY;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#performerType() performerType} to performerType.
     * @param performerType The value for performerType
     * @return {@code this} builder for chained invocation
     */
    public final Builder performerType(CodeableConcept performerType) {
      checkNotIsSet(performerTypeIsSet(), "performerType");
      this.performerType = Objects.requireNonNull(performerType, "performerType");
      optBits |= OPT_BIT_PERFORMER_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#performerType() performerType} to performerType.
     * @param performerType The value for performerType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("performerType")
    public final Builder performerType(Optional<? extends CodeableConcept> performerType) {
      checkNotIsSet(performerTypeIsSet(), "performerType");
      this.performerType = performerType.orElse(null);
      optBits |= OPT_BIT_PERFORMER_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(Code status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends Code> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    public final Builder bodySite(List<CodeableConcept> bodySite) {
      checkNotIsSet(bodySiteIsSet(), "bodySite");
      this.bodySite = Objects.requireNonNull(bodySite, "bodySite");
      optBits |= OPT_BIT_BODY_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("bodySite")
    public final Builder bodySite(Optional<? extends List<CodeableConcept>> bodySite) {
      checkNotIsSet(bodySiteIsSet(), "bodySite");
      this.bodySite = bodySite.orElse(null);
      optBits |= OPT_BIT_BODY_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#contained() contained} to contained.
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
     * Initializes the optional value {@link ServiceRequest#contained() contained} to contained.
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
     * Initializes the optional value {@link ServiceRequest#meta() meta} to meta.
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
     * Initializes the optional value {@link ServiceRequest#meta() meta} to meta.
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
     * Initializes the optional value {@link ServiceRequest#quantityRatio() quantityRatio} to quantityRatio.
     * @param quantityRatio The value for quantityRatio
     * @return {@code this} builder for chained invocation
     */
    public final Builder quantityRatio(Ratio quantityRatio) {
      checkNotIsSet(quantityRatioIsSet(), "quantityRatio");
      this.quantityRatio = Objects.requireNonNull(quantityRatio, "quantityRatio");
      optBits |= OPT_BIT_QUANTITY_RATIO;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#quantityRatio() quantityRatio} to quantityRatio.
     * @param quantityRatio The value for quantityRatio
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("quantityRatio")
    public final Builder quantityRatio(Optional<? extends Ratio> quantityRatio) {
      checkNotIsSet(quantityRatioIsSet(), "quantityRatio");
      this.quantityRatio = quantityRatio.orElse(null);
      optBits |= OPT_BIT_QUANTITY_RATIO;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#quantityRange() quantityRange} to quantityRange.
     * @param quantityRange The value for quantityRange
     * @return {@code this} builder for chained invocation
     */
    public final Builder quantityRange(Range quantityRange) {
      checkNotIsSet(quantityRangeIsSet(), "quantityRange");
      this.quantityRange = Objects.requireNonNull(quantityRange, "quantityRange");
      optBits |= OPT_BIT_QUANTITY_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#quantityRange() quantityRange} to quantityRange.
     * @param quantityRange The value for quantityRange
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("quantityRange")
    public final Builder quantityRange(Optional<? extends Range> quantityRange) {
      checkNotIsSet(quantityRangeIsSet(), "quantityRange");
      this.quantityRange = quantityRange.orElse(null);
      optBits |= OPT_BIT_QUANTITY_RANGE;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link ServiceRequest#encounter() encounter} to encounter.
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
     * Initializes the optional value {@link ServiceRequest#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    public final Builder instantiatesCanonical(List<Canonical> instantiatesCanonical) {
      checkNotIsSet(instantiatesCanonicalIsSet(), "instantiatesCanonical");
      this.instantiatesCanonical = Objects.requireNonNull(instantiatesCanonical, "instantiatesCanonical");
      optBits |= OPT_BIT_INSTANTIATES_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("instantiatesCanonical")
    public final Builder instantiatesCanonical(Optional<? extends List<Canonical>> instantiatesCanonical) {
      checkNotIsSet(instantiatesCanonicalIsSet(), "instantiatesCanonical");
      this.instantiatesCanonical = instantiatesCanonical.orElse(null);
      optBits |= OPT_BIT_INSTANTIATES_CANONICAL;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#patientInstruction() patientInstruction} to patientInstruction.
     * @param patientInstruction The value for patientInstruction
     * @return {@code this} builder for chained invocation
     */
    public final Builder patientInstruction(String patientInstruction) {
      checkNotIsSet(patientInstructionIsSet(), "patientInstruction");
      this.patientInstruction = Objects.requireNonNull(patientInstruction, "patientInstruction");
      optBits |= OPT_BIT_PATIENT_INSTRUCTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#patientInstruction() patientInstruction} to patientInstruction.
     * @param patientInstruction The value for patientInstruction
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("patientInstruction")
    public final Builder patientInstruction(Optional<String> patientInstruction) {
      checkNotIsSet(patientInstructionIsSet(), "patientInstruction");
      this.patientInstruction = patientInstruction.orElse(null);
      optBits |= OPT_BIT_PATIENT_INSTRUCTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ServiceRequest#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link ServiceRequest#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for chained invocation
     */
    public final Builder insurance(List<Reference> insurance) {
      checkNotIsSet(insuranceIsSet(), "insurance");
      this.insurance = Objects.requireNonNull(insurance, "insurance");
      optBits |= OPT_BIT_INSURANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("insurance")
    public final Builder insurance(Optional<? extends List<Reference>> insurance) {
      checkNotIsSet(insuranceIsSet(), "insurance");
      this.insurance = insurance.orElse(null);
      optBits |= OPT_BIT_INSURANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#requisition() requisition} to requisition.
     * @param requisition The value for requisition
     * @return {@code this} builder for chained invocation
     */
    public final Builder requisition(Identifier requisition) {
      checkNotIsSet(requisitionIsSet(), "requisition");
      this.requisition = Objects.requireNonNull(requisition, "requisition");
      optBits |= OPT_BIT_REQUISITION;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#requisition() requisition} to requisition.
     * @param requisition The value for requisition
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("requisition")
    public final Builder requisition(Optional<? extends Identifier> requisition) {
      checkNotIsSet(requisitionIsSet(), "requisition");
      this.requisition = requisition.orElse(null);
      optBits |= OPT_BIT_REQUISITION;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for chained invocation
     */
    public final Builder replaces(List<Reference> replaces) {
      checkNotIsSet(replacesIsSet(), "replaces");
      this.replaces = Objects.requireNonNull(replaces, "replaces");
      optBits |= OPT_BIT_REPLACES;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("replaces")
    public final Builder replaces(Optional<? extends List<Reference>> replaces) {
      checkNotIsSet(replacesIsSet(), "replaces");
      this.replaces = replaces.orElse(null);
      optBits |= OPT_BIT_REPLACES;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for chained invocation
     */
    public final Builder supportingInfo(List<Reference> supportingInfo) {
      checkNotIsSet(supportingInfoIsSet(), "supportingInfo");
      this.supportingInfo = Objects.requireNonNull(supportingInfo, "supportingInfo");
      optBits |= OPT_BIT_SUPPORTING_INFO;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("supportingInfo")
    public final Builder supportingInfo(Optional<? extends List<Reference>> supportingInfo) {
      checkNotIsSet(supportingInfoIsSet(), "supportingInfo");
      this.supportingInfo = supportingInfo.orElse(null);
      optBits |= OPT_BIT_SUPPORTING_INFO;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#asNeededBoolean() asNeededBoolean} to asNeededBoolean.
     * @param asNeededBoolean The value for asNeededBoolean
     * @return {@code this} builder for chained invocation
     */
    public final Builder asNeededBoolean(boolean asNeededBoolean) {
      checkNotIsSet(asNeededBooleanIsSet(), "asNeededBoolean");
      this.asNeededBoolean = asNeededBoolean;
      optBits |= OPT_BIT_AS_NEEDED_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#asNeededBoolean() asNeededBoolean} to asNeededBoolean.
     * @param asNeededBoolean The value for asNeededBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("asNeededBoolean")
    public final Builder asNeededBoolean(Optional<Boolean> asNeededBoolean) {
      checkNotIsSet(asNeededBooleanIsSet(), "asNeededBoolean");
      this.asNeededBoolean = asNeededBoolean.orElse(null);
      optBits |= OPT_BIT_AS_NEEDED_BOOLEAN;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    public final Builder performer(List<Reference> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = Objects.requireNonNull(performer, "performer");
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("performer")
    public final Builder performer(Optional<? extends List<Reference>> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = performer.orElse(null);
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    public final Builder priority(Code priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = Objects.requireNonNull(priority, "priority");
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("priority")
    public final Builder priority(Optional<? extends Code> priority) {
      checkNotIsSet(priorityIsSet(), "priority");
      this.priority = priority.orElse(null);
      optBits |= OPT_BIT_PRIORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for chained invocation
     */
    public final Builder specimen(List<Reference> specimen) {
      checkNotIsSet(specimenIsSet(), "specimen");
      this.specimen = Objects.requireNonNull(specimen, "specimen");
      optBits |= OPT_BIT_SPECIMEN;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("specimen")
    public final Builder specimen(Optional<? extends List<Reference>> specimen) {
      checkNotIsSet(specimenIsSet(), "specimen");
      this.specimen = specimen.orElse(null);
      optBits |= OPT_BIT_SPECIMEN;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder basedOn(List<Reference> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = Objects.requireNonNull(basedOn, "basedOn");
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("basedOn")
    public final Builder basedOn(Optional<? extends List<Reference>> basedOn) {
      checkNotIsSet(basedOnIsSet(), "basedOn");
      this.basedOn = basedOn.orElse(null);
      optBits |= OPT_BIT_BASED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#quantityQuantity() quantityQuantity} to quantityQuantity.
     * @param quantityQuantity The value for quantityQuantity
     * @return {@code this} builder for chained invocation
     */
    public final Builder quantityQuantity(Quantity quantityQuantity) {
      checkNotIsSet(quantityQuantityIsSet(), "quantityQuantity");
      this.quantityQuantity = Objects.requireNonNull(quantityQuantity, "quantityQuantity");
      optBits |= OPT_BIT_QUANTITY_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#quantityQuantity() quantityQuantity} to quantityQuantity.
     * @param quantityQuantity The value for quantityQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("quantityQuantity")
    public final Builder quantityQuantity(Optional<? extends Quantity> quantityQuantity) {
      checkNotIsSet(quantityQuantityIsSet(), "quantityQuantity");
      this.quantityQuantity = quantityQuantity.orElse(null);
      optBits |= OPT_BIT_QUANTITY_QUANTITY;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for chained invocation
     */
    public final Builder authoredOn(DateTime authoredOn) {
      checkNotIsSet(authoredOnIsSet(), "authoredOn");
      this.authoredOn = Objects.requireNonNull(authoredOn, "authoredOn");
      optBits |= OPT_BIT_AUTHORED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("authoredOn")
    public final Builder authoredOn(Optional<? extends DateTime> authoredOn) {
      checkNotIsSet(authoredOnIsSet(), "authoredOn");
      this.authoredOn = authoredOn.orElse(null);
      optBits |= OPT_BIT_AUTHORED_ON;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#language() language} to language.
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
     * Initializes the optional value {@link ServiceRequest#language() language} to language.
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
     * Initializes the optional value {@link ServiceRequest#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
     * @param occurrenceTiming The value for occurrenceTiming
     * @return {@code this} builder for chained invocation
     */
    public final Builder occurrenceTiming(Timing occurrenceTiming) {
      checkNotIsSet(occurrenceTimingIsSet(), "occurrenceTiming");
      this.occurrenceTiming = Objects.requireNonNull(occurrenceTiming, "occurrenceTiming");
      optBits |= OPT_BIT_OCCURRENCE_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
     * @param occurrenceTiming The value for occurrenceTiming
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("occurrenceTiming")
    public final Builder occurrenceTiming(Optional<? extends Timing> occurrenceTiming) {
      checkNotIsSet(occurrenceTimingIsSet(), "occurrenceTiming");
      this.occurrenceTiming = occurrenceTiming.orElse(null);
      optBits |= OPT_BIT_OCCURRENCE_TIMING;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#note() note} to note.
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
     * Initializes the optional value {@link ServiceRequest#note() note} to note.
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
     * Initializes the optional value {@link ServiceRequest#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(CodeableConcept code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends CodeableConcept> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link ServiceRequest#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link ServiceRequest#text() text} to text.
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
     * Initializes the optional value {@link ServiceRequest#text() text} to text.
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
     * Initializes the optional value {@link ServiceRequest#doNotPerform() doNotPerform} to doNotPerform.
     * @param doNotPerform The value for doNotPerform
     * @return {@code this} builder for chained invocation
     */
    public final Builder doNotPerform(boolean doNotPerform) {
      checkNotIsSet(doNotPerformIsSet(), "doNotPerform");
      this.doNotPerform = doNotPerform;
      optBits |= OPT_BIT_DO_NOT_PERFORM;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#doNotPerform() doNotPerform} to doNotPerform.
     * @param doNotPerform The value for doNotPerform
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("doNotPerform")
    public final Builder doNotPerform(Optional<Boolean> doNotPerform) {
      checkNotIsSet(doNotPerformIsSet(), "doNotPerform");
      this.doNotPerform = doNotPerform.orElse(null);
      optBits |= OPT_BIT_DO_NOT_PERFORM;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#locationCode() locationCode} to locationCode.
     * @param locationCode The value for locationCode
     * @return {@code this} builder for chained invocation
     */
    public final Builder locationCode(List<CodeableConcept> locationCode) {
      checkNotIsSet(locationCodeIsSet(), "locationCode");
      this.locationCode = Objects.requireNonNull(locationCode, "locationCode");
      optBits |= OPT_BIT_LOCATION_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#locationCode() locationCode} to locationCode.
     * @param locationCode The value for locationCode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("locationCode")
    public final Builder locationCode(Optional<? extends List<CodeableConcept>> locationCode) {
      checkNotIsSet(locationCodeIsSet(), "locationCode");
      this.locationCode = locationCode.orElse(null);
      optBits |= OPT_BIT_LOCATION_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#relevantHistory() relevantHistory} to relevantHistory.
     * @param relevantHistory The value for relevantHistory
     * @return {@code this} builder for chained invocation
     */
    public final Builder relevantHistory(List<Reference> relevantHistory) {
      checkNotIsSet(relevantHistoryIsSet(), "relevantHistory");
      this.relevantHistory = Objects.requireNonNull(relevantHistory, "relevantHistory");
      optBits |= OPT_BIT_RELEVANT_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#relevantHistory() relevantHistory} to relevantHistory.
     * @param relevantHistory The value for relevantHistory
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("relevantHistory")
    public final Builder relevantHistory(Optional<? extends List<Reference>> relevantHistory) {
      checkNotIsSet(relevantHistoryIsSet(), "relevantHistory");
      this.relevantHistory = relevantHistory.orElse(null);
      optBits |= OPT_BIT_RELEVANT_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for chained invocation
     */
    public final Builder intent(Code intent) {
      checkNotIsSet(intentIsSet(), "intent");
      this.intent = Objects.requireNonNull(intent, "intent");
      optBits |= OPT_BIT_INTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("intent")
    public final Builder intent(Optional<? extends Code> intent) {
      checkNotIsSet(intentIsSet(), "intent");
      this.intent = intent.orElse(null);
      optBits |= OPT_BIT_INTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#asNeededCodeableConcept() asNeededCodeableConcept} to asNeededCodeableConcept.
     * @param asNeededCodeableConcept The value for asNeededCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder asNeededCodeableConcept(CodeableConcept asNeededCodeableConcept) {
      checkNotIsSet(asNeededCodeableConceptIsSet(), "asNeededCodeableConcept");
      this.asNeededCodeableConcept = Objects.requireNonNull(asNeededCodeableConcept, "asNeededCodeableConcept");
      optBits |= OPT_BIT_AS_NEEDED_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#asNeededCodeableConcept() asNeededCodeableConcept} to asNeededCodeableConcept.
     * @param asNeededCodeableConcept The value for asNeededCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("asNeededCodeableConcept")
    public final Builder asNeededCodeableConcept(Optional<? extends CodeableConcept> asNeededCodeableConcept) {
      checkNotIsSet(asNeededCodeableConceptIsSet(), "asNeededCodeableConcept");
      this.asNeededCodeableConcept = asNeededCodeableConcept.orElse(null);
      optBits |= OPT_BIT_AS_NEEDED_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link ServiceRequest#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link ServiceRequest#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link ServiceRequest#id() id} to id.
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
     * Initializes the optional value {@link ServiceRequest#id() id} to id.
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
     * Builds a new {@link ServiceRequest ServiceRequest}.
     * @return An immutable instance of ServiceRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ServiceRequest build() {
      checkRequiredAttributes();
      return new ImmutableServiceRequest(
          modifierExtension,
          implicitRules,
          subject,
          occurrenceDateTime,
          extension,
          occurrencePeriod,
          locationReference,
          resourceType,
          instantiatesUri,
          orderDetail,
          requester,
          category,
          performerType,
          status,
          bodySite,
          contained,
          meta,
          quantityRatio,
          quantityRange,
          encounter,
          instantiatesCanonical,
          patientInstruction,
          identifier,
          insurance,
          requisition,
          replaces,
          supportingInfo,
          asNeededBoolean,
          performer,
          priority,
          specimen,
          basedOn,
          quantityQuantity,
          authoredOn,
          language,
          occurrenceTiming,
          note,
          code,
          reasonReference,
          text,
          doNotPerform,
          locationCode,
          relevantHistory,
          intent,
          asNeededCodeableConcept,
          reasonCode,
          id);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean occurrenceDateTimeIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_DATE_TIME) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean occurrencePeriodIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_PERIOD) != 0;
    }

    private boolean locationReferenceIsSet() {
      return (optBits & OPT_BIT_LOCATION_REFERENCE) != 0;
    }

    private boolean instantiatesUriIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_URI) != 0;
    }

    private boolean orderDetailIsSet() {
      return (optBits & OPT_BIT_ORDER_DETAIL) != 0;
    }

    private boolean requesterIsSet() {
      return (optBits & OPT_BIT_REQUESTER) != 0;
    }

    private boolean categoryIsSet() {
      return (optBits & OPT_BIT_CATEGORY) != 0;
    }

    private boolean performerTypeIsSet() {
      return (optBits & OPT_BIT_PERFORMER_TYPE) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean bodySiteIsSet() {
      return (optBits & OPT_BIT_BODY_SITE) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean quantityRatioIsSet() {
      return (optBits & OPT_BIT_QUANTITY_RATIO) != 0;
    }

    private boolean quantityRangeIsSet() {
      return (optBits & OPT_BIT_QUANTITY_RANGE) != 0;
    }

    private boolean encounterIsSet() {
      return (optBits & OPT_BIT_ENCOUNTER) != 0;
    }

    private boolean instantiatesCanonicalIsSet() {
      return (optBits & OPT_BIT_INSTANTIATES_CANONICAL) != 0;
    }

    private boolean patientInstructionIsSet() {
      return (optBits & OPT_BIT_PATIENT_INSTRUCTION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean insuranceIsSet() {
      return (optBits & OPT_BIT_INSURANCE) != 0;
    }

    private boolean requisitionIsSet() {
      return (optBits & OPT_BIT_REQUISITION) != 0;
    }

    private boolean replacesIsSet() {
      return (optBits & OPT_BIT_REPLACES) != 0;
    }

    private boolean supportingInfoIsSet() {
      return (optBits & OPT_BIT_SUPPORTING_INFO) != 0;
    }

    private boolean asNeededBooleanIsSet() {
      return (optBits & OPT_BIT_AS_NEEDED_BOOLEAN) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean priorityIsSet() {
      return (optBits & OPT_BIT_PRIORITY) != 0;
    }

    private boolean specimenIsSet() {
      return (optBits & OPT_BIT_SPECIMEN) != 0;
    }

    private boolean basedOnIsSet() {
      return (optBits & OPT_BIT_BASED_ON) != 0;
    }

    private boolean quantityQuantityIsSet() {
      return (optBits & OPT_BIT_QUANTITY_QUANTITY) != 0;
    }

    private boolean authoredOnIsSet() {
      return (optBits & OPT_BIT_AUTHORED_ON) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean occurrenceTimingIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_TIMING) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean doNotPerformIsSet() {
      return (optBits & OPT_BIT_DO_NOT_PERFORM) != 0;
    }

    private boolean locationCodeIsSet() {
      return (optBits & OPT_BIT_LOCATION_CODE) != 0;
    }

    private boolean relevantHistoryIsSet() {
      return (optBits & OPT_BIT_RELEVANT_HISTORY) != 0;
    }

    private boolean intentIsSet() {
      return (optBits & OPT_BIT_INTENT) != 0;
    }

    private boolean asNeededCodeableConceptIsSet() {
      return (optBits & OPT_BIT_AS_NEEDED_CODEABLE_CONCEPT) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean subjectIsSet() {
      return (initBits & INIT_BIT_SUBJECT) == 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ServiceRequest is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!subjectIsSet()) attributes.add("subject");
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build ServiceRequest, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "ServiceRequest", generator = "Immutables")
  public interface SubjectBuildStage {
    /**
     * Initializes the value for the {@link ServiceRequest#subject() subject} attribute.
     * @param subject The value for subject 
     * @return {@code this} builder for use in a chained invocation
     */
    ResourceTypeBuildStage subject(Reference subject);
  }

  @Generated(from = "ServiceRequest", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link ServiceRequest#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "ServiceRequest", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link ServiceRequest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link ServiceRequest#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link ServiceRequest#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link ServiceRequest#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link ServiceRequest#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrenceDateTime(String occurrenceDateTime);

    /**
     * Initializes the optional value {@link ServiceRequest#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrenceDateTime(Optional<String> occurrenceDateTime);

    /**
     * Initializes the optional value {@link ServiceRequest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link ServiceRequest#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link ServiceRequest#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrencePeriod(Period occurrencePeriod);

    /**
     * Initializes the optional value {@link ServiceRequest#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrencePeriod(Optional<? extends Period> occurrencePeriod);

    /**
     * Initializes the optional value {@link ServiceRequest#locationReference() locationReference} to locationReference.
     * @param locationReference The value for locationReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal locationReference(List<Reference> locationReference);

    /**
     * Initializes the optional value {@link ServiceRequest#locationReference() locationReference} to locationReference.
     * @param locationReference The value for locationReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal locationReference(Optional<? extends List<Reference>> locationReference);

    /**
     * Initializes the optional value {@link ServiceRequest#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesUri(List<Uri> instantiatesUri);

    /**
     * Initializes the optional value {@link ServiceRequest#instantiatesUri() instantiatesUri} to instantiatesUri.
     * @param instantiatesUri The value for instantiatesUri
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesUri(Optional<? extends List<Uri>> instantiatesUri);

    /**
     * Initializes the optional value {@link ServiceRequest#orderDetail() orderDetail} to orderDetail.
     * @param orderDetail The value for orderDetail
     * @return {@code this} builder for chained invocation
     */
    BuildFinal orderDetail(List<CodeableConcept> orderDetail);

    /**
     * Initializes the optional value {@link ServiceRequest#orderDetail() orderDetail} to orderDetail.
     * @param orderDetail The value for orderDetail
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal orderDetail(Optional<? extends List<CodeableConcept>> orderDetail);

    /**
     * Initializes the optional value {@link ServiceRequest#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for chained invocation
     */
    BuildFinal requester(Reference requester);

    /**
     * Initializes the optional value {@link ServiceRequest#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal requester(Optional<? extends Reference> requester);

    /**
     * Initializes the optional value {@link ServiceRequest#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for chained invocation
     */
    BuildFinal category(List<CodeableConcept> category);

    /**
     * Initializes the optional value {@link ServiceRequest#category() category} to category.
     * @param category The value for category
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal category(Optional<? extends List<CodeableConcept>> category);

    /**
     * Initializes the optional value {@link ServiceRequest#performerType() performerType} to performerType.
     * @param performerType The value for performerType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performerType(CodeableConcept performerType);

    /**
     * Initializes the optional value {@link ServiceRequest#performerType() performerType} to performerType.
     * @param performerType The value for performerType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performerType(Optional<? extends CodeableConcept> performerType);

    /**
     * Initializes the optional value {@link ServiceRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(Code status);

    /**
     * Initializes the optional value {@link ServiceRequest#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends Code> status);

    /**
     * Initializes the optional value {@link ServiceRequest#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for chained invocation
     */
    BuildFinal bodySite(List<CodeableConcept> bodySite);

    /**
     * Initializes the optional value {@link ServiceRequest#bodySite() bodySite} to bodySite.
     * @param bodySite The value for bodySite
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal bodySite(Optional<? extends List<CodeableConcept>> bodySite);

    /**
     * Initializes the optional value {@link ServiceRequest#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link ServiceRequest#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link ServiceRequest#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link ServiceRequest#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link ServiceRequest#quantityRatio() quantityRatio} to quantityRatio.
     * @param quantityRatio The value for quantityRatio
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quantityRatio(Ratio quantityRatio);

    /**
     * Initializes the optional value {@link ServiceRequest#quantityRatio() quantityRatio} to quantityRatio.
     * @param quantityRatio The value for quantityRatio
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantityRatio(Optional<? extends Ratio> quantityRatio);

    /**
     * Initializes the optional value {@link ServiceRequest#quantityRange() quantityRange} to quantityRange.
     * @param quantityRange The value for quantityRange
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quantityRange(Range quantityRange);

    /**
     * Initializes the optional value {@link ServiceRequest#quantityRange() quantityRange} to quantityRange.
     * @param quantityRange The value for quantityRange
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantityRange(Optional<? extends Range> quantityRange);

    /**
     * Initializes the optional value {@link ServiceRequest#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for chained invocation
     */
    BuildFinal encounter(Reference encounter);

    /**
     * Initializes the optional value {@link ServiceRequest#encounter() encounter} to encounter.
     * @param encounter The value for encounter
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal encounter(Optional<? extends Reference> encounter);

    /**
     * Initializes the optional value {@link ServiceRequest#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for chained invocation
     */
    BuildFinal instantiatesCanonical(List<Canonical> instantiatesCanonical);

    /**
     * Initializes the optional value {@link ServiceRequest#instantiatesCanonical() instantiatesCanonical} to instantiatesCanonical.
     * @param instantiatesCanonical The value for instantiatesCanonical
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal instantiatesCanonical(Optional<? extends List<Canonical>> instantiatesCanonical);

    /**
     * Initializes the optional value {@link ServiceRequest#patientInstruction() patientInstruction} to patientInstruction.
     * @param patientInstruction The value for patientInstruction
     * @return {@code this} builder for chained invocation
     */
    BuildFinal patientInstruction(String patientInstruction);

    /**
     * Initializes the optional value {@link ServiceRequest#patientInstruction() patientInstruction} to patientInstruction.
     * @param patientInstruction The value for patientInstruction
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal patientInstruction(Optional<String> patientInstruction);

    /**
     * Initializes the optional value {@link ServiceRequest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link ServiceRequest#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link ServiceRequest#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for chained invocation
     */
    BuildFinal insurance(List<Reference> insurance);

    /**
     * Initializes the optional value {@link ServiceRequest#insurance() insurance} to insurance.
     * @param insurance The value for insurance
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal insurance(Optional<? extends List<Reference>> insurance);

    /**
     * Initializes the optional value {@link ServiceRequest#requisition() requisition} to requisition.
     * @param requisition The value for requisition
     * @return {@code this} builder for chained invocation
     */
    BuildFinal requisition(Identifier requisition);

    /**
     * Initializes the optional value {@link ServiceRequest#requisition() requisition} to requisition.
     * @param requisition The value for requisition
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal requisition(Optional<? extends Identifier> requisition);

    /**
     * Initializes the optional value {@link ServiceRequest#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for chained invocation
     */
    BuildFinal replaces(List<Reference> replaces);

    /**
     * Initializes the optional value {@link ServiceRequest#replaces() replaces} to replaces.
     * @param replaces The value for replaces
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal replaces(Optional<? extends List<Reference>> replaces);

    /**
     * Initializes the optional value {@link ServiceRequest#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for chained invocation
     */
    BuildFinal supportingInfo(List<Reference> supportingInfo);

    /**
     * Initializes the optional value {@link ServiceRequest#supportingInfo() supportingInfo} to supportingInfo.
     * @param supportingInfo The value for supportingInfo
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal supportingInfo(Optional<? extends List<Reference>> supportingInfo);

    /**
     * Initializes the optional value {@link ServiceRequest#asNeededBoolean() asNeededBoolean} to asNeededBoolean.
     * @param asNeededBoolean The value for asNeededBoolean
     * @return {@code this} builder for chained invocation
     */
    BuildFinal asNeededBoolean(boolean asNeededBoolean);

    /**
     * Initializes the optional value {@link ServiceRequest#asNeededBoolean() asNeededBoolean} to asNeededBoolean.
     * @param asNeededBoolean The value for asNeededBoolean
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal asNeededBoolean(Optional<Boolean> asNeededBoolean);

    /**
     * Initializes the optional value {@link ServiceRequest#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performer(List<Reference> performer);

    /**
     * Initializes the optional value {@link ServiceRequest#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performer(Optional<? extends List<Reference>> performer);

    /**
     * Initializes the optional value {@link ServiceRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for chained invocation
     */
    BuildFinal priority(Code priority);

    /**
     * Initializes the optional value {@link ServiceRequest#priority() priority} to priority.
     * @param priority The value for priority
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal priority(Optional<? extends Code> priority);

    /**
     * Initializes the optional value {@link ServiceRequest#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specimen(List<Reference> specimen);

    /**
     * Initializes the optional value {@link ServiceRequest#specimen() specimen} to specimen.
     * @param specimen The value for specimen
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specimen(Optional<? extends List<Reference>> specimen);

    /**
     * Initializes the optional value {@link ServiceRequest#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal basedOn(List<Reference> basedOn);

    /**
     * Initializes the optional value {@link ServiceRequest#basedOn() basedOn} to basedOn.
     * @param basedOn The value for basedOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal basedOn(Optional<? extends List<Reference>> basedOn);

    /**
     * Initializes the optional value {@link ServiceRequest#quantityQuantity() quantityQuantity} to quantityQuantity.
     * @param quantityQuantity The value for quantityQuantity
     * @return {@code this} builder for chained invocation
     */
    BuildFinal quantityQuantity(Quantity quantityQuantity);

    /**
     * Initializes the optional value {@link ServiceRequest#quantityQuantity() quantityQuantity} to quantityQuantity.
     * @param quantityQuantity The value for quantityQuantity
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal quantityQuantity(Optional<? extends Quantity> quantityQuantity);

    /**
     * Initializes the optional value {@link ServiceRequest#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for chained invocation
     */
    BuildFinal authoredOn(DateTime authoredOn);

    /**
     * Initializes the optional value {@link ServiceRequest#authoredOn() authoredOn} to authoredOn.
     * @param authoredOn The value for authoredOn
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal authoredOn(Optional<? extends DateTime> authoredOn);

    /**
     * Initializes the optional value {@link ServiceRequest#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link ServiceRequest#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link ServiceRequest#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
     * @param occurrenceTiming The value for occurrenceTiming
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrenceTiming(Timing occurrenceTiming);

    /**
     * Initializes the optional value {@link ServiceRequest#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
     * @param occurrenceTiming The value for occurrenceTiming
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrenceTiming(Optional<? extends Timing> occurrenceTiming);

    /**
     * Initializes the optional value {@link ServiceRequest#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link ServiceRequest#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link ServiceRequest#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    BuildFinal code(CodeableConcept code);

    /**
     * Initializes the optional value {@link ServiceRequest#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal code(Optional<? extends CodeableConcept> code);

    /**
     * Initializes the optional value {@link ServiceRequest#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(List<Reference> reasonReference);

    /**
     * Initializes the optional value {@link ServiceRequest#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(Optional<? extends List<Reference>> reasonReference);

    /**
     * Initializes the optional value {@link ServiceRequest#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link ServiceRequest#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link ServiceRequest#doNotPerform() doNotPerform} to doNotPerform.
     * @param doNotPerform The value for doNotPerform
     * @return {@code this} builder for chained invocation
     */
    BuildFinal doNotPerform(boolean doNotPerform);

    /**
     * Initializes the optional value {@link ServiceRequest#doNotPerform() doNotPerform} to doNotPerform.
     * @param doNotPerform The value for doNotPerform
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal doNotPerform(Optional<Boolean> doNotPerform);

    /**
     * Initializes the optional value {@link ServiceRequest#locationCode() locationCode} to locationCode.
     * @param locationCode The value for locationCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal locationCode(List<CodeableConcept> locationCode);

    /**
     * Initializes the optional value {@link ServiceRequest#locationCode() locationCode} to locationCode.
     * @param locationCode The value for locationCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal locationCode(Optional<? extends List<CodeableConcept>> locationCode);

    /**
     * Initializes the optional value {@link ServiceRequest#relevantHistory() relevantHistory} to relevantHistory.
     * @param relevantHistory The value for relevantHistory
     * @return {@code this} builder for chained invocation
     */
    BuildFinal relevantHistory(List<Reference> relevantHistory);

    /**
     * Initializes the optional value {@link ServiceRequest#relevantHistory() relevantHistory} to relevantHistory.
     * @param relevantHistory The value for relevantHistory
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal relevantHistory(Optional<? extends List<Reference>> relevantHistory);

    /**
     * Initializes the optional value {@link ServiceRequest#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for chained invocation
     */
    BuildFinal intent(Code intent);

    /**
     * Initializes the optional value {@link ServiceRequest#intent() intent} to intent.
     * @param intent The value for intent
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal intent(Optional<? extends Code> intent);

    /**
     * Initializes the optional value {@link ServiceRequest#asNeededCodeableConcept() asNeededCodeableConcept} to asNeededCodeableConcept.
     * @param asNeededCodeableConcept The value for asNeededCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal asNeededCodeableConcept(CodeableConcept asNeededCodeableConcept);

    /**
     * Initializes the optional value {@link ServiceRequest#asNeededCodeableConcept() asNeededCodeableConcept} to asNeededCodeableConcept.
     * @param asNeededCodeableConcept The value for asNeededCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal asNeededCodeableConcept(Optional<? extends CodeableConcept> asNeededCodeableConcept);

    /**
     * Initializes the optional value {@link ServiceRequest#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(List<CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link ServiceRequest#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(Optional<? extends List<CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link ServiceRequest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link ServiceRequest#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Builds a new {@link ServiceRequest ServiceRequest}.
     * @return An immutable instance of ServiceRequest
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    ServiceRequest build();
  }
}

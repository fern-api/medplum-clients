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
 * Immutable implementation of {@link Contract_Action}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableContract_Action.builder()}.
 */
@Generated(from = "Contract_Action", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableContract_Action implements Contract_Action {
  private final @Nullable List<Extension> modifierExtension;
  private final CodeableConcept status;
  private final @Nullable Timing occurrenceTiming;
  private final @Nullable List<Reference> reasonReference;
  private final @Nullable List<String> linkId;
  private final @Nullable CodeableConcept performerRole;
  private final @Nullable List<String> contextLinkId;
  private final @Nullable List<CodeableConcept> reasonCode;
  private final @Nullable List<Annotation> note;
  private final @Nullable Reference context;
  private final @Nullable List<String> reason;
  private final @Nullable String occurrenceDateTime;
  private final @Nullable Reference performer;
  private final @Nullable List<Contract_Subject> subject;
  private final @Nullable List<Reference> requester;
  private final CodeableConcept type;
  private final @Nullable Boolean doNotPerform;
  private final CodeableConcept intent;
  private final @Nullable List<String> reasonLinkId;
  private final @Nullable String id;
  private final @Nullable Period occurrencePeriod;
  private final @Nullable List<String> requesterLinkId;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<CodeableConcept> performerType;
  private final @Nullable List<UnsignedInt> securityLabelNumber;
  private final @Nullable List<String> performerLinkId;

  private ImmutableContract_Action(
      @Nullable List<Extension> modifierExtension,
      CodeableConcept status,
      @Nullable Timing occurrenceTiming,
      @Nullable List<Reference> reasonReference,
      @Nullable List<String> linkId,
      @Nullable CodeableConcept performerRole,
      @Nullable List<String> contextLinkId,
      @Nullable List<CodeableConcept> reasonCode,
      @Nullable List<Annotation> note,
      @Nullable Reference context,
      @Nullable List<String> reason,
      @Nullable String occurrenceDateTime,
      @Nullable Reference performer,
      @Nullable List<Contract_Subject> subject,
      @Nullable List<Reference> requester,
      CodeableConcept type,
      @Nullable Boolean doNotPerform,
      CodeableConcept intent,
      @Nullable List<String> reasonLinkId,
      @Nullable String id,
      @Nullable Period occurrencePeriod,
      @Nullable List<String> requesterLinkId,
      @Nullable List<Extension> extension,
      @Nullable List<CodeableConcept> performerType,
      @Nullable List<UnsignedInt> securityLabelNumber,
      @Nullable List<String> performerLinkId) {
    this.modifierExtension = modifierExtension;
    this.status = status;
    this.occurrenceTiming = occurrenceTiming;
    this.reasonReference = reasonReference;
    this.linkId = linkId;
    this.performerRole = performerRole;
    this.contextLinkId = contextLinkId;
    this.reasonCode = reasonCode;
    this.note = note;
    this.context = context;
    this.reason = reason;
    this.occurrenceDateTime = occurrenceDateTime;
    this.performer = performer;
    this.subject = subject;
    this.requester = requester;
    this.type = type;
    this.doNotPerform = doNotPerform;
    this.intent = intent;
    this.reasonLinkId = reasonLinkId;
    this.id = id;
    this.occurrencePeriod = occurrencePeriod;
    this.requesterLinkId = requesterLinkId;
    this.extension = extension;
    this.performerType = performerType;
    this.securityLabelNumber = securityLabelNumber;
    this.performerLinkId = performerLinkId;
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
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public CodeableConcept status() {
    return status;
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
   * @return The value of the {@code reasonReference} attribute
   */
  @JsonProperty("reasonReference")
  @Override
  public Optional<List<Reference>> reasonReference() {
    return Optional.ofNullable(reasonReference);
  }

  /**
   * @return The value of the {@code linkId} attribute
   */
  @JsonProperty("linkId")
  @Override
  public Optional<List<String>> linkId() {
    return Optional.ofNullable(linkId);
  }

  /**
   * @return The value of the {@code performerRole} attribute
   */
  @JsonProperty("performerRole")
  @Override
  public Optional<CodeableConcept> performerRole() {
    return Optional.ofNullable(performerRole);
  }

  /**
   * @return The value of the {@code contextLinkId} attribute
   */
  @JsonProperty("contextLinkId")
  @Override
  public Optional<List<String>> contextLinkId() {
    return Optional.ofNullable(contextLinkId);
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
   * @return The value of the {@code note} attribute
   */
  @JsonProperty("note")
  @Override
  public Optional<List<Annotation>> note() {
    return Optional.ofNullable(note);
  }

  /**
   * @return The value of the {@code context} attribute
   */
  @JsonProperty("context")
  @Override
  public Optional<Reference> context() {
    return Optional.ofNullable(context);
  }

  /**
   * @return The value of the {@code reason} attribute
   */
  @JsonProperty("reason")
  @Override
  public Optional<List<String>> reason() {
    return Optional.ofNullable(reason);
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
   * @return The value of the {@code performer} attribute
   */
  @JsonProperty("performer")
  @Override
  public Optional<Reference> performer() {
    return Optional.ofNullable(performer);
  }

  /**
   * @return The value of the {@code subject} attribute
   */
  @JsonProperty("subject")
  @Override
  public Optional<List<Contract_Subject>> subject() {
    return Optional.ofNullable(subject);
  }

  /**
   * @return The value of the {@code requester} attribute
   */
  @JsonProperty("requester")
  @Override
  public Optional<List<Reference>> requester() {
    return Optional.ofNullable(requester);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public CodeableConcept type() {
    return type;
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
   * @return The value of the {@code intent} attribute
   */
  @JsonProperty("intent")
  @Override
  public CodeableConcept intent() {
    return intent;
  }

  /**
   * @return The value of the {@code reasonLinkId} attribute
   */
  @JsonProperty("reasonLinkId")
  @Override
  public Optional<List<String>> reasonLinkId() {
    return Optional.ofNullable(reasonLinkId);
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
   * @return The value of the {@code occurrencePeriod} attribute
   */
  @JsonProperty("occurrencePeriod")
  @Override
  public Optional<Period> occurrencePeriod() {
    return Optional.ofNullable(occurrencePeriod);
  }

  /**
   * @return The value of the {@code requesterLinkId} attribute
   */
  @JsonProperty("requesterLinkId")
  @Override
  public Optional<List<String>> requesterLinkId() {
    return Optional.ofNullable(requesterLinkId);
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
   * @return The value of the {@code performerType} attribute
   */
  @JsonProperty("performerType")
  @Override
  public Optional<List<CodeableConcept>> performerType() {
    return Optional.ofNullable(performerType);
  }

  /**
   * @return The value of the {@code securityLabelNumber} attribute
   */
  @JsonProperty("securityLabelNumber")
  @Override
  public Optional<List<UnsignedInt>> securityLabelNumber() {
    return Optional.ofNullable(securityLabelNumber);
  }

  /**
   * @return The value of the {@code performerLinkId} attribute
   */
  @JsonProperty("performerLinkId")
  @Override
  public Optional<List<String>> performerLinkId() {
    return Optional.ofNullable(performerLinkId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Action#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Action withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableContract_Action(
        newValue,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Action#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Action withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableContract_Action(
        value,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Contract_Action#status() status} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for status
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableContract_Action withStatus(CodeableConcept value) {
    if (this.status == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "status");
    return new ImmutableContract_Action(
        this.modifierExtension,
        newValue,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Action#occurrenceTiming() occurrenceTiming} attribute.
   * @param value The value for occurrenceTiming
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Action withOccurrenceTiming(Timing value) {
    @Nullable Timing newValue = Objects.requireNonNull(value, "occurrenceTiming");
    if (this.occurrenceTiming == newValue) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        newValue,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Action#occurrenceTiming() occurrenceTiming} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrenceTiming
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Action withOccurrenceTiming(Optional<? extends Timing> optional) {
    @Nullable Timing value = optional.orElse(null);
    if (this.occurrenceTiming == value) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        value,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Action#reasonReference() reasonReference} attribute.
   * @param value The value for reasonReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Action withReasonReference(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "reasonReference");
    if (this.reasonReference == newValue) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        newValue,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Action#reasonReference() reasonReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Action withReasonReference(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.reasonReference == value) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        value,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Action#linkId() linkId} attribute.
   * @param value The value for linkId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Action withLinkId(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "linkId");
    if (this.linkId == newValue) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        newValue,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Action#linkId() linkId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for linkId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Action withLinkId(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.linkId == value) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        value,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Action#performerRole() performerRole} attribute.
   * @param value The value for performerRole
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Action withPerformerRole(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "performerRole");
    if (this.performerRole == newValue) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        newValue,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Action#performerRole() performerRole} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performerRole
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Action withPerformerRole(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.performerRole == value) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        value,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Action#contextLinkId() contextLinkId} attribute.
   * @param value The value for contextLinkId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Action withContextLinkId(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "contextLinkId");
    if (this.contextLinkId == newValue) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        newValue,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Action#contextLinkId() contextLinkId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contextLinkId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Action withContextLinkId(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.contextLinkId == value) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        value,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Action#reasonCode() reasonCode} attribute.
   * @param value The value for reasonCode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Action withReasonCode(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "reasonCode");
    if (this.reasonCode == newValue) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        newValue,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Action#reasonCode() reasonCode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonCode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Action withReasonCode(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.reasonCode == value) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        value,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Action#note() note} attribute.
   * @param value The value for note
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Action withNote(List<Annotation> value) {
    @Nullable List<Annotation> newValue = Objects.requireNonNull(value, "note");
    if (this.note == newValue) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        newValue,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Action#note() note} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for note
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Action withNote(Optional<? extends List<Annotation>> optional) {
    @Nullable List<Annotation> value = optional.orElse(null);
    if (this.note == value) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        value,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Action#context() context} attribute.
   * @param value The value for context
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Action withContext(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "context");
    if (this.context == newValue) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        newValue,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Action#context() context} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for context
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Action withContext(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.context == value) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        value,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Action#reason() reason} attribute.
   * @param value The value for reason
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Action withReason(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "reason");
    if (this.reason == newValue) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        newValue,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Action#reason() reason} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reason
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Action withReason(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.reason == value) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        value,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Action#occurrenceDateTime() occurrenceDateTime} attribute.
   * @param value The value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Action withOccurrenceDateTime(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "occurrenceDateTime");
    if (Objects.equals(this.occurrenceDateTime, newValue)) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        newValue,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Action#occurrenceDateTime() occurrenceDateTime} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrenceDateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Action withOccurrenceDateTime(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.occurrenceDateTime, value)) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        value,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Action#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Action withPerformer(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        newValue,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Action#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Action withPerformer(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        value,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Action#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Action withSubject(List<Contract_Subject> value) {
    @Nullable List<Contract_Subject> newValue = Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        newValue,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Action#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Action withSubject(Optional<? extends List<Contract_Subject>> optional) {
    @Nullable List<Contract_Subject> value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        value,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Action#requester() requester} attribute.
   * @param value The value for requester
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Action withRequester(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "requester");
    if (this.requester == newValue) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        newValue,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Action#requester() requester} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requester
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Action withRequester(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.requester == value) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        value,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Contract_Action#type() type} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for type
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableContract_Action withType(CodeableConcept value) {
    if (this.type == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "type");
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        newValue,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Action#doNotPerform() doNotPerform} attribute.
   * @param value The value for doNotPerform
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Action withDoNotPerform(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.doNotPerform, newValue)) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        newValue,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Action#doNotPerform() doNotPerform} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for doNotPerform
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Action withDoNotPerform(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.doNotPerform, value)) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        value,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Contract_Action#intent() intent} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for intent
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableContract_Action withIntent(CodeableConcept value) {
    if (this.intent == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "intent");
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        newValue,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Action#reasonLinkId() reasonLinkId} attribute.
   * @param value The value for reasonLinkId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Action withReasonLinkId(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "reasonLinkId");
    if (this.reasonLinkId == newValue) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        newValue,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Action#reasonLinkId() reasonLinkId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for reasonLinkId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Action withReasonLinkId(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.reasonLinkId == value) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        value,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Action#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Action withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        newValue,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Action#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Action withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        value,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Action#occurrencePeriod() occurrencePeriod} attribute.
   * @param value The value for occurrencePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Action withOccurrencePeriod(Period value) {
    @Nullable Period newValue = Objects.requireNonNull(value, "occurrencePeriod");
    if (this.occurrencePeriod == newValue) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        newValue,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Action#occurrencePeriod() occurrencePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for occurrencePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Action withOccurrencePeriod(Optional<? extends Period> optional) {
    @Nullable Period value = optional.orElse(null);
    if (this.occurrencePeriod == value) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        value,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Action#requesterLinkId() requesterLinkId} attribute.
   * @param value The value for requesterLinkId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Action withRequesterLinkId(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "requesterLinkId");
    if (this.requesterLinkId == newValue) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        newValue,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Action#requesterLinkId() requesterLinkId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for requesterLinkId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Action withRequesterLinkId(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.requesterLinkId == value) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        value,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Action#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Action withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        newValue,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Action#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Action withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        value,
        this.performerType,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Action#performerType() performerType} attribute.
   * @param value The value for performerType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Action withPerformerType(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "performerType");
    if (this.performerType == newValue) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        newValue,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Action#performerType() performerType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performerType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Action withPerformerType(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.performerType == value) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        value,
        this.securityLabelNumber,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Action#securityLabelNumber() securityLabelNumber} attribute.
   * @param value The value for securityLabelNumber
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Action withSecurityLabelNumber(List<UnsignedInt> value) {
    @Nullable List<UnsignedInt> newValue = Objects.requireNonNull(value, "securityLabelNumber");
    if (this.securityLabelNumber == newValue) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        newValue,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Action#securityLabelNumber() securityLabelNumber} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for securityLabelNumber
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Action withSecurityLabelNumber(Optional<? extends List<UnsignedInt>> optional) {
    @Nullable List<UnsignedInt> value = optional.orElse(null);
    if (this.securityLabelNumber == value) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        value,
        this.performerLinkId);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Action#performerLinkId() performerLinkId} attribute.
   * @param value The value for performerLinkId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Action withPerformerLinkId(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "performerLinkId");
    if (this.performerLinkId == newValue) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Action#performerLinkId() performerLinkId} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performerLinkId
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Action withPerformerLinkId(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.performerLinkId == value) return this;
    return new ImmutableContract_Action(
        this.modifierExtension,
        this.status,
        this.occurrenceTiming,
        this.reasonReference,
        this.linkId,
        this.performerRole,
        this.contextLinkId,
        this.reasonCode,
        this.note,
        this.context,
        this.reason,
        this.occurrenceDateTime,
        this.performer,
        this.subject,
        this.requester,
        this.type,
        this.doNotPerform,
        this.intent,
        this.reasonLinkId,
        this.id,
        this.occurrencePeriod,
        this.requesterLinkId,
        this.extension,
        this.performerType,
        this.securityLabelNumber,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableContract_Action} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableContract_Action
        && equalTo((ImmutableContract_Action) another);
  }

  private boolean equalTo(ImmutableContract_Action another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && status.equals(another.status)
        && Objects.equals(occurrenceTiming, another.occurrenceTiming)
        && Objects.equals(reasonReference, another.reasonReference)
        && Objects.equals(linkId, another.linkId)
        && Objects.equals(performerRole, another.performerRole)
        && Objects.equals(contextLinkId, another.contextLinkId)
        && Objects.equals(reasonCode, another.reasonCode)
        && Objects.equals(note, another.note)
        && Objects.equals(context, another.context)
        && Objects.equals(reason, another.reason)
        && Objects.equals(occurrenceDateTime, another.occurrenceDateTime)
        && Objects.equals(performer, another.performer)
        && Objects.equals(subject, another.subject)
        && Objects.equals(requester, another.requester)
        && type.equals(another.type)
        && Objects.equals(doNotPerform, another.doNotPerform)
        && intent.equals(another.intent)
        && Objects.equals(reasonLinkId, another.reasonLinkId)
        && Objects.equals(id, another.id)
        && Objects.equals(occurrencePeriod, another.occurrencePeriod)
        && Objects.equals(requesterLinkId, another.requesterLinkId)
        && Objects.equals(extension, another.extension)
        && Objects.equals(performerType, another.performerType)
        && Objects.equals(securityLabelNumber, another.securityLabelNumber)
        && Objects.equals(performerLinkId, another.performerLinkId);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code status}, {@code occurrenceTiming}, {@code reasonReference}, {@code linkId}, {@code performerRole}, {@code contextLinkId}, {@code reasonCode}, {@code note}, {@code context}, {@code reason}, {@code occurrenceDateTime}, {@code performer}, {@code subject}, {@code requester}, {@code type}, {@code doNotPerform}, {@code intent}, {@code reasonLinkId}, {@code id}, {@code occurrencePeriod}, {@code requesterLinkId}, {@code extension}, {@code performerType}, {@code securityLabelNumber}, {@code performerLinkId}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + status.hashCode();
    h += (h << 5) + Objects.hashCode(occurrenceTiming);
    h += (h << 5) + Objects.hashCode(reasonReference);
    h += (h << 5) + Objects.hashCode(linkId);
    h += (h << 5) + Objects.hashCode(performerRole);
    h += (h << 5) + Objects.hashCode(contextLinkId);
    h += (h << 5) + Objects.hashCode(reasonCode);
    h += (h << 5) + Objects.hashCode(note);
    h += (h << 5) + Objects.hashCode(context);
    h += (h << 5) + Objects.hashCode(reason);
    h += (h << 5) + Objects.hashCode(occurrenceDateTime);
    h += (h << 5) + Objects.hashCode(performer);
    h += (h << 5) + Objects.hashCode(subject);
    h += (h << 5) + Objects.hashCode(requester);
    h += (h << 5) + type.hashCode();
    h += (h << 5) + Objects.hashCode(doNotPerform);
    h += (h << 5) + intent.hashCode();
    h += (h << 5) + Objects.hashCode(reasonLinkId);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(occurrencePeriod);
    h += (h << 5) + Objects.hashCode(requesterLinkId);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(performerType);
    h += (h << 5) + Objects.hashCode(securityLabelNumber);
    h += (h << 5) + Objects.hashCode(performerLinkId);
    return h;
  }

  /**
   * Prints the immutable value {@code Contract_Action} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Contract_Action{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 16) builder.append(", ");
    builder.append("status=").append(status);
    if (occurrenceTiming != null) {
      builder.append(", ");
      builder.append("occurrenceTiming=").append(occurrenceTiming);
    }
    if (reasonReference != null) {
      builder.append(", ");
      builder.append("reasonReference=").append(reasonReference);
    }
    if (linkId != null) {
      builder.append(", ");
      builder.append("linkId=").append(linkId);
    }
    if (performerRole != null) {
      builder.append(", ");
      builder.append("performerRole=").append(performerRole);
    }
    if (contextLinkId != null) {
      builder.append(", ");
      builder.append("contextLinkId=").append(contextLinkId);
    }
    if (reasonCode != null) {
      builder.append(", ");
      builder.append("reasonCode=").append(reasonCode);
    }
    if (note != null) {
      builder.append(", ");
      builder.append("note=").append(note);
    }
    if (context != null) {
      builder.append(", ");
      builder.append("context=").append(context);
    }
    if (reason != null) {
      builder.append(", ");
      builder.append("reason=").append(reason);
    }
    if (occurrenceDateTime != null) {
      builder.append(", ");
      builder.append("occurrenceDateTime=").append(occurrenceDateTime);
    }
    if (performer != null) {
      builder.append(", ");
      builder.append("performer=").append(performer);
    }
    if (subject != null) {
      builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (requester != null) {
      builder.append(", ");
      builder.append("requester=").append(requester);
    }
    builder.append(", ");
    builder.append("type=").append(type);
    if (doNotPerform != null) {
      builder.append(", ");
      builder.append("doNotPerform=").append(doNotPerform);
    }
    builder.append(", ");
    builder.append("intent=").append(intent);
    if (reasonLinkId != null) {
      builder.append(", ");
      builder.append("reasonLinkId=").append(reasonLinkId);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (occurrencePeriod != null) {
      builder.append(", ");
      builder.append("occurrencePeriod=").append(occurrencePeriod);
    }
    if (requesterLinkId != null) {
      builder.append(", ");
      builder.append("requesterLinkId=").append(requesterLinkId);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (performerType != null) {
      builder.append(", ");
      builder.append("performerType=").append(performerType);
    }
    if (securityLabelNumber != null) {
      builder.append(", ");
      builder.append("securityLabelNumber=").append(securityLabelNumber);
    }
    if (performerLinkId != null) {
      builder.append(", ");
      builder.append("performerLinkId=").append(performerLinkId);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Contract_Action", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Contract_Action {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable CodeableConcept status;
    @Nullable Optional<Timing> occurrenceTiming = Optional.empty();
    boolean occurrenceTimingIsSet;
    @Nullable Optional<List<Reference>> reasonReference = Optional.empty();
    boolean reasonReferenceIsSet;
    @Nullable Optional<List<String>> linkId = Optional.empty();
    boolean linkIdIsSet;
    @Nullable Optional<CodeableConcept> performerRole = Optional.empty();
    boolean performerRoleIsSet;
    @Nullable Optional<List<String>> contextLinkId = Optional.empty();
    boolean contextLinkIdIsSet;
    @Nullable Optional<List<CodeableConcept>> reasonCode = Optional.empty();
    boolean reasonCodeIsSet;
    @Nullable Optional<List<Annotation>> note = Optional.empty();
    boolean noteIsSet;
    @Nullable Optional<Reference> context = Optional.empty();
    boolean contextIsSet;
    @Nullable Optional<List<String>> reason = Optional.empty();
    boolean reasonIsSet;
    @Nullable Optional<String> occurrenceDateTime = Optional.empty();
    boolean occurrenceDateTimeIsSet;
    @Nullable Optional<Reference> performer = Optional.empty();
    boolean performerIsSet;
    @Nullable Optional<List<Contract_Subject>> subject = Optional.empty();
    boolean subjectIsSet;
    @Nullable Optional<List<Reference>> requester = Optional.empty();
    boolean requesterIsSet;
    @Nullable CodeableConcept type;
    @Nullable Optional<Boolean> doNotPerform = Optional.empty();
    boolean doNotPerformIsSet;
    @Nullable CodeableConcept intent;
    @Nullable Optional<List<String>> reasonLinkId = Optional.empty();
    boolean reasonLinkIdIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Period> occurrencePeriod = Optional.empty();
    boolean occurrencePeriodIsSet;
    @Nullable Optional<List<String>> requesterLinkId = Optional.empty();
    boolean requesterLinkIdIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<CodeableConcept>> performerType = Optional.empty();
    boolean performerTypeIsSet;
    @Nullable Optional<List<UnsignedInt>> securityLabelNumber = Optional.empty();
    boolean securityLabelNumberIsSet;
    @Nullable Optional<List<String>> performerLinkId = Optional.empty();
    boolean performerLinkIdIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("status")
    public void setStatus(CodeableConcept status) {
      this.status = status;
    }
    @JsonProperty("occurrenceTiming")
    public void setOccurrenceTiming(Optional<Timing> occurrenceTiming) {
      this.occurrenceTiming = occurrenceTiming;
      this.occurrenceTimingIsSet = true;
    }
    @JsonProperty("reasonReference")
    public void setReasonReference(Optional<List<Reference>> reasonReference) {
      this.reasonReference = reasonReference;
      this.reasonReferenceIsSet = true;
    }
    @JsonProperty("linkId")
    public void setLinkId(Optional<List<String>> linkId) {
      this.linkId = linkId;
      this.linkIdIsSet = true;
    }
    @JsonProperty("performerRole")
    public void setPerformerRole(Optional<CodeableConcept> performerRole) {
      this.performerRole = performerRole;
      this.performerRoleIsSet = true;
    }
    @JsonProperty("contextLinkId")
    public void setContextLinkId(Optional<List<String>> contextLinkId) {
      this.contextLinkId = contextLinkId;
      this.contextLinkIdIsSet = true;
    }
    @JsonProperty("reasonCode")
    public void setReasonCode(Optional<List<CodeableConcept>> reasonCode) {
      this.reasonCode = reasonCode;
      this.reasonCodeIsSet = true;
    }
    @JsonProperty("note")
    public void setNote(Optional<List<Annotation>> note) {
      this.note = note;
      this.noteIsSet = true;
    }
    @JsonProperty("context")
    public void setContext(Optional<Reference> context) {
      this.context = context;
      this.contextIsSet = true;
    }
    @JsonProperty("reason")
    public void setReason(Optional<List<String>> reason) {
      this.reason = reason;
      this.reasonIsSet = true;
    }
    @JsonProperty("occurrenceDateTime")
    public void setOccurrenceDateTime(Optional<String> occurrenceDateTime) {
      this.occurrenceDateTime = occurrenceDateTime;
      this.occurrenceDateTimeIsSet = true;
    }
    @JsonProperty("performer")
    public void setPerformer(Optional<Reference> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @JsonProperty("subject")
    public void setSubject(Optional<List<Contract_Subject>> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @JsonProperty("requester")
    public void setRequester(Optional<List<Reference>> requester) {
      this.requester = requester;
      this.requesterIsSet = true;
    }
    @JsonProperty("type")
    public void setType(CodeableConcept type) {
      this.type = type;
    }
    @JsonProperty("doNotPerform")
    public void setDoNotPerform(Optional<Boolean> doNotPerform) {
      this.doNotPerform = doNotPerform;
      this.doNotPerformIsSet = true;
    }
    @JsonProperty("intent")
    public void setIntent(CodeableConcept intent) {
      this.intent = intent;
    }
    @JsonProperty("reasonLinkId")
    public void setReasonLinkId(Optional<List<String>> reasonLinkId) {
      this.reasonLinkId = reasonLinkId;
      this.reasonLinkIdIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("occurrencePeriod")
    public void setOccurrencePeriod(Optional<Period> occurrencePeriod) {
      this.occurrencePeriod = occurrencePeriod;
      this.occurrencePeriodIsSet = true;
    }
    @JsonProperty("requesterLinkId")
    public void setRequesterLinkId(Optional<List<String>> requesterLinkId) {
      this.requesterLinkId = requesterLinkId;
      this.requesterLinkIdIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("performerType")
    public void setPerformerType(Optional<List<CodeableConcept>> performerType) {
      this.performerType = performerType;
      this.performerTypeIsSet = true;
    }
    @JsonProperty("securityLabelNumber")
    public void setSecurityLabelNumber(Optional<List<UnsignedInt>> securityLabelNumber) {
      this.securityLabelNumber = securityLabelNumber;
      this.securityLabelNumberIsSet = true;
    }
    @JsonProperty("performerLinkId")
    public void setPerformerLinkId(Optional<List<String>> performerLinkId) {
      this.performerLinkId = performerLinkId;
      this.performerLinkIdIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept status() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Timing> occurrenceTiming() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> reasonReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> linkId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> performerRole() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> contextLinkId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> reasonCode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Annotation>> note() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> context() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> reason() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> occurrenceDateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> performer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Contract_Subject>> subject() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> requester() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> doNotPerform() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept intent() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> reasonLinkId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Period> occurrencePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> requesterLinkId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> performerType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<UnsignedInt>> securityLabelNumber() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> performerLinkId() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableContract_Action fromJson(Json json) {
    ImmutableContract_Action.Builder builder = ((ImmutableContract_Action.Builder) ImmutableContract_Action.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.status != null) {
      builder.status(json.status);
    }
    if (json.occurrenceTimingIsSet) {
      builder.occurrenceTiming(json.occurrenceTiming);
    }
    if (json.reasonReferenceIsSet) {
      builder.reasonReference(json.reasonReference);
    }
    if (json.linkIdIsSet) {
      builder.linkId(json.linkId);
    }
    if (json.performerRoleIsSet) {
      builder.performerRole(json.performerRole);
    }
    if (json.contextLinkIdIsSet) {
      builder.contextLinkId(json.contextLinkId);
    }
    if (json.reasonCodeIsSet) {
      builder.reasonCode(json.reasonCode);
    }
    if (json.noteIsSet) {
      builder.note(json.note);
    }
    if (json.contextIsSet) {
      builder.context(json.context);
    }
    if (json.reasonIsSet) {
      builder.reason(json.reason);
    }
    if (json.occurrenceDateTimeIsSet) {
      builder.occurrenceDateTime(json.occurrenceDateTime);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.requesterIsSet) {
      builder.requester(json.requester);
    }
    if (json.type != null) {
      builder.type(json.type);
    }
    if (json.doNotPerformIsSet) {
      builder.doNotPerform(json.doNotPerform);
    }
    if (json.intent != null) {
      builder.intent(json.intent);
    }
    if (json.reasonLinkIdIsSet) {
      builder.reasonLinkId(json.reasonLinkId);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.occurrencePeriodIsSet) {
      builder.occurrencePeriod(json.occurrencePeriod);
    }
    if (json.requesterLinkIdIsSet) {
      builder.requesterLinkId(json.requesterLinkId);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.performerTypeIsSet) {
      builder.performerType(json.performerType);
    }
    if (json.securityLabelNumberIsSet) {
      builder.securityLabelNumber(json.securityLabelNumber);
    }
    if (json.performerLinkIdIsSet) {
      builder.performerLinkId(json.performerLinkId);
    }
    return (ImmutableContract_Action) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Contract_Action} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Contract_Action instance
   */
  public static Contract_Action copyOf(Contract_Action instance) {
    if (instance instanceof ImmutableContract_Action) {
      return (ImmutableContract_Action) instance;
    }
    return ((ImmutableContract_Action.Builder) ImmutableContract_Action.builder())
        .modifierExtension(instance.modifierExtension())
        .status(instance.status())
        .occurrenceTiming(instance.occurrenceTiming())
        .reasonReference(instance.reasonReference())
        .linkId(instance.linkId())
        .performerRole(instance.performerRole())
        .contextLinkId(instance.contextLinkId())
        .reasonCode(instance.reasonCode())
        .note(instance.note())
        .context(instance.context())
        .reason(instance.reason())
        .occurrenceDateTime(instance.occurrenceDateTime())
        .performer(instance.performer())
        .subject(instance.subject())
        .requester(instance.requester())
        .type(instance.type())
        .doNotPerform(instance.doNotPerform())
        .intent(instance.intent())
        .reasonLinkId(instance.reasonLinkId())
        .id(instance.id())
        .occurrencePeriod(instance.occurrencePeriod())
        .requesterLinkId(instance.requesterLinkId())
        .extension(instance.extension())
        .performerType(instance.performerType())
        .securityLabelNumber(instance.securityLabelNumber())
        .performerLinkId(instance.performerLinkId())
        .build();
  }

  /**
   * Creates a builder for {@link Contract_Action Contract_Action}.
   * <pre>
   * ImmutableContract_Action.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Contract_Action#modifierExtension() modifierExtension}
   *    .status(com.fhir.types.fhir.CodeableConcept) // required {@link Contract_Action#status() status}
   *    .occurrenceTiming(com.fhir.types.fhir.Timing) // optional {@link Contract_Action#occurrenceTiming() occurrenceTiming}
   *    .reasonReference(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Contract_Action#reasonReference() reasonReference}
   *    .linkId(List&amp;lt;String&amp;gt;) // optional {@link Contract_Action#linkId() linkId}
   *    .performerRole(com.fhir.types.fhir.CodeableConcept) // optional {@link Contract_Action#performerRole() performerRole}
   *    .contextLinkId(List&amp;lt;String&amp;gt;) // optional {@link Contract_Action#contextLinkId() contextLinkId}
   *    .reasonCode(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Contract_Action#reasonCode() reasonCode}
   *    .note(List&amp;lt;com.fhir.types.fhir.Annotation&amp;gt;) // optional {@link Contract_Action#note() note}
   *    .context(com.fhir.types.fhir.Reference) // optional {@link Contract_Action#context() context}
   *    .reason(List&amp;lt;String&amp;gt;) // optional {@link Contract_Action#reason() reason}
   *    .occurrenceDateTime(String) // optional {@link Contract_Action#occurrenceDateTime() occurrenceDateTime}
   *    .performer(com.fhir.types.fhir.Reference) // optional {@link Contract_Action#performer() performer}
   *    .subject(List&amp;lt;com.fhir.types.fhir.Contract_Subject&amp;gt;) // optional {@link Contract_Action#subject() subject}
   *    .requester(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link Contract_Action#requester() requester}
   *    .type(com.fhir.types.fhir.CodeableConcept) // required {@link Contract_Action#type() type}
   *    .doNotPerform(Boolean) // optional {@link Contract_Action#doNotPerform() doNotPerform}
   *    .intent(com.fhir.types.fhir.CodeableConcept) // required {@link Contract_Action#intent() intent}
   *    .reasonLinkId(List&amp;lt;String&amp;gt;) // optional {@link Contract_Action#reasonLinkId() reasonLinkId}
   *    .id(String) // optional {@link Contract_Action#id() id}
   *    .occurrencePeriod(com.fhir.types.fhir.Period) // optional {@link Contract_Action#occurrencePeriod() occurrencePeriod}
   *    .requesterLinkId(List&amp;lt;String&amp;gt;) // optional {@link Contract_Action#requesterLinkId() requesterLinkId}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Contract_Action#extension() extension}
   *    .performerType(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link Contract_Action#performerType() performerType}
   *    .securityLabelNumber(List&amp;lt;com.fhir.types.fhir.UnsignedInt&amp;gt;) // optional {@link Contract_Action#securityLabelNumber() securityLabelNumber}
   *    .performerLinkId(List&amp;lt;String&amp;gt;) // optional {@link Contract_Action#performerLinkId() performerLinkId}
   *    .build();
   * </pre>
   * @return A new Contract_Action builder
   */
  public static StatusBuildStage builder() {
    return new ImmutableContract_Action.Builder();
  }

  /**
   * Builds instances of type {@link Contract_Action Contract_Action}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Contract_Action", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements StatusBuildStage, TypeBuildStage, IntentBuildStage, BuildFinal {
    private static final long INIT_BIT_STATUS = 0x1L;
    private static final long INIT_BIT_TYPE = 0x2L;
    private static final long INIT_BIT_INTENT = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_OCCURRENCE_TIMING = 0x2L;
    private static final long OPT_BIT_REASON_REFERENCE = 0x4L;
    private static final long OPT_BIT_LINK_ID = 0x8L;
    private static final long OPT_BIT_PERFORMER_ROLE = 0x10L;
    private static final long OPT_BIT_CONTEXT_LINK_ID = 0x20L;
    private static final long OPT_BIT_REASON_CODE = 0x40L;
    private static final long OPT_BIT_NOTE = 0x80L;
    private static final long OPT_BIT_CONTEXT = 0x100L;
    private static final long OPT_BIT_REASON = 0x200L;
    private static final long OPT_BIT_OCCURRENCE_DATE_TIME = 0x400L;
    private static final long OPT_BIT_PERFORMER = 0x800L;
    private static final long OPT_BIT_SUBJECT = 0x1000L;
    private static final long OPT_BIT_REQUESTER = 0x2000L;
    private static final long OPT_BIT_DO_NOT_PERFORM = 0x4000L;
    private static final long OPT_BIT_REASON_LINK_ID = 0x8000L;
    private static final long OPT_BIT_ID = 0x10000L;
    private static final long OPT_BIT_OCCURRENCE_PERIOD = 0x20000L;
    private static final long OPT_BIT_REQUESTER_LINK_ID = 0x40000L;
    private static final long OPT_BIT_EXTENSION = 0x80000L;
    private static final long OPT_BIT_PERFORMER_TYPE = 0x100000L;
    private static final long OPT_BIT_SECURITY_LABEL_NUMBER = 0x200000L;
    private static final long OPT_BIT_PERFORMER_LINK_ID = 0x400000L;
    private long initBits = 0x7L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept status;
    private @Nullable Timing occurrenceTiming;
    private @Nullable List<Reference> reasonReference;
    private @Nullable List<String> linkId;
    private @Nullable CodeableConcept performerRole;
    private @Nullable List<String> contextLinkId;
    private @Nullable List<CodeableConcept> reasonCode;
    private @Nullable List<Annotation> note;
    private @Nullable Reference context;
    private @Nullable List<String> reason;
    private @Nullable String occurrenceDateTime;
    private @Nullable Reference performer;
    private @Nullable List<Contract_Subject> subject;
    private @Nullable List<Reference> requester;
    private @Nullable CodeableConcept type;
    private @Nullable Boolean doNotPerform;
    private @Nullable CodeableConcept intent;
    private @Nullable List<String> reasonLinkId;
    private @Nullable String id;
    private @Nullable Period occurrencePeriod;
    private @Nullable List<String> requesterLinkId;
    private @Nullable List<Extension> extension;
    private @Nullable List<CodeableConcept> performerType;
    private @Nullable List<UnsignedInt> securityLabelNumber;
    private @Nullable List<String> performerLinkId;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Contract_Action#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Contract_Action#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link Contract_Action#status() status} attribute.
     * @param status The value for status 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(CodeableConcept status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      initBits &= ~INIT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Action#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
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
     * Initializes the optional value {@link Contract_Action#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
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
     * Initializes the optional value {@link Contract_Action#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link Contract_Action#reasonReference() reasonReference} to reasonReference.
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
     * Initializes the optional value {@link Contract_Action#linkId() linkId} to linkId.
     * @param linkId The value for linkId
     * @return {@code this} builder for chained invocation
     */
    public final Builder linkId(List<String> linkId) {
      checkNotIsSet(linkIdIsSet(), "linkId");
      this.linkId = Objects.requireNonNull(linkId, "linkId");
      optBits |= OPT_BIT_LINK_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Action#linkId() linkId} to linkId.
     * @param linkId The value for linkId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("linkId")
    public final Builder linkId(Optional<? extends List<String>> linkId) {
      checkNotIsSet(linkIdIsSet(), "linkId");
      this.linkId = linkId.orElse(null);
      optBits |= OPT_BIT_LINK_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Action#performerRole() performerRole} to performerRole.
     * @param performerRole The value for performerRole
     * @return {@code this} builder for chained invocation
     */
    public final Builder performerRole(CodeableConcept performerRole) {
      checkNotIsSet(performerRoleIsSet(), "performerRole");
      this.performerRole = Objects.requireNonNull(performerRole, "performerRole");
      optBits |= OPT_BIT_PERFORMER_ROLE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Action#performerRole() performerRole} to performerRole.
     * @param performerRole The value for performerRole
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("performerRole")
    public final Builder performerRole(Optional<? extends CodeableConcept> performerRole) {
      checkNotIsSet(performerRoleIsSet(), "performerRole");
      this.performerRole = performerRole.orElse(null);
      optBits |= OPT_BIT_PERFORMER_ROLE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Action#contextLinkId() contextLinkId} to contextLinkId.
     * @param contextLinkId The value for contextLinkId
     * @return {@code this} builder for chained invocation
     */
    public final Builder contextLinkId(List<String> contextLinkId) {
      checkNotIsSet(contextLinkIdIsSet(), "contextLinkId");
      this.contextLinkId = Objects.requireNonNull(contextLinkId, "contextLinkId");
      optBits |= OPT_BIT_CONTEXT_LINK_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Action#contextLinkId() contextLinkId} to contextLinkId.
     * @param contextLinkId The value for contextLinkId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contextLinkId")
    public final Builder contextLinkId(Optional<? extends List<String>> contextLinkId) {
      checkNotIsSet(contextLinkIdIsSet(), "contextLinkId");
      this.contextLinkId = contextLinkId.orElse(null);
      optBits |= OPT_BIT_CONTEXT_LINK_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Action#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link Contract_Action#reasonCode() reasonCode} to reasonCode.
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
     * Initializes the optional value {@link Contract_Action#note() note} to note.
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
     * Initializes the optional value {@link Contract_Action#note() note} to note.
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
     * Initializes the optional value {@link Contract_Action#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for chained invocation
     */
    public final Builder context(Reference context) {
      checkNotIsSet(contextIsSet(), "context");
      this.context = Objects.requireNonNull(context, "context");
      optBits |= OPT_BIT_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Action#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("context")
    public final Builder context(Optional<? extends Reference> context) {
      checkNotIsSet(contextIsSet(), "context");
      this.context = context.orElse(null);
      optBits |= OPT_BIT_CONTEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Action#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for chained invocation
     */
    public final Builder reason(List<String> reason) {
      checkNotIsSet(reasonIsSet(), "reason");
      this.reason = Objects.requireNonNull(reason, "reason");
      optBits |= OPT_BIT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Action#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reason")
    public final Builder reason(Optional<? extends List<String>> reason) {
      checkNotIsSet(reasonIsSet(), "reason");
      this.reason = reason.orElse(null);
      optBits |= OPT_BIT_REASON;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Action#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
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
     * Initializes the optional value {@link Contract_Action#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
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
     * Initializes the optional value {@link Contract_Action#performer() performer} to performer.
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
     * Initializes the optional value {@link Contract_Action#performer() performer} to performer.
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
     * Initializes the optional value {@link Contract_Action#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    public final Builder subject(List<Contract_Subject> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = Objects.requireNonNull(subject, "subject");
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Action#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("subject")
    public final Builder subject(Optional<? extends List<Contract_Subject>> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = subject.orElse(null);
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Action#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for chained invocation
     */
    public final Builder requester(List<Reference> requester) {
      checkNotIsSet(requesterIsSet(), "requester");
      this.requester = Objects.requireNonNull(requester, "requester");
      optBits |= OPT_BIT_REQUESTER;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Action#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("requester")
    public final Builder requester(Optional<? extends List<Reference>> requester) {
      checkNotIsSet(requesterIsSet(), "requester");
      this.requester = requester.orElse(null);
      optBits |= OPT_BIT_REQUESTER;
      return this;
    }

    /**
     * Initializes the value for the {@link Contract_Action#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      initBits &= ~INIT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Action#doNotPerform() doNotPerform} to doNotPerform.
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
     * Initializes the optional value {@link Contract_Action#doNotPerform() doNotPerform} to doNotPerform.
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
     * Initializes the value for the {@link Contract_Action#intent() intent} attribute.
     * @param intent The value for intent 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("intent")
    public final Builder intent(CodeableConcept intent) {
      checkNotIsSet(intentIsSet(), "intent");
      this.intent = Objects.requireNonNull(intent, "intent");
      initBits &= ~INIT_BIT_INTENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Action#reasonLinkId() reasonLinkId} to reasonLinkId.
     * @param reasonLinkId The value for reasonLinkId
     * @return {@code this} builder for chained invocation
     */
    public final Builder reasonLinkId(List<String> reasonLinkId) {
      checkNotIsSet(reasonLinkIdIsSet(), "reasonLinkId");
      this.reasonLinkId = Objects.requireNonNull(reasonLinkId, "reasonLinkId");
      optBits |= OPT_BIT_REASON_LINK_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Action#reasonLinkId() reasonLinkId} to reasonLinkId.
     * @param reasonLinkId The value for reasonLinkId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("reasonLinkId")
    public final Builder reasonLinkId(Optional<? extends List<String>> reasonLinkId) {
      checkNotIsSet(reasonLinkIdIsSet(), "reasonLinkId");
      this.reasonLinkId = reasonLinkId.orElse(null);
      optBits |= OPT_BIT_REASON_LINK_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Action#id() id} to id.
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
     * Initializes the optional value {@link Contract_Action#id() id} to id.
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
     * Initializes the optional value {@link Contract_Action#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
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
     * Initializes the optional value {@link Contract_Action#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
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
     * Initializes the optional value {@link Contract_Action#requesterLinkId() requesterLinkId} to requesterLinkId.
     * @param requesterLinkId The value for requesterLinkId
     * @return {@code this} builder for chained invocation
     */
    public final Builder requesterLinkId(List<String> requesterLinkId) {
      checkNotIsSet(requesterLinkIdIsSet(), "requesterLinkId");
      this.requesterLinkId = Objects.requireNonNull(requesterLinkId, "requesterLinkId");
      optBits |= OPT_BIT_REQUESTER_LINK_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Action#requesterLinkId() requesterLinkId} to requesterLinkId.
     * @param requesterLinkId The value for requesterLinkId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("requesterLinkId")
    public final Builder requesterLinkId(Optional<? extends List<String>> requesterLinkId) {
      checkNotIsSet(requesterLinkIdIsSet(), "requesterLinkId");
      this.requesterLinkId = requesterLinkId.orElse(null);
      optBits |= OPT_BIT_REQUESTER_LINK_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Action#extension() extension} to extension.
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
     * Initializes the optional value {@link Contract_Action#extension() extension} to extension.
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
     * Initializes the optional value {@link Contract_Action#performerType() performerType} to performerType.
     * @param performerType The value for performerType
     * @return {@code this} builder for chained invocation
     */
    public final Builder performerType(List<CodeableConcept> performerType) {
      checkNotIsSet(performerTypeIsSet(), "performerType");
      this.performerType = Objects.requireNonNull(performerType, "performerType");
      optBits |= OPT_BIT_PERFORMER_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Action#performerType() performerType} to performerType.
     * @param performerType The value for performerType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("performerType")
    public final Builder performerType(Optional<? extends List<CodeableConcept>> performerType) {
      checkNotIsSet(performerTypeIsSet(), "performerType");
      this.performerType = performerType.orElse(null);
      optBits |= OPT_BIT_PERFORMER_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Action#securityLabelNumber() securityLabelNumber} to securityLabelNumber.
     * @param securityLabelNumber The value for securityLabelNumber
     * @return {@code this} builder for chained invocation
     */
    public final Builder securityLabelNumber(List<UnsignedInt> securityLabelNumber) {
      checkNotIsSet(securityLabelNumberIsSet(), "securityLabelNumber");
      this.securityLabelNumber = Objects.requireNonNull(securityLabelNumber, "securityLabelNumber");
      optBits |= OPT_BIT_SECURITY_LABEL_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Action#securityLabelNumber() securityLabelNumber} to securityLabelNumber.
     * @param securityLabelNumber The value for securityLabelNumber
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("securityLabelNumber")
    public final Builder securityLabelNumber(Optional<? extends List<UnsignedInt>> securityLabelNumber) {
      checkNotIsSet(securityLabelNumberIsSet(), "securityLabelNumber");
      this.securityLabelNumber = securityLabelNumber.orElse(null);
      optBits |= OPT_BIT_SECURITY_LABEL_NUMBER;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Action#performerLinkId() performerLinkId} to performerLinkId.
     * @param performerLinkId The value for performerLinkId
     * @return {@code this} builder for chained invocation
     */
    public final Builder performerLinkId(List<String> performerLinkId) {
      checkNotIsSet(performerLinkIdIsSet(), "performerLinkId");
      this.performerLinkId = Objects.requireNonNull(performerLinkId, "performerLinkId");
      optBits |= OPT_BIT_PERFORMER_LINK_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Action#performerLinkId() performerLinkId} to performerLinkId.
     * @param performerLinkId The value for performerLinkId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("performerLinkId")
    public final Builder performerLinkId(Optional<? extends List<String>> performerLinkId) {
      checkNotIsSet(performerLinkIdIsSet(), "performerLinkId");
      this.performerLinkId = performerLinkId.orElse(null);
      optBits |= OPT_BIT_PERFORMER_LINK_ID;
      return this;
    }

    /**
     * Builds a new {@link Contract_Action Contract_Action}.
     * @return An immutable instance of Contract_Action
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Contract_Action build() {
      checkRequiredAttributes();
      return new ImmutableContract_Action(
          modifierExtension,
          status,
          occurrenceTiming,
          reasonReference,
          linkId,
          performerRole,
          contextLinkId,
          reasonCode,
          note,
          context,
          reason,
          occurrenceDateTime,
          performer,
          subject,
          requester,
          type,
          doNotPerform,
          intent,
          reasonLinkId,
          id,
          occurrencePeriod,
          requesterLinkId,
          extension,
          performerType,
          securityLabelNumber,
          performerLinkId);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean occurrenceTimingIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_TIMING) != 0;
    }

    private boolean reasonReferenceIsSet() {
      return (optBits & OPT_BIT_REASON_REFERENCE) != 0;
    }

    private boolean linkIdIsSet() {
      return (optBits & OPT_BIT_LINK_ID) != 0;
    }

    private boolean performerRoleIsSet() {
      return (optBits & OPT_BIT_PERFORMER_ROLE) != 0;
    }

    private boolean contextLinkIdIsSet() {
      return (optBits & OPT_BIT_CONTEXT_LINK_ID) != 0;
    }

    private boolean reasonCodeIsSet() {
      return (optBits & OPT_BIT_REASON_CODE) != 0;
    }

    private boolean noteIsSet() {
      return (optBits & OPT_BIT_NOTE) != 0;
    }

    private boolean contextIsSet() {
      return (optBits & OPT_BIT_CONTEXT) != 0;
    }

    private boolean reasonIsSet() {
      return (optBits & OPT_BIT_REASON) != 0;
    }

    private boolean occurrenceDateTimeIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_DATE_TIME) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean requesterIsSet() {
      return (optBits & OPT_BIT_REQUESTER) != 0;
    }

    private boolean doNotPerformIsSet() {
      return (optBits & OPT_BIT_DO_NOT_PERFORM) != 0;
    }

    private boolean reasonLinkIdIsSet() {
      return (optBits & OPT_BIT_REASON_LINK_ID) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean occurrencePeriodIsSet() {
      return (optBits & OPT_BIT_OCCURRENCE_PERIOD) != 0;
    }

    private boolean requesterLinkIdIsSet() {
      return (optBits & OPT_BIT_REQUESTER_LINK_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean performerTypeIsSet() {
      return (optBits & OPT_BIT_PERFORMER_TYPE) != 0;
    }

    private boolean securityLabelNumberIsSet() {
      return (optBits & OPT_BIT_SECURITY_LABEL_NUMBER) != 0;
    }

    private boolean performerLinkIdIsSet() {
      return (optBits & OPT_BIT_PERFORMER_LINK_ID) != 0;
    }

    private boolean statusIsSet() {
      return (initBits & INIT_BIT_STATUS) == 0;
    }

    private boolean typeIsSet() {
      return (initBits & INIT_BIT_TYPE) == 0;
    }

    private boolean intentIsSet() {
      return (initBits & INIT_BIT_INTENT) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Contract_Action is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!statusIsSet()) attributes.add("status");
      if (!typeIsSet()) attributes.add("type");
      if (!intentIsSet()) attributes.add("intent");
      return "Cannot build Contract_Action, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Contract_Action", generator = "Immutables")
  public interface StatusBuildStage {
    /**
     * Initializes the value for the {@link Contract_Action#status() status} attribute.
     * @param status The value for status 
     * @return {@code this} builder for use in a chained invocation
     */
    TypeBuildStage status(CodeableConcept status);
  }

  @Generated(from = "Contract_Action", generator = "Immutables")
  public interface TypeBuildStage {
    /**
     * Initializes the value for the {@link Contract_Action#type() type} attribute.
     * @param type The value for type 
     * @return {@code this} builder for use in a chained invocation
     */
    IntentBuildStage type(CodeableConcept type);
  }

  @Generated(from = "Contract_Action", generator = "Immutables")
  public interface IntentBuildStage {
    /**
     * Initializes the value for the {@link Contract_Action#intent() intent} attribute.
     * @param intent The value for intent 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal intent(CodeableConcept intent);
  }

  @Generated(from = "Contract_Action", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Contract_Action#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Contract_Action#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Contract_Action#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
     * @param occurrenceTiming The value for occurrenceTiming
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrenceTiming(Timing occurrenceTiming);

    /**
     * Initializes the optional value {@link Contract_Action#occurrenceTiming() occurrenceTiming} to occurrenceTiming.
     * @param occurrenceTiming The value for occurrenceTiming
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrenceTiming(Optional<? extends Timing> occurrenceTiming);

    /**
     * Initializes the optional value {@link Contract_Action#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonReference(List<Reference> reasonReference);

    /**
     * Initializes the optional value {@link Contract_Action#reasonReference() reasonReference} to reasonReference.
     * @param reasonReference The value for reasonReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonReference(Optional<? extends List<Reference>> reasonReference);

    /**
     * Initializes the optional value {@link Contract_Action#linkId() linkId} to linkId.
     * @param linkId The value for linkId
     * @return {@code this} builder for chained invocation
     */
    BuildFinal linkId(List<String> linkId);

    /**
     * Initializes the optional value {@link Contract_Action#linkId() linkId} to linkId.
     * @param linkId The value for linkId
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal linkId(Optional<? extends List<String>> linkId);

    /**
     * Initializes the optional value {@link Contract_Action#performerRole() performerRole} to performerRole.
     * @param performerRole The value for performerRole
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performerRole(CodeableConcept performerRole);

    /**
     * Initializes the optional value {@link Contract_Action#performerRole() performerRole} to performerRole.
     * @param performerRole The value for performerRole
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performerRole(Optional<? extends CodeableConcept> performerRole);

    /**
     * Initializes the optional value {@link Contract_Action#contextLinkId() contextLinkId} to contextLinkId.
     * @param contextLinkId The value for contextLinkId
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contextLinkId(List<String> contextLinkId);

    /**
     * Initializes the optional value {@link Contract_Action#contextLinkId() contextLinkId} to contextLinkId.
     * @param contextLinkId The value for contextLinkId
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contextLinkId(Optional<? extends List<String>> contextLinkId);

    /**
     * Initializes the optional value {@link Contract_Action#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonCode(List<CodeableConcept> reasonCode);

    /**
     * Initializes the optional value {@link Contract_Action#reasonCode() reasonCode} to reasonCode.
     * @param reasonCode The value for reasonCode
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonCode(Optional<? extends List<CodeableConcept>> reasonCode);

    /**
     * Initializes the optional value {@link Contract_Action#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for chained invocation
     */
    BuildFinal note(List<Annotation> note);

    /**
     * Initializes the optional value {@link Contract_Action#note() note} to note.
     * @param note The value for note
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal note(Optional<? extends List<Annotation>> note);

    /**
     * Initializes the optional value {@link Contract_Action#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for chained invocation
     */
    BuildFinal context(Reference context);

    /**
     * Initializes the optional value {@link Contract_Action#context() context} to context.
     * @param context The value for context
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal context(Optional<? extends Reference> context);

    /**
     * Initializes the optional value {@link Contract_Action#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reason(List<String> reason);

    /**
     * Initializes the optional value {@link Contract_Action#reason() reason} to reason.
     * @param reason The value for reason
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reason(Optional<? extends List<String>> reason);

    /**
     * Initializes the optional value {@link Contract_Action#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrenceDateTime(String occurrenceDateTime);

    /**
     * Initializes the optional value {@link Contract_Action#occurrenceDateTime() occurrenceDateTime} to occurrenceDateTime.
     * @param occurrenceDateTime The value for occurrenceDateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrenceDateTime(Optional<String> occurrenceDateTime);

    /**
     * Initializes the optional value {@link Contract_Action#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performer(Reference performer);

    /**
     * Initializes the optional value {@link Contract_Action#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performer(Optional<? extends Reference> performer);

    /**
     * Initializes the optional value {@link Contract_Action#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(List<Contract_Subject> subject);

    /**
     * Initializes the optional value {@link Contract_Action#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(Optional<? extends List<Contract_Subject>> subject);

    /**
     * Initializes the optional value {@link Contract_Action#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for chained invocation
     */
    BuildFinal requester(List<Reference> requester);

    /**
     * Initializes the optional value {@link Contract_Action#requester() requester} to requester.
     * @param requester The value for requester
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal requester(Optional<? extends List<Reference>> requester);

    /**
     * Initializes the optional value {@link Contract_Action#doNotPerform() doNotPerform} to doNotPerform.
     * @param doNotPerform The value for doNotPerform
     * @return {@code this} builder for chained invocation
     */
    BuildFinal doNotPerform(boolean doNotPerform);

    /**
     * Initializes the optional value {@link Contract_Action#doNotPerform() doNotPerform} to doNotPerform.
     * @param doNotPerform The value for doNotPerform
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal doNotPerform(Optional<Boolean> doNotPerform);

    /**
     * Initializes the optional value {@link Contract_Action#reasonLinkId() reasonLinkId} to reasonLinkId.
     * @param reasonLinkId The value for reasonLinkId
     * @return {@code this} builder for chained invocation
     */
    BuildFinal reasonLinkId(List<String> reasonLinkId);

    /**
     * Initializes the optional value {@link Contract_Action#reasonLinkId() reasonLinkId} to reasonLinkId.
     * @param reasonLinkId The value for reasonLinkId
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal reasonLinkId(Optional<? extends List<String>> reasonLinkId);

    /**
     * Initializes the optional value {@link Contract_Action#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link Contract_Action#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link Contract_Action#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal occurrencePeriod(Period occurrencePeriod);

    /**
     * Initializes the optional value {@link Contract_Action#occurrencePeriod() occurrencePeriod} to occurrencePeriod.
     * @param occurrencePeriod The value for occurrencePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal occurrencePeriod(Optional<? extends Period> occurrencePeriod);

    /**
     * Initializes the optional value {@link Contract_Action#requesterLinkId() requesterLinkId} to requesterLinkId.
     * @param requesterLinkId The value for requesterLinkId
     * @return {@code this} builder for chained invocation
     */
    BuildFinal requesterLinkId(List<String> requesterLinkId);

    /**
     * Initializes the optional value {@link Contract_Action#requesterLinkId() requesterLinkId} to requesterLinkId.
     * @param requesterLinkId The value for requesterLinkId
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal requesterLinkId(Optional<? extends List<String>> requesterLinkId);

    /**
     * Initializes the optional value {@link Contract_Action#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Contract_Action#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link Contract_Action#performerType() performerType} to performerType.
     * @param performerType The value for performerType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performerType(List<CodeableConcept> performerType);

    /**
     * Initializes the optional value {@link Contract_Action#performerType() performerType} to performerType.
     * @param performerType The value for performerType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performerType(Optional<? extends List<CodeableConcept>> performerType);

    /**
     * Initializes the optional value {@link Contract_Action#securityLabelNumber() securityLabelNumber} to securityLabelNumber.
     * @param securityLabelNumber The value for securityLabelNumber
     * @return {@code this} builder for chained invocation
     */
    BuildFinal securityLabelNumber(List<UnsignedInt> securityLabelNumber);

    /**
     * Initializes the optional value {@link Contract_Action#securityLabelNumber() securityLabelNumber} to securityLabelNumber.
     * @param securityLabelNumber The value for securityLabelNumber
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal securityLabelNumber(Optional<? extends List<UnsignedInt>> securityLabelNumber);

    /**
     * Initializes the optional value {@link Contract_Action#performerLinkId() performerLinkId} to performerLinkId.
     * @param performerLinkId The value for performerLinkId
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performerLinkId(List<String> performerLinkId);

    /**
     * Initializes the optional value {@link Contract_Action#performerLinkId() performerLinkId} to performerLinkId.
     * @param performerLinkId The value for performerLinkId
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performerLinkId(Optional<? extends List<String>> performerLinkId);

    /**
     * Builds a new {@link Contract_Action Contract_Action}.
     * @return An immutable instance of Contract_Action
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Contract_Action build();
  }
}

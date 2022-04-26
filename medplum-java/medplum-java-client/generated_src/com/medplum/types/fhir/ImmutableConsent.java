package com.medplum.types.fhir;

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
 * Immutable implementation of {@link Consent}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableConsent.builder()}.
 */
@Generated(from = "Consent", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableConsent implements Consent {
  private final @Nullable ConsentStatus status;
  private final List<CodeableConcept> category;
  private final String resourceType;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable Reference sourceReference;
  private final @Nullable Code language;
  private final @Nullable List<Consent_Policy> policy;
  private final @Nullable Meta meta;
  private final CodeableConcept scope;
  private final @Nullable DateTime dateTime;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Reference patient;
  private final @Nullable Uri implicitRules;
  private final @Nullable CodeableConcept policyRule;
  private final @Nullable Attachment sourceAttachment;
  private final @Nullable List<Consent_Verification> verification;
  private final @Nullable List<Reference> performer;
  private final @Nullable Id id;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable List<Reference> organization;
  private final @Nullable Narrative text;
  private final @Nullable Consent_Provision provision;
  private final @Nullable List<Extension> extension;

  private ImmutableConsent(
      @Nullable ConsentStatus status,
      List<CodeableConcept> category,
      String resourceType,
      @Nullable List<Identifier> identifier,
      @Nullable Reference sourceReference,
      @Nullable Code language,
      @Nullable List<Consent_Policy> policy,
      @Nullable Meta meta,
      CodeableConcept scope,
      @Nullable DateTime dateTime,
      @Nullable List<Extension> modifierExtension,
      @Nullable Reference patient,
      @Nullable Uri implicitRules,
      @Nullable CodeableConcept policyRule,
      @Nullable Attachment sourceAttachment,
      @Nullable List<Consent_Verification> verification,
      @Nullable List<Reference> performer,
      @Nullable Id id,
      @Nullable List<ResourceList> contained,
      @Nullable List<Reference> organization,
      @Nullable Narrative text,
      @Nullable Consent_Provision provision,
      @Nullable List<Extension> extension) {
    this.status = status;
    this.category = category;
    this.resourceType = resourceType;
    this.identifier = identifier;
    this.sourceReference = sourceReference;
    this.language = language;
    this.policy = policy;
    this.meta = meta;
    this.scope = scope;
    this.dateTime = dateTime;
    this.modifierExtension = modifierExtension;
    this.patient = patient;
    this.implicitRules = implicitRules;
    this.policyRule = policyRule;
    this.sourceAttachment = sourceAttachment;
    this.verification = verification;
    this.performer = performer;
    this.id = id;
    this.contained = contained;
    this.organization = organization;
    this.text = text;
    this.provision = provision;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @JsonProperty("status")
  @Override
  public Optional<ConsentStatus> status() {
    return Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @JsonProperty("category")
  @Override
  public List<CodeableConcept> category() {
    return category;
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
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code sourceReference} attribute
   */
  @JsonProperty("sourceReference")
  @Override
  public Optional<Reference> sourceReference() {
    return Optional.ofNullable(sourceReference);
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
   * @return The value of the {@code policy} attribute
   */
  @JsonProperty("policy")
  @Override
  public Optional<List<Consent_Policy>> policy() {
    return Optional.ofNullable(policy);
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
   * @return The value of the {@code scope} attribute
   */
  @JsonProperty("scope")
  @Override
  public CodeableConcept scope() {
    return scope;
  }

  /**
   * @return The value of the {@code dateTime} attribute
   */
  @JsonProperty("dateTime")
  @Override
  public Optional<DateTime> dateTime() {
    return Optional.ofNullable(dateTime);
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
   * @return The value of the {@code patient} attribute
   */
  @JsonProperty("patient")
  @Override
  public Optional<Reference> patient() {
    return Optional.ofNullable(patient);
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
   * @return The value of the {@code policyRule} attribute
   */
  @JsonProperty("policyRule")
  @Override
  public Optional<CodeableConcept> policyRule() {
    return Optional.ofNullable(policyRule);
  }

  /**
   * @return The value of the {@code sourceAttachment} attribute
   */
  @JsonProperty("sourceAttachment")
  @Override
  public Optional<Attachment> sourceAttachment() {
    return Optional.ofNullable(sourceAttachment);
  }

  /**
   * @return The value of the {@code verification} attribute
   */
  @JsonProperty("verification")
  @Override
  public Optional<List<Consent_Verification>> verification() {
    return Optional.ofNullable(verification);
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
   * @return The value of the {@code organization} attribute
   */
  @JsonProperty("organization")
  @Override
  public Optional<List<Reference>> organization() {
    return Optional.ofNullable(organization);
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
   * @return The value of the {@code provision} attribute
   */
  @JsonProperty("provision")
  @Override
  public Optional<Consent_Provision> provision() {
    return Optional.ofNullable(provision);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withStatus(ConsentStatus value) {
    @Nullable ConsentStatus newValue = Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableConsent(
        newValue,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withStatus(Optional<? extends ConsentStatus> optional) {
    @Nullable ConsentStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableConsent(
        value,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Consent#category() category}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withCategory(CodeableConcept... elements) {
    List<CodeableConcept> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableConsent(
        this.status,
        newValue,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Consent#category() category}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of category elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withCategory(Iterable<? extends CodeableConcept> elements) {
    if (this.category == elements) return this;
    List<CodeableConcept> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableConsent(
        this.status,
        newValue,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Consent#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableConsent withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        newValue,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        newValue,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        value,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#sourceReference() sourceReference} attribute.
   * @param value The value for sourceReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withSourceReference(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "sourceReference");
    if (this.sourceReference == newValue) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        newValue,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#sourceReference() sourceReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sourceReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withSourceReference(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.sourceReference == value) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        value,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        newValue,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        value,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#policy() policy} attribute.
   * @param value The value for policy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withPolicy(List<Consent_Policy> value) {
    @Nullable List<Consent_Policy> newValue = Objects.requireNonNull(value, "policy");
    if (this.policy == newValue) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        newValue,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#policy() policy} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for policy
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withPolicy(Optional<? extends List<Consent_Policy>> optional) {
    @Nullable List<Consent_Policy> value = optional.orElse(null);
    if (this.policy == value) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        value,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        newValue,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        value,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Consent#scope() scope} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for scope
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableConsent withScope(CodeableConcept value) {
    if (this.scope == value) return this;
    CodeableConcept newValue = Objects.requireNonNull(value, "scope");
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        newValue,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#dateTime() dateTime} attribute.
   * @param value The value for dateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withDateTime(DateTime value) {
    @Nullable DateTime newValue = Objects.requireNonNull(value, "dateTime");
    if (this.dateTime == newValue) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        newValue,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#dateTime() dateTime} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dateTime
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withDateTime(Optional<? extends DateTime> optional) {
    @Nullable DateTime value = optional.orElse(null);
    if (this.dateTime == value) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        value,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        newValue,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        value,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#patient() patient} attribute.
   * @param value The value for patient
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withPatient(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "patient");
    if (this.patient == newValue) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        newValue,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#patient() patient} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for patient
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withPatient(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.patient == value) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        value,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        newValue,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        value,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#policyRule() policyRule} attribute.
   * @param value The value for policyRule
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withPolicyRule(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "policyRule");
    if (this.policyRule == newValue) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        newValue,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#policyRule() policyRule} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for policyRule
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withPolicyRule(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.policyRule == value) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        value,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#sourceAttachment() sourceAttachment} attribute.
   * @param value The value for sourceAttachment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withSourceAttachment(Attachment value) {
    @Nullable Attachment newValue = Objects.requireNonNull(value, "sourceAttachment");
    if (this.sourceAttachment == newValue) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        newValue,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#sourceAttachment() sourceAttachment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sourceAttachment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withSourceAttachment(Optional<? extends Attachment> optional) {
    @Nullable Attachment value = optional.orElse(null);
    if (this.sourceAttachment == value) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        value,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#verification() verification} attribute.
   * @param value The value for verification
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withVerification(List<Consent_Verification> value) {
    @Nullable List<Consent_Verification> newValue = Objects.requireNonNull(value, "verification");
    if (this.verification == newValue) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        newValue,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#verification() verification} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for verification
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withVerification(Optional<? extends List<Consent_Verification>> optional) {
    @Nullable List<Consent_Verification> value = optional.orElse(null);
    if (this.verification == value) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        value,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withPerformer(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        newValue,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withPerformer(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        value,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        newValue,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        value,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        newValue,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        value,
        this.organization,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#organization() organization} attribute.
   * @param value The value for organization
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withOrganization(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "organization");
    if (this.organization == newValue) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        newValue,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#organization() organization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for organization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withOrganization(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.organization == value) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        value,
        this.text,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        newValue,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        value,
        this.provision,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#provision() provision} attribute.
   * @param value The value for provision
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withProvision(Consent_Provision value) {
    @Nullable Consent_Provision newValue = Objects.requireNonNull(value, "provision");
    if (this.provision == newValue) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#provision() provision} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for provision
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withProvision(Optional<? extends Consent_Provision> optional) {
    @Nullable Consent_Provision value = optional.orElse(null);
    if (this.provision == value) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableConsent(
        this.status,
        this.category,
        this.resourceType,
        this.identifier,
        this.sourceReference,
        this.language,
        this.policy,
        this.meta,
        this.scope,
        this.dateTime,
        this.modifierExtension,
        this.patient,
        this.implicitRules,
        this.policyRule,
        this.sourceAttachment,
        this.verification,
        this.performer,
        this.id,
        this.contained,
        this.organization,
        this.text,
        this.provision,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableConsent} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableConsent
        && equalTo((ImmutableConsent) another);
  }

  private boolean equalTo(ImmutableConsent another) {
    return Objects.equals(status, another.status)
        && category.equals(another.category)
        && resourceType.equals(another.resourceType)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(sourceReference, another.sourceReference)
        && Objects.equals(language, another.language)
        && Objects.equals(policy, another.policy)
        && Objects.equals(meta, another.meta)
        && scope.equals(another.scope)
        && Objects.equals(dateTime, another.dateTime)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(patient, another.patient)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(policyRule, another.policyRule)
        && Objects.equals(sourceAttachment, another.sourceAttachment)
        && Objects.equals(verification, another.verification)
        && Objects.equals(performer, another.performer)
        && Objects.equals(id, another.id)
        && Objects.equals(contained, another.contained)
        && Objects.equals(organization, another.organization)
        && Objects.equals(text, another.text)
        && Objects.equals(provision, another.provision)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code status}, {@code category}, {@code resourceType}, {@code identifier}, {@code sourceReference}, {@code language}, {@code policy}, {@code meta}, {@code scope}, {@code dateTime}, {@code modifierExtension}, {@code patient}, {@code implicitRules}, {@code policyRule}, {@code sourceAttachment}, {@code verification}, {@code performer}, {@code id}, {@code contained}, {@code organization}, {@code text}, {@code provision}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(status);
    h += (h << 5) + category.hashCode();
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(sourceReference);
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(policy);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + scope.hashCode();
    h += (h << 5) + Objects.hashCode(dateTime);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(patient);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(policyRule);
    h += (h << 5) + Objects.hashCode(sourceAttachment);
    h += (h << 5) + Objects.hashCode(verification);
    h += (h << 5) + Objects.hashCode(performer);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(organization);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(provision);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code Consent} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Consent{");
    if (status != null) {
      builder.append("status=").append(status);
    }
    if (builder.length() > 8) builder.append(", ");
    builder.append("category=").append(category);
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (sourceReference != null) {
      builder.append(", ");
      builder.append("sourceReference=").append(sourceReference);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (policy != null) {
      builder.append(", ");
      builder.append("policy=").append(policy);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    builder.append(", ");
    builder.append("scope=").append(scope);
    if (dateTime != null) {
      builder.append(", ");
      builder.append("dateTime=").append(dateTime);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (patient != null) {
      builder.append(", ");
      builder.append("patient=").append(patient);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (policyRule != null) {
      builder.append(", ");
      builder.append("policyRule=").append(policyRule);
    }
    if (sourceAttachment != null) {
      builder.append(", ");
      builder.append("sourceAttachment=").append(sourceAttachment);
    }
    if (verification != null) {
      builder.append(", ");
      builder.append("verification=").append(verification);
    }
    if (performer != null) {
      builder.append(", ");
      builder.append("performer=").append(performer);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (organization != null) {
      builder.append(", ");
      builder.append("organization=").append(organization);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (provision != null) {
      builder.append(", ");
      builder.append("provision=").append(provision);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Consent", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Consent {
    @Nullable Optional<ConsentStatus> status = Optional.empty();
    boolean statusIsSet;
    @Nullable List<CodeableConcept> category = Collections.emptyList();
    @Nullable String resourceType;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<Reference> sourceReference = Optional.empty();
    boolean sourceReferenceIsSet;
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<Consent_Policy>> policy = Optional.empty();
    boolean policyIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable CodeableConcept scope;
    @Nullable Optional<DateTime> dateTime = Optional.empty();
    boolean dateTimeIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Reference> patient = Optional.empty();
    boolean patientIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<CodeableConcept> policyRule = Optional.empty();
    boolean policyRuleIsSet;
    @Nullable Optional<Attachment> sourceAttachment = Optional.empty();
    boolean sourceAttachmentIsSet;
    @Nullable Optional<List<Consent_Verification>> verification = Optional.empty();
    boolean verificationIsSet;
    @Nullable Optional<List<Reference>> performer = Optional.empty();
    boolean performerIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<List<Reference>> organization = Optional.empty();
    boolean organizationIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<Consent_Provision> provision = Optional.empty();
    boolean provisionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("status")
    public void setStatus(Optional<ConsentStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @JsonProperty("category")
    public void setCategory(List<CodeableConcept> category) {
      this.category = category;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("sourceReference")
    public void setSourceReference(Optional<Reference> sourceReference) {
      this.sourceReference = sourceReference;
      this.sourceReferenceIsSet = true;
    }
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("policy")
    public void setPolicy(Optional<List<Consent_Policy>> policy) {
      this.policy = policy;
      this.policyIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("scope")
    public void setScope(CodeableConcept scope) {
      this.scope = scope;
    }
    @JsonProperty("dateTime")
    public void setDateTime(Optional<DateTime> dateTime) {
      this.dateTime = dateTime;
      this.dateTimeIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("patient")
    public void setPatient(Optional<Reference> patient) {
      this.patient = patient;
      this.patientIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("policyRule")
    public void setPolicyRule(Optional<CodeableConcept> policyRule) {
      this.policyRule = policyRule;
      this.policyRuleIsSet = true;
    }
    @JsonProperty("sourceAttachment")
    public void setSourceAttachment(Optional<Attachment> sourceAttachment) {
      this.sourceAttachment = sourceAttachment;
      this.sourceAttachmentIsSet = true;
    }
    @JsonProperty("verification")
    public void setVerification(Optional<List<Consent_Verification>> verification) {
      this.verification = verification;
      this.verificationIsSet = true;
    }
    @JsonProperty("performer")
    public void setPerformer(Optional<List<Reference>> performer) {
      this.performer = performer;
      this.performerIsSet = true;
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
    @JsonProperty("organization")
    public void setOrganization(Optional<List<Reference>> organization) {
      this.organization = organization;
      this.organizationIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("provision")
    public void setProvision(Optional<Consent_Provision> provision) {
      this.provision = provision;
      this.provisionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<ConsentStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public List<CodeableConcept> category() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> sourceReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Consent_Policy>> policy() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public CodeableConcept scope() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<DateTime> dateTime() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> patient() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> policyRule() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Attachment> sourceAttachment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Consent_Verification>> verification() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> performer() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> organization() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Consent_Provision> provision() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableConsent fromJson(Json json) {
    ImmutableConsent.Builder builder = ((ImmutableConsent.Builder) ImmutableConsent.builder());
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.category != null) {
      builder.addAllCategory(json.category);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.sourceReferenceIsSet) {
      builder.sourceReference(json.sourceReference);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.policyIsSet) {
      builder.policy(json.policy);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.scope != null) {
      builder.scope(json.scope);
    }
    if (json.dateTimeIsSet) {
      builder.dateTime(json.dateTime);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.patientIsSet) {
      builder.patient(json.patient);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.policyRuleIsSet) {
      builder.policyRule(json.policyRule);
    }
    if (json.sourceAttachmentIsSet) {
      builder.sourceAttachment(json.sourceAttachment);
    }
    if (json.verificationIsSet) {
      builder.verification(json.verification);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.organizationIsSet) {
      builder.organization(json.organization);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.provisionIsSet) {
      builder.provision(json.provision);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableConsent) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Consent} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Consent instance
   */
  public static Consent copyOf(Consent instance) {
    if (instance instanceof ImmutableConsent) {
      return (ImmutableConsent) instance;
    }
    return ((ImmutableConsent.Builder) ImmutableConsent.builder())
        .status(instance.status())
        .addAllCategory(instance.category())
        .resourceType(instance.resourceType())
        .identifier(instance.identifier())
        .sourceReference(instance.sourceReference())
        .language(instance.language())
        .policy(instance.policy())
        .meta(instance.meta())
        .scope(instance.scope())
        .dateTime(instance.dateTime())
        .modifierExtension(instance.modifierExtension())
        .patient(instance.patient())
        .implicitRules(instance.implicitRules())
        .policyRule(instance.policyRule())
        .sourceAttachment(instance.sourceAttachment())
        .verification(instance.verification())
        .performer(instance.performer())
        .id(instance.id())
        .contained(instance.contained())
        .organization(instance.organization())
        .text(instance.text())
        .provision(instance.provision())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link Consent Consent}.
   * <pre>
   * ImmutableConsent.builder()
   *    .status(com.medplum.types.fhir.ConsentStatus) // optional {@link Consent#status() status}
   *    .addCategory|addAllCategory(com.medplum.types.fhir.CodeableConcept) // {@link Consent#category() category} elements
   *    .resourceType(String) // required {@link Consent#resourceType() resourceType}
   *    .identifier(List&amp;lt;com.medplum.types.fhir.Identifier&amp;gt;) // optional {@link Consent#identifier() identifier}
   *    .sourceReference(com.medplum.types.fhir.Reference) // optional {@link Consent#sourceReference() sourceReference}
   *    .language(com.medplum.types.fhir.Code) // optional {@link Consent#language() language}
   *    .policy(List&amp;lt;com.medplum.types.fhir.Consent_Policy&amp;gt;) // optional {@link Consent#policy() policy}
   *    .meta(com.medplum.types.fhir.Meta) // optional {@link Consent#meta() meta}
   *    .scope(com.medplum.types.fhir.CodeableConcept) // required {@link Consent#scope() scope}
   *    .dateTime(com.medplum.types.fhir.DateTime) // optional {@link Consent#dateTime() dateTime}
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Consent#modifierExtension() modifierExtension}
   *    .patient(com.medplum.types.fhir.Reference) // optional {@link Consent#patient() patient}
   *    .implicitRules(com.medplum.types.fhir.Uri) // optional {@link Consent#implicitRules() implicitRules}
   *    .policyRule(com.medplum.types.fhir.CodeableConcept) // optional {@link Consent#policyRule() policyRule}
   *    .sourceAttachment(com.medplum.types.fhir.Attachment) // optional {@link Consent#sourceAttachment() sourceAttachment}
   *    .verification(List&amp;lt;com.medplum.types.fhir.Consent_Verification&amp;gt;) // optional {@link Consent#verification() verification}
   *    .performer(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link Consent#performer() performer}
   *    .id(com.medplum.types.fhir.Id) // optional {@link Consent#id() id}
   *    .contained(List&amp;lt;com.medplum.types.fhir.ResourceList&amp;gt;) // optional {@link Consent#contained() contained}
   *    .organization(List&amp;lt;com.medplum.types.fhir.Reference&amp;gt;) // optional {@link Consent#organization() organization}
   *    .text(com.medplum.types.fhir.Narrative) // optional {@link Consent#text() text}
   *    .provision(com.medplum.types.fhir.Consent_Provision) // optional {@link Consent#provision() provision}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Consent#extension() extension}
   *    .build();
   * </pre>
   * @return A new Consent builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableConsent.Builder();
  }

  /**
   * Builds instances of type {@link Consent Consent}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Consent", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, ScopeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_SCOPE = 0x2L;
    private static final long OPT_BIT_STATUS = 0x1L;
    private static final long OPT_BIT_IDENTIFIER = 0x2L;
    private static final long OPT_BIT_SOURCE_REFERENCE = 0x4L;
    private static final long OPT_BIT_LANGUAGE = 0x8L;
    private static final long OPT_BIT_POLICY = 0x10L;
    private static final long OPT_BIT_META = 0x20L;
    private static final long OPT_BIT_DATE_TIME = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_PATIENT = 0x100L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x200L;
    private static final long OPT_BIT_POLICY_RULE = 0x400L;
    private static final long OPT_BIT_SOURCE_ATTACHMENT = 0x800L;
    private static final long OPT_BIT_VERIFICATION = 0x1000L;
    private static final long OPT_BIT_PERFORMER = 0x2000L;
    private static final long OPT_BIT_ID = 0x4000L;
    private static final long OPT_BIT_CONTAINED = 0x8000L;
    private static final long OPT_BIT_ORGANIZATION = 0x10000L;
    private static final long OPT_BIT_TEXT = 0x20000L;
    private static final long OPT_BIT_PROVISION = 0x40000L;
    private static final long OPT_BIT_EXTENSION = 0x80000L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable ConsentStatus status;
    private final List<CodeableConcept> category = new ArrayList<CodeableConcept>();
    private @Nullable String resourceType;
    private @Nullable List<Identifier> identifier;
    private @Nullable Reference sourceReference;
    private @Nullable Code language;
    private @Nullable List<Consent_Policy> policy;
    private @Nullable Meta meta;
    private @Nullable CodeableConcept scope;
    private @Nullable DateTime dateTime;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Reference patient;
    private @Nullable Uri implicitRules;
    private @Nullable CodeableConcept policyRule;
    private @Nullable Attachment sourceAttachment;
    private @Nullable List<Consent_Verification> verification;
    private @Nullable List<Reference> performer;
    private @Nullable Id id;
    private @Nullable List<ResourceList> contained;
    private @Nullable List<Reference> organization;
    private @Nullable Narrative text;
    private @Nullable Consent_Provision provision;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Consent#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(ConsentStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("status")
    public final Builder status(Optional<? extends ConsentStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Adds one element to {@link Consent#category() category} list.
     * @param element A category element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addCategory(CodeableConcept element) {
      this.category.add(Objects.requireNonNull(element, "category element"));
      return this;
    }

    /**
     * Adds elements to {@link Consent#category() category} list.
     * @param elements An array of category elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addCategory(CodeableConcept... elements) {
      for (CodeableConcept element : elements) {
        this.category.add(Objects.requireNonNull(element, "category element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link Consent#category() category} list.
     * @param elements An iterable of category elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllCategory(Iterable<? extends CodeableConcept> elements) {
      for (CodeableConcept element : elements) {
        this.category.add(Objects.requireNonNull(element, "category element"));
      }
      return this;
    }

    /**
     * Initializes the value for the {@link Consent#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Consent#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Consent#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Consent#sourceReference() sourceReference} to sourceReference.
     * @param sourceReference The value for sourceReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder sourceReference(Reference sourceReference) {
      checkNotIsSet(sourceReferenceIsSet(), "sourceReference");
      this.sourceReference = Objects.requireNonNull(sourceReference, "sourceReference");
      optBits |= OPT_BIT_SOURCE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#sourceReference() sourceReference} to sourceReference.
     * @param sourceReference The value for sourceReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sourceReference")
    public final Builder sourceReference(Optional<? extends Reference> sourceReference) {
      checkNotIsSet(sourceReferenceIsSet(), "sourceReference");
      this.sourceReference = sourceReference.orElse(null);
      optBits |= OPT_BIT_SOURCE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#language() language} to language.
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
     * Initializes the optional value {@link Consent#language() language} to language.
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
     * Initializes the optional value {@link Consent#policy() policy} to policy.
     * @param policy The value for policy
     * @return {@code this} builder for chained invocation
     */
    public final Builder policy(List<Consent_Policy> policy) {
      checkNotIsSet(policyIsSet(), "policy");
      this.policy = Objects.requireNonNull(policy, "policy");
      optBits |= OPT_BIT_POLICY;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#policy() policy} to policy.
     * @param policy The value for policy
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("policy")
    public final Builder policy(Optional<? extends List<Consent_Policy>> policy) {
      checkNotIsSet(policyIsSet(), "policy");
      this.policy = policy.orElse(null);
      optBits |= OPT_BIT_POLICY;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#meta() meta} to meta.
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
     * Initializes the optional value {@link Consent#meta() meta} to meta.
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
     * Initializes the value for the {@link Consent#scope() scope} attribute.
     * @param scope The value for scope 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("scope")
    public final Builder scope(CodeableConcept scope) {
      checkNotIsSet(scopeIsSet(), "scope");
      this.scope = Objects.requireNonNull(scope, "scope");
      initBits &= ~INIT_BIT_SCOPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#dateTime() dateTime} to dateTime.
     * @param dateTime The value for dateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder dateTime(DateTime dateTime) {
      checkNotIsSet(dateTimeIsSet(), "dateTime");
      this.dateTime = Objects.requireNonNull(dateTime, "dateTime");
      optBits |= OPT_BIT_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#dateTime() dateTime} to dateTime.
     * @param dateTime The value for dateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("dateTime")
    public final Builder dateTime(Optional<? extends DateTime> dateTime) {
      checkNotIsSet(dateTimeIsSet(), "dateTime");
      this.dateTime = dateTime.orElse(null);
      optBits |= OPT_BIT_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Consent#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Consent#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for chained invocation
     */
    public final Builder patient(Reference patient) {
      checkNotIsSet(patientIsSet(), "patient");
      this.patient = Objects.requireNonNull(patient, "patient");
      optBits |= OPT_BIT_PATIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("patient")
    public final Builder patient(Optional<? extends Reference> patient) {
      checkNotIsSet(patientIsSet(), "patient");
      this.patient = patient.orElse(null);
      optBits |= OPT_BIT_PATIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Consent#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Consent#policyRule() policyRule} to policyRule.
     * @param policyRule The value for policyRule
     * @return {@code this} builder for chained invocation
     */
    public final Builder policyRule(CodeableConcept policyRule) {
      checkNotIsSet(policyRuleIsSet(), "policyRule");
      this.policyRule = Objects.requireNonNull(policyRule, "policyRule");
      optBits |= OPT_BIT_POLICY_RULE;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#policyRule() policyRule} to policyRule.
     * @param policyRule The value for policyRule
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("policyRule")
    public final Builder policyRule(Optional<? extends CodeableConcept> policyRule) {
      checkNotIsSet(policyRuleIsSet(), "policyRule");
      this.policyRule = policyRule.orElse(null);
      optBits |= OPT_BIT_POLICY_RULE;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#sourceAttachment() sourceAttachment} to sourceAttachment.
     * @param sourceAttachment The value for sourceAttachment
     * @return {@code this} builder for chained invocation
     */
    public final Builder sourceAttachment(Attachment sourceAttachment) {
      checkNotIsSet(sourceAttachmentIsSet(), "sourceAttachment");
      this.sourceAttachment = Objects.requireNonNull(sourceAttachment, "sourceAttachment");
      optBits |= OPT_BIT_SOURCE_ATTACHMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#sourceAttachment() sourceAttachment} to sourceAttachment.
     * @param sourceAttachment The value for sourceAttachment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("sourceAttachment")
    public final Builder sourceAttachment(Optional<? extends Attachment> sourceAttachment) {
      checkNotIsSet(sourceAttachmentIsSet(), "sourceAttachment");
      this.sourceAttachment = sourceAttachment.orElse(null);
      optBits |= OPT_BIT_SOURCE_ATTACHMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#verification() verification} to verification.
     * @param verification The value for verification
     * @return {@code this} builder for chained invocation
     */
    public final Builder verification(List<Consent_Verification> verification) {
      checkNotIsSet(verificationIsSet(), "verification");
      this.verification = Objects.requireNonNull(verification, "verification");
      optBits |= OPT_BIT_VERIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#verification() verification} to verification.
     * @param verification The value for verification
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("verification")
    public final Builder verification(Optional<? extends List<Consent_Verification>> verification) {
      checkNotIsSet(verificationIsSet(), "verification");
      this.verification = verification.orElse(null);
      optBits |= OPT_BIT_VERIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#performer() performer} to performer.
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
     * Initializes the optional value {@link Consent#performer() performer} to performer.
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
     * Initializes the optional value {@link Consent#id() id} to id.
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
     * Initializes the optional value {@link Consent#id() id} to id.
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
     * Initializes the optional value {@link Consent#contained() contained} to contained.
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
     * Initializes the optional value {@link Consent#contained() contained} to contained.
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
     * Initializes the optional value {@link Consent#organization() organization} to organization.
     * @param organization The value for organization
     * @return {@code this} builder for chained invocation
     */
    public final Builder organization(List<Reference> organization) {
      checkNotIsSet(organizationIsSet(), "organization");
      this.organization = Objects.requireNonNull(organization, "organization");
      optBits |= OPT_BIT_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#organization() organization} to organization.
     * @param organization The value for organization
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("organization")
    public final Builder organization(Optional<? extends List<Reference>> organization) {
      checkNotIsSet(organizationIsSet(), "organization");
      this.organization = organization.orElse(null);
      optBits |= OPT_BIT_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#text() text} to text.
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
     * Initializes the optional value {@link Consent#text() text} to text.
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
     * Initializes the optional value {@link Consent#provision() provision} to provision.
     * @param provision The value for provision
     * @return {@code this} builder for chained invocation
     */
    public final Builder provision(Consent_Provision provision) {
      checkNotIsSet(provisionIsSet(), "provision");
      this.provision = Objects.requireNonNull(provision, "provision");
      optBits |= OPT_BIT_PROVISION;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#provision() provision} to provision.
     * @param provision The value for provision
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("provision")
    public final Builder provision(Optional<? extends Consent_Provision> provision) {
      checkNotIsSet(provisionIsSet(), "provision");
      this.provision = provision.orElse(null);
      optBits |= OPT_BIT_PROVISION;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#extension() extension} to extension.
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
     * Initializes the optional value {@link Consent#extension() extension} to extension.
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
     * Builds a new {@link Consent Consent}.
     * @return An immutable instance of Consent
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Consent build() {
      checkRequiredAttributes();
      return new ImmutableConsent(
          status,
          createUnmodifiableList(true, category),
          resourceType,
          identifier,
          sourceReference,
          language,
          policy,
          meta,
          scope,
          dateTime,
          modifierExtension,
          patient,
          implicitRules,
          policyRule,
          sourceAttachment,
          verification,
          performer,
          id,
          contained,
          organization,
          text,
          provision,
          extension);
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean sourceReferenceIsSet() {
      return (optBits & OPT_BIT_SOURCE_REFERENCE) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean policyIsSet() {
      return (optBits & OPT_BIT_POLICY) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean dateTimeIsSet() {
      return (optBits & OPT_BIT_DATE_TIME) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean patientIsSet() {
      return (optBits & OPT_BIT_PATIENT) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean policyRuleIsSet() {
      return (optBits & OPT_BIT_POLICY_RULE) != 0;
    }

    private boolean sourceAttachmentIsSet() {
      return (optBits & OPT_BIT_SOURCE_ATTACHMENT) != 0;
    }

    private boolean verificationIsSet() {
      return (optBits & OPT_BIT_VERIFICATION) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean organizationIsSet() {
      return (optBits & OPT_BIT_ORGANIZATION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean provisionIsSet() {
      return (optBits & OPT_BIT_PROVISION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean scopeIsSet() {
      return (initBits & INIT_BIT_SCOPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Consent is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!scopeIsSet()) attributes.add("scope");
      return "Cannot build Consent, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Consent", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Consent#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    ScopeBuildStage resourceType(String resourceType);
  }

  @Generated(from = "Consent", generator = "Immutables")
  public interface ScopeBuildStage {
    /**
     * Initializes the value for the {@link Consent#scope() scope} attribute.
     * @param scope The value for scope 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal scope(CodeableConcept scope);
  }

  @Generated(from = "Consent", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Consent#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(ConsentStatus status);

    /**
     * Initializes the optional value {@link Consent#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(Optional<? extends ConsentStatus> status);

    /**
     * Adds one element to {@link Consent#category() category} list.
     * @param element A category element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addCategory(CodeableConcept element);

    /**
     * Adds elements to {@link Consent#category() category} list.
     * @param elements An array of category elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addCategory(CodeableConcept... elements);

    /**
     * Adds elements to {@link Consent#category() category} list.
     * @param elements An iterable of category elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllCategory(Iterable<? extends CodeableConcept> elements);

    /**
     * Initializes the optional value {@link Consent#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link Consent#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link Consent#sourceReference() sourceReference} to sourceReference.
     * @param sourceReference The value for sourceReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sourceReference(Reference sourceReference);

    /**
     * Initializes the optional value {@link Consent#sourceReference() sourceReference} to sourceReference.
     * @param sourceReference The value for sourceReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sourceReference(Optional<? extends Reference> sourceReference);

    /**
     * Initializes the optional value {@link Consent#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Consent#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Consent#policy() policy} to policy.
     * @param policy The value for policy
     * @return {@code this} builder for chained invocation
     */
    BuildFinal policy(List<Consent_Policy> policy);

    /**
     * Initializes the optional value {@link Consent#policy() policy} to policy.
     * @param policy The value for policy
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal policy(Optional<? extends List<Consent_Policy>> policy);

    /**
     * Initializes the optional value {@link Consent#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Consent#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Consent#dateTime() dateTime} to dateTime.
     * @param dateTime The value for dateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dateTime(DateTime dateTime);

    /**
     * Initializes the optional value {@link Consent#dateTime() dateTime} to dateTime.
     * @param dateTime The value for dateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dateTime(Optional<? extends DateTime> dateTime);

    /**
     * Initializes the optional value {@link Consent#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Consent#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Consent#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for chained invocation
     */
    BuildFinal patient(Reference patient);

    /**
     * Initializes the optional value {@link Consent#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal patient(Optional<? extends Reference> patient);

    /**
     * Initializes the optional value {@link Consent#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Consent#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Consent#policyRule() policyRule} to policyRule.
     * @param policyRule The value for policyRule
     * @return {@code this} builder for chained invocation
     */
    BuildFinal policyRule(CodeableConcept policyRule);

    /**
     * Initializes the optional value {@link Consent#policyRule() policyRule} to policyRule.
     * @param policyRule The value for policyRule
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal policyRule(Optional<? extends CodeableConcept> policyRule);

    /**
     * Initializes the optional value {@link Consent#sourceAttachment() sourceAttachment} to sourceAttachment.
     * @param sourceAttachment The value for sourceAttachment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sourceAttachment(Attachment sourceAttachment);

    /**
     * Initializes the optional value {@link Consent#sourceAttachment() sourceAttachment} to sourceAttachment.
     * @param sourceAttachment The value for sourceAttachment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sourceAttachment(Optional<? extends Attachment> sourceAttachment);

    /**
     * Initializes the optional value {@link Consent#verification() verification} to verification.
     * @param verification The value for verification
     * @return {@code this} builder for chained invocation
     */
    BuildFinal verification(List<Consent_Verification> verification);

    /**
     * Initializes the optional value {@link Consent#verification() verification} to verification.
     * @param verification The value for verification
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal verification(Optional<? extends List<Consent_Verification>> verification);

    /**
     * Initializes the optional value {@link Consent#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performer(List<Reference> performer);

    /**
     * Initializes the optional value {@link Consent#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performer(Optional<? extends List<Reference>> performer);

    /**
     * Initializes the optional value {@link Consent#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Consent#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link Consent#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link Consent#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link Consent#organization() organization} to organization.
     * @param organization The value for organization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal organization(List<Reference> organization);

    /**
     * Initializes the optional value {@link Consent#organization() organization} to organization.
     * @param organization The value for organization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal organization(Optional<? extends List<Reference>> organization);

    /**
     * Initializes the optional value {@link Consent#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link Consent#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link Consent#provision() provision} to provision.
     * @param provision The value for provision
     * @return {@code this} builder for chained invocation
     */
    BuildFinal provision(Consent_Provision provision);

    /**
     * Initializes the optional value {@link Consent#provision() provision} to provision.
     * @param provision The value for provision
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal provision(Optional<? extends Consent_Provision> provision);

    /**
     * Initializes the optional value {@link Consent#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link Consent#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Builds a new {@link Consent Consent}.
     * @return An immutable instance of Consent
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Consent build();
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

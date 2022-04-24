//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Consent}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableConsent.builder()}.
 */
@org.immutables.value.Generated(from = "Consent", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableConsent implements com.fhir.Consent {
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> organization;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final java.util.List<com.fhir.CodeableConcept> category;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable com.fhir.ConsentStatus status;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Consent_Verification> verification;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final @javax.annotation.Nullable com.fhir.Attachment sourceAttachment;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.dateTime dateTime;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final com.fhir.CodeableConcept scope;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Consent_Policy> policy;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Consent_Provision provision;
  private final @javax.annotation.Nullable com.fhir.Reference sourceReference;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept policyRule;
  private final @javax.annotation.Nullable com.fhir.Reference patient;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> performer;

  private ImmutableConsent(
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> organization,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      java.util.List<com.fhir.CodeableConcept> category,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable com.fhir.ConsentStatus status,
      @javax.annotation.Nullable java.util.List<com.fhir.Consent_Verification> verification,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      @javax.annotation.Nullable com.fhir.Attachment sourceAttachment,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.dateTime dateTime,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      com.fhir.CodeableConcept scope,
      @javax.annotation.Nullable java.util.List<com.fhir.Consent_Policy> policy,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Consent_Provision provision,
      @javax.annotation.Nullable com.fhir.Reference sourceReference,
      @javax.annotation.Nullable com.fhir.CodeableConcept policyRule,
      @javax.annotation.Nullable com.fhir.Reference patient,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> performer) {
    this.resourceType = resourceType;
    this.organization = organization;
    this.implicitRules = implicitRules;
    this.category = category;
    this.id = id;
    this.status = status;
    this.verification = verification;
    this.text = text;
    this.contained = contained;
    this.sourceAttachment = sourceAttachment;
    this.modifierExtension = modifierExtension;
    this.dateTime = dateTime;
    this.identifier = identifier;
    this.scope = scope;
    this.policy = policy;
    this.extension = extension;
    this.provision = provision;
    this.sourceReference = sourceReference;
    this.policyRule = policyRule;
    this.patient = patient;
    this.language = language;
    this.meta = meta;
    this.performer = performer;
  }

  /**
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code organization} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("organization")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> organization() {
    return java.util.Optional.ofNullable(organization);
  }

  /**
   * @return The value of the {@code implicitRules} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
  @Override
  public java.util.Optional<com.fhir.uri> implicitRules() {
    return java.util.Optional.ofNullable(implicitRules);
  }

  /**
   * @return The value of the {@code category} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("category")
  @Override
  public java.util.List<com.fhir.CodeableConcept> category() {
    return category;
  }

  /**
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.ConsentStatus> status() {
    return java.util.Optional.ofNullable(status);
  }

  /**
   * @return The value of the {@code verification} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("verification")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Consent_Verification>> verification() {
    return java.util.Optional.ofNullable(verification);
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<com.fhir.Narrative> text() {
    return java.util.Optional.ofNullable(text);
  }

  /**
   * @return The value of the {@code contained} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contained")
  @Override
  public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() {
    return java.util.Optional.ofNullable(contained);
  }

  /**
   * @return The value of the {@code sourceAttachment} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sourceAttachment")
  @Override
  public java.util.Optional<com.fhir.Attachment> sourceAttachment() {
    return java.util.Optional.ofNullable(sourceAttachment);
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
   * @return The value of the {@code dateTime} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("dateTime")
  @Override
  public java.util.Optional<com.fhir.dateTime> dateTime() {
    return java.util.Optional.ofNullable(dateTime);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code scope} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("scope")
  @Override
  public com.fhir.CodeableConcept scope() {
    return scope;
  }

  /**
   * @return The value of the {@code policy} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("policy")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Consent_Policy>> policy() {
    return java.util.Optional.ofNullable(policy);
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
   * @return The value of the {@code provision} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("provision")
  @Override
  public java.util.Optional<com.fhir.Consent_Provision> provision() {
    return java.util.Optional.ofNullable(provision);
  }

  /**
   * @return The value of the {@code sourceReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("sourceReference")
  @Override
  public java.util.Optional<com.fhir.Reference> sourceReference() {
    return java.util.Optional.ofNullable(sourceReference);
  }

  /**
   * @return The value of the {@code policyRule} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("policyRule")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> policyRule() {
    return java.util.Optional.ofNullable(policyRule);
  }

  /**
   * @return The value of the {@code patient} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("patient")
  @Override
  public java.util.Optional<com.fhir.Reference> patient() {
    return java.util.Optional.ofNullable(patient);
  }

  /**
   * @return The value of the {@code language} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("language")
  @Override
  public java.util.Optional<com.fhir.code> language() {
    return java.util.Optional.ofNullable(language);
  }

  /**
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
  }

  /**
   * @return The value of the {@code performer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("performer")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> performer() {
    return java.util.Optional.ofNullable(performer);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Consent#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableConsent withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableConsent(
        newValue,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#organization() organization} attribute.
   * @param value The value for organization
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withOrganization(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "organization");
    if (this.organization == newValue) return this;
    return new ImmutableConsent(
        this.resourceType,
        newValue,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#organization() organization} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for organization
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withOrganization(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.organization == value) return this;
    return new ImmutableConsent(
        this.resourceType,
        value,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        newValue,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        value,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Consent#category() category}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withCategory(com.fhir.CodeableConcept... elements) {
    java.util.List<com.fhir.CodeableConcept> newValue = createUnmodifiableList(false, createSafeList(java.util.Arrays.asList(elements), true, false));
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        newValue,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link Consent#category() category}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of category elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withCategory(Iterable<? extends com.fhir.CodeableConcept> elements) {
    if (this.category == elements) return this;
    java.util.List<com.fhir.CodeableConcept> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        newValue,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        newValue,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        value,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withStatus(com.fhir.ConsentStatus value) {
    @javax.annotation.Nullable com.fhir.ConsentStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        newValue,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withStatus(java.util.Optional<? extends com.fhir.ConsentStatus> optional) {
    @javax.annotation.Nullable com.fhir.ConsentStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        value,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#verification() verification} attribute.
   * @param value The value for verification
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withVerification(java.util.List<com.fhir.Consent_Verification> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Consent_Verification> newValue = java.util.Objects.requireNonNull(value, "verification");
    if (this.verification == newValue) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        newValue,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#verification() verification} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for verification
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withVerification(java.util.Optional<? extends java.util.List<com.fhir.Consent_Verification>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Consent_Verification> value = optional.orElse(null);
    if (this.verification == value) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        value,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        newValue,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        value,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        newValue,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        value,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#sourceAttachment() sourceAttachment} attribute.
   * @param value The value for sourceAttachment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withSourceAttachment(com.fhir.Attachment value) {
    @javax.annotation.Nullable com.fhir.Attachment newValue = java.util.Objects.requireNonNull(value, "sourceAttachment");
    if (this.sourceAttachment == newValue) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        newValue,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#sourceAttachment() sourceAttachment} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sourceAttachment
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withSourceAttachment(java.util.Optional<? extends com.fhir.Attachment> optional) {
    @javax.annotation.Nullable com.fhir.Attachment value = optional.orElse(null);
    if (this.sourceAttachment == value) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        value,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        newValue,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        value,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#dateTime() dateTime} attribute.
   * @param value The value for dateTime
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withDateTime(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "dateTime");
    if (this.dateTime == newValue) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        newValue,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#dateTime() dateTime} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for dateTime
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withDateTime(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.dateTime == value) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        value,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        newValue,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        value,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Consent#scope() scope} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for scope
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableConsent withScope(com.fhir.CodeableConcept value) {
    if (this.scope == value) return this;
    com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "scope");
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        newValue,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#policy() policy} attribute.
   * @param value The value for policy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withPolicy(java.util.List<com.fhir.Consent_Policy> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Consent_Policy> newValue = java.util.Objects.requireNonNull(value, "policy");
    if (this.policy == newValue) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        newValue,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#policy() policy} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for policy
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withPolicy(java.util.Optional<? extends java.util.List<com.fhir.Consent_Policy>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Consent_Policy> value = optional.orElse(null);
    if (this.policy == value) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        value,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        newValue,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        value,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#provision() provision} attribute.
   * @param value The value for provision
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withProvision(com.fhir.Consent_Provision value) {
    @javax.annotation.Nullable com.fhir.Consent_Provision newValue = java.util.Objects.requireNonNull(value, "provision");
    if (this.provision == newValue) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        newValue,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#provision() provision} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for provision
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withProvision(java.util.Optional<? extends com.fhir.Consent_Provision> optional) {
    @javax.annotation.Nullable com.fhir.Consent_Provision value = optional.orElse(null);
    if (this.provision == value) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        value,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#sourceReference() sourceReference} attribute.
   * @param value The value for sourceReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withSourceReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "sourceReference");
    if (this.sourceReference == newValue) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        newValue,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#sourceReference() sourceReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for sourceReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withSourceReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.sourceReference == value) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        value,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#policyRule() policyRule} attribute.
   * @param value The value for policyRule
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withPolicyRule(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "policyRule");
    if (this.policyRule == newValue) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        newValue,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#policyRule() policyRule} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for policyRule
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withPolicyRule(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.policyRule == value) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        value,
        this.patient,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#patient() patient} attribute.
   * @param value The value for patient
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withPatient(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "patient");
    if (this.patient == newValue) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        newValue,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#patient() patient} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for patient
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withPatient(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.patient == value) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        value,
        this.language,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        newValue,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        value,
        this.meta,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        newValue,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        value,
        this.performer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent#performer() performer} attribute.
   * @param value The value for performer
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent withPerformer(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "performer");
    if (this.performer == newValue) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent#performer() performer} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for performer
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent withPerformer(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.performer == value) return this;
    return new ImmutableConsent(
        this.resourceType,
        this.organization,
        this.implicitRules,
        this.category,
        this.id,
        this.status,
        this.verification,
        this.text,
        this.contained,
        this.sourceAttachment,
        this.modifierExtension,
        this.dateTime,
        this.identifier,
        this.scope,
        this.policy,
        this.extension,
        this.provision,
        this.sourceReference,
        this.policyRule,
        this.patient,
        this.language,
        this.meta,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableConsent} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableConsent
        && equalTo((ImmutableConsent) another);
  }

  private boolean equalTo(ImmutableConsent another) {
    return resourceType.equals(another.resourceType)
        && java.util.Objects.equals(organization, another.organization)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && category.equals(another.category)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(verification, another.verification)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(contained, another.contained)
        && java.util.Objects.equals(sourceAttachment, another.sourceAttachment)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(dateTime, another.dateTime)
        && java.util.Objects.equals(identifier, another.identifier)
        && scope.equals(another.scope)
        && java.util.Objects.equals(policy, another.policy)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(provision, another.provision)
        && java.util.Objects.equals(sourceReference, another.sourceReference)
        && java.util.Objects.equals(policyRule, another.policyRule)
        && java.util.Objects.equals(patient, another.patient)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(performer, another.performer);
  }

  /**
   * Computes a hash code from attributes: {@code resourceType}, {@code organization}, {@code implicitRules}, {@code category}, {@code id}, {@code status}, {@code verification}, {@code text}, {@code contained}, {@code sourceAttachment}, {@code modifierExtension}, {@code dateTime}, {@code identifier}, {@code scope}, {@code policy}, {@code extension}, {@code provision}, {@code sourceReference}, {@code policyRule}, {@code patient}, {@code language}, {@code meta}, {@code performer}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(organization);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + category.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(verification);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + java.util.Objects.hashCode(sourceAttachment);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(dateTime);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + scope.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(policy);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(provision);
    h += (h << 5) + java.util.Objects.hashCode(sourceReference);
    h += (h << 5) + java.util.Objects.hashCode(policyRule);
    h += (h << 5) + java.util.Objects.hashCode(patient);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(performer);
    return h;
  }

  /**
   * Prints the immutable value {@code Consent} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Consent{");
    builder.append("resourceType=").append(resourceType);
    if (organization != null) {
      builder.append(", ");
      builder.append("organization=").append(organization);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    builder.append(", ");
    builder.append("category=").append(category);
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (status != null) {
      builder.append(", ");
      builder.append("status=").append(status);
    }
    if (verification != null) {
      builder.append(", ");
      builder.append("verification=").append(verification);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (sourceAttachment != null) {
      builder.append(", ");
      builder.append("sourceAttachment=").append(sourceAttachment);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (dateTime != null) {
      builder.append(", ");
      builder.append("dateTime=").append(dateTime);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    builder.append(", ");
    builder.append("scope=").append(scope);
    if (policy != null) {
      builder.append(", ");
      builder.append("policy=").append(policy);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (provision != null) {
      builder.append(", ");
      builder.append("provision=").append(provision);
    }
    if (sourceReference != null) {
      builder.append(", ");
      builder.append("sourceReference=").append(sourceReference);
    }
    if (policyRule != null) {
      builder.append(", ");
      builder.append("policyRule=").append(policyRule);
    }
    if (patient != null) {
      builder.append(", ");
      builder.append("patient=").append(patient);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (performer != null) {
      builder.append(", ");
      builder.append("performer=").append(performer);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Consent", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Consent {
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> organization = java.util.Optional.empty();
    boolean organizationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> category = java.util.Collections.emptyList();
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.ConsentStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Consent_Verification>> verification = java.util.Optional.empty();
    boolean verificationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Attachment> sourceAttachment = java.util.Optional.empty();
    boolean sourceAttachmentIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> dateTime = java.util.Optional.empty();
    boolean dateTimeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable com.fhir.CodeableConcept scope;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Consent_Policy>> policy = java.util.Optional.empty();
    boolean policyIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Consent_Provision> provision = java.util.Optional.empty();
    boolean provisionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> sourceReference = java.util.Optional.empty();
    boolean sourceReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> policyRule = java.util.Optional.empty();
    boolean policyRuleIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> patient = java.util.Optional.empty();
    boolean patientIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> performer = java.util.Optional.empty();
    boolean performerIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("organization")
    public void setOrganization(java.util.Optional<java.util.List<com.fhir.Reference>> organization) {
      this.organization = organization;
      this.organizationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("category")
    public void setCategory(java.util.List<com.fhir.CodeableConcept> category) {
      this.category = category;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.ConsentStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("verification")
    public void setVerification(java.util.Optional<java.util.List<com.fhir.Consent_Verification>> verification) {
      this.verification = verification;
      this.verificationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("sourceAttachment")
    public void setSourceAttachment(java.util.Optional<com.fhir.Attachment> sourceAttachment) {
      this.sourceAttachment = sourceAttachment;
      this.sourceAttachmentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("dateTime")
    public void setDateTime(java.util.Optional<com.fhir.dateTime> dateTime) {
      this.dateTime = dateTime;
      this.dateTimeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    public void setScope(com.fhir.CodeableConcept scope) {
      this.scope = scope;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("policy")
    public void setPolicy(java.util.Optional<java.util.List<com.fhir.Consent_Policy>> policy) {
      this.policy = policy;
      this.policyIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("provision")
    public void setProvision(java.util.Optional<com.fhir.Consent_Provision> provision) {
      this.provision = provision;
      this.provisionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("sourceReference")
    public void setSourceReference(java.util.Optional<com.fhir.Reference> sourceReference) {
      this.sourceReference = sourceReference;
      this.sourceReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("policyRule")
    public void setPolicyRule(java.util.Optional<com.fhir.CodeableConcept> policyRule) {
      this.policyRule = policyRule;
      this.policyRuleIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("patient")
    public void setPatient(java.util.Optional<com.fhir.Reference> patient) {
      this.patient = patient;
      this.patientIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("performer")
    public void setPerformer(java.util.Optional<java.util.List<com.fhir.Reference>> performer) {
      this.performer = performer;
      this.performerIsSet = true;
    }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> organization() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.List<com.fhir.CodeableConcept> category() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.ConsentStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Consent_Verification>> verification() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Attachment> sourceAttachment() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.dateTime> dateTime() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.CodeableConcept scope() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Consent_Policy>> policy() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Consent_Provision> provision() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> sourceReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> policyRule() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> patient() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> performer() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableConsent fromJson(Json json) {
    ImmutableConsent.Builder builder = ((ImmutableConsent.Builder) ImmutableConsent.builder());
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.organizationIsSet) {
      builder.organization(json.organization);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.category != null) {
      builder.addAllCategory(json.category);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.verificationIsSet) {
      builder.verification(json.verification);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.sourceAttachmentIsSet) {
      builder.sourceAttachment(json.sourceAttachment);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.dateTimeIsSet) {
      builder.dateTime(json.dateTime);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.scope != null) {
      builder.scope(json.scope);
    }
    if (json.policyIsSet) {
      builder.policy(json.policy);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.provisionIsSet) {
      builder.provision(json.provision);
    }
    if (json.sourceReferenceIsSet) {
      builder.sourceReference(json.sourceReference);
    }
    if (json.policyRuleIsSet) {
      builder.policyRule(json.policyRule);
    }
    if (json.patientIsSet) {
      builder.patient(json.patient);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.performerIsSet) {
      builder.performer(json.performer);
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
        .resourceType(instance.resourceType())
        .organization(instance.organization())
        .implicitRules(instance.implicitRules())
        .addAllCategory(instance.category())
        .id(instance.id())
        .status(instance.status())
        .verification(instance.verification())
        .text(instance.text())
        .contained(instance.contained())
        .sourceAttachment(instance.sourceAttachment())
        .modifierExtension(instance.modifierExtension())
        .dateTime(instance.dateTime())
        .identifier(instance.identifier())
        .scope(instance.scope())
        .policy(instance.policy())
        .extension(instance.extension())
        .provision(instance.provision())
        .sourceReference(instance.sourceReference())
        .policyRule(instance.policyRule())
        .patient(instance.patient())
        .language(instance.language())
        .meta(instance.meta())
        .performer(instance.performer())
        .build();
  }

  /**
   * Creates a builder for {@link Consent Consent}.
   * <pre>
   * ImmutableConsent.builder()
   *    .resourceType(String) // required {@link Consent#resourceType() resourceType}
   *    .organization(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Consent#organization() organization}
   *    .implicitRules(com.fhir.uri) // optional {@link Consent#implicitRules() implicitRules}
   *    .addCategory|addAllCategory(com.fhir.CodeableConcept) // {@link Consent#category() category} elements
   *    .id(com.fhir.id) // optional {@link Consent#id() id}
   *    .status(com.fhir.ConsentStatus) // optional {@link Consent#status() status}
   *    .verification(List&amp;lt;com.fhir.Consent_Verification&amp;gt;) // optional {@link Consent#verification() verification}
   *    .text(com.fhir.Narrative) // optional {@link Consent#text() text}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Consent#contained() contained}
   *    .sourceAttachment(com.fhir.Attachment) // optional {@link Consent#sourceAttachment() sourceAttachment}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Consent#modifierExtension() modifierExtension}
   *    .dateTime(com.fhir.dateTime) // optional {@link Consent#dateTime() dateTime}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Consent#identifier() identifier}
   *    .scope(com.fhir.CodeableConcept) // required {@link Consent#scope() scope}
   *    .policy(List&amp;lt;com.fhir.Consent_Policy&amp;gt;) // optional {@link Consent#policy() policy}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Consent#extension() extension}
   *    .provision(com.fhir.Consent_Provision) // optional {@link Consent#provision() provision}
   *    .sourceReference(com.fhir.Reference) // optional {@link Consent#sourceReference() sourceReference}
   *    .policyRule(com.fhir.CodeableConcept) // optional {@link Consent#policyRule() policyRule}
   *    .patient(com.fhir.Reference) // optional {@link Consent#patient() patient}
   *    .language(com.fhir.code) // optional {@link Consent#language() language}
   *    .meta(com.fhir.Meta) // optional {@link Consent#meta() meta}
   *    .performer(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Consent#performer() performer}
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
  @org.immutables.value.Generated(from = "Consent", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, ScopeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long INIT_BIT_SCOPE = 0x2L;
    private static final long OPT_BIT_ORGANIZATION = 0x1L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_STATUS = 0x8L;
    private static final long OPT_BIT_VERIFICATION = 0x10L;
    private static final long OPT_BIT_TEXT = 0x20L;
    private static final long OPT_BIT_CONTAINED = 0x40L;
    private static final long OPT_BIT_SOURCE_ATTACHMENT = 0x80L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100L;
    private static final long OPT_BIT_DATE_TIME = 0x200L;
    private static final long OPT_BIT_IDENTIFIER = 0x400L;
    private static final long OPT_BIT_POLICY = 0x800L;
    private static final long OPT_BIT_EXTENSION = 0x1000L;
    private static final long OPT_BIT_PROVISION = 0x2000L;
    private static final long OPT_BIT_SOURCE_REFERENCE = 0x4000L;
    private static final long OPT_BIT_POLICY_RULE = 0x8000L;
    private static final long OPT_BIT_PATIENT = 0x10000L;
    private static final long OPT_BIT_LANGUAGE = 0x20000L;
    private static final long OPT_BIT_META = 0x40000L;
    private static final long OPT_BIT_PERFORMER = 0x80000L;
    private long initBits = 0x3L;
    private long optBits;

    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> organization;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private final java.util.List<com.fhir.CodeableConcept> category = new java.util.ArrayList<com.fhir.CodeableConcept>();
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable com.fhir.ConsentStatus status;
    private @javax.annotation.Nullable java.util.List<com.fhir.Consent_Verification> verification;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable com.fhir.Attachment sourceAttachment;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.dateTime dateTime;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.CodeableConcept scope;
    private @javax.annotation.Nullable java.util.List<com.fhir.Consent_Policy> policy;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Consent_Provision provision;
    private @javax.annotation.Nullable com.fhir.Reference sourceReference;
    private @javax.annotation.Nullable com.fhir.CodeableConcept policyRule;
    private @javax.annotation.Nullable com.fhir.Reference patient;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> performer;

    private Builder() {
    }

    /**
     * Initializes the value for the {@link Consent#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public final Builder resourceType(java.lang.String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = java.util.Objects.requireNonNull(resourceType, "resourceType");
      initBits &= ~INIT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#organization() organization} to organization.
     * @param organization The value for organization
     * @return {@code this} builder for chained invocation
     */
    public final Builder organization(java.util.List<com.fhir.Reference> organization) {
      checkNotIsSet(organizationIsSet(), "organization");
      this.organization = java.util.Objects.requireNonNull(organization, "organization");
      optBits |= OPT_BIT_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#organization() organization} to organization.
     * @param organization The value for organization
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("organization")
    public final Builder organization(java.util.Optional<? extends java.util.List<com.fhir.Reference>> organization) {
      checkNotIsSet(organizationIsSet(), "organization");
      this.organization = organization.orElse(null);
      optBits |= OPT_BIT_ORGANIZATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    public final Builder implicitRules(com.fhir.uri implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = java.util.Objects.requireNonNull(implicitRules, "implicitRules");
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public final Builder implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules) {
      checkNotIsSet(implicitRulesIsSet(), "implicitRules");
      this.implicitRules = implicitRules.orElse(null);
      optBits |= OPT_BIT_IMPLICIT_RULES;
      return this;
    }

    /**
     * Adds one element to {@link Consent#category() category} list.
     * @param element A category element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addCategory(com.fhir.CodeableConcept element) {
      this.category.add(java.util.Objects.requireNonNull(element, "category element"));
      return this;
    }

    /**
     * Adds elements to {@link Consent#category() category} list.
     * @param elements An array of category elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addCategory(com.fhir.CodeableConcept... elements) {
      for (com.fhir.CodeableConcept element : elements) {
        this.category.add(java.util.Objects.requireNonNull(element, "category element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link Consent#category() category} list.
     * @param elements An iterable of category elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllCategory(Iterable<? extends com.fhir.CodeableConcept> elements) {
      for (com.fhir.CodeableConcept element : elements) {
        this.category.add(java.util.Objects.requireNonNull(element, "category element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    public final Builder id(com.fhir.id id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = java.util.Objects.requireNonNull(id, "id");
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public final Builder id(java.util.Optional<? extends com.fhir.id> id) {
      checkNotIsSet(idIsSet(), "id");
      this.id = id.orElse(null);
      optBits |= OPT_BIT_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.ConsentStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.ConsentStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#verification() verification} to verification.
     * @param verification The value for verification
     * @return {@code this} builder for chained invocation
     */
    public final Builder verification(java.util.List<com.fhir.Consent_Verification> verification) {
      checkNotIsSet(verificationIsSet(), "verification");
      this.verification = java.util.Objects.requireNonNull(verification, "verification");
      optBits |= OPT_BIT_VERIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#verification() verification} to verification.
     * @param verification The value for verification
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("verification")
    public final Builder verification(java.util.Optional<? extends java.util.List<com.fhir.Consent_Verification>> verification) {
      checkNotIsSet(verificationIsSet(), "verification");
      this.verification = verification.orElse(null);
      optBits |= OPT_BIT_VERIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(com.fhir.Narrative text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = java.util.Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public final Builder text(java.util.Optional<? extends com.fhir.Narrative> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    public final Builder contained(java.util.List<com.fhir.ResourceList> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = java.util.Objects.requireNonNull(contained, "contained");
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public final Builder contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained) {
      checkNotIsSet(containedIsSet(), "contained");
      this.contained = contained.orElse(null);
      optBits |= OPT_BIT_CONTAINED;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#sourceAttachment() sourceAttachment} to sourceAttachment.
     * @param sourceAttachment The value for sourceAttachment
     * @return {@code this} builder for chained invocation
     */
    public final Builder sourceAttachment(com.fhir.Attachment sourceAttachment) {
      checkNotIsSet(sourceAttachmentIsSet(), "sourceAttachment");
      this.sourceAttachment = java.util.Objects.requireNonNull(sourceAttachment, "sourceAttachment");
      optBits |= OPT_BIT_SOURCE_ATTACHMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#sourceAttachment() sourceAttachment} to sourceAttachment.
     * @param sourceAttachment The value for sourceAttachment
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceAttachment")
    public final Builder sourceAttachment(java.util.Optional<? extends com.fhir.Attachment> sourceAttachment) {
      checkNotIsSet(sourceAttachmentIsSet(), "sourceAttachment");
      this.sourceAttachment = sourceAttachment.orElse(null);
      optBits |= OPT_BIT_SOURCE_ATTACHMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Consent#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Consent#dateTime() dateTime} to dateTime.
     * @param dateTime The value for dateTime
     * @return {@code this} builder for chained invocation
     */
    public final Builder dateTime(com.fhir.dateTime dateTime) {
      checkNotIsSet(dateTimeIsSet(), "dateTime");
      this.dateTime = java.util.Objects.requireNonNull(dateTime, "dateTime");
      optBits |= OPT_BIT_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#dateTime() dateTime} to dateTime.
     * @param dateTime The value for dateTime
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("dateTime")
    public final Builder dateTime(java.util.Optional<? extends com.fhir.dateTime> dateTime) {
      checkNotIsSet(dateTimeIsSet(), "dateTime");
      this.dateTime = dateTime.orElse(null);
      optBits |= OPT_BIT_DATE_TIME;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(java.util.List<com.fhir.Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = java.util.Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public final Builder identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the value for the {@link Consent#scope() scope} attribute.
     * @param scope The value for scope 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("scope")
    public final Builder scope(com.fhir.CodeableConcept scope) {
      checkNotIsSet(scopeIsSet(), "scope");
      this.scope = java.util.Objects.requireNonNull(scope, "scope");
      initBits &= ~INIT_BIT_SCOPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#policy() policy} to policy.
     * @param policy The value for policy
     * @return {@code this} builder for chained invocation
     */
    public final Builder policy(java.util.List<com.fhir.Consent_Policy> policy) {
      checkNotIsSet(policyIsSet(), "policy");
      this.policy = java.util.Objects.requireNonNull(policy, "policy");
      optBits |= OPT_BIT_POLICY;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#policy() policy} to policy.
     * @param policy The value for policy
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("policy")
    public final Builder policy(java.util.Optional<? extends java.util.List<com.fhir.Consent_Policy>> policy) {
      checkNotIsSet(policyIsSet(), "policy");
      this.policy = policy.orElse(null);
      optBits |= OPT_BIT_POLICY;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#extension() extension} to extension.
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
     * Initializes the optional value {@link Consent#extension() extension} to extension.
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
     * Initializes the optional value {@link Consent#provision() provision} to provision.
     * @param provision The value for provision
     * @return {@code this} builder for chained invocation
     */
    public final Builder provision(com.fhir.Consent_Provision provision) {
      checkNotIsSet(provisionIsSet(), "provision");
      this.provision = java.util.Objects.requireNonNull(provision, "provision");
      optBits |= OPT_BIT_PROVISION;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#provision() provision} to provision.
     * @param provision The value for provision
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("provision")
    public final Builder provision(java.util.Optional<? extends com.fhir.Consent_Provision> provision) {
      checkNotIsSet(provisionIsSet(), "provision");
      this.provision = provision.orElse(null);
      optBits |= OPT_BIT_PROVISION;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#sourceReference() sourceReference} to sourceReference.
     * @param sourceReference The value for sourceReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder sourceReference(com.fhir.Reference sourceReference) {
      checkNotIsSet(sourceReferenceIsSet(), "sourceReference");
      this.sourceReference = java.util.Objects.requireNonNull(sourceReference, "sourceReference");
      optBits |= OPT_BIT_SOURCE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#sourceReference() sourceReference} to sourceReference.
     * @param sourceReference The value for sourceReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("sourceReference")
    public final Builder sourceReference(java.util.Optional<? extends com.fhir.Reference> sourceReference) {
      checkNotIsSet(sourceReferenceIsSet(), "sourceReference");
      this.sourceReference = sourceReference.orElse(null);
      optBits |= OPT_BIT_SOURCE_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#policyRule() policyRule} to policyRule.
     * @param policyRule The value for policyRule
     * @return {@code this} builder for chained invocation
     */
    public final Builder policyRule(com.fhir.CodeableConcept policyRule) {
      checkNotIsSet(policyRuleIsSet(), "policyRule");
      this.policyRule = java.util.Objects.requireNonNull(policyRule, "policyRule");
      optBits |= OPT_BIT_POLICY_RULE;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#policyRule() policyRule} to policyRule.
     * @param policyRule The value for policyRule
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("policyRule")
    public final Builder policyRule(java.util.Optional<? extends com.fhir.CodeableConcept> policyRule) {
      checkNotIsSet(policyRuleIsSet(), "policyRule");
      this.policyRule = policyRule.orElse(null);
      optBits |= OPT_BIT_POLICY_RULE;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for chained invocation
     */
    public final Builder patient(com.fhir.Reference patient) {
      checkNotIsSet(patientIsSet(), "patient");
      this.patient = java.util.Objects.requireNonNull(patient, "patient");
      optBits |= OPT_BIT_PATIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("patient")
    public final Builder patient(java.util.Optional<? extends com.fhir.Reference> patient) {
      checkNotIsSet(patientIsSet(), "patient");
      this.patient = patient.orElse(null);
      optBits |= OPT_BIT_PATIENT;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    public final Builder language(com.fhir.code language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = java.util.Objects.requireNonNull(language, "language");
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public final Builder language(java.util.Optional<? extends com.fhir.code> language) {
      checkNotIsSet(languageIsSet(), "language");
      this.language = language.orElse(null);
      optBits |= OPT_BIT_LANGUAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    public final Builder meta(com.fhir.Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = java.util.Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public final Builder meta(java.util.Optional<? extends com.fhir.Meta> meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = meta.orElse(null);
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    public final Builder performer(java.util.List<com.fhir.Reference> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = java.util.Objects.requireNonNull(performer, "performer");
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("performer")
    public final Builder performer(java.util.Optional<? extends java.util.List<com.fhir.Reference>> performer) {
      checkNotIsSet(performerIsSet(), "performer");
      this.performer = performer.orElse(null);
      optBits |= OPT_BIT_PERFORMER;
      return this;
    }

    /**
     * Builds a new {@link Consent Consent}.
     * @return An immutable instance of Consent
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Consent build() {
      checkRequiredAttributes();
      return new ImmutableConsent(
          resourceType,
          organization,
          implicitRules,
          createUnmodifiableList(true, category),
          id,
          status,
          verification,
          text,
          contained,
          sourceAttachment,
          modifierExtension,
          dateTime,
          identifier,
          scope,
          policy,
          extension,
          provision,
          sourceReference,
          policyRule,
          patient,
          language,
          meta,
          performer);
    }

    private boolean organizationIsSet() {
      return (optBits & OPT_BIT_ORGANIZATION) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean verificationIsSet() {
      return (optBits & OPT_BIT_VERIFICATION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean sourceAttachmentIsSet() {
      return (optBits & OPT_BIT_SOURCE_ATTACHMENT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean dateTimeIsSet() {
      return (optBits & OPT_BIT_DATE_TIME) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean policyIsSet() {
      return (optBits & OPT_BIT_POLICY) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean provisionIsSet() {
      return (optBits & OPT_BIT_PROVISION) != 0;
    }

    private boolean sourceReferenceIsSet() {
      return (optBits & OPT_BIT_SOURCE_REFERENCE) != 0;
    }

    private boolean policyRuleIsSet() {
      return (optBits & OPT_BIT_POLICY_RULE) != 0;
    }

    private boolean patientIsSet() {
      return (optBits & OPT_BIT_PATIENT) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean performerIsSet() {
      return (optBits & OPT_BIT_PERFORMER) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private boolean scopeIsSet() {
      return (initBits & INIT_BIT_SCOPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Consent is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      if (!scopeIsSet()) attributes.add("scope");
      return "Cannot build Consent, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Consent", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Consent#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    ScopeBuildStage resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Consent", generator = "Immutables")
  public interface ScopeBuildStage {
    /**
     * Initializes the value for the {@link Consent#scope() scope} attribute.
     * @param scope The value for scope 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal scope(com.fhir.CodeableConcept scope);
  }

  @org.immutables.value.Generated(from = "Consent", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Consent#organization() organization} to organization.
     * @param organization The value for organization
     * @return {@code this} builder for chained invocation
     */
    BuildFinal organization(java.util.List<com.fhir.Reference> organization);

    /**
     * Initializes the optional value {@link Consent#organization() organization} to organization.
     * @param organization The value for organization
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal organization(java.util.Optional<? extends java.util.List<com.fhir.Reference>> organization);

    /**
     * Initializes the optional value {@link Consent#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Consent#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Adds one element to {@link Consent#category() category} list.
     * @param element A category element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addCategory(com.fhir.CodeableConcept element);

    /**
     * Adds elements to {@link Consent#category() category} list.
     * @param elements An array of category elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addCategory(com.fhir.CodeableConcept... elements);

    /**
     * Adds elements to {@link Consent#category() category} list.
     * @param elements An iterable of category elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllCategory(Iterable<? extends com.fhir.CodeableConcept> elements);

    /**
     * Initializes the optional value {@link Consent#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Consent#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Consent#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.ConsentStatus status);

    /**
     * Initializes the optional value {@link Consent#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.ConsentStatus> status);

    /**
     * Initializes the optional value {@link Consent#verification() verification} to verification.
     * @param verification The value for verification
     * @return {@code this} builder for chained invocation
     */
    BuildFinal verification(java.util.List<com.fhir.Consent_Verification> verification);

    /**
     * Initializes the optional value {@link Consent#verification() verification} to verification.
     * @param verification The value for verification
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal verification(java.util.Optional<? extends java.util.List<com.fhir.Consent_Verification>> verification);

    /**
     * Initializes the optional value {@link Consent#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Consent#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Consent#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Consent#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link Consent#sourceAttachment() sourceAttachment} to sourceAttachment.
     * @param sourceAttachment The value for sourceAttachment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sourceAttachment(com.fhir.Attachment sourceAttachment);

    /**
     * Initializes the optional value {@link Consent#sourceAttachment() sourceAttachment} to sourceAttachment.
     * @param sourceAttachment The value for sourceAttachment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sourceAttachment(java.util.Optional<? extends com.fhir.Attachment> sourceAttachment);

    /**
     * Initializes the optional value {@link Consent#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Consent#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Consent#dateTime() dateTime} to dateTime.
     * @param dateTime The value for dateTime
     * @return {@code this} builder for chained invocation
     */
    BuildFinal dateTime(com.fhir.dateTime dateTime);

    /**
     * Initializes the optional value {@link Consent#dateTime() dateTime} to dateTime.
     * @param dateTime The value for dateTime
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal dateTime(java.util.Optional<? extends com.fhir.dateTime> dateTime);

    /**
     * Initializes the optional value {@link Consent#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Consent#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link Consent#policy() policy} to policy.
     * @param policy The value for policy
     * @return {@code this} builder for chained invocation
     */
    BuildFinal policy(java.util.List<com.fhir.Consent_Policy> policy);

    /**
     * Initializes the optional value {@link Consent#policy() policy} to policy.
     * @param policy The value for policy
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal policy(java.util.Optional<? extends java.util.List<com.fhir.Consent_Policy>> policy);

    /**
     * Initializes the optional value {@link Consent#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Consent#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Consent#provision() provision} to provision.
     * @param provision The value for provision
     * @return {@code this} builder for chained invocation
     */
    BuildFinal provision(com.fhir.Consent_Provision provision);

    /**
     * Initializes the optional value {@link Consent#provision() provision} to provision.
     * @param provision The value for provision
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal provision(java.util.Optional<? extends com.fhir.Consent_Provision> provision);

    /**
     * Initializes the optional value {@link Consent#sourceReference() sourceReference} to sourceReference.
     * @param sourceReference The value for sourceReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal sourceReference(com.fhir.Reference sourceReference);

    /**
     * Initializes the optional value {@link Consent#sourceReference() sourceReference} to sourceReference.
     * @param sourceReference The value for sourceReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal sourceReference(java.util.Optional<? extends com.fhir.Reference> sourceReference);

    /**
     * Initializes the optional value {@link Consent#policyRule() policyRule} to policyRule.
     * @param policyRule The value for policyRule
     * @return {@code this} builder for chained invocation
     */
    BuildFinal policyRule(com.fhir.CodeableConcept policyRule);

    /**
     * Initializes the optional value {@link Consent#policyRule() policyRule} to policyRule.
     * @param policyRule The value for policyRule
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal policyRule(java.util.Optional<? extends com.fhir.CodeableConcept> policyRule);

    /**
     * Initializes the optional value {@link Consent#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for chained invocation
     */
    BuildFinal patient(com.fhir.Reference patient);

    /**
     * Initializes the optional value {@link Consent#patient() patient} to patient.
     * @param patient The value for patient
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal patient(java.util.Optional<? extends com.fhir.Reference> patient);

    /**
     * Initializes the optional value {@link Consent#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Consent#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Consent#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Consent#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Consent#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for chained invocation
     */
    BuildFinal performer(java.util.List<com.fhir.Reference> performer);

    /**
     * Initializes the optional value {@link Consent#performer() performer} to performer.
     * @param performer The value for performer
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal performer(java.util.Optional<? extends java.util.List<com.fhir.Reference>> performer);

    /**
     * Builds a new {@link Consent Consent}.
     * @return An immutable instance of Consent
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Consent build();
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

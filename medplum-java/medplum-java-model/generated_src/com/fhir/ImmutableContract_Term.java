//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Contract_Term}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableContract_Term.builder()}.
 */
@org.immutables.value.Generated(from = "Contract_Term", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableContract_Term implements com.fhir.Contract_Term {
  private final @javax.annotation.Nullable com.fhir.dateTime issued;
  private final com.fhir.Contract_Offer offer;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept subType;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept type;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Contract_Term> group;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept topicCodeableConcept;
  private final @javax.annotation.Nullable com.fhir.Reference topicReference;
  private final @javax.annotation.Nullable com.fhir.Period applies;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Contract_Action> action;
  private final @javax.annotation.Nullable java.lang.String text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.Identifier identifier;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Contract_SecurityLabel> securityLabel;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Contract_Asset> asset;

  private ImmutableContract_Term(
      @javax.annotation.Nullable com.fhir.dateTime issued,
      com.fhir.Contract_Offer offer,
      @javax.annotation.Nullable com.fhir.CodeableConcept subType,
      @javax.annotation.Nullable com.fhir.CodeableConcept type,
      @javax.annotation.Nullable java.util.List<com.fhir.Contract_Term> group,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.CodeableConcept topicCodeableConcept,
      @javax.annotation.Nullable com.fhir.Reference topicReference,
      @javax.annotation.Nullable com.fhir.Period applies,
      @javax.annotation.Nullable java.util.List<com.fhir.Contract_Action> action,
      @javax.annotation.Nullable java.lang.String text,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.Identifier identifier,
      @javax.annotation.Nullable java.util.List<com.fhir.Contract_SecurityLabel> securityLabel,
      @javax.annotation.Nullable java.util.List<com.fhir.Contract_Asset> asset) {
    this.issued = issued;
    this.offer = offer;
    this.subType = subType;
    this.type = type;
    this.group = group;
    this.id = id;
    this.topicCodeableConcept = topicCodeableConcept;
    this.topicReference = topicReference;
    this.applies = applies;
    this.action = action;
    this.text = text;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.identifier = identifier;
    this.securityLabel = securityLabel;
    this.asset = asset;
  }

  /**
   * @return The value of the {@code issued} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("issued")
  @Override
  public java.util.Optional<com.fhir.dateTime> issued() {
    return java.util.Optional.ofNullable(issued);
  }

  /**
   * @return The value of the {@code offer} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("offer")
  @Override
  public com.fhir.Contract_Offer offer() {
    return offer;
  }

  /**
   * @return The value of the {@code subType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subType")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> subType() {
    return java.util.Optional.ofNullable(subType);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code group} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("group")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Contract_Term>> group() {
    return java.util.Optional.ofNullable(group);
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
   * @return The value of the {@code topicCodeableConcept} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("topicCodeableConcept")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> topicCodeableConcept() {
    return java.util.Optional.ofNullable(topicCodeableConcept);
  }

  /**
   * @return The value of the {@code topicReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("topicReference")
  @Override
  public java.util.Optional<com.fhir.Reference> topicReference() {
    return java.util.Optional.ofNullable(topicReference);
  }

  /**
   * @return The value of the {@code applies} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("applies")
  @Override
  public java.util.Optional<com.fhir.Period> applies() {
    return java.util.Optional.ofNullable(applies);
  }

  /**
   * @return The value of the {@code action} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("action")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Contract_Action>> action() {
    return java.util.Optional.ofNullable(action);
  }

  /**
   * @return The value of the {@code text} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("text")
  @Override
  public java.util.Optional<java.lang.String> text() {
    return java.util.Optional.ofNullable(text);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<com.fhir.Identifier> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code securityLabel} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("securityLabel")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Contract_SecurityLabel>> securityLabel() {
    return java.util.Optional.ofNullable(securityLabel);
  }

  /**
   * @return The value of the {@code asset} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("asset")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Contract_Asset>> asset() {
    return java.util.Optional.ofNullable(asset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Term#issued() issued} attribute.
   * @param value The value for issued
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withIssued(com.fhir.dateTime value) {
    @javax.annotation.Nullable com.fhir.dateTime newValue = java.util.Objects.requireNonNull(value, "issued");
    if (this.issued == newValue) return this;
    return new ImmutableContract_Term(
        newValue,
        this.offer,
        this.subType,
        this.type,
        this.group,
        this.id,
        this.topicCodeableConcept,
        this.topicReference,
        this.applies,
        this.action,
        this.text,
        this.extension,
        this.modifierExtension,
        this.identifier,
        this.securityLabel,
        this.asset);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Term#issued() issued} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for issued
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Term withIssued(java.util.Optional<? extends com.fhir.dateTime> optional) {
    @javax.annotation.Nullable com.fhir.dateTime value = optional.orElse(null);
    if (this.issued == value) return this;
    return new ImmutableContract_Term(
        value,
        this.offer,
        this.subType,
        this.type,
        this.group,
        this.id,
        this.topicCodeableConcept,
        this.topicReference,
        this.applies,
        this.action,
        this.text,
        this.extension,
        this.modifierExtension,
        this.identifier,
        this.securityLabel,
        this.asset);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Contract_Term#offer() offer} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for offer
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableContract_Term withOffer(com.fhir.Contract_Offer value) {
    if (this.offer == value) return this;
    com.fhir.Contract_Offer newValue = java.util.Objects.requireNonNull(value, "offer");
    return new ImmutableContract_Term(
        this.issued,
        newValue,
        this.subType,
        this.type,
        this.group,
        this.id,
        this.topicCodeableConcept,
        this.topicReference,
        this.applies,
        this.action,
        this.text,
        this.extension,
        this.modifierExtension,
        this.identifier,
        this.securityLabel,
        this.asset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Term#subType() subType} attribute.
   * @param value The value for subType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withSubType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "subType");
    if (this.subType == newValue) return this;
    return new ImmutableContract_Term(
        this.issued,
        this.offer,
        newValue,
        this.type,
        this.group,
        this.id,
        this.topicCodeableConcept,
        this.topicReference,
        this.applies,
        this.action,
        this.text,
        this.extension,
        this.modifierExtension,
        this.identifier,
        this.securityLabel,
        this.asset);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Term#subType() subType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Term withSubType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.subType == value) return this;
    return new ImmutableContract_Term(
        this.issued,
        this.offer,
        value,
        this.type,
        this.group,
        this.id,
        this.topicCodeableConcept,
        this.topicReference,
        this.applies,
        this.action,
        this.text,
        this.extension,
        this.modifierExtension,
        this.identifier,
        this.securityLabel,
        this.asset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Term#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableContract_Term(
        this.issued,
        this.offer,
        this.subType,
        newValue,
        this.group,
        this.id,
        this.topicCodeableConcept,
        this.topicReference,
        this.applies,
        this.action,
        this.text,
        this.extension,
        this.modifierExtension,
        this.identifier,
        this.securityLabel,
        this.asset);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Term#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Term withType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableContract_Term(
        this.issued,
        this.offer,
        this.subType,
        value,
        this.group,
        this.id,
        this.topicCodeableConcept,
        this.topicReference,
        this.applies,
        this.action,
        this.text,
        this.extension,
        this.modifierExtension,
        this.identifier,
        this.securityLabel,
        this.asset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Term#group() group} attribute.
   * @param value The value for group
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withGroup(java.util.List<com.fhir.Contract_Term> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Contract_Term> newValue = java.util.Objects.requireNonNull(value, "group");
    if (this.group == newValue) return this;
    return new ImmutableContract_Term(
        this.issued,
        this.offer,
        this.subType,
        this.type,
        newValue,
        this.id,
        this.topicCodeableConcept,
        this.topicReference,
        this.applies,
        this.action,
        this.text,
        this.extension,
        this.modifierExtension,
        this.identifier,
        this.securityLabel,
        this.asset);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Term#group() group} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for group
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Term withGroup(java.util.Optional<? extends java.util.List<com.fhir.Contract_Term>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Contract_Term> value = optional.orElse(null);
    if (this.group == value) return this;
    return new ImmutableContract_Term(
        this.issued,
        this.offer,
        this.subType,
        this.type,
        value,
        this.id,
        this.topicCodeableConcept,
        this.topicReference,
        this.applies,
        this.action,
        this.text,
        this.extension,
        this.modifierExtension,
        this.identifier,
        this.securityLabel,
        this.asset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Term#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableContract_Term(
        this.issued,
        this.offer,
        this.subType,
        this.type,
        this.group,
        newValue,
        this.topicCodeableConcept,
        this.topicReference,
        this.applies,
        this.action,
        this.text,
        this.extension,
        this.modifierExtension,
        this.identifier,
        this.securityLabel,
        this.asset);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Term#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableContract_Term(
        this.issued,
        this.offer,
        this.subType,
        this.type,
        this.group,
        value,
        this.topicCodeableConcept,
        this.topicReference,
        this.applies,
        this.action,
        this.text,
        this.extension,
        this.modifierExtension,
        this.identifier,
        this.securityLabel,
        this.asset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Term#topicCodeableConcept() topicCodeableConcept} attribute.
   * @param value The value for topicCodeableConcept
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withTopicCodeableConcept(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "topicCodeableConcept");
    if (this.topicCodeableConcept == newValue) return this;
    return new ImmutableContract_Term(
        this.issued,
        this.offer,
        this.subType,
        this.type,
        this.group,
        this.id,
        newValue,
        this.topicReference,
        this.applies,
        this.action,
        this.text,
        this.extension,
        this.modifierExtension,
        this.identifier,
        this.securityLabel,
        this.asset);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Term#topicCodeableConcept() topicCodeableConcept} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for topicCodeableConcept
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Term withTopicCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.topicCodeableConcept == value) return this;
    return new ImmutableContract_Term(
        this.issued,
        this.offer,
        this.subType,
        this.type,
        this.group,
        this.id,
        value,
        this.topicReference,
        this.applies,
        this.action,
        this.text,
        this.extension,
        this.modifierExtension,
        this.identifier,
        this.securityLabel,
        this.asset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Term#topicReference() topicReference} attribute.
   * @param value The value for topicReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withTopicReference(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "topicReference");
    if (this.topicReference == newValue) return this;
    return new ImmutableContract_Term(
        this.issued,
        this.offer,
        this.subType,
        this.type,
        this.group,
        this.id,
        this.topicCodeableConcept,
        newValue,
        this.applies,
        this.action,
        this.text,
        this.extension,
        this.modifierExtension,
        this.identifier,
        this.securityLabel,
        this.asset);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Term#topicReference() topicReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for topicReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Term withTopicReference(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.topicReference == value) return this;
    return new ImmutableContract_Term(
        this.issued,
        this.offer,
        this.subType,
        this.type,
        this.group,
        this.id,
        this.topicCodeableConcept,
        value,
        this.applies,
        this.action,
        this.text,
        this.extension,
        this.modifierExtension,
        this.identifier,
        this.securityLabel,
        this.asset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Term#applies() applies} attribute.
   * @param value The value for applies
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withApplies(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "applies");
    if (this.applies == newValue) return this;
    return new ImmutableContract_Term(
        this.issued,
        this.offer,
        this.subType,
        this.type,
        this.group,
        this.id,
        this.topicCodeableConcept,
        this.topicReference,
        newValue,
        this.action,
        this.text,
        this.extension,
        this.modifierExtension,
        this.identifier,
        this.securityLabel,
        this.asset);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Term#applies() applies} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for applies
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Term withApplies(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.applies == value) return this;
    return new ImmutableContract_Term(
        this.issued,
        this.offer,
        this.subType,
        this.type,
        this.group,
        this.id,
        this.topicCodeableConcept,
        this.topicReference,
        value,
        this.action,
        this.text,
        this.extension,
        this.modifierExtension,
        this.identifier,
        this.securityLabel,
        this.asset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Term#action() action} attribute.
   * @param value The value for action
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withAction(java.util.List<com.fhir.Contract_Action> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Contract_Action> newValue = java.util.Objects.requireNonNull(value, "action");
    if (this.action == newValue) return this;
    return new ImmutableContract_Term(
        this.issued,
        this.offer,
        this.subType,
        this.type,
        this.group,
        this.id,
        this.topicCodeableConcept,
        this.topicReference,
        this.applies,
        newValue,
        this.text,
        this.extension,
        this.modifierExtension,
        this.identifier,
        this.securityLabel,
        this.asset);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Term#action() action} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for action
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Term withAction(java.util.Optional<? extends java.util.List<com.fhir.Contract_Action>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Contract_Action> value = optional.orElse(null);
    if (this.action == value) return this;
    return new ImmutableContract_Term(
        this.issued,
        this.offer,
        this.subType,
        this.type,
        this.group,
        this.id,
        this.topicCodeableConcept,
        this.topicReference,
        this.applies,
        value,
        this.text,
        this.extension,
        this.modifierExtension,
        this.identifier,
        this.securityLabel,
        this.asset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Term#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withText(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "text");
    if (java.util.Objects.equals(this.text, newValue)) return this;
    return new ImmutableContract_Term(
        this.issued,
        this.offer,
        this.subType,
        this.type,
        this.group,
        this.id,
        this.topicCodeableConcept,
        this.topicReference,
        this.applies,
        this.action,
        newValue,
        this.extension,
        this.modifierExtension,
        this.identifier,
        this.securityLabel,
        this.asset);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Term#text() text} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withText(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.text, value)) return this;
    return new ImmutableContract_Term(
        this.issued,
        this.offer,
        this.subType,
        this.type,
        this.group,
        this.id,
        this.topicCodeableConcept,
        this.topicReference,
        this.applies,
        this.action,
        value,
        this.extension,
        this.modifierExtension,
        this.identifier,
        this.securityLabel,
        this.asset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Term#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableContract_Term(
        this.issued,
        this.offer,
        this.subType,
        this.type,
        this.group,
        this.id,
        this.topicCodeableConcept,
        this.topicReference,
        this.applies,
        this.action,
        this.text,
        newValue,
        this.modifierExtension,
        this.identifier,
        this.securityLabel,
        this.asset);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Term#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Term withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableContract_Term(
        this.issued,
        this.offer,
        this.subType,
        this.type,
        this.group,
        this.id,
        this.topicCodeableConcept,
        this.topicReference,
        this.applies,
        this.action,
        this.text,
        value,
        this.modifierExtension,
        this.identifier,
        this.securityLabel,
        this.asset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Term#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableContract_Term(
        this.issued,
        this.offer,
        this.subType,
        this.type,
        this.group,
        this.id,
        this.topicCodeableConcept,
        this.topicReference,
        this.applies,
        this.action,
        this.text,
        this.extension,
        newValue,
        this.identifier,
        this.securityLabel,
        this.asset);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Term#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Term withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableContract_Term(
        this.issued,
        this.offer,
        this.subType,
        this.type,
        this.group,
        this.id,
        this.topicCodeableConcept,
        this.topicReference,
        this.applies,
        this.action,
        this.text,
        this.extension,
        value,
        this.identifier,
        this.securityLabel,
        this.asset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Term#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withIdentifier(com.fhir.Identifier value) {
    @javax.annotation.Nullable com.fhir.Identifier newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableContract_Term(
        this.issued,
        this.offer,
        this.subType,
        this.type,
        this.group,
        this.id,
        this.topicCodeableConcept,
        this.topicReference,
        this.applies,
        this.action,
        this.text,
        this.extension,
        this.modifierExtension,
        newValue,
        this.securityLabel,
        this.asset);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Term#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Term withIdentifier(java.util.Optional<? extends com.fhir.Identifier> optional) {
    @javax.annotation.Nullable com.fhir.Identifier value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableContract_Term(
        this.issued,
        this.offer,
        this.subType,
        this.type,
        this.group,
        this.id,
        this.topicCodeableConcept,
        this.topicReference,
        this.applies,
        this.action,
        this.text,
        this.extension,
        this.modifierExtension,
        value,
        this.securityLabel,
        this.asset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Term#securityLabel() securityLabel} attribute.
   * @param value The value for securityLabel
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withSecurityLabel(java.util.List<com.fhir.Contract_SecurityLabel> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Contract_SecurityLabel> newValue = java.util.Objects.requireNonNull(value, "securityLabel");
    if (this.securityLabel == newValue) return this;
    return new ImmutableContract_Term(
        this.issued,
        this.offer,
        this.subType,
        this.type,
        this.group,
        this.id,
        this.topicCodeableConcept,
        this.topicReference,
        this.applies,
        this.action,
        this.text,
        this.extension,
        this.modifierExtension,
        this.identifier,
        newValue,
        this.asset);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Term#securityLabel() securityLabel} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for securityLabel
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Term withSecurityLabel(java.util.Optional<? extends java.util.List<com.fhir.Contract_SecurityLabel>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Contract_SecurityLabel> value = optional.orElse(null);
    if (this.securityLabel == value) return this;
    return new ImmutableContract_Term(
        this.issued,
        this.offer,
        this.subType,
        this.type,
        this.group,
        this.id,
        this.topicCodeableConcept,
        this.topicReference,
        this.applies,
        this.action,
        this.text,
        this.extension,
        this.modifierExtension,
        this.identifier,
        value,
        this.asset);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Contract_Term#asset() asset} attribute.
   * @param value The value for asset
   * @return A modified copy of {@code this} object
   */
  public final ImmutableContract_Term withAsset(java.util.List<com.fhir.Contract_Asset> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Contract_Asset> newValue = java.util.Objects.requireNonNull(value, "asset");
    if (this.asset == newValue) return this;
    return new ImmutableContract_Term(
        this.issued,
        this.offer,
        this.subType,
        this.type,
        this.group,
        this.id,
        this.topicCodeableConcept,
        this.topicReference,
        this.applies,
        this.action,
        this.text,
        this.extension,
        this.modifierExtension,
        this.identifier,
        this.securityLabel,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Contract_Term#asset() asset} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for asset
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableContract_Term withAsset(java.util.Optional<? extends java.util.List<com.fhir.Contract_Asset>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Contract_Asset> value = optional.orElse(null);
    if (this.asset == value) return this;
    return new ImmutableContract_Term(
        this.issued,
        this.offer,
        this.subType,
        this.type,
        this.group,
        this.id,
        this.topicCodeableConcept,
        this.topicReference,
        this.applies,
        this.action,
        this.text,
        this.extension,
        this.modifierExtension,
        this.identifier,
        this.securityLabel,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableContract_Term} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableContract_Term
        && equalTo((ImmutableContract_Term) another);
  }

  private boolean equalTo(ImmutableContract_Term another) {
    return java.util.Objects.equals(issued, another.issued)
        && offer.equals(another.offer)
        && java.util.Objects.equals(subType, another.subType)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(group, another.group)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(topicCodeableConcept, another.topicCodeableConcept)
        && java.util.Objects.equals(topicReference, another.topicReference)
        && java.util.Objects.equals(applies, another.applies)
        && java.util.Objects.equals(action, another.action)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(securityLabel, another.securityLabel)
        && java.util.Objects.equals(asset, another.asset);
  }

  /**
   * Computes a hash code from attributes: {@code issued}, {@code offer}, {@code subType}, {@code type}, {@code group}, {@code id}, {@code topicCodeableConcept}, {@code topicReference}, {@code applies}, {@code action}, {@code text}, {@code extension}, {@code modifierExtension}, {@code identifier}, {@code securityLabel}, {@code asset}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(issued);
    h += (h << 5) + offer.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(subType);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(group);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(topicCodeableConcept);
    h += (h << 5) + java.util.Objects.hashCode(topicReference);
    h += (h << 5) + java.util.Objects.hashCode(applies);
    h += (h << 5) + java.util.Objects.hashCode(action);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(securityLabel);
    h += (h << 5) + java.util.Objects.hashCode(asset);
    return h;
  }

  /**
   * Prints the immutable value {@code Contract_Term} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Contract_Term{");
    if (issued != null) {
      builder.append("issued=").append(issued);
    }
    if (builder.length() > 14) builder.append(", ");
    builder.append("offer=").append(offer);
    if (subType != null) {
      builder.append(", ");
      builder.append("subType=").append(subType);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    if (group != null) {
      builder.append(", ");
      builder.append("group=").append(group);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (topicCodeableConcept != null) {
      builder.append(", ");
      builder.append("topicCodeableConcept=").append(topicCodeableConcept);
    }
    if (topicReference != null) {
      builder.append(", ");
      builder.append("topicReference=").append(topicReference);
    }
    if (applies != null) {
      builder.append(", ");
      builder.append("applies=").append(applies);
    }
    if (action != null) {
      builder.append(", ");
      builder.append("action=").append(action);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (securityLabel != null) {
      builder.append(", ");
      builder.append("securityLabel=").append(securityLabel);
    }
    if (asset != null) {
      builder.append(", ");
      builder.append("asset=").append(asset);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Contract_Term", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Contract_Term {
    @javax.annotation.Nullable java.util.Optional<com.fhir.dateTime> issued = java.util.Optional.empty();
    boolean issuedIsSet;
    @javax.annotation.Nullable com.fhir.Contract_Offer offer;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> subType = java.util.Optional.empty();
    boolean subTypeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Contract_Term>> group = java.util.Optional.empty();
    boolean groupIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> topicCodeableConcept = java.util.Optional.empty();
    boolean topicCodeableConceptIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> topicReference = java.util.Optional.empty();
    boolean topicReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> applies = java.util.Optional.empty();
    boolean appliesIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Contract_Action>> action = java.util.Optional.empty();
    boolean actionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Identifier> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Contract_SecurityLabel>> securityLabel = java.util.Optional.empty();
    boolean securityLabelIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Contract_Asset>> asset = java.util.Optional.empty();
    boolean assetIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("issued")
    public void setIssued(java.util.Optional<com.fhir.dateTime> issued) {
      this.issued = issued;
      this.issuedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("offer")
    public void setOffer(com.fhir.Contract_Offer offer) {
      this.offer = offer;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("subType")
    public void setSubType(java.util.Optional<com.fhir.CodeableConcept> subType) {
      this.subType = subType;
      this.subTypeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("group")
    public void setGroup(java.util.Optional<java.util.List<com.fhir.Contract_Term>> group) {
      this.group = group;
      this.groupIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("topicCodeableConcept")
    public void setTopicCodeableConcept(java.util.Optional<com.fhir.CodeableConcept> topicCodeableConcept) {
      this.topicCodeableConcept = topicCodeableConcept;
      this.topicCodeableConceptIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("topicReference")
    public void setTopicReference(java.util.Optional<com.fhir.Reference> topicReference) {
      this.topicReference = topicReference;
      this.topicReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("applies")
    public void setApplies(java.util.Optional<com.fhir.Period> applies) {
      this.applies = applies;
      this.appliesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    public void setAction(java.util.Optional<java.util.List<com.fhir.Contract_Action>> action) {
      this.action = action;
      this.actionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<java.lang.String> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<com.fhir.Identifier> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("securityLabel")
    public void setSecurityLabel(java.util.Optional<java.util.List<com.fhir.Contract_SecurityLabel>> securityLabel) {
      this.securityLabel = securityLabel;
      this.securityLabelIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("asset")
    public void setAsset(java.util.Optional<java.util.List<com.fhir.Contract_Asset>> asset) {
      this.asset = asset;
      this.assetIsSet = true;
    }
    @Override
    public java.util.Optional<com.fhir.dateTime> issued() { throw new UnsupportedOperationException(); }
    @Override
    public com.fhir.Contract_Offer offer() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> subType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Contract_Term>> group() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> topicCodeableConcept() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> topicReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> applies() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Contract_Action>> action() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Identifier> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Contract_SecurityLabel>> securityLabel() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Contract_Asset>> asset() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableContract_Term fromJson(Json json) {
    ImmutableContract_Term.Builder builder = ((ImmutableContract_Term.Builder) ImmutableContract_Term.builder());
    if (json.issuedIsSet) {
      builder.issued(json.issued);
    }
    if (json.offer != null) {
      builder.offer(json.offer);
    }
    if (json.subTypeIsSet) {
      builder.subType(json.subType);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.groupIsSet) {
      builder.group(json.group);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.topicCodeableConceptIsSet) {
      builder.topicCodeableConcept(json.topicCodeableConcept);
    }
    if (json.topicReferenceIsSet) {
      builder.topicReference(json.topicReference);
    }
    if (json.appliesIsSet) {
      builder.applies(json.applies);
    }
    if (json.actionIsSet) {
      builder.action(json.action);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.securityLabelIsSet) {
      builder.securityLabel(json.securityLabel);
    }
    if (json.assetIsSet) {
      builder.asset(json.asset);
    }
    return (ImmutableContract_Term) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Contract_Term} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Contract_Term instance
   */
  public static Contract_Term copyOf(Contract_Term instance) {
    if (instance instanceof ImmutableContract_Term) {
      return (ImmutableContract_Term) instance;
    }
    return ((ImmutableContract_Term.Builder) ImmutableContract_Term.builder())
        .issued(instance.issued())
        .offer(instance.offer())
        .subType(instance.subType())
        .type(instance.type())
        .group(instance.group())
        .id(instance.id())
        .topicCodeableConcept(instance.topicCodeableConcept())
        .topicReference(instance.topicReference())
        .applies(instance.applies())
        .action(instance.action())
        .text(instance.text())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .identifier(instance.identifier())
        .securityLabel(instance.securityLabel())
        .asset(instance.asset())
        .build();
  }

  /**
   * Creates a builder for {@link Contract_Term Contract_Term}.
   * <pre>
   * ImmutableContract_Term.builder()
   *    .issued(com.fhir.dateTime) // optional {@link Contract_Term#issued() issued}
   *    .offer(com.fhir.Contract_Offer) // required {@link Contract_Term#offer() offer}
   *    .subType(com.fhir.CodeableConcept) // optional {@link Contract_Term#subType() subType}
   *    .type(com.fhir.CodeableConcept) // optional {@link Contract_Term#type() type}
   *    .group(List&amp;lt;com.fhir.Contract_Term&amp;gt;) // optional {@link Contract_Term#group() group}
   *    .id(String) // optional {@link Contract_Term#id() id}
   *    .topicCodeableConcept(com.fhir.CodeableConcept) // optional {@link Contract_Term#topicCodeableConcept() topicCodeableConcept}
   *    .topicReference(com.fhir.Reference) // optional {@link Contract_Term#topicReference() topicReference}
   *    .applies(com.fhir.Period) // optional {@link Contract_Term#applies() applies}
   *    .action(List&amp;lt;com.fhir.Contract_Action&amp;gt;) // optional {@link Contract_Term#action() action}
   *    .text(String) // optional {@link Contract_Term#text() text}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Contract_Term#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Contract_Term#modifierExtension() modifierExtension}
   *    .identifier(com.fhir.Identifier) // optional {@link Contract_Term#identifier() identifier}
   *    .securityLabel(List&amp;lt;com.fhir.Contract_SecurityLabel&amp;gt;) // optional {@link Contract_Term#securityLabel() securityLabel}
   *    .asset(List&amp;lt;com.fhir.Contract_Asset&amp;gt;) // optional {@link Contract_Term#asset() asset}
   *    .build();
   * </pre>
   * @return A new Contract_Term builder
   */
  public static OfferBuildStage builder() {
    return new ImmutableContract_Term.Builder();
  }

  /**
   * Builds instances of type {@link Contract_Term Contract_Term}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Contract_Term", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements OfferBuildStage, BuildFinal {
    private static final long INIT_BIT_OFFER = 0x1L;
    private static final long OPT_BIT_ISSUED = 0x1L;
    private static final long OPT_BIT_SUB_TYPE = 0x2L;
    private static final long OPT_BIT_TYPE = 0x4L;
    private static final long OPT_BIT_GROUP = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_TOPIC_CODEABLE_CONCEPT = 0x20L;
    private static final long OPT_BIT_TOPIC_REFERENCE = 0x40L;
    private static final long OPT_BIT_APPLIES = 0x80L;
    private static final long OPT_BIT_ACTION = 0x100L;
    private static final long OPT_BIT_TEXT = 0x200L;
    private static final long OPT_BIT_EXTENSION = 0x400L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x800L;
    private static final long OPT_BIT_IDENTIFIER = 0x1000L;
    private static final long OPT_BIT_SECURITY_LABEL = 0x2000L;
    private static final long OPT_BIT_ASSET = 0x4000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.dateTime issued;
    private @javax.annotation.Nullable com.fhir.Contract_Offer offer;
    private @javax.annotation.Nullable com.fhir.CodeableConcept subType;
    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable java.util.List<com.fhir.Contract_Term> group;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.CodeableConcept topicCodeableConcept;
    private @javax.annotation.Nullable com.fhir.Reference topicReference;
    private @javax.annotation.Nullable com.fhir.Period applies;
    private @javax.annotation.Nullable java.util.List<com.fhir.Contract_Action> action;
    private @javax.annotation.Nullable java.lang.String text;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.Identifier identifier;
    private @javax.annotation.Nullable java.util.List<com.fhir.Contract_SecurityLabel> securityLabel;
    private @javax.annotation.Nullable java.util.List<com.fhir.Contract_Asset> asset;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Contract_Term#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for chained invocation
     */
    public final Builder issued(com.fhir.dateTime issued) {
      checkNotIsSet(issuedIsSet(), "issued");
      this.issued = java.util.Objects.requireNonNull(issued, "issued");
      optBits |= OPT_BIT_ISSUED;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("issued")
    public final Builder issued(java.util.Optional<? extends com.fhir.dateTime> issued) {
      checkNotIsSet(issuedIsSet(), "issued");
      this.issued = issued.orElse(null);
      optBits |= OPT_BIT_ISSUED;
      return this;
    }

    /**
     * Initializes the value for the {@link Contract_Term#offer() offer} attribute.
     * @param offer The value for offer 
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("offer")
    public final Builder offer(com.fhir.Contract_Offer offer) {
      checkNotIsSet(offerIsSet(), "offer");
      this.offer = java.util.Objects.requireNonNull(offer, "offer");
      initBits &= ~INIT_BIT_OFFER;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for chained invocation
     */
    public final Builder subType(com.fhir.CodeableConcept subType) {
      checkNotIsSet(subTypeIsSet(), "subType");
      this.subType = java.util.Objects.requireNonNull(subType, "subType");
      optBits |= OPT_BIT_SUB_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subType")
    public final Builder subType(java.util.Optional<? extends com.fhir.CodeableConcept> subType) {
      checkNotIsSet(subTypeIsSet(), "subType");
      this.subType = subType.orElse(null);
      optBits |= OPT_BIT_SUB_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.CodeableConcept> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#group() group} to group.
     * @param group The value for group
     * @return {@code this} builder for chained invocation
     */
    public final Builder group(java.util.List<com.fhir.Contract_Term> group) {
      checkNotIsSet(groupIsSet(), "group");
      this.group = java.util.Objects.requireNonNull(group, "group");
      optBits |= OPT_BIT_GROUP;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#group() group} to group.
     * @param group The value for group
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("group")
    public final Builder group(java.util.Optional<? extends java.util.List<com.fhir.Contract_Term>> group) {
      checkNotIsSet(groupIsSet(), "group");
      this.group = group.orElse(null);
      optBits |= OPT_BIT_GROUP;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#id() id} to id.
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
     * Initializes the optional value {@link Contract_Term#id() id} to id.
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
     * Initializes the optional value {@link Contract_Term#topicCodeableConcept() topicCodeableConcept} to topicCodeableConcept.
     * @param topicCodeableConcept The value for topicCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    public final Builder topicCodeableConcept(com.fhir.CodeableConcept topicCodeableConcept) {
      checkNotIsSet(topicCodeableConceptIsSet(), "topicCodeableConcept");
      this.topicCodeableConcept = java.util.Objects.requireNonNull(topicCodeableConcept, "topicCodeableConcept");
      optBits |= OPT_BIT_TOPIC_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#topicCodeableConcept() topicCodeableConcept} to topicCodeableConcept.
     * @param topicCodeableConcept The value for topicCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("topicCodeableConcept")
    public final Builder topicCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> topicCodeableConcept) {
      checkNotIsSet(topicCodeableConceptIsSet(), "topicCodeableConcept");
      this.topicCodeableConcept = topicCodeableConcept.orElse(null);
      optBits |= OPT_BIT_TOPIC_CODEABLE_CONCEPT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#topicReference() topicReference} to topicReference.
     * @param topicReference The value for topicReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder topicReference(com.fhir.Reference topicReference) {
      checkNotIsSet(topicReferenceIsSet(), "topicReference");
      this.topicReference = java.util.Objects.requireNonNull(topicReference, "topicReference");
      optBits |= OPT_BIT_TOPIC_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#topicReference() topicReference} to topicReference.
     * @param topicReference The value for topicReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("topicReference")
    public final Builder topicReference(java.util.Optional<? extends com.fhir.Reference> topicReference) {
      checkNotIsSet(topicReferenceIsSet(), "topicReference");
      this.topicReference = topicReference.orElse(null);
      optBits |= OPT_BIT_TOPIC_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#applies() applies} to applies.
     * @param applies The value for applies
     * @return {@code this} builder for chained invocation
     */
    public final Builder applies(com.fhir.Period applies) {
      checkNotIsSet(appliesIsSet(), "applies");
      this.applies = java.util.Objects.requireNonNull(applies, "applies");
      optBits |= OPT_BIT_APPLIES;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#applies() applies} to applies.
     * @param applies The value for applies
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("applies")
    public final Builder applies(java.util.Optional<? extends com.fhir.Period> applies) {
      checkNotIsSet(appliesIsSet(), "applies");
      this.applies = applies.orElse(null);
      optBits |= OPT_BIT_APPLIES;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for chained invocation
     */
    public final Builder action(java.util.List<com.fhir.Contract_Action> action) {
      checkNotIsSet(actionIsSet(), "action");
      this.action = java.util.Objects.requireNonNull(action, "action");
      optBits |= OPT_BIT_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    public final Builder action(java.util.Optional<? extends java.util.List<com.fhir.Contract_Action>> action) {
      checkNotIsSet(actionIsSet(), "action");
      this.action = action.orElse(null);
      optBits |= OPT_BIT_ACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    public final Builder text(java.lang.String text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = java.util.Objects.requireNonNull(text, "text");
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public final Builder text(java.util.Optional<java.lang.String> text) {
      checkNotIsSet(textIsSet(), "text");
      this.text = text.orElse(null);
      optBits |= OPT_BIT_TEXT;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#extension() extension} to extension.
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
     * Initializes the optional value {@link Contract_Term#extension() extension} to extension.
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
     * Initializes the optional value {@link Contract_Term#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Contract_Term#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Contract_Term#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    public final Builder identifier(com.fhir.Identifier identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = java.util.Objects.requireNonNull(identifier, "identifier");
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public final Builder identifier(java.util.Optional<? extends com.fhir.Identifier> identifier) {
      checkNotIsSet(identifierIsSet(), "identifier");
      this.identifier = identifier.orElse(null);
      optBits |= OPT_BIT_IDENTIFIER;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#securityLabel() securityLabel} to securityLabel.
     * @param securityLabel The value for securityLabel
     * @return {@code this} builder for chained invocation
     */
    public final Builder securityLabel(java.util.List<com.fhir.Contract_SecurityLabel> securityLabel) {
      checkNotIsSet(securityLabelIsSet(), "securityLabel");
      this.securityLabel = java.util.Objects.requireNonNull(securityLabel, "securityLabel");
      optBits |= OPT_BIT_SECURITY_LABEL;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#securityLabel() securityLabel} to securityLabel.
     * @param securityLabel The value for securityLabel
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("securityLabel")
    public final Builder securityLabel(java.util.Optional<? extends java.util.List<com.fhir.Contract_SecurityLabel>> securityLabel) {
      checkNotIsSet(securityLabelIsSet(), "securityLabel");
      this.securityLabel = securityLabel.orElse(null);
      optBits |= OPT_BIT_SECURITY_LABEL;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#asset() asset} to asset.
     * @param asset The value for asset
     * @return {@code this} builder for chained invocation
     */
    public final Builder asset(java.util.List<com.fhir.Contract_Asset> asset) {
      checkNotIsSet(assetIsSet(), "asset");
      this.asset = java.util.Objects.requireNonNull(asset, "asset");
      optBits |= OPT_BIT_ASSET;
      return this;
    }

    /**
     * Initializes the optional value {@link Contract_Term#asset() asset} to asset.
     * @param asset The value for asset
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("asset")
    public final Builder asset(java.util.Optional<? extends java.util.List<com.fhir.Contract_Asset>> asset) {
      checkNotIsSet(assetIsSet(), "asset");
      this.asset = asset.orElse(null);
      optBits |= OPT_BIT_ASSET;
      return this;
    }

    /**
     * Builds a new {@link Contract_Term Contract_Term}.
     * @return An immutable instance of Contract_Term
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Contract_Term build() {
      checkRequiredAttributes();
      return new ImmutableContract_Term(
          issued,
          offer,
          subType,
          type,
          group,
          id,
          topicCodeableConcept,
          topicReference,
          applies,
          action,
          text,
          extension,
          modifierExtension,
          identifier,
          securityLabel,
          asset);
    }

    private boolean issuedIsSet() {
      return (optBits & OPT_BIT_ISSUED) != 0;
    }

    private boolean subTypeIsSet() {
      return (optBits & OPT_BIT_SUB_TYPE) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean groupIsSet() {
      return (optBits & OPT_BIT_GROUP) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean topicCodeableConceptIsSet() {
      return (optBits & OPT_BIT_TOPIC_CODEABLE_CONCEPT) != 0;
    }

    private boolean topicReferenceIsSet() {
      return (optBits & OPT_BIT_TOPIC_REFERENCE) != 0;
    }

    private boolean appliesIsSet() {
      return (optBits & OPT_BIT_APPLIES) != 0;
    }

    private boolean actionIsSet() {
      return (optBits & OPT_BIT_ACTION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean securityLabelIsSet() {
      return (optBits & OPT_BIT_SECURITY_LABEL) != 0;
    }

    private boolean assetIsSet() {
      return (optBits & OPT_BIT_ASSET) != 0;
    }

    private boolean offerIsSet() {
      return (initBits & INIT_BIT_OFFER) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Contract_Term is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!offerIsSet()) attributes.add("offer");
      return "Cannot build Contract_Term, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Contract_Term", generator = "Immutables")
  public interface OfferBuildStage {
    /**
     * Initializes the value for the {@link Contract_Term#offer() offer} attribute.
     * @param offer The value for offer 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal offer(com.fhir.Contract_Offer offer);
  }

  @org.immutables.value.Generated(from = "Contract_Term", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Contract_Term#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for chained invocation
     */
    BuildFinal issued(com.fhir.dateTime issued);

    /**
     * Initializes the optional value {@link Contract_Term#issued() issued} to issued.
     * @param issued The value for issued
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal issued(java.util.Optional<? extends com.fhir.dateTime> issued);

    /**
     * Initializes the optional value {@link Contract_Term#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subType(com.fhir.CodeableConcept subType);

    /**
     * Initializes the optional value {@link Contract_Term#subType() subType} to subType.
     * @param subType The value for subType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subType(java.util.Optional<? extends com.fhir.CodeableConcept> subType);

    /**
     * Initializes the optional value {@link Contract_Term#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(com.fhir.CodeableConcept type);

    /**
     * Initializes the optional value {@link Contract_Term#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends com.fhir.CodeableConcept> type);

    /**
     * Initializes the optional value {@link Contract_Term#group() group} to group.
     * @param group The value for group
     * @return {@code this} builder for chained invocation
     */
    BuildFinal group(java.util.List<com.fhir.Contract_Term> group);

    /**
     * Initializes the optional value {@link Contract_Term#group() group} to group.
     * @param group The value for group
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal group(java.util.Optional<? extends java.util.List<com.fhir.Contract_Term>> group);

    /**
     * Initializes the optional value {@link Contract_Term#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(java.lang.String id);

    /**
     * Initializes the optional value {@link Contract_Term#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<java.lang.String> id);

    /**
     * Initializes the optional value {@link Contract_Term#topicCodeableConcept() topicCodeableConcept} to topicCodeableConcept.
     * @param topicCodeableConcept The value for topicCodeableConcept
     * @return {@code this} builder for chained invocation
     */
    BuildFinal topicCodeableConcept(com.fhir.CodeableConcept topicCodeableConcept);

    /**
     * Initializes the optional value {@link Contract_Term#topicCodeableConcept() topicCodeableConcept} to topicCodeableConcept.
     * @param topicCodeableConcept The value for topicCodeableConcept
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal topicCodeableConcept(java.util.Optional<? extends com.fhir.CodeableConcept> topicCodeableConcept);

    /**
     * Initializes the optional value {@link Contract_Term#topicReference() topicReference} to topicReference.
     * @param topicReference The value for topicReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal topicReference(com.fhir.Reference topicReference);

    /**
     * Initializes the optional value {@link Contract_Term#topicReference() topicReference} to topicReference.
     * @param topicReference The value for topicReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal topicReference(java.util.Optional<? extends com.fhir.Reference> topicReference);

    /**
     * Initializes the optional value {@link Contract_Term#applies() applies} to applies.
     * @param applies The value for applies
     * @return {@code this} builder for chained invocation
     */
    BuildFinal applies(com.fhir.Period applies);

    /**
     * Initializes the optional value {@link Contract_Term#applies() applies} to applies.
     * @param applies The value for applies
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal applies(java.util.Optional<? extends com.fhir.Period> applies);

    /**
     * Initializes the optional value {@link Contract_Term#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for chained invocation
     */
    BuildFinal action(java.util.List<com.fhir.Contract_Action> action);

    /**
     * Initializes the optional value {@link Contract_Term#action() action} to action.
     * @param action The value for action
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal action(java.util.Optional<? extends java.util.List<com.fhir.Contract_Action>> action);

    /**
     * Initializes the optional value {@link Contract_Term#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(java.lang.String text);

    /**
     * Initializes the optional value {@link Contract_Term#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<java.lang.String> text);

    /**
     * Initializes the optional value {@link Contract_Term#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Contract_Term#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Contract_Term#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Contract_Term#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Contract_Term#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(com.fhir.Identifier identifier);

    /**
     * Initializes the optional value {@link Contract_Term#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Contract_Term#securityLabel() securityLabel} to securityLabel.
     * @param securityLabel The value for securityLabel
     * @return {@code this} builder for chained invocation
     */
    BuildFinal securityLabel(java.util.List<com.fhir.Contract_SecurityLabel> securityLabel);

    /**
     * Initializes the optional value {@link Contract_Term#securityLabel() securityLabel} to securityLabel.
     * @param securityLabel The value for securityLabel
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal securityLabel(java.util.Optional<? extends java.util.List<com.fhir.Contract_SecurityLabel>> securityLabel);

    /**
     * Initializes the optional value {@link Contract_Term#asset() asset} to asset.
     * @param asset The value for asset
     * @return {@code this} builder for chained invocation
     */
    BuildFinal asset(java.util.List<com.fhir.Contract_Asset> asset);

    /**
     * Initializes the optional value {@link Contract_Term#asset() asset} to asset.
     * @param asset The value for asset
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal asset(java.util.Optional<? extends java.util.List<com.fhir.Contract_Asset>> asset);

    /**
     * Builds a new {@link Contract_Term Contract_Term}.
     * @return An immutable instance of Contract_Term
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Contract_Term build();
  }
}

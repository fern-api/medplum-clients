//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link Account}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAccount.builder()}.
 */
@org.immutables.value.Generated(from = "Account", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableAccount implements com.fhir.Account {
  private final @javax.annotation.Nullable com.fhir.AccountStatus status;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Account_Guarantor> guarantor;
  private final @javax.annotation.Nullable com.fhir.Reference owner;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept type;
  private final @javax.annotation.Nullable com.fhir.Reference partOf;
  private final @javax.annotation.Nullable com.fhir.Period servicePeriod;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable java.lang.String name;
  private final @javax.annotation.Nullable java.lang.String description;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> subject;
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Account_Coverage> coverage;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;

  private ImmutableAccount(
      @javax.annotation.Nullable com.fhir.AccountStatus status,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.Account_Guarantor> guarantor,
      @javax.annotation.Nullable com.fhir.Reference owner,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.CodeableConcept type,
      @javax.annotation.Nullable com.fhir.Reference partOf,
      @javax.annotation.Nullable com.fhir.Period servicePeriod,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      java.lang.String resourceType,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable java.lang.String name,
      @javax.annotation.Nullable java.lang.String description,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> subject,
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.Account_Coverage> coverage,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained) {
    this.status = status;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.guarantor = guarantor;
    this.owner = owner;
    this.identifier = identifier;
    this.type = type;
    this.partOf = partOf;
    this.servicePeriod = servicePeriod;
    this.implicitRules = implicitRules;
    this.resourceType = resourceType;
    this.meta = meta;
    this.name = name;
    this.description = description;
    this.extension = extension;
    this.subject = subject;
    this.language = language;
    this.coverage = coverage;
    this.text = text;
    this.contained = contained;
  }

  /**
   * @return The value of the {@code status} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("status")
  @Override
  public java.util.Optional<com.fhir.AccountStatus> status() {
    return java.util.Optional.ofNullable(status);
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
   * @return The value of the {@code id} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("id")
  @Override
  public java.util.Optional<com.fhir.id> id() {
    return java.util.Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code guarantor} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("guarantor")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Account_Guarantor>> guarantor() {
    return java.util.Optional.ofNullable(guarantor);
  }

  /**
   * @return The value of the {@code owner} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("owner")
  @Override
  public java.util.Optional<com.fhir.Reference> owner() {
    return java.util.Optional.ofNullable(owner);
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
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code partOf} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("partOf")
  @Override
  public java.util.Optional<com.fhir.Reference> partOf() {
    return java.util.Optional.ofNullable(partOf);
  }

  /**
   * @return The value of the {@code servicePeriod} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("servicePeriod")
  @Override
  public java.util.Optional<com.fhir.Period> servicePeriod() {
    return java.util.Optional.ofNullable(servicePeriod);
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
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
   * @return The value of the {@code name} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @Override
  public java.util.Optional<java.lang.String> name() {
    return java.util.Optional.ofNullable(name);
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
   * @return The value of the {@code subject} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("subject")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> subject() {
    return java.util.Optional.ofNullable(subject);
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
   * @return The value of the {@code coverage} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("coverage")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Account_Coverage>> coverage() {
    return java.util.Optional.ofNullable(coverage);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#status() status} attribute.
   * @param value The value for status
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withStatus(com.fhir.AccountStatus value) {
    @javax.annotation.Nullable com.fhir.AccountStatus newValue = java.util.Objects.requireNonNull(value, "status");
    if (this.status == newValue) return this;
    return new ImmutableAccount(
        newValue,
        this.modifierExtension,
        this.id,
        this.guarantor,
        this.owner,
        this.identifier,
        this.type,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        this.meta,
        this.name,
        this.description,
        this.extension,
        this.subject,
        this.language,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#status() status} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for status
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withStatus(java.util.Optional<? extends com.fhir.AccountStatus> optional) {
    @javax.annotation.Nullable com.fhir.AccountStatus value = optional.orElse(null);
    if (this.status == value) return this;
    return new ImmutableAccount(
        value,
        this.modifierExtension,
        this.id,
        this.guarantor,
        this.owner,
        this.identifier,
        this.type,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        this.meta,
        this.name,
        this.description,
        this.extension,
        this.subject,
        this.language,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableAccount(
        this.status,
        newValue,
        this.id,
        this.guarantor,
        this.owner,
        this.identifier,
        this.type,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        this.meta,
        this.name,
        this.description,
        this.extension,
        this.subject,
        this.language,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableAccount(
        this.status,
        value,
        this.id,
        this.guarantor,
        this.owner,
        this.identifier,
        this.type,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        this.meta,
        this.name,
        this.description,
        this.extension,
        this.subject,
        this.language,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        newValue,
        this.guarantor,
        this.owner,
        this.identifier,
        this.type,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        this.meta,
        this.name,
        this.description,
        this.extension,
        this.subject,
        this.language,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        value,
        this.guarantor,
        this.owner,
        this.identifier,
        this.type,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        this.meta,
        this.name,
        this.description,
        this.extension,
        this.subject,
        this.language,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#guarantor() guarantor} attribute.
   * @param value The value for guarantor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withGuarantor(java.util.List<com.fhir.Account_Guarantor> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Account_Guarantor> newValue = java.util.Objects.requireNonNull(value, "guarantor");
    if (this.guarantor == newValue) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        newValue,
        this.owner,
        this.identifier,
        this.type,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        this.meta,
        this.name,
        this.description,
        this.extension,
        this.subject,
        this.language,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#guarantor() guarantor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for guarantor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withGuarantor(java.util.Optional<? extends java.util.List<com.fhir.Account_Guarantor>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Account_Guarantor> value = optional.orElse(null);
    if (this.guarantor == value) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        value,
        this.owner,
        this.identifier,
        this.type,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        this.meta,
        this.name,
        this.description,
        this.extension,
        this.subject,
        this.language,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#owner() owner} attribute.
   * @param value The value for owner
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withOwner(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "owner");
    if (this.owner == newValue) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        this.guarantor,
        newValue,
        this.identifier,
        this.type,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        this.meta,
        this.name,
        this.description,
        this.extension,
        this.subject,
        this.language,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#owner() owner} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for owner
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withOwner(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.owner == value) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        this.guarantor,
        value,
        this.identifier,
        this.type,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        this.meta,
        this.name,
        this.description,
        this.extension,
        this.subject,
        this.language,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        this.guarantor,
        this.owner,
        newValue,
        this.type,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        this.meta,
        this.name,
        this.description,
        this.extension,
        this.subject,
        this.language,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        this.guarantor,
        this.owner,
        value,
        this.type,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        this.meta,
        this.name,
        this.description,
        this.extension,
        this.subject,
        this.language,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        this.guarantor,
        this.owner,
        this.identifier,
        newValue,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        this.meta,
        this.name,
        this.description,
        this.extension,
        this.subject,
        this.language,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        this.guarantor,
        this.owner,
        this.identifier,
        value,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        this.meta,
        this.name,
        this.description,
        this.extension,
        this.subject,
        this.language,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#partOf() partOf} attribute.
   * @param value The value for partOf
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withPartOf(com.fhir.Reference value) {
    @javax.annotation.Nullable com.fhir.Reference newValue = java.util.Objects.requireNonNull(value, "partOf");
    if (this.partOf == newValue) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        this.guarantor,
        this.owner,
        this.identifier,
        this.type,
        newValue,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        this.meta,
        this.name,
        this.description,
        this.extension,
        this.subject,
        this.language,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#partOf() partOf} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for partOf
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withPartOf(java.util.Optional<? extends com.fhir.Reference> optional) {
    @javax.annotation.Nullable com.fhir.Reference value = optional.orElse(null);
    if (this.partOf == value) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        this.guarantor,
        this.owner,
        this.identifier,
        this.type,
        value,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        this.meta,
        this.name,
        this.description,
        this.extension,
        this.subject,
        this.language,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#servicePeriod() servicePeriod} attribute.
   * @param value The value for servicePeriod
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withServicePeriod(com.fhir.Period value) {
    @javax.annotation.Nullable com.fhir.Period newValue = java.util.Objects.requireNonNull(value, "servicePeriod");
    if (this.servicePeriod == newValue) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        this.guarantor,
        this.owner,
        this.identifier,
        this.type,
        this.partOf,
        newValue,
        this.implicitRules,
        this.resourceType,
        this.meta,
        this.name,
        this.description,
        this.extension,
        this.subject,
        this.language,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#servicePeriod() servicePeriod} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for servicePeriod
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withServicePeriod(java.util.Optional<? extends com.fhir.Period> optional) {
    @javax.annotation.Nullable com.fhir.Period value = optional.orElse(null);
    if (this.servicePeriod == value) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        this.guarantor,
        this.owner,
        this.identifier,
        this.type,
        this.partOf,
        value,
        this.implicitRules,
        this.resourceType,
        this.meta,
        this.name,
        this.description,
        this.extension,
        this.subject,
        this.language,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        this.guarantor,
        this.owner,
        this.identifier,
        this.type,
        this.partOf,
        this.servicePeriod,
        newValue,
        this.resourceType,
        this.meta,
        this.name,
        this.description,
        this.extension,
        this.subject,
        this.language,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        this.guarantor,
        this.owner,
        this.identifier,
        this.type,
        this.partOf,
        this.servicePeriod,
        value,
        this.resourceType,
        this.meta,
        this.name,
        this.description,
        this.extension,
        this.subject,
        this.language,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Account#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAccount withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        this.guarantor,
        this.owner,
        this.identifier,
        this.type,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        newValue,
        this.meta,
        this.name,
        this.description,
        this.extension,
        this.subject,
        this.language,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        this.guarantor,
        this.owner,
        this.identifier,
        this.type,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        newValue,
        this.name,
        this.description,
        this.extension,
        this.subject,
        this.language,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        this.guarantor,
        this.owner,
        this.identifier,
        this.type,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        value,
        this.name,
        this.description,
        this.extension,
        this.subject,
        this.language,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withName(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "name");
    if (java.util.Objects.equals(this.name, newValue)) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        this.guarantor,
        this.owner,
        this.identifier,
        this.type,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        this.meta,
        newValue,
        this.description,
        this.extension,
        this.subject,
        this.language,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withName(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.name, value)) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        this.guarantor,
        this.owner,
        this.identifier,
        this.type,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        this.meta,
        value,
        this.description,
        this.extension,
        this.subject,
        this.language,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withDescription(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "description");
    if (java.util.Objects.equals(this.description, newValue)) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        this.guarantor,
        this.owner,
        this.identifier,
        this.type,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        this.meta,
        this.name,
        newValue,
        this.extension,
        this.subject,
        this.language,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withDescription(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.description, value)) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        this.guarantor,
        this.owner,
        this.identifier,
        this.type,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        this.meta,
        this.name,
        value,
        this.extension,
        this.subject,
        this.language,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        this.guarantor,
        this.owner,
        this.identifier,
        this.type,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        this.meta,
        this.name,
        this.description,
        newValue,
        this.subject,
        this.language,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        this.guarantor,
        this.owner,
        this.identifier,
        this.type,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        this.meta,
        this.name,
        this.description,
        value,
        this.subject,
        this.language,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#subject() subject} attribute.
   * @param value The value for subject
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withSubject(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "subject");
    if (this.subject == newValue) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        this.guarantor,
        this.owner,
        this.identifier,
        this.type,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        this.meta,
        this.name,
        this.description,
        this.extension,
        newValue,
        this.language,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#subject() subject} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for subject
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withSubject(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.subject == value) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        this.guarantor,
        this.owner,
        this.identifier,
        this.type,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        this.meta,
        this.name,
        this.description,
        this.extension,
        value,
        this.language,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        this.guarantor,
        this.owner,
        this.identifier,
        this.type,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        this.meta,
        this.name,
        this.description,
        this.extension,
        this.subject,
        newValue,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        this.guarantor,
        this.owner,
        this.identifier,
        this.type,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        this.meta,
        this.name,
        this.description,
        this.extension,
        this.subject,
        value,
        this.coverage,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#coverage() coverage} attribute.
   * @param value The value for coverage
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withCoverage(java.util.List<com.fhir.Account_Coverage> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Account_Coverage> newValue = java.util.Objects.requireNonNull(value, "coverage");
    if (this.coverage == newValue) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        this.guarantor,
        this.owner,
        this.identifier,
        this.type,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        this.meta,
        this.name,
        this.description,
        this.extension,
        this.subject,
        this.language,
        newValue,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#coverage() coverage} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for coverage
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withCoverage(java.util.Optional<? extends java.util.List<com.fhir.Account_Coverage>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Account_Coverage> value = optional.orElse(null);
    if (this.coverage == value) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        this.guarantor,
        this.owner,
        this.identifier,
        this.type,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        this.meta,
        this.name,
        this.description,
        this.extension,
        this.subject,
        this.language,
        value,
        this.text,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        this.guarantor,
        this.owner,
        this.identifier,
        this.type,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        this.meta,
        this.name,
        this.description,
        this.extension,
        this.subject,
        this.language,
        this.coverage,
        newValue,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        this.guarantor,
        this.owner,
        this.identifier,
        this.type,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        this.meta,
        this.name,
        this.description,
        this.extension,
        this.subject,
        this.language,
        this.coverage,
        value,
        this.contained);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Account#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAccount withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        this.guarantor,
        this.owner,
        this.identifier,
        this.type,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        this.meta,
        this.name,
        this.description,
        this.extension,
        this.subject,
        this.language,
        this.coverage,
        this.text,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Account#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAccount withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableAccount(
        this.status,
        this.modifierExtension,
        this.id,
        this.guarantor,
        this.owner,
        this.identifier,
        this.type,
        this.partOf,
        this.servicePeriod,
        this.implicitRules,
        this.resourceType,
        this.meta,
        this.name,
        this.description,
        this.extension,
        this.subject,
        this.language,
        this.coverage,
        this.text,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAccount} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAccount
        && equalTo((ImmutableAccount) another);
  }

  private boolean equalTo(ImmutableAccount another) {
    return java.util.Objects.equals(status, another.status)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(guarantor, another.guarantor)
        && java.util.Objects.equals(owner, another.owner)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(partOf, another.partOf)
        && java.util.Objects.equals(servicePeriod, another.servicePeriod)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(name, another.name)
        && java.util.Objects.equals(description, another.description)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(subject, another.subject)
        && java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(coverage, another.coverage)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(contained, another.contained);
  }

  /**
   * Computes a hash code from attributes: {@code status}, {@code modifierExtension}, {@code id}, {@code guarantor}, {@code owner}, {@code identifier}, {@code type}, {@code partOf}, {@code servicePeriod}, {@code implicitRules}, {@code resourceType}, {@code meta}, {@code name}, {@code description}, {@code extension}, {@code subject}, {@code language}, {@code coverage}, {@code text}, {@code contained}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(status);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(guarantor);
    h += (h << 5) + java.util.Objects.hashCode(owner);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(partOf);
    h += (h << 5) + java.util.Objects.hashCode(servicePeriod);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(name);
    h += (h << 5) + java.util.Objects.hashCode(description);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(subject);
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(coverage);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    return h;
  }

  /**
   * Prints the immutable value {@code Account} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("Account{");
    if (status != null) {
      builder.append("status=").append(status);
    }
    if (modifierExtension != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (guarantor != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("guarantor=").append(guarantor);
    }
    if (owner != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("owner=").append(owner);
    }
    if (identifier != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (type != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (partOf != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("partOf=").append(partOf);
    }
    if (servicePeriod != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("servicePeriod=").append(servicePeriod);
    }
    if (implicitRules != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (builder.length() > 8) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (name != null) {
      builder.append(", ");
      builder.append("name=").append(name);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (subject != null) {
      builder.append(", ");
      builder.append("subject=").append(subject);
    }
    if (language != null) {
      builder.append(", ");
      builder.append("language=").append(language);
    }
    if (coverage != null) {
      builder.append(", ");
      builder.append("coverage=").append(coverage);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "Account", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.Account {
    @javax.annotation.Nullable java.util.Optional<com.fhir.AccountStatus> status = java.util.Optional.empty();
    boolean statusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Account_Guarantor>> guarantor = java.util.Optional.empty();
    boolean guarantorIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> owner = java.util.Optional.empty();
    boolean ownerIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Reference> partOf = java.util.Optional.empty();
    boolean partOfIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Period> servicePeriod = java.util.Optional.empty();
    boolean servicePeriodIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> name = java.util.Optional.empty();
    boolean nameIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> description = java.util.Optional.empty();
    boolean descriptionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> subject = java.util.Optional.empty();
    boolean subjectIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Account_Coverage>> coverage = java.util.Optional.empty();
    boolean coverageIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public void setStatus(java.util.Optional<com.fhir.AccountStatus> status) {
      this.status = status;
      this.statusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("guarantor")
    public void setGuarantor(java.util.Optional<java.util.List<com.fhir.Account_Guarantor>> guarantor) {
      this.guarantor = guarantor;
      this.guarantorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    public void setOwner(java.util.Optional<com.fhir.Reference> owner) {
      this.owner = owner;
      this.ownerIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("partOf")
    public void setPartOf(java.util.Optional<com.fhir.Reference> partOf) {
      this.partOf = partOf;
      this.partOfIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("servicePeriod")
    public void setServicePeriod(java.util.Optional<com.fhir.Period> servicePeriod) {
      this.servicePeriod = servicePeriod;
      this.servicePeriodIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.Optional<java.lang.String> name) {
      this.name = name;
      this.nameIsSet = true;
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
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public void setSubject(java.util.Optional<java.util.List<com.fhir.Reference>> subject) {
      this.subject = subject;
      this.subjectIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("coverage")
    public void setCoverage(java.util.Optional<java.util.List<com.fhir.Account_Coverage>> coverage) {
      this.coverage = coverage;
      this.coverageIsSet = true;
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
    @Override
    public java.util.Optional<com.fhir.AccountStatus> status() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Account_Guarantor>> guarantor() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> owner() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Reference> partOf() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Period> servicePeriod() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> name() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> description() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> subject() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Account_Coverage>> coverage() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableAccount fromJson(Json json) {
    ImmutableAccount.Builder builder = ((ImmutableAccount.Builder) ImmutableAccount.builder());
    if (json.statusIsSet) {
      builder.status(json.status);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.guarantorIsSet) {
      builder.guarantor(json.guarantor);
    }
    if (json.ownerIsSet) {
      builder.owner(json.owner);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.partOfIsSet) {
      builder.partOf(json.partOf);
    }
    if (json.servicePeriodIsSet) {
      builder.servicePeriod(json.servicePeriod);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.subjectIsSet) {
      builder.subject(json.subject);
    }
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.coverageIsSet) {
      builder.coverage(json.coverage);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    return (ImmutableAccount) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Account} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Account instance
   */
  public static Account copyOf(Account instance) {
    if (instance instanceof ImmutableAccount) {
      return (ImmutableAccount) instance;
    }
    return ((ImmutableAccount.Builder) ImmutableAccount.builder())
        .status(instance.status())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .guarantor(instance.guarantor())
        .owner(instance.owner())
        .identifier(instance.identifier())
        .type(instance.type())
        .partOf(instance.partOf())
        .servicePeriod(instance.servicePeriod())
        .implicitRules(instance.implicitRules())
        .resourceType(instance.resourceType())
        .meta(instance.meta())
        .name(instance.name())
        .description(instance.description())
        .extension(instance.extension())
        .subject(instance.subject())
        .language(instance.language())
        .coverage(instance.coverage())
        .text(instance.text())
        .contained(instance.contained())
        .build();
  }

  /**
   * Creates a builder for {@link Account Account}.
   * <pre>
   * ImmutableAccount.builder()
   *    .status(com.fhir.AccountStatus) // optional {@link Account#status() status}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Account#modifierExtension() modifierExtension}
   *    .id(com.fhir.id) // optional {@link Account#id() id}
   *    .guarantor(List&amp;lt;com.fhir.Account_Guarantor&amp;gt;) // optional {@link Account#guarantor() guarantor}
   *    .owner(com.fhir.Reference) // optional {@link Account#owner() owner}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link Account#identifier() identifier}
   *    .type(com.fhir.CodeableConcept) // optional {@link Account#type() type}
   *    .partOf(com.fhir.Reference) // optional {@link Account#partOf() partOf}
   *    .servicePeriod(com.fhir.Period) // optional {@link Account#servicePeriod() servicePeriod}
   *    .implicitRules(com.fhir.uri) // optional {@link Account#implicitRules() implicitRules}
   *    .resourceType(String) // required {@link Account#resourceType() resourceType}
   *    .meta(com.fhir.Meta) // optional {@link Account#meta() meta}
   *    .name(String) // optional {@link Account#name() name}
   *    .description(String) // optional {@link Account#description() description}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link Account#extension() extension}
   *    .subject(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link Account#subject() subject}
   *    .language(com.fhir.code) // optional {@link Account#language() language}
   *    .coverage(List&amp;lt;com.fhir.Account_Coverage&amp;gt;) // optional {@link Account#coverage() coverage}
   *    .text(com.fhir.Narrative) // optional {@link Account#text() text}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link Account#contained() contained}
   *    .build();
   * </pre>
   * @return A new Account builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableAccount.Builder();
  }

  /**
   * Builds instances of type {@link Account Account}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "Account", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_STATUS = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_GUARANTOR = 0x8L;
    private static final long OPT_BIT_OWNER = 0x10L;
    private static final long OPT_BIT_IDENTIFIER = 0x20L;
    private static final long OPT_BIT_TYPE = 0x40L;
    private static final long OPT_BIT_PART_OF = 0x80L;
    private static final long OPT_BIT_SERVICE_PERIOD = 0x100L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x200L;
    private static final long OPT_BIT_META = 0x400L;
    private static final long OPT_BIT_NAME = 0x800L;
    private static final long OPT_BIT_DESCRIPTION = 0x1000L;
    private static final long OPT_BIT_EXTENSION = 0x2000L;
    private static final long OPT_BIT_SUBJECT = 0x4000L;
    private static final long OPT_BIT_LANGUAGE = 0x8000L;
    private static final long OPT_BIT_COVERAGE = 0x10000L;
    private static final long OPT_BIT_TEXT = 0x20000L;
    private static final long OPT_BIT_CONTAINED = 0x40000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.AccountStatus status;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Account_Guarantor> guarantor;
    private @javax.annotation.Nullable com.fhir.Reference owner;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable com.fhir.Reference partOf;
    private @javax.annotation.Nullable com.fhir.Period servicePeriod;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable java.lang.String name;
    private @javax.annotation.Nullable java.lang.String description;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> subject;
    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.Account_Coverage> coverage;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Account#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    public final Builder status(com.fhir.AccountStatus status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = java.util.Objects.requireNonNull(status, "status");
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Account#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("status")
    public final Builder status(java.util.Optional<? extends com.fhir.AccountStatus> status) {
      checkNotIsSet(statusIsSet(), "status");
      this.status = status.orElse(null);
      optBits |= OPT_BIT_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link Account#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Account#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Account#id() id} to id.
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
     * Initializes the optional value {@link Account#id() id} to id.
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
     * Initializes the optional value {@link Account#guarantor() guarantor} to guarantor.
     * @param guarantor The value for guarantor
     * @return {@code this} builder for chained invocation
     */
    public final Builder guarantor(java.util.List<com.fhir.Account_Guarantor> guarantor) {
      checkNotIsSet(guarantorIsSet(), "guarantor");
      this.guarantor = java.util.Objects.requireNonNull(guarantor, "guarantor");
      optBits |= OPT_BIT_GUARANTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Account#guarantor() guarantor} to guarantor.
     * @param guarantor The value for guarantor
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("guarantor")
    public final Builder guarantor(java.util.Optional<? extends java.util.List<com.fhir.Account_Guarantor>> guarantor) {
      checkNotIsSet(guarantorIsSet(), "guarantor");
      this.guarantor = guarantor.orElse(null);
      optBits |= OPT_BIT_GUARANTOR;
      return this;
    }

    /**
     * Initializes the optional value {@link Account#owner() owner} to owner.
     * @param owner The value for owner
     * @return {@code this} builder for chained invocation
     */
    public final Builder owner(com.fhir.Reference owner) {
      checkNotIsSet(ownerIsSet(), "owner");
      this.owner = java.util.Objects.requireNonNull(owner, "owner");
      optBits |= OPT_BIT_OWNER;
      return this;
    }

    /**
     * Initializes the optional value {@link Account#owner() owner} to owner.
     * @param owner The value for owner
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    public final Builder owner(java.util.Optional<? extends com.fhir.Reference> owner) {
      checkNotIsSet(ownerIsSet(), "owner");
      this.owner = owner.orElse(null);
      optBits |= OPT_BIT_OWNER;
      return this;
    }

    /**
     * Initializes the optional value {@link Account#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Account#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link Account#type() type} to type.
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
     * Initializes the optional value {@link Account#type() type} to type.
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
     * Initializes the optional value {@link Account#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    public final Builder partOf(com.fhir.Reference partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = java.util.Objects.requireNonNull(partOf, "partOf");
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link Account#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("partOf")
    public final Builder partOf(java.util.Optional<? extends com.fhir.Reference> partOf) {
      checkNotIsSet(partOfIsSet(), "partOf");
      this.partOf = partOf.orElse(null);
      optBits |= OPT_BIT_PART_OF;
      return this;
    }

    /**
     * Initializes the optional value {@link Account#servicePeriod() servicePeriod} to servicePeriod.
     * @param servicePeriod The value for servicePeriod
     * @return {@code this} builder for chained invocation
     */
    public final Builder servicePeriod(com.fhir.Period servicePeriod) {
      checkNotIsSet(servicePeriodIsSet(), "servicePeriod");
      this.servicePeriod = java.util.Objects.requireNonNull(servicePeriod, "servicePeriod");
      optBits |= OPT_BIT_SERVICE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Account#servicePeriod() servicePeriod} to servicePeriod.
     * @param servicePeriod The value for servicePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("servicePeriod")
    public final Builder servicePeriod(java.util.Optional<? extends com.fhir.Period> servicePeriod) {
      checkNotIsSet(servicePeriodIsSet(), "servicePeriod");
      this.servicePeriod = servicePeriod.orElse(null);
      optBits |= OPT_BIT_SERVICE_PERIOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Account#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Account#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the value for the {@link Account#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link Account#meta() meta} to meta.
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
     * Initializes the optional value {@link Account#meta() meta} to meta.
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
     * Initializes the optional value {@link Account#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(java.lang.String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = java.util.Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Account#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public final Builder name(java.util.Optional<java.lang.String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Account#description() description} to description.
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
     * Initializes the optional value {@link Account#description() description} to description.
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
     * Initializes the optional value {@link Account#extension() extension} to extension.
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
     * Initializes the optional value {@link Account#extension() extension} to extension.
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
     * Initializes the optional value {@link Account#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    public final Builder subject(java.util.List<com.fhir.Reference> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = java.util.Objects.requireNonNull(subject, "subject");
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link Account#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("subject")
    public final Builder subject(java.util.Optional<? extends java.util.List<com.fhir.Reference>> subject) {
      checkNotIsSet(subjectIsSet(), "subject");
      this.subject = subject.orElse(null);
      optBits |= OPT_BIT_SUBJECT;
      return this;
    }

    /**
     * Initializes the optional value {@link Account#language() language} to language.
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
     * Initializes the optional value {@link Account#language() language} to language.
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
     * Initializes the optional value {@link Account#coverage() coverage} to coverage.
     * @param coverage The value for coverage
     * @return {@code this} builder for chained invocation
     */
    public final Builder coverage(java.util.List<com.fhir.Account_Coverage> coverage) {
      checkNotIsSet(coverageIsSet(), "coverage");
      this.coverage = java.util.Objects.requireNonNull(coverage, "coverage");
      optBits |= OPT_BIT_COVERAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Account#coverage() coverage} to coverage.
     * @param coverage The value for coverage
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("coverage")
    public final Builder coverage(java.util.Optional<? extends java.util.List<com.fhir.Account_Coverage>> coverage) {
      checkNotIsSet(coverageIsSet(), "coverage");
      this.coverage = coverage.orElse(null);
      optBits |= OPT_BIT_COVERAGE;
      return this;
    }

    /**
     * Initializes the optional value {@link Account#text() text} to text.
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
     * Initializes the optional value {@link Account#text() text} to text.
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
     * Initializes the optional value {@link Account#contained() contained} to contained.
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
     * Initializes the optional value {@link Account#contained() contained} to contained.
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
     * Builds a new {@link Account Account}.
     * @return An immutable instance of Account
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.Account build() {
      checkRequiredAttributes();
      return new ImmutableAccount(
          status,
          modifierExtension,
          id,
          guarantor,
          owner,
          identifier,
          type,
          partOf,
          servicePeriod,
          implicitRules,
          resourceType,
          meta,
          name,
          description,
          extension,
          subject,
          language,
          coverage,
          text,
          contained);
    }

    private boolean statusIsSet() {
      return (optBits & OPT_BIT_STATUS) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean guarantorIsSet() {
      return (optBits & OPT_BIT_GUARANTOR) != 0;
    }

    private boolean ownerIsSet() {
      return (optBits & OPT_BIT_OWNER) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean partOfIsSet() {
      return (optBits & OPT_BIT_PART_OF) != 0;
    }

    private boolean servicePeriodIsSet() {
      return (optBits & OPT_BIT_SERVICE_PERIOD) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean subjectIsSet() {
      return (optBits & OPT_BIT_SUBJECT) != 0;
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean coverageIsSet() {
      return (optBits & OPT_BIT_COVERAGE) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of Account is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build Account, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "Account", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link Account#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "Account", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Account#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for chained invocation
     */
    BuildFinal status(com.fhir.AccountStatus status);

    /**
     * Initializes the optional value {@link Account#status() status} to status.
     * @param status The value for status
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal status(java.util.Optional<? extends com.fhir.AccountStatus> status);

    /**
     * Initializes the optional value {@link Account#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link Account#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link Account#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link Account#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link Account#guarantor() guarantor} to guarantor.
     * @param guarantor The value for guarantor
     * @return {@code this} builder for chained invocation
     */
    BuildFinal guarantor(java.util.List<com.fhir.Account_Guarantor> guarantor);

    /**
     * Initializes the optional value {@link Account#guarantor() guarantor} to guarantor.
     * @param guarantor The value for guarantor
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal guarantor(java.util.Optional<? extends java.util.List<com.fhir.Account_Guarantor>> guarantor);

    /**
     * Initializes the optional value {@link Account#owner() owner} to owner.
     * @param owner The value for owner
     * @return {@code this} builder for chained invocation
     */
    BuildFinal owner(com.fhir.Reference owner);

    /**
     * Initializes the optional value {@link Account#owner() owner} to owner.
     * @param owner The value for owner
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal owner(java.util.Optional<? extends com.fhir.Reference> owner);

    /**
     * Initializes the optional value {@link Account#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link Account#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link Account#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(com.fhir.CodeableConcept type);

    /**
     * Initializes the optional value {@link Account#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends com.fhir.CodeableConcept> type);

    /**
     * Initializes the optional value {@link Account#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for chained invocation
     */
    BuildFinal partOf(com.fhir.Reference partOf);

    /**
     * Initializes the optional value {@link Account#partOf() partOf} to partOf.
     * @param partOf The value for partOf
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal partOf(java.util.Optional<? extends com.fhir.Reference> partOf);

    /**
     * Initializes the optional value {@link Account#servicePeriod() servicePeriod} to servicePeriod.
     * @param servicePeriod The value for servicePeriod
     * @return {@code this} builder for chained invocation
     */
    BuildFinal servicePeriod(com.fhir.Period servicePeriod);

    /**
     * Initializes the optional value {@link Account#servicePeriod() servicePeriod} to servicePeriod.
     * @param servicePeriod The value for servicePeriod
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal servicePeriod(java.util.Optional<? extends com.fhir.Period> servicePeriod);

    /**
     * Initializes the optional value {@link Account#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link Account#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link Account#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link Account#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link Account#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    BuildFinal name(java.lang.String name);

    /**
     * Initializes the optional value {@link Account#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal name(java.util.Optional<java.lang.String> name);

    /**
     * Initializes the optional value {@link Account#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(java.lang.String description);

    /**
     * Initializes the optional value {@link Account#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(java.util.Optional<java.lang.String> description);

    /**
     * Initializes the optional value {@link Account#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link Account#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link Account#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for chained invocation
     */
    BuildFinal subject(java.util.List<com.fhir.Reference> subject);

    /**
     * Initializes the optional value {@link Account#subject() subject} to subject.
     * @param subject The value for subject
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal subject(java.util.Optional<? extends java.util.List<com.fhir.Reference>> subject);

    /**
     * Initializes the optional value {@link Account#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link Account#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link Account#coverage() coverage} to coverage.
     * @param coverage The value for coverage
     * @return {@code this} builder for chained invocation
     */
    BuildFinal coverage(java.util.List<com.fhir.Account_Coverage> coverage);

    /**
     * Initializes the optional value {@link Account#coverage() coverage} to coverage.
     * @param coverage The value for coverage
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal coverage(java.util.Optional<? extends java.util.List<com.fhir.Account_Coverage>> coverage);

    /**
     * Initializes the optional value {@link Account#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link Account#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link Account#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link Account#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Builds a new {@link Account Account}.
     * @return An immutable instance of Account
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Account build();
  }
}

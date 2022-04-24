//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link MedicinalProduct}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProduct.builder()}.
 */
@org.immutables.value.Generated(from = "MedicinalProduct", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProduct implements com.fhir.MedicinalProduct {
  private final @javax.annotation.Nullable com.fhir.code language;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.util.List<java.lang.String> specialMeasures;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> clinicalTrial;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> masterFile;
  private final @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProduct_SpecialDesignation> specialDesignation;
  private final @javax.annotation.Nullable java.util.List<com.fhir.MarketingStatus> marketingStatus;
  private final @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
  private final java.lang.String resourceType;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> pharmaceuticalProduct;
  private final @javax.annotation.Nullable com.fhir.id id;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept legalStatusOfSupply;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept combinedPharmaceuticalDoseForm;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept paediatricUseIndicator;
  private final @javax.annotation.Nullable com.fhir.Coding domain;
  private final @javax.annotation.Nullable com.fhir.Narrative text;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Identifier> crossReference;
  private final @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProduct_ManufacturingBusinessOperation> manufacturingBusinessOperation;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept type;
  private final @javax.annotation.Nullable com.fhir.Meta meta;
  private final @javax.annotation.Nullable com.fhir.uri implicitRules;
  private final @javax.annotation.Nullable com.fhir.CodeableConcept additionalMonitoringIndicator;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> packagedMedicinalProduct;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> attachedDocument;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> productClassification;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Reference> contact;
  private final java.util.List<com.fhir.MedicinalProduct_Name> name;

  private ImmutableMedicinalProduct(
      @javax.annotation.Nullable com.fhir.code language,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.util.List<java.lang.String> specialMeasures,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> clinicalTrial,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> masterFile,
      @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProduct_SpecialDesignation> specialDesignation,
      @javax.annotation.Nullable java.util.List<com.fhir.MarketingStatus> marketingStatus,
      @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained,
      java.lang.String resourceType,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> pharmaceuticalProduct,
      @javax.annotation.Nullable com.fhir.id id,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier,
      @javax.annotation.Nullable com.fhir.CodeableConcept legalStatusOfSupply,
      @javax.annotation.Nullable com.fhir.CodeableConcept combinedPharmaceuticalDoseForm,
      @javax.annotation.Nullable com.fhir.CodeableConcept paediatricUseIndicator,
      @javax.annotation.Nullable com.fhir.Coding domain,
      @javax.annotation.Nullable com.fhir.Narrative text,
      @javax.annotation.Nullable java.util.List<com.fhir.Identifier> crossReference,
      @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProduct_ManufacturingBusinessOperation> manufacturingBusinessOperation,
      @javax.annotation.Nullable com.fhir.CodeableConcept type,
      @javax.annotation.Nullable com.fhir.Meta meta,
      @javax.annotation.Nullable com.fhir.uri implicitRules,
      @javax.annotation.Nullable com.fhir.CodeableConcept additionalMonitoringIndicator,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> packagedMedicinalProduct,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> attachedDocument,
      @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> productClassification,
      @javax.annotation.Nullable java.util.List<com.fhir.Reference> contact,
      java.util.List<com.fhir.MedicinalProduct_Name> name) {
    this.language = language;
    this.modifierExtension = modifierExtension;
    this.specialMeasures = specialMeasures;
    this.clinicalTrial = clinicalTrial;
    this.extension = extension;
    this.masterFile = masterFile;
    this.specialDesignation = specialDesignation;
    this.marketingStatus = marketingStatus;
    this.contained = contained;
    this.resourceType = resourceType;
    this.pharmaceuticalProduct = pharmaceuticalProduct;
    this.id = id;
    this.identifier = identifier;
    this.legalStatusOfSupply = legalStatusOfSupply;
    this.combinedPharmaceuticalDoseForm = combinedPharmaceuticalDoseForm;
    this.paediatricUseIndicator = paediatricUseIndicator;
    this.domain = domain;
    this.text = text;
    this.crossReference = crossReference;
    this.manufacturingBusinessOperation = manufacturingBusinessOperation;
    this.type = type;
    this.meta = meta;
    this.implicitRules = implicitRules;
    this.additionalMonitoringIndicator = additionalMonitoringIndicator;
    this.packagedMedicinalProduct = packagedMedicinalProduct;
    this.attachedDocument = attachedDocument;
    this.productClassification = productClassification;
    this.contact = contact;
    this.name = name;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() {
    return java.util.Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code specialMeasures} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("specialMeasures")
  @Override
  public java.util.Optional<java.util.List<java.lang.String>> specialMeasures() {
    return java.util.Optional.ofNullable(specialMeasures);
  }

  /**
   * @return The value of the {@code clinicalTrial} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("clinicalTrial")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> clinicalTrial() {
    return java.util.Optional.ofNullable(clinicalTrial);
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
   * @return The value of the {@code masterFile} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("masterFile")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> masterFile() {
    return java.util.Optional.ofNullable(masterFile);
  }

  /**
   * @return The value of the {@code specialDesignation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("specialDesignation")
  @Override
  public java.util.Optional<java.util.List<com.fhir.MedicinalProduct_SpecialDesignation>> specialDesignation() {
    return java.util.Optional.ofNullable(specialDesignation);
  }

  /**
   * @return The value of the {@code marketingStatus} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("marketingStatus")
  @Override
  public java.util.Optional<java.util.List<com.fhir.MarketingStatus>> marketingStatus() {
    return java.util.Optional.ofNullable(marketingStatus);
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
   * @return The value of the {@code resourceType} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
  @Override
  public java.lang.String resourceType() {
    return resourceType;
  }

  /**
   * @return The value of the {@code pharmaceuticalProduct} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("pharmaceuticalProduct")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> pharmaceuticalProduct() {
    return java.util.Optional.ofNullable(pharmaceuticalProduct);
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
   * @return The value of the {@code identifier} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("identifier")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() {
    return java.util.Optional.ofNullable(identifier);
  }

  /**
   * @return The value of the {@code legalStatusOfSupply} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("legalStatusOfSupply")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> legalStatusOfSupply() {
    return java.util.Optional.ofNullable(legalStatusOfSupply);
  }

  /**
   * @return The value of the {@code combinedPharmaceuticalDoseForm} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("combinedPharmaceuticalDoseForm")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> combinedPharmaceuticalDoseForm() {
    return java.util.Optional.ofNullable(combinedPharmaceuticalDoseForm);
  }

  /**
   * @return The value of the {@code paediatricUseIndicator} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("paediatricUseIndicator")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> paediatricUseIndicator() {
    return java.util.Optional.ofNullable(paediatricUseIndicator);
  }

  /**
   * @return The value of the {@code domain} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("domain")
  @Override
  public java.util.Optional<com.fhir.Coding> domain() {
    return java.util.Optional.ofNullable(domain);
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
   * @return The value of the {@code crossReference} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("crossReference")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Identifier>> crossReference() {
    return java.util.Optional.ofNullable(crossReference);
  }

  /**
   * @return The value of the {@code manufacturingBusinessOperation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("manufacturingBusinessOperation")
  @Override
  public java.util.Optional<java.util.List<com.fhir.MedicinalProduct_ManufacturingBusinessOperation>> manufacturingBusinessOperation() {
    return java.util.Optional.ofNullable(manufacturingBusinessOperation);
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
   * @return The value of the {@code meta} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("meta")
  @Override
  public java.util.Optional<com.fhir.Meta> meta() {
    return java.util.Optional.ofNullable(meta);
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
   * @return The value of the {@code additionalMonitoringIndicator} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("additionalMonitoringIndicator")
  @Override
  public java.util.Optional<com.fhir.CodeableConcept> additionalMonitoringIndicator() {
    return java.util.Optional.ofNullable(additionalMonitoringIndicator);
  }

  /**
   * @return The value of the {@code packagedMedicinalProduct} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("packagedMedicinalProduct")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> packagedMedicinalProduct() {
    return java.util.Optional.ofNullable(packagedMedicinalProduct);
  }

  /**
   * @return The value of the {@code attachedDocument} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("attachedDocument")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> attachedDocument() {
    return java.util.Optional.ofNullable(attachedDocument);
  }

  /**
   * @return The value of the {@code productClassification} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("productClassification")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> productClassification() {
    return java.util.Optional.ofNullable(productClassification);
  }

  /**
   * @return The value of the {@code contact} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("contact")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Reference>> contact() {
    return java.util.Optional.ofNullable(contact);
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("name")
  @Override
  public java.util.List<com.fhir.MedicinalProduct_Name> name() {
    return name;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withLanguage(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedicinalProduct(
        newValue,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withLanguage(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedicinalProduct(
        value,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        newValue,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        value,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#specialMeasures() specialMeasures} attribute.
   * @param value The value for specialMeasures
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withSpecialMeasures(java.util.List<java.lang.String> value) {
    @javax.annotation.Nullable java.util.List<java.lang.String> newValue = java.util.Objects.requireNonNull(value, "specialMeasures");
    if (this.specialMeasures == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        newValue,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#specialMeasures() specialMeasures} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specialMeasures
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withSpecialMeasures(java.util.Optional<? extends java.util.List<java.lang.String>> optional) {
    @javax.annotation.Nullable java.util.List<java.lang.String> value = optional.orElse(null);
    if (this.specialMeasures == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        value,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#clinicalTrial() clinicalTrial} attribute.
   * @param value The value for clinicalTrial
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withClinicalTrial(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "clinicalTrial");
    if (this.clinicalTrial == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        newValue,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#clinicalTrial() clinicalTrial} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for clinicalTrial
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withClinicalTrial(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.clinicalTrial == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        value,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        newValue,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        value,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#masterFile() masterFile} attribute.
   * @param value The value for masterFile
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withMasterFile(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "masterFile");
    if (this.masterFile == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        newValue,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#masterFile() masterFile} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for masterFile
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withMasterFile(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.masterFile == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        value,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#specialDesignation() specialDesignation} attribute.
   * @param value The value for specialDesignation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withSpecialDesignation(java.util.List<com.fhir.MedicinalProduct_SpecialDesignation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProduct_SpecialDesignation> newValue = java.util.Objects.requireNonNull(value, "specialDesignation");
    if (this.specialDesignation == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        newValue,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#specialDesignation() specialDesignation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specialDesignation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withSpecialDesignation(java.util.Optional<? extends java.util.List<com.fhir.MedicinalProduct_SpecialDesignation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProduct_SpecialDesignation> value = optional.orElse(null);
    if (this.specialDesignation == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        value,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#marketingStatus() marketingStatus} attribute.
   * @param value The value for marketingStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withMarketingStatus(java.util.List<com.fhir.MarketingStatus> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.MarketingStatus> newValue = java.util.Objects.requireNonNull(value, "marketingStatus");
    if (this.marketingStatus == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        newValue,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#marketingStatus() marketingStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for marketingStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withMarketingStatus(java.util.Optional<? extends java.util.List<com.fhir.MarketingStatus>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.MarketingStatus> value = optional.orElse(null);
    if (this.marketingStatus == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        value,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withContained(java.util.List<com.fhir.ResourceList> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> newValue = java.util.Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        newValue,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withContained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        value,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProduct#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProduct withResourceType(java.lang.String value) {
    java.lang.String newValue = java.util.Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        newValue,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#pharmaceuticalProduct() pharmaceuticalProduct} attribute.
   * @param value The value for pharmaceuticalProduct
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withPharmaceuticalProduct(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "pharmaceuticalProduct");
    if (this.pharmaceuticalProduct == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        newValue,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#pharmaceuticalProduct() pharmaceuticalProduct} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for pharmaceuticalProduct
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withPharmaceuticalProduct(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.pharmaceuticalProduct == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        value,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withId(com.fhir.id value) {
    @javax.annotation.Nullable com.fhir.id newValue = java.util.Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        newValue,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withId(java.util.Optional<? extends com.fhir.id> optional) {
    @javax.annotation.Nullable com.fhir.id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        value,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withIdentifier(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        newValue,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withIdentifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        value,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#legalStatusOfSupply() legalStatusOfSupply} attribute.
   * @param value The value for legalStatusOfSupply
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withLegalStatusOfSupply(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "legalStatusOfSupply");
    if (this.legalStatusOfSupply == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        newValue,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#legalStatusOfSupply() legalStatusOfSupply} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for legalStatusOfSupply
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withLegalStatusOfSupply(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.legalStatusOfSupply == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        value,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#combinedPharmaceuticalDoseForm() combinedPharmaceuticalDoseForm} attribute.
   * @param value The value for combinedPharmaceuticalDoseForm
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withCombinedPharmaceuticalDoseForm(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "combinedPharmaceuticalDoseForm");
    if (this.combinedPharmaceuticalDoseForm == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        newValue,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#combinedPharmaceuticalDoseForm() combinedPharmaceuticalDoseForm} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for combinedPharmaceuticalDoseForm
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withCombinedPharmaceuticalDoseForm(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.combinedPharmaceuticalDoseForm == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        value,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#paediatricUseIndicator() paediatricUseIndicator} attribute.
   * @param value The value for paediatricUseIndicator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withPaediatricUseIndicator(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "paediatricUseIndicator");
    if (this.paediatricUseIndicator == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        newValue,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#paediatricUseIndicator() paediatricUseIndicator} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for paediatricUseIndicator
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withPaediatricUseIndicator(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.paediatricUseIndicator == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        value,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#domain() domain} attribute.
   * @param value The value for domain
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withDomain(com.fhir.Coding value) {
    @javax.annotation.Nullable com.fhir.Coding newValue = java.util.Objects.requireNonNull(value, "domain");
    if (this.domain == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        newValue,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#domain() domain} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for domain
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withDomain(java.util.Optional<? extends com.fhir.Coding> optional) {
    @javax.annotation.Nullable com.fhir.Coding value = optional.orElse(null);
    if (this.domain == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        value,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withText(com.fhir.Narrative value) {
    @javax.annotation.Nullable com.fhir.Narrative newValue = java.util.Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        newValue,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withText(java.util.Optional<? extends com.fhir.Narrative> optional) {
    @javax.annotation.Nullable com.fhir.Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        value,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#crossReference() crossReference} attribute.
   * @param value The value for crossReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withCrossReference(java.util.List<com.fhir.Identifier> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> newValue = java.util.Objects.requireNonNull(value, "crossReference");
    if (this.crossReference == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        newValue,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#crossReference() crossReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for crossReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withCrossReference(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Identifier> value = optional.orElse(null);
    if (this.crossReference == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        value,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#manufacturingBusinessOperation() manufacturingBusinessOperation} attribute.
   * @param value The value for manufacturingBusinessOperation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withManufacturingBusinessOperation(java.util.List<com.fhir.MedicinalProduct_ManufacturingBusinessOperation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProduct_ManufacturingBusinessOperation> newValue = java.util.Objects.requireNonNull(value, "manufacturingBusinessOperation");
    if (this.manufacturingBusinessOperation == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        newValue,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#manufacturingBusinessOperation() manufacturingBusinessOperation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for manufacturingBusinessOperation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withManufacturingBusinessOperation(java.util.Optional<? extends java.util.List<com.fhir.MedicinalProduct_ManufacturingBusinessOperation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProduct_ManufacturingBusinessOperation> value = optional.orElse(null);
    if (this.manufacturingBusinessOperation == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        value,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withType(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        newValue,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withType(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        value,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withMeta(com.fhir.Meta value) {
    @javax.annotation.Nullable com.fhir.Meta newValue = java.util.Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        newValue,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withMeta(java.util.Optional<? extends com.fhir.Meta> optional) {
    @javax.annotation.Nullable com.fhir.Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        value,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withImplicitRules(com.fhir.uri value) {
    @javax.annotation.Nullable com.fhir.uri newValue = java.util.Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        newValue,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withImplicitRules(java.util.Optional<? extends com.fhir.uri> optional) {
    @javax.annotation.Nullable com.fhir.uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        value,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#additionalMonitoringIndicator() additionalMonitoringIndicator} attribute.
   * @param value The value for additionalMonitoringIndicator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withAdditionalMonitoringIndicator(com.fhir.CodeableConcept value) {
    @javax.annotation.Nullable com.fhir.CodeableConcept newValue = java.util.Objects.requireNonNull(value, "additionalMonitoringIndicator");
    if (this.additionalMonitoringIndicator == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        newValue,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#additionalMonitoringIndicator() additionalMonitoringIndicator} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for additionalMonitoringIndicator
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withAdditionalMonitoringIndicator(java.util.Optional<? extends com.fhir.CodeableConcept> optional) {
    @javax.annotation.Nullable com.fhir.CodeableConcept value = optional.orElse(null);
    if (this.additionalMonitoringIndicator == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        value,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#packagedMedicinalProduct() packagedMedicinalProduct} attribute.
   * @param value The value for packagedMedicinalProduct
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withPackagedMedicinalProduct(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "packagedMedicinalProduct");
    if (this.packagedMedicinalProduct == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        newValue,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#packagedMedicinalProduct() packagedMedicinalProduct} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for packagedMedicinalProduct
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withPackagedMedicinalProduct(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.packagedMedicinalProduct == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        value,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#attachedDocument() attachedDocument} attribute.
   * @param value The value for attachedDocument
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withAttachedDocument(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "attachedDocument");
    if (this.attachedDocument == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        newValue,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#attachedDocument() attachedDocument} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for attachedDocument
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withAttachedDocument(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.attachedDocument == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        value,
        this.productClassification,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#productClassification() productClassification} attribute.
   * @param value The value for productClassification
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withProductClassification(java.util.List<com.fhir.CodeableConcept> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> newValue = java.util.Objects.requireNonNull(value, "productClassification");
    if (this.productClassification == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        newValue,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#productClassification() productClassification} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for productClassification
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withProductClassification(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> value = optional.orElse(null);
    if (this.productClassification == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        value,
        this.contact,
        this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withContact(java.util.List<com.fhir.Reference> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> newValue = java.util.Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        newValue,
        this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withContact(java.util.Optional<? extends java.util.List<com.fhir.Reference>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Reference> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        value,
        this.name);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MedicinalProduct#name() name}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withName(com.fhir.MedicinalProduct_Name... elements) {
    java.util.List<com.fhir.MedicinalProduct_Name> newValue = createUnmodifiableList(false, createSafeList(java.util.Arrays.asList(elements), true, false));
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        newValue);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MedicinalProduct#name() name}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of name elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withName(Iterable<? extends com.fhir.MedicinalProduct_Name> elements) {
    if (this.name == elements) return this;
    java.util.List<com.fhir.MedicinalProduct_Name> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableMedicinalProduct(
        this.language,
        this.modifierExtension,
        this.specialMeasures,
        this.clinicalTrial,
        this.extension,
        this.masterFile,
        this.specialDesignation,
        this.marketingStatus,
        this.contained,
        this.resourceType,
        this.pharmaceuticalProduct,
        this.id,
        this.identifier,
        this.legalStatusOfSupply,
        this.combinedPharmaceuticalDoseForm,
        this.paediatricUseIndicator,
        this.domain,
        this.text,
        this.crossReference,
        this.manufacturingBusinessOperation,
        this.type,
        this.meta,
        this.implicitRules,
        this.additionalMonitoringIndicator,
        this.packagedMedicinalProduct,
        this.attachedDocument,
        this.productClassification,
        this.contact,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProduct} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProduct
        && equalTo((ImmutableMedicinalProduct) another);
  }

  private boolean equalTo(ImmutableMedicinalProduct another) {
    return java.util.Objects.equals(language, another.language)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(specialMeasures, another.specialMeasures)
        && java.util.Objects.equals(clinicalTrial, another.clinicalTrial)
        && java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(masterFile, another.masterFile)
        && java.util.Objects.equals(specialDesignation, another.specialDesignation)
        && java.util.Objects.equals(marketingStatus, another.marketingStatus)
        && java.util.Objects.equals(contained, another.contained)
        && resourceType.equals(another.resourceType)
        && java.util.Objects.equals(pharmaceuticalProduct, another.pharmaceuticalProduct)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(identifier, another.identifier)
        && java.util.Objects.equals(legalStatusOfSupply, another.legalStatusOfSupply)
        && java.util.Objects.equals(combinedPharmaceuticalDoseForm, another.combinedPharmaceuticalDoseForm)
        && java.util.Objects.equals(paediatricUseIndicator, another.paediatricUseIndicator)
        && java.util.Objects.equals(domain, another.domain)
        && java.util.Objects.equals(text, another.text)
        && java.util.Objects.equals(crossReference, another.crossReference)
        && java.util.Objects.equals(manufacturingBusinessOperation, another.manufacturingBusinessOperation)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(meta, another.meta)
        && java.util.Objects.equals(implicitRules, another.implicitRules)
        && java.util.Objects.equals(additionalMonitoringIndicator, another.additionalMonitoringIndicator)
        && java.util.Objects.equals(packagedMedicinalProduct, another.packagedMedicinalProduct)
        && java.util.Objects.equals(attachedDocument, another.attachedDocument)
        && java.util.Objects.equals(productClassification, another.productClassification)
        && java.util.Objects.equals(contact, another.contact)
        && name.equals(another.name);
  }

  /**
   * Computes a hash code from attributes: {@code language}, {@code modifierExtension}, {@code specialMeasures}, {@code clinicalTrial}, {@code extension}, {@code masterFile}, {@code specialDesignation}, {@code marketingStatus}, {@code contained}, {@code resourceType}, {@code pharmaceuticalProduct}, {@code id}, {@code identifier}, {@code legalStatusOfSupply}, {@code combinedPharmaceuticalDoseForm}, {@code paediatricUseIndicator}, {@code domain}, {@code text}, {@code crossReference}, {@code manufacturingBusinessOperation}, {@code type}, {@code meta}, {@code implicitRules}, {@code additionalMonitoringIndicator}, {@code packagedMedicinalProduct}, {@code attachedDocument}, {@code productClassification}, {@code contact}, {@code name}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(language);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(specialMeasures);
    h += (h << 5) + java.util.Objects.hashCode(clinicalTrial);
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(masterFile);
    h += (h << 5) + java.util.Objects.hashCode(specialDesignation);
    h += (h << 5) + java.util.Objects.hashCode(marketingStatus);
    h += (h << 5) + java.util.Objects.hashCode(contained);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + java.util.Objects.hashCode(pharmaceuticalProduct);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(identifier);
    h += (h << 5) + java.util.Objects.hashCode(legalStatusOfSupply);
    h += (h << 5) + java.util.Objects.hashCode(combinedPharmaceuticalDoseForm);
    h += (h << 5) + java.util.Objects.hashCode(paediatricUseIndicator);
    h += (h << 5) + java.util.Objects.hashCode(domain);
    h += (h << 5) + java.util.Objects.hashCode(text);
    h += (h << 5) + java.util.Objects.hashCode(crossReference);
    h += (h << 5) + java.util.Objects.hashCode(manufacturingBusinessOperation);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(meta);
    h += (h << 5) + java.util.Objects.hashCode(implicitRules);
    h += (h << 5) + java.util.Objects.hashCode(additionalMonitoringIndicator);
    h += (h << 5) + java.util.Objects.hashCode(packagedMedicinalProduct);
    h += (h << 5) + java.util.Objects.hashCode(attachedDocument);
    h += (h << 5) + java.util.Objects.hashCode(productClassification);
    h += (h << 5) + java.util.Objects.hashCode(contact);
    h += (h << 5) + name.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProduct} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("MedicinalProduct{");
    if (language != null) {
      builder.append("language=").append(language);
    }
    if (modifierExtension != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (specialMeasures != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("specialMeasures=").append(specialMeasures);
    }
    if (clinicalTrial != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("clinicalTrial=").append(clinicalTrial);
    }
    if (extension != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (masterFile != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("masterFile=").append(masterFile);
    }
    if (specialDesignation != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("specialDesignation=").append(specialDesignation);
    }
    if (marketingStatus != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("marketingStatus=").append(marketingStatus);
    }
    if (contained != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (builder.length() > 17) builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (pharmaceuticalProduct != null) {
      builder.append(", ");
      builder.append("pharmaceuticalProduct=").append(pharmaceuticalProduct);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
    }
    if (legalStatusOfSupply != null) {
      builder.append(", ");
      builder.append("legalStatusOfSupply=").append(legalStatusOfSupply);
    }
    if (combinedPharmaceuticalDoseForm != null) {
      builder.append(", ");
      builder.append("combinedPharmaceuticalDoseForm=").append(combinedPharmaceuticalDoseForm);
    }
    if (paediatricUseIndicator != null) {
      builder.append(", ");
      builder.append("paediatricUseIndicator=").append(paediatricUseIndicator);
    }
    if (domain != null) {
      builder.append(", ");
      builder.append("domain=").append(domain);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (crossReference != null) {
      builder.append(", ");
      builder.append("crossReference=").append(crossReference);
    }
    if (manufacturingBusinessOperation != null) {
      builder.append(", ");
      builder.append("manufacturingBusinessOperation=").append(manufacturingBusinessOperation);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (additionalMonitoringIndicator != null) {
      builder.append(", ");
      builder.append("additionalMonitoringIndicator=").append(additionalMonitoringIndicator);
    }
    if (packagedMedicinalProduct != null) {
      builder.append(", ");
      builder.append("packagedMedicinalProduct=").append(packagedMedicinalProduct);
    }
    if (attachedDocument != null) {
      builder.append(", ");
      builder.append("attachedDocument=").append(attachedDocument);
    }
    if (productClassification != null) {
      builder.append(", ");
      builder.append("productClassification=").append(productClassification);
    }
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    builder.append(", ");
    builder.append("name=").append(name);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "MedicinalProduct", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.MedicinalProduct {
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> language = java.util.Optional.empty();
    boolean languageIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<java.lang.String>> specialMeasures = java.util.Optional.empty();
    boolean specialMeasuresIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> clinicalTrial = java.util.Optional.empty();
    boolean clinicalTrialIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> masterFile = java.util.Optional.empty();
    boolean masterFileIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.MedicinalProduct_SpecialDesignation>> specialDesignation = java.util.Optional.empty();
    boolean specialDesignationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.MarketingStatus>> marketingStatus = java.util.Optional.empty();
    boolean marketingStatusIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.ResourceList>> contained = java.util.Optional.empty();
    boolean containedIsSet;
    @javax.annotation.Nullable java.lang.String resourceType;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> pharmaceuticalProduct = java.util.Optional.empty();
    boolean pharmaceuticalProductIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.id> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> identifier = java.util.Optional.empty();
    boolean identifierIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> legalStatusOfSupply = java.util.Optional.empty();
    boolean legalStatusOfSupplyIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> combinedPharmaceuticalDoseForm = java.util.Optional.empty();
    boolean combinedPharmaceuticalDoseFormIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> paediatricUseIndicator = java.util.Optional.empty();
    boolean paediatricUseIndicatorIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Coding> domain = java.util.Optional.empty();
    boolean domainIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Narrative> text = java.util.Optional.empty();
    boolean textIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Identifier>> crossReference = java.util.Optional.empty();
    boolean crossReferenceIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.MedicinalProduct_ManufacturingBusinessOperation>> manufacturingBusinessOperation = java.util.Optional.empty();
    boolean manufacturingBusinessOperationIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Meta> meta = java.util.Optional.empty();
    boolean metaIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.uri> implicitRules = java.util.Optional.empty();
    boolean implicitRulesIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.CodeableConcept> additionalMonitoringIndicator = java.util.Optional.empty();
    boolean additionalMonitoringIndicatorIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> packagedMedicinalProduct = java.util.Optional.empty();
    boolean packagedMedicinalProductIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> attachedDocument = java.util.Optional.empty();
    boolean attachedDocumentIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CodeableConcept>> productClassification = java.util.Optional.empty();
    boolean productClassificationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Reference>> contact = java.util.Optional.empty();
    boolean contactIsSet;
    @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProduct_Name> name = java.util.Collections.emptyList();
    @com.fasterxml.jackson.annotation.JsonProperty("language")
    public void setLanguage(java.util.Optional<com.fhir.code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("specialMeasures")
    public void setSpecialMeasures(java.util.Optional<java.util.List<java.lang.String>> specialMeasures) {
      this.specialMeasures = specialMeasures;
      this.specialMeasuresIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("clinicalTrial")
    public void setClinicalTrial(java.util.Optional<java.util.List<com.fhir.Reference>> clinicalTrial) {
      this.clinicalTrial = clinicalTrial;
      this.clinicalTrialIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("masterFile")
    public void setMasterFile(java.util.Optional<java.util.List<com.fhir.Reference>> masterFile) {
      this.masterFile = masterFile;
      this.masterFileIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("specialDesignation")
    public void setSpecialDesignation(java.util.Optional<java.util.List<com.fhir.MedicinalProduct_SpecialDesignation>> specialDesignation) {
      this.specialDesignation = specialDesignation;
      this.specialDesignationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("marketingStatus")
    public void setMarketingStatus(java.util.Optional<java.util.List<com.fhir.MarketingStatus>> marketingStatus) {
      this.marketingStatus = marketingStatus;
      this.marketingStatusIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contained")
    public void setContained(java.util.Optional<java.util.List<com.fhir.ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("resourceType")
    public void setResourceType(java.lang.String resourceType) {
      this.resourceType = resourceType;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("pharmaceuticalProduct")
    public void setPharmaceuticalProduct(java.util.Optional<java.util.List<com.fhir.Reference>> pharmaceuticalProduct) {
      this.pharmaceuticalProduct = pharmaceuticalProduct;
      this.pharmaceuticalProductIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<com.fhir.id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("identifier")
    public void setIdentifier(java.util.Optional<java.util.List<com.fhir.Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("legalStatusOfSupply")
    public void setLegalStatusOfSupply(java.util.Optional<com.fhir.CodeableConcept> legalStatusOfSupply) {
      this.legalStatusOfSupply = legalStatusOfSupply;
      this.legalStatusOfSupplyIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("combinedPharmaceuticalDoseForm")
    public void setCombinedPharmaceuticalDoseForm(java.util.Optional<com.fhir.CodeableConcept> combinedPharmaceuticalDoseForm) {
      this.combinedPharmaceuticalDoseForm = combinedPharmaceuticalDoseForm;
      this.combinedPharmaceuticalDoseFormIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("paediatricUseIndicator")
    public void setPaediatricUseIndicator(java.util.Optional<com.fhir.CodeableConcept> paediatricUseIndicator) {
      this.paediatricUseIndicator = paediatricUseIndicator;
      this.paediatricUseIndicatorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    public void setDomain(java.util.Optional<com.fhir.Coding> domain) {
      this.domain = domain;
      this.domainIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("text")
    public void setText(java.util.Optional<com.fhir.Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("crossReference")
    public void setCrossReference(java.util.Optional<java.util.List<com.fhir.Identifier>> crossReference) {
      this.crossReference = crossReference;
      this.crossReferenceIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("manufacturingBusinessOperation")
    public void setManufacturingBusinessOperation(java.util.Optional<java.util.List<com.fhir.MedicinalProduct_ManufacturingBusinessOperation>> manufacturingBusinessOperation) {
      this.manufacturingBusinessOperation = manufacturingBusinessOperation;
      this.manufacturingBusinessOperationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("meta")
    public void setMeta(java.util.Optional<com.fhir.Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("implicitRules")
    public void setImplicitRules(java.util.Optional<com.fhir.uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("additionalMonitoringIndicator")
    public void setAdditionalMonitoringIndicator(java.util.Optional<com.fhir.CodeableConcept> additionalMonitoringIndicator) {
      this.additionalMonitoringIndicator = additionalMonitoringIndicator;
      this.additionalMonitoringIndicatorIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("packagedMedicinalProduct")
    public void setPackagedMedicinalProduct(java.util.Optional<java.util.List<com.fhir.Reference>> packagedMedicinalProduct) {
      this.packagedMedicinalProduct = packagedMedicinalProduct;
      this.packagedMedicinalProductIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("attachedDocument")
    public void setAttachedDocument(java.util.Optional<java.util.List<com.fhir.Reference>> attachedDocument) {
      this.attachedDocument = attachedDocument;
      this.attachedDocumentIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("productClassification")
    public void setProductClassification(java.util.Optional<java.util.List<com.fhir.CodeableConcept>> productClassification) {
      this.productClassification = productClassification;
      this.productClassificationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public void setContact(java.util.Optional<java.util.List<com.fhir.Reference>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    public void setName(java.util.List<com.fhir.MedicinalProduct_Name> name) {
      this.name = name;
    }
    @Override
    public java.util.Optional<com.fhir.code> language() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<java.lang.String>> specialMeasures() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> clinicalTrial() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> masterFile() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.MedicinalProduct_SpecialDesignation>> specialDesignation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.MarketingStatus>> marketingStatus() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public java.lang.String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> pharmaceuticalProduct() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.id> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> identifier() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> legalStatusOfSupply() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> combinedPharmaceuticalDoseForm() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> paediatricUseIndicator() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Coding> domain() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Identifier>> crossReference() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.MedicinalProduct_ManufacturingBusinessOperation>> manufacturingBusinessOperation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.CodeableConcept> additionalMonitoringIndicator() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> packagedMedicinalProduct() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> attachedDocument() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CodeableConcept>> productClassification() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Reference>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.List<com.fhir.MedicinalProduct_Name> name() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableMedicinalProduct fromJson(Json json) {
    ImmutableMedicinalProduct.Builder builder = ((ImmutableMedicinalProduct.Builder) ImmutableMedicinalProduct.builder());
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.specialMeasuresIsSet) {
      builder.specialMeasures(json.specialMeasures);
    }
    if (json.clinicalTrialIsSet) {
      builder.clinicalTrial(json.clinicalTrial);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.masterFileIsSet) {
      builder.masterFile(json.masterFile);
    }
    if (json.specialDesignationIsSet) {
      builder.specialDesignation(json.specialDesignation);
    }
    if (json.marketingStatusIsSet) {
      builder.marketingStatus(json.marketingStatus);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.pharmaceuticalProductIsSet) {
      builder.pharmaceuticalProduct(json.pharmaceuticalProduct);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.legalStatusOfSupplyIsSet) {
      builder.legalStatusOfSupply(json.legalStatusOfSupply);
    }
    if (json.combinedPharmaceuticalDoseFormIsSet) {
      builder.combinedPharmaceuticalDoseForm(json.combinedPharmaceuticalDoseForm);
    }
    if (json.paediatricUseIndicatorIsSet) {
      builder.paediatricUseIndicator(json.paediatricUseIndicator);
    }
    if (json.domainIsSet) {
      builder.domain(json.domain);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.crossReferenceIsSet) {
      builder.crossReference(json.crossReference);
    }
    if (json.manufacturingBusinessOperationIsSet) {
      builder.manufacturingBusinessOperation(json.manufacturingBusinessOperation);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.additionalMonitoringIndicatorIsSet) {
      builder.additionalMonitoringIndicator(json.additionalMonitoringIndicator);
    }
    if (json.packagedMedicinalProductIsSet) {
      builder.packagedMedicinalProduct(json.packagedMedicinalProduct);
    }
    if (json.attachedDocumentIsSet) {
      builder.attachedDocument(json.attachedDocument);
    }
    if (json.productClassificationIsSet) {
      builder.productClassification(json.productClassification);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.name != null) {
      builder.addAllName(json.name);
    }
    return (ImmutableMedicinalProduct) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link MedicinalProduct} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable MedicinalProduct instance
   */
  public static MedicinalProduct copyOf(MedicinalProduct instance) {
    if (instance instanceof ImmutableMedicinalProduct) {
      return (ImmutableMedicinalProduct) instance;
    }
    return ((ImmutableMedicinalProduct.Builder) ImmutableMedicinalProduct.builder())
        .language(instance.language())
        .modifierExtension(instance.modifierExtension())
        .specialMeasures(instance.specialMeasures())
        .clinicalTrial(instance.clinicalTrial())
        .extension(instance.extension())
        .masterFile(instance.masterFile())
        .specialDesignation(instance.specialDesignation())
        .marketingStatus(instance.marketingStatus())
        .contained(instance.contained())
        .resourceType(instance.resourceType())
        .pharmaceuticalProduct(instance.pharmaceuticalProduct())
        .id(instance.id())
        .identifier(instance.identifier())
        .legalStatusOfSupply(instance.legalStatusOfSupply())
        .combinedPharmaceuticalDoseForm(instance.combinedPharmaceuticalDoseForm())
        .paediatricUseIndicator(instance.paediatricUseIndicator())
        .domain(instance.domain())
        .text(instance.text())
        .crossReference(instance.crossReference())
        .manufacturingBusinessOperation(instance.manufacturingBusinessOperation())
        .type(instance.type())
        .meta(instance.meta())
        .implicitRules(instance.implicitRules())
        .additionalMonitoringIndicator(instance.additionalMonitoringIndicator())
        .packagedMedicinalProduct(instance.packagedMedicinalProduct())
        .attachedDocument(instance.attachedDocument())
        .productClassification(instance.productClassification())
        .contact(instance.contact())
        .addAllName(instance.name())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProduct MedicinalProduct}.
   * <pre>
   * ImmutableMedicinalProduct.builder()
   *    .language(com.fhir.code) // optional {@link MedicinalProduct#language() language}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicinalProduct#modifierExtension() modifierExtension}
   *    .specialMeasures(List&amp;lt;String&amp;gt;) // optional {@link MedicinalProduct#specialMeasures() specialMeasures}
   *    .clinicalTrial(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicinalProduct#clinicalTrial() clinicalTrial}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link MedicinalProduct#extension() extension}
   *    .masterFile(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicinalProduct#masterFile() masterFile}
   *    .specialDesignation(List&amp;lt;com.fhir.MedicinalProduct_SpecialDesignation&amp;gt;) // optional {@link MedicinalProduct#specialDesignation() specialDesignation}
   *    .marketingStatus(List&amp;lt;com.fhir.MarketingStatus&amp;gt;) // optional {@link MedicinalProduct#marketingStatus() marketingStatus}
   *    .contained(List&amp;lt;com.fhir.ResourceList&amp;gt;) // optional {@link MedicinalProduct#contained() contained}
   *    .resourceType(String) // required {@link MedicinalProduct#resourceType() resourceType}
   *    .pharmaceuticalProduct(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicinalProduct#pharmaceuticalProduct() pharmaceuticalProduct}
   *    .id(com.fhir.id) // optional {@link MedicinalProduct#id() id}
   *    .identifier(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link MedicinalProduct#identifier() identifier}
   *    .legalStatusOfSupply(com.fhir.CodeableConcept) // optional {@link MedicinalProduct#legalStatusOfSupply() legalStatusOfSupply}
   *    .combinedPharmaceuticalDoseForm(com.fhir.CodeableConcept) // optional {@link MedicinalProduct#combinedPharmaceuticalDoseForm() combinedPharmaceuticalDoseForm}
   *    .paediatricUseIndicator(com.fhir.CodeableConcept) // optional {@link MedicinalProduct#paediatricUseIndicator() paediatricUseIndicator}
   *    .domain(com.fhir.Coding) // optional {@link MedicinalProduct#domain() domain}
   *    .text(com.fhir.Narrative) // optional {@link MedicinalProduct#text() text}
   *    .crossReference(List&amp;lt;com.fhir.Identifier&amp;gt;) // optional {@link MedicinalProduct#crossReference() crossReference}
   *    .manufacturingBusinessOperation(List&amp;lt;com.fhir.MedicinalProduct_ManufacturingBusinessOperation&amp;gt;) // optional {@link MedicinalProduct#manufacturingBusinessOperation() manufacturingBusinessOperation}
   *    .type(com.fhir.CodeableConcept) // optional {@link MedicinalProduct#type() type}
   *    .meta(com.fhir.Meta) // optional {@link MedicinalProduct#meta() meta}
   *    .implicitRules(com.fhir.uri) // optional {@link MedicinalProduct#implicitRules() implicitRules}
   *    .additionalMonitoringIndicator(com.fhir.CodeableConcept) // optional {@link MedicinalProduct#additionalMonitoringIndicator() additionalMonitoringIndicator}
   *    .packagedMedicinalProduct(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicinalProduct#packagedMedicinalProduct() packagedMedicinalProduct}
   *    .attachedDocument(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicinalProduct#attachedDocument() attachedDocument}
   *    .productClassification(List&amp;lt;com.fhir.CodeableConcept&amp;gt;) // optional {@link MedicinalProduct#productClassification() productClassification}
   *    .contact(List&amp;lt;com.fhir.Reference&amp;gt;) // optional {@link MedicinalProduct#contact() contact}
   *    .addName|addAllName(com.fhir.MedicinalProduct_Name) // {@link MedicinalProduct#name() name} elements
   *    .build();
   * </pre>
   * @return A new MedicinalProduct builder
   */
  public static ResourceTypeBuildStage builder() {
    return new ImmutableMedicinalProduct.Builder();
  }

  /**
   * Builds instances of type {@link MedicinalProduct MedicinalProduct}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "MedicinalProduct", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_LANGUAGE = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_SPECIAL_MEASURES = 0x4L;
    private static final long OPT_BIT_CLINICAL_TRIAL = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private static final long OPT_BIT_MASTER_FILE = 0x20L;
    private static final long OPT_BIT_SPECIAL_DESIGNATION = 0x40L;
    private static final long OPT_BIT_MARKETING_STATUS = 0x80L;
    private static final long OPT_BIT_CONTAINED = 0x100L;
    private static final long OPT_BIT_PHARMACEUTICAL_PRODUCT = 0x200L;
    private static final long OPT_BIT_ID = 0x400L;
    private static final long OPT_BIT_IDENTIFIER = 0x800L;
    private static final long OPT_BIT_LEGAL_STATUS_OF_SUPPLY = 0x1000L;
    private static final long OPT_BIT_COMBINED_PHARMACEUTICAL_DOSE_FORM = 0x2000L;
    private static final long OPT_BIT_PAEDIATRIC_USE_INDICATOR = 0x4000L;
    private static final long OPT_BIT_DOMAIN = 0x8000L;
    private static final long OPT_BIT_TEXT = 0x10000L;
    private static final long OPT_BIT_CROSS_REFERENCE = 0x20000L;
    private static final long OPT_BIT_MANUFACTURING_BUSINESS_OPERATION = 0x40000L;
    private static final long OPT_BIT_TYPE = 0x80000L;
    private static final long OPT_BIT_META = 0x100000L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x200000L;
    private static final long OPT_BIT_ADDITIONAL_MONITORING_INDICATOR = 0x400000L;
    private static final long OPT_BIT_PACKAGED_MEDICINAL_PRODUCT = 0x800000L;
    private static final long OPT_BIT_ATTACHED_DOCUMENT = 0x1000000L;
    private static final long OPT_BIT_PRODUCT_CLASSIFICATION = 0x2000000L;
    private static final long OPT_BIT_CONTACT = 0x4000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @javax.annotation.Nullable com.fhir.code language;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.util.List<java.lang.String> specialMeasures;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> clinicalTrial;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> masterFile;
    private @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProduct_SpecialDesignation> specialDesignation;
    private @javax.annotation.Nullable java.util.List<com.fhir.MarketingStatus> marketingStatus;
    private @javax.annotation.Nullable java.util.List<com.fhir.ResourceList> contained;
    private @javax.annotation.Nullable java.lang.String resourceType;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> pharmaceuticalProduct;
    private @javax.annotation.Nullable com.fhir.id id;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> identifier;
    private @javax.annotation.Nullable com.fhir.CodeableConcept legalStatusOfSupply;
    private @javax.annotation.Nullable com.fhir.CodeableConcept combinedPharmaceuticalDoseForm;
    private @javax.annotation.Nullable com.fhir.CodeableConcept paediatricUseIndicator;
    private @javax.annotation.Nullable com.fhir.Coding domain;
    private @javax.annotation.Nullable com.fhir.Narrative text;
    private @javax.annotation.Nullable java.util.List<com.fhir.Identifier> crossReference;
    private @javax.annotation.Nullable java.util.List<com.fhir.MedicinalProduct_ManufacturingBusinessOperation> manufacturingBusinessOperation;
    private @javax.annotation.Nullable com.fhir.CodeableConcept type;
    private @javax.annotation.Nullable com.fhir.Meta meta;
    private @javax.annotation.Nullable com.fhir.uri implicitRules;
    private @javax.annotation.Nullable com.fhir.CodeableConcept additionalMonitoringIndicator;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> packagedMedicinalProduct;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> attachedDocument;
    private @javax.annotation.Nullable java.util.List<com.fhir.CodeableConcept> productClassification;
    private @javax.annotation.Nullable java.util.List<com.fhir.Reference> contact;
    private final java.util.List<com.fhir.MedicinalProduct_Name> name = new java.util.ArrayList<com.fhir.MedicinalProduct_Name>();

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProduct#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProduct#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProduct#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProduct#specialMeasures() specialMeasures} to specialMeasures.
     * @param specialMeasures The value for specialMeasures
     * @return {@code this} builder for chained invocation
     */
    public final Builder specialMeasures(java.util.List<java.lang.String> specialMeasures) {
      checkNotIsSet(specialMeasuresIsSet(), "specialMeasures");
      this.specialMeasures = java.util.Objects.requireNonNull(specialMeasures, "specialMeasures");
      optBits |= OPT_BIT_SPECIAL_MEASURES;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#specialMeasures() specialMeasures} to specialMeasures.
     * @param specialMeasures The value for specialMeasures
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("specialMeasures")
    public final Builder specialMeasures(java.util.Optional<? extends java.util.List<java.lang.String>> specialMeasures) {
      checkNotIsSet(specialMeasuresIsSet(), "specialMeasures");
      this.specialMeasures = specialMeasures.orElse(null);
      optBits |= OPT_BIT_SPECIAL_MEASURES;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#clinicalTrial() clinicalTrial} to clinicalTrial.
     * @param clinicalTrial The value for clinicalTrial
     * @return {@code this} builder for chained invocation
     */
    public final Builder clinicalTrial(java.util.List<com.fhir.Reference> clinicalTrial) {
      checkNotIsSet(clinicalTrialIsSet(), "clinicalTrial");
      this.clinicalTrial = java.util.Objects.requireNonNull(clinicalTrial, "clinicalTrial");
      optBits |= OPT_BIT_CLINICAL_TRIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#clinicalTrial() clinicalTrial} to clinicalTrial.
     * @param clinicalTrial The value for clinicalTrial
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("clinicalTrial")
    public final Builder clinicalTrial(java.util.Optional<? extends java.util.List<com.fhir.Reference>> clinicalTrial) {
      checkNotIsSet(clinicalTrialIsSet(), "clinicalTrial");
      this.clinicalTrial = clinicalTrial.orElse(null);
      optBits |= OPT_BIT_CLINICAL_TRIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProduct#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProduct#masterFile() masterFile} to masterFile.
     * @param masterFile The value for masterFile
     * @return {@code this} builder for chained invocation
     */
    public final Builder masterFile(java.util.List<com.fhir.Reference> masterFile) {
      checkNotIsSet(masterFileIsSet(), "masterFile");
      this.masterFile = java.util.Objects.requireNonNull(masterFile, "masterFile");
      optBits |= OPT_BIT_MASTER_FILE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#masterFile() masterFile} to masterFile.
     * @param masterFile The value for masterFile
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("masterFile")
    public final Builder masterFile(java.util.Optional<? extends java.util.List<com.fhir.Reference>> masterFile) {
      checkNotIsSet(masterFileIsSet(), "masterFile");
      this.masterFile = masterFile.orElse(null);
      optBits |= OPT_BIT_MASTER_FILE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#specialDesignation() specialDesignation} to specialDesignation.
     * @param specialDesignation The value for specialDesignation
     * @return {@code this} builder for chained invocation
     */
    public final Builder specialDesignation(java.util.List<com.fhir.MedicinalProduct_SpecialDesignation> specialDesignation) {
      checkNotIsSet(specialDesignationIsSet(), "specialDesignation");
      this.specialDesignation = java.util.Objects.requireNonNull(specialDesignation, "specialDesignation");
      optBits |= OPT_BIT_SPECIAL_DESIGNATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#specialDesignation() specialDesignation} to specialDesignation.
     * @param specialDesignation The value for specialDesignation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("specialDesignation")
    public final Builder specialDesignation(java.util.Optional<? extends java.util.List<com.fhir.MedicinalProduct_SpecialDesignation>> specialDesignation) {
      checkNotIsSet(specialDesignationIsSet(), "specialDesignation");
      this.specialDesignation = specialDesignation.orElse(null);
      optBits |= OPT_BIT_SPECIAL_DESIGNATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#marketingStatus() marketingStatus} to marketingStatus.
     * @param marketingStatus The value for marketingStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder marketingStatus(java.util.List<com.fhir.MarketingStatus> marketingStatus) {
      checkNotIsSet(marketingStatusIsSet(), "marketingStatus");
      this.marketingStatus = java.util.Objects.requireNonNull(marketingStatus, "marketingStatus");
      optBits |= OPT_BIT_MARKETING_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#marketingStatus() marketingStatus} to marketingStatus.
     * @param marketingStatus The value for marketingStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("marketingStatus")
    public final Builder marketingStatus(java.util.Optional<? extends java.util.List<com.fhir.MarketingStatus>> marketingStatus) {
      checkNotIsSet(marketingStatusIsSet(), "marketingStatus");
      this.marketingStatus = marketingStatus.orElse(null);
      optBits |= OPT_BIT_MARKETING_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProduct#contained() contained} to contained.
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
     * Initializes the value for the {@link MedicinalProduct#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link MedicinalProduct#pharmaceuticalProduct() pharmaceuticalProduct} to pharmaceuticalProduct.
     * @param pharmaceuticalProduct The value for pharmaceuticalProduct
     * @return {@code this} builder for chained invocation
     */
    public final Builder pharmaceuticalProduct(java.util.List<com.fhir.Reference> pharmaceuticalProduct) {
      checkNotIsSet(pharmaceuticalProductIsSet(), "pharmaceuticalProduct");
      this.pharmaceuticalProduct = java.util.Objects.requireNonNull(pharmaceuticalProduct, "pharmaceuticalProduct");
      optBits |= OPT_BIT_PHARMACEUTICAL_PRODUCT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#pharmaceuticalProduct() pharmaceuticalProduct} to pharmaceuticalProduct.
     * @param pharmaceuticalProduct The value for pharmaceuticalProduct
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("pharmaceuticalProduct")
    public final Builder pharmaceuticalProduct(java.util.Optional<? extends java.util.List<com.fhir.Reference>> pharmaceuticalProduct) {
      checkNotIsSet(pharmaceuticalProductIsSet(), "pharmaceuticalProduct");
      this.pharmaceuticalProduct = pharmaceuticalProduct.orElse(null);
      optBits |= OPT_BIT_PHARMACEUTICAL_PRODUCT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProduct#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProduct#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MedicinalProduct#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MedicinalProduct#legalStatusOfSupply() legalStatusOfSupply} to legalStatusOfSupply.
     * @param legalStatusOfSupply The value for legalStatusOfSupply
     * @return {@code this} builder for chained invocation
     */
    public final Builder legalStatusOfSupply(com.fhir.CodeableConcept legalStatusOfSupply) {
      checkNotIsSet(legalStatusOfSupplyIsSet(), "legalStatusOfSupply");
      this.legalStatusOfSupply = java.util.Objects.requireNonNull(legalStatusOfSupply, "legalStatusOfSupply");
      optBits |= OPT_BIT_LEGAL_STATUS_OF_SUPPLY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#legalStatusOfSupply() legalStatusOfSupply} to legalStatusOfSupply.
     * @param legalStatusOfSupply The value for legalStatusOfSupply
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("legalStatusOfSupply")
    public final Builder legalStatusOfSupply(java.util.Optional<? extends com.fhir.CodeableConcept> legalStatusOfSupply) {
      checkNotIsSet(legalStatusOfSupplyIsSet(), "legalStatusOfSupply");
      this.legalStatusOfSupply = legalStatusOfSupply.orElse(null);
      optBits |= OPT_BIT_LEGAL_STATUS_OF_SUPPLY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#combinedPharmaceuticalDoseForm() combinedPharmaceuticalDoseForm} to combinedPharmaceuticalDoseForm.
     * @param combinedPharmaceuticalDoseForm The value for combinedPharmaceuticalDoseForm
     * @return {@code this} builder for chained invocation
     */
    public final Builder combinedPharmaceuticalDoseForm(com.fhir.CodeableConcept combinedPharmaceuticalDoseForm) {
      checkNotIsSet(combinedPharmaceuticalDoseFormIsSet(), "combinedPharmaceuticalDoseForm");
      this.combinedPharmaceuticalDoseForm = java.util.Objects.requireNonNull(combinedPharmaceuticalDoseForm, "combinedPharmaceuticalDoseForm");
      optBits |= OPT_BIT_COMBINED_PHARMACEUTICAL_DOSE_FORM;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#combinedPharmaceuticalDoseForm() combinedPharmaceuticalDoseForm} to combinedPharmaceuticalDoseForm.
     * @param combinedPharmaceuticalDoseForm The value for combinedPharmaceuticalDoseForm
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("combinedPharmaceuticalDoseForm")
    public final Builder combinedPharmaceuticalDoseForm(java.util.Optional<? extends com.fhir.CodeableConcept> combinedPharmaceuticalDoseForm) {
      checkNotIsSet(combinedPharmaceuticalDoseFormIsSet(), "combinedPharmaceuticalDoseForm");
      this.combinedPharmaceuticalDoseForm = combinedPharmaceuticalDoseForm.orElse(null);
      optBits |= OPT_BIT_COMBINED_PHARMACEUTICAL_DOSE_FORM;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#paediatricUseIndicator() paediatricUseIndicator} to paediatricUseIndicator.
     * @param paediatricUseIndicator The value for paediatricUseIndicator
     * @return {@code this} builder for chained invocation
     */
    public final Builder paediatricUseIndicator(com.fhir.CodeableConcept paediatricUseIndicator) {
      checkNotIsSet(paediatricUseIndicatorIsSet(), "paediatricUseIndicator");
      this.paediatricUseIndicator = java.util.Objects.requireNonNull(paediatricUseIndicator, "paediatricUseIndicator");
      optBits |= OPT_BIT_PAEDIATRIC_USE_INDICATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#paediatricUseIndicator() paediatricUseIndicator} to paediatricUseIndicator.
     * @param paediatricUseIndicator The value for paediatricUseIndicator
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("paediatricUseIndicator")
    public final Builder paediatricUseIndicator(java.util.Optional<? extends com.fhir.CodeableConcept> paediatricUseIndicator) {
      checkNotIsSet(paediatricUseIndicatorIsSet(), "paediatricUseIndicator");
      this.paediatricUseIndicator = paediatricUseIndicator.orElse(null);
      optBits |= OPT_BIT_PAEDIATRIC_USE_INDICATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#domain() domain} to domain.
     * @param domain The value for domain
     * @return {@code this} builder for chained invocation
     */
    public final Builder domain(com.fhir.Coding domain) {
      checkNotIsSet(domainIsSet(), "domain");
      this.domain = java.util.Objects.requireNonNull(domain, "domain");
      optBits |= OPT_BIT_DOMAIN;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#domain() domain} to domain.
     * @param domain The value for domain
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("domain")
    public final Builder domain(java.util.Optional<? extends com.fhir.Coding> domain) {
      checkNotIsSet(domainIsSet(), "domain");
      this.domain = domain.orElse(null);
      optBits |= OPT_BIT_DOMAIN;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#text() text} to text.
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
     * Initializes the optional value {@link MedicinalProduct#text() text} to text.
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
     * Initializes the optional value {@link MedicinalProduct#crossReference() crossReference} to crossReference.
     * @param crossReference The value for crossReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder crossReference(java.util.List<com.fhir.Identifier> crossReference) {
      checkNotIsSet(crossReferenceIsSet(), "crossReference");
      this.crossReference = java.util.Objects.requireNonNull(crossReference, "crossReference");
      optBits |= OPT_BIT_CROSS_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#crossReference() crossReference} to crossReference.
     * @param crossReference The value for crossReference
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("crossReference")
    public final Builder crossReference(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> crossReference) {
      checkNotIsSet(crossReferenceIsSet(), "crossReference");
      this.crossReference = crossReference.orElse(null);
      optBits |= OPT_BIT_CROSS_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#manufacturingBusinessOperation() manufacturingBusinessOperation} to manufacturingBusinessOperation.
     * @param manufacturingBusinessOperation The value for manufacturingBusinessOperation
     * @return {@code this} builder for chained invocation
     */
    public final Builder manufacturingBusinessOperation(java.util.List<com.fhir.MedicinalProduct_ManufacturingBusinessOperation> manufacturingBusinessOperation) {
      checkNotIsSet(manufacturingBusinessOperationIsSet(), "manufacturingBusinessOperation");
      this.manufacturingBusinessOperation = java.util.Objects.requireNonNull(manufacturingBusinessOperation, "manufacturingBusinessOperation");
      optBits |= OPT_BIT_MANUFACTURING_BUSINESS_OPERATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#manufacturingBusinessOperation() manufacturingBusinessOperation} to manufacturingBusinessOperation.
     * @param manufacturingBusinessOperation The value for manufacturingBusinessOperation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("manufacturingBusinessOperation")
    public final Builder manufacturingBusinessOperation(java.util.Optional<? extends java.util.List<com.fhir.MedicinalProduct_ManufacturingBusinessOperation>> manufacturingBusinessOperation) {
      checkNotIsSet(manufacturingBusinessOperationIsSet(), "manufacturingBusinessOperation");
      this.manufacturingBusinessOperation = manufacturingBusinessOperation.orElse(null);
      optBits |= OPT_BIT_MANUFACTURING_BUSINESS_OPERATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#type() type} to type.
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
     * Initializes the optional value {@link MedicinalProduct#type() type} to type.
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
     * Initializes the optional value {@link MedicinalProduct#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicinalProduct#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicinalProduct#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProduct#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProduct#additionalMonitoringIndicator() additionalMonitoringIndicator} to additionalMonitoringIndicator.
     * @param additionalMonitoringIndicator The value for additionalMonitoringIndicator
     * @return {@code this} builder for chained invocation
     */
    public final Builder additionalMonitoringIndicator(com.fhir.CodeableConcept additionalMonitoringIndicator) {
      checkNotIsSet(additionalMonitoringIndicatorIsSet(), "additionalMonitoringIndicator");
      this.additionalMonitoringIndicator = java.util.Objects.requireNonNull(additionalMonitoringIndicator, "additionalMonitoringIndicator");
      optBits |= OPT_BIT_ADDITIONAL_MONITORING_INDICATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#additionalMonitoringIndicator() additionalMonitoringIndicator} to additionalMonitoringIndicator.
     * @param additionalMonitoringIndicator The value for additionalMonitoringIndicator
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("additionalMonitoringIndicator")
    public final Builder additionalMonitoringIndicator(java.util.Optional<? extends com.fhir.CodeableConcept> additionalMonitoringIndicator) {
      checkNotIsSet(additionalMonitoringIndicatorIsSet(), "additionalMonitoringIndicator");
      this.additionalMonitoringIndicator = additionalMonitoringIndicator.orElse(null);
      optBits |= OPT_BIT_ADDITIONAL_MONITORING_INDICATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#packagedMedicinalProduct() packagedMedicinalProduct} to packagedMedicinalProduct.
     * @param packagedMedicinalProduct The value for packagedMedicinalProduct
     * @return {@code this} builder for chained invocation
     */
    public final Builder packagedMedicinalProduct(java.util.List<com.fhir.Reference> packagedMedicinalProduct) {
      checkNotIsSet(packagedMedicinalProductIsSet(), "packagedMedicinalProduct");
      this.packagedMedicinalProduct = java.util.Objects.requireNonNull(packagedMedicinalProduct, "packagedMedicinalProduct");
      optBits |= OPT_BIT_PACKAGED_MEDICINAL_PRODUCT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#packagedMedicinalProduct() packagedMedicinalProduct} to packagedMedicinalProduct.
     * @param packagedMedicinalProduct The value for packagedMedicinalProduct
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("packagedMedicinalProduct")
    public final Builder packagedMedicinalProduct(java.util.Optional<? extends java.util.List<com.fhir.Reference>> packagedMedicinalProduct) {
      checkNotIsSet(packagedMedicinalProductIsSet(), "packagedMedicinalProduct");
      this.packagedMedicinalProduct = packagedMedicinalProduct.orElse(null);
      optBits |= OPT_BIT_PACKAGED_MEDICINAL_PRODUCT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#attachedDocument() attachedDocument} to attachedDocument.
     * @param attachedDocument The value for attachedDocument
     * @return {@code this} builder for chained invocation
     */
    public final Builder attachedDocument(java.util.List<com.fhir.Reference> attachedDocument) {
      checkNotIsSet(attachedDocumentIsSet(), "attachedDocument");
      this.attachedDocument = java.util.Objects.requireNonNull(attachedDocument, "attachedDocument");
      optBits |= OPT_BIT_ATTACHED_DOCUMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#attachedDocument() attachedDocument} to attachedDocument.
     * @param attachedDocument The value for attachedDocument
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("attachedDocument")
    public final Builder attachedDocument(java.util.Optional<? extends java.util.List<com.fhir.Reference>> attachedDocument) {
      checkNotIsSet(attachedDocumentIsSet(), "attachedDocument");
      this.attachedDocument = attachedDocument.orElse(null);
      optBits |= OPT_BIT_ATTACHED_DOCUMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#productClassification() productClassification} to productClassification.
     * @param productClassification The value for productClassification
     * @return {@code this} builder for chained invocation
     */
    public final Builder productClassification(java.util.List<com.fhir.CodeableConcept> productClassification) {
      checkNotIsSet(productClassificationIsSet(), "productClassification");
      this.productClassification = java.util.Objects.requireNonNull(productClassification, "productClassification");
      optBits |= OPT_BIT_PRODUCT_CLASSIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#productClassification() productClassification} to productClassification.
     * @param productClassification The value for productClassification
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("productClassification")
    public final Builder productClassification(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> productClassification) {
      checkNotIsSet(productClassificationIsSet(), "productClassification");
      this.productClassification = productClassification.orElse(null);
      optBits |= OPT_BIT_PRODUCT_CLASSIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    public final Builder contact(java.util.List<com.fhir.Reference> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = java.util.Objects.requireNonNull(contact, "contact");
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("contact")
    public final Builder contact(java.util.Optional<? extends java.util.List<com.fhir.Reference>> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = contact.orElse(null);
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Adds one element to {@link MedicinalProduct#name() name} list.
     * @param element A name element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addName(com.fhir.MedicinalProduct_Name element) {
      this.name.add(java.util.Objects.requireNonNull(element, "name element"));
      return this;
    }

    /**
     * Adds elements to {@link MedicinalProduct#name() name} list.
     * @param elements An array of name elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addName(com.fhir.MedicinalProduct_Name... elements) {
      for (com.fhir.MedicinalProduct_Name element : elements) {
        this.name.add(java.util.Objects.requireNonNull(element, "name element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link MedicinalProduct#name() name} list.
     * @param elements An iterable of name elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllName(Iterable<? extends com.fhir.MedicinalProduct_Name> elements) {
      for (com.fhir.MedicinalProduct_Name element : elements) {
        this.name.add(java.util.Objects.requireNonNull(element, "name element"));
      }
      return this;
    }

    /**
     * Builds a new {@link MedicinalProduct MedicinalProduct}.
     * @return An immutable instance of MedicinalProduct
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.MedicinalProduct build() {
      checkRequiredAttributes();
      return new ImmutableMedicinalProduct(
          language,
          modifierExtension,
          specialMeasures,
          clinicalTrial,
          extension,
          masterFile,
          specialDesignation,
          marketingStatus,
          contained,
          resourceType,
          pharmaceuticalProduct,
          id,
          identifier,
          legalStatusOfSupply,
          combinedPharmaceuticalDoseForm,
          paediatricUseIndicator,
          domain,
          text,
          crossReference,
          manufacturingBusinessOperation,
          type,
          meta,
          implicitRules,
          additionalMonitoringIndicator,
          packagedMedicinalProduct,
          attachedDocument,
          productClassification,
          contact,
          createUnmodifiableList(true, name));
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean specialMeasuresIsSet() {
      return (optBits & OPT_BIT_SPECIAL_MEASURES) != 0;
    }

    private boolean clinicalTrialIsSet() {
      return (optBits & OPT_BIT_CLINICAL_TRIAL) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean masterFileIsSet() {
      return (optBits & OPT_BIT_MASTER_FILE) != 0;
    }

    private boolean specialDesignationIsSet() {
      return (optBits & OPT_BIT_SPECIAL_DESIGNATION) != 0;
    }

    private boolean marketingStatusIsSet() {
      return (optBits & OPT_BIT_MARKETING_STATUS) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean pharmaceuticalProductIsSet() {
      return (optBits & OPT_BIT_PHARMACEUTICAL_PRODUCT) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean legalStatusOfSupplyIsSet() {
      return (optBits & OPT_BIT_LEGAL_STATUS_OF_SUPPLY) != 0;
    }

    private boolean combinedPharmaceuticalDoseFormIsSet() {
      return (optBits & OPT_BIT_COMBINED_PHARMACEUTICAL_DOSE_FORM) != 0;
    }

    private boolean paediatricUseIndicatorIsSet() {
      return (optBits & OPT_BIT_PAEDIATRIC_USE_INDICATOR) != 0;
    }

    private boolean domainIsSet() {
      return (optBits & OPT_BIT_DOMAIN) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean crossReferenceIsSet() {
      return (optBits & OPT_BIT_CROSS_REFERENCE) != 0;
    }

    private boolean manufacturingBusinessOperationIsSet() {
      return (optBits & OPT_BIT_MANUFACTURING_BUSINESS_OPERATION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean additionalMonitoringIndicatorIsSet() {
      return (optBits & OPT_BIT_ADDITIONAL_MONITORING_INDICATOR) != 0;
    }

    private boolean packagedMedicinalProductIsSet() {
      return (optBits & OPT_BIT_PACKAGED_MEDICINAL_PRODUCT) != 0;
    }

    private boolean attachedDocumentIsSet() {
      return (optBits & OPT_BIT_ATTACHED_DOCUMENT) != 0;
    }

    private boolean productClassificationIsSet() {
      return (optBits & OPT_BIT_PRODUCT_CLASSIFICATION) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of MedicinalProduct is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new java.lang.IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      java.util.List<String> attributes = new java.util.ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build MedicinalProduct, some of required attributes are not set " + attributes;
    }
  }

  @org.immutables.value.Generated(from = "MedicinalProduct", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProduct#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(java.lang.String resourceType);
  }

  @org.immutables.value.Generated(from = "MedicinalProduct", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicinalProduct#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(com.fhir.code language);

    /**
     * Initializes the optional value {@link MedicinalProduct#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(java.util.Optional<? extends com.fhir.code> language);

    /**
     * Initializes the optional value {@link MedicinalProduct#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(java.util.List<com.fhir.Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProduct#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProduct#specialMeasures() specialMeasures} to specialMeasures.
     * @param specialMeasures The value for specialMeasures
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specialMeasures(java.util.List<java.lang.String> specialMeasures);

    /**
     * Initializes the optional value {@link MedicinalProduct#specialMeasures() specialMeasures} to specialMeasures.
     * @param specialMeasures The value for specialMeasures
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specialMeasures(java.util.Optional<? extends java.util.List<java.lang.String>> specialMeasures);

    /**
     * Initializes the optional value {@link MedicinalProduct#clinicalTrial() clinicalTrial} to clinicalTrial.
     * @param clinicalTrial The value for clinicalTrial
     * @return {@code this} builder for chained invocation
     */
    BuildFinal clinicalTrial(java.util.List<com.fhir.Reference> clinicalTrial);

    /**
     * Initializes the optional value {@link MedicinalProduct#clinicalTrial() clinicalTrial} to clinicalTrial.
     * @param clinicalTrial The value for clinicalTrial
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal clinicalTrial(java.util.Optional<? extends java.util.List<com.fhir.Reference>> clinicalTrial);

    /**
     * Initializes the optional value {@link MedicinalProduct#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(java.util.List<com.fhir.Extension> extension);

    /**
     * Initializes the optional value {@link MedicinalProduct#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> extension);

    /**
     * Initializes the optional value {@link MedicinalProduct#masterFile() masterFile} to masterFile.
     * @param masterFile The value for masterFile
     * @return {@code this} builder for chained invocation
     */
    BuildFinal masterFile(java.util.List<com.fhir.Reference> masterFile);

    /**
     * Initializes the optional value {@link MedicinalProduct#masterFile() masterFile} to masterFile.
     * @param masterFile The value for masterFile
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal masterFile(java.util.Optional<? extends java.util.List<com.fhir.Reference>> masterFile);

    /**
     * Initializes the optional value {@link MedicinalProduct#specialDesignation() specialDesignation} to specialDesignation.
     * @param specialDesignation The value for specialDesignation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specialDesignation(java.util.List<com.fhir.MedicinalProduct_SpecialDesignation> specialDesignation);

    /**
     * Initializes the optional value {@link MedicinalProduct#specialDesignation() specialDesignation} to specialDesignation.
     * @param specialDesignation The value for specialDesignation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specialDesignation(java.util.Optional<? extends java.util.List<com.fhir.MedicinalProduct_SpecialDesignation>> specialDesignation);

    /**
     * Initializes the optional value {@link MedicinalProduct#marketingStatus() marketingStatus} to marketingStatus.
     * @param marketingStatus The value for marketingStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal marketingStatus(java.util.List<com.fhir.MarketingStatus> marketingStatus);

    /**
     * Initializes the optional value {@link MedicinalProduct#marketingStatus() marketingStatus} to marketingStatus.
     * @param marketingStatus The value for marketingStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal marketingStatus(java.util.Optional<? extends java.util.List<com.fhir.MarketingStatus>> marketingStatus);

    /**
     * Initializes the optional value {@link MedicinalProduct#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(java.util.List<com.fhir.ResourceList> contained);

    /**
     * Initializes the optional value {@link MedicinalProduct#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(java.util.Optional<? extends java.util.List<com.fhir.ResourceList>> contained);

    /**
     * Initializes the optional value {@link MedicinalProduct#pharmaceuticalProduct() pharmaceuticalProduct} to pharmaceuticalProduct.
     * @param pharmaceuticalProduct The value for pharmaceuticalProduct
     * @return {@code this} builder for chained invocation
     */
    BuildFinal pharmaceuticalProduct(java.util.List<com.fhir.Reference> pharmaceuticalProduct);

    /**
     * Initializes the optional value {@link MedicinalProduct#pharmaceuticalProduct() pharmaceuticalProduct} to pharmaceuticalProduct.
     * @param pharmaceuticalProduct The value for pharmaceuticalProduct
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal pharmaceuticalProduct(java.util.Optional<? extends java.util.List<com.fhir.Reference>> pharmaceuticalProduct);

    /**
     * Initializes the optional value {@link MedicinalProduct#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(com.fhir.id id);

    /**
     * Initializes the optional value {@link MedicinalProduct#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(java.util.Optional<? extends com.fhir.id> id);

    /**
     * Initializes the optional value {@link MedicinalProduct#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(java.util.List<com.fhir.Identifier> identifier);

    /**
     * Initializes the optional value {@link MedicinalProduct#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> identifier);

    /**
     * Initializes the optional value {@link MedicinalProduct#legalStatusOfSupply() legalStatusOfSupply} to legalStatusOfSupply.
     * @param legalStatusOfSupply The value for legalStatusOfSupply
     * @return {@code this} builder for chained invocation
     */
    BuildFinal legalStatusOfSupply(com.fhir.CodeableConcept legalStatusOfSupply);

    /**
     * Initializes the optional value {@link MedicinalProduct#legalStatusOfSupply() legalStatusOfSupply} to legalStatusOfSupply.
     * @param legalStatusOfSupply The value for legalStatusOfSupply
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal legalStatusOfSupply(java.util.Optional<? extends com.fhir.CodeableConcept> legalStatusOfSupply);

    /**
     * Initializes the optional value {@link MedicinalProduct#combinedPharmaceuticalDoseForm() combinedPharmaceuticalDoseForm} to combinedPharmaceuticalDoseForm.
     * @param combinedPharmaceuticalDoseForm The value for combinedPharmaceuticalDoseForm
     * @return {@code this} builder for chained invocation
     */
    BuildFinal combinedPharmaceuticalDoseForm(com.fhir.CodeableConcept combinedPharmaceuticalDoseForm);

    /**
     * Initializes the optional value {@link MedicinalProduct#combinedPharmaceuticalDoseForm() combinedPharmaceuticalDoseForm} to combinedPharmaceuticalDoseForm.
     * @param combinedPharmaceuticalDoseForm The value for combinedPharmaceuticalDoseForm
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal combinedPharmaceuticalDoseForm(java.util.Optional<? extends com.fhir.CodeableConcept> combinedPharmaceuticalDoseForm);

    /**
     * Initializes the optional value {@link MedicinalProduct#paediatricUseIndicator() paediatricUseIndicator} to paediatricUseIndicator.
     * @param paediatricUseIndicator The value for paediatricUseIndicator
     * @return {@code this} builder for chained invocation
     */
    BuildFinal paediatricUseIndicator(com.fhir.CodeableConcept paediatricUseIndicator);

    /**
     * Initializes the optional value {@link MedicinalProduct#paediatricUseIndicator() paediatricUseIndicator} to paediatricUseIndicator.
     * @param paediatricUseIndicator The value for paediatricUseIndicator
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal paediatricUseIndicator(java.util.Optional<? extends com.fhir.CodeableConcept> paediatricUseIndicator);

    /**
     * Initializes the optional value {@link MedicinalProduct#domain() domain} to domain.
     * @param domain The value for domain
     * @return {@code this} builder for chained invocation
     */
    BuildFinal domain(com.fhir.Coding domain);

    /**
     * Initializes the optional value {@link MedicinalProduct#domain() domain} to domain.
     * @param domain The value for domain
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal domain(java.util.Optional<? extends com.fhir.Coding> domain);

    /**
     * Initializes the optional value {@link MedicinalProduct#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(com.fhir.Narrative text);

    /**
     * Initializes the optional value {@link MedicinalProduct#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(java.util.Optional<? extends com.fhir.Narrative> text);

    /**
     * Initializes the optional value {@link MedicinalProduct#crossReference() crossReference} to crossReference.
     * @param crossReference The value for crossReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal crossReference(java.util.List<com.fhir.Identifier> crossReference);

    /**
     * Initializes the optional value {@link MedicinalProduct#crossReference() crossReference} to crossReference.
     * @param crossReference The value for crossReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal crossReference(java.util.Optional<? extends java.util.List<com.fhir.Identifier>> crossReference);

    /**
     * Initializes the optional value {@link MedicinalProduct#manufacturingBusinessOperation() manufacturingBusinessOperation} to manufacturingBusinessOperation.
     * @param manufacturingBusinessOperation The value for manufacturingBusinessOperation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal manufacturingBusinessOperation(java.util.List<com.fhir.MedicinalProduct_ManufacturingBusinessOperation> manufacturingBusinessOperation);

    /**
     * Initializes the optional value {@link MedicinalProduct#manufacturingBusinessOperation() manufacturingBusinessOperation} to manufacturingBusinessOperation.
     * @param manufacturingBusinessOperation The value for manufacturingBusinessOperation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal manufacturingBusinessOperation(java.util.Optional<? extends java.util.List<com.fhir.MedicinalProduct_ManufacturingBusinessOperation>> manufacturingBusinessOperation);

    /**
     * Initializes the optional value {@link MedicinalProduct#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(com.fhir.CodeableConcept type);

    /**
     * Initializes the optional value {@link MedicinalProduct#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(java.util.Optional<? extends com.fhir.CodeableConcept> type);

    /**
     * Initializes the optional value {@link MedicinalProduct#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(com.fhir.Meta meta);

    /**
     * Initializes the optional value {@link MedicinalProduct#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(java.util.Optional<? extends com.fhir.Meta> meta);

    /**
     * Initializes the optional value {@link MedicinalProduct#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(com.fhir.uri implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProduct#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(java.util.Optional<? extends com.fhir.uri> implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProduct#additionalMonitoringIndicator() additionalMonitoringIndicator} to additionalMonitoringIndicator.
     * @param additionalMonitoringIndicator The value for additionalMonitoringIndicator
     * @return {@code this} builder for chained invocation
     */
    BuildFinal additionalMonitoringIndicator(com.fhir.CodeableConcept additionalMonitoringIndicator);

    /**
     * Initializes the optional value {@link MedicinalProduct#additionalMonitoringIndicator() additionalMonitoringIndicator} to additionalMonitoringIndicator.
     * @param additionalMonitoringIndicator The value for additionalMonitoringIndicator
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal additionalMonitoringIndicator(java.util.Optional<? extends com.fhir.CodeableConcept> additionalMonitoringIndicator);

    /**
     * Initializes the optional value {@link MedicinalProduct#packagedMedicinalProduct() packagedMedicinalProduct} to packagedMedicinalProduct.
     * @param packagedMedicinalProduct The value for packagedMedicinalProduct
     * @return {@code this} builder for chained invocation
     */
    BuildFinal packagedMedicinalProduct(java.util.List<com.fhir.Reference> packagedMedicinalProduct);

    /**
     * Initializes the optional value {@link MedicinalProduct#packagedMedicinalProduct() packagedMedicinalProduct} to packagedMedicinalProduct.
     * @param packagedMedicinalProduct The value for packagedMedicinalProduct
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal packagedMedicinalProduct(java.util.Optional<? extends java.util.List<com.fhir.Reference>> packagedMedicinalProduct);

    /**
     * Initializes the optional value {@link MedicinalProduct#attachedDocument() attachedDocument} to attachedDocument.
     * @param attachedDocument The value for attachedDocument
     * @return {@code this} builder for chained invocation
     */
    BuildFinal attachedDocument(java.util.List<com.fhir.Reference> attachedDocument);

    /**
     * Initializes the optional value {@link MedicinalProduct#attachedDocument() attachedDocument} to attachedDocument.
     * @param attachedDocument The value for attachedDocument
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal attachedDocument(java.util.Optional<? extends java.util.List<com.fhir.Reference>> attachedDocument);

    /**
     * Initializes the optional value {@link MedicinalProduct#productClassification() productClassification} to productClassification.
     * @param productClassification The value for productClassification
     * @return {@code this} builder for chained invocation
     */
    BuildFinal productClassification(java.util.List<com.fhir.CodeableConcept> productClassification);

    /**
     * Initializes the optional value {@link MedicinalProduct#productClassification() productClassification} to productClassification.
     * @param productClassification The value for productClassification
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal productClassification(java.util.Optional<? extends java.util.List<com.fhir.CodeableConcept>> productClassification);

    /**
     * Initializes the optional value {@link MedicinalProduct#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(java.util.List<com.fhir.Reference> contact);

    /**
     * Initializes the optional value {@link MedicinalProduct#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(java.util.Optional<? extends java.util.List<com.fhir.Reference>> contact);

    /**
     * Adds one element to {@link MedicinalProduct#name() name} list.
     * @param element A name element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addName(com.fhir.MedicinalProduct_Name element);

    /**
     * Adds elements to {@link MedicinalProduct#name() name} list.
     * @param elements An array of name elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addName(com.fhir.MedicinalProduct_Name... elements);

    /**
     * Adds elements to {@link MedicinalProduct#name() name} list.
     * @param elements An iterable of name elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllName(Iterable<? extends com.fhir.MedicinalProduct_Name> elements);

    /**
     * Builds a new {@link MedicinalProduct MedicinalProduct}.
     * @return An immutable instance of MedicinalProduct
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicinalProduct build();
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

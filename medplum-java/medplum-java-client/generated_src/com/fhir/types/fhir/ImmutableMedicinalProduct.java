package com.fhir.types.fhir;

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
 * Immutable implementation of {@link MedicinalProduct}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableMedicinalProduct.builder()}.
 */
@Generated(from = "MedicinalProduct", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableMedicinalProduct implements MedicinalProduct {
  private final @Nullable Code language;
  private final @Nullable List<CodeableConcept> productClassification;
  private final @Nullable List<Reference> pharmaceuticalProduct;
  private final List<MedicinalProduct_Name> name;
  private final @Nullable List<Reference> contact;
  private final @Nullable List<MedicinalProduct_ManufacturingBusinessOperation> manufacturingBusinessOperation;
  private final @Nullable List<MarketingStatus> marketingStatus;
  private final @Nullable List<Reference> masterFile;
  private final @Nullable Coding domain;
  private final @Nullable List<MedicinalProduct_SpecialDesignation> specialDesignation;
  private final @Nullable Narrative text;
  private final @Nullable List<Reference> clinicalTrial;
  private final @Nullable Uri implicitRules;
  private final @Nullable List<Reference> attachedDocument;
  private final String resourceType;
  private final @Nullable CodeableConcept combinedPharmaceuticalDoseForm;
  private final @Nullable Id id;
  private final @Nullable List<String> specialMeasures;
  private final @Nullable List<ResourceList> contained;
  private final @Nullable CodeableConcept legalStatusOfSupply;
  private final @Nullable CodeableConcept additionalMonitoringIndicator;
  private final @Nullable List<Identifier> crossReference;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable CodeableConcept paediatricUseIndicator;
  private final @Nullable List<Reference> packagedMedicinalProduct;
  private final @Nullable CodeableConcept type;
  private final @Nullable Meta meta;
  private final @Nullable List<Identifier> identifier;
  private final @Nullable List<Extension> extension;

  private ImmutableMedicinalProduct(
      @Nullable Code language,
      @Nullable List<CodeableConcept> productClassification,
      @Nullable List<Reference> pharmaceuticalProduct,
      List<MedicinalProduct_Name> name,
      @Nullable List<Reference> contact,
      @Nullable List<MedicinalProduct_ManufacturingBusinessOperation> manufacturingBusinessOperation,
      @Nullable List<MarketingStatus> marketingStatus,
      @Nullable List<Reference> masterFile,
      @Nullable Coding domain,
      @Nullable List<MedicinalProduct_SpecialDesignation> specialDesignation,
      @Nullable Narrative text,
      @Nullable List<Reference> clinicalTrial,
      @Nullable Uri implicitRules,
      @Nullable List<Reference> attachedDocument,
      String resourceType,
      @Nullable CodeableConcept combinedPharmaceuticalDoseForm,
      @Nullable Id id,
      @Nullable List<String> specialMeasures,
      @Nullable List<ResourceList> contained,
      @Nullable CodeableConcept legalStatusOfSupply,
      @Nullable CodeableConcept additionalMonitoringIndicator,
      @Nullable List<Identifier> crossReference,
      @Nullable List<Extension> modifierExtension,
      @Nullable CodeableConcept paediatricUseIndicator,
      @Nullable List<Reference> packagedMedicinalProduct,
      @Nullable CodeableConcept type,
      @Nullable Meta meta,
      @Nullable List<Identifier> identifier,
      @Nullable List<Extension> extension) {
    this.language = language;
    this.productClassification = productClassification;
    this.pharmaceuticalProduct = pharmaceuticalProduct;
    this.name = name;
    this.contact = contact;
    this.manufacturingBusinessOperation = manufacturingBusinessOperation;
    this.marketingStatus = marketingStatus;
    this.masterFile = masterFile;
    this.domain = domain;
    this.specialDesignation = specialDesignation;
    this.text = text;
    this.clinicalTrial = clinicalTrial;
    this.implicitRules = implicitRules;
    this.attachedDocument = attachedDocument;
    this.resourceType = resourceType;
    this.combinedPharmaceuticalDoseForm = combinedPharmaceuticalDoseForm;
    this.id = id;
    this.specialMeasures = specialMeasures;
    this.contained = contained;
    this.legalStatusOfSupply = legalStatusOfSupply;
    this.additionalMonitoringIndicator = additionalMonitoringIndicator;
    this.crossReference = crossReference;
    this.modifierExtension = modifierExtension;
    this.paediatricUseIndicator = paediatricUseIndicator;
    this.packagedMedicinalProduct = packagedMedicinalProduct;
    this.type = type;
    this.meta = meta;
    this.identifier = identifier;
    this.extension = extension;
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
   * @return The value of the {@code productClassification} attribute
   */
  @JsonProperty("productClassification")
  @Override
  public Optional<List<CodeableConcept>> productClassification() {
    return Optional.ofNullable(productClassification);
  }

  /**
   * @return The value of the {@code pharmaceuticalProduct} attribute
   */
  @JsonProperty("pharmaceuticalProduct")
  @Override
  public Optional<List<Reference>> pharmaceuticalProduct() {
    return Optional.ofNullable(pharmaceuticalProduct);
  }

  /**
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public List<MedicinalProduct_Name> name() {
    return name;
  }

  /**
   * @return The value of the {@code contact} attribute
   */
  @JsonProperty("contact")
  @Override
  public Optional<List<Reference>> contact() {
    return Optional.ofNullable(contact);
  }

  /**
   * @return The value of the {@code manufacturingBusinessOperation} attribute
   */
  @JsonProperty("manufacturingBusinessOperation")
  @Override
  public Optional<List<MedicinalProduct_ManufacturingBusinessOperation>> manufacturingBusinessOperation() {
    return Optional.ofNullable(manufacturingBusinessOperation);
  }

  /**
   * @return The value of the {@code marketingStatus} attribute
   */
  @JsonProperty("marketingStatus")
  @Override
  public Optional<List<MarketingStatus>> marketingStatus() {
    return Optional.ofNullable(marketingStatus);
  }

  /**
   * @return The value of the {@code masterFile} attribute
   */
  @JsonProperty("masterFile")
  @Override
  public Optional<List<Reference>> masterFile() {
    return Optional.ofNullable(masterFile);
  }

  /**
   * @return The value of the {@code domain} attribute
   */
  @JsonProperty("domain")
  @Override
  public Optional<Coding> domain() {
    return Optional.ofNullable(domain);
  }

  /**
   * @return The value of the {@code specialDesignation} attribute
   */
  @JsonProperty("specialDesignation")
  @Override
  public Optional<List<MedicinalProduct_SpecialDesignation>> specialDesignation() {
    return Optional.ofNullable(specialDesignation);
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
   * @return The value of the {@code clinicalTrial} attribute
   */
  @JsonProperty("clinicalTrial")
  @Override
  public Optional<List<Reference>> clinicalTrial() {
    return Optional.ofNullable(clinicalTrial);
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
   * @return The value of the {@code attachedDocument} attribute
   */
  @JsonProperty("attachedDocument")
  @Override
  public Optional<List<Reference>> attachedDocument() {
    return Optional.ofNullable(attachedDocument);
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
   * @return The value of the {@code combinedPharmaceuticalDoseForm} attribute
   */
  @JsonProperty("combinedPharmaceuticalDoseForm")
  @Override
  public Optional<CodeableConcept> combinedPharmaceuticalDoseForm() {
    return Optional.ofNullable(combinedPharmaceuticalDoseForm);
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
   * @return The value of the {@code specialMeasures} attribute
   */
  @JsonProperty("specialMeasures")
  @Override
  public Optional<List<String>> specialMeasures() {
    return Optional.ofNullable(specialMeasures);
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
   * @return The value of the {@code legalStatusOfSupply} attribute
   */
  @JsonProperty("legalStatusOfSupply")
  @Override
  public Optional<CodeableConcept> legalStatusOfSupply() {
    return Optional.ofNullable(legalStatusOfSupply);
  }

  /**
   * @return The value of the {@code additionalMonitoringIndicator} attribute
   */
  @JsonProperty("additionalMonitoringIndicator")
  @Override
  public Optional<CodeableConcept> additionalMonitoringIndicator() {
    return Optional.ofNullable(additionalMonitoringIndicator);
  }

  /**
   * @return The value of the {@code crossReference} attribute
   */
  @JsonProperty("crossReference")
  @Override
  public Optional<List<Identifier>> crossReference() {
    return Optional.ofNullable(crossReference);
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
   * @return The value of the {@code paediatricUseIndicator} attribute
   */
  @JsonProperty("paediatricUseIndicator")
  @Override
  public Optional<CodeableConcept> paediatricUseIndicator() {
    return Optional.ofNullable(paediatricUseIndicator);
  }

  /**
   * @return The value of the {@code packagedMedicinalProduct} attribute
   */
  @JsonProperty("packagedMedicinalProduct")
  @Override
  public Optional<List<Reference>> packagedMedicinalProduct() {
    return Optional.ofNullable(packagedMedicinalProduct);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<CodeableConcept> type() {
    return Optional.ofNullable(type);
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
   * @return The value of the {@code identifier} attribute
   */
  @JsonProperty("identifier")
  @Override
  public Optional<List<Identifier>> identifier() {
    return Optional.ofNullable(identifier);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableMedicinalProduct(
        newValue,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableMedicinalProduct(
        value,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#productClassification() productClassification} attribute.
   * @param value The value for productClassification
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withProductClassification(List<CodeableConcept> value) {
    @Nullable List<CodeableConcept> newValue = Objects.requireNonNull(value, "productClassification");
    if (this.productClassification == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        newValue,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#productClassification() productClassification} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for productClassification
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withProductClassification(Optional<? extends List<CodeableConcept>> optional) {
    @Nullable List<CodeableConcept> value = optional.orElse(null);
    if (this.productClassification == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        value,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#pharmaceuticalProduct() pharmaceuticalProduct} attribute.
   * @param value The value for pharmaceuticalProduct
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withPharmaceuticalProduct(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "pharmaceuticalProduct");
    if (this.pharmaceuticalProduct == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        newValue,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#pharmaceuticalProduct() pharmaceuticalProduct} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for pharmaceuticalProduct
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withPharmaceuticalProduct(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.pharmaceuticalProduct == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        value,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MedicinalProduct#name() name}.
   * @param elements The elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withName(MedicinalProduct_Name... elements) {
    List<MedicinalProduct_Name> newValue = createUnmodifiableList(false, createSafeList(Arrays.asList(elements), true, false));
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        newValue,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object with elements that replace the content of {@link MedicinalProduct#name() name}.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param elements An iterable of name elements to set
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withName(Iterable<? extends MedicinalProduct_Name> elements) {
    if (this.name == elements) return this;
    List<MedicinalProduct_Name> newValue = createUnmodifiableList(false, createSafeList(elements, true, false));
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        newValue,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#contact() contact} attribute.
   * @param value The value for contact
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withContact(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "contact");
    if (this.contact == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        newValue,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#contact() contact} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contact
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withContact(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.contact == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        value,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#manufacturingBusinessOperation() manufacturingBusinessOperation} attribute.
   * @param value The value for manufacturingBusinessOperation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withManufacturingBusinessOperation(List<MedicinalProduct_ManufacturingBusinessOperation> value) {
    @Nullable List<MedicinalProduct_ManufacturingBusinessOperation> newValue = Objects.requireNonNull(value, "manufacturingBusinessOperation");
    if (this.manufacturingBusinessOperation == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        newValue,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#manufacturingBusinessOperation() manufacturingBusinessOperation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for manufacturingBusinessOperation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withManufacturingBusinessOperation(Optional<? extends List<MedicinalProduct_ManufacturingBusinessOperation>> optional) {
    @Nullable List<MedicinalProduct_ManufacturingBusinessOperation> value = optional.orElse(null);
    if (this.manufacturingBusinessOperation == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        value,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#marketingStatus() marketingStatus} attribute.
   * @param value The value for marketingStatus
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withMarketingStatus(List<MarketingStatus> value) {
    @Nullable List<MarketingStatus> newValue = Objects.requireNonNull(value, "marketingStatus");
    if (this.marketingStatus == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        newValue,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#marketingStatus() marketingStatus} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for marketingStatus
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withMarketingStatus(Optional<? extends List<MarketingStatus>> optional) {
    @Nullable List<MarketingStatus> value = optional.orElse(null);
    if (this.marketingStatus == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        value,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#masterFile() masterFile} attribute.
   * @param value The value for masterFile
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withMasterFile(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "masterFile");
    if (this.masterFile == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        newValue,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#masterFile() masterFile} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for masterFile
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withMasterFile(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.masterFile == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        value,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#domain() domain} attribute.
   * @param value The value for domain
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withDomain(Coding value) {
    @Nullable Coding newValue = Objects.requireNonNull(value, "domain");
    if (this.domain == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        newValue,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#domain() domain} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for domain
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withDomain(Optional<? extends Coding> optional) {
    @Nullable Coding value = optional.orElse(null);
    if (this.domain == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        value,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#specialDesignation() specialDesignation} attribute.
   * @param value The value for specialDesignation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withSpecialDesignation(List<MedicinalProduct_SpecialDesignation> value) {
    @Nullable List<MedicinalProduct_SpecialDesignation> newValue = Objects.requireNonNull(value, "specialDesignation");
    if (this.specialDesignation == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        newValue,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#specialDesignation() specialDesignation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specialDesignation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withSpecialDesignation(Optional<? extends List<MedicinalProduct_SpecialDesignation>> optional) {
    @Nullable List<MedicinalProduct_SpecialDesignation> value = optional.orElse(null);
    if (this.specialDesignation == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        value,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#text() text} attribute.
   * @param value The value for text
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withText(Narrative value) {
    @Nullable Narrative newValue = Objects.requireNonNull(value, "text");
    if (this.text == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        newValue,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#text() text} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for text
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withText(Optional<? extends Narrative> optional) {
    @Nullable Narrative value = optional.orElse(null);
    if (this.text == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        value,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#clinicalTrial() clinicalTrial} attribute.
   * @param value The value for clinicalTrial
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withClinicalTrial(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "clinicalTrial");
    if (this.clinicalTrial == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        newValue,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#clinicalTrial() clinicalTrial} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for clinicalTrial
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withClinicalTrial(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.clinicalTrial == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        value,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        newValue,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        value,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#attachedDocument() attachedDocument} attribute.
   * @param value The value for attachedDocument
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withAttachedDocument(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "attachedDocument");
    if (this.attachedDocument == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        newValue,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#attachedDocument() attachedDocument} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for attachedDocument
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withAttachedDocument(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.attachedDocument == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        value,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link MedicinalProduct#resourceType() resourceType} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for resourceType
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableMedicinalProduct withResourceType(String value) {
    String newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType.equals(newValue)) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        newValue,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#combinedPharmaceuticalDoseForm() combinedPharmaceuticalDoseForm} attribute.
   * @param value The value for combinedPharmaceuticalDoseForm
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withCombinedPharmaceuticalDoseForm(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "combinedPharmaceuticalDoseForm");
    if (this.combinedPharmaceuticalDoseForm == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        newValue,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#combinedPharmaceuticalDoseForm() combinedPharmaceuticalDoseForm} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for combinedPharmaceuticalDoseForm
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withCombinedPharmaceuticalDoseForm(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.combinedPharmaceuticalDoseForm == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        value,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        newValue,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        value,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#specialMeasures() specialMeasures} attribute.
   * @param value The value for specialMeasures
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withSpecialMeasures(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "specialMeasures");
    if (this.specialMeasures == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        newValue,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#specialMeasures() specialMeasures} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for specialMeasures
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withSpecialMeasures(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.specialMeasures == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        value,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#contained() contained} attribute.
   * @param value The value for contained
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withContained(List<ResourceList> value) {
    @Nullable List<ResourceList> newValue = Objects.requireNonNull(value, "contained");
    if (this.contained == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        newValue,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#contained() contained} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for contained
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withContained(Optional<? extends List<ResourceList>> optional) {
    @Nullable List<ResourceList> value = optional.orElse(null);
    if (this.contained == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        value,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#legalStatusOfSupply() legalStatusOfSupply} attribute.
   * @param value The value for legalStatusOfSupply
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withLegalStatusOfSupply(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "legalStatusOfSupply");
    if (this.legalStatusOfSupply == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        newValue,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#legalStatusOfSupply() legalStatusOfSupply} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for legalStatusOfSupply
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withLegalStatusOfSupply(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.legalStatusOfSupply == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        value,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#additionalMonitoringIndicator() additionalMonitoringIndicator} attribute.
   * @param value The value for additionalMonitoringIndicator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withAdditionalMonitoringIndicator(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "additionalMonitoringIndicator");
    if (this.additionalMonitoringIndicator == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        newValue,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#additionalMonitoringIndicator() additionalMonitoringIndicator} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for additionalMonitoringIndicator
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withAdditionalMonitoringIndicator(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.additionalMonitoringIndicator == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        value,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#crossReference() crossReference} attribute.
   * @param value The value for crossReference
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withCrossReference(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "crossReference");
    if (this.crossReference == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        newValue,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#crossReference() crossReference} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for crossReference
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withCrossReference(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.crossReference == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        value,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        newValue,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        value,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#paediatricUseIndicator() paediatricUseIndicator} attribute.
   * @param value The value for paediatricUseIndicator
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withPaediatricUseIndicator(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "paediatricUseIndicator");
    if (this.paediatricUseIndicator == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        newValue,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#paediatricUseIndicator() paediatricUseIndicator} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for paediatricUseIndicator
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withPaediatricUseIndicator(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.paediatricUseIndicator == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        value,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#packagedMedicinalProduct() packagedMedicinalProduct} attribute.
   * @param value The value for packagedMedicinalProduct
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withPackagedMedicinalProduct(List<Reference> value) {
    @Nullable List<Reference> newValue = Objects.requireNonNull(value, "packagedMedicinalProduct");
    if (this.packagedMedicinalProduct == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        newValue,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#packagedMedicinalProduct() packagedMedicinalProduct} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for packagedMedicinalProduct
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withPackagedMedicinalProduct(Optional<? extends List<Reference>> optional) {
    @Nullable List<Reference> value = optional.orElse(null);
    if (this.packagedMedicinalProduct == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        value,
        this.type,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withType(CodeableConcept value) {
    @Nullable CodeableConcept newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        newValue,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withType(Optional<? extends CodeableConcept> optional) {
    @Nullable CodeableConcept value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        value,
        this.meta,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        newValue,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        value,
        this.identifier,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#identifier() identifier} attribute.
   * @param value The value for identifier
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withIdentifier(List<Identifier> value) {
    @Nullable List<Identifier> newValue = Objects.requireNonNull(value, "identifier");
    if (this.identifier == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        newValue,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#identifier() identifier} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for identifier
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withIdentifier(Optional<? extends List<Identifier>> optional) {
    @Nullable List<Identifier> value = optional.orElse(null);
    if (this.identifier == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        value,
        this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link MedicinalProduct#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableMedicinalProduct withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link MedicinalProduct#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableMedicinalProduct withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableMedicinalProduct(
        this.language,
        this.productClassification,
        this.pharmaceuticalProduct,
        this.name,
        this.contact,
        this.manufacturingBusinessOperation,
        this.marketingStatus,
        this.masterFile,
        this.domain,
        this.specialDesignation,
        this.text,
        this.clinicalTrial,
        this.implicitRules,
        this.attachedDocument,
        this.resourceType,
        this.combinedPharmaceuticalDoseForm,
        this.id,
        this.specialMeasures,
        this.contained,
        this.legalStatusOfSupply,
        this.additionalMonitoringIndicator,
        this.crossReference,
        this.modifierExtension,
        this.paediatricUseIndicator,
        this.packagedMedicinalProduct,
        this.type,
        this.meta,
        this.identifier,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableMedicinalProduct} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableMedicinalProduct
        && equalTo((ImmutableMedicinalProduct) another);
  }

  private boolean equalTo(ImmutableMedicinalProduct another) {
    return Objects.equals(language, another.language)
        && Objects.equals(productClassification, another.productClassification)
        && Objects.equals(pharmaceuticalProduct, another.pharmaceuticalProduct)
        && name.equals(another.name)
        && Objects.equals(contact, another.contact)
        && Objects.equals(manufacturingBusinessOperation, another.manufacturingBusinessOperation)
        && Objects.equals(marketingStatus, another.marketingStatus)
        && Objects.equals(masterFile, another.masterFile)
        && Objects.equals(domain, another.domain)
        && Objects.equals(specialDesignation, another.specialDesignation)
        && Objects.equals(text, another.text)
        && Objects.equals(clinicalTrial, another.clinicalTrial)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(attachedDocument, another.attachedDocument)
        && resourceType.equals(another.resourceType)
        && Objects.equals(combinedPharmaceuticalDoseForm, another.combinedPharmaceuticalDoseForm)
        && Objects.equals(id, another.id)
        && Objects.equals(specialMeasures, another.specialMeasures)
        && Objects.equals(contained, another.contained)
        && Objects.equals(legalStatusOfSupply, another.legalStatusOfSupply)
        && Objects.equals(additionalMonitoringIndicator, another.additionalMonitoringIndicator)
        && Objects.equals(crossReference, another.crossReference)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(paediatricUseIndicator, another.paediatricUseIndicator)
        && Objects.equals(packagedMedicinalProduct, another.packagedMedicinalProduct)
        && Objects.equals(type, another.type)
        && Objects.equals(meta, another.meta)
        && Objects.equals(identifier, another.identifier)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code language}, {@code productClassification}, {@code pharmaceuticalProduct}, {@code name}, {@code contact}, {@code manufacturingBusinessOperation}, {@code marketingStatus}, {@code masterFile}, {@code domain}, {@code specialDesignation}, {@code text}, {@code clinicalTrial}, {@code implicitRules}, {@code attachedDocument}, {@code resourceType}, {@code combinedPharmaceuticalDoseForm}, {@code id}, {@code specialMeasures}, {@code contained}, {@code legalStatusOfSupply}, {@code additionalMonitoringIndicator}, {@code crossReference}, {@code modifierExtension}, {@code paediatricUseIndicator}, {@code packagedMedicinalProduct}, {@code type}, {@code meta}, {@code identifier}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(productClassification);
    h += (h << 5) + Objects.hashCode(pharmaceuticalProduct);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(contact);
    h += (h << 5) + Objects.hashCode(manufacturingBusinessOperation);
    h += (h << 5) + Objects.hashCode(marketingStatus);
    h += (h << 5) + Objects.hashCode(masterFile);
    h += (h << 5) + Objects.hashCode(domain);
    h += (h << 5) + Objects.hashCode(specialDesignation);
    h += (h << 5) + Objects.hashCode(text);
    h += (h << 5) + Objects.hashCode(clinicalTrial);
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(attachedDocument);
    h += (h << 5) + resourceType.hashCode();
    h += (h << 5) + Objects.hashCode(combinedPharmaceuticalDoseForm);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(specialMeasures);
    h += (h << 5) + Objects.hashCode(contained);
    h += (h << 5) + Objects.hashCode(legalStatusOfSupply);
    h += (h << 5) + Objects.hashCode(additionalMonitoringIndicator);
    h += (h << 5) + Objects.hashCode(crossReference);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(paediatricUseIndicator);
    h += (h << 5) + Objects.hashCode(packagedMedicinalProduct);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + Objects.hashCode(identifier);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code MedicinalProduct} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("MedicinalProduct{");
    if (language != null) {
      builder.append("language=").append(language);
    }
    if (productClassification != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("productClassification=").append(productClassification);
    }
    if (pharmaceuticalProduct != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("pharmaceuticalProduct=").append(pharmaceuticalProduct);
    }
    if (builder.length() > 17) builder.append(", ");
    builder.append("name=").append(name);
    if (contact != null) {
      builder.append(", ");
      builder.append("contact=").append(contact);
    }
    if (manufacturingBusinessOperation != null) {
      builder.append(", ");
      builder.append("manufacturingBusinessOperation=").append(manufacturingBusinessOperation);
    }
    if (marketingStatus != null) {
      builder.append(", ");
      builder.append("marketingStatus=").append(marketingStatus);
    }
    if (masterFile != null) {
      builder.append(", ");
      builder.append("masterFile=").append(masterFile);
    }
    if (domain != null) {
      builder.append(", ");
      builder.append("domain=").append(domain);
    }
    if (specialDesignation != null) {
      builder.append(", ");
      builder.append("specialDesignation=").append(specialDesignation);
    }
    if (text != null) {
      builder.append(", ");
      builder.append("text=").append(text);
    }
    if (clinicalTrial != null) {
      builder.append(", ");
      builder.append("clinicalTrial=").append(clinicalTrial);
    }
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (attachedDocument != null) {
      builder.append(", ");
      builder.append("attachedDocument=").append(attachedDocument);
    }
    builder.append(", ");
    builder.append("resourceType=").append(resourceType);
    if (combinedPharmaceuticalDoseForm != null) {
      builder.append(", ");
      builder.append("combinedPharmaceuticalDoseForm=").append(combinedPharmaceuticalDoseForm);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    if (specialMeasures != null) {
      builder.append(", ");
      builder.append("specialMeasures=").append(specialMeasures);
    }
    if (contained != null) {
      builder.append(", ");
      builder.append("contained=").append(contained);
    }
    if (legalStatusOfSupply != null) {
      builder.append(", ");
      builder.append("legalStatusOfSupply=").append(legalStatusOfSupply);
    }
    if (additionalMonitoringIndicator != null) {
      builder.append(", ");
      builder.append("additionalMonitoringIndicator=").append(additionalMonitoringIndicator);
    }
    if (crossReference != null) {
      builder.append(", ");
      builder.append("crossReference=").append(crossReference);
    }
    if (modifierExtension != null) {
      builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (paediatricUseIndicator != null) {
      builder.append(", ");
      builder.append("paediatricUseIndicator=").append(paediatricUseIndicator);
    }
    if (packagedMedicinalProduct != null) {
      builder.append(", ");
      builder.append("packagedMedicinalProduct=").append(packagedMedicinalProduct);
    }
    if (type != null) {
      builder.append(", ");
      builder.append("type=").append(type);
    }
    if (meta != null) {
      builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (identifier != null) {
      builder.append(", ");
      builder.append("identifier=").append(identifier);
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
  @Generated(from = "MedicinalProduct", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements MedicinalProduct {
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<List<CodeableConcept>> productClassification = Optional.empty();
    boolean productClassificationIsSet;
    @Nullable Optional<List<Reference>> pharmaceuticalProduct = Optional.empty();
    boolean pharmaceuticalProductIsSet;
    @Nullable List<MedicinalProduct_Name> name = Collections.emptyList();
    @Nullable Optional<List<Reference>> contact = Optional.empty();
    boolean contactIsSet;
    @Nullable Optional<List<MedicinalProduct_ManufacturingBusinessOperation>> manufacturingBusinessOperation = Optional.empty();
    boolean manufacturingBusinessOperationIsSet;
    @Nullable Optional<List<MarketingStatus>> marketingStatus = Optional.empty();
    boolean marketingStatusIsSet;
    @Nullable Optional<List<Reference>> masterFile = Optional.empty();
    boolean masterFileIsSet;
    @Nullable Optional<Coding> domain = Optional.empty();
    boolean domainIsSet;
    @Nullable Optional<List<MedicinalProduct_SpecialDesignation>> specialDesignation = Optional.empty();
    boolean specialDesignationIsSet;
    @Nullable Optional<Narrative> text = Optional.empty();
    boolean textIsSet;
    @Nullable Optional<List<Reference>> clinicalTrial = Optional.empty();
    boolean clinicalTrialIsSet;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<List<Reference>> attachedDocument = Optional.empty();
    boolean attachedDocumentIsSet;
    @Nullable String resourceType;
    @Nullable Optional<CodeableConcept> combinedPharmaceuticalDoseForm = Optional.empty();
    boolean combinedPharmaceuticalDoseFormIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<String>> specialMeasures = Optional.empty();
    boolean specialMeasuresIsSet;
    @Nullable Optional<List<ResourceList>> contained = Optional.empty();
    boolean containedIsSet;
    @Nullable Optional<CodeableConcept> legalStatusOfSupply = Optional.empty();
    boolean legalStatusOfSupplyIsSet;
    @Nullable Optional<CodeableConcept> additionalMonitoringIndicator = Optional.empty();
    boolean additionalMonitoringIndicatorIsSet;
    @Nullable Optional<List<Identifier>> crossReference = Optional.empty();
    boolean crossReferenceIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<CodeableConcept> paediatricUseIndicator = Optional.empty();
    boolean paediatricUseIndicatorIsSet;
    @Nullable Optional<List<Reference>> packagedMedicinalProduct = Optional.empty();
    boolean packagedMedicinalProductIsSet;
    @Nullable Optional<CodeableConcept> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable Optional<List<Identifier>> identifier = Optional.empty();
    boolean identifierIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("productClassification")
    public void setProductClassification(Optional<List<CodeableConcept>> productClassification) {
      this.productClassification = productClassification;
      this.productClassificationIsSet = true;
    }
    @JsonProperty("pharmaceuticalProduct")
    public void setPharmaceuticalProduct(Optional<List<Reference>> pharmaceuticalProduct) {
      this.pharmaceuticalProduct = pharmaceuticalProduct;
      this.pharmaceuticalProductIsSet = true;
    }
    @JsonProperty("name")
    public void setName(List<MedicinalProduct_Name> name) {
      this.name = name;
    }
    @JsonProperty("contact")
    public void setContact(Optional<List<Reference>> contact) {
      this.contact = contact;
      this.contactIsSet = true;
    }
    @JsonProperty("manufacturingBusinessOperation")
    public void setManufacturingBusinessOperation(Optional<List<MedicinalProduct_ManufacturingBusinessOperation>> manufacturingBusinessOperation) {
      this.manufacturingBusinessOperation = manufacturingBusinessOperation;
      this.manufacturingBusinessOperationIsSet = true;
    }
    @JsonProperty("marketingStatus")
    public void setMarketingStatus(Optional<List<MarketingStatus>> marketingStatus) {
      this.marketingStatus = marketingStatus;
      this.marketingStatusIsSet = true;
    }
    @JsonProperty("masterFile")
    public void setMasterFile(Optional<List<Reference>> masterFile) {
      this.masterFile = masterFile;
      this.masterFileIsSet = true;
    }
    @JsonProperty("domain")
    public void setDomain(Optional<Coding> domain) {
      this.domain = domain;
      this.domainIsSet = true;
    }
    @JsonProperty("specialDesignation")
    public void setSpecialDesignation(Optional<List<MedicinalProduct_SpecialDesignation>> specialDesignation) {
      this.specialDesignation = specialDesignation;
      this.specialDesignationIsSet = true;
    }
    @JsonProperty("text")
    public void setText(Optional<Narrative> text) {
      this.text = text;
      this.textIsSet = true;
    }
    @JsonProperty("clinicalTrial")
    public void setClinicalTrial(Optional<List<Reference>> clinicalTrial) {
      this.clinicalTrial = clinicalTrial;
      this.clinicalTrialIsSet = true;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("attachedDocument")
    public void setAttachedDocument(Optional<List<Reference>> attachedDocument) {
      this.attachedDocument = attachedDocument;
      this.attachedDocumentIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
      this.resourceType = resourceType;
    }
    @JsonProperty("combinedPharmaceuticalDoseForm")
    public void setCombinedPharmaceuticalDoseForm(Optional<CodeableConcept> combinedPharmaceuticalDoseForm) {
      this.combinedPharmaceuticalDoseForm = combinedPharmaceuticalDoseForm;
      this.combinedPharmaceuticalDoseFormIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("specialMeasures")
    public void setSpecialMeasures(Optional<List<String>> specialMeasures) {
      this.specialMeasures = specialMeasures;
      this.specialMeasuresIsSet = true;
    }
    @JsonProperty("contained")
    public void setContained(Optional<List<ResourceList>> contained) {
      this.contained = contained;
      this.containedIsSet = true;
    }
    @JsonProperty("legalStatusOfSupply")
    public void setLegalStatusOfSupply(Optional<CodeableConcept> legalStatusOfSupply) {
      this.legalStatusOfSupply = legalStatusOfSupply;
      this.legalStatusOfSupplyIsSet = true;
    }
    @JsonProperty("additionalMonitoringIndicator")
    public void setAdditionalMonitoringIndicator(Optional<CodeableConcept> additionalMonitoringIndicator) {
      this.additionalMonitoringIndicator = additionalMonitoringIndicator;
      this.additionalMonitoringIndicatorIsSet = true;
    }
    @JsonProperty("crossReference")
    public void setCrossReference(Optional<List<Identifier>> crossReference) {
      this.crossReference = crossReference;
      this.crossReferenceIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("paediatricUseIndicator")
    public void setPaediatricUseIndicator(Optional<CodeableConcept> paediatricUseIndicator) {
      this.paediatricUseIndicator = paediatricUseIndicator;
      this.paediatricUseIndicatorIsSet = true;
    }
    @JsonProperty("packagedMedicinalProduct")
    public void setPackagedMedicinalProduct(Optional<List<Reference>> packagedMedicinalProduct) {
      this.packagedMedicinalProduct = packagedMedicinalProduct;
      this.packagedMedicinalProductIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<CodeableConcept> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("identifier")
    public void setIdentifier(Optional<List<Identifier>> identifier) {
      this.identifier = identifier;
      this.identifierIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CodeableConcept>> productClassification() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> pharmaceuticalProduct() { throw new UnsupportedOperationException(); }
    @Override
    public List<MedicinalProduct_Name> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> contact() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MedicinalProduct_ManufacturingBusinessOperation>> manufacturingBusinessOperation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MarketingStatus>> marketingStatus() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> masterFile() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Coding> domain() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<MedicinalProduct_SpecialDesignation>> specialDesignation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Narrative> text() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> clinicalTrial() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> attachedDocument() { throw new UnsupportedOperationException(); }
    @Override
    public String resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> combinedPharmaceuticalDoseForm() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> specialMeasures() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ResourceList>> contained() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> legalStatusOfSupply() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> additionalMonitoringIndicator() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> crossReference() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> paediatricUseIndicator() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Reference>> packagedMedicinalProduct() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<CodeableConcept> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Identifier>> identifier() { throw new UnsupportedOperationException(); }
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
  static ImmutableMedicinalProduct fromJson(Json json) {
    ImmutableMedicinalProduct.Builder builder = ((ImmutableMedicinalProduct.Builder) ImmutableMedicinalProduct.builder());
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.productClassificationIsSet) {
      builder.productClassification(json.productClassification);
    }
    if (json.pharmaceuticalProductIsSet) {
      builder.pharmaceuticalProduct(json.pharmaceuticalProduct);
    }
    if (json.name != null) {
      builder.addAllName(json.name);
    }
    if (json.contactIsSet) {
      builder.contact(json.contact);
    }
    if (json.manufacturingBusinessOperationIsSet) {
      builder.manufacturingBusinessOperation(json.manufacturingBusinessOperation);
    }
    if (json.marketingStatusIsSet) {
      builder.marketingStatus(json.marketingStatus);
    }
    if (json.masterFileIsSet) {
      builder.masterFile(json.masterFile);
    }
    if (json.domainIsSet) {
      builder.domain(json.domain);
    }
    if (json.specialDesignationIsSet) {
      builder.specialDesignation(json.specialDesignation);
    }
    if (json.textIsSet) {
      builder.text(json.text);
    }
    if (json.clinicalTrialIsSet) {
      builder.clinicalTrial(json.clinicalTrial);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.attachedDocumentIsSet) {
      builder.attachedDocument(json.attachedDocument);
    }
    if (json.resourceType != null) {
      builder.resourceType(json.resourceType);
    }
    if (json.combinedPharmaceuticalDoseFormIsSet) {
      builder.combinedPharmaceuticalDoseForm(json.combinedPharmaceuticalDoseForm);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.specialMeasuresIsSet) {
      builder.specialMeasures(json.specialMeasures);
    }
    if (json.containedIsSet) {
      builder.contained(json.contained);
    }
    if (json.legalStatusOfSupplyIsSet) {
      builder.legalStatusOfSupply(json.legalStatusOfSupply);
    }
    if (json.additionalMonitoringIndicatorIsSet) {
      builder.additionalMonitoringIndicator(json.additionalMonitoringIndicator);
    }
    if (json.crossReferenceIsSet) {
      builder.crossReference(json.crossReference);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.paediatricUseIndicatorIsSet) {
      builder.paediatricUseIndicator(json.paediatricUseIndicator);
    }
    if (json.packagedMedicinalProductIsSet) {
      builder.packagedMedicinalProduct(json.packagedMedicinalProduct);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.identifierIsSet) {
      builder.identifier(json.identifier);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
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
        .productClassification(instance.productClassification())
        .pharmaceuticalProduct(instance.pharmaceuticalProduct())
        .addAllName(instance.name())
        .contact(instance.contact())
        .manufacturingBusinessOperation(instance.manufacturingBusinessOperation())
        .marketingStatus(instance.marketingStatus())
        .masterFile(instance.masterFile())
        .domain(instance.domain())
        .specialDesignation(instance.specialDesignation())
        .text(instance.text())
        .clinicalTrial(instance.clinicalTrial())
        .implicitRules(instance.implicitRules())
        .attachedDocument(instance.attachedDocument())
        .resourceType(instance.resourceType())
        .combinedPharmaceuticalDoseForm(instance.combinedPharmaceuticalDoseForm())
        .id(instance.id())
        .specialMeasures(instance.specialMeasures())
        .contained(instance.contained())
        .legalStatusOfSupply(instance.legalStatusOfSupply())
        .additionalMonitoringIndicator(instance.additionalMonitoringIndicator())
        .crossReference(instance.crossReference())
        .modifierExtension(instance.modifierExtension())
        .paediatricUseIndicator(instance.paediatricUseIndicator())
        .packagedMedicinalProduct(instance.packagedMedicinalProduct())
        .type(instance.type())
        .meta(instance.meta())
        .identifier(instance.identifier())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link MedicinalProduct MedicinalProduct}.
   * <pre>
   * ImmutableMedicinalProduct.builder()
   *    .language(com.fhir.types.fhir.Code) // optional {@link MedicinalProduct#language() language}
   *    .productClassification(List&amp;lt;com.fhir.types.fhir.CodeableConcept&amp;gt;) // optional {@link MedicinalProduct#productClassification() productClassification}
   *    .pharmaceuticalProduct(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link MedicinalProduct#pharmaceuticalProduct() pharmaceuticalProduct}
   *    .addName|addAllName(com.fhir.types.fhir.MedicinalProduct_Name) // {@link MedicinalProduct#name() name} elements
   *    .contact(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link MedicinalProduct#contact() contact}
   *    .manufacturingBusinessOperation(List&amp;lt;com.fhir.types.fhir.MedicinalProduct_ManufacturingBusinessOperation&amp;gt;) // optional {@link MedicinalProduct#manufacturingBusinessOperation() manufacturingBusinessOperation}
   *    .marketingStatus(List&amp;lt;com.fhir.types.fhir.MarketingStatus&amp;gt;) // optional {@link MedicinalProduct#marketingStatus() marketingStatus}
   *    .masterFile(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link MedicinalProduct#masterFile() masterFile}
   *    .domain(com.fhir.types.fhir.Coding) // optional {@link MedicinalProduct#domain() domain}
   *    .specialDesignation(List&amp;lt;com.fhir.types.fhir.MedicinalProduct_SpecialDesignation&amp;gt;) // optional {@link MedicinalProduct#specialDesignation() specialDesignation}
   *    .text(com.fhir.types.fhir.Narrative) // optional {@link MedicinalProduct#text() text}
   *    .clinicalTrial(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link MedicinalProduct#clinicalTrial() clinicalTrial}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link MedicinalProduct#implicitRules() implicitRules}
   *    .attachedDocument(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link MedicinalProduct#attachedDocument() attachedDocument}
   *    .resourceType(String) // required {@link MedicinalProduct#resourceType() resourceType}
   *    .combinedPharmaceuticalDoseForm(com.fhir.types.fhir.CodeableConcept) // optional {@link MedicinalProduct#combinedPharmaceuticalDoseForm() combinedPharmaceuticalDoseForm}
   *    .id(com.fhir.types.fhir.Id) // optional {@link MedicinalProduct#id() id}
   *    .specialMeasures(List&amp;lt;String&amp;gt;) // optional {@link MedicinalProduct#specialMeasures() specialMeasures}
   *    .contained(List&amp;lt;com.fhir.types.fhir.ResourceList&amp;gt;) // optional {@link MedicinalProduct#contained() contained}
   *    .legalStatusOfSupply(com.fhir.types.fhir.CodeableConcept) // optional {@link MedicinalProduct#legalStatusOfSupply() legalStatusOfSupply}
   *    .additionalMonitoringIndicator(com.fhir.types.fhir.CodeableConcept) // optional {@link MedicinalProduct#additionalMonitoringIndicator() additionalMonitoringIndicator}
   *    .crossReference(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link MedicinalProduct#crossReference() crossReference}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProduct#modifierExtension() modifierExtension}
   *    .paediatricUseIndicator(com.fhir.types.fhir.CodeableConcept) // optional {@link MedicinalProduct#paediatricUseIndicator() paediatricUseIndicator}
   *    .packagedMedicinalProduct(List&amp;lt;com.fhir.types.fhir.Reference&amp;gt;) // optional {@link MedicinalProduct#packagedMedicinalProduct() packagedMedicinalProduct}
   *    .type(com.fhir.types.fhir.CodeableConcept) // optional {@link MedicinalProduct#type() type}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link MedicinalProduct#meta() meta}
   *    .identifier(List&amp;lt;com.fhir.types.fhir.Identifier&amp;gt;) // optional {@link MedicinalProduct#identifier() identifier}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link MedicinalProduct#extension() extension}
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
  @Generated(from = "MedicinalProduct", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ResourceTypeBuildStage, BuildFinal {
    private static final long INIT_BIT_RESOURCE_TYPE = 0x1L;
    private static final long OPT_BIT_LANGUAGE = 0x1L;
    private static final long OPT_BIT_PRODUCT_CLASSIFICATION = 0x2L;
    private static final long OPT_BIT_PHARMACEUTICAL_PRODUCT = 0x4L;
    private static final long OPT_BIT_CONTACT = 0x8L;
    private static final long OPT_BIT_MANUFACTURING_BUSINESS_OPERATION = 0x10L;
    private static final long OPT_BIT_MARKETING_STATUS = 0x20L;
    private static final long OPT_BIT_MASTER_FILE = 0x40L;
    private static final long OPT_BIT_DOMAIN = 0x80L;
    private static final long OPT_BIT_SPECIAL_DESIGNATION = 0x100L;
    private static final long OPT_BIT_TEXT = 0x200L;
    private static final long OPT_BIT_CLINICAL_TRIAL = 0x400L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x800L;
    private static final long OPT_BIT_ATTACHED_DOCUMENT = 0x1000L;
    private static final long OPT_BIT_COMBINED_PHARMACEUTICAL_DOSE_FORM = 0x2000L;
    private static final long OPT_BIT_ID = 0x4000L;
    private static final long OPT_BIT_SPECIAL_MEASURES = 0x8000L;
    private static final long OPT_BIT_CONTAINED = 0x10000L;
    private static final long OPT_BIT_LEGAL_STATUS_OF_SUPPLY = 0x20000L;
    private static final long OPT_BIT_ADDITIONAL_MONITORING_INDICATOR = 0x40000L;
    private static final long OPT_BIT_CROSS_REFERENCE = 0x80000L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x100000L;
    private static final long OPT_BIT_PAEDIATRIC_USE_INDICATOR = 0x200000L;
    private static final long OPT_BIT_PACKAGED_MEDICINAL_PRODUCT = 0x400000L;
    private static final long OPT_BIT_TYPE = 0x800000L;
    private static final long OPT_BIT_META = 0x1000000L;
    private static final long OPT_BIT_IDENTIFIER = 0x2000000L;
    private static final long OPT_BIT_EXTENSION = 0x4000000L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable Code language;
    private @Nullable List<CodeableConcept> productClassification;
    private @Nullable List<Reference> pharmaceuticalProduct;
    private final List<MedicinalProduct_Name> name = new ArrayList<MedicinalProduct_Name>();
    private @Nullable List<Reference> contact;
    private @Nullable List<MedicinalProduct_ManufacturingBusinessOperation> manufacturingBusinessOperation;
    private @Nullable List<MarketingStatus> marketingStatus;
    private @Nullable List<Reference> masterFile;
    private @Nullable Coding domain;
    private @Nullable List<MedicinalProduct_SpecialDesignation> specialDesignation;
    private @Nullable Narrative text;
    private @Nullable List<Reference> clinicalTrial;
    private @Nullable Uri implicitRules;
    private @Nullable List<Reference> attachedDocument;
    private @Nullable String resourceType;
    private @Nullable CodeableConcept combinedPharmaceuticalDoseForm;
    private @Nullable Id id;
    private @Nullable List<String> specialMeasures;
    private @Nullable List<ResourceList> contained;
    private @Nullable CodeableConcept legalStatusOfSupply;
    private @Nullable CodeableConcept additionalMonitoringIndicator;
    private @Nullable List<Identifier> crossReference;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable CodeableConcept paediatricUseIndicator;
    private @Nullable List<Reference> packagedMedicinalProduct;
    private @Nullable CodeableConcept type;
    private @Nullable Meta meta;
    private @Nullable List<Identifier> identifier;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProduct#language() language} to language.
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
     * Initializes the optional value {@link MedicinalProduct#productClassification() productClassification} to productClassification.
     * @param productClassification The value for productClassification
     * @return {@code this} builder for chained invocation
     */
    public final Builder productClassification(List<CodeableConcept> productClassification) {
      checkNotIsSet(productClassificationIsSet(), "productClassification");
      this.productClassification = Objects.requireNonNull(productClassification, "productClassification");
      optBits |= OPT_BIT_PRODUCT_CLASSIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#productClassification() productClassification} to productClassification.
     * @param productClassification The value for productClassification
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("productClassification")
    public final Builder productClassification(Optional<? extends List<CodeableConcept>> productClassification) {
      checkNotIsSet(productClassificationIsSet(), "productClassification");
      this.productClassification = productClassification.orElse(null);
      optBits |= OPT_BIT_PRODUCT_CLASSIFICATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#pharmaceuticalProduct() pharmaceuticalProduct} to pharmaceuticalProduct.
     * @param pharmaceuticalProduct The value for pharmaceuticalProduct
     * @return {@code this} builder for chained invocation
     */
    public final Builder pharmaceuticalProduct(List<Reference> pharmaceuticalProduct) {
      checkNotIsSet(pharmaceuticalProductIsSet(), "pharmaceuticalProduct");
      this.pharmaceuticalProduct = Objects.requireNonNull(pharmaceuticalProduct, "pharmaceuticalProduct");
      optBits |= OPT_BIT_PHARMACEUTICAL_PRODUCT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#pharmaceuticalProduct() pharmaceuticalProduct} to pharmaceuticalProduct.
     * @param pharmaceuticalProduct The value for pharmaceuticalProduct
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("pharmaceuticalProduct")
    public final Builder pharmaceuticalProduct(Optional<? extends List<Reference>> pharmaceuticalProduct) {
      checkNotIsSet(pharmaceuticalProductIsSet(), "pharmaceuticalProduct");
      this.pharmaceuticalProduct = pharmaceuticalProduct.orElse(null);
      optBits |= OPT_BIT_PHARMACEUTICAL_PRODUCT;
      return this;
    }

    /**
     * Adds one element to {@link MedicinalProduct#name() name} list.
     * @param element A name element
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addName(MedicinalProduct_Name element) {
      this.name.add(Objects.requireNonNull(element, "name element"));
      return this;
    }

    /**
     * Adds elements to {@link MedicinalProduct#name() name} list.
     * @param elements An array of name elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addName(MedicinalProduct_Name... elements) {
      for (MedicinalProduct_Name element : elements) {
        this.name.add(Objects.requireNonNull(element, "name element"));
      }
      return this;
    }


    /**
     * Adds elements to {@link MedicinalProduct#name() name} list.
     * @param elements An iterable of name elements
     * @return {@code this} builder for use in a chained invocation
     */
    public final Builder addAllName(Iterable<? extends MedicinalProduct_Name> elements) {
      for (MedicinalProduct_Name element : elements) {
        this.name.add(Objects.requireNonNull(element, "name element"));
      }
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    public final Builder contact(List<Reference> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = Objects.requireNonNull(contact, "contact");
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("contact")
    public final Builder contact(Optional<? extends List<Reference>> contact) {
      checkNotIsSet(contactIsSet(), "contact");
      this.contact = contact.orElse(null);
      optBits |= OPT_BIT_CONTACT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#manufacturingBusinessOperation() manufacturingBusinessOperation} to manufacturingBusinessOperation.
     * @param manufacturingBusinessOperation The value for manufacturingBusinessOperation
     * @return {@code this} builder for chained invocation
     */
    public final Builder manufacturingBusinessOperation(List<MedicinalProduct_ManufacturingBusinessOperation> manufacturingBusinessOperation) {
      checkNotIsSet(manufacturingBusinessOperationIsSet(), "manufacturingBusinessOperation");
      this.manufacturingBusinessOperation = Objects.requireNonNull(manufacturingBusinessOperation, "manufacturingBusinessOperation");
      optBits |= OPT_BIT_MANUFACTURING_BUSINESS_OPERATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#manufacturingBusinessOperation() manufacturingBusinessOperation} to manufacturingBusinessOperation.
     * @param manufacturingBusinessOperation The value for manufacturingBusinessOperation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("manufacturingBusinessOperation")
    public final Builder manufacturingBusinessOperation(Optional<? extends List<MedicinalProduct_ManufacturingBusinessOperation>> manufacturingBusinessOperation) {
      checkNotIsSet(manufacturingBusinessOperationIsSet(), "manufacturingBusinessOperation");
      this.manufacturingBusinessOperation = manufacturingBusinessOperation.orElse(null);
      optBits |= OPT_BIT_MANUFACTURING_BUSINESS_OPERATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#marketingStatus() marketingStatus} to marketingStatus.
     * @param marketingStatus The value for marketingStatus
     * @return {@code this} builder for chained invocation
     */
    public final Builder marketingStatus(List<MarketingStatus> marketingStatus) {
      checkNotIsSet(marketingStatusIsSet(), "marketingStatus");
      this.marketingStatus = Objects.requireNonNull(marketingStatus, "marketingStatus");
      optBits |= OPT_BIT_MARKETING_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#marketingStatus() marketingStatus} to marketingStatus.
     * @param marketingStatus The value for marketingStatus
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("marketingStatus")
    public final Builder marketingStatus(Optional<? extends List<MarketingStatus>> marketingStatus) {
      checkNotIsSet(marketingStatusIsSet(), "marketingStatus");
      this.marketingStatus = marketingStatus.orElse(null);
      optBits |= OPT_BIT_MARKETING_STATUS;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#masterFile() masterFile} to masterFile.
     * @param masterFile The value for masterFile
     * @return {@code this} builder for chained invocation
     */
    public final Builder masterFile(List<Reference> masterFile) {
      checkNotIsSet(masterFileIsSet(), "masterFile");
      this.masterFile = Objects.requireNonNull(masterFile, "masterFile");
      optBits |= OPT_BIT_MASTER_FILE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#masterFile() masterFile} to masterFile.
     * @param masterFile The value for masterFile
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("masterFile")
    public final Builder masterFile(Optional<? extends List<Reference>> masterFile) {
      checkNotIsSet(masterFileIsSet(), "masterFile");
      this.masterFile = masterFile.orElse(null);
      optBits |= OPT_BIT_MASTER_FILE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#domain() domain} to domain.
     * @param domain The value for domain
     * @return {@code this} builder for chained invocation
     */
    public final Builder domain(Coding domain) {
      checkNotIsSet(domainIsSet(), "domain");
      this.domain = Objects.requireNonNull(domain, "domain");
      optBits |= OPT_BIT_DOMAIN;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#domain() domain} to domain.
     * @param domain The value for domain
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("domain")
    public final Builder domain(Optional<? extends Coding> domain) {
      checkNotIsSet(domainIsSet(), "domain");
      this.domain = domain.orElse(null);
      optBits |= OPT_BIT_DOMAIN;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#specialDesignation() specialDesignation} to specialDesignation.
     * @param specialDesignation The value for specialDesignation
     * @return {@code this} builder for chained invocation
     */
    public final Builder specialDesignation(List<MedicinalProduct_SpecialDesignation> specialDesignation) {
      checkNotIsSet(specialDesignationIsSet(), "specialDesignation");
      this.specialDesignation = Objects.requireNonNull(specialDesignation, "specialDesignation");
      optBits |= OPT_BIT_SPECIAL_DESIGNATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#specialDesignation() specialDesignation} to specialDesignation.
     * @param specialDesignation The value for specialDesignation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("specialDesignation")
    public final Builder specialDesignation(Optional<? extends List<MedicinalProduct_SpecialDesignation>> specialDesignation) {
      checkNotIsSet(specialDesignationIsSet(), "specialDesignation");
      this.specialDesignation = specialDesignation.orElse(null);
      optBits |= OPT_BIT_SPECIAL_DESIGNATION;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#text() text} to text.
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
     * Initializes the optional value {@link MedicinalProduct#text() text} to text.
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
     * Initializes the optional value {@link MedicinalProduct#clinicalTrial() clinicalTrial} to clinicalTrial.
     * @param clinicalTrial The value for clinicalTrial
     * @return {@code this} builder for chained invocation
     */
    public final Builder clinicalTrial(List<Reference> clinicalTrial) {
      checkNotIsSet(clinicalTrialIsSet(), "clinicalTrial");
      this.clinicalTrial = Objects.requireNonNull(clinicalTrial, "clinicalTrial");
      optBits |= OPT_BIT_CLINICAL_TRIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#clinicalTrial() clinicalTrial} to clinicalTrial.
     * @param clinicalTrial The value for clinicalTrial
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("clinicalTrial")
    public final Builder clinicalTrial(Optional<? extends List<Reference>> clinicalTrial) {
      checkNotIsSet(clinicalTrialIsSet(), "clinicalTrial");
      this.clinicalTrial = clinicalTrial.orElse(null);
      optBits |= OPT_BIT_CLINICAL_TRIAL;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProduct#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link MedicinalProduct#attachedDocument() attachedDocument} to attachedDocument.
     * @param attachedDocument The value for attachedDocument
     * @return {@code this} builder for chained invocation
     */
    public final Builder attachedDocument(List<Reference> attachedDocument) {
      checkNotIsSet(attachedDocumentIsSet(), "attachedDocument");
      this.attachedDocument = Objects.requireNonNull(attachedDocument, "attachedDocument");
      optBits |= OPT_BIT_ATTACHED_DOCUMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#attachedDocument() attachedDocument} to attachedDocument.
     * @param attachedDocument The value for attachedDocument
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("attachedDocument")
    public final Builder attachedDocument(Optional<? extends List<Reference>> attachedDocument) {
      checkNotIsSet(attachedDocumentIsSet(), "attachedDocument");
      this.attachedDocument = attachedDocument.orElse(null);
      optBits |= OPT_BIT_ATTACHED_DOCUMENT;
      return this;
    }

    /**
     * Initializes the value for the {@link MedicinalProduct#resourceType() resourceType} attribute.
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
     * Initializes the optional value {@link MedicinalProduct#combinedPharmaceuticalDoseForm() combinedPharmaceuticalDoseForm} to combinedPharmaceuticalDoseForm.
     * @param combinedPharmaceuticalDoseForm The value for combinedPharmaceuticalDoseForm
     * @return {@code this} builder for chained invocation
     */
    public final Builder combinedPharmaceuticalDoseForm(CodeableConcept combinedPharmaceuticalDoseForm) {
      checkNotIsSet(combinedPharmaceuticalDoseFormIsSet(), "combinedPharmaceuticalDoseForm");
      this.combinedPharmaceuticalDoseForm = Objects.requireNonNull(combinedPharmaceuticalDoseForm, "combinedPharmaceuticalDoseForm");
      optBits |= OPT_BIT_COMBINED_PHARMACEUTICAL_DOSE_FORM;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#combinedPharmaceuticalDoseForm() combinedPharmaceuticalDoseForm} to combinedPharmaceuticalDoseForm.
     * @param combinedPharmaceuticalDoseForm The value for combinedPharmaceuticalDoseForm
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("combinedPharmaceuticalDoseForm")
    public final Builder combinedPharmaceuticalDoseForm(Optional<? extends CodeableConcept> combinedPharmaceuticalDoseForm) {
      checkNotIsSet(combinedPharmaceuticalDoseFormIsSet(), "combinedPharmaceuticalDoseForm");
      this.combinedPharmaceuticalDoseForm = combinedPharmaceuticalDoseForm.orElse(null);
      optBits |= OPT_BIT_COMBINED_PHARMACEUTICAL_DOSE_FORM;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProduct#id() id} to id.
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
     * Initializes the optional value {@link MedicinalProduct#specialMeasures() specialMeasures} to specialMeasures.
     * @param specialMeasures The value for specialMeasures
     * @return {@code this} builder for chained invocation
     */
    public final Builder specialMeasures(List<String> specialMeasures) {
      checkNotIsSet(specialMeasuresIsSet(), "specialMeasures");
      this.specialMeasures = Objects.requireNonNull(specialMeasures, "specialMeasures");
      optBits |= OPT_BIT_SPECIAL_MEASURES;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#specialMeasures() specialMeasures} to specialMeasures.
     * @param specialMeasures The value for specialMeasures
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("specialMeasures")
    public final Builder specialMeasures(Optional<? extends List<String>> specialMeasures) {
      checkNotIsSet(specialMeasuresIsSet(), "specialMeasures");
      this.specialMeasures = specialMeasures.orElse(null);
      optBits |= OPT_BIT_SPECIAL_MEASURES;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProduct#contained() contained} to contained.
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
     * Initializes the optional value {@link MedicinalProduct#legalStatusOfSupply() legalStatusOfSupply} to legalStatusOfSupply.
     * @param legalStatusOfSupply The value for legalStatusOfSupply
     * @return {@code this} builder for chained invocation
     */
    public final Builder legalStatusOfSupply(CodeableConcept legalStatusOfSupply) {
      checkNotIsSet(legalStatusOfSupplyIsSet(), "legalStatusOfSupply");
      this.legalStatusOfSupply = Objects.requireNonNull(legalStatusOfSupply, "legalStatusOfSupply");
      optBits |= OPT_BIT_LEGAL_STATUS_OF_SUPPLY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#legalStatusOfSupply() legalStatusOfSupply} to legalStatusOfSupply.
     * @param legalStatusOfSupply The value for legalStatusOfSupply
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("legalStatusOfSupply")
    public final Builder legalStatusOfSupply(Optional<? extends CodeableConcept> legalStatusOfSupply) {
      checkNotIsSet(legalStatusOfSupplyIsSet(), "legalStatusOfSupply");
      this.legalStatusOfSupply = legalStatusOfSupply.orElse(null);
      optBits |= OPT_BIT_LEGAL_STATUS_OF_SUPPLY;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#additionalMonitoringIndicator() additionalMonitoringIndicator} to additionalMonitoringIndicator.
     * @param additionalMonitoringIndicator The value for additionalMonitoringIndicator
     * @return {@code this} builder for chained invocation
     */
    public final Builder additionalMonitoringIndicator(CodeableConcept additionalMonitoringIndicator) {
      checkNotIsSet(additionalMonitoringIndicatorIsSet(), "additionalMonitoringIndicator");
      this.additionalMonitoringIndicator = Objects.requireNonNull(additionalMonitoringIndicator, "additionalMonitoringIndicator");
      optBits |= OPT_BIT_ADDITIONAL_MONITORING_INDICATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#additionalMonitoringIndicator() additionalMonitoringIndicator} to additionalMonitoringIndicator.
     * @param additionalMonitoringIndicator The value for additionalMonitoringIndicator
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("additionalMonitoringIndicator")
    public final Builder additionalMonitoringIndicator(Optional<? extends CodeableConcept> additionalMonitoringIndicator) {
      checkNotIsSet(additionalMonitoringIndicatorIsSet(), "additionalMonitoringIndicator");
      this.additionalMonitoringIndicator = additionalMonitoringIndicator.orElse(null);
      optBits |= OPT_BIT_ADDITIONAL_MONITORING_INDICATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#crossReference() crossReference} to crossReference.
     * @param crossReference The value for crossReference
     * @return {@code this} builder for chained invocation
     */
    public final Builder crossReference(List<Identifier> crossReference) {
      checkNotIsSet(crossReferenceIsSet(), "crossReference");
      this.crossReference = Objects.requireNonNull(crossReference, "crossReference");
      optBits |= OPT_BIT_CROSS_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#crossReference() crossReference} to crossReference.
     * @param crossReference The value for crossReference
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("crossReference")
    public final Builder crossReference(Optional<? extends List<Identifier>> crossReference) {
      checkNotIsSet(crossReferenceIsSet(), "crossReference");
      this.crossReference = crossReference.orElse(null);
      optBits |= OPT_BIT_CROSS_REFERENCE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProduct#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link MedicinalProduct#paediatricUseIndicator() paediatricUseIndicator} to paediatricUseIndicator.
     * @param paediatricUseIndicator The value for paediatricUseIndicator
     * @return {@code this} builder for chained invocation
     */
    public final Builder paediatricUseIndicator(CodeableConcept paediatricUseIndicator) {
      checkNotIsSet(paediatricUseIndicatorIsSet(), "paediatricUseIndicator");
      this.paediatricUseIndicator = Objects.requireNonNull(paediatricUseIndicator, "paediatricUseIndicator");
      optBits |= OPT_BIT_PAEDIATRIC_USE_INDICATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#paediatricUseIndicator() paediatricUseIndicator} to paediatricUseIndicator.
     * @param paediatricUseIndicator The value for paediatricUseIndicator
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("paediatricUseIndicator")
    public final Builder paediatricUseIndicator(Optional<? extends CodeableConcept> paediatricUseIndicator) {
      checkNotIsSet(paediatricUseIndicatorIsSet(), "paediatricUseIndicator");
      this.paediatricUseIndicator = paediatricUseIndicator.orElse(null);
      optBits |= OPT_BIT_PAEDIATRIC_USE_INDICATOR;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#packagedMedicinalProduct() packagedMedicinalProduct} to packagedMedicinalProduct.
     * @param packagedMedicinalProduct The value for packagedMedicinalProduct
     * @return {@code this} builder for chained invocation
     */
    public final Builder packagedMedicinalProduct(List<Reference> packagedMedicinalProduct) {
      checkNotIsSet(packagedMedicinalProductIsSet(), "packagedMedicinalProduct");
      this.packagedMedicinalProduct = Objects.requireNonNull(packagedMedicinalProduct, "packagedMedicinalProduct");
      optBits |= OPT_BIT_PACKAGED_MEDICINAL_PRODUCT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#packagedMedicinalProduct() packagedMedicinalProduct} to packagedMedicinalProduct.
     * @param packagedMedicinalProduct The value for packagedMedicinalProduct
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("packagedMedicinalProduct")
    public final Builder packagedMedicinalProduct(Optional<? extends List<Reference>> packagedMedicinalProduct) {
      checkNotIsSet(packagedMedicinalProductIsSet(), "packagedMedicinalProduct");
      this.packagedMedicinalProduct = packagedMedicinalProduct.orElse(null);
      optBits |= OPT_BIT_PACKAGED_MEDICINAL_PRODUCT;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(CodeableConcept type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends CodeableConcept> type) {
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
    public final Builder meta(Meta meta) {
      checkNotIsSet(metaIsSet(), "meta");
      this.meta = Objects.requireNonNull(meta, "meta");
      optBits |= OPT_BIT_META;
      return this;
    }

    /**
     * Initializes the optional value {@link MedicinalProduct#meta() meta} to meta.
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
     * Initializes the optional value {@link MedicinalProduct#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MedicinalProduct#identifier() identifier} to identifier.
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
     * Initializes the optional value {@link MedicinalProduct#extension() extension} to extension.
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
     * Initializes the optional value {@link MedicinalProduct#extension() extension} to extension.
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
     * Builds a new {@link MedicinalProduct MedicinalProduct}.
     * @return An immutable instance of MedicinalProduct
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public MedicinalProduct build() {
      checkRequiredAttributes();
      return new ImmutableMedicinalProduct(
          language,
          productClassification,
          pharmaceuticalProduct,
          createUnmodifiableList(true, name),
          contact,
          manufacturingBusinessOperation,
          marketingStatus,
          masterFile,
          domain,
          specialDesignation,
          text,
          clinicalTrial,
          implicitRules,
          attachedDocument,
          resourceType,
          combinedPharmaceuticalDoseForm,
          id,
          specialMeasures,
          contained,
          legalStatusOfSupply,
          additionalMonitoringIndicator,
          crossReference,
          modifierExtension,
          paediatricUseIndicator,
          packagedMedicinalProduct,
          type,
          meta,
          identifier,
          extension);
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean productClassificationIsSet() {
      return (optBits & OPT_BIT_PRODUCT_CLASSIFICATION) != 0;
    }

    private boolean pharmaceuticalProductIsSet() {
      return (optBits & OPT_BIT_PHARMACEUTICAL_PRODUCT) != 0;
    }

    private boolean contactIsSet() {
      return (optBits & OPT_BIT_CONTACT) != 0;
    }

    private boolean manufacturingBusinessOperationIsSet() {
      return (optBits & OPT_BIT_MANUFACTURING_BUSINESS_OPERATION) != 0;
    }

    private boolean marketingStatusIsSet() {
      return (optBits & OPT_BIT_MARKETING_STATUS) != 0;
    }

    private boolean masterFileIsSet() {
      return (optBits & OPT_BIT_MASTER_FILE) != 0;
    }

    private boolean domainIsSet() {
      return (optBits & OPT_BIT_DOMAIN) != 0;
    }

    private boolean specialDesignationIsSet() {
      return (optBits & OPT_BIT_SPECIAL_DESIGNATION) != 0;
    }

    private boolean textIsSet() {
      return (optBits & OPT_BIT_TEXT) != 0;
    }

    private boolean clinicalTrialIsSet() {
      return (optBits & OPT_BIT_CLINICAL_TRIAL) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean attachedDocumentIsSet() {
      return (optBits & OPT_BIT_ATTACHED_DOCUMENT) != 0;
    }

    private boolean combinedPharmaceuticalDoseFormIsSet() {
      return (optBits & OPT_BIT_COMBINED_PHARMACEUTICAL_DOSE_FORM) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean specialMeasuresIsSet() {
      return (optBits & OPT_BIT_SPECIAL_MEASURES) != 0;
    }

    private boolean containedIsSet() {
      return (optBits & OPT_BIT_CONTAINED) != 0;
    }

    private boolean legalStatusOfSupplyIsSet() {
      return (optBits & OPT_BIT_LEGAL_STATUS_OF_SUPPLY) != 0;
    }

    private boolean additionalMonitoringIndicatorIsSet() {
      return (optBits & OPT_BIT_ADDITIONAL_MONITORING_INDICATOR) != 0;
    }

    private boolean crossReferenceIsSet() {
      return (optBits & OPT_BIT_CROSS_REFERENCE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean paediatricUseIndicatorIsSet() {
      return (optBits & OPT_BIT_PAEDIATRIC_USE_INDICATOR) != 0;
    }

    private boolean packagedMedicinalProductIsSet() {
      return (optBits & OPT_BIT_PACKAGED_MEDICINAL_PRODUCT) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean identifierIsSet() {
      return (optBits & OPT_BIT_IDENTIFIER) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (initBits & INIT_BIT_RESOURCE_TYPE) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of MedicinalProduct is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!resourceTypeIsSet()) attributes.add("resourceType");
      return "Cannot build MedicinalProduct, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "MedicinalProduct", generator = "Immutables")
  public interface ResourceTypeBuildStage {
    /**
     * Initializes the value for the {@link MedicinalProduct#resourceType() resourceType} attribute.
     * @param resourceType The value for resourceType 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(String resourceType);
  }

  @Generated(from = "MedicinalProduct", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link MedicinalProduct#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link MedicinalProduct#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link MedicinalProduct#productClassification() productClassification} to productClassification.
     * @param productClassification The value for productClassification
     * @return {@code this} builder for chained invocation
     */
    BuildFinal productClassification(List<CodeableConcept> productClassification);

    /**
     * Initializes the optional value {@link MedicinalProduct#productClassification() productClassification} to productClassification.
     * @param productClassification The value for productClassification
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal productClassification(Optional<? extends List<CodeableConcept>> productClassification);

    /**
     * Initializes the optional value {@link MedicinalProduct#pharmaceuticalProduct() pharmaceuticalProduct} to pharmaceuticalProduct.
     * @param pharmaceuticalProduct The value for pharmaceuticalProduct
     * @return {@code this} builder for chained invocation
     */
    BuildFinal pharmaceuticalProduct(List<Reference> pharmaceuticalProduct);

    /**
     * Initializes the optional value {@link MedicinalProduct#pharmaceuticalProduct() pharmaceuticalProduct} to pharmaceuticalProduct.
     * @param pharmaceuticalProduct The value for pharmaceuticalProduct
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal pharmaceuticalProduct(Optional<? extends List<Reference>> pharmaceuticalProduct);

    /**
     * Adds one element to {@link MedicinalProduct#name() name} list.
     * @param element A name element
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addName(MedicinalProduct_Name element);

    /**
     * Adds elements to {@link MedicinalProduct#name() name} list.
     * @param elements An array of name elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addName(MedicinalProduct_Name... elements);

    /**
     * Adds elements to {@link MedicinalProduct#name() name} list.
     * @param elements An iterable of name elements
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal addAllName(Iterable<? extends MedicinalProduct_Name> elements);

    /**
     * Initializes the optional value {@link MedicinalProduct#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contact(List<Reference> contact);

    /**
     * Initializes the optional value {@link MedicinalProduct#contact() contact} to contact.
     * @param contact The value for contact
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contact(Optional<? extends List<Reference>> contact);

    /**
     * Initializes the optional value {@link MedicinalProduct#manufacturingBusinessOperation() manufacturingBusinessOperation} to manufacturingBusinessOperation.
     * @param manufacturingBusinessOperation The value for manufacturingBusinessOperation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal manufacturingBusinessOperation(List<MedicinalProduct_ManufacturingBusinessOperation> manufacturingBusinessOperation);

    /**
     * Initializes the optional value {@link MedicinalProduct#manufacturingBusinessOperation() manufacturingBusinessOperation} to manufacturingBusinessOperation.
     * @param manufacturingBusinessOperation The value for manufacturingBusinessOperation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal manufacturingBusinessOperation(Optional<? extends List<MedicinalProduct_ManufacturingBusinessOperation>> manufacturingBusinessOperation);

    /**
     * Initializes the optional value {@link MedicinalProduct#marketingStatus() marketingStatus} to marketingStatus.
     * @param marketingStatus The value for marketingStatus
     * @return {@code this} builder for chained invocation
     */
    BuildFinal marketingStatus(List<MarketingStatus> marketingStatus);

    /**
     * Initializes the optional value {@link MedicinalProduct#marketingStatus() marketingStatus} to marketingStatus.
     * @param marketingStatus The value for marketingStatus
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal marketingStatus(Optional<? extends List<MarketingStatus>> marketingStatus);

    /**
     * Initializes the optional value {@link MedicinalProduct#masterFile() masterFile} to masterFile.
     * @param masterFile The value for masterFile
     * @return {@code this} builder for chained invocation
     */
    BuildFinal masterFile(List<Reference> masterFile);

    /**
     * Initializes the optional value {@link MedicinalProduct#masterFile() masterFile} to masterFile.
     * @param masterFile The value for masterFile
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal masterFile(Optional<? extends List<Reference>> masterFile);

    /**
     * Initializes the optional value {@link MedicinalProduct#domain() domain} to domain.
     * @param domain The value for domain
     * @return {@code this} builder for chained invocation
     */
    BuildFinal domain(Coding domain);

    /**
     * Initializes the optional value {@link MedicinalProduct#domain() domain} to domain.
     * @param domain The value for domain
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal domain(Optional<? extends Coding> domain);

    /**
     * Initializes the optional value {@link MedicinalProduct#specialDesignation() specialDesignation} to specialDesignation.
     * @param specialDesignation The value for specialDesignation
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specialDesignation(List<MedicinalProduct_SpecialDesignation> specialDesignation);

    /**
     * Initializes the optional value {@link MedicinalProduct#specialDesignation() specialDesignation} to specialDesignation.
     * @param specialDesignation The value for specialDesignation
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specialDesignation(Optional<? extends List<MedicinalProduct_SpecialDesignation>> specialDesignation);

    /**
     * Initializes the optional value {@link MedicinalProduct#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for chained invocation
     */
    BuildFinal text(Narrative text);

    /**
     * Initializes the optional value {@link MedicinalProduct#text() text} to text.
     * @param text The value for text
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal text(Optional<? extends Narrative> text);

    /**
     * Initializes the optional value {@link MedicinalProduct#clinicalTrial() clinicalTrial} to clinicalTrial.
     * @param clinicalTrial The value for clinicalTrial
     * @return {@code this} builder for chained invocation
     */
    BuildFinal clinicalTrial(List<Reference> clinicalTrial);

    /**
     * Initializes the optional value {@link MedicinalProduct#clinicalTrial() clinicalTrial} to clinicalTrial.
     * @param clinicalTrial The value for clinicalTrial
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal clinicalTrial(Optional<? extends List<Reference>> clinicalTrial);

    /**
     * Initializes the optional value {@link MedicinalProduct#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProduct#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link MedicinalProduct#attachedDocument() attachedDocument} to attachedDocument.
     * @param attachedDocument The value for attachedDocument
     * @return {@code this} builder for chained invocation
     */
    BuildFinal attachedDocument(List<Reference> attachedDocument);

    /**
     * Initializes the optional value {@link MedicinalProduct#attachedDocument() attachedDocument} to attachedDocument.
     * @param attachedDocument The value for attachedDocument
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal attachedDocument(Optional<? extends List<Reference>> attachedDocument);

    /**
     * Initializes the optional value {@link MedicinalProduct#combinedPharmaceuticalDoseForm() combinedPharmaceuticalDoseForm} to combinedPharmaceuticalDoseForm.
     * @param combinedPharmaceuticalDoseForm The value for combinedPharmaceuticalDoseForm
     * @return {@code this} builder for chained invocation
     */
    BuildFinal combinedPharmaceuticalDoseForm(CodeableConcept combinedPharmaceuticalDoseForm);

    /**
     * Initializes the optional value {@link MedicinalProduct#combinedPharmaceuticalDoseForm() combinedPharmaceuticalDoseForm} to combinedPharmaceuticalDoseForm.
     * @param combinedPharmaceuticalDoseForm The value for combinedPharmaceuticalDoseForm
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal combinedPharmaceuticalDoseForm(Optional<? extends CodeableConcept> combinedPharmaceuticalDoseForm);

    /**
     * Initializes the optional value {@link MedicinalProduct#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link MedicinalProduct#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Initializes the optional value {@link MedicinalProduct#specialMeasures() specialMeasures} to specialMeasures.
     * @param specialMeasures The value for specialMeasures
     * @return {@code this} builder for chained invocation
     */
    BuildFinal specialMeasures(List<String> specialMeasures);

    /**
     * Initializes the optional value {@link MedicinalProduct#specialMeasures() specialMeasures} to specialMeasures.
     * @param specialMeasures The value for specialMeasures
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal specialMeasures(Optional<? extends List<String>> specialMeasures);

    /**
     * Initializes the optional value {@link MedicinalProduct#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for chained invocation
     */
    BuildFinal contained(List<ResourceList> contained);

    /**
     * Initializes the optional value {@link MedicinalProduct#contained() contained} to contained.
     * @param contained The value for contained
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal contained(Optional<? extends List<ResourceList>> contained);

    /**
     * Initializes the optional value {@link MedicinalProduct#legalStatusOfSupply() legalStatusOfSupply} to legalStatusOfSupply.
     * @param legalStatusOfSupply The value for legalStatusOfSupply
     * @return {@code this} builder for chained invocation
     */
    BuildFinal legalStatusOfSupply(CodeableConcept legalStatusOfSupply);

    /**
     * Initializes the optional value {@link MedicinalProduct#legalStatusOfSupply() legalStatusOfSupply} to legalStatusOfSupply.
     * @param legalStatusOfSupply The value for legalStatusOfSupply
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal legalStatusOfSupply(Optional<? extends CodeableConcept> legalStatusOfSupply);

    /**
     * Initializes the optional value {@link MedicinalProduct#additionalMonitoringIndicator() additionalMonitoringIndicator} to additionalMonitoringIndicator.
     * @param additionalMonitoringIndicator The value for additionalMonitoringIndicator
     * @return {@code this} builder for chained invocation
     */
    BuildFinal additionalMonitoringIndicator(CodeableConcept additionalMonitoringIndicator);

    /**
     * Initializes the optional value {@link MedicinalProduct#additionalMonitoringIndicator() additionalMonitoringIndicator} to additionalMonitoringIndicator.
     * @param additionalMonitoringIndicator The value for additionalMonitoringIndicator
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal additionalMonitoringIndicator(Optional<? extends CodeableConcept> additionalMonitoringIndicator);

    /**
     * Initializes the optional value {@link MedicinalProduct#crossReference() crossReference} to crossReference.
     * @param crossReference The value for crossReference
     * @return {@code this} builder for chained invocation
     */
    BuildFinal crossReference(List<Identifier> crossReference);

    /**
     * Initializes the optional value {@link MedicinalProduct#crossReference() crossReference} to crossReference.
     * @param crossReference The value for crossReference
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal crossReference(Optional<? extends List<Identifier>> crossReference);

    /**
     * Initializes the optional value {@link MedicinalProduct#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProduct#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link MedicinalProduct#paediatricUseIndicator() paediatricUseIndicator} to paediatricUseIndicator.
     * @param paediatricUseIndicator The value for paediatricUseIndicator
     * @return {@code this} builder for chained invocation
     */
    BuildFinal paediatricUseIndicator(CodeableConcept paediatricUseIndicator);

    /**
     * Initializes the optional value {@link MedicinalProduct#paediatricUseIndicator() paediatricUseIndicator} to paediatricUseIndicator.
     * @param paediatricUseIndicator The value for paediatricUseIndicator
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal paediatricUseIndicator(Optional<? extends CodeableConcept> paediatricUseIndicator);

    /**
     * Initializes the optional value {@link MedicinalProduct#packagedMedicinalProduct() packagedMedicinalProduct} to packagedMedicinalProduct.
     * @param packagedMedicinalProduct The value for packagedMedicinalProduct
     * @return {@code this} builder for chained invocation
     */
    BuildFinal packagedMedicinalProduct(List<Reference> packagedMedicinalProduct);

    /**
     * Initializes the optional value {@link MedicinalProduct#packagedMedicinalProduct() packagedMedicinalProduct} to packagedMedicinalProduct.
     * @param packagedMedicinalProduct The value for packagedMedicinalProduct
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal packagedMedicinalProduct(Optional<? extends List<Reference>> packagedMedicinalProduct);

    /**
     * Initializes the optional value {@link MedicinalProduct#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(CodeableConcept type);

    /**
     * Initializes the optional value {@link MedicinalProduct#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends CodeableConcept> type);

    /**
     * Initializes the optional value {@link MedicinalProduct#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link MedicinalProduct#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link MedicinalProduct#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for chained invocation
     */
    BuildFinal identifier(List<Identifier> identifier);

    /**
     * Initializes the optional value {@link MedicinalProduct#identifier() identifier} to identifier.
     * @param identifier The value for identifier
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal identifier(Optional<? extends List<Identifier>> identifier);

    /**
     * Initializes the optional value {@link MedicinalProduct#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link MedicinalProduct#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Builds a new {@link MedicinalProduct MedicinalProduct}.
     * @return An immutable instance of MedicinalProduct
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    MedicinalProduct build();
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

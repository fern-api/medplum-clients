//-no-import-rewrite
package com.fhir;

import java.lang.Object;
import java.lang.String;
import java.lang.Float;
import java.lang.Double;

/**
 * Immutable implementation of {@link CapabilityStatement_Resource}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCapabilityStatement_Resource.builder()}.
 */
@org.immutables.value.Generated(from = "CapabilityStatement_Resource", generator = "Immutables")
@SuppressWarnings({"all"})
@edu.umd.cs.findbugs.annotations.SuppressFBWarnings
@javax.annotation.ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@javax.annotation.concurrent.Immutable
@com.fasterxml.jackson.annotation.JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCapabilityStatement_Resource implements com.fhir.CapabilityStatement_Resource {
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
  private final @javax.annotation.Nullable com.fhir.Capabilitystatement_resourceConditionalread conditionalRead;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_SearchParam> searchParam;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
  private final @javax.annotation.Nullable java.lang.Boolean conditionalCreate;
  private final @javax.annotation.Nullable com.fhir.Capabilitystatement_resourceConditionaldelete conditionalDelete;
  private final @javax.annotation.Nullable java.util.List<java.lang.String> searchInclude;
  private final @javax.annotation.Nullable java.lang.String id;
  private final @javax.annotation.Nullable com.fhir.canonical profile;
  private final @javax.annotation.Nullable com.fhir.Capabilitystatement_resourceVersioning versioning;
  private final @javax.annotation.Nullable com.fhir.markdown documentation;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Interaction> interaction;
  private final @javax.annotation.Nullable java.util.List<com.fhir.canonical> supportedProfile;
  private final @javax.annotation.Nullable java.util.List<com.fhir.Capabilitystatement_resourceReferencepolicyItem> referencePolicy;
  private final @javax.annotation.Nullable java.util.List<java.lang.String> searchRevInclude;
  private final @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Operation> operation;
  private final @javax.annotation.Nullable java.lang.Boolean conditionalUpdate;
  private final @javax.annotation.Nullable com.fhir.code type;
  private final @javax.annotation.Nullable java.lang.Boolean readHistory;
  private final @javax.annotation.Nullable java.lang.Boolean updateCreate;

  private ImmutableCapabilityStatement_Resource(
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension,
      @javax.annotation.Nullable com.fhir.Capabilitystatement_resourceConditionalread conditionalRead,
      @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_SearchParam> searchParam,
      @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension,
      @javax.annotation.Nullable java.lang.Boolean conditionalCreate,
      @javax.annotation.Nullable com.fhir.Capabilitystatement_resourceConditionaldelete conditionalDelete,
      @javax.annotation.Nullable java.util.List<java.lang.String> searchInclude,
      @javax.annotation.Nullable java.lang.String id,
      @javax.annotation.Nullable com.fhir.canonical profile,
      @javax.annotation.Nullable com.fhir.Capabilitystatement_resourceVersioning versioning,
      @javax.annotation.Nullable com.fhir.markdown documentation,
      @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Interaction> interaction,
      @javax.annotation.Nullable java.util.List<com.fhir.canonical> supportedProfile,
      @javax.annotation.Nullable java.util.List<com.fhir.Capabilitystatement_resourceReferencepolicyItem> referencePolicy,
      @javax.annotation.Nullable java.util.List<java.lang.String> searchRevInclude,
      @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Operation> operation,
      @javax.annotation.Nullable java.lang.Boolean conditionalUpdate,
      @javax.annotation.Nullable com.fhir.code type,
      @javax.annotation.Nullable java.lang.Boolean readHistory,
      @javax.annotation.Nullable java.lang.Boolean updateCreate) {
    this.extension = extension;
    this.conditionalRead = conditionalRead;
    this.searchParam = searchParam;
    this.modifierExtension = modifierExtension;
    this.conditionalCreate = conditionalCreate;
    this.conditionalDelete = conditionalDelete;
    this.searchInclude = searchInclude;
    this.id = id;
    this.profile = profile;
    this.versioning = versioning;
    this.documentation = documentation;
    this.interaction = interaction;
    this.supportedProfile = supportedProfile;
    this.referencePolicy = referencePolicy;
    this.searchRevInclude = searchRevInclude;
    this.operation = operation;
    this.conditionalUpdate = conditionalUpdate;
    this.type = type;
    this.readHistory = readHistory;
    this.updateCreate = updateCreate;
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
   * @return The value of the {@code conditionalRead} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("conditionalRead")
  @Override
  public java.util.Optional<com.fhir.Capabilitystatement_resourceConditionalread> conditionalRead() {
    return java.util.Optional.ofNullable(conditionalRead);
  }

  /**
   * @return The value of the {@code searchParam} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("searchParam")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CapabilityStatement_SearchParam>> searchParam() {
    return java.util.Optional.ofNullable(searchParam);
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
   * @return The value of the {@code conditionalCreate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("conditionalCreate")
  @Override
  public java.util.Optional<java.lang.Boolean> conditionalCreate() {
    return java.util.Optional.ofNullable(conditionalCreate);
  }

  /**
   * @return The value of the {@code conditionalDelete} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("conditionalDelete")
  @Override
  public java.util.Optional<com.fhir.Capabilitystatement_resourceConditionaldelete> conditionalDelete() {
    return java.util.Optional.ofNullable(conditionalDelete);
  }

  /**
   * @return The value of the {@code searchInclude} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("searchInclude")
  @Override
  public java.util.Optional<java.util.List<java.lang.String>> searchInclude() {
    return java.util.Optional.ofNullable(searchInclude);
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
   * @return The value of the {@code profile} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("profile")
  @Override
  public java.util.Optional<com.fhir.canonical> profile() {
    return java.util.Optional.ofNullable(profile);
  }

  /**
   * @return The value of the {@code versioning} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("versioning")
  @Override
  public java.util.Optional<com.fhir.Capabilitystatement_resourceVersioning> versioning() {
    return java.util.Optional.ofNullable(versioning);
  }

  /**
   * @return The value of the {@code documentation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("documentation")
  @Override
  public java.util.Optional<com.fhir.markdown> documentation() {
    return java.util.Optional.ofNullable(documentation);
  }

  /**
   * @return The value of the {@code interaction} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("interaction")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Interaction>> interaction() {
    return java.util.Optional.ofNullable(interaction);
  }

  /**
   * @return The value of the {@code supportedProfile} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("supportedProfile")
  @Override
  public java.util.Optional<java.util.List<com.fhir.canonical>> supportedProfile() {
    return java.util.Optional.ofNullable(supportedProfile);
  }

  /**
   * @return The value of the {@code referencePolicy} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("referencePolicy")
  @Override
  public java.util.Optional<java.util.List<com.fhir.Capabilitystatement_resourceReferencepolicyItem>> referencePolicy() {
    return java.util.Optional.ofNullable(referencePolicy);
  }

  /**
   * @return The value of the {@code searchRevInclude} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("searchRevInclude")
  @Override
  public java.util.Optional<java.util.List<java.lang.String>> searchRevInclude() {
    return java.util.Optional.ofNullable(searchRevInclude);
  }

  /**
   * @return The value of the {@code operation} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("operation")
  @Override
  public java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Operation>> operation() {
    return java.util.Optional.ofNullable(operation);
  }

  /**
   * @return The value of the {@code conditionalUpdate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("conditionalUpdate")
  @Override
  public java.util.Optional<java.lang.Boolean> conditionalUpdate() {
    return java.util.Optional.ofNullable(conditionalUpdate);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("type")
  @Override
  public java.util.Optional<com.fhir.code> type() {
    return java.util.Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code readHistory} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("readHistory")
  @Override
  public java.util.Optional<java.lang.Boolean> readHistory() {
    return java.util.Optional.ofNullable(readHistory);
  }

  /**
   * @return The value of the {@code updateCreate} attribute
   */
  @com.fasterxml.jackson.annotation.JsonProperty("updateCreate")
  @Override
  public java.util.Optional<java.lang.Boolean> updateCreate() {
    return java.util.Optional.ofNullable(updateCreate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCapabilityStatement_Resource(
        newValue,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        this.profile,
        this.versioning,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Resource withExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCapabilityStatement_Resource(
        value,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        this.profile,
        this.versioning,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#conditionalRead() conditionalRead} attribute.
   * @param value The value for conditionalRead
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withConditionalRead(com.fhir.Capabilitystatement_resourceConditionalread value) {
    @javax.annotation.Nullable com.fhir.Capabilitystatement_resourceConditionalread newValue = java.util.Objects.requireNonNull(value, "conditionalRead");
    if (this.conditionalRead == newValue) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        newValue,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        this.profile,
        this.versioning,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#conditionalRead() conditionalRead} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for conditionalRead
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Resource withConditionalRead(java.util.Optional<? extends com.fhir.Capabilitystatement_resourceConditionalread> optional) {
    @javax.annotation.Nullable com.fhir.Capabilitystatement_resourceConditionalread value = optional.orElse(null);
    if (this.conditionalRead == value) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        value,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        this.profile,
        this.versioning,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#searchParam() searchParam} attribute.
   * @param value The value for searchParam
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withSearchParam(java.util.List<com.fhir.CapabilityStatement_SearchParam> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_SearchParam> newValue = java.util.Objects.requireNonNull(value, "searchParam");
    if (this.searchParam == newValue) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        newValue,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        this.profile,
        this.versioning,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#searchParam() searchParam} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for searchParam
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Resource withSearchParam(java.util.Optional<? extends java.util.List<com.fhir.CapabilityStatement_SearchParam>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_SearchParam> value = optional.orElse(null);
    if (this.searchParam == value) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        value,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        this.profile,
        this.versioning,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withModifierExtension(java.util.List<com.fhir.Extension> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> newValue = java.util.Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        newValue,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        this.profile,
        this.versioning,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Resource withModifierExtension(java.util.Optional<? extends java.util.List<com.fhir.Extension>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        value,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        this.profile,
        this.versioning,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#conditionalCreate() conditionalCreate} attribute.
   * @param value The value for conditionalCreate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withConditionalCreate(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.conditionalCreate, newValue)) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        newValue,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        this.profile,
        this.versioning,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#conditionalCreate() conditionalCreate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for conditionalCreate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withConditionalCreate(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.conditionalCreate, value)) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        value,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        this.profile,
        this.versioning,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#conditionalDelete() conditionalDelete} attribute.
   * @param value The value for conditionalDelete
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withConditionalDelete(com.fhir.Capabilitystatement_resourceConditionaldelete value) {
    @javax.annotation.Nullable com.fhir.Capabilitystatement_resourceConditionaldelete newValue = java.util.Objects.requireNonNull(value, "conditionalDelete");
    if (this.conditionalDelete == newValue) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        newValue,
        this.searchInclude,
        this.id,
        this.profile,
        this.versioning,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#conditionalDelete() conditionalDelete} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for conditionalDelete
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Resource withConditionalDelete(java.util.Optional<? extends com.fhir.Capabilitystatement_resourceConditionaldelete> optional) {
    @javax.annotation.Nullable com.fhir.Capabilitystatement_resourceConditionaldelete value = optional.orElse(null);
    if (this.conditionalDelete == value) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        value,
        this.searchInclude,
        this.id,
        this.profile,
        this.versioning,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#searchInclude() searchInclude} attribute.
   * @param value The value for searchInclude
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withSearchInclude(java.util.List<java.lang.String> value) {
    @javax.annotation.Nullable java.util.List<java.lang.String> newValue = java.util.Objects.requireNonNull(value, "searchInclude");
    if (this.searchInclude == newValue) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        newValue,
        this.id,
        this.profile,
        this.versioning,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#searchInclude() searchInclude} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for searchInclude
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Resource withSearchInclude(java.util.Optional<? extends java.util.List<java.lang.String>> optional) {
    @javax.annotation.Nullable java.util.List<java.lang.String> value = optional.orElse(null);
    if (this.searchInclude == value) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        value,
        this.id,
        this.profile,
        this.versioning,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withId(java.lang.String value) {
    @javax.annotation.Nullable java.lang.String newValue = java.util.Objects.requireNonNull(value, "id");
    if (java.util.Objects.equals(this.id, newValue)) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        newValue,
        this.profile,
        this.versioning,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withId(java.util.Optional<java.lang.String> optional) {
    @javax.annotation.Nullable java.lang.String value = optional.orElse(null);
    if (java.util.Objects.equals(this.id, value)) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        value,
        this.profile,
        this.versioning,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#profile() profile} attribute.
   * @param value The value for profile
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withProfile(com.fhir.canonical value) {
    @javax.annotation.Nullable com.fhir.canonical newValue = java.util.Objects.requireNonNull(value, "profile");
    if (this.profile == newValue) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        newValue,
        this.versioning,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#profile() profile} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for profile
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Resource withProfile(java.util.Optional<? extends com.fhir.canonical> optional) {
    @javax.annotation.Nullable com.fhir.canonical value = optional.orElse(null);
    if (this.profile == value) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        value,
        this.versioning,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#versioning() versioning} attribute.
   * @param value The value for versioning
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withVersioning(com.fhir.Capabilitystatement_resourceVersioning value) {
    @javax.annotation.Nullable com.fhir.Capabilitystatement_resourceVersioning newValue = java.util.Objects.requireNonNull(value, "versioning");
    if (this.versioning == newValue) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        this.profile,
        newValue,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#versioning() versioning} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for versioning
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Resource withVersioning(java.util.Optional<? extends com.fhir.Capabilitystatement_resourceVersioning> optional) {
    @javax.annotation.Nullable com.fhir.Capabilitystatement_resourceVersioning value = optional.orElse(null);
    if (this.versioning == value) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        this.profile,
        value,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#documentation() documentation} attribute.
   * @param value The value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withDocumentation(com.fhir.markdown value) {
    @javax.annotation.Nullable com.fhir.markdown newValue = java.util.Objects.requireNonNull(value, "documentation");
    if (this.documentation == newValue) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        this.profile,
        this.versioning,
        newValue,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#documentation() documentation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for documentation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Resource withDocumentation(java.util.Optional<? extends com.fhir.markdown> optional) {
    @javax.annotation.Nullable com.fhir.markdown value = optional.orElse(null);
    if (this.documentation == value) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        this.profile,
        this.versioning,
        value,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#interaction() interaction} attribute.
   * @param value The value for interaction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withInteraction(java.util.List<com.fhir.CapabilityStatement_Interaction> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Interaction> newValue = java.util.Objects.requireNonNull(value, "interaction");
    if (this.interaction == newValue) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        this.profile,
        this.versioning,
        this.documentation,
        newValue,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#interaction() interaction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for interaction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Resource withInteraction(java.util.Optional<? extends java.util.List<com.fhir.CapabilityStatement_Interaction>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Interaction> value = optional.orElse(null);
    if (this.interaction == value) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        this.profile,
        this.versioning,
        this.documentation,
        value,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#supportedProfile() supportedProfile} attribute.
   * @param value The value for supportedProfile
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withSupportedProfile(java.util.List<com.fhir.canonical> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> newValue = java.util.Objects.requireNonNull(value, "supportedProfile");
    if (this.supportedProfile == newValue) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        this.profile,
        this.versioning,
        this.documentation,
        this.interaction,
        newValue,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#supportedProfile() supportedProfile} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportedProfile
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Resource withSupportedProfile(java.util.Optional<? extends java.util.List<com.fhir.canonical>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.canonical> value = optional.orElse(null);
    if (this.supportedProfile == value) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        this.profile,
        this.versioning,
        this.documentation,
        this.interaction,
        value,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#referencePolicy() referencePolicy} attribute.
   * @param value The value for referencePolicy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withReferencePolicy(java.util.List<com.fhir.Capabilitystatement_resourceReferencepolicyItem> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.Capabilitystatement_resourceReferencepolicyItem> newValue = java.util.Objects.requireNonNull(value, "referencePolicy");
    if (this.referencePolicy == newValue) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        this.profile,
        this.versioning,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        newValue,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#referencePolicy() referencePolicy} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for referencePolicy
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Resource withReferencePolicy(java.util.Optional<? extends java.util.List<com.fhir.Capabilitystatement_resourceReferencepolicyItem>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.Capabilitystatement_resourceReferencepolicyItem> value = optional.orElse(null);
    if (this.referencePolicy == value) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        this.profile,
        this.versioning,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        value,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#searchRevInclude() searchRevInclude} attribute.
   * @param value The value for searchRevInclude
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withSearchRevInclude(java.util.List<java.lang.String> value) {
    @javax.annotation.Nullable java.util.List<java.lang.String> newValue = java.util.Objects.requireNonNull(value, "searchRevInclude");
    if (this.searchRevInclude == newValue) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        this.profile,
        this.versioning,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        newValue,
        this.operation,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#searchRevInclude() searchRevInclude} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for searchRevInclude
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Resource withSearchRevInclude(java.util.Optional<? extends java.util.List<java.lang.String>> optional) {
    @javax.annotation.Nullable java.util.List<java.lang.String> value = optional.orElse(null);
    if (this.searchRevInclude == value) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        this.profile,
        this.versioning,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        value,
        this.operation,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#operation() operation} attribute.
   * @param value The value for operation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withOperation(java.util.List<com.fhir.CapabilityStatement_Operation> value) {
    @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Operation> newValue = java.util.Objects.requireNonNull(value, "operation");
    if (this.operation == newValue) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        this.profile,
        this.versioning,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        newValue,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#operation() operation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for operation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Resource withOperation(java.util.Optional<? extends java.util.List<com.fhir.CapabilityStatement_Operation>> optional) {
    @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Operation> value = optional.orElse(null);
    if (this.operation == value) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        this.profile,
        this.versioning,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        value,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#conditionalUpdate() conditionalUpdate} attribute.
   * @param value The value for conditionalUpdate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withConditionalUpdate(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.conditionalUpdate, newValue)) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        this.profile,
        this.versioning,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        newValue,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#conditionalUpdate() conditionalUpdate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for conditionalUpdate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withConditionalUpdate(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.conditionalUpdate, value)) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        this.profile,
        this.versioning,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        value,
        this.type,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withType(com.fhir.code value) {
    @javax.annotation.Nullable com.fhir.code newValue = java.util.Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        this.profile,
        this.versioning,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        newValue,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Resource withType(java.util.Optional<? extends com.fhir.code> optional) {
    @javax.annotation.Nullable com.fhir.code value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        this.profile,
        this.versioning,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        value,
        this.readHistory,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#readHistory() readHistory} attribute.
   * @param value The value for readHistory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withReadHistory(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.readHistory, newValue)) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        this.profile,
        this.versioning,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        this.type,
        newValue,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#readHistory() readHistory} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for readHistory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withReadHistory(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.readHistory, value)) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        this.profile,
        this.versioning,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        this.type,
        value,
        this.updateCreate);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#updateCreate() updateCreate} attribute.
   * @param value The value for updateCreate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withUpdateCreate(boolean value) {
    @javax.annotation.Nullable java.lang.Boolean newValue = value;
    if (java.util.Objects.equals(this.updateCreate, newValue)) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        this.profile,
        this.versioning,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#updateCreate() updateCreate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for updateCreate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withUpdateCreate(java.util.Optional<java.lang.Boolean> optional) {
    @javax.annotation.Nullable java.lang.Boolean value = optional.orElse(null);
    if (java.util.Objects.equals(this.updateCreate, value)) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.extension,
        this.conditionalRead,
        this.searchParam,
        this.modifierExtension,
        this.conditionalCreate,
        this.conditionalDelete,
        this.searchInclude,
        this.id,
        this.profile,
        this.versioning,
        this.documentation,
        this.interaction,
        this.supportedProfile,
        this.referencePolicy,
        this.searchRevInclude,
        this.operation,
        this.conditionalUpdate,
        this.type,
        this.readHistory,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCapabilityStatement_Resource} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@javax.annotation.Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCapabilityStatement_Resource
        && equalTo((ImmutableCapabilityStatement_Resource) another);
  }

  private boolean equalTo(ImmutableCapabilityStatement_Resource another) {
    return java.util.Objects.equals(extension, another.extension)
        && java.util.Objects.equals(conditionalRead, another.conditionalRead)
        && java.util.Objects.equals(searchParam, another.searchParam)
        && java.util.Objects.equals(modifierExtension, another.modifierExtension)
        && java.util.Objects.equals(conditionalCreate, another.conditionalCreate)
        && java.util.Objects.equals(conditionalDelete, another.conditionalDelete)
        && java.util.Objects.equals(searchInclude, another.searchInclude)
        && java.util.Objects.equals(id, another.id)
        && java.util.Objects.equals(profile, another.profile)
        && java.util.Objects.equals(versioning, another.versioning)
        && java.util.Objects.equals(documentation, another.documentation)
        && java.util.Objects.equals(interaction, another.interaction)
        && java.util.Objects.equals(supportedProfile, another.supportedProfile)
        && java.util.Objects.equals(referencePolicy, another.referencePolicy)
        && java.util.Objects.equals(searchRevInclude, another.searchRevInclude)
        && java.util.Objects.equals(operation, another.operation)
        && java.util.Objects.equals(conditionalUpdate, another.conditionalUpdate)
        && java.util.Objects.equals(type, another.type)
        && java.util.Objects.equals(readHistory, another.readHistory)
        && java.util.Objects.equals(updateCreate, another.updateCreate);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code conditionalRead}, {@code searchParam}, {@code modifierExtension}, {@code conditionalCreate}, {@code conditionalDelete}, {@code searchInclude}, {@code id}, {@code profile}, {@code versioning}, {@code documentation}, {@code interaction}, {@code supportedProfile}, {@code referencePolicy}, {@code searchRevInclude}, {@code operation}, {@code conditionalUpdate}, {@code type}, {@code readHistory}, {@code updateCreate}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + java.util.Objects.hashCode(extension);
    h += (h << 5) + java.util.Objects.hashCode(conditionalRead);
    h += (h << 5) + java.util.Objects.hashCode(searchParam);
    h += (h << 5) + java.util.Objects.hashCode(modifierExtension);
    h += (h << 5) + java.util.Objects.hashCode(conditionalCreate);
    h += (h << 5) + java.util.Objects.hashCode(conditionalDelete);
    h += (h << 5) + java.util.Objects.hashCode(searchInclude);
    h += (h << 5) + java.util.Objects.hashCode(id);
    h += (h << 5) + java.util.Objects.hashCode(profile);
    h += (h << 5) + java.util.Objects.hashCode(versioning);
    h += (h << 5) + java.util.Objects.hashCode(documentation);
    h += (h << 5) + java.util.Objects.hashCode(interaction);
    h += (h << 5) + java.util.Objects.hashCode(supportedProfile);
    h += (h << 5) + java.util.Objects.hashCode(referencePolicy);
    h += (h << 5) + java.util.Objects.hashCode(searchRevInclude);
    h += (h << 5) + java.util.Objects.hashCode(operation);
    h += (h << 5) + java.util.Objects.hashCode(conditionalUpdate);
    h += (h << 5) + java.util.Objects.hashCode(type);
    h += (h << 5) + java.util.Objects.hashCode(readHistory);
    h += (h << 5) + java.util.Objects.hashCode(updateCreate);
    return h;
  }

  /**
   * Prints the immutable value {@code CapabilityStatement_Resource} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    java.lang.StringBuilder builder = new java.lang.StringBuilder("CapabilityStatement_Resource{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (conditionalRead != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("conditionalRead=").append(conditionalRead);
    }
    if (searchParam != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("searchParam=").append(searchParam);
    }
    if (modifierExtension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (conditionalCreate != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("conditionalCreate=").append(conditionalCreate);
    }
    if (conditionalDelete != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("conditionalDelete=").append(conditionalDelete);
    }
    if (searchInclude != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("searchInclude=").append(searchInclude);
    }
    if (id != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (profile != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("profile=").append(profile);
    }
    if (versioning != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("versioning=").append(versioning);
    }
    if (documentation != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("documentation=").append(documentation);
    }
    if (interaction != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("interaction=").append(interaction);
    }
    if (supportedProfile != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("supportedProfile=").append(supportedProfile);
    }
    if (referencePolicy != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("referencePolicy=").append(referencePolicy);
    }
    if (searchRevInclude != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("searchRevInclude=").append(searchRevInclude);
    }
    if (operation != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("operation=").append(operation);
    }
    if (conditionalUpdate != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("conditionalUpdate=").append(conditionalUpdate);
    }
    if (type != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (readHistory != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("readHistory=").append(readHistory);
    }
    if (updateCreate != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("updateCreate=").append(updateCreate);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @org.immutables.value.Generated(from = "CapabilityStatement_Resource", generator = "Immutables")
  @Deprecated
  @com.fasterxml.jackson.databind.annotation.JsonDeserialize
  @com.fasterxml.jackson.annotation.JsonAutoDetect(fieldVisibility = com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE)
  static final class Json implements com.fhir.CapabilityStatement_Resource {
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> extension = java.util.Optional.empty();
    boolean extensionIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Capabilitystatement_resourceConditionalread> conditionalRead = java.util.Optional.empty();
    boolean conditionalReadIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CapabilityStatement_SearchParam>> searchParam = java.util.Optional.empty();
    boolean searchParamIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension = java.util.Optional.empty();
    boolean modifierExtensionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> conditionalCreate = java.util.Optional.empty();
    boolean conditionalCreateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Capabilitystatement_resourceConditionaldelete> conditionalDelete = java.util.Optional.empty();
    boolean conditionalDeleteIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<java.lang.String>> searchInclude = java.util.Optional.empty();
    boolean searchIncludeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.String> id = java.util.Optional.empty();
    boolean idIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.canonical> profile = java.util.Optional.empty();
    boolean profileIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.Capabilitystatement_resourceVersioning> versioning = java.util.Optional.empty();
    boolean versioningIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.markdown> documentation = java.util.Optional.empty();
    boolean documentationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Interaction>> interaction = java.util.Optional.empty();
    boolean interactionIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.canonical>> supportedProfile = java.util.Optional.empty();
    boolean supportedProfileIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.Capabilitystatement_resourceReferencepolicyItem>> referencePolicy = java.util.Optional.empty();
    boolean referencePolicyIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<java.lang.String>> searchRevInclude = java.util.Optional.empty();
    boolean searchRevIncludeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Operation>> operation = java.util.Optional.empty();
    boolean operationIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> conditionalUpdate = java.util.Optional.empty();
    boolean conditionalUpdateIsSet;
    @javax.annotation.Nullable java.util.Optional<com.fhir.code> type = java.util.Optional.empty();
    boolean typeIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> readHistory = java.util.Optional.empty();
    boolean readHistoryIsSet;
    @javax.annotation.Nullable java.util.Optional<java.lang.Boolean> updateCreate = java.util.Optional.empty();
    boolean updateCreateIsSet;
    @com.fasterxml.jackson.annotation.JsonProperty("extension")
    public void setExtension(java.util.Optional<java.util.List<com.fhir.Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("conditionalRead")
    public void setConditionalRead(java.util.Optional<com.fhir.Capabilitystatement_resourceConditionalread> conditionalRead) {
      this.conditionalRead = conditionalRead;
      this.conditionalReadIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("searchParam")
    public void setSearchParam(java.util.Optional<java.util.List<com.fhir.CapabilityStatement_SearchParam>> searchParam) {
      this.searchParam = searchParam;
      this.searchParamIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("modifierExtension")
    public void setModifierExtension(java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("conditionalCreate")
    public void setConditionalCreate(java.util.Optional<java.lang.Boolean> conditionalCreate) {
      this.conditionalCreate = conditionalCreate;
      this.conditionalCreateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("conditionalDelete")
    public void setConditionalDelete(java.util.Optional<com.fhir.Capabilitystatement_resourceConditionaldelete> conditionalDelete) {
      this.conditionalDelete = conditionalDelete;
      this.conditionalDeleteIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("searchInclude")
    public void setSearchInclude(java.util.Optional<java.util.List<java.lang.String>> searchInclude) {
      this.searchInclude = searchInclude;
      this.searchIncludeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    public void setId(java.util.Optional<java.lang.String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("profile")
    public void setProfile(java.util.Optional<com.fhir.canonical> profile) {
      this.profile = profile;
      this.profileIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("versioning")
    public void setVersioning(java.util.Optional<com.fhir.Capabilitystatement_resourceVersioning> versioning) {
      this.versioning = versioning;
      this.versioningIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("documentation")
    public void setDocumentation(java.util.Optional<com.fhir.markdown> documentation) {
      this.documentation = documentation;
      this.documentationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("interaction")
    public void setInteraction(java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Interaction>> interaction) {
      this.interaction = interaction;
      this.interactionIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("supportedProfile")
    public void setSupportedProfile(java.util.Optional<java.util.List<com.fhir.canonical>> supportedProfile) {
      this.supportedProfile = supportedProfile;
      this.supportedProfileIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("referencePolicy")
    public void setReferencePolicy(java.util.Optional<java.util.List<com.fhir.Capabilitystatement_resourceReferencepolicyItem>> referencePolicy) {
      this.referencePolicy = referencePolicy;
      this.referencePolicyIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("searchRevInclude")
    public void setSearchRevInclude(java.util.Optional<java.util.List<java.lang.String>> searchRevInclude) {
      this.searchRevInclude = searchRevInclude;
      this.searchRevIncludeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    public void setOperation(java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Operation>> operation) {
      this.operation = operation;
      this.operationIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("conditionalUpdate")
    public void setConditionalUpdate(java.util.Optional<java.lang.Boolean> conditionalUpdate) {
      this.conditionalUpdate = conditionalUpdate;
      this.conditionalUpdateIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public void setType(java.util.Optional<com.fhir.code> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("readHistory")
    public void setReadHistory(java.util.Optional<java.lang.Boolean> readHistory) {
      this.readHistory = readHistory;
      this.readHistoryIsSet = true;
    }
    @com.fasterxml.jackson.annotation.JsonProperty("updateCreate")
    public void setUpdateCreate(java.util.Optional<java.lang.Boolean> updateCreate) {
      this.updateCreate = updateCreate;
      this.updateCreateIsSet = true;
    }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Capabilitystatement_resourceConditionalread> conditionalRead() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CapabilityStatement_SearchParam>> searchParam() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> conditionalCreate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Capabilitystatement_resourceConditionaldelete> conditionalDelete() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<java.lang.String>> searchInclude() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.String> id() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.canonical> profile() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.Capabilitystatement_resourceVersioning> versioning() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.markdown> documentation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Interaction>> interaction() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.canonical>> supportedProfile() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.Capabilitystatement_resourceReferencepolicyItem>> referencePolicy() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<java.lang.String>> searchRevInclude() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.util.List<com.fhir.CapabilityStatement_Operation>> operation() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> conditionalUpdate() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<com.fhir.code> type() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> readHistory() { throw new UnsupportedOperationException(); }
    @Override
    public java.util.Optional<java.lang.Boolean> updateCreate() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @com.fasterxml.jackson.annotation.JsonCreator(mode = com.fasterxml.jackson.annotation.JsonCreator.Mode.DELEGATING)
  static ImmutableCapabilityStatement_Resource fromJson(Json json) {
    ImmutableCapabilityStatement_Resource.Builder builder = ImmutableCapabilityStatement_Resource.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.conditionalReadIsSet) {
      builder.conditionalRead(json.conditionalRead);
    }
    if (json.searchParamIsSet) {
      builder.searchParam(json.searchParam);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.conditionalCreateIsSet) {
      builder.conditionalCreate(json.conditionalCreate);
    }
    if (json.conditionalDeleteIsSet) {
      builder.conditionalDelete(json.conditionalDelete);
    }
    if (json.searchIncludeIsSet) {
      builder.searchInclude(json.searchInclude);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.profileIsSet) {
      builder.profile(json.profile);
    }
    if (json.versioningIsSet) {
      builder.versioning(json.versioning);
    }
    if (json.documentationIsSet) {
      builder.documentation(json.documentation);
    }
    if (json.interactionIsSet) {
      builder.interaction(json.interaction);
    }
    if (json.supportedProfileIsSet) {
      builder.supportedProfile(json.supportedProfile);
    }
    if (json.referencePolicyIsSet) {
      builder.referencePolicy(json.referencePolicy);
    }
    if (json.searchRevIncludeIsSet) {
      builder.searchRevInclude(json.searchRevInclude);
    }
    if (json.operationIsSet) {
      builder.operation(json.operation);
    }
    if (json.conditionalUpdateIsSet) {
      builder.conditionalUpdate(json.conditionalUpdate);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.readHistoryIsSet) {
      builder.readHistory(json.readHistory);
    }
    if (json.updateCreateIsSet) {
      builder.updateCreate(json.updateCreate);
    }
    return (ImmutableCapabilityStatement_Resource) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CapabilityStatement_Resource} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CapabilityStatement_Resource instance
   */
  public static CapabilityStatement_Resource copyOf(CapabilityStatement_Resource instance) {
    if (instance instanceof ImmutableCapabilityStatement_Resource) {
      return (ImmutableCapabilityStatement_Resource) instance;
    }
    return ImmutableCapabilityStatement_Resource.builder()
        .extension(instance.extension())
        .conditionalRead(instance.conditionalRead())
        .searchParam(instance.searchParam())
        .modifierExtension(instance.modifierExtension())
        .conditionalCreate(instance.conditionalCreate())
        .conditionalDelete(instance.conditionalDelete())
        .searchInclude(instance.searchInclude())
        .id(instance.id())
        .profile(instance.profile())
        .versioning(instance.versioning())
        .documentation(instance.documentation())
        .interaction(instance.interaction())
        .supportedProfile(instance.supportedProfile())
        .referencePolicy(instance.referencePolicy())
        .searchRevInclude(instance.searchRevInclude())
        .operation(instance.operation())
        .conditionalUpdate(instance.conditionalUpdate())
        .type(instance.type())
        .readHistory(instance.readHistory())
        .updateCreate(instance.updateCreate())
        .build();
  }

  /**
   * Creates a builder for {@link CapabilityStatement_Resource CapabilityStatement_Resource}.
   * <pre>
   * ImmutableCapabilityStatement_Resource.builder()
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CapabilityStatement_Resource#extension() extension}
   *    .conditionalRead(com.fhir.Capabilitystatement_resourceConditionalread) // optional {@link CapabilityStatement_Resource#conditionalRead() conditionalRead}
   *    .searchParam(List&amp;lt;com.fhir.CapabilityStatement_SearchParam&amp;gt;) // optional {@link CapabilityStatement_Resource#searchParam() searchParam}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link CapabilityStatement_Resource#modifierExtension() modifierExtension}
   *    .conditionalCreate(Boolean) // optional {@link CapabilityStatement_Resource#conditionalCreate() conditionalCreate}
   *    .conditionalDelete(com.fhir.Capabilitystatement_resourceConditionaldelete) // optional {@link CapabilityStatement_Resource#conditionalDelete() conditionalDelete}
   *    .searchInclude(List&amp;lt;String&amp;gt;) // optional {@link CapabilityStatement_Resource#searchInclude() searchInclude}
   *    .id(String) // optional {@link CapabilityStatement_Resource#id() id}
   *    .profile(com.fhir.canonical) // optional {@link CapabilityStatement_Resource#profile() profile}
   *    .versioning(com.fhir.Capabilitystatement_resourceVersioning) // optional {@link CapabilityStatement_Resource#versioning() versioning}
   *    .documentation(com.fhir.markdown) // optional {@link CapabilityStatement_Resource#documentation() documentation}
   *    .interaction(List&amp;lt;com.fhir.CapabilityStatement_Interaction&amp;gt;) // optional {@link CapabilityStatement_Resource#interaction() interaction}
   *    .supportedProfile(List&amp;lt;com.fhir.canonical&amp;gt;) // optional {@link CapabilityStatement_Resource#supportedProfile() supportedProfile}
   *    .referencePolicy(List&amp;lt;com.fhir.Capabilitystatement_resourceReferencepolicyItem&amp;gt;) // optional {@link CapabilityStatement_Resource#referencePolicy() referencePolicy}
   *    .searchRevInclude(List&amp;lt;String&amp;gt;) // optional {@link CapabilityStatement_Resource#searchRevInclude() searchRevInclude}
   *    .operation(List&amp;lt;com.fhir.CapabilityStatement_Operation&amp;gt;) // optional {@link CapabilityStatement_Resource#operation() operation}
   *    .conditionalUpdate(Boolean) // optional {@link CapabilityStatement_Resource#conditionalUpdate() conditionalUpdate}
   *    .type(com.fhir.code) // optional {@link CapabilityStatement_Resource#type() type}
   *    .readHistory(Boolean) // optional {@link CapabilityStatement_Resource#readHistory() readHistory}
   *    .updateCreate(Boolean) // optional {@link CapabilityStatement_Resource#updateCreate() updateCreate}
   *    .build();
   * </pre>
   * @return A new CapabilityStatement_Resource builder
   */
  public static ImmutableCapabilityStatement_Resource.Builder builder() {
    return new ImmutableCapabilityStatement_Resource.Builder();
  }

  /**
   * Builds instances of type {@link CapabilityStatement_Resource CapabilityStatement_Resource}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @org.immutables.value.Generated(from = "CapabilityStatement_Resource", generator = "Immutables")
  @javax.annotation.concurrent.NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_CONDITIONAL_READ = 0x2L;
    private static final long OPT_BIT_SEARCH_PARAM = 0x4L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x8L;
    private static final long OPT_BIT_CONDITIONAL_CREATE = 0x10L;
    private static final long OPT_BIT_CONDITIONAL_DELETE = 0x20L;
    private static final long OPT_BIT_SEARCH_INCLUDE = 0x40L;
    private static final long OPT_BIT_ID = 0x80L;
    private static final long OPT_BIT_PROFILE = 0x100L;
    private static final long OPT_BIT_VERSIONING = 0x200L;
    private static final long OPT_BIT_DOCUMENTATION = 0x400L;
    private static final long OPT_BIT_INTERACTION = 0x800L;
    private static final long OPT_BIT_SUPPORTED_PROFILE = 0x1000L;
    private static final long OPT_BIT_REFERENCE_POLICY = 0x2000L;
    private static final long OPT_BIT_SEARCH_REV_INCLUDE = 0x4000L;
    private static final long OPT_BIT_OPERATION = 0x8000L;
    private static final long OPT_BIT_CONDITIONAL_UPDATE = 0x10000L;
    private static final long OPT_BIT_TYPE = 0x20000L;
    private static final long OPT_BIT_READ_HISTORY = 0x40000L;
    private static final long OPT_BIT_UPDATE_CREATE = 0x80000L;
    private long optBits;

    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> extension;
    private @javax.annotation.Nullable com.fhir.Capabilitystatement_resourceConditionalread conditionalRead;
    private @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_SearchParam> searchParam;
    private @javax.annotation.Nullable java.util.List<com.fhir.Extension> modifierExtension;
    private @javax.annotation.Nullable java.lang.Boolean conditionalCreate;
    private @javax.annotation.Nullable com.fhir.Capabilitystatement_resourceConditionaldelete conditionalDelete;
    private @javax.annotation.Nullable java.util.List<java.lang.String> searchInclude;
    private @javax.annotation.Nullable java.lang.String id;
    private @javax.annotation.Nullable com.fhir.canonical profile;
    private @javax.annotation.Nullable com.fhir.Capabilitystatement_resourceVersioning versioning;
    private @javax.annotation.Nullable com.fhir.markdown documentation;
    private @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Interaction> interaction;
    private @javax.annotation.Nullable java.util.List<com.fhir.canonical> supportedProfile;
    private @javax.annotation.Nullable java.util.List<com.fhir.Capabilitystatement_resourceReferencepolicyItem> referencePolicy;
    private @javax.annotation.Nullable java.util.List<java.lang.String> searchRevInclude;
    private @javax.annotation.Nullable java.util.List<com.fhir.CapabilityStatement_Operation> operation;
    private @javax.annotation.Nullable java.lang.Boolean conditionalUpdate;
    private @javax.annotation.Nullable com.fhir.code type;
    private @javax.annotation.Nullable java.lang.Boolean readHistory;
    private @javax.annotation.Nullable java.lang.Boolean updateCreate;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#extension() extension} to extension.
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
     * Initializes the optional value {@link CapabilityStatement_Resource#extension() extension} to extension.
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
     * Initializes the optional value {@link CapabilityStatement_Resource#conditionalRead() conditionalRead} to conditionalRead.
     * @param conditionalRead The value for conditionalRead
     * @return {@code this} builder for chained invocation
     */
    public final Builder conditionalRead(com.fhir.Capabilitystatement_resourceConditionalread conditionalRead) {
      checkNotIsSet(conditionalReadIsSet(), "conditionalRead");
      this.conditionalRead = java.util.Objects.requireNonNull(conditionalRead, "conditionalRead");
      optBits |= OPT_BIT_CONDITIONAL_READ;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#conditionalRead() conditionalRead} to conditionalRead.
     * @param conditionalRead The value for conditionalRead
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("conditionalRead")
    public final Builder conditionalRead(java.util.Optional<? extends com.fhir.Capabilitystatement_resourceConditionalread> conditionalRead) {
      checkNotIsSet(conditionalReadIsSet(), "conditionalRead");
      this.conditionalRead = conditionalRead.orElse(null);
      optBits |= OPT_BIT_CONDITIONAL_READ;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#searchParam() searchParam} to searchParam.
     * @param searchParam The value for searchParam
     * @return {@code this} builder for chained invocation
     */
    public final Builder searchParam(java.util.List<com.fhir.CapabilityStatement_SearchParam> searchParam) {
      checkNotIsSet(searchParamIsSet(), "searchParam");
      this.searchParam = java.util.Objects.requireNonNull(searchParam, "searchParam");
      optBits |= OPT_BIT_SEARCH_PARAM;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#searchParam() searchParam} to searchParam.
     * @param searchParam The value for searchParam
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("searchParam")
    public final Builder searchParam(java.util.Optional<? extends java.util.List<com.fhir.CapabilityStatement_SearchParam>> searchParam) {
      checkNotIsSet(searchParamIsSet(), "searchParam");
      this.searchParam = searchParam.orElse(null);
      optBits |= OPT_BIT_SEARCH_PARAM;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CapabilityStatement_Resource#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CapabilityStatement_Resource#conditionalCreate() conditionalCreate} to conditionalCreate.
     * @param conditionalCreate The value for conditionalCreate
     * @return {@code this} builder for chained invocation
     */
    public final Builder conditionalCreate(boolean conditionalCreate) {
      checkNotIsSet(conditionalCreateIsSet(), "conditionalCreate");
      this.conditionalCreate = conditionalCreate;
      optBits |= OPT_BIT_CONDITIONAL_CREATE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#conditionalCreate() conditionalCreate} to conditionalCreate.
     * @param conditionalCreate The value for conditionalCreate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("conditionalCreate")
    public final Builder conditionalCreate(java.util.Optional<java.lang.Boolean> conditionalCreate) {
      checkNotIsSet(conditionalCreateIsSet(), "conditionalCreate");
      this.conditionalCreate = conditionalCreate.orElse(null);
      optBits |= OPT_BIT_CONDITIONAL_CREATE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#conditionalDelete() conditionalDelete} to conditionalDelete.
     * @param conditionalDelete The value for conditionalDelete
     * @return {@code this} builder for chained invocation
     */
    public final Builder conditionalDelete(com.fhir.Capabilitystatement_resourceConditionaldelete conditionalDelete) {
      checkNotIsSet(conditionalDeleteIsSet(), "conditionalDelete");
      this.conditionalDelete = java.util.Objects.requireNonNull(conditionalDelete, "conditionalDelete");
      optBits |= OPT_BIT_CONDITIONAL_DELETE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#conditionalDelete() conditionalDelete} to conditionalDelete.
     * @param conditionalDelete The value for conditionalDelete
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("conditionalDelete")
    public final Builder conditionalDelete(java.util.Optional<? extends com.fhir.Capabilitystatement_resourceConditionaldelete> conditionalDelete) {
      checkNotIsSet(conditionalDeleteIsSet(), "conditionalDelete");
      this.conditionalDelete = conditionalDelete.orElse(null);
      optBits |= OPT_BIT_CONDITIONAL_DELETE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#searchInclude() searchInclude} to searchInclude.
     * @param searchInclude The value for searchInclude
     * @return {@code this} builder for chained invocation
     */
    public final Builder searchInclude(java.util.List<java.lang.String> searchInclude) {
      checkNotIsSet(searchIncludeIsSet(), "searchInclude");
      this.searchInclude = java.util.Objects.requireNonNull(searchInclude, "searchInclude");
      optBits |= OPT_BIT_SEARCH_INCLUDE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#searchInclude() searchInclude} to searchInclude.
     * @param searchInclude The value for searchInclude
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("searchInclude")
    public final Builder searchInclude(java.util.Optional<? extends java.util.List<java.lang.String>> searchInclude) {
      checkNotIsSet(searchIncludeIsSet(), "searchInclude");
      this.searchInclude = searchInclude.orElse(null);
      optBits |= OPT_BIT_SEARCH_INCLUDE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#id() id} to id.
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
     * Initializes the optional value {@link CapabilityStatement_Resource#id() id} to id.
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
     * Initializes the optional value {@link CapabilityStatement_Resource#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for chained invocation
     */
    public final Builder profile(com.fhir.canonical profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = java.util.Objects.requireNonNull(profile, "profile");
      optBits |= OPT_BIT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("profile")
    public final Builder profile(java.util.Optional<? extends com.fhir.canonical> profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = profile.orElse(null);
      optBits |= OPT_BIT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#versioning() versioning} to versioning.
     * @param versioning The value for versioning
     * @return {@code this} builder for chained invocation
     */
    public final Builder versioning(com.fhir.Capabilitystatement_resourceVersioning versioning) {
      checkNotIsSet(versioningIsSet(), "versioning");
      this.versioning = java.util.Objects.requireNonNull(versioning, "versioning");
      optBits |= OPT_BIT_VERSIONING;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#versioning() versioning} to versioning.
     * @param versioning The value for versioning
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("versioning")
    public final Builder versioning(java.util.Optional<? extends com.fhir.Capabilitystatement_resourceVersioning> versioning) {
      checkNotIsSet(versioningIsSet(), "versioning");
      this.versioning = versioning.orElse(null);
      optBits |= OPT_BIT_VERSIONING;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for chained invocation
     */
    public final Builder documentation(com.fhir.markdown documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = java.util.Objects.requireNonNull(documentation, "documentation");
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("documentation")
    public final Builder documentation(java.util.Optional<? extends com.fhir.markdown> documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = documentation.orElse(null);
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#interaction() interaction} to interaction.
     * @param interaction The value for interaction
     * @return {@code this} builder for chained invocation
     */
    public final Builder interaction(java.util.List<com.fhir.CapabilityStatement_Interaction> interaction) {
      checkNotIsSet(interactionIsSet(), "interaction");
      this.interaction = java.util.Objects.requireNonNull(interaction, "interaction");
      optBits |= OPT_BIT_INTERACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#interaction() interaction} to interaction.
     * @param interaction The value for interaction
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("interaction")
    public final Builder interaction(java.util.Optional<? extends java.util.List<com.fhir.CapabilityStatement_Interaction>> interaction) {
      checkNotIsSet(interactionIsSet(), "interaction");
      this.interaction = interaction.orElse(null);
      optBits |= OPT_BIT_INTERACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#supportedProfile() supportedProfile} to supportedProfile.
     * @param supportedProfile The value for supportedProfile
     * @return {@code this} builder for chained invocation
     */
    public final Builder supportedProfile(java.util.List<com.fhir.canonical> supportedProfile) {
      checkNotIsSet(supportedProfileIsSet(), "supportedProfile");
      this.supportedProfile = java.util.Objects.requireNonNull(supportedProfile, "supportedProfile");
      optBits |= OPT_BIT_SUPPORTED_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#supportedProfile() supportedProfile} to supportedProfile.
     * @param supportedProfile The value for supportedProfile
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("supportedProfile")
    public final Builder supportedProfile(java.util.Optional<? extends java.util.List<com.fhir.canonical>> supportedProfile) {
      checkNotIsSet(supportedProfileIsSet(), "supportedProfile");
      this.supportedProfile = supportedProfile.orElse(null);
      optBits |= OPT_BIT_SUPPORTED_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#referencePolicy() referencePolicy} to referencePolicy.
     * @param referencePolicy The value for referencePolicy
     * @return {@code this} builder for chained invocation
     */
    public final Builder referencePolicy(java.util.List<com.fhir.Capabilitystatement_resourceReferencepolicyItem> referencePolicy) {
      checkNotIsSet(referencePolicyIsSet(), "referencePolicy");
      this.referencePolicy = java.util.Objects.requireNonNull(referencePolicy, "referencePolicy");
      optBits |= OPT_BIT_REFERENCE_POLICY;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#referencePolicy() referencePolicy} to referencePolicy.
     * @param referencePolicy The value for referencePolicy
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("referencePolicy")
    public final Builder referencePolicy(java.util.Optional<? extends java.util.List<com.fhir.Capabilitystatement_resourceReferencepolicyItem>> referencePolicy) {
      checkNotIsSet(referencePolicyIsSet(), "referencePolicy");
      this.referencePolicy = referencePolicy.orElse(null);
      optBits |= OPT_BIT_REFERENCE_POLICY;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#searchRevInclude() searchRevInclude} to searchRevInclude.
     * @param searchRevInclude The value for searchRevInclude
     * @return {@code this} builder for chained invocation
     */
    public final Builder searchRevInclude(java.util.List<java.lang.String> searchRevInclude) {
      checkNotIsSet(searchRevIncludeIsSet(), "searchRevInclude");
      this.searchRevInclude = java.util.Objects.requireNonNull(searchRevInclude, "searchRevInclude");
      optBits |= OPT_BIT_SEARCH_REV_INCLUDE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#searchRevInclude() searchRevInclude} to searchRevInclude.
     * @param searchRevInclude The value for searchRevInclude
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("searchRevInclude")
    public final Builder searchRevInclude(java.util.Optional<? extends java.util.List<java.lang.String>> searchRevInclude) {
      checkNotIsSet(searchRevIncludeIsSet(), "searchRevInclude");
      this.searchRevInclude = searchRevInclude.orElse(null);
      optBits |= OPT_BIT_SEARCH_REV_INCLUDE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#operation() operation} to operation.
     * @param operation The value for operation
     * @return {@code this} builder for chained invocation
     */
    public final Builder operation(java.util.List<com.fhir.CapabilityStatement_Operation> operation) {
      checkNotIsSet(operationIsSet(), "operation");
      this.operation = java.util.Objects.requireNonNull(operation, "operation");
      optBits |= OPT_BIT_OPERATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#operation() operation} to operation.
     * @param operation The value for operation
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("operation")
    public final Builder operation(java.util.Optional<? extends java.util.List<com.fhir.CapabilityStatement_Operation>> operation) {
      checkNotIsSet(operationIsSet(), "operation");
      this.operation = operation.orElse(null);
      optBits |= OPT_BIT_OPERATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#conditionalUpdate() conditionalUpdate} to conditionalUpdate.
     * @param conditionalUpdate The value for conditionalUpdate
     * @return {@code this} builder for chained invocation
     */
    public final Builder conditionalUpdate(boolean conditionalUpdate) {
      checkNotIsSet(conditionalUpdateIsSet(), "conditionalUpdate");
      this.conditionalUpdate = conditionalUpdate;
      optBits |= OPT_BIT_CONDITIONAL_UPDATE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#conditionalUpdate() conditionalUpdate} to conditionalUpdate.
     * @param conditionalUpdate The value for conditionalUpdate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("conditionalUpdate")
    public final Builder conditionalUpdate(java.util.Optional<java.lang.Boolean> conditionalUpdate) {
      checkNotIsSet(conditionalUpdateIsSet(), "conditionalUpdate");
      this.conditionalUpdate = conditionalUpdate.orElse(null);
      optBits |= OPT_BIT_CONDITIONAL_UPDATE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(com.fhir.code type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = java.util.Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    public final Builder type(java.util.Optional<? extends com.fhir.code> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#readHistory() readHistory} to readHistory.
     * @param readHistory The value for readHistory
     * @return {@code this} builder for chained invocation
     */
    public final Builder readHistory(boolean readHistory) {
      checkNotIsSet(readHistoryIsSet(), "readHistory");
      this.readHistory = readHistory;
      optBits |= OPT_BIT_READ_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#readHistory() readHistory} to readHistory.
     * @param readHistory The value for readHistory
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readHistory")
    public final Builder readHistory(java.util.Optional<java.lang.Boolean> readHistory) {
      checkNotIsSet(readHistoryIsSet(), "readHistory");
      this.readHistory = readHistory.orElse(null);
      optBits |= OPT_BIT_READ_HISTORY;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#updateCreate() updateCreate} to updateCreate.
     * @param updateCreate The value for updateCreate
     * @return {@code this} builder for chained invocation
     */
    public final Builder updateCreate(boolean updateCreate) {
      checkNotIsSet(updateCreateIsSet(), "updateCreate");
      this.updateCreate = updateCreate;
      optBits |= OPT_BIT_UPDATE_CREATE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#updateCreate() updateCreate} to updateCreate.
     * @param updateCreate The value for updateCreate
     * @return {@code this} builder for use in a chained invocation
     */
    @com.fasterxml.jackson.annotation.JsonProperty("updateCreate")
    public final Builder updateCreate(java.util.Optional<java.lang.Boolean> updateCreate) {
      checkNotIsSet(updateCreateIsSet(), "updateCreate");
      this.updateCreate = updateCreate.orElse(null);
      optBits |= OPT_BIT_UPDATE_CREATE;
      return this;
    }

    /**
     * Builds a new {@link CapabilityStatement_Resource CapabilityStatement_Resource}.
     * @return An immutable instance of CapabilityStatement_Resource
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public com.fhir.CapabilityStatement_Resource build() {
      return new ImmutableCapabilityStatement_Resource(
          extension,
          conditionalRead,
          searchParam,
          modifierExtension,
          conditionalCreate,
          conditionalDelete,
          searchInclude,
          id,
          profile,
          versioning,
          documentation,
          interaction,
          supportedProfile,
          referencePolicy,
          searchRevInclude,
          operation,
          conditionalUpdate,
          type,
          readHistory,
          updateCreate);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean conditionalReadIsSet() {
      return (optBits & OPT_BIT_CONDITIONAL_READ) != 0;
    }

    private boolean searchParamIsSet() {
      return (optBits & OPT_BIT_SEARCH_PARAM) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean conditionalCreateIsSet() {
      return (optBits & OPT_BIT_CONDITIONAL_CREATE) != 0;
    }

    private boolean conditionalDeleteIsSet() {
      return (optBits & OPT_BIT_CONDITIONAL_DELETE) != 0;
    }

    private boolean searchIncludeIsSet() {
      return (optBits & OPT_BIT_SEARCH_INCLUDE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean profileIsSet() {
      return (optBits & OPT_BIT_PROFILE) != 0;
    }

    private boolean versioningIsSet() {
      return (optBits & OPT_BIT_VERSIONING) != 0;
    }

    private boolean documentationIsSet() {
      return (optBits & OPT_BIT_DOCUMENTATION) != 0;
    }

    private boolean interactionIsSet() {
      return (optBits & OPT_BIT_INTERACTION) != 0;
    }

    private boolean supportedProfileIsSet() {
      return (optBits & OPT_BIT_SUPPORTED_PROFILE) != 0;
    }

    private boolean referencePolicyIsSet() {
      return (optBits & OPT_BIT_REFERENCE_POLICY) != 0;
    }

    private boolean searchRevIncludeIsSet() {
      return (optBits & OPT_BIT_SEARCH_REV_INCLUDE) != 0;
    }

    private boolean operationIsSet() {
      return (optBits & OPT_BIT_OPERATION) != 0;
    }

    private boolean conditionalUpdateIsSet() {
      return (optBits & OPT_BIT_CONDITIONAL_UPDATE) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean readHistoryIsSet() {
      return (optBits & OPT_BIT_READ_HISTORY) != 0;
    }

    private boolean updateCreateIsSet() {
      return (optBits & OPT_BIT_UPDATE_CREATE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new java.lang.IllegalStateException("Builder of CapabilityStatement_Resource is strict, attribute is already set: ".concat(name));
    }
  }
}

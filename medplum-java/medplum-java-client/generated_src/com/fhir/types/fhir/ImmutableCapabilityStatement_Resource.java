package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link CapabilityStatement_Resource}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCapabilityStatement_Resource.builder()}.
 */
@Generated(from = "CapabilityStatement_Resource", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCapabilityStatement_Resource
    implements CapabilityStatement_Resource {
  private final @Nullable Capabilitystatement_ResourceConditionalread conditionalRead;
  private final @Nullable List<CapabilityStatement_SearchParam> searchParam;
  private final @Nullable Code type;
  private final @Nullable Capabilitystatement_ResourceConditionaldelete conditionalDelete;
  private final @Nullable List<CapabilityStatement_Operation> operation;
  private final @Nullable List<String> searchInclude;
  private final @Nullable Canonical profile;
  private final @Nullable List<Capabilitystatement_ResourceReferencepolicyItem> referencePolicy;
  private final @Nullable List<Canonical> supportedProfile;
  private final @Nullable Boolean updateCreate;
  private final @Nullable Boolean conditionalCreate;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Markdown documentation;
  private final @Nullable List<String> searchRevInclude;
  private final @Nullable Boolean conditionalUpdate;
  private final @Nullable List<CapabilityStatement_Interaction> interaction;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable Capabilitystatement_ResourceVersioning versioning;
  private final @Nullable Boolean readHistory;

  private ImmutableCapabilityStatement_Resource(
      @Nullable Capabilitystatement_ResourceConditionalread conditionalRead,
      @Nullable List<CapabilityStatement_SearchParam> searchParam,
      @Nullable Code type,
      @Nullable Capabilitystatement_ResourceConditionaldelete conditionalDelete,
      @Nullable List<CapabilityStatement_Operation> operation,
      @Nullable List<String> searchInclude,
      @Nullable Canonical profile,
      @Nullable List<Capabilitystatement_ResourceReferencepolicyItem> referencePolicy,
      @Nullable List<Canonical> supportedProfile,
      @Nullable Boolean updateCreate,
      @Nullable Boolean conditionalCreate,
      @Nullable List<Extension> modifierExtension,
      @Nullable Markdown documentation,
      @Nullable List<String> searchRevInclude,
      @Nullable Boolean conditionalUpdate,
      @Nullable List<CapabilityStatement_Interaction> interaction,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable Capabilitystatement_ResourceVersioning versioning,
      @Nullable Boolean readHistory) {
    this.conditionalRead = conditionalRead;
    this.searchParam = searchParam;
    this.type = type;
    this.conditionalDelete = conditionalDelete;
    this.operation = operation;
    this.searchInclude = searchInclude;
    this.profile = profile;
    this.referencePolicy = referencePolicy;
    this.supportedProfile = supportedProfile;
    this.updateCreate = updateCreate;
    this.conditionalCreate = conditionalCreate;
    this.modifierExtension = modifierExtension;
    this.documentation = documentation;
    this.searchRevInclude = searchRevInclude;
    this.conditionalUpdate = conditionalUpdate;
    this.interaction = interaction;
    this.id = id;
    this.extension = extension;
    this.versioning = versioning;
    this.readHistory = readHistory;
  }

  /**
   * @return The value of the {@code conditionalRead} attribute
   */
  @JsonProperty("conditionalRead")
  @Override
  public Optional<Capabilitystatement_ResourceConditionalread> conditionalRead() {
    return Optional.ofNullable(conditionalRead);
  }

  /**
   * @return The value of the {@code searchParam} attribute
   */
  @JsonProperty("searchParam")
  @Override
  public Optional<List<CapabilityStatement_SearchParam>> searchParam() {
    return Optional.ofNullable(searchParam);
  }

  /**
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<Code> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code conditionalDelete} attribute
   */
  @JsonProperty("conditionalDelete")
  @Override
  public Optional<Capabilitystatement_ResourceConditionaldelete> conditionalDelete() {
    return Optional.ofNullable(conditionalDelete);
  }

  /**
   * @return The value of the {@code operation} attribute
   */
  @JsonProperty("operation")
  @Override
  public Optional<List<CapabilityStatement_Operation>> operation() {
    return Optional.ofNullable(operation);
  }

  /**
   * @return The value of the {@code searchInclude} attribute
   */
  @JsonProperty("searchInclude")
  @Override
  public Optional<List<String>> searchInclude() {
    return Optional.ofNullable(searchInclude);
  }

  /**
   * @return The value of the {@code profile} attribute
   */
  @JsonProperty("profile")
  @Override
  public Optional<Canonical> profile() {
    return Optional.ofNullable(profile);
  }

  /**
   * @return The value of the {@code referencePolicy} attribute
   */
  @JsonProperty("referencePolicy")
  @Override
  public Optional<List<Capabilitystatement_ResourceReferencepolicyItem>> referencePolicy() {
    return Optional.ofNullable(referencePolicy);
  }

  /**
   * @return The value of the {@code supportedProfile} attribute
   */
  @JsonProperty("supportedProfile")
  @Override
  public Optional<List<Canonical>> supportedProfile() {
    return Optional.ofNullable(supportedProfile);
  }

  /**
   * @return The value of the {@code updateCreate} attribute
   */
  @JsonProperty("updateCreate")
  @Override
  public Optional<Boolean> updateCreate() {
    return Optional.ofNullable(updateCreate);
  }

  /**
   * @return The value of the {@code conditionalCreate} attribute
   */
  @JsonProperty("conditionalCreate")
  @Override
  public Optional<Boolean> conditionalCreate() {
    return Optional.ofNullable(conditionalCreate);
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
   * @return The value of the {@code documentation} attribute
   */
  @JsonProperty("documentation")
  @Override
  public Optional<Markdown> documentation() {
    return Optional.ofNullable(documentation);
  }

  /**
   * @return The value of the {@code searchRevInclude} attribute
   */
  @JsonProperty("searchRevInclude")
  @Override
  public Optional<List<String>> searchRevInclude() {
    return Optional.ofNullable(searchRevInclude);
  }

  /**
   * @return The value of the {@code conditionalUpdate} attribute
   */
  @JsonProperty("conditionalUpdate")
  @Override
  public Optional<Boolean> conditionalUpdate() {
    return Optional.ofNullable(conditionalUpdate);
  }

  /**
   * @return The value of the {@code interaction} attribute
   */
  @JsonProperty("interaction")
  @Override
  public Optional<List<CapabilityStatement_Interaction>> interaction() {
    return Optional.ofNullable(interaction);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code versioning} attribute
   */
  @JsonProperty("versioning")
  @Override
  public Optional<Capabilitystatement_ResourceVersioning> versioning() {
    return Optional.ofNullable(versioning);
  }

  /**
   * @return The value of the {@code readHistory} attribute
   */
  @JsonProperty("readHistory")
  @Override
  public Optional<Boolean> readHistory() {
    return Optional.ofNullable(readHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#conditionalRead() conditionalRead} attribute.
   * @param value The value for conditionalRead
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withConditionalRead(Capabilitystatement_ResourceConditionalread value) {
    @Nullable Capabilitystatement_ResourceConditionalread newValue = Objects.requireNonNull(value, "conditionalRead");
    if (this.conditionalRead == newValue) return this;
    return new ImmutableCapabilityStatement_Resource(
        newValue,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#conditionalRead() conditionalRead} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for conditionalRead
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Resource withConditionalRead(Optional<? extends Capabilitystatement_ResourceConditionalread> optional) {
    @Nullable Capabilitystatement_ResourceConditionalread value = optional.orElse(null);
    if (this.conditionalRead == value) return this;
    return new ImmutableCapabilityStatement_Resource(
        value,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#searchParam() searchParam} attribute.
   * @param value The value for searchParam
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withSearchParam(List<CapabilityStatement_SearchParam> value) {
    @Nullable List<CapabilityStatement_SearchParam> newValue = Objects.requireNonNull(value, "searchParam");
    if (this.searchParam == newValue) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        newValue,
        this.type,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#searchParam() searchParam} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for searchParam
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Resource withSearchParam(Optional<? extends List<CapabilityStatement_SearchParam>> optional) {
    @Nullable List<CapabilityStatement_SearchParam> value = optional.orElse(null);
    if (this.searchParam == value) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        value,
        this.type,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withType(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        newValue,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Resource withType(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        value,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#conditionalDelete() conditionalDelete} attribute.
   * @param value The value for conditionalDelete
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withConditionalDelete(Capabilitystatement_ResourceConditionaldelete value) {
    @Nullable Capabilitystatement_ResourceConditionaldelete newValue = Objects.requireNonNull(value, "conditionalDelete");
    if (this.conditionalDelete == newValue) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        newValue,
        this.operation,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#conditionalDelete() conditionalDelete} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for conditionalDelete
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Resource withConditionalDelete(Optional<? extends Capabilitystatement_ResourceConditionaldelete> optional) {
    @Nullable Capabilitystatement_ResourceConditionaldelete value = optional.orElse(null);
    if (this.conditionalDelete == value) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        value,
        this.operation,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#operation() operation} attribute.
   * @param value The value for operation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withOperation(List<CapabilityStatement_Operation> value) {
    @Nullable List<CapabilityStatement_Operation> newValue = Objects.requireNonNull(value, "operation");
    if (this.operation == newValue) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        newValue,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#operation() operation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for operation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Resource withOperation(Optional<? extends List<CapabilityStatement_Operation>> optional) {
    @Nullable List<CapabilityStatement_Operation> value = optional.orElse(null);
    if (this.operation == value) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        value,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#searchInclude() searchInclude} attribute.
   * @param value The value for searchInclude
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withSearchInclude(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "searchInclude");
    if (this.searchInclude == newValue) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        this.operation,
        newValue,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#searchInclude() searchInclude} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for searchInclude
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Resource withSearchInclude(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.searchInclude == value) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        this.operation,
        value,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#profile() profile} attribute.
   * @param value The value for profile
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withProfile(Canonical value) {
    @Nullable Canonical newValue = Objects.requireNonNull(value, "profile");
    if (this.profile == newValue) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        newValue,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#profile() profile} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for profile
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Resource withProfile(Optional<? extends Canonical> optional) {
    @Nullable Canonical value = optional.orElse(null);
    if (this.profile == value) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        value,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#referencePolicy() referencePolicy} attribute.
   * @param value The value for referencePolicy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withReferencePolicy(List<Capabilitystatement_ResourceReferencepolicyItem> value) {
    @Nullable List<Capabilitystatement_ResourceReferencepolicyItem> newValue = Objects.requireNonNull(value, "referencePolicy");
    if (this.referencePolicy == newValue) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        this.profile,
        newValue,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#referencePolicy() referencePolicy} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for referencePolicy
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Resource withReferencePolicy(Optional<? extends List<Capabilitystatement_ResourceReferencepolicyItem>> optional) {
    @Nullable List<Capabilitystatement_ResourceReferencepolicyItem> value = optional.orElse(null);
    if (this.referencePolicy == value) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        this.profile,
        value,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#supportedProfile() supportedProfile} attribute.
   * @param value The value for supportedProfile
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withSupportedProfile(List<Canonical> value) {
    @Nullable List<Canonical> newValue = Objects.requireNonNull(value, "supportedProfile");
    if (this.supportedProfile == newValue) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        newValue,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#supportedProfile() supportedProfile} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for supportedProfile
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Resource withSupportedProfile(Optional<? extends List<Canonical>> optional) {
    @Nullable List<Canonical> value = optional.orElse(null);
    if (this.supportedProfile == value) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        value,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#updateCreate() updateCreate} attribute.
   * @param value The value for updateCreate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withUpdateCreate(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.updateCreate, newValue)) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        newValue,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#updateCreate() updateCreate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for updateCreate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withUpdateCreate(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.updateCreate, value)) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        value,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#conditionalCreate() conditionalCreate} attribute.
   * @param value The value for conditionalCreate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withConditionalCreate(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.conditionalCreate, newValue)) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        newValue,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#conditionalCreate() conditionalCreate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for conditionalCreate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withConditionalCreate(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.conditionalCreate, value)) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        value,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        newValue,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Resource withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        value,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#documentation() documentation} attribute.
   * @param value The value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withDocumentation(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "documentation");
    if (this.documentation == newValue) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        newValue,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#documentation() documentation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for documentation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Resource withDocumentation(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.documentation == value) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        value,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#searchRevInclude() searchRevInclude} attribute.
   * @param value The value for searchRevInclude
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withSearchRevInclude(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "searchRevInclude");
    if (this.searchRevInclude == newValue) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        newValue,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#searchRevInclude() searchRevInclude} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for searchRevInclude
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Resource withSearchRevInclude(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.searchRevInclude == value) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        value,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#conditionalUpdate() conditionalUpdate} attribute.
   * @param value The value for conditionalUpdate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withConditionalUpdate(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.conditionalUpdate, newValue)) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        newValue,
        this.interaction,
        this.id,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#conditionalUpdate() conditionalUpdate} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for conditionalUpdate
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withConditionalUpdate(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.conditionalUpdate, value)) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        value,
        this.interaction,
        this.id,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#interaction() interaction} attribute.
   * @param value The value for interaction
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withInteraction(List<CapabilityStatement_Interaction> value) {
    @Nullable List<CapabilityStatement_Interaction> newValue = Objects.requireNonNull(value, "interaction");
    if (this.interaction == newValue) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        newValue,
        this.id,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#interaction() interaction} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for interaction
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Resource withInteraction(Optional<? extends List<CapabilityStatement_Interaction>> optional) {
    @Nullable List<CapabilityStatement_Interaction> value = optional.orElse(null);
    if (this.interaction == value) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        value,
        this.id,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        newValue,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        value,
        this.extension,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        newValue,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Resource withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        value,
        this.versioning,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#versioning() versioning} attribute.
   * @param value The value for versioning
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withVersioning(Capabilitystatement_ResourceVersioning value) {
    @Nullable Capabilitystatement_ResourceVersioning newValue = Objects.requireNonNull(value, "versioning");
    if (this.versioning == newValue) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        this.extension,
        newValue,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#versioning() versioning} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for versioning
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_Resource withVersioning(Optional<? extends Capabilitystatement_ResourceVersioning> optional) {
    @Nullable Capabilitystatement_ResourceVersioning value = optional.orElse(null);
    if (this.versioning == value) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        this.extension,
        value,
        this.readHistory);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_Resource#readHistory() readHistory} attribute.
   * @param value The value for readHistory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withReadHistory(boolean value) {
    @Nullable Boolean newValue = value;
    if (Objects.equals(this.readHistory, newValue)) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        this.extension,
        this.versioning,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_Resource#readHistory() readHistory} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for readHistory
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_Resource withReadHistory(Optional<Boolean> optional) {
    @Nullable Boolean value = optional.orElse(null);
    if (Objects.equals(this.readHistory, value)) return this;
    return new ImmutableCapabilityStatement_Resource(
        this.conditionalRead,
        this.searchParam,
        this.type,
        this.conditionalDelete,
        this.operation,
        this.searchInclude,
        this.profile,
        this.referencePolicy,
        this.supportedProfile,
        this.updateCreate,
        this.conditionalCreate,
        this.modifierExtension,
        this.documentation,
        this.searchRevInclude,
        this.conditionalUpdate,
        this.interaction,
        this.id,
        this.extension,
        this.versioning,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCapabilityStatement_Resource} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCapabilityStatement_Resource
        && equalTo((ImmutableCapabilityStatement_Resource) another);
  }

  private boolean equalTo(ImmutableCapabilityStatement_Resource another) {
    return Objects.equals(conditionalRead, another.conditionalRead)
        && Objects.equals(searchParam, another.searchParam)
        && Objects.equals(type, another.type)
        && Objects.equals(conditionalDelete, another.conditionalDelete)
        && Objects.equals(operation, another.operation)
        && Objects.equals(searchInclude, another.searchInclude)
        && Objects.equals(profile, another.profile)
        && Objects.equals(referencePolicy, another.referencePolicy)
        && Objects.equals(supportedProfile, another.supportedProfile)
        && Objects.equals(updateCreate, another.updateCreate)
        && Objects.equals(conditionalCreate, another.conditionalCreate)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(documentation, another.documentation)
        && Objects.equals(searchRevInclude, another.searchRevInclude)
        && Objects.equals(conditionalUpdate, another.conditionalUpdate)
        && Objects.equals(interaction, another.interaction)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(versioning, another.versioning)
        && Objects.equals(readHistory, another.readHistory);
  }

  /**
   * Computes a hash code from attributes: {@code conditionalRead}, {@code searchParam}, {@code type}, {@code conditionalDelete}, {@code operation}, {@code searchInclude}, {@code profile}, {@code referencePolicy}, {@code supportedProfile}, {@code updateCreate}, {@code conditionalCreate}, {@code modifierExtension}, {@code documentation}, {@code searchRevInclude}, {@code conditionalUpdate}, {@code interaction}, {@code id}, {@code extension}, {@code versioning}, {@code readHistory}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(conditionalRead);
    h += (h << 5) + Objects.hashCode(searchParam);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(conditionalDelete);
    h += (h << 5) + Objects.hashCode(operation);
    h += (h << 5) + Objects.hashCode(searchInclude);
    h += (h << 5) + Objects.hashCode(profile);
    h += (h << 5) + Objects.hashCode(referencePolicy);
    h += (h << 5) + Objects.hashCode(supportedProfile);
    h += (h << 5) + Objects.hashCode(updateCreate);
    h += (h << 5) + Objects.hashCode(conditionalCreate);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(documentation);
    h += (h << 5) + Objects.hashCode(searchRevInclude);
    h += (h << 5) + Objects.hashCode(conditionalUpdate);
    h += (h << 5) + Objects.hashCode(interaction);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(versioning);
    h += (h << 5) + Objects.hashCode(readHistory);
    return h;
  }

  /**
   * Prints the immutable value {@code CapabilityStatement_Resource} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CapabilityStatement_Resource{");
    if (conditionalRead != null) {
      builder.append("conditionalRead=").append(conditionalRead);
    }
    if (searchParam != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("searchParam=").append(searchParam);
    }
    if (type != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (conditionalDelete != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("conditionalDelete=").append(conditionalDelete);
    }
    if (operation != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("operation=").append(operation);
    }
    if (searchInclude != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("searchInclude=").append(searchInclude);
    }
    if (profile != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("profile=").append(profile);
    }
    if (referencePolicy != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("referencePolicy=").append(referencePolicy);
    }
    if (supportedProfile != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("supportedProfile=").append(supportedProfile);
    }
    if (updateCreate != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("updateCreate=").append(updateCreate);
    }
    if (conditionalCreate != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("conditionalCreate=").append(conditionalCreate);
    }
    if (modifierExtension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (documentation != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("documentation=").append(documentation);
    }
    if (searchRevInclude != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("searchRevInclude=").append(searchRevInclude);
    }
    if (conditionalUpdate != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("conditionalUpdate=").append(conditionalUpdate);
    }
    if (interaction != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("interaction=").append(interaction);
    }
    if (id != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (versioning != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("versioning=").append(versioning);
    }
    if (readHistory != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("readHistory=").append(readHistory);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CapabilityStatement_Resource", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CapabilityStatement_Resource {
    @Nullable Optional<Capabilitystatement_ResourceConditionalread> conditionalRead = Optional.empty();
    boolean conditionalReadIsSet;
    @Nullable Optional<List<CapabilityStatement_SearchParam>> searchParam = Optional.empty();
    boolean searchParamIsSet;
    @Nullable Optional<Code> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<Capabilitystatement_ResourceConditionaldelete> conditionalDelete = Optional.empty();
    boolean conditionalDeleteIsSet;
    @Nullable Optional<List<CapabilityStatement_Operation>> operation = Optional.empty();
    boolean operationIsSet;
    @Nullable Optional<List<String>> searchInclude = Optional.empty();
    boolean searchIncludeIsSet;
    @Nullable Optional<Canonical> profile = Optional.empty();
    boolean profileIsSet;
    @Nullable Optional<List<Capabilitystatement_ResourceReferencepolicyItem>> referencePolicy = Optional.empty();
    boolean referencePolicyIsSet;
    @Nullable Optional<List<Canonical>> supportedProfile = Optional.empty();
    boolean supportedProfileIsSet;
    @Nullable Optional<Boolean> updateCreate = Optional.empty();
    boolean updateCreateIsSet;
    @Nullable Optional<Boolean> conditionalCreate = Optional.empty();
    boolean conditionalCreateIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Markdown> documentation = Optional.empty();
    boolean documentationIsSet;
    @Nullable Optional<List<String>> searchRevInclude = Optional.empty();
    boolean searchRevIncludeIsSet;
    @Nullable Optional<Boolean> conditionalUpdate = Optional.empty();
    boolean conditionalUpdateIsSet;
    @Nullable Optional<List<CapabilityStatement_Interaction>> interaction = Optional.empty();
    boolean interactionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Capabilitystatement_ResourceVersioning> versioning = Optional.empty();
    boolean versioningIsSet;
    @Nullable Optional<Boolean> readHistory = Optional.empty();
    boolean readHistoryIsSet;
    @JsonProperty("conditionalRead")
    public void setConditionalRead(Optional<Capabilitystatement_ResourceConditionalread> conditionalRead) {
      this.conditionalRead = conditionalRead;
      this.conditionalReadIsSet = true;
    }
    @JsonProperty("searchParam")
    public void setSearchParam(Optional<List<CapabilityStatement_SearchParam>> searchParam) {
      this.searchParam = searchParam;
      this.searchParamIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<Code> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("conditionalDelete")
    public void setConditionalDelete(Optional<Capabilitystatement_ResourceConditionaldelete> conditionalDelete) {
      this.conditionalDelete = conditionalDelete;
      this.conditionalDeleteIsSet = true;
    }
    @JsonProperty("operation")
    public void setOperation(Optional<List<CapabilityStatement_Operation>> operation) {
      this.operation = operation;
      this.operationIsSet = true;
    }
    @JsonProperty("searchInclude")
    public void setSearchInclude(Optional<List<String>> searchInclude) {
      this.searchInclude = searchInclude;
      this.searchIncludeIsSet = true;
    }
    @JsonProperty("profile")
    public void setProfile(Optional<Canonical> profile) {
      this.profile = profile;
      this.profileIsSet = true;
    }
    @JsonProperty("referencePolicy")
    public void setReferencePolicy(Optional<List<Capabilitystatement_ResourceReferencepolicyItem>> referencePolicy) {
      this.referencePolicy = referencePolicy;
      this.referencePolicyIsSet = true;
    }
    @JsonProperty("supportedProfile")
    public void setSupportedProfile(Optional<List<Canonical>> supportedProfile) {
      this.supportedProfile = supportedProfile;
      this.supportedProfileIsSet = true;
    }
    @JsonProperty("updateCreate")
    public void setUpdateCreate(Optional<Boolean> updateCreate) {
      this.updateCreate = updateCreate;
      this.updateCreateIsSet = true;
    }
    @JsonProperty("conditionalCreate")
    public void setConditionalCreate(Optional<Boolean> conditionalCreate) {
      this.conditionalCreate = conditionalCreate;
      this.conditionalCreateIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("documentation")
    public void setDocumentation(Optional<Markdown> documentation) {
      this.documentation = documentation;
      this.documentationIsSet = true;
    }
    @JsonProperty("searchRevInclude")
    public void setSearchRevInclude(Optional<List<String>> searchRevInclude) {
      this.searchRevInclude = searchRevInclude;
      this.searchRevIncludeIsSet = true;
    }
    @JsonProperty("conditionalUpdate")
    public void setConditionalUpdate(Optional<Boolean> conditionalUpdate) {
      this.conditionalUpdate = conditionalUpdate;
      this.conditionalUpdateIsSet = true;
    }
    @JsonProperty("interaction")
    public void setInteraction(Optional<List<CapabilityStatement_Interaction>> interaction) {
      this.interaction = interaction;
      this.interactionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("versioning")
    public void setVersioning(Optional<Capabilitystatement_ResourceVersioning> versioning) {
      this.versioning = versioning;
      this.versioningIsSet = true;
    }
    @JsonProperty("readHistory")
    public void setReadHistory(Optional<Boolean> readHistory) {
      this.readHistory = readHistory;
      this.readHistoryIsSet = true;
    }
    @Override
    public Optional<Capabilitystatement_ResourceConditionalread> conditionalRead() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CapabilityStatement_SearchParam>> searchParam() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Capabilitystatement_ResourceConditionaldelete> conditionalDelete() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CapabilityStatement_Operation>> operation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> searchInclude() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Canonical> profile() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Capabilitystatement_ResourceReferencepolicyItem>> referencePolicy() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Canonical>> supportedProfile() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> updateCreate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> conditionalCreate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> documentation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> searchRevInclude() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> conditionalUpdate() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<CapabilityStatement_Interaction>> interaction() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Capabilitystatement_ResourceVersioning> versioning() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Boolean> readHistory() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCapabilityStatement_Resource fromJson(Json json) {
    ImmutableCapabilityStatement_Resource.Builder builder = ImmutableCapabilityStatement_Resource.builder();
    if (json.conditionalReadIsSet) {
      builder.conditionalRead(json.conditionalRead);
    }
    if (json.searchParamIsSet) {
      builder.searchParam(json.searchParam);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.conditionalDeleteIsSet) {
      builder.conditionalDelete(json.conditionalDelete);
    }
    if (json.operationIsSet) {
      builder.operation(json.operation);
    }
    if (json.searchIncludeIsSet) {
      builder.searchInclude(json.searchInclude);
    }
    if (json.profileIsSet) {
      builder.profile(json.profile);
    }
    if (json.referencePolicyIsSet) {
      builder.referencePolicy(json.referencePolicy);
    }
    if (json.supportedProfileIsSet) {
      builder.supportedProfile(json.supportedProfile);
    }
    if (json.updateCreateIsSet) {
      builder.updateCreate(json.updateCreate);
    }
    if (json.conditionalCreateIsSet) {
      builder.conditionalCreate(json.conditionalCreate);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.documentationIsSet) {
      builder.documentation(json.documentation);
    }
    if (json.searchRevIncludeIsSet) {
      builder.searchRevInclude(json.searchRevInclude);
    }
    if (json.conditionalUpdateIsSet) {
      builder.conditionalUpdate(json.conditionalUpdate);
    }
    if (json.interactionIsSet) {
      builder.interaction(json.interaction);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.versioningIsSet) {
      builder.versioning(json.versioning);
    }
    if (json.readHistoryIsSet) {
      builder.readHistory(json.readHistory);
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
        .conditionalRead(instance.conditionalRead())
        .searchParam(instance.searchParam())
        .type(instance.type())
        .conditionalDelete(instance.conditionalDelete())
        .operation(instance.operation())
        .searchInclude(instance.searchInclude())
        .profile(instance.profile())
        .referencePolicy(instance.referencePolicy())
        .supportedProfile(instance.supportedProfile())
        .updateCreate(instance.updateCreate())
        .conditionalCreate(instance.conditionalCreate())
        .modifierExtension(instance.modifierExtension())
        .documentation(instance.documentation())
        .searchRevInclude(instance.searchRevInclude())
        .conditionalUpdate(instance.conditionalUpdate())
        .interaction(instance.interaction())
        .id(instance.id())
        .extension(instance.extension())
        .versioning(instance.versioning())
        .readHistory(instance.readHistory())
        .build();
  }

  /**
   * Creates a builder for {@link CapabilityStatement_Resource CapabilityStatement_Resource}.
   * <pre>
   * ImmutableCapabilityStatement_Resource.builder()
   *    .conditionalRead(Capabilitystatement_ResourceConditionalread) // optional {@link CapabilityStatement_Resource#conditionalRead() conditionalRead}
   *    .searchParam(List&amp;lt;com.fhir.types.fhir.CapabilityStatement_SearchParam&amp;gt;) // optional {@link CapabilityStatement_Resource#searchParam() searchParam}
   *    .type(com.fhir.types.fhir.Code) // optional {@link CapabilityStatement_Resource#type() type}
   *    .conditionalDelete(Capabilitystatement_ResourceConditionaldelete) // optional {@link CapabilityStatement_Resource#conditionalDelete() conditionalDelete}
   *    .operation(List&amp;lt;com.fhir.types.fhir.CapabilityStatement_Operation&amp;gt;) // optional {@link CapabilityStatement_Resource#operation() operation}
   *    .searchInclude(List&amp;lt;String&amp;gt;) // optional {@link CapabilityStatement_Resource#searchInclude() searchInclude}
   *    .profile(com.fhir.types.fhir.Canonical) // optional {@link CapabilityStatement_Resource#profile() profile}
   *    .referencePolicy(List&amp;lt;Capabilitystatement_ResourceReferencepolicyItem&amp;gt;) // optional {@link CapabilityStatement_Resource#referencePolicy() referencePolicy}
   *    .supportedProfile(List&amp;lt;com.fhir.types.fhir.Canonical&amp;gt;) // optional {@link CapabilityStatement_Resource#supportedProfile() supportedProfile}
   *    .updateCreate(Boolean) // optional {@link CapabilityStatement_Resource#updateCreate() updateCreate}
   *    .conditionalCreate(Boolean) // optional {@link CapabilityStatement_Resource#conditionalCreate() conditionalCreate}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CapabilityStatement_Resource#modifierExtension() modifierExtension}
   *    .documentation(com.fhir.types.fhir.Markdown) // optional {@link CapabilityStatement_Resource#documentation() documentation}
   *    .searchRevInclude(List&amp;lt;String&amp;gt;) // optional {@link CapabilityStatement_Resource#searchRevInclude() searchRevInclude}
   *    .conditionalUpdate(Boolean) // optional {@link CapabilityStatement_Resource#conditionalUpdate() conditionalUpdate}
   *    .interaction(List&amp;lt;com.fhir.types.fhir.CapabilityStatement_Interaction&amp;gt;) // optional {@link CapabilityStatement_Resource#interaction() interaction}
   *    .id(String) // optional {@link CapabilityStatement_Resource#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CapabilityStatement_Resource#extension() extension}
   *    .versioning(Capabilitystatement_ResourceVersioning) // optional {@link CapabilityStatement_Resource#versioning() versioning}
   *    .readHistory(Boolean) // optional {@link CapabilityStatement_Resource#readHistory() readHistory}
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
  @Generated(from = "CapabilityStatement_Resource", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_CONDITIONAL_READ = 0x1L;
    private static final long OPT_BIT_SEARCH_PARAM = 0x2L;
    private static final long OPT_BIT_TYPE = 0x4L;
    private static final long OPT_BIT_CONDITIONAL_DELETE = 0x8L;
    private static final long OPT_BIT_OPERATION = 0x10L;
    private static final long OPT_BIT_SEARCH_INCLUDE = 0x20L;
    private static final long OPT_BIT_PROFILE = 0x40L;
    private static final long OPT_BIT_REFERENCE_POLICY = 0x80L;
    private static final long OPT_BIT_SUPPORTED_PROFILE = 0x100L;
    private static final long OPT_BIT_UPDATE_CREATE = 0x200L;
    private static final long OPT_BIT_CONDITIONAL_CREATE = 0x400L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x800L;
    private static final long OPT_BIT_DOCUMENTATION = 0x1000L;
    private static final long OPT_BIT_SEARCH_REV_INCLUDE = 0x2000L;
    private static final long OPT_BIT_CONDITIONAL_UPDATE = 0x4000L;
    private static final long OPT_BIT_INTERACTION = 0x8000L;
    private static final long OPT_BIT_ID = 0x10000L;
    private static final long OPT_BIT_EXTENSION = 0x20000L;
    private static final long OPT_BIT_VERSIONING = 0x40000L;
    private static final long OPT_BIT_READ_HISTORY = 0x80000L;
    private long optBits;

    private @Nullable Capabilitystatement_ResourceConditionalread conditionalRead;
    private @Nullable List<CapabilityStatement_SearchParam> searchParam;
    private @Nullable Code type;
    private @Nullable Capabilitystatement_ResourceConditionaldelete conditionalDelete;
    private @Nullable List<CapabilityStatement_Operation> operation;
    private @Nullable List<String> searchInclude;
    private @Nullable Canonical profile;
    private @Nullable List<Capabilitystatement_ResourceReferencepolicyItem> referencePolicy;
    private @Nullable List<Canonical> supportedProfile;
    private @Nullable Boolean updateCreate;
    private @Nullable Boolean conditionalCreate;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Markdown documentation;
    private @Nullable List<String> searchRevInclude;
    private @Nullable Boolean conditionalUpdate;
    private @Nullable List<CapabilityStatement_Interaction> interaction;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable Capabilitystatement_ResourceVersioning versioning;
    private @Nullable Boolean readHistory;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#conditionalRead() conditionalRead} to conditionalRead.
     * @param conditionalRead The value for conditionalRead
     * @return {@code this} builder for chained invocation
     */
    public final Builder conditionalRead(Capabilitystatement_ResourceConditionalread conditionalRead) {
      checkNotIsSet(conditionalReadIsSet(), "conditionalRead");
      this.conditionalRead = Objects.requireNonNull(conditionalRead, "conditionalRead");
      optBits |= OPT_BIT_CONDITIONAL_READ;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#conditionalRead() conditionalRead} to conditionalRead.
     * @param conditionalRead The value for conditionalRead
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("conditionalRead")
    public final Builder conditionalRead(Optional<? extends Capabilitystatement_ResourceConditionalread> conditionalRead) {
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
    public final Builder searchParam(List<CapabilityStatement_SearchParam> searchParam) {
      checkNotIsSet(searchParamIsSet(), "searchParam");
      this.searchParam = Objects.requireNonNull(searchParam, "searchParam");
      optBits |= OPT_BIT_SEARCH_PARAM;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#searchParam() searchParam} to searchParam.
     * @param searchParam The value for searchParam
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("searchParam")
    public final Builder searchParam(Optional<? extends List<CapabilityStatement_SearchParam>> searchParam) {
      checkNotIsSet(searchParamIsSet(), "searchParam");
      this.searchParam = searchParam.orElse(null);
      optBits |= OPT_BIT_SEARCH_PARAM;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(Code type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends Code> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#conditionalDelete() conditionalDelete} to conditionalDelete.
     * @param conditionalDelete The value for conditionalDelete
     * @return {@code this} builder for chained invocation
     */
    public final Builder conditionalDelete(Capabilitystatement_ResourceConditionaldelete conditionalDelete) {
      checkNotIsSet(conditionalDeleteIsSet(), "conditionalDelete");
      this.conditionalDelete = Objects.requireNonNull(conditionalDelete, "conditionalDelete");
      optBits |= OPT_BIT_CONDITIONAL_DELETE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#conditionalDelete() conditionalDelete} to conditionalDelete.
     * @param conditionalDelete The value for conditionalDelete
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("conditionalDelete")
    public final Builder conditionalDelete(Optional<? extends Capabilitystatement_ResourceConditionaldelete> conditionalDelete) {
      checkNotIsSet(conditionalDeleteIsSet(), "conditionalDelete");
      this.conditionalDelete = conditionalDelete.orElse(null);
      optBits |= OPT_BIT_CONDITIONAL_DELETE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#operation() operation} to operation.
     * @param operation The value for operation
     * @return {@code this} builder for chained invocation
     */
    public final Builder operation(List<CapabilityStatement_Operation> operation) {
      checkNotIsSet(operationIsSet(), "operation");
      this.operation = Objects.requireNonNull(operation, "operation");
      optBits |= OPT_BIT_OPERATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#operation() operation} to operation.
     * @param operation The value for operation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("operation")
    public final Builder operation(Optional<? extends List<CapabilityStatement_Operation>> operation) {
      checkNotIsSet(operationIsSet(), "operation");
      this.operation = operation.orElse(null);
      optBits |= OPT_BIT_OPERATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#searchInclude() searchInclude} to searchInclude.
     * @param searchInclude The value for searchInclude
     * @return {@code this} builder for chained invocation
     */
    public final Builder searchInclude(List<String> searchInclude) {
      checkNotIsSet(searchIncludeIsSet(), "searchInclude");
      this.searchInclude = Objects.requireNonNull(searchInclude, "searchInclude");
      optBits |= OPT_BIT_SEARCH_INCLUDE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#searchInclude() searchInclude} to searchInclude.
     * @param searchInclude The value for searchInclude
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("searchInclude")
    public final Builder searchInclude(Optional<? extends List<String>> searchInclude) {
      checkNotIsSet(searchIncludeIsSet(), "searchInclude");
      this.searchInclude = searchInclude.orElse(null);
      optBits |= OPT_BIT_SEARCH_INCLUDE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for chained invocation
     */
    public final Builder profile(Canonical profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = Objects.requireNonNull(profile, "profile");
      optBits |= OPT_BIT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#profile() profile} to profile.
     * @param profile The value for profile
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("profile")
    public final Builder profile(Optional<? extends Canonical> profile) {
      checkNotIsSet(profileIsSet(), "profile");
      this.profile = profile.orElse(null);
      optBits |= OPT_BIT_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#referencePolicy() referencePolicy} to referencePolicy.
     * @param referencePolicy The value for referencePolicy
     * @return {@code this} builder for chained invocation
     */
    public final Builder referencePolicy(List<Capabilitystatement_ResourceReferencepolicyItem> referencePolicy) {
      checkNotIsSet(referencePolicyIsSet(), "referencePolicy");
      this.referencePolicy = Objects.requireNonNull(referencePolicy, "referencePolicy");
      optBits |= OPT_BIT_REFERENCE_POLICY;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#referencePolicy() referencePolicy} to referencePolicy.
     * @param referencePolicy The value for referencePolicy
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("referencePolicy")
    public final Builder referencePolicy(Optional<? extends List<Capabilitystatement_ResourceReferencepolicyItem>> referencePolicy) {
      checkNotIsSet(referencePolicyIsSet(), "referencePolicy");
      this.referencePolicy = referencePolicy.orElse(null);
      optBits |= OPT_BIT_REFERENCE_POLICY;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#supportedProfile() supportedProfile} to supportedProfile.
     * @param supportedProfile The value for supportedProfile
     * @return {@code this} builder for chained invocation
     */
    public final Builder supportedProfile(List<Canonical> supportedProfile) {
      checkNotIsSet(supportedProfileIsSet(), "supportedProfile");
      this.supportedProfile = Objects.requireNonNull(supportedProfile, "supportedProfile");
      optBits |= OPT_BIT_SUPPORTED_PROFILE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#supportedProfile() supportedProfile} to supportedProfile.
     * @param supportedProfile The value for supportedProfile
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("supportedProfile")
    public final Builder supportedProfile(Optional<? extends List<Canonical>> supportedProfile) {
      checkNotIsSet(supportedProfileIsSet(), "supportedProfile");
      this.supportedProfile = supportedProfile.orElse(null);
      optBits |= OPT_BIT_SUPPORTED_PROFILE;
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
    @JsonProperty("updateCreate")
    public final Builder updateCreate(Optional<Boolean> updateCreate) {
      checkNotIsSet(updateCreateIsSet(), "updateCreate");
      this.updateCreate = updateCreate.orElse(null);
      optBits |= OPT_BIT_UPDATE_CREATE;
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
    @JsonProperty("conditionalCreate")
    public final Builder conditionalCreate(Optional<Boolean> conditionalCreate) {
      checkNotIsSet(conditionalCreateIsSet(), "conditionalCreate");
      this.conditionalCreate = conditionalCreate.orElse(null);
      optBits |= OPT_BIT_CONDITIONAL_CREATE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CapabilityStatement_Resource#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CapabilityStatement_Resource#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for chained invocation
     */
    public final Builder documentation(Markdown documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = Objects.requireNonNull(documentation, "documentation");
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("documentation")
    public final Builder documentation(Optional<? extends Markdown> documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = documentation.orElse(null);
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#searchRevInclude() searchRevInclude} to searchRevInclude.
     * @param searchRevInclude The value for searchRevInclude
     * @return {@code this} builder for chained invocation
     */
    public final Builder searchRevInclude(List<String> searchRevInclude) {
      checkNotIsSet(searchRevIncludeIsSet(), "searchRevInclude");
      this.searchRevInclude = Objects.requireNonNull(searchRevInclude, "searchRevInclude");
      optBits |= OPT_BIT_SEARCH_REV_INCLUDE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#searchRevInclude() searchRevInclude} to searchRevInclude.
     * @param searchRevInclude The value for searchRevInclude
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("searchRevInclude")
    public final Builder searchRevInclude(Optional<? extends List<String>> searchRevInclude) {
      checkNotIsSet(searchRevIncludeIsSet(), "searchRevInclude");
      this.searchRevInclude = searchRevInclude.orElse(null);
      optBits |= OPT_BIT_SEARCH_REV_INCLUDE;
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
    @JsonProperty("conditionalUpdate")
    public final Builder conditionalUpdate(Optional<Boolean> conditionalUpdate) {
      checkNotIsSet(conditionalUpdateIsSet(), "conditionalUpdate");
      this.conditionalUpdate = conditionalUpdate.orElse(null);
      optBits |= OPT_BIT_CONDITIONAL_UPDATE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#interaction() interaction} to interaction.
     * @param interaction The value for interaction
     * @return {@code this} builder for chained invocation
     */
    public final Builder interaction(List<CapabilityStatement_Interaction> interaction) {
      checkNotIsSet(interactionIsSet(), "interaction");
      this.interaction = Objects.requireNonNull(interaction, "interaction");
      optBits |= OPT_BIT_INTERACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#interaction() interaction} to interaction.
     * @param interaction The value for interaction
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("interaction")
    public final Builder interaction(Optional<? extends List<CapabilityStatement_Interaction>> interaction) {
      checkNotIsSet(interactionIsSet(), "interaction");
      this.interaction = interaction.orElse(null);
      optBits |= OPT_BIT_INTERACTION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#id() id} to id.
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
     * Initializes the optional value {@link CapabilityStatement_Resource#id() id} to id.
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
     * Initializes the optional value {@link CapabilityStatement_Resource#extension() extension} to extension.
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
     * Initializes the optional value {@link CapabilityStatement_Resource#extension() extension} to extension.
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
     * Initializes the optional value {@link CapabilityStatement_Resource#versioning() versioning} to versioning.
     * @param versioning The value for versioning
     * @return {@code this} builder for chained invocation
     */
    public final Builder versioning(Capabilitystatement_ResourceVersioning versioning) {
      checkNotIsSet(versioningIsSet(), "versioning");
      this.versioning = Objects.requireNonNull(versioning, "versioning");
      optBits |= OPT_BIT_VERSIONING;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_Resource#versioning() versioning} to versioning.
     * @param versioning The value for versioning
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("versioning")
    public final Builder versioning(Optional<? extends Capabilitystatement_ResourceVersioning> versioning) {
      checkNotIsSet(versioningIsSet(), "versioning");
      this.versioning = versioning.orElse(null);
      optBits |= OPT_BIT_VERSIONING;
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
    @JsonProperty("readHistory")
    public final Builder readHistory(Optional<Boolean> readHistory) {
      checkNotIsSet(readHistoryIsSet(), "readHistory");
      this.readHistory = readHistory.orElse(null);
      optBits |= OPT_BIT_READ_HISTORY;
      return this;
    }

    /**
     * Builds a new {@link CapabilityStatement_Resource CapabilityStatement_Resource}.
     * @return An immutable instance of CapabilityStatement_Resource
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CapabilityStatement_Resource build() {
      return new ImmutableCapabilityStatement_Resource(
          conditionalRead,
          searchParam,
          type,
          conditionalDelete,
          operation,
          searchInclude,
          profile,
          referencePolicy,
          supportedProfile,
          updateCreate,
          conditionalCreate,
          modifierExtension,
          documentation,
          searchRevInclude,
          conditionalUpdate,
          interaction,
          id,
          extension,
          versioning,
          readHistory);
    }

    private boolean conditionalReadIsSet() {
      return (optBits & OPT_BIT_CONDITIONAL_READ) != 0;
    }

    private boolean searchParamIsSet() {
      return (optBits & OPT_BIT_SEARCH_PARAM) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean conditionalDeleteIsSet() {
      return (optBits & OPT_BIT_CONDITIONAL_DELETE) != 0;
    }

    private boolean operationIsSet() {
      return (optBits & OPT_BIT_OPERATION) != 0;
    }

    private boolean searchIncludeIsSet() {
      return (optBits & OPT_BIT_SEARCH_INCLUDE) != 0;
    }

    private boolean profileIsSet() {
      return (optBits & OPT_BIT_PROFILE) != 0;
    }

    private boolean referencePolicyIsSet() {
      return (optBits & OPT_BIT_REFERENCE_POLICY) != 0;
    }

    private boolean supportedProfileIsSet() {
      return (optBits & OPT_BIT_SUPPORTED_PROFILE) != 0;
    }

    private boolean updateCreateIsSet() {
      return (optBits & OPT_BIT_UPDATE_CREATE) != 0;
    }

    private boolean conditionalCreateIsSet() {
      return (optBits & OPT_BIT_CONDITIONAL_CREATE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean documentationIsSet() {
      return (optBits & OPT_BIT_DOCUMENTATION) != 0;
    }

    private boolean searchRevIncludeIsSet() {
      return (optBits & OPT_BIT_SEARCH_REV_INCLUDE) != 0;
    }

    private boolean conditionalUpdateIsSet() {
      return (optBits & OPT_BIT_CONDITIONAL_UPDATE) != 0;
    }

    private boolean interactionIsSet() {
      return (optBits & OPT_BIT_INTERACTION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean versioningIsSet() {
      return (optBits & OPT_BIT_VERSIONING) != 0;
    }

    private boolean readHistoryIsSet() {
      return (optBits & OPT_BIT_READ_HISTORY) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CapabilityStatement_Resource is strict, attribute is already set: ".concat(name));
    }
  }
}

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
 * Immutable implementation of {@link Project}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableProject.builder()}.
 */
@Generated(from = "Project", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableProject implements Project {
  private final @Nullable Code language;
  private final @Nullable String resourceType;
  private final @Nullable Reference defaultPatientAccessPolicy;
  private final @Nullable Meta meta;
  private final String name;
  private final @Nullable Uri implicitRules;
  private final @Nullable String description;
  private final @Nullable List<Code> features;
  private final @Nullable Id id;
  private final Reference owner;

  private ImmutableProject(
      @Nullable Code language,
      @Nullable String resourceType,
      @Nullable Reference defaultPatientAccessPolicy,
      @Nullable Meta meta,
      String name,
      @Nullable Uri implicitRules,
      @Nullable String description,
      @Nullable List<Code> features,
      @Nullable Id id,
      Reference owner) {
    this.language = language;
    this.resourceType = resourceType;
    this.defaultPatientAccessPolicy = defaultPatientAccessPolicy;
    this.meta = meta;
    this.name = name;
    this.implicitRules = implicitRules;
    this.description = description;
    this.features = features;
    this.id = id;
    this.owner = owner;
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public Optional<String> resourceType() {
    return Optional.ofNullable(resourceType);
  }

  /**
   * @return The value of the {@code defaultPatientAccessPolicy} attribute
   */
  @JsonProperty("defaultPatientAccessPolicy")
  @Override
  public Optional<Reference> defaultPatientAccessPolicy() {
    return Optional.ofNullable(defaultPatientAccessPolicy);
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
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public String name() {
    return name;
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<String> description() {
    return Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code features} attribute
   */
  @JsonProperty("features")
  @Override
  public Optional<List<Code>> features() {
    return Optional.ofNullable(features);
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
   * @return The value of the {@code owner} attribute
   */
  @JsonProperty("owner")
  @Override
  public Reference owner() {
    return owner;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Project#language() language} attribute.
   * @param value The value for language
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProject withLanguage(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "language");
    if (this.language == newValue) return this;
    return new ImmutableProject(
        newValue,
        this.resourceType,
        this.defaultPatientAccessPolicy,
        this.meta,
        this.name,
        this.implicitRules,
        this.description,
        this.features,
        this.id,
        this.owner);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Project#language() language} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for language
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProject withLanguage(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.language == value) return this;
    return new ImmutableProject(
        value,
        this.resourceType,
        this.defaultPatientAccessPolicy,
        this.meta,
        this.name,
        this.implicitRules,
        this.description,
        this.features,
        this.id,
        this.owner);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Project#resourceType() resourceType} attribute.
   * @param value The value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProject withResourceType(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "resourceType");
    if (Objects.equals(this.resourceType, newValue)) return this;
    return new ImmutableProject(
        this.language,
        newValue,
        this.defaultPatientAccessPolicy,
        this.meta,
        this.name,
        this.implicitRules,
        this.description,
        this.features,
        this.id,
        this.owner);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Project#resourceType() resourceType} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProject withResourceType(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.resourceType, value)) return this;
    return new ImmutableProject(
        this.language,
        value,
        this.defaultPatientAccessPolicy,
        this.meta,
        this.name,
        this.implicitRules,
        this.description,
        this.features,
        this.id,
        this.owner);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Project#defaultPatientAccessPolicy() defaultPatientAccessPolicy} attribute.
   * @param value The value for defaultPatientAccessPolicy
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProject withDefaultPatientAccessPolicy(Reference value) {
    @Nullable Reference newValue = Objects.requireNonNull(value, "defaultPatientAccessPolicy");
    if (this.defaultPatientAccessPolicy == newValue) return this;
    return new ImmutableProject(
        this.language,
        this.resourceType,
        newValue,
        this.meta,
        this.name,
        this.implicitRules,
        this.description,
        this.features,
        this.id,
        this.owner);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Project#defaultPatientAccessPolicy() defaultPatientAccessPolicy} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for defaultPatientAccessPolicy
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProject withDefaultPatientAccessPolicy(Optional<? extends Reference> optional) {
    @Nullable Reference value = optional.orElse(null);
    if (this.defaultPatientAccessPolicy == value) return this;
    return new ImmutableProject(
        this.language,
        this.resourceType,
        value,
        this.meta,
        this.name,
        this.implicitRules,
        this.description,
        this.features,
        this.id,
        this.owner);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Project#meta() meta} attribute.
   * @param value The value for meta
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProject withMeta(Meta value) {
    @Nullable Meta newValue = Objects.requireNonNull(value, "meta");
    if (this.meta == newValue) return this;
    return new ImmutableProject(
        this.language,
        this.resourceType,
        this.defaultPatientAccessPolicy,
        newValue,
        this.name,
        this.implicitRules,
        this.description,
        this.features,
        this.id,
        this.owner);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Project#meta() meta} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for meta
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProject withMeta(Optional<? extends Meta> optional) {
    @Nullable Meta value = optional.orElse(null);
    if (this.meta == value) return this;
    return new ImmutableProject(
        this.language,
        this.resourceType,
        this.defaultPatientAccessPolicy,
        value,
        this.name,
        this.implicitRules,
        this.description,
        this.features,
        this.id,
        this.owner);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Project#name() name} attribute.
   * An equals check used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for name
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProject withName(String value) {
    String newValue = Objects.requireNonNull(value, "name");
    if (this.name.equals(newValue)) return this;
    return new ImmutableProject(
        this.language,
        this.resourceType,
        this.defaultPatientAccessPolicy,
        this.meta,
        newValue,
        this.implicitRules,
        this.description,
        this.features,
        this.id,
        this.owner);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Project#implicitRules() implicitRules} attribute.
   * @param value The value for implicitRules
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProject withImplicitRules(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "implicitRules");
    if (this.implicitRules == newValue) return this;
    return new ImmutableProject(
        this.language,
        this.resourceType,
        this.defaultPatientAccessPolicy,
        this.meta,
        this.name,
        newValue,
        this.description,
        this.features,
        this.id,
        this.owner);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Project#implicitRules() implicitRules} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for implicitRules
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProject withImplicitRules(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.implicitRules == value) return this;
    return new ImmutableProject(
        this.language,
        this.resourceType,
        this.defaultPatientAccessPolicy,
        this.meta,
        this.name,
        value,
        this.description,
        this.features,
        this.id,
        this.owner);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Project#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProject withDescription(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "description");
    if (Objects.equals(this.description, newValue)) return this;
    return new ImmutableProject(
        this.language,
        this.resourceType,
        this.defaultPatientAccessPolicy,
        this.meta,
        this.name,
        this.implicitRules,
        newValue,
        this.features,
        this.id,
        this.owner);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Project#description() description} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProject withDescription(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.description, value)) return this;
    return new ImmutableProject(
        this.language,
        this.resourceType,
        this.defaultPatientAccessPolicy,
        this.meta,
        this.name,
        this.implicitRules,
        value,
        this.features,
        this.id,
        this.owner);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Project#features() features} attribute.
   * @param value The value for features
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProject withFeatures(List<Code> value) {
    @Nullable List<Code> newValue = Objects.requireNonNull(value, "features");
    if (this.features == newValue) return this;
    return new ImmutableProject(
        this.language,
        this.resourceType,
        this.defaultPatientAccessPolicy,
        this.meta,
        this.name,
        this.implicitRules,
        this.description,
        newValue,
        this.id,
        this.owner);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Project#features() features} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for features
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProject withFeatures(Optional<? extends List<Code>> optional) {
    @Nullable List<Code> value = optional.orElse(null);
    if (this.features == value) return this;
    return new ImmutableProject(
        this.language,
        this.resourceType,
        this.defaultPatientAccessPolicy,
        this.meta,
        this.name,
        this.implicitRules,
        this.description,
        value,
        this.id,
        this.owner);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Project#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableProject withId(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "id");
    if (this.id == newValue) return this;
    return new ImmutableProject(
        this.language,
        this.resourceType,
        this.defaultPatientAccessPolicy,
        this.meta,
        this.name,
        this.implicitRules,
        this.description,
        this.features,
        newValue,
        this.owner);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Project#id() id} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableProject withId(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.id == value) return this;
    return new ImmutableProject(
        this.language,
        this.resourceType,
        this.defaultPatientAccessPolicy,
        this.meta,
        this.name,
        this.implicitRules,
        this.description,
        this.features,
        value,
        this.owner);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link Project#owner() owner} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for owner
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableProject withOwner(Reference value) {
    if (this.owner == value) return this;
    Reference newValue = Objects.requireNonNull(value, "owner");
    return new ImmutableProject(
        this.language,
        this.resourceType,
        this.defaultPatientAccessPolicy,
        this.meta,
        this.name,
        this.implicitRules,
        this.description,
        this.features,
        this.id,
        newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableProject} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableProject
        && equalTo((ImmutableProject) another);
  }

  private boolean equalTo(ImmutableProject another) {
    return Objects.equals(language, another.language)
        && Objects.equals(resourceType, another.resourceType)
        && Objects.equals(defaultPatientAccessPolicy, another.defaultPatientAccessPolicy)
        && Objects.equals(meta, another.meta)
        && name.equals(another.name)
        && Objects.equals(implicitRules, another.implicitRules)
        && Objects.equals(description, another.description)
        && Objects.equals(features, another.features)
        && Objects.equals(id, another.id)
        && owner.equals(another.owner);
  }

  /**
   * Computes a hash code from attributes: {@code language}, {@code resourceType}, {@code defaultPatientAccessPolicy}, {@code meta}, {@code name}, {@code implicitRules}, {@code description}, {@code features}, {@code id}, {@code owner}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(language);
    h += (h << 5) + Objects.hashCode(resourceType);
    h += (h << 5) + Objects.hashCode(defaultPatientAccessPolicy);
    h += (h << 5) + Objects.hashCode(meta);
    h += (h << 5) + name.hashCode();
    h += (h << 5) + Objects.hashCode(implicitRules);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(features);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + owner.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code Project} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Project{");
    if (language != null) {
      builder.append("language=").append(language);
    }
    if (resourceType != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("resourceType=").append(resourceType);
    }
    if (defaultPatientAccessPolicy != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("defaultPatientAccessPolicy=").append(defaultPatientAccessPolicy);
    }
    if (meta != null) {
      if (builder.length() > 8) builder.append(", ");
      builder.append("meta=").append(meta);
    }
    if (builder.length() > 8) builder.append(", ");
    builder.append("name=").append(name);
    if (implicitRules != null) {
      builder.append(", ");
      builder.append("implicitRules=").append(implicitRules);
    }
    if (description != null) {
      builder.append(", ");
      builder.append("description=").append(description);
    }
    if (features != null) {
      builder.append(", ");
      builder.append("features=").append(features);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    builder.append(", ");
    builder.append("owner=").append(owner);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Project", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Project {
    @Nullable Optional<Code> language = Optional.empty();
    boolean languageIsSet;
    @Nullable Optional<String> resourceType = Optional.empty();
    boolean resourceTypeIsSet;
    @Nullable Optional<Reference> defaultPatientAccessPolicy = Optional.empty();
    boolean defaultPatientAccessPolicyIsSet;
    @Nullable Optional<Meta> meta = Optional.empty();
    boolean metaIsSet;
    @Nullable String name;
    @Nullable Optional<Uri> implicitRules = Optional.empty();
    boolean implicitRulesIsSet;
    @Nullable Optional<String> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<List<Code>> features = Optional.empty();
    boolean featuresIsSet;
    @Nullable Optional<Id> id = Optional.empty();
    boolean idIsSet;
    @Nullable Reference owner;
    @JsonProperty("language")
    public void setLanguage(Optional<Code> language) {
      this.language = language;
      this.languageIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(Optional<String> resourceType) {
      this.resourceType = resourceType;
      this.resourceTypeIsSet = true;
    }
    @JsonProperty("defaultPatientAccessPolicy")
    public void setDefaultPatientAccessPolicy(Optional<Reference> defaultPatientAccessPolicy) {
      this.defaultPatientAccessPolicy = defaultPatientAccessPolicy;
      this.defaultPatientAccessPolicyIsSet = true;
    }
    @JsonProperty("meta")
    public void setMeta(Optional<Meta> meta) {
      this.meta = meta;
      this.metaIsSet = true;
    }
    @JsonProperty("name")
    public void setName(String name) {
      this.name = name;
    }
    @JsonProperty("implicitRules")
    public void setImplicitRules(Optional<Uri> implicitRules) {
      this.implicitRules = implicitRules;
      this.implicitRulesIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<String> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("features")
    public void setFeatures(Optional<List<Code>> features) {
      this.features = features;
      this.featuresIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<Id> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("owner")
    public void setOwner(Reference owner) {
      this.owner = owner;
    }
    @Override
    public Optional<Code> language() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Reference> defaultPatientAccessPolicy() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Meta> meta() { throw new UnsupportedOperationException(); }
    @Override
    public String name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> implicitRules() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Code>> features() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> id() { throw new UnsupportedOperationException(); }
    @Override
    public Reference owner() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableProject fromJson(Json json) {
    ImmutableProject.Builder builder = ((ImmutableProject.Builder) ImmutableProject.builder());
    if (json.languageIsSet) {
      builder.language(json.language);
    }
    if (json.resourceTypeIsSet) {
      builder.resourceType(json.resourceType);
    }
    if (json.defaultPatientAccessPolicyIsSet) {
      builder.defaultPatientAccessPolicy(json.defaultPatientAccessPolicy);
    }
    if (json.metaIsSet) {
      builder.meta(json.meta);
    }
    if (json.name != null) {
      builder.name(json.name);
    }
    if (json.implicitRulesIsSet) {
      builder.implicitRules(json.implicitRules);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.featuresIsSet) {
      builder.features(json.features);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.owner != null) {
      builder.owner(json.owner);
    }
    return (ImmutableProject) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Project} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Project instance
   */
  public static Project copyOf(Project instance) {
    if (instance instanceof ImmutableProject) {
      return (ImmutableProject) instance;
    }
    return ((ImmutableProject.Builder) ImmutableProject.builder())
        .language(instance.language())
        .resourceType(instance.resourceType())
        .defaultPatientAccessPolicy(instance.defaultPatientAccessPolicy())
        .meta(instance.meta())
        .name(instance.name())
        .implicitRules(instance.implicitRules())
        .description(instance.description())
        .features(instance.features())
        .id(instance.id())
        .owner(instance.owner())
        .build();
  }

  /**
   * Creates a builder for {@link Project Project}.
   * <pre>
   * ImmutableProject.builder()
   *    .language(com.fhir.types.fhir.Code) // optional {@link Project#language() language}
   *    .resourceType(String) // optional {@link Project#resourceType() resourceType}
   *    .defaultPatientAccessPolicy(com.fhir.types.fhir.Reference) // optional {@link Project#defaultPatientAccessPolicy() defaultPatientAccessPolicy}
   *    .meta(com.fhir.types.fhir.Meta) // optional {@link Project#meta() meta}
   *    .name(String) // required {@link Project#name() name}
   *    .implicitRules(com.fhir.types.fhir.Uri) // optional {@link Project#implicitRules() implicitRules}
   *    .description(String) // optional {@link Project#description() description}
   *    .features(List&amp;lt;com.fhir.types.fhir.Code&amp;gt;) // optional {@link Project#features() features}
   *    .id(com.fhir.types.fhir.Id) // optional {@link Project#id() id}
   *    .owner(com.fhir.types.fhir.Reference) // required {@link Project#owner() owner}
   *    .build();
   * </pre>
   * @return A new Project builder
   */
  public static NameBuildStage builder() {
    return new ImmutableProject.Builder();
  }

  /**
   * Builds instances of type {@link Project Project}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Project", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements NameBuildStage, OwnerBuildStage, BuildFinal {
    private static final long INIT_BIT_NAME = 0x1L;
    private static final long INIT_BIT_OWNER = 0x2L;
    private static final long OPT_BIT_LANGUAGE = 0x1L;
    private static final long OPT_BIT_RESOURCE_TYPE = 0x2L;
    private static final long OPT_BIT_DEFAULT_PATIENT_ACCESS_POLICY = 0x4L;
    private static final long OPT_BIT_META = 0x8L;
    private static final long OPT_BIT_IMPLICIT_RULES = 0x10L;
    private static final long OPT_BIT_DESCRIPTION = 0x20L;
    private static final long OPT_BIT_FEATURES = 0x40L;
    private static final long OPT_BIT_ID = 0x80L;
    private long initBits = 0x3L;
    private long optBits;

    private @Nullable Code language;
    private @Nullable String resourceType;
    private @Nullable Reference defaultPatientAccessPolicy;
    private @Nullable Meta meta;
    private @Nullable String name;
    private @Nullable Uri implicitRules;
    private @Nullable String description;
    private @Nullable List<Code> features;
    private @Nullable Id id;
    private @Nullable Reference owner;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Project#language() language} to language.
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
     * Initializes the optional value {@link Project#language() language} to language.
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
     * Initializes the optional value {@link Project#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for chained invocation
     */
    public final Builder resourceType(String resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = Objects.requireNonNull(resourceType, "resourceType");
      optBits |= OPT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Project#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resourceType")
    public final Builder resourceType(Optional<String> resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = resourceType.orElse(null);
      optBits |= OPT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link Project#defaultPatientAccessPolicy() defaultPatientAccessPolicy} to defaultPatientAccessPolicy.
     * @param defaultPatientAccessPolicy The value for defaultPatientAccessPolicy
     * @return {@code this} builder for chained invocation
     */
    public final Builder defaultPatientAccessPolicy(Reference defaultPatientAccessPolicy) {
      checkNotIsSet(defaultPatientAccessPolicyIsSet(), "defaultPatientAccessPolicy");
      this.defaultPatientAccessPolicy = Objects.requireNonNull(defaultPatientAccessPolicy, "defaultPatientAccessPolicy");
      optBits |= OPT_BIT_DEFAULT_PATIENT_ACCESS_POLICY;
      return this;
    }

    /**
     * Initializes the optional value {@link Project#defaultPatientAccessPolicy() defaultPatientAccessPolicy} to defaultPatientAccessPolicy.
     * @param defaultPatientAccessPolicy The value for defaultPatientAccessPolicy
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("defaultPatientAccessPolicy")
    public final Builder defaultPatientAccessPolicy(Optional<? extends Reference> defaultPatientAccessPolicy) {
      checkNotIsSet(defaultPatientAccessPolicyIsSet(), "defaultPatientAccessPolicy");
      this.defaultPatientAccessPolicy = defaultPatientAccessPolicy.orElse(null);
      optBits |= OPT_BIT_DEFAULT_PATIENT_ACCESS_POLICY;
      return this;
    }

    /**
     * Initializes the optional value {@link Project#meta() meta} to meta.
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
     * Initializes the optional value {@link Project#meta() meta} to meta.
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
     * Initializes the value for the {@link Project#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      initBits &= ~INIT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link Project#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Project#implicitRules() implicitRules} to implicitRules.
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
     * Initializes the optional value {@link Project#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(String description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Project#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<String> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link Project#features() features} to features.
     * @param features The value for features
     * @return {@code this} builder for chained invocation
     */
    public final Builder features(List<Code> features) {
      checkNotIsSet(featuresIsSet(), "features");
      this.features = Objects.requireNonNull(features, "features");
      optBits |= OPT_BIT_FEATURES;
      return this;
    }

    /**
     * Initializes the optional value {@link Project#features() features} to features.
     * @param features The value for features
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("features")
    public final Builder features(Optional<? extends List<Code>> features) {
      checkNotIsSet(featuresIsSet(), "features");
      this.features = features.orElse(null);
      optBits |= OPT_BIT_FEATURES;
      return this;
    }

    /**
     * Initializes the optional value {@link Project#id() id} to id.
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
     * Initializes the optional value {@link Project#id() id} to id.
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
     * Initializes the value for the {@link Project#owner() owner} attribute.
     * @param owner The value for owner 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("owner")
    public final Builder owner(Reference owner) {
      checkNotIsSet(ownerIsSet(), "owner");
      this.owner = Objects.requireNonNull(owner, "owner");
      initBits &= ~INIT_BIT_OWNER;
      return this;
    }

    /**
     * Builds a new {@link Project Project}.
     * @return An immutable instance of Project
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Project build() {
      checkRequiredAttributes();
      return new ImmutableProject(
          language,
          resourceType,
          defaultPatientAccessPolicy,
          meta,
          name,
          implicitRules,
          description,
          features,
          id,
          owner);
    }

    private boolean languageIsSet() {
      return (optBits & OPT_BIT_LANGUAGE) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (optBits & OPT_BIT_RESOURCE_TYPE) != 0;
    }

    private boolean defaultPatientAccessPolicyIsSet() {
      return (optBits & OPT_BIT_DEFAULT_PATIENT_ACCESS_POLICY) != 0;
    }

    private boolean metaIsSet() {
      return (optBits & OPT_BIT_META) != 0;
    }

    private boolean implicitRulesIsSet() {
      return (optBits & OPT_BIT_IMPLICIT_RULES) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean featuresIsSet() {
      return (optBits & OPT_BIT_FEATURES) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean nameIsSet() {
      return (initBits & INIT_BIT_NAME) == 0;
    }

    private boolean ownerIsSet() {
      return (initBits & INIT_BIT_OWNER) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Project is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!nameIsSet()) attributes.add("name");
      if (!ownerIsSet()) attributes.add("owner");
      return "Cannot build Project, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "Project", generator = "Immutables")
  public interface NameBuildStage {
    /**
     * Initializes the value for the {@link Project#name() name} attribute.
     * @param name The value for name 
     * @return {@code this} builder for use in a chained invocation
     */
    OwnerBuildStage name(String name);
  }

  @Generated(from = "Project", generator = "Immutables")
  public interface OwnerBuildStage {
    /**
     * Initializes the value for the {@link Project#owner() owner} attribute.
     * @param owner The value for owner 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal owner(Reference owner);
  }

  @Generated(from = "Project", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link Project#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for chained invocation
     */
    BuildFinal language(Code language);

    /**
     * Initializes the optional value {@link Project#language() language} to language.
     * @param language The value for language
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal language(Optional<? extends Code> language);

    /**
     * Initializes the optional value {@link Project#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for chained invocation
     */
    BuildFinal resourceType(String resourceType);

    /**
     * Initializes the optional value {@link Project#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal resourceType(Optional<String> resourceType);

    /**
     * Initializes the optional value {@link Project#defaultPatientAccessPolicy() defaultPatientAccessPolicy} to defaultPatientAccessPolicy.
     * @param defaultPatientAccessPolicy The value for defaultPatientAccessPolicy
     * @return {@code this} builder for chained invocation
     */
    BuildFinal defaultPatientAccessPolicy(Reference defaultPatientAccessPolicy);

    /**
     * Initializes the optional value {@link Project#defaultPatientAccessPolicy() defaultPatientAccessPolicy} to defaultPatientAccessPolicy.
     * @param defaultPatientAccessPolicy The value for defaultPatientAccessPolicy
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal defaultPatientAccessPolicy(Optional<? extends Reference> defaultPatientAccessPolicy);

    /**
     * Initializes the optional value {@link Project#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for chained invocation
     */
    BuildFinal meta(Meta meta);

    /**
     * Initializes the optional value {@link Project#meta() meta} to meta.
     * @param meta The value for meta
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal meta(Optional<? extends Meta> meta);

    /**
     * Initializes the optional value {@link Project#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for chained invocation
     */
    BuildFinal implicitRules(Uri implicitRules);

    /**
     * Initializes the optional value {@link Project#implicitRules() implicitRules} to implicitRules.
     * @param implicitRules The value for implicitRules
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal implicitRules(Optional<? extends Uri> implicitRules);

    /**
     * Initializes the optional value {@link Project#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    BuildFinal description(String description);

    /**
     * Initializes the optional value {@link Project#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal description(Optional<String> description);

    /**
     * Initializes the optional value {@link Project#features() features} to features.
     * @param features The value for features
     * @return {@code this} builder for chained invocation
     */
    BuildFinal features(List<Code> features);

    /**
     * Initializes the optional value {@link Project#features() features} to features.
     * @param features The value for features
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal features(Optional<? extends List<Code>> features);

    /**
     * Initializes the optional value {@link Project#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(Id id);

    /**
     * Initializes the optional value {@link Project#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<? extends Id> id);

    /**
     * Builds a new {@link Project Project}.
     * @return An immutable instance of Project
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    Project build();
  }
}

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
 * Immutable implementation of {@link ExampleScenario_Instance}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExampleScenario_Instance.builder()}.
 */
@Generated(from = "ExampleScenario_Instance", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExampleScenario_Instance implements ExampleScenario_Instance {
  private final @Nullable String resourceId;
  private final @Nullable List<Extension> extension;
  private final @Nullable String name;
  private final @Nullable String id;
  private final @Nullable Code resourceType;
  private final @Nullable Markdown description;
  private final @Nullable List<ExampleScenario_Version> version;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<ExampleScenario_ContainedInstance> containedInstance;

  private ImmutableExampleScenario_Instance(
      @Nullable String resourceId,
      @Nullable List<Extension> extension,
      @Nullable String name,
      @Nullable String id,
      @Nullable Code resourceType,
      @Nullable Markdown description,
      @Nullable List<ExampleScenario_Version> version,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<ExampleScenario_ContainedInstance> containedInstance) {
    this.resourceId = resourceId;
    this.extension = extension;
    this.name = name;
    this.id = id;
    this.resourceType = resourceType;
    this.description = description;
    this.version = version;
    this.modifierExtension = modifierExtension;
    this.containedInstance = containedInstance;
  }

  /**
   * @return The value of the {@code resourceId} attribute
   */
  @JsonProperty("resourceId")
  @Override
  public Optional<String> resourceId() {
    return Optional.ofNullable(resourceId);
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
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
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
   * @return The value of the {@code resourceType} attribute
   */
  @JsonProperty("resourceType")
  @Override
  public Optional<Code> resourceType() {
    return Optional.ofNullable(resourceType);
  }

  /**
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<Markdown> description() {
    return Optional.ofNullable(description);
  }

  /**
   * @return The value of the {@code version} attribute
   */
  @JsonProperty("version")
  @Override
  public Optional<List<ExampleScenario_Version>> version() {
    return Optional.ofNullable(version);
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
   * @return The value of the {@code containedInstance} attribute
   */
  @JsonProperty("containedInstance")
  @Override
  public Optional<List<ExampleScenario_ContainedInstance>> containedInstance() {
    return Optional.ofNullable(containedInstance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Instance#resourceId() resourceId} attribute.
   * @param value The value for resourceId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Instance withResourceId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "resourceId");
    if (Objects.equals(this.resourceId, newValue)) return this;
    return new ImmutableExampleScenario_Instance(
        newValue,
        this.extension,
        this.name,
        this.id,
        this.resourceType,
        this.description,
        this.version,
        this.modifierExtension,
        this.containedInstance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Instance#resourceId() resourceId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resourceId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Instance withResourceId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.resourceId, value)) return this;
    return new ImmutableExampleScenario_Instance(
        value,
        this.extension,
        this.name,
        this.id,
        this.resourceType,
        this.description,
        this.version,
        this.modifierExtension,
        this.containedInstance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Instance#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Instance withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExampleScenario_Instance(
        this.resourceId,
        newValue,
        this.name,
        this.id,
        this.resourceType,
        this.description,
        this.version,
        this.modifierExtension,
        this.containedInstance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Instance#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Instance withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExampleScenario_Instance(
        this.resourceId,
        value,
        this.name,
        this.id,
        this.resourceType,
        this.description,
        this.version,
        this.modifierExtension,
        this.containedInstance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Instance#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Instance withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableExampleScenario_Instance(
        this.resourceId,
        this.extension,
        newValue,
        this.id,
        this.resourceType,
        this.description,
        this.version,
        this.modifierExtension,
        this.containedInstance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Instance#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Instance withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableExampleScenario_Instance(
        this.resourceId,
        this.extension,
        value,
        this.id,
        this.resourceType,
        this.description,
        this.version,
        this.modifierExtension,
        this.containedInstance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Instance#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Instance withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableExampleScenario_Instance(
        this.resourceId,
        this.extension,
        this.name,
        newValue,
        this.resourceType,
        this.description,
        this.version,
        this.modifierExtension,
        this.containedInstance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Instance#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Instance withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableExampleScenario_Instance(
        this.resourceId,
        this.extension,
        this.name,
        value,
        this.resourceType,
        this.description,
        this.version,
        this.modifierExtension,
        this.containedInstance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Instance#resourceType() resourceType} attribute.
   * @param value The value for resourceType
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Instance withResourceType(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "resourceType");
    if (this.resourceType == newValue) return this;
    return new ImmutableExampleScenario_Instance(
        this.resourceId,
        this.extension,
        this.name,
        this.id,
        newValue,
        this.description,
        this.version,
        this.modifierExtension,
        this.containedInstance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Instance#resourceType() resourceType} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resourceType
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Instance withResourceType(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.resourceType == value) return this;
    return new ImmutableExampleScenario_Instance(
        this.resourceId,
        this.extension,
        this.name,
        this.id,
        value,
        this.description,
        this.version,
        this.modifierExtension,
        this.containedInstance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Instance#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Instance withDescription(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableExampleScenario_Instance(
        this.resourceId,
        this.extension,
        this.name,
        this.id,
        this.resourceType,
        newValue,
        this.version,
        this.modifierExtension,
        this.containedInstance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Instance#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Instance withDescription(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableExampleScenario_Instance(
        this.resourceId,
        this.extension,
        this.name,
        this.id,
        this.resourceType,
        value,
        this.version,
        this.modifierExtension,
        this.containedInstance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Instance#version() version} attribute.
   * @param value The value for version
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Instance withVersion(List<ExampleScenario_Version> value) {
    @Nullable List<ExampleScenario_Version> newValue = Objects.requireNonNull(value, "version");
    if (this.version == newValue) return this;
    return new ImmutableExampleScenario_Instance(
        this.resourceId,
        this.extension,
        this.name,
        this.id,
        this.resourceType,
        this.description,
        newValue,
        this.modifierExtension,
        this.containedInstance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Instance#version() version} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for version
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Instance withVersion(Optional<? extends List<ExampleScenario_Version>> optional) {
    @Nullable List<ExampleScenario_Version> value = optional.orElse(null);
    if (this.version == value) return this;
    return new ImmutableExampleScenario_Instance(
        this.resourceId,
        this.extension,
        this.name,
        this.id,
        this.resourceType,
        this.description,
        value,
        this.modifierExtension,
        this.containedInstance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Instance#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Instance withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExampleScenario_Instance(
        this.resourceId,
        this.extension,
        this.name,
        this.id,
        this.resourceType,
        this.description,
        this.version,
        newValue,
        this.containedInstance);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Instance#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Instance withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExampleScenario_Instance(
        this.resourceId,
        this.extension,
        this.name,
        this.id,
        this.resourceType,
        this.description,
        this.version,
        value,
        this.containedInstance);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Instance#containedInstance() containedInstance} attribute.
   * @param value The value for containedInstance
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Instance withContainedInstance(List<ExampleScenario_ContainedInstance> value) {
    @Nullable List<ExampleScenario_ContainedInstance> newValue = Objects.requireNonNull(value, "containedInstance");
    if (this.containedInstance == newValue) return this;
    return new ImmutableExampleScenario_Instance(
        this.resourceId,
        this.extension,
        this.name,
        this.id,
        this.resourceType,
        this.description,
        this.version,
        this.modifierExtension,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Instance#containedInstance() containedInstance} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for containedInstance
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Instance withContainedInstance(Optional<? extends List<ExampleScenario_ContainedInstance>> optional) {
    @Nullable List<ExampleScenario_ContainedInstance> value = optional.orElse(null);
    if (this.containedInstance == value) return this;
    return new ImmutableExampleScenario_Instance(
        this.resourceId,
        this.extension,
        this.name,
        this.id,
        this.resourceType,
        this.description,
        this.version,
        this.modifierExtension,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExampleScenario_Instance} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExampleScenario_Instance
        && equalTo((ImmutableExampleScenario_Instance) another);
  }

  private boolean equalTo(ImmutableExampleScenario_Instance another) {
    return Objects.equals(resourceId, another.resourceId)
        && Objects.equals(extension, another.extension)
        && Objects.equals(name, another.name)
        && Objects.equals(id, another.id)
        && Objects.equals(resourceType, another.resourceType)
        && Objects.equals(description, another.description)
        && Objects.equals(version, another.version)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(containedInstance, another.containedInstance);
  }

  /**
   * Computes a hash code from attributes: {@code resourceId}, {@code extension}, {@code name}, {@code id}, {@code resourceType}, {@code description}, {@code version}, {@code modifierExtension}, {@code containedInstance}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(resourceId);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(resourceType);
    h += (h << 5) + Objects.hashCode(description);
    h += (h << 5) + Objects.hashCode(version);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(containedInstance);
    return h;
  }

  /**
   * Prints the immutable value {@code ExampleScenario_Instance} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ExampleScenario_Instance{");
    if (resourceId != null) {
      builder.append("resourceId=").append(resourceId);
    }
    if (extension != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (name != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (id != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (resourceType != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("resourceType=").append(resourceType);
    }
    if (description != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("description=").append(description);
    }
    if (version != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("version=").append(version);
    }
    if (modifierExtension != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (containedInstance != null) {
      if (builder.length() > 25) builder.append(", ");
      builder.append("containedInstance=").append(containedInstance);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ExampleScenario_Instance", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ExampleScenario_Instance {
    @Nullable Optional<String> resourceId = Optional.empty();
    boolean resourceIdIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Code> resourceType = Optional.empty();
    boolean resourceTypeIsSet;
    @Nullable Optional<Markdown> description = Optional.empty();
    boolean descriptionIsSet;
    @Nullable Optional<List<ExampleScenario_Version>> version = Optional.empty();
    boolean versionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<ExampleScenario_ContainedInstance>> containedInstance = Optional.empty();
    boolean containedInstanceIsSet;
    @JsonProperty("resourceId")
    public void setResourceId(Optional<String> resourceId) {
      this.resourceId = resourceId;
      this.resourceIdIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("resourceType")
    public void setResourceType(Optional<Code> resourceType) {
      this.resourceType = resourceType;
      this.resourceTypeIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<Markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @JsonProperty("version")
    public void setVersion(Optional<List<ExampleScenario_Version>> version) {
      this.version = version;
      this.versionIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("containedInstance")
    public void setContainedInstance(Optional<List<ExampleScenario_ContainedInstance>> containedInstance) {
      this.containedInstance = containedInstance;
      this.containedInstanceIsSet = true;
    }
    @Override
    public Optional<String> resourceId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> resourceType() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> description() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ExampleScenario_Version>> version() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ExampleScenario_ContainedInstance>> containedInstance() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableExampleScenario_Instance fromJson(Json json) {
    ImmutableExampleScenario_Instance.Builder builder = ImmutableExampleScenario_Instance.builder();
    if (json.resourceIdIsSet) {
      builder.resourceId(json.resourceId);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.resourceTypeIsSet) {
      builder.resourceType(json.resourceType);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    if (json.versionIsSet) {
      builder.version(json.version);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.containedInstanceIsSet) {
      builder.containedInstance(json.containedInstance);
    }
    return (ImmutableExampleScenario_Instance) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ExampleScenario_Instance} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ExampleScenario_Instance instance
   */
  public static ExampleScenario_Instance copyOf(ExampleScenario_Instance instance) {
    if (instance instanceof ImmutableExampleScenario_Instance) {
      return (ImmutableExampleScenario_Instance) instance;
    }
    return ImmutableExampleScenario_Instance.builder()
        .resourceId(instance.resourceId())
        .extension(instance.extension())
        .name(instance.name())
        .id(instance.id())
        .resourceType(instance.resourceType())
        .description(instance.description())
        .version(instance.version())
        .modifierExtension(instance.modifierExtension())
        .containedInstance(instance.containedInstance())
        .build();
  }

  /**
   * Creates a builder for {@link ExampleScenario_Instance ExampleScenario_Instance}.
   * <pre>
   * ImmutableExampleScenario_Instance.builder()
   *    .resourceId(String) // optional {@link ExampleScenario_Instance#resourceId() resourceId}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExampleScenario_Instance#extension() extension}
   *    .name(String) // optional {@link ExampleScenario_Instance#name() name}
   *    .id(String) // optional {@link ExampleScenario_Instance#id() id}
   *    .resourceType(com.fhir.types.fhir.Code) // optional {@link ExampleScenario_Instance#resourceType() resourceType}
   *    .description(com.fhir.types.fhir.Markdown) // optional {@link ExampleScenario_Instance#description() description}
   *    .version(List&amp;lt;com.fhir.types.fhir.ExampleScenario_Version&amp;gt;) // optional {@link ExampleScenario_Instance#version() version}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExampleScenario_Instance#modifierExtension() modifierExtension}
   *    .containedInstance(List&amp;lt;com.fhir.types.fhir.ExampleScenario_ContainedInstance&amp;gt;) // optional {@link ExampleScenario_Instance#containedInstance() containedInstance}
   *    .build();
   * </pre>
   * @return A new ExampleScenario_Instance builder
   */
  public static ImmutableExampleScenario_Instance.Builder builder() {
    return new ImmutableExampleScenario_Instance.Builder();
  }

  /**
   * Builds instances of type {@link ExampleScenario_Instance ExampleScenario_Instance}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ExampleScenario_Instance", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_RESOURCE_ID = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_NAME = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_RESOURCE_TYPE = 0x10L;
    private static final long OPT_BIT_DESCRIPTION = 0x20L;
    private static final long OPT_BIT_VERSION = 0x40L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x80L;
    private static final long OPT_BIT_CONTAINED_INSTANCE = 0x100L;
    private long optBits;

    private @Nullable String resourceId;
    private @Nullable List<Extension> extension;
    private @Nullable String name;
    private @Nullable String id;
    private @Nullable Code resourceType;
    private @Nullable Markdown description;
    private @Nullable List<ExampleScenario_Version> version;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<ExampleScenario_ContainedInstance> containedInstance;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Instance#resourceId() resourceId} to resourceId.
     * @param resourceId The value for resourceId
     * @return {@code this} builder for chained invocation
     */
    public final Builder resourceId(String resourceId) {
      checkNotIsSet(resourceIdIsSet(), "resourceId");
      this.resourceId = Objects.requireNonNull(resourceId, "resourceId");
      optBits |= OPT_BIT_RESOURCE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Instance#resourceId() resourceId} to resourceId.
     * @param resourceId The value for resourceId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resourceId")
    public final Builder resourceId(Optional<String> resourceId) {
      checkNotIsSet(resourceIdIsSet(), "resourceId");
      this.resourceId = resourceId.orElse(null);
      optBits |= OPT_BIT_RESOURCE_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Instance#extension() extension} to extension.
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
     * Initializes the optional value {@link ExampleScenario_Instance#extension() extension} to extension.
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
     * Initializes the optional value {@link ExampleScenario_Instance#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(String name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Instance#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<String> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Instance#id() id} to id.
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
     * Initializes the optional value {@link ExampleScenario_Instance#id() id} to id.
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
     * Initializes the optional value {@link ExampleScenario_Instance#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for chained invocation
     */
    public final Builder resourceType(Code resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = Objects.requireNonNull(resourceType, "resourceType");
      optBits |= OPT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Instance#resourceType() resourceType} to resourceType.
     * @param resourceType The value for resourceType
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resourceType")
    public final Builder resourceType(Optional<? extends Code> resourceType) {
      checkNotIsSet(resourceTypeIsSet(), "resourceType");
      this.resourceType = resourceType.orElse(null);
      optBits |= OPT_BIT_RESOURCE_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Instance#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for chained invocation
     */
    public final Builder description(Markdown description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = Objects.requireNonNull(description, "description");
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Instance#description() description} to description.
     * @param description The value for description
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("description")
    public final Builder description(Optional<? extends Markdown> description) {
      checkNotIsSet(descriptionIsSet(), "description");
      this.description = description.orElse(null);
      optBits |= OPT_BIT_DESCRIPTION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Instance#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for chained invocation
     */
    public final Builder version(List<ExampleScenario_Version> version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = Objects.requireNonNull(version, "version");
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Instance#version() version} to version.
     * @param version The value for version
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("version")
    public final Builder version(Optional<? extends List<ExampleScenario_Version>> version) {
      checkNotIsSet(versionIsSet(), "version");
      this.version = version.orElse(null);
      optBits |= OPT_BIT_VERSION;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Instance#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExampleScenario_Instance#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExampleScenario_Instance#containedInstance() containedInstance} to containedInstance.
     * @param containedInstance The value for containedInstance
     * @return {@code this} builder for chained invocation
     */
    public final Builder containedInstance(List<ExampleScenario_ContainedInstance> containedInstance) {
      checkNotIsSet(containedInstanceIsSet(), "containedInstance");
      this.containedInstance = Objects.requireNonNull(containedInstance, "containedInstance");
      optBits |= OPT_BIT_CONTAINED_INSTANCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Instance#containedInstance() containedInstance} to containedInstance.
     * @param containedInstance The value for containedInstance
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("containedInstance")
    public final Builder containedInstance(Optional<? extends List<ExampleScenario_ContainedInstance>> containedInstance) {
      checkNotIsSet(containedInstanceIsSet(), "containedInstance");
      this.containedInstance = containedInstance.orElse(null);
      optBits |= OPT_BIT_CONTAINED_INSTANCE;
      return this;
    }

    /**
     * Builds a new {@link ExampleScenario_Instance ExampleScenario_Instance}.
     * @return An immutable instance of ExampleScenario_Instance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ExampleScenario_Instance build() {
      return new ImmutableExampleScenario_Instance(
          resourceId,
          extension,
          name,
          id,
          resourceType,
          description,
          version,
          modifierExtension,
          containedInstance);
    }

    private boolean resourceIdIsSet() {
      return (optBits & OPT_BIT_RESOURCE_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean resourceTypeIsSet() {
      return (optBits & OPT_BIT_RESOURCE_TYPE) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private boolean versionIsSet() {
      return (optBits & OPT_BIT_VERSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean containedInstanceIsSet() {
      return (optBits & OPT_BIT_CONTAINED_INSTANCE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ExampleScenario_Instance is strict, attribute is already set: ".concat(name));
    }
  }
}

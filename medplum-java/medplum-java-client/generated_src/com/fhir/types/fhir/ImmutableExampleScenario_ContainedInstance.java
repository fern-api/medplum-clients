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
 * Immutable implementation of {@link ExampleScenario_ContainedInstance}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExampleScenario_ContainedInstance.builder()}.
 */
@Generated(from = "ExampleScenario_ContainedInstance", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExampleScenario_ContainedInstance
    implements ExampleScenario_ContainedInstance {
  private final @Nullable String id;
  private final @Nullable String versionId;
  private final @Nullable String resourceId;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableExampleScenario_ContainedInstance(
      @Nullable String id,
      @Nullable String versionId,
      @Nullable String resourceId,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension) {
    this.id = id;
    this.versionId = versionId;
    this.resourceId = resourceId;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code versionId} attribute
   */
  @JsonProperty("versionId")
  @Override
  public Optional<String> versionId() {
    return Optional.ofNullable(versionId);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_ContainedInstance#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_ContainedInstance withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableExampleScenario_ContainedInstance(newValue, this.versionId, this.resourceId, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_ContainedInstance#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_ContainedInstance withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableExampleScenario_ContainedInstance(value, this.versionId, this.resourceId, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_ContainedInstance#versionId() versionId} attribute.
   * @param value The value for versionId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_ContainedInstance withVersionId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "versionId");
    if (Objects.equals(this.versionId, newValue)) return this;
    return new ImmutableExampleScenario_ContainedInstance(this.id, newValue, this.resourceId, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_ContainedInstance#versionId() versionId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for versionId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_ContainedInstance withVersionId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.versionId, value)) return this;
    return new ImmutableExampleScenario_ContainedInstance(this.id, value, this.resourceId, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_ContainedInstance#resourceId() resourceId} attribute.
   * @param value The value for resourceId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_ContainedInstance withResourceId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "resourceId");
    if (Objects.equals(this.resourceId, newValue)) return this;
    return new ImmutableExampleScenario_ContainedInstance(this.id, this.versionId, newValue, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_ContainedInstance#resourceId() resourceId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resourceId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_ContainedInstance withResourceId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.resourceId, value)) return this;
    return new ImmutableExampleScenario_ContainedInstance(this.id, this.versionId, value, this.extension, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_ContainedInstance#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_ContainedInstance withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExampleScenario_ContainedInstance(this.id, this.versionId, this.resourceId, newValue, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_ContainedInstance#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_ContainedInstance withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExampleScenario_ContainedInstance(this.id, this.versionId, this.resourceId, value, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_ContainedInstance#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_ContainedInstance withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExampleScenario_ContainedInstance(this.id, this.versionId, this.resourceId, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_ContainedInstance#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_ContainedInstance withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExampleScenario_ContainedInstance(this.id, this.versionId, this.resourceId, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExampleScenario_ContainedInstance} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExampleScenario_ContainedInstance
        && equalTo((ImmutableExampleScenario_ContainedInstance) another);
  }

  private boolean equalTo(ImmutableExampleScenario_ContainedInstance another) {
    return Objects.equals(id, another.id)
        && Objects.equals(versionId, another.versionId)
        && Objects.equals(resourceId, another.resourceId)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code versionId}, {@code resourceId}, {@code extension}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(versionId);
    h += (h << 5) + Objects.hashCode(resourceId);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code ExampleScenario_ContainedInstance} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ExampleScenario_ContainedInstance{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (versionId != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("versionId=").append(versionId);
    }
    if (resourceId != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("resourceId=").append(resourceId);
    }
    if (extension != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 34) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ExampleScenario_ContainedInstance", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ExampleScenario_ContainedInstance {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> versionId = Optional.empty();
    boolean versionIdIsSet;
    @Nullable Optional<String> resourceId = Optional.empty();
    boolean resourceIdIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("versionId")
    public void setVersionId(Optional<String> versionId) {
      this.versionId = versionId;
      this.versionIdIsSet = true;
    }
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
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> versionId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> resourceId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableExampleScenario_ContainedInstance fromJson(Json json) {
    ImmutableExampleScenario_ContainedInstance.Builder builder = ImmutableExampleScenario_ContainedInstance.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.versionIdIsSet) {
      builder.versionId(json.versionId);
    }
    if (json.resourceIdIsSet) {
      builder.resourceId(json.resourceId);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableExampleScenario_ContainedInstance) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ExampleScenario_ContainedInstance} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ExampleScenario_ContainedInstance instance
   */
  public static ExampleScenario_ContainedInstance copyOf(ExampleScenario_ContainedInstance instance) {
    if (instance instanceof ImmutableExampleScenario_ContainedInstance) {
      return (ImmutableExampleScenario_ContainedInstance) instance;
    }
    return ImmutableExampleScenario_ContainedInstance.builder()
        .id(instance.id())
        .versionId(instance.versionId())
        .resourceId(instance.resourceId())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link ExampleScenario_ContainedInstance ExampleScenario_ContainedInstance}.
   * <pre>
   * ImmutableExampleScenario_ContainedInstance.builder()
   *    .id(String) // optional {@link ExampleScenario_ContainedInstance#id() id}
   *    .versionId(String) // optional {@link ExampleScenario_ContainedInstance#versionId() versionId}
   *    .resourceId(String) // optional {@link ExampleScenario_ContainedInstance#resourceId() resourceId}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExampleScenario_ContainedInstance#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExampleScenario_ContainedInstance#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new ExampleScenario_ContainedInstance builder
   */
  public static ImmutableExampleScenario_ContainedInstance.Builder builder() {
    return new ImmutableExampleScenario_ContainedInstance.Builder();
  }

  /**
   * Builds instances of type {@link ExampleScenario_ContainedInstance ExampleScenario_ContainedInstance}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ExampleScenario_ContainedInstance", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_VERSION_ID = 0x2L;
    private static final long OPT_BIT_RESOURCE_ID = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private long optBits;

    private @Nullable String id;
    private @Nullable String versionId;
    private @Nullable String resourceId;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExampleScenario_ContainedInstance#id() id} to id.
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
     * Initializes the optional value {@link ExampleScenario_ContainedInstance#id() id} to id.
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
     * Initializes the optional value {@link ExampleScenario_ContainedInstance#versionId() versionId} to versionId.
     * @param versionId The value for versionId
     * @return {@code this} builder for chained invocation
     */
    public final Builder versionId(String versionId) {
      checkNotIsSet(versionIdIsSet(), "versionId");
      this.versionId = Objects.requireNonNull(versionId, "versionId");
      optBits |= OPT_BIT_VERSION_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_ContainedInstance#versionId() versionId} to versionId.
     * @param versionId The value for versionId
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("versionId")
    public final Builder versionId(Optional<String> versionId) {
      checkNotIsSet(versionIdIsSet(), "versionId");
      this.versionId = versionId.orElse(null);
      optBits |= OPT_BIT_VERSION_ID;
      return this;
    }

    /**
     * Initializes the optional value {@link ExampleScenario_ContainedInstance#resourceId() resourceId} to resourceId.
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
     * Initializes the optional value {@link ExampleScenario_ContainedInstance#resourceId() resourceId} to resourceId.
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
     * Initializes the optional value {@link ExampleScenario_ContainedInstance#extension() extension} to extension.
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
     * Initializes the optional value {@link ExampleScenario_ContainedInstance#extension() extension} to extension.
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
     * Initializes the optional value {@link ExampleScenario_ContainedInstance#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExampleScenario_ContainedInstance#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link ExampleScenario_ContainedInstance ExampleScenario_ContainedInstance}.
     * @return An immutable instance of ExampleScenario_ContainedInstance
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ExampleScenario_ContainedInstance build() {
      return new ImmutableExampleScenario_ContainedInstance(id, versionId, resourceId, extension, modifierExtension);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean versionIdIsSet() {
      return (optBits & OPT_BIT_VERSION_ID) != 0;
    }

    private boolean resourceIdIsSet() {
      return (optBits & OPT_BIT_RESOURCE_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ExampleScenario_ContainedInstance is strict, attribute is already set: ".concat(name));
    }
  }
}

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
 * Immutable implementation of {@link ExampleScenario_Version}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableExampleScenario_Version.builder()}.
 */
@Generated(from = "ExampleScenario_Version", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableExampleScenario_Version implements ExampleScenario_Version {
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String versionId;
  private final @Nullable String id;
  private final @Nullable Markdown description;

  private ImmutableExampleScenario_Version(
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable String versionId,
      @Nullable String id,
      @Nullable Markdown description) {
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.versionId = versionId;
    this.id = id;
    this.description = description;
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
   * @return The value of the {@code versionId} attribute
   */
  @JsonProperty("versionId")
  @Override
  public Optional<String> versionId() {
    return Optional.ofNullable(versionId);
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
   * @return The value of the {@code description} attribute
   */
  @JsonProperty("description")
  @Override
  public Optional<Markdown> description() {
    return Optional.ofNullable(description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Version#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Version withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableExampleScenario_Version(newValue, this.modifierExtension, this.versionId, this.id, this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Version#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Version withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableExampleScenario_Version(value, this.modifierExtension, this.versionId, this.id, this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Version#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Version withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableExampleScenario_Version(this.extension, newValue, this.versionId, this.id, this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Version#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Version withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableExampleScenario_Version(this.extension, value, this.versionId, this.id, this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Version#versionId() versionId} attribute.
   * @param value The value for versionId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Version withVersionId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "versionId");
    if (Objects.equals(this.versionId, newValue)) return this;
    return new ImmutableExampleScenario_Version(this.extension, this.modifierExtension, newValue, this.id, this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Version#versionId() versionId} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for versionId
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Version withVersionId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.versionId, value)) return this;
    return new ImmutableExampleScenario_Version(this.extension, this.modifierExtension, value, this.id, this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Version#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Version withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableExampleScenario_Version(this.extension, this.modifierExtension, this.versionId, newValue, this.description);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Version#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Version withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableExampleScenario_Version(this.extension, this.modifierExtension, this.versionId, value, this.description);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ExampleScenario_Version#description() description} attribute.
   * @param value The value for description
   * @return A modified copy of {@code this} object
   */
  public final ImmutableExampleScenario_Version withDescription(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "description");
    if (this.description == newValue) return this;
    return new ImmutableExampleScenario_Version(this.extension, this.modifierExtension, this.versionId, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ExampleScenario_Version#description() description} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for description
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableExampleScenario_Version withDescription(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.description == value) return this;
    return new ImmutableExampleScenario_Version(this.extension, this.modifierExtension, this.versionId, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableExampleScenario_Version} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableExampleScenario_Version
        && equalTo((ImmutableExampleScenario_Version) another);
  }

  private boolean equalTo(ImmutableExampleScenario_Version another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(versionId, another.versionId)
        && Objects.equals(id, another.id)
        && Objects.equals(description, another.description);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code modifierExtension}, {@code versionId}, {@code id}, {@code description}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(versionId);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(description);
    return h;
  }

  /**
   * Prints the immutable value {@code ExampleScenario_Version} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ExampleScenario_Version{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (versionId != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("versionId=").append(versionId);
    }
    if (id != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (description != null) {
      if (builder.length() > 24) builder.append(", ");
      builder.append("description=").append(description);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ExampleScenario_Version", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ExampleScenario_Version {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> versionId = Optional.empty();
    boolean versionIdIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Markdown> description = Optional.empty();
    boolean descriptionIsSet;
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
    @JsonProperty("versionId")
    public void setVersionId(Optional<String> versionId) {
      this.versionId = versionId;
      this.versionIdIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("description")
    public void setDescription(Optional<Markdown> description) {
      this.description = description;
      this.descriptionIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> versionId() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> description() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableExampleScenario_Version fromJson(Json json) {
    ImmutableExampleScenario_Version.Builder builder = ImmutableExampleScenario_Version.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.versionIdIsSet) {
      builder.versionId(json.versionId);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.descriptionIsSet) {
      builder.description(json.description);
    }
    return (ImmutableExampleScenario_Version) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ExampleScenario_Version} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ExampleScenario_Version instance
   */
  public static ExampleScenario_Version copyOf(ExampleScenario_Version instance) {
    if (instance instanceof ImmutableExampleScenario_Version) {
      return (ImmutableExampleScenario_Version) instance;
    }
    return ImmutableExampleScenario_Version.builder()
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .versionId(instance.versionId())
        .id(instance.id())
        .description(instance.description())
        .build();
  }

  /**
   * Creates a builder for {@link ExampleScenario_Version ExampleScenario_Version}.
   * <pre>
   * ImmutableExampleScenario_Version.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExampleScenario_Version#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ExampleScenario_Version#modifierExtension() modifierExtension}
   *    .versionId(String) // optional {@link ExampleScenario_Version#versionId() versionId}
   *    .id(String) // optional {@link ExampleScenario_Version#id() id}
   *    .description(com.fhir.types.fhir.Markdown) // optional {@link ExampleScenario_Version#description() description}
   *    .build();
   * </pre>
   * @return A new ExampleScenario_Version builder
   */
  public static ImmutableExampleScenario_Version.Builder builder() {
    return new ImmutableExampleScenario_Version.Builder();
  }

  /**
   * Builds instances of type {@link ExampleScenario_Version ExampleScenario_Version}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ExampleScenario_Version", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_VERSION_ID = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_DESCRIPTION = 0x10L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String versionId;
    private @Nullable String id;
    private @Nullable Markdown description;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ExampleScenario_Version#extension() extension} to extension.
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
     * Initializes the optional value {@link ExampleScenario_Version#extension() extension} to extension.
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
     * Initializes the optional value {@link ExampleScenario_Version#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExampleScenario_Version#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ExampleScenario_Version#versionId() versionId} to versionId.
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
     * Initializes the optional value {@link ExampleScenario_Version#versionId() versionId} to versionId.
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
     * Initializes the optional value {@link ExampleScenario_Version#id() id} to id.
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
     * Initializes the optional value {@link ExampleScenario_Version#id() id} to id.
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
     * Initializes the optional value {@link ExampleScenario_Version#description() description} to description.
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
     * Initializes the optional value {@link ExampleScenario_Version#description() description} to description.
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
     * Builds a new {@link ExampleScenario_Version ExampleScenario_Version}.
     * @return An immutable instance of ExampleScenario_Version
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ExampleScenario_Version build() {
      return new ImmutableExampleScenario_Version(extension, modifierExtension, versionId, id, description);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean versionIdIsSet() {
      return (optBits & OPT_BIT_VERSION_ID) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean descriptionIsSet() {
      return (optBits & OPT_BIT_DESCRIPTION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ExampleScenario_Version is strict, attribute is already set: ".concat(name));
    }
  }
}

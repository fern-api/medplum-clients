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
 * Immutable implementation of {@link StructureMap_Input}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableStructureMap_Input.builder()}.
 */
@Generated(from = "StructureMap_Input", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableStructureMap_Input implements StructureMap_Input {
  private final @Nullable List<Extension> extension;
  private final @Nullable String documentation;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Id name;
  private final @Nullable String id;
  private final @Nullable String type;
  private final @Nullable Structuremap_InputMode mode;

  private ImmutableStructureMap_Input(
      @Nullable List<Extension> extension,
      @Nullable String documentation,
      @Nullable List<Extension> modifierExtension,
      @Nullable Id name,
      @Nullable String id,
      @Nullable String type,
      @Nullable Structuremap_InputMode mode) {
    this.extension = extension;
    this.documentation = documentation;
    this.modifierExtension = modifierExtension;
    this.name = name;
    this.id = id;
    this.type = type;
    this.mode = mode;
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
   * @return The value of the {@code documentation} attribute
   */
  @JsonProperty("documentation")
  @Override
  public Optional<String> documentation() {
    return Optional.ofNullable(documentation);
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
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<Id> name() {
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<String> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code mode} attribute
   */
  @JsonProperty("mode")
  @Override
  public Optional<Structuremap_InputMode> mode() {
    return Optional.ofNullable(mode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Input#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Input withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableStructureMap_Input(newValue, this.documentation, this.modifierExtension, this.name, this.id, this.type, this.mode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Input#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Input withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableStructureMap_Input(value, this.documentation, this.modifierExtension, this.name, this.id, this.type, this.mode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Input#documentation() documentation} attribute.
   * @param value The value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Input withDocumentation(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "documentation");
    if (Objects.equals(this.documentation, newValue)) return this;
    return new ImmutableStructureMap_Input(this.extension, newValue, this.modifierExtension, this.name, this.id, this.type, this.mode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Input#documentation() documentation} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Input withDocumentation(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.documentation, value)) return this;
    return new ImmutableStructureMap_Input(this.extension, value, this.modifierExtension, this.name, this.id, this.type, this.mode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Input#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Input withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableStructureMap_Input(this.extension, this.documentation, newValue, this.name, this.id, this.type, this.mode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Input#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Input withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableStructureMap_Input(this.extension, this.documentation, value, this.name, this.id, this.type, this.mode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Input#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Input withName(Id value) {
    @Nullable Id newValue = Objects.requireNonNull(value, "name");
    if (this.name == newValue) return this;
    return new ImmutableStructureMap_Input(
        this.extension,
        this.documentation,
        this.modifierExtension,
        newValue,
        this.id,
        this.type,
        this.mode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Input#name() name} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Input withName(Optional<? extends Id> optional) {
    @Nullable Id value = optional.orElse(null);
    if (this.name == value) return this;
    return new ImmutableStructureMap_Input(
        this.extension,
        this.documentation,
        this.modifierExtension,
        value,
        this.id,
        this.type,
        this.mode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Input#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Input withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableStructureMap_Input(
        this.extension,
        this.documentation,
        this.modifierExtension,
        this.name,
        newValue,
        this.type,
        this.mode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Input#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Input withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableStructureMap_Input(
        this.extension,
        this.documentation,
        this.modifierExtension,
        this.name,
        value,
        this.type,
        this.mode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Input#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Input withType(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "type");
    if (Objects.equals(this.type, newValue)) return this;
    return new ImmutableStructureMap_Input(
        this.extension,
        this.documentation,
        this.modifierExtension,
        this.name,
        this.id,
        newValue,
        this.mode);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Input#type() type} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Input withType(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.type, value)) return this;
    return new ImmutableStructureMap_Input(
        this.extension,
        this.documentation,
        this.modifierExtension,
        this.name,
        this.id,
        value,
        this.mode);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link StructureMap_Input#mode() mode} attribute.
   * @param value The value for mode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableStructureMap_Input withMode(Structuremap_InputMode value) {
    @Nullable Structuremap_InputMode newValue = Objects.requireNonNull(value, "mode");
    if (this.mode == newValue) return this;
    return new ImmutableStructureMap_Input(
        this.extension,
        this.documentation,
        this.modifierExtension,
        this.name,
        this.id,
        this.type,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link StructureMap_Input#mode() mode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for mode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableStructureMap_Input withMode(Optional<? extends Structuremap_InputMode> optional) {
    @Nullable Structuremap_InputMode value = optional.orElse(null);
    if (this.mode == value) return this;
    return new ImmutableStructureMap_Input(
        this.extension,
        this.documentation,
        this.modifierExtension,
        this.name,
        this.id,
        this.type,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableStructureMap_Input} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableStructureMap_Input
        && equalTo((ImmutableStructureMap_Input) another);
  }

  private boolean equalTo(ImmutableStructureMap_Input another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(documentation, another.documentation)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(name, another.name)
        && Objects.equals(id, another.id)
        && Objects.equals(type, another.type)
        && Objects.equals(mode, another.mode);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code documentation}, {@code modifierExtension}, {@code name}, {@code id}, {@code type}, {@code mode}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(documentation);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(mode);
    return h;
  }

  /**
   * Prints the immutable value {@code StructureMap_Input} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("StructureMap_Input{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (documentation != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("documentation=").append(documentation);
    }
    if (modifierExtension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (name != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (id != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (type != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (mode != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("mode=").append(mode);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "StructureMap_Input", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements StructureMap_Input {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> documentation = Optional.empty();
    boolean documentationIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Id> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<Structuremap_InputMode> mode = Optional.empty();
    boolean modeIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("documentation")
    public void setDocumentation(Optional<String> documentation) {
      this.documentation = documentation;
      this.documentationIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<Id> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<String> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("mode")
    public void setMode(Optional<Structuremap_InputMode> mode) {
      this.mode = mode;
      this.modeIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> documentation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Id> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Structuremap_InputMode> mode() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableStructureMap_Input fromJson(Json json) {
    ImmutableStructureMap_Input.Builder builder = ImmutableStructureMap_Input.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.documentationIsSet) {
      builder.documentation(json.documentation);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.modeIsSet) {
      builder.mode(json.mode);
    }
    return (ImmutableStructureMap_Input) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link StructureMap_Input} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable StructureMap_Input instance
   */
  public static StructureMap_Input copyOf(StructureMap_Input instance) {
    if (instance instanceof ImmutableStructureMap_Input) {
      return (ImmutableStructureMap_Input) instance;
    }
    return ImmutableStructureMap_Input.builder()
        .extension(instance.extension())
        .documentation(instance.documentation())
        .modifierExtension(instance.modifierExtension())
        .name(instance.name())
        .id(instance.id())
        .type(instance.type())
        .mode(instance.mode())
        .build();
  }

  /**
   * Creates a builder for {@link StructureMap_Input StructureMap_Input}.
   * <pre>
   * ImmutableStructureMap_Input.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link StructureMap_Input#extension() extension}
   *    .documentation(String) // optional {@link StructureMap_Input#documentation() documentation}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link StructureMap_Input#modifierExtension() modifierExtension}
   *    .name(com.fhir.types.fhir.Id) // optional {@link StructureMap_Input#name() name}
   *    .id(String) // optional {@link StructureMap_Input#id() id}
   *    .type(String) // optional {@link StructureMap_Input#type() type}
   *    .mode(Structuremap_InputMode) // optional {@link StructureMap_Input#mode() mode}
   *    .build();
   * </pre>
   * @return A new StructureMap_Input builder
   */
  public static ImmutableStructureMap_Input.Builder builder() {
    return new ImmutableStructureMap_Input.Builder();
  }

  /**
   * Builds instances of type {@link StructureMap_Input StructureMap_Input}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "StructureMap_Input", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_DOCUMENTATION = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_NAME = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_TYPE = 0x20L;
    private static final long OPT_BIT_MODE = 0x40L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable String documentation;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Id name;
    private @Nullable String id;
    private @Nullable String type;
    private @Nullable Structuremap_InputMode mode;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link StructureMap_Input#extension() extension} to extension.
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
     * Initializes the optional value {@link StructureMap_Input#extension() extension} to extension.
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
     * Initializes the optional value {@link StructureMap_Input#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for chained invocation
     */
    public final Builder documentation(String documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = Objects.requireNonNull(documentation, "documentation");
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Input#documentation() documentation} to documentation.
     * @param documentation The value for documentation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("documentation")
    public final Builder documentation(Optional<String> documentation) {
      checkNotIsSet(documentationIsSet(), "documentation");
      this.documentation = documentation.orElse(null);
      optBits |= OPT_BIT_DOCUMENTATION;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Input#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureMap_Input#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link StructureMap_Input#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for chained invocation
     */
    public final Builder name(Id name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = Objects.requireNonNull(name, "name");
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Input#name() name} to name.
     * @param name The value for name
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("name")
    public final Builder name(Optional<? extends Id> name) {
      checkNotIsSet(nameIsSet(), "name");
      this.name = name.orElse(null);
      optBits |= OPT_BIT_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Input#id() id} to id.
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
     * Initializes the optional value {@link StructureMap_Input#id() id} to id.
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
     * Initializes the optional value {@link StructureMap_Input#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(String type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Input#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<String> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Input#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for chained invocation
     */
    public final Builder mode(Structuremap_InputMode mode) {
      checkNotIsSet(modeIsSet(), "mode");
      this.mode = Objects.requireNonNull(mode, "mode");
      optBits |= OPT_BIT_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link StructureMap_Input#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("mode")
    public final Builder mode(Optional<? extends Structuremap_InputMode> mode) {
      checkNotIsSet(modeIsSet(), "mode");
      this.mode = mode.orElse(null);
      optBits |= OPT_BIT_MODE;
      return this;
    }

    /**
     * Builds a new {@link StructureMap_Input StructureMap_Input}.
     * @return An immutable instance of StructureMap_Input
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public StructureMap_Input build() {
      return new ImmutableStructureMap_Input(extension, documentation, modifierExtension, name, id, type, mode);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean documentationIsSet() {
      return (optBits & OPT_BIT_DOCUMENTATION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean modeIsSet() {
      return (optBits & OPT_BIT_MODE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of StructureMap_Input is strict, attribute is already set: ".concat(name));
    }
  }
}

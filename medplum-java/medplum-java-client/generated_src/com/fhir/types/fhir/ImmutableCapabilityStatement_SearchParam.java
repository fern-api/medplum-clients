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
 * Immutable implementation of {@link CapabilityStatement_SearchParam}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCapabilityStatement_SearchParam.builder()}.
 */
@Generated(from = "CapabilityStatement_SearchParam", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCapabilityStatement_SearchParam
    implements CapabilityStatement_SearchParam {
  private final @Nullable List<Extension> extension;
  private final @Nullable Capabilitystatement_SearchparamType type;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String name;
  private final @Nullable Canonical definition;
  private final @Nullable Markdown documentation;
  private final @Nullable String id;

  private ImmutableCapabilityStatement_SearchParam(
      @Nullable List<Extension> extension,
      @Nullable Capabilitystatement_SearchparamType type,
      @Nullable List<Extension> modifierExtension,
      @Nullable String name,
      @Nullable Canonical definition,
      @Nullable Markdown documentation,
      @Nullable String id) {
    this.extension = extension;
    this.type = type;
    this.modifierExtension = modifierExtension;
    this.name = name;
    this.definition = definition;
    this.documentation = documentation;
    this.id = id;
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<Capabilitystatement_SearchparamType> type() {
    return Optional.ofNullable(type);
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
  public Optional<String> name() {
    return Optional.ofNullable(name);
  }

  /**
   * @return The value of the {@code definition} attribute
   */
  @JsonProperty("definition")
  @Override
  public Optional<Canonical> definition() {
    return Optional.ofNullable(definition);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_SearchParam#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_SearchParam withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCapabilityStatement_SearchParam(
        newValue,
        this.type,
        this.modifierExtension,
        this.name,
        this.definition,
        this.documentation,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_SearchParam#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_SearchParam withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCapabilityStatement_SearchParam(
        value,
        this.type,
        this.modifierExtension,
        this.name,
        this.definition,
        this.documentation,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_SearchParam#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_SearchParam withType(Capabilitystatement_SearchparamType value) {
    @Nullable Capabilitystatement_SearchparamType newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableCapabilityStatement_SearchParam(
        this.extension,
        newValue,
        this.modifierExtension,
        this.name,
        this.definition,
        this.documentation,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_SearchParam#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_SearchParam withType(Optional<? extends Capabilitystatement_SearchparamType> optional) {
    @Nullable Capabilitystatement_SearchparamType value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableCapabilityStatement_SearchParam(
        this.extension,
        value,
        this.modifierExtension,
        this.name,
        this.definition,
        this.documentation,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_SearchParam#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_SearchParam withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCapabilityStatement_SearchParam(this.extension, this.type, newValue, this.name, this.definition, this.documentation, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_SearchParam#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_SearchParam withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCapabilityStatement_SearchParam(this.extension, this.type, value, this.name, this.definition, this.documentation, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_SearchParam#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_SearchParam withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableCapabilityStatement_SearchParam(
        this.extension,
        this.type,
        this.modifierExtension,
        newValue,
        this.definition,
        this.documentation,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_SearchParam#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_SearchParam withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableCapabilityStatement_SearchParam(
        this.extension,
        this.type,
        this.modifierExtension,
        value,
        this.definition,
        this.documentation,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_SearchParam#definition() definition} attribute.
   * @param value The value for definition
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_SearchParam withDefinition(Canonical value) {
    @Nullable Canonical newValue = Objects.requireNonNull(value, "definition");
    if (this.definition == newValue) return this;
    return new ImmutableCapabilityStatement_SearchParam(
        this.extension,
        this.type,
        this.modifierExtension,
        this.name,
        newValue,
        this.documentation,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_SearchParam#definition() definition} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for definition
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_SearchParam withDefinition(Optional<? extends Canonical> optional) {
    @Nullable Canonical value = optional.orElse(null);
    if (this.definition == value) return this;
    return new ImmutableCapabilityStatement_SearchParam(
        this.extension,
        this.type,
        this.modifierExtension,
        this.name,
        value,
        this.documentation,
        this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_SearchParam#documentation() documentation} attribute.
   * @param value The value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_SearchParam withDocumentation(Markdown value) {
    @Nullable Markdown newValue = Objects.requireNonNull(value, "documentation");
    if (this.documentation == newValue) return this;
    return new ImmutableCapabilityStatement_SearchParam(
        this.extension,
        this.type,
        this.modifierExtension,
        this.name,
        this.definition,
        newValue,
        this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_SearchParam#documentation() documentation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for documentation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCapabilityStatement_SearchParam withDocumentation(Optional<? extends Markdown> optional) {
    @Nullable Markdown value = optional.orElse(null);
    if (this.documentation == value) return this;
    return new ImmutableCapabilityStatement_SearchParam(this.extension, this.type, this.modifierExtension, this.name, this.definition, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CapabilityStatement_SearchParam#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_SearchParam withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableCapabilityStatement_SearchParam(
        this.extension,
        this.type,
        this.modifierExtension,
        this.name,
        this.definition,
        this.documentation,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CapabilityStatement_SearchParam#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCapabilityStatement_SearchParam withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableCapabilityStatement_SearchParam(
        this.extension,
        this.type,
        this.modifierExtension,
        this.name,
        this.definition,
        this.documentation,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCapabilityStatement_SearchParam} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCapabilityStatement_SearchParam
        && equalTo((ImmutableCapabilityStatement_SearchParam) another);
  }

  private boolean equalTo(ImmutableCapabilityStatement_SearchParam another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(type, another.type)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(name, another.name)
        && Objects.equals(definition, another.definition)
        && Objects.equals(documentation, another.documentation)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code type}, {@code modifierExtension}, {@code name}, {@code definition}, {@code documentation}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(name);
    h += (h << 5) + Objects.hashCode(definition);
    h += (h << 5) + Objects.hashCode(documentation);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code CapabilityStatement_SearchParam} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CapabilityStatement_SearchParam{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (type != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (modifierExtension != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (name != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("name=").append(name);
    }
    if (definition != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("definition=").append(definition);
    }
    if (documentation != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("documentation=").append(documentation);
    }
    if (id != null) {
      if (builder.length() > 32) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CapabilityStatement_SearchParam", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CapabilityStatement_SearchParam {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Capabilitystatement_SearchparamType> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
    @Nullable Optional<Canonical> definition = Optional.empty();
    boolean definitionIsSet;
    @Nullable Optional<Markdown> documentation = Optional.empty();
    boolean documentationIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("type")
    public void setType(Optional<Capabilitystatement_SearchparamType> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @JsonProperty("definition")
    public void setDefinition(Optional<Canonical> definition) {
      this.definition = definition;
      this.definitionIsSet = true;
    }
    @JsonProperty("documentation")
    public void setDocumentation(Optional<Markdown> documentation) {
      this.documentation = documentation;
      this.documentationIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Capabilitystatement_SearchparamType> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Canonical> definition() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Markdown> documentation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCapabilityStatement_SearchParam fromJson(Json json) {
    ImmutableCapabilityStatement_SearchParam.Builder builder = ImmutableCapabilityStatement_SearchParam.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    if (json.definitionIsSet) {
      builder.definition(json.definition);
    }
    if (json.documentationIsSet) {
      builder.documentation(json.documentation);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableCapabilityStatement_SearchParam) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CapabilityStatement_SearchParam} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CapabilityStatement_SearchParam instance
   */
  public static CapabilityStatement_SearchParam copyOf(CapabilityStatement_SearchParam instance) {
    if (instance instanceof ImmutableCapabilityStatement_SearchParam) {
      return (ImmutableCapabilityStatement_SearchParam) instance;
    }
    return ImmutableCapabilityStatement_SearchParam.builder()
        .extension(instance.extension())
        .type(instance.type())
        .modifierExtension(instance.modifierExtension())
        .name(instance.name())
        .definition(instance.definition())
        .documentation(instance.documentation())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link CapabilityStatement_SearchParam CapabilityStatement_SearchParam}.
   * <pre>
   * ImmutableCapabilityStatement_SearchParam.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CapabilityStatement_SearchParam#extension() extension}
   *    .type(Capabilitystatement_SearchparamType) // optional {@link CapabilityStatement_SearchParam#type() type}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CapabilityStatement_SearchParam#modifierExtension() modifierExtension}
   *    .name(String) // optional {@link CapabilityStatement_SearchParam#name() name}
   *    .definition(com.fhir.types.fhir.Canonical) // optional {@link CapabilityStatement_SearchParam#definition() definition}
   *    .documentation(com.fhir.types.fhir.Markdown) // optional {@link CapabilityStatement_SearchParam#documentation() documentation}
   *    .id(String) // optional {@link CapabilityStatement_SearchParam#id() id}
   *    .build();
   * </pre>
   * @return A new CapabilityStatement_SearchParam builder
   */
  public static ImmutableCapabilityStatement_SearchParam.Builder builder() {
    return new ImmutableCapabilityStatement_SearchParam.Builder();
  }

  /**
   * Builds instances of type {@link CapabilityStatement_SearchParam CapabilityStatement_SearchParam}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CapabilityStatement_SearchParam", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_TYPE = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_NAME = 0x8L;
    private static final long OPT_BIT_DEFINITION = 0x10L;
    private static final long OPT_BIT_DOCUMENTATION = 0x20L;
    private static final long OPT_BIT_ID = 0x40L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable Capabilitystatement_SearchparamType type;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String name;
    private @Nullable Canonical definition;
    private @Nullable Markdown documentation;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_SearchParam#extension() extension} to extension.
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
     * Initializes the optional value {@link CapabilityStatement_SearchParam#extension() extension} to extension.
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
     * Initializes the optional value {@link CapabilityStatement_SearchParam#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(Capabilitystatement_SearchparamType type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_SearchParam#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends Capabilitystatement_SearchparamType> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_SearchParam#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CapabilityStatement_SearchParam#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CapabilityStatement_SearchParam#name() name} to name.
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
     * Initializes the optional value {@link CapabilityStatement_SearchParam#name() name} to name.
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
     * Initializes the optional value {@link CapabilityStatement_SearchParam#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for chained invocation
     */
    public final Builder definition(Canonical definition) {
      checkNotIsSet(definitionIsSet(), "definition");
      this.definition = Objects.requireNonNull(definition, "definition");
      optBits |= OPT_BIT_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_SearchParam#definition() definition} to definition.
     * @param definition The value for definition
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("definition")
    public final Builder definition(Optional<? extends Canonical> definition) {
      checkNotIsSet(definitionIsSet(), "definition");
      this.definition = definition.orElse(null);
      optBits |= OPT_BIT_DEFINITION;
      return this;
    }

    /**
     * Initializes the optional value {@link CapabilityStatement_SearchParam#documentation() documentation} to documentation.
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
     * Initializes the optional value {@link CapabilityStatement_SearchParam#documentation() documentation} to documentation.
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
     * Initializes the optional value {@link CapabilityStatement_SearchParam#id() id} to id.
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
     * Initializes the optional value {@link CapabilityStatement_SearchParam#id() id} to id.
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
     * Builds a new {@link CapabilityStatement_SearchParam CapabilityStatement_SearchParam}.
     * @return An immutable instance of CapabilityStatement_SearchParam
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CapabilityStatement_SearchParam build() {
      return new ImmutableCapabilityStatement_SearchParam(extension, type, modifierExtension, name, definition, documentation, id);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private boolean definitionIsSet() {
      return (optBits & OPT_BIT_DEFINITION) != 0;
    }

    private boolean documentationIsSet() {
      return (optBits & OPT_BIT_DOCUMENTATION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CapabilityStatement_SearchParam is strict, attribute is already set: ".concat(name));
    }
  }
}

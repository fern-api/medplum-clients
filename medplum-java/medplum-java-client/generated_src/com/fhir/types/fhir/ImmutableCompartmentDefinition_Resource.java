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
 * Immutable implementation of {@link CompartmentDefinition_Resource}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableCompartmentDefinition_Resource.builder()}.
 */
@Generated(from = "CompartmentDefinition_Resource", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableCompartmentDefinition_Resource
    implements CompartmentDefinition_Resource {
  private final @Nullable String documentation;
  private final @Nullable Code code;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<String> param;

  private ImmutableCompartmentDefinition_Resource(
      @Nullable String documentation,
      @Nullable Code code,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<String> param) {
    this.documentation = documentation;
    this.code = code;
    this.id = id;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.param = param;
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
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<Code> code() {
    return Optional.ofNullable(code);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code param} attribute
   */
  @JsonProperty("param")
  @Override
  public Optional<List<String>> param() {
    return Optional.ofNullable(param);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition_Resource#documentation() documentation} attribute.
   * @param value The value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition_Resource withDocumentation(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "documentation");
    if (Objects.equals(this.documentation, newValue)) return this;
    return new ImmutableCompartmentDefinition_Resource(newValue, this.code, this.id, this.extension, this.modifierExtension, this.param);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition_Resource#documentation() documentation} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for documentation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition_Resource withDocumentation(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.documentation, value)) return this;
    return new ImmutableCompartmentDefinition_Resource(value, this.code, this.id, this.extension, this.modifierExtension, this.param);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition_Resource#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition_Resource withCode(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableCompartmentDefinition_Resource(this.documentation, newValue, this.id, this.extension, this.modifierExtension, this.param);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition_Resource#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition_Resource withCode(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableCompartmentDefinition_Resource(this.documentation, value, this.id, this.extension, this.modifierExtension, this.param);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition_Resource#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition_Resource withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableCompartmentDefinition_Resource(this.documentation, this.code, newValue, this.extension, this.modifierExtension, this.param);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition_Resource#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition_Resource withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableCompartmentDefinition_Resource(this.documentation, this.code, value, this.extension, this.modifierExtension, this.param);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition_Resource#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition_Resource withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableCompartmentDefinition_Resource(this.documentation, this.code, this.id, newValue, this.modifierExtension, this.param);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition_Resource#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition_Resource withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableCompartmentDefinition_Resource(this.documentation, this.code, this.id, value, this.modifierExtension, this.param);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition_Resource#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition_Resource withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableCompartmentDefinition_Resource(this.documentation, this.code, this.id, this.extension, newValue, this.param);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition_Resource#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition_Resource withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableCompartmentDefinition_Resource(this.documentation, this.code, this.id, this.extension, value, this.param);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link CompartmentDefinition_Resource#param() param} attribute.
   * @param value The value for param
   * @return A modified copy of {@code this} object
   */
  public final ImmutableCompartmentDefinition_Resource withParam(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "param");
    if (this.param == newValue) return this;
    return new ImmutableCompartmentDefinition_Resource(this.documentation, this.code, this.id, this.extension, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link CompartmentDefinition_Resource#param() param} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for param
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableCompartmentDefinition_Resource withParam(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.param == value) return this;
    return new ImmutableCompartmentDefinition_Resource(this.documentation, this.code, this.id, this.extension, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableCompartmentDefinition_Resource} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableCompartmentDefinition_Resource
        && equalTo((ImmutableCompartmentDefinition_Resource) another);
  }

  private boolean equalTo(ImmutableCompartmentDefinition_Resource another) {
    return Objects.equals(documentation, another.documentation)
        && Objects.equals(code, another.code)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(param, another.param);
  }

  /**
   * Computes a hash code from attributes: {@code documentation}, {@code code}, {@code id}, {@code extension}, {@code modifierExtension}, {@code param}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(documentation);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(param);
    return h;
  }

  /**
   * Prints the immutable value {@code CompartmentDefinition_Resource} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("CompartmentDefinition_Resource{");
    if (documentation != null) {
      builder.append("documentation=").append(documentation);
    }
    if (code != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (id != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (param != null) {
      if (builder.length() > 31) builder.append(", ");
      builder.append("param=").append(param);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "CompartmentDefinition_Resource", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements CompartmentDefinition_Resource {
    @Nullable Optional<String> documentation = Optional.empty();
    boolean documentationIsSet;
    @Nullable Optional<Code> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<String>> param = Optional.empty();
    boolean paramIsSet;
    @JsonProperty("documentation")
    public void setDocumentation(Optional<String> documentation) {
      this.documentation = documentation;
      this.documentationIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<Code> code) {
      this.code = code;
      this.codeIsSet = true;
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
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("param")
    public void setParam(Optional<List<String>> param) {
      this.param = param;
      this.paramIsSet = true;
    }
    @Override
    public Optional<String> documentation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> param() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableCompartmentDefinition_Resource fromJson(Json json) {
    ImmutableCompartmentDefinition_Resource.Builder builder = ImmutableCompartmentDefinition_Resource.builder();
    if (json.documentationIsSet) {
      builder.documentation(json.documentation);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.paramIsSet) {
      builder.param(json.param);
    }
    return (ImmutableCompartmentDefinition_Resource) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link CompartmentDefinition_Resource} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable CompartmentDefinition_Resource instance
   */
  public static CompartmentDefinition_Resource copyOf(CompartmentDefinition_Resource instance) {
    if (instance instanceof ImmutableCompartmentDefinition_Resource) {
      return (ImmutableCompartmentDefinition_Resource) instance;
    }
    return ImmutableCompartmentDefinition_Resource.builder()
        .documentation(instance.documentation())
        .code(instance.code())
        .id(instance.id())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .param(instance.param())
        .build();
  }

  /**
   * Creates a builder for {@link CompartmentDefinition_Resource CompartmentDefinition_Resource}.
   * <pre>
   * ImmutableCompartmentDefinition_Resource.builder()
   *    .documentation(String) // optional {@link CompartmentDefinition_Resource#documentation() documentation}
   *    .code(com.fhir.types.fhir.Code) // optional {@link CompartmentDefinition_Resource#code() code}
   *    .id(String) // optional {@link CompartmentDefinition_Resource#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CompartmentDefinition_Resource#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link CompartmentDefinition_Resource#modifierExtension() modifierExtension}
   *    .param(List&amp;lt;String&amp;gt;) // optional {@link CompartmentDefinition_Resource#param() param}
   *    .build();
   * </pre>
   * @return A new CompartmentDefinition_Resource builder
   */
  public static ImmutableCompartmentDefinition_Resource.Builder builder() {
    return new ImmutableCompartmentDefinition_Resource.Builder();
  }

  /**
   * Builds instances of type {@link CompartmentDefinition_Resource CompartmentDefinition_Resource}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "CompartmentDefinition_Resource", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_DOCUMENTATION = 0x1L;
    private static final long OPT_BIT_CODE = 0x2L;
    private static final long OPT_BIT_ID = 0x4L;
    private static final long OPT_BIT_EXTENSION = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private static final long OPT_BIT_PARAM = 0x20L;
    private long optBits;

    private @Nullable String documentation;
    private @Nullable Code code;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<String> param;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition_Resource#documentation() documentation} to documentation.
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
     * Initializes the optional value {@link CompartmentDefinition_Resource#documentation() documentation} to documentation.
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
     * Initializes the optional value {@link CompartmentDefinition_Resource#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for chained invocation
     */
    public final Builder code(Code code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = Objects.requireNonNull(code, "code");
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition_Resource#code() code} to code.
     * @param code The value for code
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("code")
    public final Builder code(Optional<? extends Code> code) {
      checkNotIsSet(codeIsSet(), "code");
      this.code = code.orElse(null);
      optBits |= OPT_BIT_CODE;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition_Resource#id() id} to id.
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
     * Initializes the optional value {@link CompartmentDefinition_Resource#id() id} to id.
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
     * Initializes the optional value {@link CompartmentDefinition_Resource#extension() extension} to extension.
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
     * Initializes the optional value {@link CompartmentDefinition_Resource#extension() extension} to extension.
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
     * Initializes the optional value {@link CompartmentDefinition_Resource#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CompartmentDefinition_Resource#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link CompartmentDefinition_Resource#param() param} to param.
     * @param param The value for param
     * @return {@code this} builder for chained invocation
     */
    public final Builder param(List<String> param) {
      checkNotIsSet(paramIsSet(), "param");
      this.param = Objects.requireNonNull(param, "param");
      optBits |= OPT_BIT_PARAM;
      return this;
    }

    /**
     * Initializes the optional value {@link CompartmentDefinition_Resource#param() param} to param.
     * @param param The value for param
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("param")
    public final Builder param(Optional<? extends List<String>> param) {
      checkNotIsSet(paramIsSet(), "param");
      this.param = param.orElse(null);
      optBits |= OPT_BIT_PARAM;
      return this;
    }

    /**
     * Builds a new {@link CompartmentDefinition_Resource CompartmentDefinition_Resource}.
     * @return An immutable instance of CompartmentDefinition_Resource
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public CompartmentDefinition_Resource build() {
      return new ImmutableCompartmentDefinition_Resource(documentation, code, id, extension, modifierExtension, param);
    }

    private boolean documentationIsSet() {
      return (optBits & OPT_BIT_DOCUMENTATION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean paramIsSet() {
      return (optBits & OPT_BIT_PARAM) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of CompartmentDefinition_Resource is strict, attribute is already set: ".concat(name));
    }
  }
}

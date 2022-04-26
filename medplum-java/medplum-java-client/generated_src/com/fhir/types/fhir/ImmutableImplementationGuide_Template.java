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
 * Immutable implementation of {@link ImplementationGuide_Template}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImplementationGuide_Template.builder()}.
 */
@Generated(from = "ImplementationGuide_Template", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImplementationGuide_Template
    implements ImplementationGuide_Template {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String scope;
  private final @Nullable List<Extension> extension;
  private final @Nullable Code code;
  private final @Nullable String source;
  private final @Nullable String id;

  private ImmutableImplementationGuide_Template(
      @Nullable List<Extension> modifierExtension,
      @Nullable String scope,
      @Nullable List<Extension> extension,
      @Nullable Code code,
      @Nullable String source,
      @Nullable String id) {
    this.modifierExtension = modifierExtension;
    this.scope = scope;
    this.extension = extension;
    this.code = code;
    this.source = source;
    this.id = id;
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
   * @return The value of the {@code scope} attribute
   */
  @JsonProperty("scope")
  @Override
  public Optional<String> scope() {
    return Optional.ofNullable(scope);
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
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<Code> code() {
    return Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code source} attribute
   */
  @JsonProperty("source")
  @Override
  public Optional<String> source() {
    return Optional.ofNullable(source);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Template#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Template withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImplementationGuide_Template(newValue, this.scope, this.extension, this.code, this.source, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Template#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Template withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImplementationGuide_Template(value, this.scope, this.extension, this.code, this.source, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Template#scope() scope} attribute.
   * @param value The value for scope
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Template withScope(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "scope");
    if (Objects.equals(this.scope, newValue)) return this;
    return new ImmutableImplementationGuide_Template(this.modifierExtension, newValue, this.extension, this.code, this.source, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Template#scope() scope} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for scope
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Template withScope(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.scope, value)) return this;
    return new ImmutableImplementationGuide_Template(this.modifierExtension, value, this.extension, this.code, this.source, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Template#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Template withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImplementationGuide_Template(this.modifierExtension, this.scope, newValue, this.code, this.source, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Template#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Template withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImplementationGuide_Template(this.modifierExtension, this.scope, value, this.code, this.source, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Template#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Template withCode(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableImplementationGuide_Template(this.modifierExtension, this.scope, this.extension, newValue, this.source, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Template#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Template withCode(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableImplementationGuide_Template(this.modifierExtension, this.scope, this.extension, value, this.source, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Template#source() source} attribute.
   * @param value The value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Template withSource(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "source");
    if (Objects.equals(this.source, newValue)) return this;
    return new ImmutableImplementationGuide_Template(this.modifierExtension, this.scope, this.extension, this.code, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Template#source() source} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for source
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Template withSource(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.source, value)) return this;
    return new ImmutableImplementationGuide_Template(this.modifierExtension, this.scope, this.extension, this.code, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Template#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Template withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableImplementationGuide_Template(this.modifierExtension, this.scope, this.extension, this.code, this.source, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Template#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Template withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableImplementationGuide_Template(this.modifierExtension, this.scope, this.extension, this.code, this.source, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImplementationGuide_Template} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImplementationGuide_Template
        && equalTo((ImmutableImplementationGuide_Template) another);
  }

  private boolean equalTo(ImmutableImplementationGuide_Template another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(scope, another.scope)
        && Objects.equals(extension, another.extension)
        && Objects.equals(code, another.code)
        && Objects.equals(source, another.source)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code scope}, {@code extension}, {@code code}, {@code source}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(scope);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(source);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code ImplementationGuide_Template} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ImplementationGuide_Template{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (scope != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("scope=").append(scope);
    }
    if (extension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (code != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (source != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("source=").append(source);
    }
    if (id != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ImplementationGuide_Template", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ImplementationGuide_Template {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> scope = Optional.empty();
    boolean scopeIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Code> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<String> source = Optional.empty();
    boolean sourceIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("scope")
    public void setScope(Optional<String> scope) {
      this.scope = scope;
      this.scopeIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<Code> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("source")
    public void setSource(Optional<String> source) {
      this.source = source;
      this.sourceIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> scope() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> source() { throw new UnsupportedOperationException(); }
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
  static ImmutableImplementationGuide_Template fromJson(Json json) {
    ImmutableImplementationGuide_Template.Builder builder = ImmutableImplementationGuide_Template.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.scopeIsSet) {
      builder.scope(json.scope);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.sourceIsSet) {
      builder.source(json.source);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableImplementationGuide_Template) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ImplementationGuide_Template} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ImplementationGuide_Template instance
   */
  public static ImplementationGuide_Template copyOf(ImplementationGuide_Template instance) {
    if (instance instanceof ImmutableImplementationGuide_Template) {
      return (ImmutableImplementationGuide_Template) instance;
    }
    return ImmutableImplementationGuide_Template.builder()
        .modifierExtension(instance.modifierExtension())
        .scope(instance.scope())
        .extension(instance.extension())
        .code(instance.code())
        .source(instance.source())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link ImplementationGuide_Template ImplementationGuide_Template}.
   * <pre>
   * ImmutableImplementationGuide_Template.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ImplementationGuide_Template#modifierExtension() modifierExtension}
   *    .scope(String) // optional {@link ImplementationGuide_Template#scope() scope}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ImplementationGuide_Template#extension() extension}
   *    .code(com.fhir.types.fhir.Code) // optional {@link ImplementationGuide_Template#code() code}
   *    .source(String) // optional {@link ImplementationGuide_Template#source() source}
   *    .id(String) // optional {@link ImplementationGuide_Template#id() id}
   *    .build();
   * </pre>
   * @return A new ImplementationGuide_Template builder
   */
  public static ImmutableImplementationGuide_Template.Builder builder() {
    return new ImmutableImplementationGuide_Template.Builder();
  }

  /**
   * Builds instances of type {@link ImplementationGuide_Template ImplementationGuide_Template}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ImplementationGuide_Template", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_SCOPE = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_CODE = 0x8L;
    private static final long OPT_BIT_SOURCE = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable String scope;
    private @Nullable List<Extension> extension;
    private @Nullable Code code;
    private @Nullable String source;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Template#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImplementationGuide_Template#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImplementationGuide_Template#scope() scope} to scope.
     * @param scope The value for scope
     * @return {@code this} builder for chained invocation
     */
    public final Builder scope(String scope) {
      checkNotIsSet(scopeIsSet(), "scope");
      this.scope = Objects.requireNonNull(scope, "scope");
      optBits |= OPT_BIT_SCOPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Template#scope() scope} to scope.
     * @param scope The value for scope
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("scope")
    public final Builder scope(Optional<String> scope) {
      checkNotIsSet(scopeIsSet(), "scope");
      this.scope = scope.orElse(null);
      optBits |= OPT_BIT_SCOPE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Template#extension() extension} to extension.
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
     * Initializes the optional value {@link ImplementationGuide_Template#extension() extension} to extension.
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
     * Initializes the optional value {@link ImplementationGuide_Template#code() code} to code.
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
     * Initializes the optional value {@link ImplementationGuide_Template#code() code} to code.
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
     * Initializes the optional value {@link ImplementationGuide_Template#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for chained invocation
     */
    public final Builder source(String source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = Objects.requireNonNull(source, "source");
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Template#source() source} to source.
     * @param source The value for source
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("source")
    public final Builder source(Optional<String> source) {
      checkNotIsSet(sourceIsSet(), "source");
      this.source = source.orElse(null);
      optBits |= OPT_BIT_SOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Template#id() id} to id.
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
     * Initializes the optional value {@link ImplementationGuide_Template#id() id} to id.
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
     * Builds a new {@link ImplementationGuide_Template ImplementationGuide_Template}.
     * @return An immutable instance of ImplementationGuide_Template
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImplementationGuide_Template build() {
      return new ImmutableImplementationGuide_Template(modifierExtension, scope, extension, code, source, id);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean scopeIsSet() {
      return (optBits & OPT_BIT_SCOPE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean sourceIsSet() {
      return (optBits & OPT_BIT_SOURCE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ImplementationGuide_Template is strict, attribute is already set: ".concat(name));
    }
  }
}

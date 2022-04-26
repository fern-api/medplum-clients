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
 * Immutable implementation of {@link ConceptMap_Unmapped}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableConceptMap_Unmapped.builder()}.
 */
@Generated(from = "ConceptMap_Unmapped", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableConceptMap_Unmapped implements ConceptMap_Unmapped {
  private final @Nullable Conceptmap_UnmappedMode mode;
  private final @Nullable String id;
  private final @Nullable Code code;
  private final @Nullable String display;
  private final @Nullable Canonical url;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;

  private ImmutableConceptMap_Unmapped(
      @Nullable Conceptmap_UnmappedMode mode,
      @Nullable String id,
      @Nullable Code code,
      @Nullable String display,
      @Nullable Canonical url,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension) {
    this.mode = mode;
    this.id = id;
    this.code = code;
    this.display = display;
    this.url = url;
    this.modifierExtension = modifierExtension;
    this.extension = extension;
  }

  /**
   * @return The value of the {@code mode} attribute
   */
  @JsonProperty("mode")
  @Override
  public Optional<Conceptmap_UnmappedMode> mode() {
    return Optional.ofNullable(mode);
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
   * @return The value of the {@code code} attribute
   */
  @JsonProperty("code")
  @Override
  public Optional<Code> code() {
    return Optional.ofNullable(code);
  }

  /**
   * @return The value of the {@code display} attribute
   */
  @JsonProperty("display")
  @Override
  public Optional<String> display() {
    return Optional.ofNullable(display);
  }

  /**
   * @return The value of the {@code url} attribute
   */
  @JsonProperty("url")
  @Override
  public Optional<Canonical> url() {
    return Optional.ofNullable(url);
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Unmapped#mode() mode} attribute.
   * @param value The value for mode
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Unmapped withMode(Conceptmap_UnmappedMode value) {
    @Nullable Conceptmap_UnmappedMode newValue = Objects.requireNonNull(value, "mode");
    if (this.mode == newValue) return this;
    return new ImmutableConceptMap_Unmapped(newValue, this.id, this.code, this.display, this.url, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Unmapped#mode() mode} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for mode
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_Unmapped withMode(Optional<? extends Conceptmap_UnmappedMode> optional) {
    @Nullable Conceptmap_UnmappedMode value = optional.orElse(null);
    if (this.mode == value) return this;
    return new ImmutableConceptMap_Unmapped(value, this.id, this.code, this.display, this.url, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Unmapped#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Unmapped withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableConceptMap_Unmapped(this.mode, newValue, this.code, this.display, this.url, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Unmapped#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Unmapped withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableConceptMap_Unmapped(this.mode, value, this.code, this.display, this.url, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Unmapped#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Unmapped withCode(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableConceptMap_Unmapped(this.mode, this.id, newValue, this.display, this.url, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Unmapped#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_Unmapped withCode(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableConceptMap_Unmapped(this.mode, this.id, value, this.display, this.url, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Unmapped#display() display} attribute.
   * @param value The value for display
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Unmapped withDisplay(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "display");
    if (Objects.equals(this.display, newValue)) return this;
    return new ImmutableConceptMap_Unmapped(this.mode, this.id, this.code, newValue, this.url, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Unmapped#display() display} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for display
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Unmapped withDisplay(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.display, value)) return this;
    return new ImmutableConceptMap_Unmapped(this.mode, this.id, this.code, value, this.url, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Unmapped#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Unmapped withUrl(Canonical value) {
    @Nullable Canonical newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableConceptMap_Unmapped(this.mode, this.id, this.code, this.display, newValue, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Unmapped#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_Unmapped withUrl(Optional<? extends Canonical> optional) {
    @Nullable Canonical value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableConceptMap_Unmapped(this.mode, this.id, this.code, this.display, value, this.modifierExtension, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Unmapped#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Unmapped withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableConceptMap_Unmapped(this.mode, this.id, this.code, this.display, this.url, newValue, this.extension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Unmapped#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_Unmapped withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableConceptMap_Unmapped(this.mode, this.id, this.code, this.display, this.url, value, this.extension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Unmapped#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Unmapped withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableConceptMap_Unmapped(this.mode, this.id, this.code, this.display, this.url, this.modifierExtension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Unmapped#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_Unmapped withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableConceptMap_Unmapped(this.mode, this.id, this.code, this.display, this.url, this.modifierExtension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableConceptMap_Unmapped} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableConceptMap_Unmapped
        && equalTo((ImmutableConceptMap_Unmapped) another);
  }

  private boolean equalTo(ImmutableConceptMap_Unmapped another) {
    return Objects.equals(mode, another.mode)
        && Objects.equals(id, another.id)
        && Objects.equals(code, another.code)
        && Objects.equals(display, another.display)
        && Objects.equals(url, another.url)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension);
  }

  /**
   * Computes a hash code from attributes: {@code mode}, {@code id}, {@code code}, {@code display}, {@code url}, {@code modifierExtension}, {@code extension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(mode);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(display);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    return h;
  }

  /**
   * Prints the immutable value {@code ConceptMap_Unmapped} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ConceptMap_Unmapped{");
    if (mode != null) {
      builder.append("mode=").append(mode);
    }
    if (id != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (code != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (display != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("display=").append(display);
    }
    if (url != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("url=").append(url);
    }
    if (modifierExtension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 20) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ConceptMap_Unmapped", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ConceptMap_Unmapped {
    @Nullable Optional<Conceptmap_UnmappedMode> mode = Optional.empty();
    boolean modeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Code> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<String> display = Optional.empty();
    boolean displayIsSet;
    @Nullable Optional<Canonical> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @JsonProperty("mode")
    public void setMode(Optional<Conceptmap_UnmappedMode> mode) {
      this.mode = mode;
      this.modeIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("code")
    public void setCode(Optional<Code> code) {
      this.code = code;
      this.codeIsSet = true;
    }
    @JsonProperty("display")
    public void setDisplay(Optional<String> display) {
      this.display = display;
      this.displayIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<Canonical> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @Override
    public Optional<Conceptmap_UnmappedMode> mode() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> display() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Canonical> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableConceptMap_Unmapped fromJson(Json json) {
    ImmutableConceptMap_Unmapped.Builder builder = ImmutableConceptMap_Unmapped.builder();
    if (json.modeIsSet) {
      builder.mode(json.mode);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.displayIsSet) {
      builder.display(json.display);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    return (ImmutableConceptMap_Unmapped) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ConceptMap_Unmapped} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ConceptMap_Unmapped instance
   */
  public static ConceptMap_Unmapped copyOf(ConceptMap_Unmapped instance) {
    if (instance instanceof ImmutableConceptMap_Unmapped) {
      return (ImmutableConceptMap_Unmapped) instance;
    }
    return ImmutableConceptMap_Unmapped.builder()
        .mode(instance.mode())
        .id(instance.id())
        .code(instance.code())
        .display(instance.display())
        .url(instance.url())
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .build();
  }

  /**
   * Creates a builder for {@link ConceptMap_Unmapped ConceptMap_Unmapped}.
   * <pre>
   * ImmutableConceptMap_Unmapped.builder()
   *    .mode(Conceptmap_UnmappedMode) // optional {@link ConceptMap_Unmapped#mode() mode}
   *    .id(String) // optional {@link ConceptMap_Unmapped#id() id}
   *    .code(com.fhir.types.fhir.Code) // optional {@link ConceptMap_Unmapped#code() code}
   *    .display(String) // optional {@link ConceptMap_Unmapped#display() display}
   *    .url(com.fhir.types.fhir.Canonical) // optional {@link ConceptMap_Unmapped#url() url}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ConceptMap_Unmapped#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ConceptMap_Unmapped#extension() extension}
   *    .build();
   * </pre>
   * @return A new ConceptMap_Unmapped builder
   */
  public static ImmutableConceptMap_Unmapped.Builder builder() {
    return new ImmutableConceptMap_Unmapped.Builder();
  }

  /**
   * Builds instances of type {@link ConceptMap_Unmapped ConceptMap_Unmapped}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ConceptMap_Unmapped", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODE = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_CODE = 0x4L;
    private static final long OPT_BIT_DISPLAY = 0x8L;
    private static final long OPT_BIT_URL = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private static final long OPT_BIT_EXTENSION = 0x40L;
    private long optBits;

    private @Nullable Conceptmap_UnmappedMode mode;
    private @Nullable String id;
    private @Nullable Code code;
    private @Nullable String display;
    private @Nullable Canonical url;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ConceptMap_Unmapped#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for chained invocation
     */
    public final Builder mode(Conceptmap_UnmappedMode mode) {
      checkNotIsSet(modeIsSet(), "mode");
      this.mode = Objects.requireNonNull(mode, "mode");
      optBits |= OPT_BIT_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Unmapped#mode() mode} to mode.
     * @param mode The value for mode
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("mode")
    public final Builder mode(Optional<? extends Conceptmap_UnmappedMode> mode) {
      checkNotIsSet(modeIsSet(), "mode");
      this.mode = mode.orElse(null);
      optBits |= OPT_BIT_MODE;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Unmapped#id() id} to id.
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
     * Initializes the optional value {@link ConceptMap_Unmapped#id() id} to id.
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
     * Initializes the optional value {@link ConceptMap_Unmapped#code() code} to code.
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
     * Initializes the optional value {@link ConceptMap_Unmapped#code() code} to code.
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
     * Initializes the optional value {@link ConceptMap_Unmapped#display() display} to display.
     * @param display The value for display
     * @return {@code this} builder for chained invocation
     */
    public final Builder display(String display) {
      checkNotIsSet(displayIsSet(), "display");
      this.display = Objects.requireNonNull(display, "display");
      optBits |= OPT_BIT_DISPLAY;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Unmapped#display() display} to display.
     * @param display The value for display
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("display")
    public final Builder display(Optional<String> display) {
      checkNotIsSet(displayIsSet(), "display");
      this.display = display.orElse(null);
      optBits |= OPT_BIT_DISPLAY;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Unmapped#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    public final Builder url(Canonical url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = Objects.requireNonNull(url, "url");
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Unmapped#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("url")
    public final Builder url(Optional<? extends Canonical> url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = url.orElse(null);
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Unmapped#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ConceptMap_Unmapped#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ConceptMap_Unmapped#extension() extension} to extension.
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
     * Initializes the optional value {@link ConceptMap_Unmapped#extension() extension} to extension.
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
     * Builds a new {@link ConceptMap_Unmapped ConceptMap_Unmapped}.
     * @return An immutable instance of ConceptMap_Unmapped
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ConceptMap_Unmapped build() {
      return new ImmutableConceptMap_Unmapped(mode, id, code, display, url, modifierExtension, extension);
    }

    private boolean modeIsSet() {
      return (optBits & OPT_BIT_MODE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean displayIsSet() {
      return (optBits & OPT_BIT_DISPLAY) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ConceptMap_Unmapped is strict, attribute is already set: ".concat(name));
    }
  }
}

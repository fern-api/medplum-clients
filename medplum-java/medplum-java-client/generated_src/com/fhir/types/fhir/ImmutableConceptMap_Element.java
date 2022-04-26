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
 * Immutable implementation of {@link ConceptMap_Element}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableConceptMap_Element.builder()}.
 */
@Generated(from = "ConceptMap_Element", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableConceptMap_Element implements ConceptMap_Element {
  private final @Nullable List<ConceptMap_Target> target;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable Code code;
  private final @Nullable String display;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableConceptMap_Element(
      @Nullable List<ConceptMap_Target> target,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable Code code,
      @Nullable String display,
      @Nullable List<Extension> modifierExtension) {
    this.target = target;
    this.id = id;
    this.extension = extension;
    this.code = code;
    this.display = display;
    this.modifierExtension = modifierExtension;
  }

  /**
   * @return The value of the {@code target} attribute
   */
  @JsonProperty("target")
  @Override
  public Optional<List<ConceptMap_Target>> target() {
    return Optional.ofNullable(target);
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Element#target() target} attribute.
   * @param value The value for target
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Element withTarget(List<ConceptMap_Target> value) {
    @Nullable List<ConceptMap_Target> newValue = Objects.requireNonNull(value, "target");
    if (this.target == newValue) return this;
    return new ImmutableConceptMap_Element(newValue, this.id, this.extension, this.code, this.display, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Element#target() target} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for target
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_Element withTarget(Optional<? extends List<ConceptMap_Target>> optional) {
    @Nullable List<ConceptMap_Target> value = optional.orElse(null);
    if (this.target == value) return this;
    return new ImmutableConceptMap_Element(value, this.id, this.extension, this.code, this.display, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Element#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Element withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableConceptMap_Element(this.target, newValue, this.extension, this.code, this.display, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Element#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Element withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableConceptMap_Element(this.target, value, this.extension, this.code, this.display, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Element#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Element withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableConceptMap_Element(this.target, this.id, newValue, this.code, this.display, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Element#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_Element withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableConceptMap_Element(this.target, this.id, value, this.code, this.display, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Element#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Element withCode(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableConceptMap_Element(this.target, this.id, this.extension, newValue, this.display, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Element#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_Element withCode(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableConceptMap_Element(this.target, this.id, this.extension, value, this.display, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Element#display() display} attribute.
   * @param value The value for display
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Element withDisplay(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "display");
    if (Objects.equals(this.display, newValue)) return this;
    return new ImmutableConceptMap_Element(this.target, this.id, this.extension, this.code, newValue, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Element#display() display} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for display
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Element withDisplay(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.display, value)) return this;
    return new ImmutableConceptMap_Element(this.target, this.id, this.extension, this.code, value, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ConceptMap_Element#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConceptMap_Element withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableConceptMap_Element(this.target, this.id, this.extension, this.code, this.display, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ConceptMap_Element#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConceptMap_Element withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableConceptMap_Element(this.target, this.id, this.extension, this.code, this.display, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableConceptMap_Element} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableConceptMap_Element
        && equalTo((ImmutableConceptMap_Element) another);
  }

  private boolean equalTo(ImmutableConceptMap_Element another) {
    return Objects.equals(target, another.target)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(code, another.code)
        && Objects.equals(display, another.display)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code target}, {@code id}, {@code extension}, {@code code}, {@code display}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(target);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(display);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code ConceptMap_Element} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ConceptMap_Element{");
    if (target != null) {
      builder.append("target=").append(target);
    }
    if (id != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (code != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (display != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("display=").append(display);
    }
    if (modifierExtension != null) {
      if (builder.length() > 19) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ConceptMap_Element", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ConceptMap_Element {
    @Nullable Optional<List<ConceptMap_Target>> target = Optional.empty();
    boolean targetIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Code> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<String> display = Optional.empty();
    boolean displayIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("target")
    public void setTarget(Optional<List<ConceptMap_Target>> target) {
      this.target = target;
      this.targetIsSet = true;
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
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<List<ConceptMap_Target>> target() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> code() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> display() { throw new UnsupportedOperationException(); }
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
  static ImmutableConceptMap_Element fromJson(Json json) {
    ImmutableConceptMap_Element.Builder builder = ImmutableConceptMap_Element.builder();
    if (json.targetIsSet) {
      builder.target(json.target);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.displayIsSet) {
      builder.display(json.display);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableConceptMap_Element) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ConceptMap_Element} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ConceptMap_Element instance
   */
  public static ConceptMap_Element copyOf(ConceptMap_Element instance) {
    if (instance instanceof ImmutableConceptMap_Element) {
      return (ImmutableConceptMap_Element) instance;
    }
    return ImmutableConceptMap_Element.builder()
        .target(instance.target())
        .id(instance.id())
        .extension(instance.extension())
        .code(instance.code())
        .display(instance.display())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link ConceptMap_Element ConceptMap_Element}.
   * <pre>
   * ImmutableConceptMap_Element.builder()
   *    .target(List&amp;lt;com.fhir.types.fhir.ConceptMap_Target&amp;gt;) // optional {@link ConceptMap_Element#target() target}
   *    .id(String) // optional {@link ConceptMap_Element#id() id}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ConceptMap_Element#extension() extension}
   *    .code(com.fhir.types.fhir.Code) // optional {@link ConceptMap_Element#code() code}
   *    .display(String) // optional {@link ConceptMap_Element#display() display}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ConceptMap_Element#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new ConceptMap_Element builder
   */
  public static ImmutableConceptMap_Element.Builder builder() {
    return new ImmutableConceptMap_Element.Builder();
  }

  /**
   * Builds instances of type {@link ConceptMap_Element ConceptMap_Element}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ConceptMap_Element", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_TARGET = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_CODE = 0x8L;
    private static final long OPT_BIT_DISPLAY = 0x10L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x20L;
    private long optBits;

    private @Nullable List<ConceptMap_Target> target;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable Code code;
    private @Nullable String display;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ConceptMap_Element#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for chained invocation
     */
    public final Builder target(List<ConceptMap_Target> target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = Objects.requireNonNull(target, "target");
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Element#target() target} to target.
     * @param target The value for target
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("target")
    public final Builder target(Optional<? extends List<ConceptMap_Target>> target) {
      checkNotIsSet(targetIsSet(), "target");
      this.target = target.orElse(null);
      optBits |= OPT_BIT_TARGET;
      return this;
    }

    /**
     * Initializes the optional value {@link ConceptMap_Element#id() id} to id.
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
     * Initializes the optional value {@link ConceptMap_Element#id() id} to id.
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
     * Initializes the optional value {@link ConceptMap_Element#extension() extension} to extension.
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
     * Initializes the optional value {@link ConceptMap_Element#extension() extension} to extension.
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
     * Initializes the optional value {@link ConceptMap_Element#code() code} to code.
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
     * Initializes the optional value {@link ConceptMap_Element#code() code} to code.
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
     * Initializes the optional value {@link ConceptMap_Element#display() display} to display.
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
     * Initializes the optional value {@link ConceptMap_Element#display() display} to display.
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
     * Initializes the optional value {@link ConceptMap_Element#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ConceptMap_Element#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link ConceptMap_Element ConceptMap_Element}.
     * @return An immutable instance of ConceptMap_Element
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ConceptMap_Element build() {
      return new ImmutableConceptMap_Element(target, id, extension, code, display, modifierExtension);
    }

    private boolean targetIsSet() {
      return (optBits & OPT_BIT_TARGET) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean displayIsSet() {
      return (optBits & OPT_BIT_DISPLAY) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ConceptMap_Element is strict, attribute is already set: ".concat(name));
    }
  }
}

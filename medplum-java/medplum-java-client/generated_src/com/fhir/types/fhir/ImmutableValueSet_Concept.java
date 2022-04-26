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
 * Immutable implementation of {@link ValueSet_Concept}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableValueSet_Concept.builder()}.
 */
@Generated(from = "ValueSet_Concept", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableValueSet_Concept implements ValueSet_Concept {
  private final @Nullable List<Extension> extension;
  private final @Nullable String display;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<ValueSet_Designation> designation;
  private final @Nullable Code code;
  private final @Nullable String id;

  private ImmutableValueSet_Concept(
      @Nullable List<Extension> extension,
      @Nullable String display,
      @Nullable List<Extension> modifierExtension,
      @Nullable List<ValueSet_Designation> designation,
      @Nullable Code code,
      @Nullable String id) {
    this.extension = extension;
    this.display = display;
    this.modifierExtension = modifierExtension;
    this.designation = designation;
    this.code = code;
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
   * @return The value of the {@code designation} attribute
   */
  @JsonProperty("designation")
  @Override
  public Optional<List<ValueSet_Designation>> designation() {
    return Optional.ofNullable(designation);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Concept#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Concept withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableValueSet_Concept(newValue, this.display, this.modifierExtension, this.designation, this.code, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Concept#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Concept withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableValueSet_Concept(value, this.display, this.modifierExtension, this.designation, this.code, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Concept#display() display} attribute.
   * @param value The value for display
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Concept withDisplay(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "display");
    if (Objects.equals(this.display, newValue)) return this;
    return new ImmutableValueSet_Concept(this.extension, newValue, this.modifierExtension, this.designation, this.code, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Concept#display() display} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for display
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Concept withDisplay(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.display, value)) return this;
    return new ImmutableValueSet_Concept(this.extension, value, this.modifierExtension, this.designation, this.code, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Concept#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Concept withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableValueSet_Concept(this.extension, this.display, newValue, this.designation, this.code, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Concept#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Concept withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableValueSet_Concept(this.extension, this.display, value, this.designation, this.code, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Concept#designation() designation} attribute.
   * @param value The value for designation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Concept withDesignation(List<ValueSet_Designation> value) {
    @Nullable List<ValueSet_Designation> newValue = Objects.requireNonNull(value, "designation");
    if (this.designation == newValue) return this;
    return new ImmutableValueSet_Concept(this.extension, this.display, this.modifierExtension, newValue, this.code, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Concept#designation() designation} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for designation
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Concept withDesignation(Optional<? extends List<ValueSet_Designation>> optional) {
    @Nullable List<ValueSet_Designation> value = optional.orElse(null);
    if (this.designation == value) return this;
    return new ImmutableValueSet_Concept(this.extension, this.display, this.modifierExtension, value, this.code, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Concept#code() code} attribute.
   * @param value The value for code
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Concept withCode(Code value) {
    @Nullable Code newValue = Objects.requireNonNull(value, "code");
    if (this.code == newValue) return this;
    return new ImmutableValueSet_Concept(this.extension, this.display, this.modifierExtension, this.designation, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Concept#code() code} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for code
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableValueSet_Concept withCode(Optional<? extends Code> optional) {
    @Nullable Code value = optional.orElse(null);
    if (this.code == value) return this;
    return new ImmutableValueSet_Concept(this.extension, this.display, this.modifierExtension, this.designation, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ValueSet_Concept#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Concept withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableValueSet_Concept(this.extension, this.display, this.modifierExtension, this.designation, this.code, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ValueSet_Concept#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableValueSet_Concept withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableValueSet_Concept(this.extension, this.display, this.modifierExtension, this.designation, this.code, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableValueSet_Concept} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableValueSet_Concept
        && equalTo((ImmutableValueSet_Concept) another);
  }

  private boolean equalTo(ImmutableValueSet_Concept another) {
    return Objects.equals(extension, another.extension)
        && Objects.equals(display, another.display)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(designation, another.designation)
        && Objects.equals(code, another.code)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code extension}, {@code display}, {@code modifierExtension}, {@code designation}, {@code code}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(display);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(designation);
    h += (h << 5) + Objects.hashCode(code);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code ValueSet_Concept} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ValueSet_Concept{");
    if (extension != null) {
      builder.append("extension=").append(extension);
    }
    if (display != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("display=").append(display);
    }
    if (modifierExtension != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (designation != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("designation=").append(designation);
    }
    if (code != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("code=").append(code);
    }
    if (id != null) {
      if (builder.length() > 17) builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ValueSet_Concept", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ValueSet_Concept {
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> display = Optional.empty();
    boolean displayIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<ValueSet_Designation>> designation = Optional.empty();
    boolean designationIsSet;
    @Nullable Optional<Code> code = Optional.empty();
    boolean codeIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
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
    @JsonProperty("designation")
    public void setDesignation(Optional<List<ValueSet_Designation>> designation) {
      this.designation = designation;
      this.designationIsSet = true;
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
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> display() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<ValueSet_Designation>> designation() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Code> code() { throw new UnsupportedOperationException(); }
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
  static ImmutableValueSet_Concept fromJson(Json json) {
    ImmutableValueSet_Concept.Builder builder = ImmutableValueSet_Concept.builder();
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.displayIsSet) {
      builder.display(json.display);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.designationIsSet) {
      builder.designation(json.designation);
    }
    if (json.codeIsSet) {
      builder.code(json.code);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableValueSet_Concept) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ValueSet_Concept} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ValueSet_Concept instance
   */
  public static ValueSet_Concept copyOf(ValueSet_Concept instance) {
    if (instance instanceof ImmutableValueSet_Concept) {
      return (ImmutableValueSet_Concept) instance;
    }
    return ImmutableValueSet_Concept.builder()
        .extension(instance.extension())
        .display(instance.display())
        .modifierExtension(instance.modifierExtension())
        .designation(instance.designation())
        .code(instance.code())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link ValueSet_Concept ValueSet_Concept}.
   * <pre>
   * ImmutableValueSet_Concept.builder()
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ValueSet_Concept#extension() extension}
   *    .display(String) // optional {@link ValueSet_Concept#display() display}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ValueSet_Concept#modifierExtension() modifierExtension}
   *    .designation(List&amp;lt;com.fhir.types.fhir.ValueSet_Designation&amp;gt;) // optional {@link ValueSet_Concept#designation() designation}
   *    .code(com.fhir.types.fhir.Code) // optional {@link ValueSet_Concept#code() code}
   *    .id(String) // optional {@link ValueSet_Concept#id() id}
   *    .build();
   * </pre>
   * @return A new ValueSet_Concept builder
   */
  public static ImmutableValueSet_Concept.Builder builder() {
    return new ImmutableValueSet_Concept.Builder();
  }

  /**
   * Builds instances of type {@link ValueSet_Concept ValueSet_Concept}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ValueSet_Concept", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_EXTENSION = 0x1L;
    private static final long OPT_BIT_DISPLAY = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_DESIGNATION = 0x8L;
    private static final long OPT_BIT_CODE = 0x10L;
    private static final long OPT_BIT_ID = 0x20L;
    private long optBits;

    private @Nullable List<Extension> extension;
    private @Nullable String display;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<ValueSet_Designation> designation;
    private @Nullable Code code;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ValueSet_Concept#extension() extension} to extension.
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
     * Initializes the optional value {@link ValueSet_Concept#extension() extension} to extension.
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
     * Initializes the optional value {@link ValueSet_Concept#display() display} to display.
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
     * Initializes the optional value {@link ValueSet_Concept#display() display} to display.
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
     * Initializes the optional value {@link ValueSet_Concept#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ValueSet_Concept#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ValueSet_Concept#designation() designation} to designation.
     * @param designation The value for designation
     * @return {@code this} builder for chained invocation
     */
    public final Builder designation(List<ValueSet_Designation> designation) {
      checkNotIsSet(designationIsSet(), "designation");
      this.designation = Objects.requireNonNull(designation, "designation");
      optBits |= OPT_BIT_DESIGNATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Concept#designation() designation} to designation.
     * @param designation The value for designation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("designation")
    public final Builder designation(Optional<? extends List<ValueSet_Designation>> designation) {
      checkNotIsSet(designationIsSet(), "designation");
      this.designation = designation.orElse(null);
      optBits |= OPT_BIT_DESIGNATION;
      return this;
    }

    /**
     * Initializes the optional value {@link ValueSet_Concept#code() code} to code.
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
     * Initializes the optional value {@link ValueSet_Concept#code() code} to code.
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
     * Initializes the optional value {@link ValueSet_Concept#id() id} to id.
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
     * Initializes the optional value {@link ValueSet_Concept#id() id} to id.
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
     * Builds a new {@link ValueSet_Concept ValueSet_Concept}.
     * @return An immutable instance of ValueSet_Concept
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ValueSet_Concept build() {
      return new ImmutableValueSet_Concept(extension, display, modifierExtension, designation, code, id);
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean displayIsSet() {
      return (optBits & OPT_BIT_DISPLAY) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean designationIsSet() {
      return (optBits & OPT_BIT_DESIGNATION) != 0;
    }

    private boolean codeIsSet() {
      return (optBits & OPT_BIT_CODE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ValueSet_Concept is strict, attribute is already set: ".concat(name));
    }
  }
}

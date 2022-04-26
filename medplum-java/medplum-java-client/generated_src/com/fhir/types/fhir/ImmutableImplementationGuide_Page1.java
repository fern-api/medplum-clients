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
 * Immutable implementation of {@link ImplementationGuide_Page1}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableImplementationGuide_Page1.builder()}.
 */
@Generated(from = "ImplementationGuide_Page1", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableImplementationGuide_Page1 implements ImplementationGuide_Page1 {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<String> anchor;
  private final @Nullable String title;
  private final @Nullable String id;
  private final @Nullable String name;

  private ImmutableImplementationGuide_Page1(
      @Nullable List<Extension> modifierExtension,
      @Nullable List<Extension> extension,
      @Nullable List<String> anchor,
      @Nullable String title,
      @Nullable String id,
      @Nullable String name) {
    this.modifierExtension = modifierExtension;
    this.extension = extension;
    this.anchor = anchor;
    this.title = title;
    this.id = id;
    this.name = name;
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
   * @return The value of the {@code anchor} attribute
   */
  @JsonProperty("anchor")
  @Override
  public Optional<List<String>> anchor() {
    return Optional.ofNullable(anchor);
  }

  /**
   * @return The value of the {@code title} attribute
   */
  @JsonProperty("title")
  @Override
  public Optional<String> title() {
    return Optional.ofNullable(title);
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
   * @return The value of the {@code name} attribute
   */
  @JsonProperty("name")
  @Override
  public Optional<String> name() {
    return Optional.ofNullable(name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Page1#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Page1 withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableImplementationGuide_Page1(newValue, this.extension, this.anchor, this.title, this.id, this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Page1#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Page1 withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableImplementationGuide_Page1(value, this.extension, this.anchor, this.title, this.id, this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Page1#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Page1 withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableImplementationGuide_Page1(this.modifierExtension, newValue, this.anchor, this.title, this.id, this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Page1#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Page1 withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableImplementationGuide_Page1(this.modifierExtension, value, this.anchor, this.title, this.id, this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Page1#anchor() anchor} attribute.
   * @param value The value for anchor
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Page1 withAnchor(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "anchor");
    if (this.anchor == newValue) return this;
    return new ImmutableImplementationGuide_Page1(this.modifierExtension, this.extension, newValue, this.title, this.id, this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Page1#anchor() anchor} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for anchor
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableImplementationGuide_Page1 withAnchor(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.anchor == value) return this;
    return new ImmutableImplementationGuide_Page1(this.modifierExtension, this.extension, value, this.title, this.id, this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Page1#title() title} attribute.
   * @param value The value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Page1 withTitle(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "title");
    if (Objects.equals(this.title, newValue)) return this;
    return new ImmutableImplementationGuide_Page1(this.modifierExtension, this.extension, this.anchor, newValue, this.id, this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Page1#title() title} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for title
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Page1 withTitle(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.title, value)) return this;
    return new ImmutableImplementationGuide_Page1(this.modifierExtension, this.extension, this.anchor, value, this.id, this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Page1#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Page1 withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableImplementationGuide_Page1(this.modifierExtension, this.extension, this.anchor, this.title, newValue, this.name);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Page1#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Page1 withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableImplementationGuide_Page1(this.modifierExtension, this.extension, this.anchor, this.title, value, this.name);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link ImplementationGuide_Page1#name() name} attribute.
   * @param value The value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Page1 withName(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "name");
    if (Objects.equals(this.name, newValue)) return this;
    return new ImmutableImplementationGuide_Page1(this.modifierExtension, this.extension, this.anchor, this.title, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link ImplementationGuide_Page1#name() name} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for name
   * @return A modified copy of {@code this} object
   */
  public final ImmutableImplementationGuide_Page1 withName(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.name, value)) return this;
    return new ImmutableImplementationGuide_Page1(this.modifierExtension, this.extension, this.anchor, this.title, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableImplementationGuide_Page1} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableImplementationGuide_Page1
        && equalTo((ImmutableImplementationGuide_Page1) another);
  }

  private boolean equalTo(ImmutableImplementationGuide_Page1 another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(extension, another.extension)
        && Objects.equals(anchor, another.anchor)
        && Objects.equals(title, another.title)
        && Objects.equals(id, another.id)
        && Objects.equals(name, another.name);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code extension}, {@code anchor}, {@code title}, {@code id}, {@code name}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(anchor);
    h += (h << 5) + Objects.hashCode(title);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(name);
    return h;
  }

  /**
   * Prints the immutable value {@code ImplementationGuide_Page1} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("ImplementationGuide_Page1{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (extension != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (anchor != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("anchor=").append(anchor);
    }
    if (title != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("title=").append(title);
    }
    if (id != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (name != null) {
      if (builder.length() > 26) builder.append(", ");
      builder.append("name=").append(name);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "ImplementationGuide_Page1", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements ImplementationGuide_Page1 {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<String>> anchor = Optional.empty();
    boolean anchorIsSet;
    @Nullable Optional<String> title = Optional.empty();
    boolean titleIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<String> name = Optional.empty();
    boolean nameIsSet;
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
    @JsonProperty("anchor")
    public void setAnchor(Optional<List<String>> anchor) {
      this.anchor = anchor;
      this.anchorIsSet = true;
    }
    @JsonProperty("title")
    public void setTitle(Optional<String> title) {
      this.title = title;
      this.titleIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("name")
    public void setName(Optional<String> name) {
      this.name = name;
      this.nameIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> anchor() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> title() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> name() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableImplementationGuide_Page1 fromJson(Json json) {
    ImmutableImplementationGuide_Page1.Builder builder = ImmutableImplementationGuide_Page1.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.anchorIsSet) {
      builder.anchor(json.anchor);
    }
    if (json.titleIsSet) {
      builder.title(json.title);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.nameIsSet) {
      builder.name(json.name);
    }
    return (ImmutableImplementationGuide_Page1) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link ImplementationGuide_Page1} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable ImplementationGuide_Page1 instance
   */
  public static ImplementationGuide_Page1 copyOf(ImplementationGuide_Page1 instance) {
    if (instance instanceof ImmutableImplementationGuide_Page1) {
      return (ImmutableImplementationGuide_Page1) instance;
    }
    return ImmutableImplementationGuide_Page1.builder()
        .modifierExtension(instance.modifierExtension())
        .extension(instance.extension())
        .anchor(instance.anchor())
        .title(instance.title())
        .id(instance.id())
        .name(instance.name())
        .build();
  }

  /**
   * Creates a builder for {@link ImplementationGuide_Page1 ImplementationGuide_Page1}.
   * <pre>
   * ImmutableImplementationGuide_Page1.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ImplementationGuide_Page1#modifierExtension() modifierExtension}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link ImplementationGuide_Page1#extension() extension}
   *    .anchor(List&amp;lt;String&amp;gt;) // optional {@link ImplementationGuide_Page1#anchor() anchor}
   *    .title(String) // optional {@link ImplementationGuide_Page1#title() title}
   *    .id(String) // optional {@link ImplementationGuide_Page1#id() id}
   *    .name(String) // optional {@link ImplementationGuide_Page1#name() name}
   *    .build();
   * </pre>
   * @return A new ImplementationGuide_Page1 builder
   */
  public static ImmutableImplementationGuide_Page1.Builder builder() {
    return new ImmutableImplementationGuide_Page1.Builder();
  }

  /**
   * Builds instances of type {@link ImplementationGuide_Page1 ImplementationGuide_Page1}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "ImplementationGuide_Page1", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_ANCHOR = 0x4L;
    private static final long OPT_BIT_TITLE = 0x8L;
    private static final long OPT_BIT_ID = 0x10L;
    private static final long OPT_BIT_NAME = 0x20L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable List<Extension> extension;
    private @Nullable List<String> anchor;
    private @Nullable String title;
    private @Nullable String id;
    private @Nullable String name;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Page1#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImplementationGuide_Page1#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link ImplementationGuide_Page1#extension() extension} to extension.
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
     * Initializes the optional value {@link ImplementationGuide_Page1#extension() extension} to extension.
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
     * Initializes the optional value {@link ImplementationGuide_Page1#anchor() anchor} to anchor.
     * @param anchor The value for anchor
     * @return {@code this} builder for chained invocation
     */
    public final Builder anchor(List<String> anchor) {
      checkNotIsSet(anchorIsSet(), "anchor");
      this.anchor = Objects.requireNonNull(anchor, "anchor");
      optBits |= OPT_BIT_ANCHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Page1#anchor() anchor} to anchor.
     * @param anchor The value for anchor
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("anchor")
    public final Builder anchor(Optional<? extends List<String>> anchor) {
      checkNotIsSet(anchorIsSet(), "anchor");
      this.anchor = anchor.orElse(null);
      optBits |= OPT_BIT_ANCHOR;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Page1#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for chained invocation
     */
    public final Builder title(String title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = Objects.requireNonNull(title, "title");
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Page1#title() title} to title.
     * @param title The value for title
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("title")
    public final Builder title(Optional<String> title) {
      checkNotIsSet(titleIsSet(), "title");
      this.title = title.orElse(null);
      optBits |= OPT_BIT_TITLE;
      return this;
    }

    /**
     * Initializes the optional value {@link ImplementationGuide_Page1#id() id} to id.
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
     * Initializes the optional value {@link ImplementationGuide_Page1#id() id} to id.
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
     * Initializes the optional value {@link ImplementationGuide_Page1#name() name} to name.
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
     * Initializes the optional value {@link ImplementationGuide_Page1#name() name} to name.
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
     * Builds a new {@link ImplementationGuide_Page1 ImplementationGuide_Page1}.
     * @return An immutable instance of ImplementationGuide_Page1
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public ImplementationGuide_Page1 build() {
      return new ImmutableImplementationGuide_Page1(modifierExtension, extension, anchor, title, id, name);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean anchorIsSet() {
      return (optBits & OPT_BIT_ANCHOR) != 0;
    }

    private boolean titleIsSet() {
      return (optBits & OPT_BIT_TITLE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean nameIsSet() {
      return (optBits & OPT_BIT_NAME) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of ImplementationGuide_Page1 is strict, attribute is already set: ".concat(name));
    }
  }
}

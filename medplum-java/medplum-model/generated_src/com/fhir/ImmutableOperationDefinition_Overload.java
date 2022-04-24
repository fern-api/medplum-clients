package com.fhir;

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
 * Immutable implementation of {@link OperationDefinition_Overload}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableOperationDefinition_Overload.builder()}.
 */
@Generated(from = "OperationDefinition_Overload", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableOperationDefinition_Overload implements OperationDefinition_Overload {
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String comment;
  private final @Nullable List<String> parameterName;

  private ImmutableOperationDefinition_Overload(
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable String comment,
      @Nullable List<String> parameterName) {
    this.id = id;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.comment = comment;
    this.parameterName = parameterName;
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
   * @return The value of the {@code comment} attribute
   */
  @JsonProperty("comment")
  @Override
  public Optional<String> comment() {
    return Optional.ofNullable(comment);
  }

  /**
   * @return The value of the {@code parameterName} attribute
   */
  @JsonProperty("parameterName")
  @Override
  public Optional<List<String>> parameterName() {
    return Optional.ofNullable(parameterName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Overload#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Overload withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableOperationDefinition_Overload(newValue, this.extension, this.modifierExtension, this.comment, this.parameterName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Overload#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Overload withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableOperationDefinition_Overload(value, this.extension, this.modifierExtension, this.comment, this.parameterName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Overload#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Overload withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableOperationDefinition_Overload(this.id, newValue, this.modifierExtension, this.comment, this.parameterName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Overload#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition_Overload withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableOperationDefinition_Overload(this.id, value, this.modifierExtension, this.comment, this.parameterName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Overload#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Overload withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableOperationDefinition_Overload(this.id, this.extension, newValue, this.comment, this.parameterName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Overload#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition_Overload withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableOperationDefinition_Overload(this.id, this.extension, value, this.comment, this.parameterName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Overload#comment() comment} attribute.
   * @param value The value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Overload withComment(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "comment");
    if (Objects.equals(this.comment, newValue)) return this;
    return new ImmutableOperationDefinition_Overload(this.id, this.extension, this.modifierExtension, newValue, this.parameterName);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Overload#comment() comment} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Overload withComment(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.comment, value)) return this;
    return new ImmutableOperationDefinition_Overload(this.id, this.extension, this.modifierExtension, value, this.parameterName);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link OperationDefinition_Overload#parameterName() parameterName} attribute.
   * @param value The value for parameterName
   * @return A modified copy of {@code this} object
   */
  public final ImmutableOperationDefinition_Overload withParameterName(List<String> value) {
    @Nullable List<String> newValue = Objects.requireNonNull(value, "parameterName");
    if (this.parameterName == newValue) return this;
    return new ImmutableOperationDefinition_Overload(this.id, this.extension, this.modifierExtension, this.comment, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link OperationDefinition_Overload#parameterName() parameterName} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for parameterName
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableOperationDefinition_Overload withParameterName(Optional<? extends List<String>> optional) {
    @Nullable List<String> value = optional.orElse(null);
    if (this.parameterName == value) return this;
    return new ImmutableOperationDefinition_Overload(this.id, this.extension, this.modifierExtension, this.comment, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableOperationDefinition_Overload} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableOperationDefinition_Overload
        && equalTo((ImmutableOperationDefinition_Overload) another);
  }

  private boolean equalTo(ImmutableOperationDefinition_Overload another) {
    return Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(comment, another.comment)
        && Objects.equals(parameterName, another.parameterName);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code extension}, {@code modifierExtension}, {@code comment}, {@code parameterName}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(comment);
    h += (h << 5) + Objects.hashCode(parameterName);
    return h;
  }

  /**
   * Prints the immutable value {@code OperationDefinition_Overload} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("OperationDefinition_Overload{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (comment != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("comment=").append(comment);
    }
    if (parameterName != null) {
      if (builder.length() > 29) builder.append(", ");
      builder.append("parameterName=").append(parameterName);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "OperationDefinition_Overload", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements OperationDefinition_Overload {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> comment = Optional.empty();
    boolean commentIsSet;
    @Nullable Optional<List<String>> parameterName = Optional.empty();
    boolean parameterNameIsSet;
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
    @JsonProperty("comment")
    public void setComment(Optional<String> comment) {
      this.comment = comment;
      this.commentIsSet = true;
    }
    @JsonProperty("parameterName")
    public void setParameterName(Optional<List<String>> parameterName) {
      this.parameterName = parameterName;
      this.parameterNameIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> comment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<String>> parameterName() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableOperationDefinition_Overload fromJson(Json json) {
    ImmutableOperationDefinition_Overload.Builder builder = ImmutableOperationDefinition_Overload.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.commentIsSet) {
      builder.comment(json.comment);
    }
    if (json.parameterNameIsSet) {
      builder.parameterName(json.parameterName);
    }
    return (ImmutableOperationDefinition_Overload) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link OperationDefinition_Overload} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable OperationDefinition_Overload instance
   */
  public static OperationDefinition_Overload copyOf(OperationDefinition_Overload instance) {
    if (instance instanceof ImmutableOperationDefinition_Overload) {
      return (ImmutableOperationDefinition_Overload) instance;
    }
    return ImmutableOperationDefinition_Overload.builder()
        .id(instance.id())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .comment(instance.comment())
        .parameterName(instance.parameterName())
        .build();
  }

  /**
   * Creates a builder for {@link OperationDefinition_Overload OperationDefinition_Overload}.
   * <pre>
   * ImmutableOperationDefinition_Overload.builder()
   *    .id(String) // optional {@link OperationDefinition_Overload#id() id}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link OperationDefinition_Overload#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link OperationDefinition_Overload#modifierExtension() modifierExtension}
   *    .comment(String) // optional {@link OperationDefinition_Overload#comment() comment}
   *    .parameterName(List&amp;lt;String&amp;gt;) // optional {@link OperationDefinition_Overload#parameterName() parameterName}
   *    .build();
   * </pre>
   * @return A new OperationDefinition_Overload builder
   */
  public static ImmutableOperationDefinition_Overload.Builder builder() {
    return new ImmutableOperationDefinition_Overload.Builder();
  }

  /**
   * Builds instances of type {@link OperationDefinition_Overload OperationDefinition_Overload}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "OperationDefinition_Overload", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_COMMENT = 0x8L;
    private static final long OPT_BIT_PARAMETER_NAME = 0x10L;
    private long optBits;

    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String comment;
    private @Nullable List<String> parameterName;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Overload#id() id} to id.
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
     * Initializes the optional value {@link OperationDefinition_Overload#id() id} to id.
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
     * Initializes the optional value {@link OperationDefinition_Overload#extension() extension} to extension.
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
     * Initializes the optional value {@link OperationDefinition_Overload#extension() extension} to extension.
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
     * Initializes the optional value {@link OperationDefinition_Overload#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link OperationDefinition_Overload#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link OperationDefinition_Overload#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    public final Builder comment(String comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = Objects.requireNonNull(comment, "comment");
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Overload#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("comment")
    public final Builder comment(Optional<String> comment) {
      checkNotIsSet(commentIsSet(), "comment");
      this.comment = comment.orElse(null);
      optBits |= OPT_BIT_COMMENT;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Overload#parameterName() parameterName} to parameterName.
     * @param parameterName The value for parameterName
     * @return {@code this} builder for chained invocation
     */
    public final Builder parameterName(List<String> parameterName) {
      checkNotIsSet(parameterNameIsSet(), "parameterName");
      this.parameterName = Objects.requireNonNull(parameterName, "parameterName");
      optBits |= OPT_BIT_PARAMETER_NAME;
      return this;
    }

    /**
     * Initializes the optional value {@link OperationDefinition_Overload#parameterName() parameterName} to parameterName.
     * @param parameterName The value for parameterName
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("parameterName")
    public final Builder parameterName(Optional<? extends List<String>> parameterName) {
      checkNotIsSet(parameterNameIsSet(), "parameterName");
      this.parameterName = parameterName.orElse(null);
      optBits |= OPT_BIT_PARAMETER_NAME;
      return this;
    }

    /**
     * Builds a new {@link OperationDefinition_Overload OperationDefinition_Overload}.
     * @return An immutable instance of OperationDefinition_Overload
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public OperationDefinition_Overload build() {
      return new ImmutableOperationDefinition_Overload(id, extension, modifierExtension, comment, parameterName);
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

    private boolean commentIsSet() {
      return (optBits & OPT_BIT_COMMENT) != 0;
    }

    private boolean parameterNameIsSet() {
      return (optBits & OPT_BIT_PARAMETER_NAME) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of OperationDefinition_Overload is strict, attribute is already set: ".concat(name));
    }
  }
}

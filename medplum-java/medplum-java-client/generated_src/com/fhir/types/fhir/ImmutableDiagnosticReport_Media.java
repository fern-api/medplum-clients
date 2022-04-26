package com.fhir.types.fhir;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.Immutable;
import javax.annotation.concurrent.NotThreadSafe;
import org.immutables.value.Generated;

/**
 * Immutable implementation of {@link DiagnosticReport_Media}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableDiagnosticReport_Media.builder()}.
 */
@Generated(from = "DiagnosticReport_Media", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableDiagnosticReport_Media implements DiagnosticReport_Media {
  private final @Nullable String comment;
  private final @Nullable List<Extension> modifierExtension;
  private final Reference link;
  private final @Nullable List<Extension> extension;
  private final @Nullable String id;

  private ImmutableDiagnosticReport_Media(
      @Nullable String comment,
      @Nullable List<Extension> modifierExtension,
      Reference link,
      @Nullable List<Extension> extension,
      @Nullable String id) {
    this.comment = comment;
    this.modifierExtension = modifierExtension;
    this.link = link;
    this.extension = extension;
    this.id = id;
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
   * @return The value of the {@code modifierExtension} attribute
   */
  @JsonProperty("modifierExtension")
  @Override
  public Optional<List<Extension>> modifierExtension() {
    return Optional.ofNullable(modifierExtension);
  }

  /**
   * @return The value of the {@code link} attribute
   */
  @JsonProperty("link")
  @Override
  public Reference link() {
    return link;
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport_Media#comment() comment} attribute.
   * @param value The value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport_Media withComment(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "comment");
    if (Objects.equals(this.comment, newValue)) return this;
    return new ImmutableDiagnosticReport_Media(newValue, this.modifierExtension, this.link, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport_Media#comment() comment} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for comment
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport_Media withComment(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.comment, value)) return this;
    return new ImmutableDiagnosticReport_Media(value, this.modifierExtension, this.link, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport_Media#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport_Media withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableDiagnosticReport_Media(this.comment, newValue, this.link, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport_Media#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport_Media withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableDiagnosticReport_Media(this.comment, value, this.link, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link DiagnosticReport_Media#link() link} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for link
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableDiagnosticReport_Media withLink(Reference value) {
    if (this.link == value) return this;
    Reference newValue = Objects.requireNonNull(value, "link");
    return new ImmutableDiagnosticReport_Media(this.comment, this.modifierExtension, newValue, this.extension, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport_Media#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport_Media withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableDiagnosticReport_Media(this.comment, this.modifierExtension, this.link, newValue, this.id);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport_Media#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableDiagnosticReport_Media withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableDiagnosticReport_Media(this.comment, this.modifierExtension, this.link, value, this.id);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link DiagnosticReport_Media#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport_Media withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableDiagnosticReport_Media(this.comment, this.modifierExtension, this.link, this.extension, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link DiagnosticReport_Media#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableDiagnosticReport_Media withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableDiagnosticReport_Media(this.comment, this.modifierExtension, this.link, this.extension, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableDiagnosticReport_Media} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableDiagnosticReport_Media
        && equalTo((ImmutableDiagnosticReport_Media) another);
  }

  private boolean equalTo(ImmutableDiagnosticReport_Media another) {
    return Objects.equals(comment, another.comment)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && link.equals(another.link)
        && Objects.equals(extension, another.extension)
        && Objects.equals(id, another.id);
  }

  /**
   * Computes a hash code from attributes: {@code comment}, {@code modifierExtension}, {@code link}, {@code extension}, {@code id}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(comment);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + link.hashCode();
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(id);
    return h;
  }

  /**
   * Prints the immutable value {@code DiagnosticReport_Media} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("DiagnosticReport_Media{");
    if (comment != null) {
      builder.append("comment=").append(comment);
    }
    if (modifierExtension != null) {
      if (builder.length() > 23) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (builder.length() > 23) builder.append(", ");
    builder.append("link=").append(link);
    if (extension != null) {
      builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (id != null) {
      builder.append(", ");
      builder.append("id=").append(id);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "DiagnosticReport_Media", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements DiagnosticReport_Media {
    @Nullable Optional<String> comment = Optional.empty();
    boolean commentIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Reference link;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @JsonProperty("comment")
    public void setComment(Optional<String> comment) {
      this.comment = comment;
      this.commentIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("link")
    public void setLink(Reference link) {
      this.link = link;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @Override
    public Optional<String> comment() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Reference link() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
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
  static ImmutableDiagnosticReport_Media fromJson(Json json) {
    ImmutableDiagnosticReport_Media.Builder builder = ((ImmutableDiagnosticReport_Media.Builder) ImmutableDiagnosticReport_Media.builder());
    if (json.commentIsSet) {
      builder.comment(json.comment);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.link != null) {
      builder.link(json.link);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    return (ImmutableDiagnosticReport_Media) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link DiagnosticReport_Media} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable DiagnosticReport_Media instance
   */
  public static DiagnosticReport_Media copyOf(DiagnosticReport_Media instance) {
    if (instance instanceof ImmutableDiagnosticReport_Media) {
      return (ImmutableDiagnosticReport_Media) instance;
    }
    return ((ImmutableDiagnosticReport_Media.Builder) ImmutableDiagnosticReport_Media.builder())
        .comment(instance.comment())
        .modifierExtension(instance.modifierExtension())
        .link(instance.link())
        .extension(instance.extension())
        .id(instance.id())
        .build();
  }

  /**
   * Creates a builder for {@link DiagnosticReport_Media DiagnosticReport_Media}.
   * <pre>
   * ImmutableDiagnosticReport_Media.builder()
   *    .comment(String) // optional {@link DiagnosticReport_Media#comment() comment}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link DiagnosticReport_Media#modifierExtension() modifierExtension}
   *    .link(com.fhir.types.fhir.Reference) // required {@link DiagnosticReport_Media#link() link}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link DiagnosticReport_Media#extension() extension}
   *    .id(String) // optional {@link DiagnosticReport_Media#id() id}
   *    .build();
   * </pre>
   * @return A new DiagnosticReport_Media builder
   */
  public static LinkBuildStage builder() {
    return new ImmutableDiagnosticReport_Media.Builder();
  }

  /**
   * Builds instances of type {@link DiagnosticReport_Media DiagnosticReport_Media}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "DiagnosticReport_Media", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements LinkBuildStage, BuildFinal {
    private static final long INIT_BIT_LINK = 0x1L;
    private static final long OPT_BIT_COMMENT = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable String comment;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable Reference link;
    private @Nullable List<Extension> extension;
    private @Nullable String id;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link DiagnosticReport_Media#comment() comment} to comment.
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
     * Initializes the optional value {@link DiagnosticReport_Media#comment() comment} to comment.
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
     * Initializes the optional value {@link DiagnosticReport_Media#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link DiagnosticReport_Media#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the value for the {@link DiagnosticReport_Media#link() link} attribute.
     * @param link The value for link 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("link")
    public final Builder link(Reference link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = Objects.requireNonNull(link, "link");
      initBits &= ~INIT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link DiagnosticReport_Media#extension() extension} to extension.
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
     * Initializes the optional value {@link DiagnosticReport_Media#extension() extension} to extension.
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
     * Initializes the optional value {@link DiagnosticReport_Media#id() id} to id.
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
     * Initializes the optional value {@link DiagnosticReport_Media#id() id} to id.
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
     * Builds a new {@link DiagnosticReport_Media DiagnosticReport_Media}.
     * @return An immutable instance of DiagnosticReport_Media
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public DiagnosticReport_Media build() {
      checkRequiredAttributes();
      return new ImmutableDiagnosticReport_Media(comment, modifierExtension, link, extension, id);
    }

    private boolean commentIsSet() {
      return (optBits & OPT_BIT_COMMENT) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean linkIsSet() {
      return (initBits & INIT_BIT_LINK) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of DiagnosticReport_Media is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!linkIsSet()) attributes.add("link");
      return "Cannot build DiagnosticReport_Media, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "DiagnosticReport_Media", generator = "Immutables")
  public interface LinkBuildStage {
    /**
     * Initializes the value for the {@link DiagnosticReport_Media#link() link} attribute.
     * @param link The value for link 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal link(Reference link);
  }

  @Generated(from = "DiagnosticReport_Media", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link DiagnosticReport_Media#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for chained invocation
     */
    BuildFinal comment(String comment);

    /**
     * Initializes the optional value {@link DiagnosticReport_Media#comment() comment} to comment.
     * @param comment The value for comment
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal comment(Optional<String> comment);

    /**
     * Initializes the optional value {@link DiagnosticReport_Media#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link DiagnosticReport_Media#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link DiagnosticReport_Media#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link DiagnosticReport_Media#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Initializes the optional value {@link DiagnosticReport_Media#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link DiagnosticReport_Media#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Builds a new {@link DiagnosticReport_Media DiagnosticReport_Media}.
     * @return An immutable instance of DiagnosticReport_Media
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    DiagnosticReport_Media build();
  }
}

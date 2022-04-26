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
 * Immutable implementation of {@link Bundle_Link}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBundle_Link.builder()}.
 */
@Generated(from = "Bundle_Link", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableBundle_Link implements Bundle_Link {
  private final @Nullable String id;
  private final @Nullable Uri url;
  private final @Nullable List<Extension> extension;
  private final @Nullable String relation;
  private final @Nullable List<Extension> modifierExtension;

  private ImmutableBundle_Link(
      @Nullable String id,
      @Nullable Uri url,
      @Nullable List<Extension> extension,
      @Nullable String relation,
      @Nullable List<Extension> modifierExtension) {
    this.id = id;
    this.url = url;
    this.extension = extension;
    this.relation = relation;
    this.modifierExtension = modifierExtension;
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
   * @return The value of the {@code url} attribute
   */
  @JsonProperty("url")
  @Override
  public Optional<Uri> url() {
    return Optional.ofNullable(url);
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
   * @return The value of the {@code relation} attribute
   */
  @JsonProperty("relation")
  @Override
  public Optional<String> relation() {
    return Optional.ofNullable(relation);
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
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Link#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Link withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableBundle_Link(newValue, this.url, this.extension, this.relation, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Link#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Link withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableBundle_Link(value, this.url, this.extension, this.relation, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Link#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Link withUrl(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableBundle_Link(this.id, newValue, this.extension, this.relation, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Link#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Link withUrl(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableBundle_Link(this.id, value, this.extension, this.relation, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Link#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Link withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableBundle_Link(this.id, this.url, newValue, this.relation, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Link#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Link withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableBundle_Link(this.id, this.url, value, this.relation, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Link#relation() relation} attribute.
   * @param value The value for relation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Link withRelation(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "relation");
    if (Objects.equals(this.relation, newValue)) return this;
    return new ImmutableBundle_Link(this.id, this.url, this.extension, newValue, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Link#relation() relation} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for relation
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Link withRelation(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.relation, value)) return this;
    return new ImmutableBundle_Link(this.id, this.url, this.extension, value, this.modifierExtension);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Link#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Link withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableBundle_Link(this.id, this.url, this.extension, this.relation, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Link#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Link withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableBundle_Link(this.id, this.url, this.extension, this.relation, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBundle_Link} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBundle_Link
        && equalTo((ImmutableBundle_Link) another);
  }

  private boolean equalTo(ImmutableBundle_Link another) {
    return Objects.equals(id, another.id)
        && Objects.equals(url, another.url)
        && Objects.equals(extension, another.extension)
        && Objects.equals(relation, another.relation)
        && Objects.equals(modifierExtension, another.modifierExtension);
  }

  /**
   * Computes a hash code from attributes: {@code id}, {@code url}, {@code extension}, {@code relation}, {@code modifierExtension}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(relation);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    return h;
  }

  /**
   * Prints the immutable value {@code Bundle_Link} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Bundle_Link{");
    if (id != null) {
      builder.append("id=").append(id);
    }
    if (url != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("url=").append(url);
    }
    if (extension != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (relation != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("relation=").append(relation);
    }
    if (modifierExtension != null) {
      if (builder.length() > 12) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Bundle_Link", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Bundle_Link {
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Uri> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<String> relation = Optional.empty();
    boolean relationIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<Uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("relation")
    public void setRelation(Optional<String> relation) {
      this.relation = relation;
      this.relationIsSet = true;
    }
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> relation() { throw new UnsupportedOperationException(); }
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
  static ImmutableBundle_Link fromJson(Json json) {
    ImmutableBundle_Link.Builder builder = ImmutableBundle_Link.builder();
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.relationIsSet) {
      builder.relation(json.relation);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    return (ImmutableBundle_Link) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Bundle_Link} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Bundle_Link instance
   */
  public static Bundle_Link copyOf(Bundle_Link instance) {
    if (instance instanceof ImmutableBundle_Link) {
      return (ImmutableBundle_Link) instance;
    }
    return ImmutableBundle_Link.builder()
        .id(instance.id())
        .url(instance.url())
        .extension(instance.extension())
        .relation(instance.relation())
        .modifierExtension(instance.modifierExtension())
        .build();
  }

  /**
   * Creates a builder for {@link Bundle_Link Bundle_Link}.
   * <pre>
   * ImmutableBundle_Link.builder()
   *    .id(String) // optional {@link Bundle_Link#id() id}
   *    .url(com.fhir.types.fhir.Uri) // optional {@link Bundle_Link#url() url}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Bundle_Link#extension() extension}
   *    .relation(String) // optional {@link Bundle_Link#relation() relation}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Bundle_Link#modifierExtension() modifierExtension}
   *    .build();
   * </pre>
   * @return A new Bundle_Link builder
   */
  public static ImmutableBundle_Link.Builder builder() {
    return new ImmutableBundle_Link.Builder();
  }

  /**
   * Builds instances of type {@link Bundle_Link Bundle_Link}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Bundle_Link", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_ID = 0x1L;
    private static final long OPT_BIT_URL = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_RELATION = 0x8L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x10L;
    private long optBits;

    private @Nullable String id;
    private @Nullable Uri url;
    private @Nullable List<Extension> extension;
    private @Nullable String relation;
    private @Nullable List<Extension> modifierExtension;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Bundle_Link#id() id} to id.
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
     * Initializes the optional value {@link Bundle_Link#id() id} to id.
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
     * Initializes the optional value {@link Bundle_Link#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for chained invocation
     */
    public final Builder url(Uri url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = Objects.requireNonNull(url, "url");
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Link#url() url} to url.
     * @param url The value for url
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("url")
    public final Builder url(Optional<? extends Uri> url) {
      checkNotIsSet(urlIsSet(), "url");
      this.url = url.orElse(null);
      optBits |= OPT_BIT_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Link#extension() extension} to extension.
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
     * Initializes the optional value {@link Bundle_Link#extension() extension} to extension.
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
     * Initializes the optional value {@link Bundle_Link#relation() relation} to relation.
     * @param relation The value for relation
     * @return {@code this} builder for chained invocation
     */
    public final Builder relation(String relation) {
      checkNotIsSet(relationIsSet(), "relation");
      this.relation = Objects.requireNonNull(relation, "relation");
      optBits |= OPT_BIT_RELATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Link#relation() relation} to relation.
     * @param relation The value for relation
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("relation")
    public final Builder relation(Optional<String> relation) {
      checkNotIsSet(relationIsSet(), "relation");
      this.relation = relation.orElse(null);
      optBits |= OPT_BIT_RELATION;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Link#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Bundle_Link#modifierExtension() modifierExtension} to modifierExtension.
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
     * Builds a new {@link Bundle_Link Bundle_Link}.
     * @return An immutable instance of Bundle_Link
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Bundle_Link build() {
      return new ImmutableBundle_Link(id, url, extension, relation, modifierExtension);
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean relationIsSet() {
      return (optBits & OPT_BIT_RELATION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Bundle_Link is strict, attribute is already set: ".concat(name));
    }
  }
}

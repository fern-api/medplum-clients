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
 * Immutable implementation of {@link Consent_Policy}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableConsent_Policy.builder()}.
 */
@Generated(from = "Consent_Policy", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableConsent_Policy implements Consent_Policy {
  private final @Nullable Uri authority;
  private final @Nullable List<Extension> extension;
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable Uri uri;

  private ImmutableConsent_Policy(
      @Nullable Uri authority,
      @Nullable List<Extension> extension,
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable Uri uri) {
    this.authority = authority;
    this.extension = extension;
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.uri = uri;
  }

  /**
   * @return The value of the {@code authority} attribute
   */
  @JsonProperty("authority")
  @Override
  public Optional<Uri> authority() {
    return Optional.ofNullable(authority);
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
   * @return The value of the {@code id} attribute
   */
  @JsonProperty("id")
  @Override
  public Optional<String> id() {
    return Optional.ofNullable(id);
  }

  /**
   * @return The value of the {@code uri} attribute
   */
  @JsonProperty("uri")
  @Override
  public Optional<Uri> uri() {
    return Optional.ofNullable(uri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Policy#authority() authority} attribute.
   * @param value The value for authority
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Policy withAuthority(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "authority");
    if (this.authority == newValue) return this;
    return new ImmutableConsent_Policy(newValue, this.extension, this.modifierExtension, this.id, this.uri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Policy#authority() authority} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for authority
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent_Policy withAuthority(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.authority == value) return this;
    return new ImmutableConsent_Policy(value, this.extension, this.modifierExtension, this.id, this.uri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Policy#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Policy withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableConsent_Policy(this.authority, newValue, this.modifierExtension, this.id, this.uri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Policy#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent_Policy withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableConsent_Policy(this.authority, value, this.modifierExtension, this.id, this.uri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Policy#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Policy withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableConsent_Policy(this.authority, this.extension, newValue, this.id, this.uri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Policy#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent_Policy withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableConsent_Policy(this.authority, this.extension, value, this.id, this.uri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Policy#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Policy withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableConsent_Policy(this.authority, this.extension, this.modifierExtension, newValue, this.uri);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Policy#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Policy withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableConsent_Policy(this.authority, this.extension, this.modifierExtension, value, this.uri);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Consent_Policy#uri() uri} attribute.
   * @param value The value for uri
   * @return A modified copy of {@code this} object
   */
  public final ImmutableConsent_Policy withUri(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "uri");
    if (this.uri == newValue) return this;
    return new ImmutableConsent_Policy(this.authority, this.extension, this.modifierExtension, this.id, newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Consent_Policy#uri() uri} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for uri
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableConsent_Policy withUri(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.uri == value) return this;
    return new ImmutableConsent_Policy(this.authority, this.extension, this.modifierExtension, this.id, value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableConsent_Policy} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableConsent_Policy
        && equalTo((ImmutableConsent_Policy) another);
  }

  private boolean equalTo(ImmutableConsent_Policy another) {
    return Objects.equals(authority, another.authority)
        && Objects.equals(extension, another.extension)
        && Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(uri, another.uri);
  }

  /**
   * Computes a hash code from attributes: {@code authority}, {@code extension}, {@code modifierExtension}, {@code id}, {@code uri}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(authority);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(uri);
    return h;
  }

  /**
   * Prints the immutable value {@code Consent_Policy} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Consent_Policy{");
    if (authority != null) {
      builder.append("authority=").append(authority);
    }
    if (extension != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (modifierExtension != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (uri != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("uri=").append(uri);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Consent_Policy", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Consent_Policy {
    @Nullable Optional<Uri> authority = Optional.empty();
    boolean authorityIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<Uri> uri = Optional.empty();
    boolean uriIsSet;
    @JsonProperty("authority")
    public void setAuthority(Optional<Uri> authority) {
      this.authority = authority;
      this.authorityIsSet = true;
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
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("uri")
    public void setUri(Optional<Uri> uri) {
      this.uri = uri;
      this.uriIsSet = true;
    }
    @Override
    public Optional<Uri> authority() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> uri() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableConsent_Policy fromJson(Json json) {
    ImmutableConsent_Policy.Builder builder = ImmutableConsent_Policy.builder();
    if (json.authorityIsSet) {
      builder.authority(json.authority);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.uriIsSet) {
      builder.uri(json.uri);
    }
    return (ImmutableConsent_Policy) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Consent_Policy} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Consent_Policy instance
   */
  public static Consent_Policy copyOf(Consent_Policy instance) {
    if (instance instanceof ImmutableConsent_Policy) {
      return (ImmutableConsent_Policy) instance;
    }
    return ImmutableConsent_Policy.builder()
        .authority(instance.authority())
        .extension(instance.extension())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .uri(instance.uri())
        .build();
  }

  /**
   * Creates a builder for {@link Consent_Policy Consent_Policy}.
   * <pre>
   * ImmutableConsent_Policy.builder()
   *    .authority(com.fhir.types.fhir.Uri) // optional {@link Consent_Policy#authority() authority}
   *    .extension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Consent_Policy#extension() extension}
   *    .modifierExtension(List&amp;lt;com.fhir.types.fhir.Extension&amp;gt;) // optional {@link Consent_Policy#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link Consent_Policy#id() id}
   *    .uri(com.fhir.types.fhir.Uri) // optional {@link Consent_Policy#uri() uri}
   *    .build();
   * </pre>
   * @return A new Consent_Policy builder
   */
  public static ImmutableConsent_Policy.Builder builder() {
    return new ImmutableConsent_Policy.Builder();
  }

  /**
   * Builds instances of type {@link Consent_Policy Consent_Policy}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Consent_Policy", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_AUTHORITY = 0x1L;
    private static final long OPT_BIT_EXTENSION = 0x2L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x4L;
    private static final long OPT_BIT_ID = 0x8L;
    private static final long OPT_BIT_URI = 0x10L;
    private long optBits;

    private @Nullable Uri authority;
    private @Nullable List<Extension> extension;
    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable Uri uri;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Consent_Policy#authority() authority} to authority.
     * @param authority The value for authority
     * @return {@code this} builder for chained invocation
     */
    public final Builder authority(Uri authority) {
      checkNotIsSet(authorityIsSet(), "authority");
      this.authority = Objects.requireNonNull(authority, "authority");
      optBits |= OPT_BIT_AUTHORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Policy#authority() authority} to authority.
     * @param authority The value for authority
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("authority")
    public final Builder authority(Optional<? extends Uri> authority) {
      checkNotIsSet(authorityIsSet(), "authority");
      this.authority = authority.orElse(null);
      optBits |= OPT_BIT_AUTHORITY;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Policy#extension() extension} to extension.
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
     * Initializes the optional value {@link Consent_Policy#extension() extension} to extension.
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
     * Initializes the optional value {@link Consent_Policy#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Consent_Policy#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Consent_Policy#id() id} to id.
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
     * Initializes the optional value {@link Consent_Policy#id() id} to id.
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
     * Initializes the optional value {@link Consent_Policy#uri() uri} to uri.
     * @param uri The value for uri
     * @return {@code this} builder for chained invocation
     */
    public final Builder uri(Uri uri) {
      checkNotIsSet(uriIsSet(), "uri");
      this.uri = Objects.requireNonNull(uri, "uri");
      optBits |= OPT_BIT_URI;
      return this;
    }

    /**
     * Initializes the optional value {@link Consent_Policy#uri() uri} to uri.
     * @param uri The value for uri
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("uri")
    public final Builder uri(Optional<? extends Uri> uri) {
      checkNotIsSet(uriIsSet(), "uri");
      this.uri = uri.orElse(null);
      optBits |= OPT_BIT_URI;
      return this;
    }

    /**
     * Builds a new {@link Consent_Policy Consent_Policy}.
     * @return An immutable instance of Consent_Policy
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Consent_Policy build() {
      return new ImmutableConsent_Policy(authority, extension, modifierExtension, id, uri);
    }

    private boolean authorityIsSet() {
      return (optBits & OPT_BIT_AUTHORITY) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean uriIsSet() {
      return (optBits & OPT_BIT_URI) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Consent_Policy is strict, attribute is already set: ".concat(name));
    }
  }
}

package com.medplum.types.fhir;

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
 * Immutable implementation of {@link Bundle_Request}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBundle_Request.builder()}.
 */
@Generated(from = "Bundle_Request", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableBundle_Request implements Bundle_Request {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable List<Extension> extension;
  private final @Nullable Instant ifModifiedSince;
  private final @Nullable String ifMatch;
  private final @Nullable Uri url;
  private final @Nullable String ifNoneMatch;
  private final @Nullable String ifNoneExist;
  private final @Nullable Bundle_requestMethod method;

  private ImmutableBundle_Request(
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable List<Extension> extension,
      @Nullable Instant ifModifiedSince,
      @Nullable String ifMatch,
      @Nullable Uri url,
      @Nullable String ifNoneMatch,
      @Nullable String ifNoneExist,
      @Nullable Bundle_requestMethod method) {
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.extension = extension;
    this.ifModifiedSince = ifModifiedSince;
    this.ifMatch = ifMatch;
    this.url = url;
    this.ifNoneMatch = ifNoneMatch;
    this.ifNoneExist = ifNoneExist;
    this.method = method;
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
   * @return The value of the {@code extension} attribute
   */
  @JsonProperty("extension")
  @Override
  public Optional<List<Extension>> extension() {
    return Optional.ofNullable(extension);
  }

  /**
   * @return The value of the {@code ifModifiedSince} attribute
   */
  @JsonProperty("ifModifiedSince")
  @Override
  public Optional<Instant> ifModifiedSince() {
    return Optional.ofNullable(ifModifiedSince);
  }

  /**
   * @return The value of the {@code ifMatch} attribute
   */
  @JsonProperty("ifMatch")
  @Override
  public Optional<String> ifMatch() {
    return Optional.ofNullable(ifMatch);
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
   * @return The value of the {@code ifNoneMatch} attribute
   */
  @JsonProperty("ifNoneMatch")
  @Override
  public Optional<String> ifNoneMatch() {
    return Optional.ofNullable(ifNoneMatch);
  }

  /**
   * @return The value of the {@code ifNoneExist} attribute
   */
  @JsonProperty("ifNoneExist")
  @Override
  public Optional<String> ifNoneExist() {
    return Optional.ofNullable(ifNoneExist);
  }

  /**
   * @return The value of the {@code method} attribute
   */
  @JsonProperty("method")
  @Override
  public Optional<Bundle_requestMethod> method() {
    return Optional.ofNullable(method);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Request#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Request withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableBundle_Request(
        newValue,
        this.id,
        this.extension,
        this.ifModifiedSince,
        this.ifMatch,
        this.url,
        this.ifNoneMatch,
        this.ifNoneExist,
        this.method);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Request#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Request withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableBundle_Request(
        value,
        this.id,
        this.extension,
        this.ifModifiedSince,
        this.ifMatch,
        this.url,
        this.ifNoneMatch,
        this.ifNoneExist,
        this.method);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Request#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Request withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableBundle_Request(
        this.modifierExtension,
        newValue,
        this.extension,
        this.ifModifiedSince,
        this.ifMatch,
        this.url,
        this.ifNoneMatch,
        this.ifNoneExist,
        this.method);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Request#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Request withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableBundle_Request(
        this.modifierExtension,
        value,
        this.extension,
        this.ifModifiedSince,
        this.ifMatch,
        this.url,
        this.ifNoneMatch,
        this.ifNoneExist,
        this.method);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Request#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Request withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableBundle_Request(
        this.modifierExtension,
        this.id,
        newValue,
        this.ifModifiedSince,
        this.ifMatch,
        this.url,
        this.ifNoneMatch,
        this.ifNoneExist,
        this.method);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Request#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Request withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableBundle_Request(
        this.modifierExtension,
        this.id,
        value,
        this.ifModifiedSince,
        this.ifMatch,
        this.url,
        this.ifNoneMatch,
        this.ifNoneExist,
        this.method);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Request#ifModifiedSince() ifModifiedSince} attribute.
   * @param value The value for ifModifiedSince
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Request withIfModifiedSince(Instant value) {
    @Nullable Instant newValue = Objects.requireNonNull(value, "ifModifiedSince");
    if (this.ifModifiedSince == newValue) return this;
    return new ImmutableBundle_Request(
        this.modifierExtension,
        this.id,
        this.extension,
        newValue,
        this.ifMatch,
        this.url,
        this.ifNoneMatch,
        this.ifNoneExist,
        this.method);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Request#ifModifiedSince() ifModifiedSince} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for ifModifiedSince
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Request withIfModifiedSince(Optional<? extends Instant> optional) {
    @Nullable Instant value = optional.orElse(null);
    if (this.ifModifiedSince == value) return this;
    return new ImmutableBundle_Request(
        this.modifierExtension,
        this.id,
        this.extension,
        value,
        this.ifMatch,
        this.url,
        this.ifNoneMatch,
        this.ifNoneExist,
        this.method);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Request#ifMatch() ifMatch} attribute.
   * @param value The value for ifMatch
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Request withIfMatch(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "ifMatch");
    if (Objects.equals(this.ifMatch, newValue)) return this;
    return new ImmutableBundle_Request(
        this.modifierExtension,
        this.id,
        this.extension,
        this.ifModifiedSince,
        newValue,
        this.url,
        this.ifNoneMatch,
        this.ifNoneExist,
        this.method);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Request#ifMatch() ifMatch} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for ifMatch
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Request withIfMatch(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.ifMatch, value)) return this;
    return new ImmutableBundle_Request(
        this.modifierExtension,
        this.id,
        this.extension,
        this.ifModifiedSince,
        value,
        this.url,
        this.ifNoneMatch,
        this.ifNoneExist,
        this.method);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Request#url() url} attribute.
   * @param value The value for url
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Request withUrl(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "url");
    if (this.url == newValue) return this;
    return new ImmutableBundle_Request(
        this.modifierExtension,
        this.id,
        this.extension,
        this.ifModifiedSince,
        this.ifMatch,
        newValue,
        this.ifNoneMatch,
        this.ifNoneExist,
        this.method);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Request#url() url} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for url
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Request withUrl(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.url == value) return this;
    return new ImmutableBundle_Request(
        this.modifierExtension,
        this.id,
        this.extension,
        this.ifModifiedSince,
        this.ifMatch,
        value,
        this.ifNoneMatch,
        this.ifNoneExist,
        this.method);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Request#ifNoneMatch() ifNoneMatch} attribute.
   * @param value The value for ifNoneMatch
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Request withIfNoneMatch(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "ifNoneMatch");
    if (Objects.equals(this.ifNoneMatch, newValue)) return this;
    return new ImmutableBundle_Request(
        this.modifierExtension,
        this.id,
        this.extension,
        this.ifModifiedSince,
        this.ifMatch,
        this.url,
        newValue,
        this.ifNoneExist,
        this.method);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Request#ifNoneMatch() ifNoneMatch} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for ifNoneMatch
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Request withIfNoneMatch(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.ifNoneMatch, value)) return this;
    return new ImmutableBundle_Request(
        this.modifierExtension,
        this.id,
        this.extension,
        this.ifModifiedSince,
        this.ifMatch,
        this.url,
        value,
        this.ifNoneExist,
        this.method);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Request#ifNoneExist() ifNoneExist} attribute.
   * @param value The value for ifNoneExist
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Request withIfNoneExist(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "ifNoneExist");
    if (Objects.equals(this.ifNoneExist, newValue)) return this;
    return new ImmutableBundle_Request(
        this.modifierExtension,
        this.id,
        this.extension,
        this.ifModifiedSince,
        this.ifMatch,
        this.url,
        this.ifNoneMatch,
        newValue,
        this.method);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Request#ifNoneExist() ifNoneExist} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for ifNoneExist
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Request withIfNoneExist(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.ifNoneExist, value)) return this;
    return new ImmutableBundle_Request(
        this.modifierExtension,
        this.id,
        this.extension,
        this.ifModifiedSince,
        this.ifMatch,
        this.url,
        this.ifNoneMatch,
        value,
        this.method);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Request#method() method} attribute.
   * @param value The value for method
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Request withMethod(Bundle_requestMethod value) {
    @Nullable Bundle_requestMethod newValue = Objects.requireNonNull(value, "method");
    if (this.method == newValue) return this;
    return new ImmutableBundle_Request(
        this.modifierExtension,
        this.id,
        this.extension,
        this.ifModifiedSince,
        this.ifMatch,
        this.url,
        this.ifNoneMatch,
        this.ifNoneExist,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Request#method() method} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for method
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Request withMethod(Optional<? extends Bundle_requestMethod> optional) {
    @Nullable Bundle_requestMethod value = optional.orElse(null);
    if (this.method == value) return this;
    return new ImmutableBundle_Request(
        this.modifierExtension,
        this.id,
        this.extension,
        this.ifModifiedSince,
        this.ifMatch,
        this.url,
        this.ifNoneMatch,
        this.ifNoneExist,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBundle_Request} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBundle_Request
        && equalTo((ImmutableBundle_Request) another);
  }

  private boolean equalTo(ImmutableBundle_Request another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(extension, another.extension)
        && Objects.equals(ifModifiedSince, another.ifModifiedSince)
        && Objects.equals(ifMatch, another.ifMatch)
        && Objects.equals(url, another.url)
        && Objects.equals(ifNoneMatch, another.ifNoneMatch)
        && Objects.equals(ifNoneExist, another.ifNoneExist)
        && Objects.equals(method, another.method);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code id}, {@code extension}, {@code ifModifiedSince}, {@code ifMatch}, {@code url}, {@code ifNoneMatch}, {@code ifNoneExist}, {@code method}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(ifModifiedSince);
    h += (h << 5) + Objects.hashCode(ifMatch);
    h += (h << 5) + Objects.hashCode(url);
    h += (h << 5) + Objects.hashCode(ifNoneMatch);
    h += (h << 5) + Objects.hashCode(ifNoneExist);
    h += (h << 5) + Objects.hashCode(method);
    return h;
  }

  /**
   * Prints the immutable value {@code Bundle_Request} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Bundle_Request{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (extension != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (ifModifiedSince != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("ifModifiedSince=").append(ifModifiedSince);
    }
    if (ifMatch != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("ifMatch=").append(ifMatch);
    }
    if (url != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("url=").append(url);
    }
    if (ifNoneMatch != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("ifNoneMatch=").append(ifNoneMatch);
    }
    if (ifNoneExist != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("ifNoneExist=").append(ifNoneExist);
    }
    if (method != null) {
      if (builder.length() > 15) builder.append(", ");
      builder.append("method=").append(method);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Bundle_Request", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Bundle_Request {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Instant> ifModifiedSince = Optional.empty();
    boolean ifModifiedSinceIsSet;
    @Nullable Optional<String> ifMatch = Optional.empty();
    boolean ifMatchIsSet;
    @Nullable Optional<Uri> url = Optional.empty();
    boolean urlIsSet;
    @Nullable Optional<String> ifNoneMatch = Optional.empty();
    boolean ifNoneMatchIsSet;
    @Nullable Optional<String> ifNoneExist = Optional.empty();
    boolean ifNoneExistIsSet;
    @Nullable Optional<Bundle_requestMethod> method = Optional.empty();
    boolean methodIsSet;
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
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("ifModifiedSince")
    public void setIfModifiedSince(Optional<Instant> ifModifiedSince) {
      this.ifModifiedSince = ifModifiedSince;
      this.ifModifiedSinceIsSet = true;
    }
    @JsonProperty("ifMatch")
    public void setIfMatch(Optional<String> ifMatch) {
      this.ifMatch = ifMatch;
      this.ifMatchIsSet = true;
    }
    @JsonProperty("url")
    public void setUrl(Optional<Uri> url) {
      this.url = url;
      this.urlIsSet = true;
    }
    @JsonProperty("ifNoneMatch")
    public void setIfNoneMatch(Optional<String> ifNoneMatch) {
      this.ifNoneMatch = ifNoneMatch;
      this.ifNoneMatchIsSet = true;
    }
    @JsonProperty("ifNoneExist")
    public void setIfNoneExist(Optional<String> ifNoneExist) {
      this.ifNoneExist = ifNoneExist;
      this.ifNoneExistIsSet = true;
    }
    @JsonProperty("method")
    public void setMethod(Optional<Bundle_requestMethod> method) {
      this.method = method;
      this.methodIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Instant> ifModifiedSince() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> ifMatch() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> url() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> ifNoneMatch() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> ifNoneExist() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Bundle_requestMethod> method() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableBundle_Request fromJson(Json json) {
    ImmutableBundle_Request.Builder builder = ImmutableBundle_Request.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.ifModifiedSinceIsSet) {
      builder.ifModifiedSince(json.ifModifiedSince);
    }
    if (json.ifMatchIsSet) {
      builder.ifMatch(json.ifMatch);
    }
    if (json.urlIsSet) {
      builder.url(json.url);
    }
    if (json.ifNoneMatchIsSet) {
      builder.ifNoneMatch(json.ifNoneMatch);
    }
    if (json.ifNoneExistIsSet) {
      builder.ifNoneExist(json.ifNoneExist);
    }
    if (json.methodIsSet) {
      builder.method(json.method);
    }
    return (ImmutableBundle_Request) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Bundle_Request} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Bundle_Request instance
   */
  public static Bundle_Request copyOf(Bundle_Request instance) {
    if (instance instanceof ImmutableBundle_Request) {
      return (ImmutableBundle_Request) instance;
    }
    return ImmutableBundle_Request.builder()
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .extension(instance.extension())
        .ifModifiedSince(instance.ifModifiedSince())
        .ifMatch(instance.ifMatch())
        .url(instance.url())
        .ifNoneMatch(instance.ifNoneMatch())
        .ifNoneExist(instance.ifNoneExist())
        .method(instance.method())
        .build();
  }

  /**
   * Creates a builder for {@link Bundle_Request Bundle_Request}.
   * <pre>
   * ImmutableBundle_Request.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Bundle_Request#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link Bundle_Request#id() id}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Bundle_Request#extension() extension}
   *    .ifModifiedSince(com.medplum.types.fhir.Instant) // optional {@link Bundle_Request#ifModifiedSince() ifModifiedSince}
   *    .ifMatch(String) // optional {@link Bundle_Request#ifMatch() ifMatch}
   *    .url(com.medplum.types.fhir.Uri) // optional {@link Bundle_Request#url() url}
   *    .ifNoneMatch(String) // optional {@link Bundle_Request#ifNoneMatch() ifNoneMatch}
   *    .ifNoneExist(String) // optional {@link Bundle_Request#ifNoneExist() ifNoneExist}
   *    .method(com.medplum.types.fhir.Bundle_requestMethod) // optional {@link Bundle_Request#method() method}
   *    .build();
   * </pre>
   * @return A new Bundle_Request builder
   */
  public static ImmutableBundle_Request.Builder builder() {
    return new ImmutableBundle_Request.Builder();
  }

  /**
   * Builds instances of type {@link Bundle_Request Bundle_Request}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Bundle_Request", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_IF_MODIFIED_SINCE = 0x8L;
    private static final long OPT_BIT_IF_MATCH = 0x10L;
    private static final long OPT_BIT_URL = 0x20L;
    private static final long OPT_BIT_IF_NONE_MATCH = 0x40L;
    private static final long OPT_BIT_IF_NONE_EXIST = 0x80L;
    private static final long OPT_BIT_METHOD = 0x100L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable List<Extension> extension;
    private @Nullable Instant ifModifiedSince;
    private @Nullable String ifMatch;
    private @Nullable Uri url;
    private @Nullable String ifNoneMatch;
    private @Nullable String ifNoneExist;
    private @Nullable Bundle_requestMethod method;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Bundle_Request#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Bundle_Request#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Bundle_Request#id() id} to id.
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
     * Initializes the optional value {@link Bundle_Request#id() id} to id.
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
     * Initializes the optional value {@link Bundle_Request#extension() extension} to extension.
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
     * Initializes the optional value {@link Bundle_Request#extension() extension} to extension.
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
     * Initializes the optional value {@link Bundle_Request#ifModifiedSince() ifModifiedSince} to ifModifiedSince.
     * @param ifModifiedSince The value for ifModifiedSince
     * @return {@code this} builder for chained invocation
     */
    public final Builder ifModifiedSince(Instant ifModifiedSince) {
      checkNotIsSet(ifModifiedSinceIsSet(), "ifModifiedSince");
      this.ifModifiedSince = Objects.requireNonNull(ifModifiedSince, "ifModifiedSince");
      optBits |= OPT_BIT_IF_MODIFIED_SINCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Request#ifModifiedSince() ifModifiedSince} to ifModifiedSince.
     * @param ifModifiedSince The value for ifModifiedSince
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ifModifiedSince")
    public final Builder ifModifiedSince(Optional<? extends Instant> ifModifiedSince) {
      checkNotIsSet(ifModifiedSinceIsSet(), "ifModifiedSince");
      this.ifModifiedSince = ifModifiedSince.orElse(null);
      optBits |= OPT_BIT_IF_MODIFIED_SINCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Request#ifMatch() ifMatch} to ifMatch.
     * @param ifMatch The value for ifMatch
     * @return {@code this} builder for chained invocation
     */
    public final Builder ifMatch(String ifMatch) {
      checkNotIsSet(ifMatchIsSet(), "ifMatch");
      this.ifMatch = Objects.requireNonNull(ifMatch, "ifMatch");
      optBits |= OPT_BIT_IF_MATCH;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Request#ifMatch() ifMatch} to ifMatch.
     * @param ifMatch The value for ifMatch
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ifMatch")
    public final Builder ifMatch(Optional<String> ifMatch) {
      checkNotIsSet(ifMatchIsSet(), "ifMatch");
      this.ifMatch = ifMatch.orElse(null);
      optBits |= OPT_BIT_IF_MATCH;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Request#url() url} to url.
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
     * Initializes the optional value {@link Bundle_Request#url() url} to url.
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
     * Initializes the optional value {@link Bundle_Request#ifNoneMatch() ifNoneMatch} to ifNoneMatch.
     * @param ifNoneMatch The value for ifNoneMatch
     * @return {@code this} builder for chained invocation
     */
    public final Builder ifNoneMatch(String ifNoneMatch) {
      checkNotIsSet(ifNoneMatchIsSet(), "ifNoneMatch");
      this.ifNoneMatch = Objects.requireNonNull(ifNoneMatch, "ifNoneMatch");
      optBits |= OPT_BIT_IF_NONE_MATCH;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Request#ifNoneMatch() ifNoneMatch} to ifNoneMatch.
     * @param ifNoneMatch The value for ifNoneMatch
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ifNoneMatch")
    public final Builder ifNoneMatch(Optional<String> ifNoneMatch) {
      checkNotIsSet(ifNoneMatchIsSet(), "ifNoneMatch");
      this.ifNoneMatch = ifNoneMatch.orElse(null);
      optBits |= OPT_BIT_IF_NONE_MATCH;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Request#ifNoneExist() ifNoneExist} to ifNoneExist.
     * @param ifNoneExist The value for ifNoneExist
     * @return {@code this} builder for chained invocation
     */
    public final Builder ifNoneExist(String ifNoneExist) {
      checkNotIsSet(ifNoneExistIsSet(), "ifNoneExist");
      this.ifNoneExist = Objects.requireNonNull(ifNoneExist, "ifNoneExist");
      optBits |= OPT_BIT_IF_NONE_EXIST;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Request#ifNoneExist() ifNoneExist} to ifNoneExist.
     * @param ifNoneExist The value for ifNoneExist
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("ifNoneExist")
    public final Builder ifNoneExist(Optional<String> ifNoneExist) {
      checkNotIsSet(ifNoneExistIsSet(), "ifNoneExist");
      this.ifNoneExist = ifNoneExist.orElse(null);
      optBits |= OPT_BIT_IF_NONE_EXIST;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Request#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for chained invocation
     */
    public final Builder method(Bundle_requestMethod method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = Objects.requireNonNull(method, "method");
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Request#method() method} to method.
     * @param method The value for method
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("method")
    public final Builder method(Optional<? extends Bundle_requestMethod> method) {
      checkNotIsSet(methodIsSet(), "method");
      this.method = method.orElse(null);
      optBits |= OPT_BIT_METHOD;
      return this;
    }

    /**
     * Builds a new {@link Bundle_Request Bundle_Request}.
     * @return An immutable instance of Bundle_Request
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Bundle_Request build() {
      return new ImmutableBundle_Request(
          modifierExtension,
          id,
          extension,
          ifModifiedSince,
          ifMatch,
          url,
          ifNoneMatch,
          ifNoneExist,
          method);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean ifModifiedSinceIsSet() {
      return (optBits & OPT_BIT_IF_MODIFIED_SINCE) != 0;
    }

    private boolean ifMatchIsSet() {
      return (optBits & OPT_BIT_IF_MATCH) != 0;
    }

    private boolean urlIsSet() {
      return (optBits & OPT_BIT_URL) != 0;
    }

    private boolean ifNoneMatchIsSet() {
      return (optBits & OPT_BIT_IF_NONE_MATCH) != 0;
    }

    private boolean ifNoneExistIsSet() {
      return (optBits & OPT_BIT_IF_NONE_EXIST) != 0;
    }

    private boolean methodIsSet() {
      return (optBits & OPT_BIT_METHOD) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Bundle_Request is strict, attribute is already set: ".concat(name));
    }
  }
}

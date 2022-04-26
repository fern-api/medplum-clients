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
 * Immutable implementation of {@link Bundle_Entry}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableBundle_Entry.builder()}.
 */
@Generated(from = "Bundle_Entry", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableBundle_Entry implements Bundle_Entry {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable Bundle_Request request;
  private final @Nullable List<Extension> extension;
  private final @Nullable Uri fullUrl;
  private final @Nullable List<Bundle_Link> link;
  private final @Nullable Bundle_Search search;
  private final @Nullable Bundle_Response response;
  private final @Nullable String id;
  private final @Nullable ResourceList resource;

  private ImmutableBundle_Entry(
      @Nullable List<Extension> modifierExtension,
      @Nullable Bundle_Request request,
      @Nullable List<Extension> extension,
      @Nullable Uri fullUrl,
      @Nullable List<Bundle_Link> link,
      @Nullable Bundle_Search search,
      @Nullable Bundle_Response response,
      @Nullable String id,
      @Nullable ResourceList resource) {
    this.modifierExtension = modifierExtension;
    this.request = request;
    this.extension = extension;
    this.fullUrl = fullUrl;
    this.link = link;
    this.search = search;
    this.response = response;
    this.id = id;
    this.resource = resource;
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
   * @return The value of the {@code request} attribute
   */
  @JsonProperty("request")
  @Override
  public Optional<Bundle_Request> request() {
    return Optional.ofNullable(request);
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
   * @return The value of the {@code fullUrl} attribute
   */
  @JsonProperty("fullUrl")
  @Override
  public Optional<Uri> fullUrl() {
    return Optional.ofNullable(fullUrl);
  }

  /**
   * @return The value of the {@code link} attribute
   */
  @JsonProperty("link")
  @Override
  public Optional<List<Bundle_Link>> link() {
    return Optional.ofNullable(link);
  }

  /**
   * @return The value of the {@code search} attribute
   */
  @JsonProperty("search")
  @Override
  public Optional<Bundle_Search> search() {
    return Optional.ofNullable(search);
  }

  /**
   * @return The value of the {@code response} attribute
   */
  @JsonProperty("response")
  @Override
  public Optional<Bundle_Response> response() {
    return Optional.ofNullable(response);
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
   * @return The value of the {@code resource} attribute
   */
  @JsonProperty("resource")
  @Override
  public Optional<ResourceList> resource() {
    return Optional.ofNullable(resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Entry#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Entry withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableBundle_Entry(
        newValue,
        this.request,
        this.extension,
        this.fullUrl,
        this.link,
        this.search,
        this.response,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Entry#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Entry withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableBundle_Entry(
        value,
        this.request,
        this.extension,
        this.fullUrl,
        this.link,
        this.search,
        this.response,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Entry#request() request} attribute.
   * @param value The value for request
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Entry withRequest(Bundle_Request value) {
    @Nullable Bundle_Request newValue = Objects.requireNonNull(value, "request");
    if (this.request == newValue) return this;
    return new ImmutableBundle_Entry(
        this.modifierExtension,
        newValue,
        this.extension,
        this.fullUrl,
        this.link,
        this.search,
        this.response,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Entry#request() request} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for request
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Entry withRequest(Optional<? extends Bundle_Request> optional) {
    @Nullable Bundle_Request value = optional.orElse(null);
    if (this.request == value) return this;
    return new ImmutableBundle_Entry(
        this.modifierExtension,
        value,
        this.extension,
        this.fullUrl,
        this.link,
        this.search,
        this.response,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Entry#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Entry withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableBundle_Entry(
        this.modifierExtension,
        this.request,
        newValue,
        this.fullUrl,
        this.link,
        this.search,
        this.response,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Entry#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Entry withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableBundle_Entry(
        this.modifierExtension,
        this.request,
        value,
        this.fullUrl,
        this.link,
        this.search,
        this.response,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Entry#fullUrl() fullUrl} attribute.
   * @param value The value for fullUrl
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Entry withFullUrl(Uri value) {
    @Nullable Uri newValue = Objects.requireNonNull(value, "fullUrl");
    if (this.fullUrl == newValue) return this;
    return new ImmutableBundle_Entry(
        this.modifierExtension,
        this.request,
        this.extension,
        newValue,
        this.link,
        this.search,
        this.response,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Entry#fullUrl() fullUrl} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for fullUrl
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Entry withFullUrl(Optional<? extends Uri> optional) {
    @Nullable Uri value = optional.orElse(null);
    if (this.fullUrl == value) return this;
    return new ImmutableBundle_Entry(
        this.modifierExtension,
        this.request,
        this.extension,
        value,
        this.link,
        this.search,
        this.response,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Entry#link() link} attribute.
   * @param value The value for link
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Entry withLink(List<Bundle_Link> value) {
    @Nullable List<Bundle_Link> newValue = Objects.requireNonNull(value, "link");
    if (this.link == newValue) return this;
    return new ImmutableBundle_Entry(
        this.modifierExtension,
        this.request,
        this.extension,
        this.fullUrl,
        newValue,
        this.search,
        this.response,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Entry#link() link} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for link
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Entry withLink(Optional<? extends List<Bundle_Link>> optional) {
    @Nullable List<Bundle_Link> value = optional.orElse(null);
    if (this.link == value) return this;
    return new ImmutableBundle_Entry(
        this.modifierExtension,
        this.request,
        this.extension,
        this.fullUrl,
        value,
        this.search,
        this.response,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Entry#search() search} attribute.
   * @param value The value for search
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Entry withSearch(Bundle_Search value) {
    @Nullable Bundle_Search newValue = Objects.requireNonNull(value, "search");
    if (this.search == newValue) return this;
    return new ImmutableBundle_Entry(
        this.modifierExtension,
        this.request,
        this.extension,
        this.fullUrl,
        this.link,
        newValue,
        this.response,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Entry#search() search} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for search
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Entry withSearch(Optional<? extends Bundle_Search> optional) {
    @Nullable Bundle_Search value = optional.orElse(null);
    if (this.search == value) return this;
    return new ImmutableBundle_Entry(
        this.modifierExtension,
        this.request,
        this.extension,
        this.fullUrl,
        this.link,
        value,
        this.response,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Entry#response() response} attribute.
   * @param value The value for response
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Entry withResponse(Bundle_Response value) {
    @Nullable Bundle_Response newValue = Objects.requireNonNull(value, "response");
    if (this.response == newValue) return this;
    return new ImmutableBundle_Entry(
        this.modifierExtension,
        this.request,
        this.extension,
        this.fullUrl,
        this.link,
        this.search,
        newValue,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Entry#response() response} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for response
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Entry withResponse(Optional<? extends Bundle_Response> optional) {
    @Nullable Bundle_Response value = optional.orElse(null);
    if (this.response == value) return this;
    return new ImmutableBundle_Entry(
        this.modifierExtension,
        this.request,
        this.extension,
        this.fullUrl,
        this.link,
        this.search,
        value,
        this.id,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Entry#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Entry withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableBundle_Entry(
        this.modifierExtension,
        this.request,
        this.extension,
        this.fullUrl,
        this.link,
        this.search,
        this.response,
        newValue,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Entry#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Entry withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableBundle_Entry(
        this.modifierExtension,
        this.request,
        this.extension,
        this.fullUrl,
        this.link,
        this.search,
        this.response,
        value,
        this.resource);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link Bundle_Entry#resource() resource} attribute.
   * @param value The value for resource
   * @return A modified copy of {@code this} object
   */
  public final ImmutableBundle_Entry withResource(ResourceList value) {
    @Nullable ResourceList newValue = Objects.requireNonNull(value, "resource");
    if (this.resource == newValue) return this;
    return new ImmutableBundle_Entry(
        this.modifierExtension,
        this.request,
        this.extension,
        this.fullUrl,
        this.link,
        this.search,
        this.response,
        this.id,
        newValue);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link Bundle_Entry#resource() resource} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for resource
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableBundle_Entry withResource(Optional<? extends ResourceList> optional) {
    @Nullable ResourceList value = optional.orElse(null);
    if (this.resource == value) return this;
    return new ImmutableBundle_Entry(
        this.modifierExtension,
        this.request,
        this.extension,
        this.fullUrl,
        this.link,
        this.search,
        this.response,
        this.id,
        value);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableBundle_Entry} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableBundle_Entry
        && equalTo((ImmutableBundle_Entry) another);
  }

  private boolean equalTo(ImmutableBundle_Entry another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(request, another.request)
        && Objects.equals(extension, another.extension)
        && Objects.equals(fullUrl, another.fullUrl)
        && Objects.equals(link, another.link)
        && Objects.equals(search, another.search)
        && Objects.equals(response, another.response)
        && Objects.equals(id, another.id)
        && Objects.equals(resource, another.resource);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code request}, {@code extension}, {@code fullUrl}, {@code link}, {@code search}, {@code response}, {@code id}, {@code resource}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(request);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + Objects.hashCode(fullUrl);
    h += (h << 5) + Objects.hashCode(link);
    h += (h << 5) + Objects.hashCode(search);
    h += (h << 5) + Objects.hashCode(response);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(resource);
    return h;
  }

  /**
   * Prints the immutable value {@code Bundle_Entry} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("Bundle_Entry{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (request != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("request=").append(request);
    }
    if (extension != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (fullUrl != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("fullUrl=").append(fullUrl);
    }
    if (link != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("link=").append(link);
    }
    if (search != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("search=").append(search);
    }
    if (response != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("response=").append(response);
    }
    if (id != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (resource != null) {
      if (builder.length() > 13) builder.append(", ");
      builder.append("resource=").append(resource);
    }
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "Bundle_Entry", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements Bundle_Entry {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<Bundle_Request> request = Optional.empty();
    boolean requestIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Optional<Uri> fullUrl = Optional.empty();
    boolean fullUrlIsSet;
    @Nullable Optional<List<Bundle_Link>> link = Optional.empty();
    boolean linkIsSet;
    @Nullable Optional<Bundle_Search> search = Optional.empty();
    boolean searchIsSet;
    @Nullable Optional<Bundle_Response> response = Optional.empty();
    boolean responseIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<ResourceList> resource = Optional.empty();
    boolean resourceIsSet;
    @JsonProperty("modifierExtension")
    public void setModifierExtension(Optional<List<Extension>> modifierExtension) {
      this.modifierExtension = modifierExtension;
      this.modifierExtensionIsSet = true;
    }
    @JsonProperty("request")
    public void setRequest(Optional<Bundle_Request> request) {
      this.request = request;
      this.requestIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("fullUrl")
    public void setFullUrl(Optional<Uri> fullUrl) {
      this.fullUrl = fullUrl;
      this.fullUrlIsSet = true;
    }
    @JsonProperty("link")
    public void setLink(Optional<List<Bundle_Link>> link) {
      this.link = link;
      this.linkIsSet = true;
    }
    @JsonProperty("search")
    public void setSearch(Optional<Bundle_Search> search) {
      this.search = search;
      this.searchIsSet = true;
    }
    @JsonProperty("response")
    public void setResponse(Optional<Bundle_Response> response) {
      this.response = response;
      this.responseIsSet = true;
    }
    @JsonProperty("id")
    public void setId(Optional<String> id) {
      this.id = id;
      this.idIsSet = true;
    }
    @JsonProperty("resource")
    public void setResource(Optional<ResourceList> resource) {
      this.resource = resource;
      this.resourceIsSet = true;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Bundle_Request> request() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Uri> fullUrl() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Bundle_Link>> link() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Bundle_Search> search() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<Bundle_Response> response() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<ResourceList> resource() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableBundle_Entry fromJson(Json json) {
    ImmutableBundle_Entry.Builder builder = ImmutableBundle_Entry.builder();
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.requestIsSet) {
      builder.request(json.request);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.fullUrlIsSet) {
      builder.fullUrl(json.fullUrl);
    }
    if (json.linkIsSet) {
      builder.link(json.link);
    }
    if (json.searchIsSet) {
      builder.search(json.search);
    }
    if (json.responseIsSet) {
      builder.response(json.response);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.resourceIsSet) {
      builder.resource(json.resource);
    }
    return (ImmutableBundle_Entry) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link Bundle_Entry} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable Bundle_Entry instance
   */
  public static Bundle_Entry copyOf(Bundle_Entry instance) {
    if (instance instanceof ImmutableBundle_Entry) {
      return (ImmutableBundle_Entry) instance;
    }
    return ImmutableBundle_Entry.builder()
        .modifierExtension(instance.modifierExtension())
        .request(instance.request())
        .extension(instance.extension())
        .fullUrl(instance.fullUrl())
        .link(instance.link())
        .search(instance.search())
        .response(instance.response())
        .id(instance.id())
        .resource(instance.resource())
        .build();
  }

  /**
   * Creates a builder for {@link Bundle_Entry Bundle_Entry}.
   * <pre>
   * ImmutableBundle_Entry.builder()
   *    .modifierExtension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Bundle_Entry#modifierExtension() modifierExtension}
   *    .request(com.medplum.types.fhir.Bundle_Request) // optional {@link Bundle_Entry#request() request}
   *    .extension(List&amp;lt;com.medplum.types.fhir.Extension&amp;gt;) // optional {@link Bundle_Entry#extension() extension}
   *    .fullUrl(com.medplum.types.fhir.Uri) // optional {@link Bundle_Entry#fullUrl() fullUrl}
   *    .link(List&amp;lt;com.medplum.types.fhir.Bundle_Link&amp;gt;) // optional {@link Bundle_Entry#link() link}
   *    .search(com.medplum.types.fhir.Bundle_Search) // optional {@link Bundle_Entry#search() search}
   *    .response(com.medplum.types.fhir.Bundle_Response) // optional {@link Bundle_Entry#response() response}
   *    .id(String) // optional {@link Bundle_Entry#id() id}
   *    .resource(com.medplum.types.fhir.ResourceList) // optional {@link Bundle_Entry#resource() resource}
   *    .build();
   * </pre>
   * @return A new Bundle_Entry builder
   */
  public static ImmutableBundle_Entry.Builder builder() {
    return new ImmutableBundle_Entry.Builder();
  }

  /**
   * Builds instances of type {@link Bundle_Entry Bundle_Entry}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "Bundle_Entry", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder {
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_REQUEST = 0x2L;
    private static final long OPT_BIT_EXTENSION = 0x4L;
    private static final long OPT_BIT_FULL_URL = 0x8L;
    private static final long OPT_BIT_LINK = 0x10L;
    private static final long OPT_BIT_SEARCH = 0x20L;
    private static final long OPT_BIT_RESPONSE = 0x40L;
    private static final long OPT_BIT_ID = 0x80L;
    private static final long OPT_BIT_RESOURCE = 0x100L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable Bundle_Request request;
    private @Nullable List<Extension> extension;
    private @Nullable Uri fullUrl;
    private @Nullable List<Bundle_Link> link;
    private @Nullable Bundle_Search search;
    private @Nullable Bundle_Response response;
    private @Nullable String id;
    private @Nullable ResourceList resource;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link Bundle_Entry#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Bundle_Entry#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link Bundle_Entry#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for chained invocation
     */
    public final Builder request(Bundle_Request request) {
      checkNotIsSet(requestIsSet(), "request");
      this.request = Objects.requireNonNull(request, "request");
      optBits |= OPT_BIT_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Entry#request() request} to request.
     * @param request The value for request
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("request")
    public final Builder request(Optional<? extends Bundle_Request> request) {
      checkNotIsSet(requestIsSet(), "request");
      this.request = request.orElse(null);
      optBits |= OPT_BIT_REQUEST;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Entry#extension() extension} to extension.
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
     * Initializes the optional value {@link Bundle_Entry#extension() extension} to extension.
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
     * Initializes the optional value {@link Bundle_Entry#fullUrl() fullUrl} to fullUrl.
     * @param fullUrl The value for fullUrl
     * @return {@code this} builder for chained invocation
     */
    public final Builder fullUrl(Uri fullUrl) {
      checkNotIsSet(fullUrlIsSet(), "fullUrl");
      this.fullUrl = Objects.requireNonNull(fullUrl, "fullUrl");
      optBits |= OPT_BIT_FULL_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Entry#fullUrl() fullUrl} to fullUrl.
     * @param fullUrl The value for fullUrl
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("fullUrl")
    public final Builder fullUrl(Optional<? extends Uri> fullUrl) {
      checkNotIsSet(fullUrlIsSet(), "fullUrl");
      this.fullUrl = fullUrl.orElse(null);
      optBits |= OPT_BIT_FULL_URL;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Entry#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for chained invocation
     */
    public final Builder link(List<Bundle_Link> link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = Objects.requireNonNull(link, "link");
      optBits |= OPT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Entry#link() link} to link.
     * @param link The value for link
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("link")
    public final Builder link(Optional<? extends List<Bundle_Link>> link) {
      checkNotIsSet(linkIsSet(), "link");
      this.link = link.orElse(null);
      optBits |= OPT_BIT_LINK;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Entry#search() search} to search.
     * @param search The value for search
     * @return {@code this} builder for chained invocation
     */
    public final Builder search(Bundle_Search search) {
      checkNotIsSet(searchIsSet(), "search");
      this.search = Objects.requireNonNull(search, "search");
      optBits |= OPT_BIT_SEARCH;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Entry#search() search} to search.
     * @param search The value for search
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("search")
    public final Builder search(Optional<? extends Bundle_Search> search) {
      checkNotIsSet(searchIsSet(), "search");
      this.search = search.orElse(null);
      optBits |= OPT_BIT_SEARCH;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Entry#response() response} to response.
     * @param response The value for response
     * @return {@code this} builder for chained invocation
     */
    public final Builder response(Bundle_Response response) {
      checkNotIsSet(responseIsSet(), "response");
      this.response = Objects.requireNonNull(response, "response");
      optBits |= OPT_BIT_RESPONSE;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Entry#response() response} to response.
     * @param response The value for response
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("response")
    public final Builder response(Optional<? extends Bundle_Response> response) {
      checkNotIsSet(responseIsSet(), "response");
      this.response = response.orElse(null);
      optBits |= OPT_BIT_RESPONSE;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Entry#id() id} to id.
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
     * Initializes the optional value {@link Bundle_Entry#id() id} to id.
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
     * Initializes the optional value {@link Bundle_Entry#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for chained invocation
     */
    public final Builder resource(ResourceList resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = Objects.requireNonNull(resource, "resource");
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Initializes the optional value {@link Bundle_Entry#resource() resource} to resource.
     * @param resource The value for resource
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("resource")
    public final Builder resource(Optional<? extends ResourceList> resource) {
      checkNotIsSet(resourceIsSet(), "resource");
      this.resource = resource.orElse(null);
      optBits |= OPT_BIT_RESOURCE;
      return this;
    }

    /**
     * Builds a new {@link Bundle_Entry Bundle_Entry}.
     * @return An immutable instance of Bundle_Entry
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public Bundle_Entry build() {
      return new ImmutableBundle_Entry(modifierExtension, request, extension, fullUrl, link, search, response, id, resource);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean requestIsSet() {
      return (optBits & OPT_BIT_REQUEST) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean fullUrlIsSet() {
      return (optBits & OPT_BIT_FULL_URL) != 0;
    }

    private boolean linkIsSet() {
      return (optBits & OPT_BIT_LINK) != 0;
    }

    private boolean searchIsSet() {
      return (optBits & OPT_BIT_SEARCH) != 0;
    }

    private boolean responseIsSet() {
      return (optBits & OPT_BIT_RESPONSE) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean resourceIsSet() {
      return (optBits & OPT_BIT_RESOURCE) != 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of Bundle_Entry is strict, attribute is already set: ".concat(name));
    }
  }
}

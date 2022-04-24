package com.fhir;

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
 * Immutable implementation of {@link AuditEvent_Source}.
 * <p>
 * Use the builder to create immutable instances:
 * {@code ImmutableAuditEvent_Source.builder()}.
 */
@Generated(from = "AuditEvent_Source", generator = "Immutables")
@SuppressWarnings({"all"})
@SuppressFBWarnings
@ParametersAreNonnullByDefault
@javax.annotation.processing.Generated("org.immutables.processor.ProxyProcessor")
@Immutable
@JsonIgnoreProperties(ignoreUnknown = true)
final class ImmutableAuditEvent_Source implements AuditEvent_Source {
  private final @Nullable List<Extension> modifierExtension;
  private final @Nullable String id;
  private final @Nullable List<Coding> type;
  private final @Nullable String site;
  private final @Nullable List<Extension> extension;
  private final Reference observer;

  private ImmutableAuditEvent_Source(
      @Nullable List<Extension> modifierExtension,
      @Nullable String id,
      @Nullable List<Coding> type,
      @Nullable String site,
      @Nullable List<Extension> extension,
      Reference observer) {
    this.modifierExtension = modifierExtension;
    this.id = id;
    this.type = type;
    this.site = site;
    this.extension = extension;
    this.observer = observer;
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
   * @return The value of the {@code type} attribute
   */
  @JsonProperty("type")
  @Override
  public Optional<List<Coding>> type() {
    return Optional.ofNullable(type);
  }

  /**
   * @return The value of the {@code site} attribute
   */
  @JsonProperty("site")
  @Override
  public Optional<String> site() {
    return Optional.ofNullable(site);
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
   * @return The value of the {@code observer} attribute
   */
  @JsonProperty("observer")
  @Override
  public Reference observer() {
    return observer;
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Source#modifierExtension() modifierExtension} attribute.
   * @param value The value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Source withModifierExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "modifierExtension");
    if (this.modifierExtension == newValue) return this;
    return new ImmutableAuditEvent_Source(newValue, this.id, this.type, this.site, this.extension, this.observer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Source#modifierExtension() modifierExtension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for modifierExtension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Source withModifierExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.modifierExtension == value) return this;
    return new ImmutableAuditEvent_Source(value, this.id, this.type, this.site, this.extension, this.observer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Source#id() id} attribute.
   * @param value The value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Source withId(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "id");
    if (Objects.equals(this.id, newValue)) return this;
    return new ImmutableAuditEvent_Source(this.modifierExtension, newValue, this.type, this.site, this.extension, this.observer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Source#id() id} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for id
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Source withId(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.id, value)) return this;
    return new ImmutableAuditEvent_Source(this.modifierExtension, value, this.type, this.site, this.extension, this.observer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Source#type() type} attribute.
   * @param value The value for type
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Source withType(List<Coding> value) {
    @Nullable List<Coding> newValue = Objects.requireNonNull(value, "type");
    if (this.type == newValue) return this;
    return new ImmutableAuditEvent_Source(this.modifierExtension, this.id, newValue, this.site, this.extension, this.observer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Source#type() type} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for type
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Source withType(Optional<? extends List<Coding>> optional) {
    @Nullable List<Coding> value = optional.orElse(null);
    if (this.type == value) return this;
    return new ImmutableAuditEvent_Source(this.modifierExtension, this.id, value, this.site, this.extension, this.observer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Source#site() site} attribute.
   * @param value The value for site
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Source withSite(String value) {
    @Nullable String newValue = Objects.requireNonNull(value, "site");
    if (Objects.equals(this.site, newValue)) return this;
    return new ImmutableAuditEvent_Source(this.modifierExtension, this.id, this.type, newValue, this.extension, this.observer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Source#site() site} attribute.
   * An equality check is used on inner nullable value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for site
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Source withSite(Optional<String> optional) {
    @Nullable String value = optional.orElse(null);
    if (Objects.equals(this.site, value)) return this;
    return new ImmutableAuditEvent_Source(this.modifierExtension, this.id, this.type, value, this.extension, this.observer);
  }

  /**
   * Copy the current immutable object by setting a <i>present</i> value for the optional {@link AuditEvent_Source#extension() extension} attribute.
   * @param value The value for extension
   * @return A modified copy of {@code this} object
   */
  public final ImmutableAuditEvent_Source withExtension(List<Extension> value) {
    @Nullable List<Extension> newValue = Objects.requireNonNull(value, "extension");
    if (this.extension == newValue) return this;
    return new ImmutableAuditEvent_Source(this.modifierExtension, this.id, this.type, this.site, newValue, this.observer);
  }

  /**
   * Copy the current immutable object by setting an optional value for the {@link AuditEvent_Source#extension() extension} attribute.
   * A shallow reference equality check is used on unboxed optional value to prevent copying of the same value by returning {@code this}.
   * @param optional A value for extension
   * @return A modified copy of {@code this} object
   */
  @SuppressWarnings("unchecked") // safe covariant cast
  public final ImmutableAuditEvent_Source withExtension(Optional<? extends List<Extension>> optional) {
    @Nullable List<Extension> value = optional.orElse(null);
    if (this.extension == value) return this;
    return new ImmutableAuditEvent_Source(this.modifierExtension, this.id, this.type, this.site, value, this.observer);
  }

  /**
   * Copy the current immutable object by setting a value for the {@link AuditEvent_Source#observer() observer} attribute.
   * A shallow reference equality check is used to prevent copying of the same value by returning {@code this}.
   * @param value A new value for observer
   * @return A modified copy of the {@code this} object
   */
  public final ImmutableAuditEvent_Source withObserver(Reference value) {
    if (this.observer == value) return this;
    Reference newValue = Objects.requireNonNull(value, "observer");
    return new ImmutableAuditEvent_Source(this.modifierExtension, this.id, this.type, this.site, this.extension, newValue);
  }

  /**
   * This instance is equal to all instances of {@code ImmutableAuditEvent_Source} that have equal attribute values.
   * @return {@code true} if {@code this} is equal to {@code another} instance
   */
  @Override
  public boolean equals(@Nullable Object another) {
    if (this == another) return true;
    return another instanceof ImmutableAuditEvent_Source
        && equalTo((ImmutableAuditEvent_Source) another);
  }

  private boolean equalTo(ImmutableAuditEvent_Source another) {
    return Objects.equals(modifierExtension, another.modifierExtension)
        && Objects.equals(id, another.id)
        && Objects.equals(type, another.type)
        && Objects.equals(site, another.site)
        && Objects.equals(extension, another.extension)
        && observer.equals(another.observer);
  }

  /**
   * Computes a hash code from attributes: {@code modifierExtension}, {@code id}, {@code type}, {@code site}, {@code extension}, {@code observer}.
   * @return hashCode value
   */
  @Override
  public int hashCode() {
    int h = 5381;
    h += (h << 5) + Objects.hashCode(modifierExtension);
    h += (h << 5) + Objects.hashCode(id);
    h += (h << 5) + Objects.hashCode(type);
    h += (h << 5) + Objects.hashCode(site);
    h += (h << 5) + Objects.hashCode(extension);
    h += (h << 5) + observer.hashCode();
    return h;
  }

  /**
   * Prints the immutable value {@code AuditEvent_Source} with attribute values.
   * @return A string representation of the value
   */
  @Override
  public String toString() {
    StringBuilder builder = new StringBuilder("AuditEvent_Source{");
    if (modifierExtension != null) {
      builder.append("modifierExtension=").append(modifierExtension);
    }
    if (id != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("id=").append(id);
    }
    if (type != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("type=").append(type);
    }
    if (site != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("site=").append(site);
    }
    if (extension != null) {
      if (builder.length() > 18) builder.append(", ");
      builder.append("extension=").append(extension);
    }
    if (builder.length() > 18) builder.append(", ");
    builder.append("observer=").append(observer);
    return builder.append("}").toString();
  }

  /**
   * Utility type used to correctly read immutable object from JSON representation.
   * @deprecated Do not use this type directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Generated(from = "AuditEvent_Source", generator = "Immutables")
  @Deprecated
  @JsonDeserialize
  @JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.NONE)
  static final class Json implements AuditEvent_Source {
    @Nullable Optional<List<Extension>> modifierExtension = Optional.empty();
    boolean modifierExtensionIsSet;
    @Nullable Optional<String> id = Optional.empty();
    boolean idIsSet;
    @Nullable Optional<List<Coding>> type = Optional.empty();
    boolean typeIsSet;
    @Nullable Optional<String> site = Optional.empty();
    boolean siteIsSet;
    @Nullable Optional<List<Extension>> extension = Optional.empty();
    boolean extensionIsSet;
    @Nullable Reference observer;
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
    @JsonProperty("type")
    public void setType(Optional<List<Coding>> type) {
      this.type = type;
      this.typeIsSet = true;
    }
    @JsonProperty("site")
    public void setSite(Optional<String> site) {
      this.site = site;
      this.siteIsSet = true;
    }
    @JsonProperty("extension")
    public void setExtension(Optional<List<Extension>> extension) {
      this.extension = extension;
      this.extensionIsSet = true;
    }
    @JsonProperty("observer")
    public void setObserver(Reference observer) {
      this.observer = observer;
    }
    @Override
    public Optional<List<Extension>> modifierExtension() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> id() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Coding>> type() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<String> site() { throw new UnsupportedOperationException(); }
    @Override
    public Optional<List<Extension>> extension() { throw new UnsupportedOperationException(); }
    @Override
    public Reference observer() { throw new UnsupportedOperationException(); }
  }

  /**
   * @param json A JSON-bindable data structure
   * @return An immutable value type
   * @deprecated Do not use this method directly, it exists only for the <em>Jackson</em>-binding infrastructure
   */
  @Deprecated
  @JsonCreator(mode = JsonCreator.Mode.DELEGATING)
  static ImmutableAuditEvent_Source fromJson(Json json) {
    ImmutableAuditEvent_Source.Builder builder = ((ImmutableAuditEvent_Source.Builder) ImmutableAuditEvent_Source.builder());
    if (json.modifierExtensionIsSet) {
      builder.modifierExtension(json.modifierExtension);
    }
    if (json.idIsSet) {
      builder.id(json.id);
    }
    if (json.typeIsSet) {
      builder.type(json.type);
    }
    if (json.siteIsSet) {
      builder.site(json.site);
    }
    if (json.extensionIsSet) {
      builder.extension(json.extension);
    }
    if (json.observer != null) {
      builder.observer(json.observer);
    }
    return (ImmutableAuditEvent_Source) builder.build();
  }

  /**
   * Creates an immutable copy of a {@link AuditEvent_Source} value.
   * Uses accessors to get values to initialize the new immutable instance.
   * If an instance is already immutable, it is returned as is.
   * @param instance The instance to copy
   * @return A copied immutable AuditEvent_Source instance
   */
  public static AuditEvent_Source copyOf(AuditEvent_Source instance) {
    if (instance instanceof ImmutableAuditEvent_Source) {
      return (ImmutableAuditEvent_Source) instance;
    }
    return ((ImmutableAuditEvent_Source.Builder) ImmutableAuditEvent_Source.builder())
        .modifierExtension(instance.modifierExtension())
        .id(instance.id())
        .type(instance.type())
        .site(instance.site())
        .extension(instance.extension())
        .observer(instance.observer())
        .build();
  }

  /**
   * Creates a builder for {@link AuditEvent_Source AuditEvent_Source}.
   * <pre>
   * ImmutableAuditEvent_Source.builder()
   *    .modifierExtension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link AuditEvent_Source#modifierExtension() modifierExtension}
   *    .id(String) // optional {@link AuditEvent_Source#id() id}
   *    .type(List&amp;lt;com.fhir.Coding&amp;gt;) // optional {@link AuditEvent_Source#type() type}
   *    .site(String) // optional {@link AuditEvent_Source#site() site}
   *    .extension(List&amp;lt;com.fhir.Extension&amp;gt;) // optional {@link AuditEvent_Source#extension() extension}
   *    .observer(com.fhir.Reference) // required {@link AuditEvent_Source#observer() observer}
   *    .build();
   * </pre>
   * @return A new AuditEvent_Source builder
   */
  public static ObserverBuildStage builder() {
    return new ImmutableAuditEvent_Source.Builder();
  }

  /**
   * Builds instances of type {@link AuditEvent_Source AuditEvent_Source}.
   * Initialize attributes and then invoke the {@link #build()} method to create an
   * immutable instance.
   * <p><em>{@code Builder} is not thread-safe and generally should not be stored in a field or collection,
   * but instead used immediately to create instances.</em>
   */
  @Generated(from = "AuditEvent_Source", generator = "Immutables")
  @NotThreadSafe
  public static final class Builder implements ObserverBuildStage, BuildFinal {
    private static final long INIT_BIT_OBSERVER = 0x1L;
    private static final long OPT_BIT_MODIFIER_EXTENSION = 0x1L;
    private static final long OPT_BIT_ID = 0x2L;
    private static final long OPT_BIT_TYPE = 0x4L;
    private static final long OPT_BIT_SITE = 0x8L;
    private static final long OPT_BIT_EXTENSION = 0x10L;
    private long initBits = 0x1L;
    private long optBits;

    private @Nullable List<Extension> modifierExtension;
    private @Nullable String id;
    private @Nullable List<Coding> type;
    private @Nullable String site;
    private @Nullable List<Extension> extension;
    private @Nullable Reference observer;

    private Builder() {
    }

    /**
     * Initializes the optional value {@link AuditEvent_Source#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link AuditEvent_Source#modifierExtension() modifierExtension} to modifierExtension.
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
     * Initializes the optional value {@link AuditEvent_Source#id() id} to id.
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
     * Initializes the optional value {@link AuditEvent_Source#id() id} to id.
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
     * Initializes the optional value {@link AuditEvent_Source#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    public final Builder type(List<Coding> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = Objects.requireNonNull(type, "type");
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Source#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("type")
    public final Builder type(Optional<? extends List<Coding>> type) {
      checkNotIsSet(typeIsSet(), "type");
      this.type = type.orElse(null);
      optBits |= OPT_BIT_TYPE;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Source#site() site} to site.
     * @param site The value for site
     * @return {@code this} builder for chained invocation
     */
    public final Builder site(String site) {
      checkNotIsSet(siteIsSet(), "site");
      this.site = Objects.requireNonNull(site, "site");
      optBits |= OPT_BIT_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Source#site() site} to site.
     * @param site The value for site
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("site")
    public final Builder site(Optional<String> site) {
      checkNotIsSet(siteIsSet(), "site");
      this.site = site.orElse(null);
      optBits |= OPT_BIT_SITE;
      return this;
    }

    /**
     * Initializes the optional value {@link AuditEvent_Source#extension() extension} to extension.
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
     * Initializes the optional value {@link AuditEvent_Source#extension() extension} to extension.
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
     * Initializes the value for the {@link AuditEvent_Source#observer() observer} attribute.
     * @param observer The value for observer 
     * @return {@code this} builder for use in a chained invocation
     */
    @JsonProperty("observer")
    public final Builder observer(Reference observer) {
      checkNotIsSet(observerIsSet(), "observer");
      this.observer = Objects.requireNonNull(observer, "observer");
      initBits &= ~INIT_BIT_OBSERVER;
      return this;
    }

    /**
     * Builds a new {@link AuditEvent_Source AuditEvent_Source}.
     * @return An immutable instance of AuditEvent_Source
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    public AuditEvent_Source build() {
      checkRequiredAttributes();
      return new ImmutableAuditEvent_Source(modifierExtension, id, type, site, extension, observer);
    }

    private boolean modifierExtensionIsSet() {
      return (optBits & OPT_BIT_MODIFIER_EXTENSION) != 0;
    }

    private boolean idIsSet() {
      return (optBits & OPT_BIT_ID) != 0;
    }

    private boolean typeIsSet() {
      return (optBits & OPT_BIT_TYPE) != 0;
    }

    private boolean siteIsSet() {
      return (optBits & OPT_BIT_SITE) != 0;
    }

    private boolean extensionIsSet() {
      return (optBits & OPT_BIT_EXTENSION) != 0;
    }

    private boolean observerIsSet() {
      return (initBits & INIT_BIT_OBSERVER) == 0;
    }

    private static void checkNotIsSet(boolean isSet, String name) {
      if (isSet) throw new IllegalStateException("Builder of AuditEvent_Source is strict, attribute is already set: ".concat(name));
    }

    private void checkRequiredAttributes() {
      if (initBits != 0) {
        throw new IllegalStateException(formatRequiredAttributesMessage());
      }
    }

    private String formatRequiredAttributesMessage() {
      List<String> attributes = new ArrayList<>();
      if (!observerIsSet()) attributes.add("observer");
      return "Cannot build AuditEvent_Source, some of required attributes are not set " + attributes;
    }
  }

  @Generated(from = "AuditEvent_Source", generator = "Immutables")
  public interface ObserverBuildStage {
    /**
     * Initializes the value for the {@link AuditEvent_Source#observer() observer} attribute.
     * @param observer The value for observer 
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal observer(Reference observer);
  }

  @Generated(from = "AuditEvent_Source", generator = "Immutables")
  public interface BuildFinal {

    /**
     * Initializes the optional value {@link AuditEvent_Source#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal modifierExtension(List<Extension> modifierExtension);

    /**
     * Initializes the optional value {@link AuditEvent_Source#modifierExtension() modifierExtension} to modifierExtension.
     * @param modifierExtension The value for modifierExtension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal modifierExtension(Optional<? extends List<Extension>> modifierExtension);

    /**
     * Initializes the optional value {@link AuditEvent_Source#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for chained invocation
     */
    BuildFinal id(String id);

    /**
     * Initializes the optional value {@link AuditEvent_Source#id() id} to id.
     * @param id The value for id
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal id(Optional<String> id);

    /**
     * Initializes the optional value {@link AuditEvent_Source#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for chained invocation
     */
    BuildFinal type(List<Coding> type);

    /**
     * Initializes the optional value {@link AuditEvent_Source#type() type} to type.
     * @param type The value for type
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal type(Optional<? extends List<Coding>> type);

    /**
     * Initializes the optional value {@link AuditEvent_Source#site() site} to site.
     * @param site The value for site
     * @return {@code this} builder for chained invocation
     */
    BuildFinal site(String site);

    /**
     * Initializes the optional value {@link AuditEvent_Source#site() site} to site.
     * @param site The value for site
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal site(Optional<String> site);

    /**
     * Initializes the optional value {@link AuditEvent_Source#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for chained invocation
     */
    BuildFinal extension(List<Extension> extension);

    /**
     * Initializes the optional value {@link AuditEvent_Source#extension() extension} to extension.
     * @param extension The value for extension
     * @return {@code this} builder for use in a chained invocation
     */
    BuildFinal extension(Optional<? extends List<Extension>> extension);

    /**
     * Builds a new {@link AuditEvent_Source AuditEvent_Source}.
     * @return An immutable instance of AuditEvent_Source
     * @throws java.lang.IllegalStateException if any required attributes are missing
     */
    AuditEvent_Source build();
  }
}
